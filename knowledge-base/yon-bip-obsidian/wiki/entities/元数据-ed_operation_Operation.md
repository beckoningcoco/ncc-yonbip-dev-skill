---
tags: [BIP, 元数据, 数据字典, ed.operation.Operation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标准工序 (`ed.operation.Operation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_operation` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：`fa62297c-d338-4cfb-ba72-c9edba94313b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标准工序 |
| 物理表 | `ed_operation` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 42 个 |
| 子表 | 1 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `ed.operation.OperationUserDefine` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `operation_define_ct` | `` |
| `` | `` |
| `opcontrolcode_id` | `` |
| `ytenant_id` | `` |
| `work_center_id` | `` |
| `org_id` | `ucf-org-center.bd_factoryorg` |
| `tenant_id` | `` |

## 继承接口 (8个, 24字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **关闭信息** (`base.itf.IClosing`)
  - `close_Date` → `close_Date`
  - `closer` → `closer`
  - `` → ``
  - `close_time` → `close_time`
- **锁定信息** (`base.itf.ILock`)
  - `lock_Date` → `lock_Date`
  - `locker` → `locker`
  - `lock_time` → `lock_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 42 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `routeDesc` | `routeDesc` | `routeDesc` | 工艺描述 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 最后修改人 |
| `operation_group` | `operation_group` | `operationGroup` | 工序组 |
| `erp_code` | `erp_code` | `erpCode` | erpCode |
| `` | `auditor` | `auditor` | 审批人名称 |
| `closer` | `closer` | `closer` | 关闭人名称 |
| `locker` | `locker` | `locker` | 锁定人 |
| `industryProcessLibraryId` | `industryProcessLibraryId` | `industryProcessLibraryId` | 行业工艺库ID |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `orgId` | 组织ID |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 最后修改人id |
| `` | `closerId` | `closerId` | 关闭人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `opcontrolcode_id` | `opcontrolcode_id` | `opcontrolcodeId` | 工序控制码 |
| `work_center_id` | `work_center_id` | `workCenterId` | 工作中心ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 最后修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `lock_Date` | `lock_Date` | `lockDate` | 锁定日期 |
| `close_Date` | `close_Date` | `closeDate` | 关闭日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `time_unit` | `time_unit` | `timeUnit` | 时间单位 |
| `is_report_point` | `is_report_point` | `isReportPoint` | 报告点 |
| `is_monitor_point` | `is_monitor_point` | `isMonitorPoint` | 检测点 |
| `is_from_industry_process_lib` | `is_from_industry_process_lib` | `isFromIndustryProcessLib` | 来源行业工艺库 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `prepare_time` | `prepare_time` | `prepareTime` | 准备时间 |
| `process_time` | `process_time` | `processTime` | 加工时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `operation_define_ct` | `operation_define_ct` | `operationDefineCharacter` | 自定义项特征属性组 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 最后修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `lock_time` | `lock_time` | `lockTime` | 锁定时间 |
| `close_time` | `close_time` | `closeTime` | 关闭时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 标准工序(固定自定义项)表 |
