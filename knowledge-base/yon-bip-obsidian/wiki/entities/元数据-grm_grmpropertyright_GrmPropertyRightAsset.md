---
tags: [BIP, 元数据, 数据字典, grm.grmpropertyright.GrmPropertyRightAsset]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产明细 (`grm.grmpropertyright.GrmPropertyRightAsset`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`grm_propertyright_asset` | domain：`yonbip-fi-ctmgrm` | 应用：`GRM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产明细 |
| 物理表 | `grm_propertyright_asset` |
| domain/服务域 | `yonbip-fi-ctmgrm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `GRM` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `net_currency` | `` |
| `pr_character_assetdef` | `` |
| `asset` | `` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset` | `asset` | `asset` | 固定资产ID |
| `mainid` | `mainid` | `mainid` | 担保物权ID |
| `net_currency` | `net_currency` | `netCurrency` | 本币币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `net_amount` | `net_amount` | `netAmount` | 本币账面净值 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pr_character_assetdef` | `pr_character_assetdef` | `prCharacterAssetDef` | 固定资产明细特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
