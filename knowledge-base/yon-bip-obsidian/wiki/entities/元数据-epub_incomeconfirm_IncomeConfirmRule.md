---
tags: [BIP, 元数据, 数据字典, epub.incomeconfirm.IncomeConfirmRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收入确认规则 (`epub.incomeconfirm.IncomeConfirmRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_income_confirm` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`908ab997-ec0f-441b-8968-0b473e9327a8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收入确认规则 |
| 物理表 | `epub_income_confirm` |
| 数据库 schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 33 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `business_plugin` | `` |
| `businessItem` | `yonbip-fi-eeac.fieeac_busi_event_treeref` |
| `ytenant_id` | `` |
| `` | `` |
| `actualCostSource` | `` |
| `projectRateType` | `` |
| `costDimension` | `` |
| `costSource` | `` |
| `source_application` | `fiepub.fiepub_sourceapplicationref` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

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
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 编码 |
| `applyRange` | `applyRange` | String | 应用范围 |
| `rule_code` | `rule_code` | String | 规则编码 |
| `income_confirmtype` | `income_confirmtype` | String | 收入确认类型 |
| `drive` | `drive` | String | 驱动类型 |
| `` | `creator` | String | 创建人名称 |
| `formula` | `formula` | String | 条件公式 |
| `` | `modifier` | String | 修改人名称 |
| `pathConfirm` | `pathConfirm` | String | 确认路径 |
| `timePoint` | `timePoint` | String | 触发时点 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户编号 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `source_application` | `source_application` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | 来源应用id |
| `businessItem` | `businessItem` | 2440bd9e-542c-47ea-9070-dbfcaf3eed65 | 业务事项id |
| `business_plugin` | `business_plugin` | 3b3ee5ce-4f2a-4d2c-87c3-14dca56734e6 | 业务插件 |
| `actualCostSource` | `actualCostSource` | e5160b4a-3963-414f-b80d-40a6fde37137 | 实际成本来源 |
| `costDimension` | `costDimension` | e5160b4a-3963-414f-b80d-40a6fde37137 | 收入成本匹配维度 |
| `costSource` | `costSource` | e5160b4a-3963-414f-b80d-40a6fde37137 | 预计成本来源 |
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `projectRateType` | `projectRateType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 项目进度类型 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `system` | `system` | Boolean | 是否预置 |
| `stopstatus` | `stopstatus` | Boolean | 停用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |

### multiLanguage (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |
| `rule_name` | `rule_name` | String | 规则名称 |
| `remark` | `remark` | String | 备注 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |
