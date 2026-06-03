---
tags: [BIP, 元数据, 数据字典, rm.archive.Coupon]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡券 (`rm.archive.Coupon`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_coupon` | domain：`membercenter` | 应用：`` | 业务对象ID：`f355c0f8-238d-46ca-af10-41e90f78d497`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 卡券 |
| 物理表 | `mp_coupon` |
| 数据库 schema | `membercenter` |
| 所属应用 | `` |
| 直连字段 | 22 个 |
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

> 共 22 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `appId` | APPID |
| `cEPName` | `cEPName` | `cEPName` | 商家名称 |
| `cSubTitle` | `cSubTitle` | `cSubTitle` | 券副标题 |
| `cTitle` | `cTitle` | `name` | 名称 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bSyncWeChatCoupon` | `bSyncWeChatCoupon` | `syncWeChatCoupon` | 是否同步微信 |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iExpMode` | `iExpMode` | `expMode` | 有效期类型 |
| `dExpDate` | `dExpDate` | `expireDate` | 过期时间 |
| `iDownLinePayType` | `iDownLinePayType` | `iDownLinePayType` | 是否线下收款方式 |
| `iElecCard` | `iElecCard` | `isElec` | 是否电子卡券 |
| `iQuantity` | `iQuantity` | `quantity` | 可发放数量 |
| `iScopeLevel` | `iScopeLevel` | `scopeLevel` | 卡券管理维度 |
| `iShopOrOrg` | `iShopOrOrg` | `shopOrOrg` | 组织或商家 |
| `iUnlimitOrg` | `iUnlimitOrg` | `unLimitOrg` | 组织不限制 |
| `iUnlimitShop` | `iUnlimitShop` | `unLimitShop` | 商家不限制 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |
| `iScopeID` | `iScopeID` | `scopeId` | 会员管理维度id |
| `iType` | `iType` | `type` | 类型ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fReduceAmount` | `fReduceAmount` | `fReduceAmount` | 减免金额 |
| `fReferencePrice` | `fReferencePrice` | `fReferencePrice` | 参考价格 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
