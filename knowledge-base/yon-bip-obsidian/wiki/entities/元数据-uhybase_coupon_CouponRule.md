---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 优惠券发放规则 (`uhybase.coupon.CouponRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_couponrule` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`218604bc-777d-419b-b88b-58f9236b4e4c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优惠券发放规则 |
| 物理表 | `mp_couponrule` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 19 个 |
| 子表 | 1 个 |
| 关联引用 | 3 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `couponRuleStores` | `uhybase.coupon.CouponRuleStores` | composition |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `mm_corphierarchyref` |
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (5个, 8字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **会员管理维度** (`uhy.itf.Scope`)
  - `iScopeID` → `iScopeID`
  - `iScopeLevel` → `iScopeLevel`
  - `cScopeName` → `cScopeName`
- **创建操作员ID** (`uhy.itf.yhtUserId`)
  - `cYhtUserId` → `cYhtUserId`
  - `cYhtUserName` → `cYhtUserName`
- **创建时间** (`uhy.itf.CreateTime`)
  - `dCreateTime` → `dCreateTime`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cRuleName` | `cRuleName` | `cRuleName` | 规则名称 |
| `cMemo` | `cMemo` | `cMemo` | 规则备注 |
| `cScopeName` | `cScopeName` | `cScopeName` | 卡券管理维度名称 |
| `cScopeName` | `cScopeName` | `scopeName` | 会员管理维度名称 |
| `cYhtUserId` | `cYhtUserId` | `yhtUserId` | 创建操作员ID |
| `cYhtUserName` | `cYhtUserName` | `yhtUserName` | 操作员Name |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iScopeLevel` | `iScopeLevel` | `scopeLevel` | 维度level |
| `iRuleType` | `iRuleType` | `iRuleType` | 营销端发放规则 |
| `iMaxCount` | `iMaxCount` | `iMaxCount` | 发放最高限量 |
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `iScopeID` | `iScopeID` | `scopeID` | 维度id |
| `iScopeID` | `iScopeID` | `iScopeID` | 卡券管理维度id |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `couponRuleStores` | 优惠券发放规则门店配置 |

### byte (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iScopeLevel` | `iScopeLevel` | `iScopeLevel` | 卡券管理维度 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
