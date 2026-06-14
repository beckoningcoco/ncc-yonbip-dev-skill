---
tags: [BIP, 元数据, 数据字典, bd.controlscope.AccControlScopeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 管控范围列表 (`bd.controlscope.AccControlScopeVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_controlscope` | domain：`finbd` | 应用：`FP` | 业务对象ID：`bfac8434-8466-4fb1-917b-8d5fa0aaec8e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管控范围列表 |
| 物理表 | `bd_controlscope` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `FP` |
| 直连字段 | 33 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `controlscopeParamsMapping` | `bd.controlscope.ControlScopeParamsMapping` | composition |
| `controlScopeAccbodyMapping` | `bd.controlscope.ControlScopeAccbodyMapping` | composition |
| `controlscopeVersionMapping` | `bd.controlscope.ControlScopeVersionMappingVO` | composition |
| `controlscopeMDMapping` | `bd.controlscope.ControlScopeMDMappingVO` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `accpurpose` | `` |
| `` | `` |
| `accbook_currency` | `` |
| `accperiodscheme` | `` |
| `acountbooktype` | `` |
| `currency` | `` |
| `rate_class` | `` |
| `accsubjectchart` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 13字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accounting_mode` | `accounting_mode` | String | 核算模式 |
| `code` | `code` | String | 管控范围编码 |
| `converparam` | `converparam` | String | 折算参数 |
| `` | `creator` | String | 创建人名称 |
| `description` | `description` | String | 描述 |
| `` | `modifier` | String | 修改人名称 |
| `undefine_1` | `undefine_1` | String | 拓展字段 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accbook_currency` | `accbook_currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 账簿币种 |
| `accperiodscheme` | `accperiodscheme` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | 期间方案 |
| `accpurpose` | `accpurpose` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | 核算目的 |
| `accsubjectchart` | `accsubjectchart` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | 科目表 |
| `acountbooktype` | `acountbooktype` | 9e073034-63ae-4aba-a113-1b28396f35e6 | 账簿类型 |
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `currency` | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 管控范围币种 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `rate_class` | `rate_class` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 汇率类型 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bln_multilevel_accounting` | `bln_multilevel_accounting` | Boolean | 启用二级核算 |
| `stopstatus` | `stopstatus` | Boolean | 停用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |

### other (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 883603f9-23b4-4d92-851f-bf006b6deebf | 管控范围会计主体表 |
| `` | `` | 24e26d53-bfef-4c05-b74b-fe5c8a5aa4b7 | 管控范围维度表 |
| `` | `` | 6187f305-136f-4910-a938-26e455400c41 | 管控范围参数表 |
| `` | `` | 38e297bb-1f04-4eb8-aad7-94c572a525ea | 管控范围版本表 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 管控范围名称 |
