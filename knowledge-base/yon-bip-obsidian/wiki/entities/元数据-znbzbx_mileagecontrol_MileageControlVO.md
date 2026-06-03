---
tags: [BIP, 元数据, 数据字典, znbzbx.mileagecontrol.MileageControlVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 里程控制规则主表 (`znbzbx.mileagecontrol.MileageControlVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_mileagecontrol` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`b3eb7407-a549-4f47-949a-bd3253fc8862`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 里程控制规则主表 |
| 物理表 | `znbz_mileagecontrol` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 36 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `partscopevos` | `znbzbx.mileagecontrol.PartScopeVO` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `ytenant_id` | `` |
| `correcordtype` | `bd_billtyperef` |
| `bindsubsidyrule` | `znbzbx_mileageallowanceref` |
| `tenant_id` | `` |

## 继承接口 (5个, 13字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 36 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vrulecode` | `vrulecode` | `vrulecode` | 规则编码 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `ruledescription` | `ruledescription` | `ruledescription` | 规则说明 |
| `mileagemode` | `mileagemode` | `mileagemode` | 里程模式 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 业务单元ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `correcordtype` | `correcordtype` | `correcordtype` | 对应记事类型id |
| `bindsubsidyrule` | `bindsubsidyrule` | `bindsubsidyrule` | 绑定补贴规则id |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `refmilecalrule` | `refmilecalrule` | `refmilecalrule` | 参考里程计算规则 |
| `defmileages` | `defmileages` | `defmileages` | 默认里程数 |
| `mileageunit` | `mileageunit` | `mileageunit` | 里程单位 |
| `locmtolerance` | `locmtolerance` | `locmtolerance` | 地点修改容差值 |
| `milemtolerance` | `milemtolerance` | `milemtolerance` | 里程修改容差率 |
| `milerecordgernoterule` | `milerecordgernoterule` | `milerecordgernoterule` | 里程记录生成记事规则 |
| `matmulbtpriceprocess` | `matmulbtpriceprocess` | `matmulbtpriceprocess` | 匹配到多个补贴单价处理方式 |
| `controlscope` | `controlscope` | `controlscope` | 控制范围 |
| `deletelocation` | `deletelocation` | `deletelocation` | 是否允许删除途经地点 |
| `useLocationMileageAlgorithm` | `useLocationMileageAlgorithm` | `useLocationMileageAlgorithm` | 导航模式是否使用定位里程算法 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `locmtolerancevalue` | `locmtolerancevalue` | `locmtolerancevalue` | 地点修改容差值 |
| `milemtolerancevalue` | `milemtolerancevalue` | `milemtolerancevalue` | 里程修改容差率值 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vrulename` | `vrulename` | `vrulename` | 规则名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `partscopevos` | 部分范围 |
