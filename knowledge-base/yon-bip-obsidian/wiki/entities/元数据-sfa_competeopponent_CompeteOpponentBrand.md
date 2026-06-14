---
tags: [BIP, 元数据, 数据字典, sfa.competeopponent.CompeteOpponentBrand]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 竞争对手品牌 (`sfa.competeopponent.CompeteOpponentBrand`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_opponent_brand` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞争对手品牌 |
| 物理表 | `sfa_opponent_brand` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `cpmopponent_id` | `` |
| `ytenant_id` | `` |
| `competeOpponentBrandDefineCharacter` | `` |

## 继承接口 (2个, 3字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `brand_description` | `brand_description` | `brandDescription` | 品牌描述 |
| `logo` | `logo` | `logo` | LOGO |
| `name2` | `name2` | `name2` | 品牌名称2 |
| `name3` | `name3` | `name3` | 品牌名称3 |
| `name4` | `name4` | `name4` | 品牌名称4 |
| `name5` | `name5` | `name5` | 品牌名称5 |
| `name6` | `name6` | `name6` | 品牌名称6 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cpmopponent_id` | `cpmopponent_id` | `cpmOpponentId` | 竞争对手id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `competeOpponentBrandDefineCharacter` | `competeOpponentBrandDefineCharacter` | `competeOpponentBrandDefineCharacter` | 竞争对手自定义项 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 品牌名称 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
