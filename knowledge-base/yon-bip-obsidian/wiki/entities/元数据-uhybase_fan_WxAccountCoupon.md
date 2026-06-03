---
tags: [BIP, 元数据, 数据字典, uhybase.fan.WxAccountCoupon]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 微信公众号优惠券 (`uhybase.fan.WxAccountCoupon`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_wxaccountcoupon` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 微信公众号优惠券 |
| 物理表 | `mp_wxaccountcoupon` |
| 数据库 schema | `uhy` |
| 所属应用 | `SDMB` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `iWxAccountID` | `` |
| `ytenant_id` | `` |

## 继承接口 (3个, 3字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **创建时间** (`uhy.itf.CreateTime`)
  - `dCreateTime` → `dCreateTime`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `couponName` | `couponName` | `couponName` | 首关赠送卡券 |
| `cAppID` | `cAppID` | `cAppID` | cAppID |
| `cWXAccountID` | `cWXAccountID` | `cWXAccountID` | 微信账号ID |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iWxAccountID` | `iWxAccountID` | `iWxAccountID` | 公众号ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iFirstAttentionSend` | `iFirstAttentionSend` | `iFirstAttentionSend` | 是否是首次关注赠送 |
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCouponID` | `iCouponID` | `iCouponID` | 卡券ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
