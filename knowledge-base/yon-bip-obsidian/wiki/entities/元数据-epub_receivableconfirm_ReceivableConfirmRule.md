---
tags: [BIP, 元数据, 数据字典, epub.receivableconfirm.ReceivableConfirmRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收确认规则 (`epub.receivableconfirm.ReceivableConfirmRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_receivable_confirm` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`dd5cb0dd-23f9-4bce-a87c-93391451ec94`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收确认规则 |
| 物理表 | `epub_receivable_confirm` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 24 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `business_plugin` | `` |
| `businessItem` | `yonbip-fi-eeac.fieeac_busi_event_treeref` |
| `` | `` |
| `accountItem` | `yonbip-fi-eeac.fieeac_fievent_treeref` |
| `source_application` | `fiepub.fiepub_sourceapplicationref` |

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

> 共 24 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 编码 |
| `ytenant_id` | `ytenant_id` | String | 租户id |
| `rule_code` | `rule_code` | String | 规则编码 |
| `drive` | `drive` | String | 驱动类型 |
| `` | `creator` | String | 创建人名称 |
| `` | `modifier` | String | 修改人名称 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `source_application` | `source_application` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | 来源应用id |
| `businessItem` | `businessItem` | 2440bd9e-542c-47ea-9070-dbfcaf3eed65 | 业务事项id |
| `accountItem` | `accountItem` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | 会计事务id |
| `business_plugin` | `business_plugin` | 3b3ee5ce-4f2a-4d2c-87c3-14dca56734e6 | 业务插件 |
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |

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

### 长整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `tenant_id` | `tenant_id` | Long | 租户编号 |
| `id` | `id` | Long | ID |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |
| `rule_name` | `rule_name` | String | 规则名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |
