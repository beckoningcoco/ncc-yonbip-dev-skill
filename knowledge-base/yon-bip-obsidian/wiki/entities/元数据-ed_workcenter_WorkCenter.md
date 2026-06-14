---
tags: [BIP, 元数据, 数据字典, ed.workcenter.WorkCenter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工作中心 (`ed.workcenter.WorkCenter`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_workcenter` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：`60e8d53b-3166-420d-bdcd-e1c405d3250d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工作中心 |
| 物理表 | `ed_workcenter` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 53 个 |
| 子表 | 3 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `workCenterDetailList` | `ed.workcenter.WorkCenterDetail` | composition |
| `attDefines` | `ed.workcenter.WorkCenterAttrextItem` | composition |
| `defines` | `ed.workcenter.WorkCenterUserDefine` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `engineeringdata.ed_workcenter_ref` |
| `operation_control_code_id` | `engineeringdata.ed_operation_control_code_ref` |
| `ytenant_id` | `` |
| `workCenterDefineCharacter` | `` |
| `` | `` |
| `dept_id` | `ucf-org-center.bd_adminorgsharetreeref` |
| `vendor_id` | `yssupplier.aa_vendor` |
| `org_id` | `ucf-org-center.bd_factoryorg` |
| `output_unit` | `productcenter.pc_unitref` |
| `workcenter_category_id` | `engineeringdata.ed_workcenter_category_ref` |
| `tenant_id` | `` |

## 继承接口 (6个, 19字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 53 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `path` | `path` | `path` | 路径 |
| `work_calendar` | `work_calendar` | `workCalendar` | 工作日历 |
| `work_calendar_name` | `work_calendar_name` | `workCalendarName` | 工作日历名称 |
| `code` | `code` | `code` | 编码 |
| `memo` | `memo` | `memo` | 备注 |
| `balance_type` | `balance_type` | `balanceType` | 平衡方式 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 最后修改人 |
| `erp_code` | `erp_code` | `erpCode` | erpCode |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `operation_control_code_id` | `operation_control_code_id` | `operationControlCodeId` | 工序控制码 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `output_unit` | `output_unit` | `outputUnit` | 产量单位 |
| `parent_id` | `parent_id` | `parent` | 上级工作中心 |
| `vendor_id` | `vendor_id` | `vendorId` | 委外商 |
| `org_id` | `org_id` | `orgId` | 组织id |
| `workcenter_category_id` | `workcenter_category_id` | `workCenterCategoryId` | 工作中心分类Id |
| `dept_id` | `dept_id` | `deptId` | 所属部门Id |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 最后修改人id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 最后修改日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |
| `is_outsource` | `is_outsource` | `isOutsource` | 委外工作中心 |
| `calculate_power` | `calculate_power` | `calculatePower` | 能力计算 |
| `cost_collection` | `cost_collection` | `costCollection` | 成本归集 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `power_unit_type` | `power_unit_type` | `powerUnitType` | 能力单位类型 |
| `used_type` | `used_type` | `usedType` | 用途 |
| `time_uint` | `time_uint` | `timeUnit` | 时间单位 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `eqp_count` | `eqp_count` | `eqpCount` | 设备数量 |
| `person_count` | `person_count` | `personCount` | 工作人数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bottleneck` | `bottleneck` | `bottleneck` | 瓶颈工作中心 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `max_output` | `max_output` | `maxOutput` | 最大产量 |
| `standard_output` | `standard_output` | `standardOutput` | 标准产量 |
| `eqp_utilization` | `eqp_utilization` | `eqpUtilization` | 设备利用率% |
| `person_utilization` | `person_utilization` | `personUtilization` | 人员利用率% |
| `work_time` | `work_time` | `workTime` | 工作时间 |
| `coeff_excess` | `coeff_excess` | `coeffExcess` | 超额系数% |
| `eqp_power` | `eqp_power` | `eqpPower` | 标准设备能力 |
| `person_power` | `person_power` | `personPower` | 标准人员能力 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `workCenterDefineCharacter` | `workCenterDefineCharacter` | `workCenterDefineCharacter` | 自定义项特征属性组 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 启用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 最后修改时间 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `attDefines` | 工作中心(自由自定义项) |
| `` | `` | `defines` | 工作中心(固定自定义项)表 |
| `` | `` | `workCenterDetailList` | 工作中心明细 |
