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

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_couponrule` | 应用: `SDMB` | 类型: `Class`

## 属性（19 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `cAppID` | cAppID | `cAppID` | 4556b717-b77c-4631-8314-70fc8d5ac99d | `quote` |
| 3 | `scopeID` | scopeID | `iScopeID` | Long | `long` |
| 4 | `scopeLevel` | scopeLevel | `iScopeLevel` | Integer | `int` |
| 5 | `cRuleName` | cRule名称 | `cRuleName` | String | `text` |
| 6 | `cMemo` | cMemo | `cMemo` | String | `text` |
| 7 | `iRuleType` | iRuleType | `iRuleType` | Integer | `int` |
| 8 | `iMaxCount` | iMaxCount | `iMaxCount` | Integer | `int` |
| 9 | `cScopeName` | cScope名称 | `cScopeName` | String | `text` |
| 10 | `couponRuleStores` | couponRuleStores | `` | dab83d1a-f440-4a57-bd9d-9992294b4f16 | `` |
| 11 | `createTime` | 创建时间 | `dCreateTime` | Integer | `int` |
| 12 | `iScopeID` | iScopeID | `iScopeID` | Long | `long` |
| 13 | `iScopeLevel` | iScopeLevel | `iScopeLevel` | Byte | `byte` |
| 14 | `membercorp` | membercorp | `iCorpId` | Long | `long` |
| 15 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 16 | `scopeName` | scope名称 | `cScopeName` | String | `text` |
| 17 | `yhtUserId` | yhtUserID | `cYhtUserId` | String | `text` |
| 18 | `yhtUserName` | yhtUser名称 | `cYhtUserName` | String | `text` |
| 19 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `cAppID` -> `uhybase.basic.CorpHierarchyTemp` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `couponRuleStores` -> `uhybase.coupon.CouponRuleStores` (0..n)
