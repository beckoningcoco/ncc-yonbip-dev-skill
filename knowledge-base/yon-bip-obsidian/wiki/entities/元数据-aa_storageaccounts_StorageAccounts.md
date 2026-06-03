---
tags: [BIP, 元数据, 数据字典, aa.storageaccounts.StorageAccounts]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 钱包多账户 (`aa.storageaccounts.StorageAccounts`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_storageaccounts` | domain：`membercenter` | 应用：`` | 业务对象ID：`0a8dd449-4a36-45bf-aadd-f64734e1287a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 钱包多账户 |
| 物理表 | `mp_storageaccounts` |
| 数据库 schema | `membercenter` |
| 所属应用 | `` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (2个, 2字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cWXAccountID` | `cWXAccountID` | `cWXAccountID` | 微信公众号原始ID |
| `cName` | `cName` | `code` | 编码 |
| `cName` | `cName` | `name` | 账户名称 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bCapital` | `bCapital` | `bCapital` | 是否本金账户 |
| `bGift` | `bGift` | `bGift` | 是否赠送 |

### 整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bDefault` | `bDefault` | `bDefault` | 储值账户类型 |
| `bGood` | `bGood` | `bGood` | 是否指定适用商品分类 |
| `bOlineMall` | `bOlineMall` | `bOlineMall` | 线上商城 |
| `bRewardExp` | `bRewardExp` | `bRewardExp` | 赠送账户过期策略 |
| `bStore` | `bStore` | `bStore` | 是否限制门店 |
| `dEffectDate` | `dEffectDate` | `dEffectDate` | 生效日期 |
| `dExpDate` | `dExpDate` | `dExpDate` | 失效日期 |
| `iExpMode` | `iExpMode` | `iExpMode` | 有效期模式 |
| `iStorageEffectiveNum` | `iStorageEffectiveNum` | `iStorageEffectiveNum` | 月数年数 |
| `iStorageEffectiveUnit` | `iStorageEffectiveUnit` | `iStorageEffectiveUnit` | 有效期模式 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | ts |
