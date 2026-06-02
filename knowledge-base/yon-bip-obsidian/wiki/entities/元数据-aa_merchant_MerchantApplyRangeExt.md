---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantApplyRangeExt]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户分配关系(CRM) (`aa.merchant.MerchantApplyRangeExt`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchantapplyrange` | 应用: `DPMCUS` | 类型: `Class`

## 属性（28 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `allocateSource` | allocateSource | `allocate_source` | String | `text` |
| 3 | `merchantId` | merchantID | `merchantid` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 4 | `shopId` | shopID | `ishopId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 5 | `shop` | shop | `iShopID` | Long | `long` |
| 6 | `orgId` | 组织ID | `orgId` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 7 | `controlRuleVersion` | controlRuleVersion | `control_rule_version` | Integer | `int` |
| 8 | `rangeType` | rangeType | `iRangeType` | Integer | `int` |
| 9 | `allocatorId` | allocatorID | `allocator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 10 | `allocatorName` | allocator名称 | `allocator_name` | String | `text` |
| 11 | `allocateTime` | allocateTime | `allocate_time` | DateTime | `timestamp` |
| 12 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |
| 13 | `isApplied` | 是否Applied | `isApplied` | Boolean | `switch` |
| 14 | `isSalesOrg` | 是否SalesOrg | `isSalesOrg` | Boolean | `switch` |
| 15 | `isPotential` | 是否Potential | `ispotential` | Boolean | `switch` |
| 16 | `noFollowTime` | noFollowTime | `nofollowtime` | String | `text` |
| 17 | `recentlyFollowTime` | recentlyFollowTime | `recentlyfollowtime` | DateTime | `timestamp` |
| 18 | `positivePeople` | positivePeople | `positivepeople` | String | `text` |
| 19 | `positiveTime` | positiveTime | `positivetime` | DateTime | `timestamp` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 21 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 22 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 23 | `merchantDetailId` | merchantDetailID | `merchant_detail_id` | 1f145dee-55c4-4ad6-a699-873c8ecc096e | `quote` |
| 24 | `customerAreas` | customerAreas | `` | 978ad259-ade5-4fb3-8aba-cecf550ec9d6 | `` |
| 25 | `invoicingCustomerss` | invoicingCustomerss | `` | d26147af-40a2-464a-a1d5-ff65a15918d3 | `` |
| 26 | `merchantAppliedDetailExt` | merchantAppliedDetailExt | `` | 0b0dd8bc-6aa8-4eed-96d2-4a105e8df8fc | `` |
| 27 | `merchantDetailForCrm` | merchantDetailForCrm | `` | 6972f9fb-67ad-4183-a43d-dbf1cd61cf10 | `` |
| 28 | `principals` | principals | `` | 7fdf2726-3ab2-4540-aa0c-4856d76467af | `` |

## 关联（12 个）

- `invoicingCustomerss` -> `aa.merchant.InvoicingCustomers` (0..n)
- `merchantAppliedDetailExt` -> `aa.merchant.MerchantApplyRangeDetail` (1)
- `merchantId` -> `aa.merchant.Merchant` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `merchantDetailForCrm` -> `aa.merchant.MerchantDetailForCRM` (1)
- `principals` -> `aa.merchant.Principal` (0..n)
- `merchantDetailId` -> `aa.merchant.MerchantDetail` ()
- `shopId` -> `aa.merchant.Merchant` ()
- `customerAreas` -> `aa.merchant.CustomerArea` (0..n)
- `allocatorId` -> `base.user.User` ()
- `orgId` -> `aa.baseorg.OrgMV` ()
- `tenant` -> `base.tenant.Tenant` ()
