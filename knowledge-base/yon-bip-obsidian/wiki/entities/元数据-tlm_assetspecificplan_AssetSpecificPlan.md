---
tags: [BIP, 元数据, 数据字典, tlm.assetspecificplan.AssetSpecificPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产专项计划 (`tlm.assetspecificplan.AssetSpecificPlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_asset_specific_plan` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`fc3871a8-46d5-4e06-b7ac-438c589ec43b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产专项计划 |
| 物理表 | `tlm_asset_specific_plan` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `tlm_define_character_def` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `back_item6` | `back_item6` | `backItem6` | 备用字段6 |
| `code` | `code` | `code` | 编码 |
| `back_item4` | `back_item4` | `backItem4` | 备用字段4 |
| `back_item5` | `back_item5` | `backItem5` | 备用字段5 |
| `back_item2` | `back_item2` | `backItem2` | 备用字段2 |
| `back_item3` | `back_item3` | `backItem3` | 备用字段3 |
| `back_item1` | `back_item1` | `backItem1` | 备用字段1 |
| `name` | `name` | `name` | 名称 |
| `id` | `id` | `id` | ID |
| `enable_status` | `enable_status` | `enableStatus` | 状态 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `back_item9` | `back_item9` | `backItem9` | 备用字段9 |
| `back_item10` | `back_item10` | `backItem10` | 备用字段10 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `back_item8` | `back_item8` | `backItem8` | 备用字段8 |
| `back_item7` | `back_item7` | `backItem7` | 备用字段7 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tlm_define_character_def` | `tlm_define_character_def` | `tlmDefineCharacterDef` | 自由项特征组 |
