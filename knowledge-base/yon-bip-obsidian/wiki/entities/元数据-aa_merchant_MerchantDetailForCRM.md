---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantDetailForCRM]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户适用范围组详情(CRM) (`aa.merchant.MerchantDetailForCRM`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchant_detail_for_crm` | 应用: `DPMCUS` | 类型: `Class`

## 属性（22 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `merchantId` | merchantID | `merchant_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `applyPerson` | applyPerson | `apply_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 4 | `applyStatus` | applyStatus | `apply_status` | Integer | `int` |
| 5 | `applyTime` | applyTime | `apply_time` | DateTime | `timestamp` |
| 6 | `belongOrgId` | belongOrgID | `belong_org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 7 | `clue` | clue | `clue_id` | Long | `long` |
| 8 | `highSeas` | highSeas | `high_seas_id` | Long | `long` |
| 9 | `isPotential` | 是否Potential | `is_potential` | Integer | `int` |
| 10 | `noFollowTime` | noFollowTime | `no_follow_time` | String | `text` |
| 11 | `positivePeople` | positivePeople | `positive_people` | String | `text` |
| 12 | `positiveTime` | positiveTime | `positive_time` | DateTime | `timestamp` |
| 13 | `recentFollowContent` | recentFollowContent | `recent_follow_content` | String | `text` |
| 14 | `recentFollower` | recentFollower | `recent_follower` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 15 | `recentlyFollowTime` | recentlyFollowTime | `recently_follow_time` | DateTime | `timestamp` |
| 16 | `sourceOfTheHighSeas` | sourceOfTheHighSeas | `source_of_the_high_seas_id` | Long | `long` |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 18 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 19 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 20 | `merchantApplyRangeGroupId` | merchantApplyRangeGroupID | `merchant_apply_range_group_id` | 4a4a8f0b-00a4-4375-84ee-5561c7f28c17 | `quote` |
| 21 | `merchantApplyRangeId` | merchantApplyRangeID | `merchant_apply_range_id` | b023ebd3-0f7f-4a9a-a28b-32183b1b8022 | `quote` |
| 22 | `merchantDetailId` | merchantDetailID | `merchant_detail_id` | 1f145dee-55c4-4ad6-a699-873c8ecc096e | `quote` |

## 关联（9 个）

- `applyPerson` -> `bd.staff.Staff` ()
- `recentFollower` -> `bd.staff.Staff` ()
- `merchantId` -> `aa.merchant.Merchant` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `belongOrgId` -> `bd.adminOrg.BaseOrgVO` ()
- `merchantApplyRangeId` -> `aa.merchant.MerchantApplyRangeExt` (1)
- `merchantApplyRangeGroupId` -> `aa.merchant.MerchantApplyRangeGroup` ()
- `merchantDetailId` -> `aa.merchant.MerchantDetail` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
