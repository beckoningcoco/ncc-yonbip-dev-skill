---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantStaff]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户员工 (`aa.merchant.MerchantStaff`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchantstaff` | 应用: `DPMCUS` | 类型: `Class`

## 属性（20 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `cHeadPicUrl` | cHeadPicUrl | `cHeadPicUrl` | String | `text` |
| 2 | `code` | 编码 | `cCode` | String | `text` |
| 3 | `dEntryTime` | dEntryTime | `dEntryTime` | DateTime | `timestamp` |
| 4 | `dLeaveTime` | dLeaveTime | `dLeaveTime` | DateTime | `timestamp` |
| 5 | `email` | email | `cEmail` | String | `text` |
| 6 | `fullName` | full名称 | `cFullName` | String | `text` |
| 7 | `gender` | gender | `iGender` | Integer | `int` |
| 8 | `iPosition` | iPosition | `iPosition` | a06cee30-92b1-4a03-b399-3886f55e4ba1 | `quote` |
| 9 | `merchantId` | merchantID | `imerchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 10 | `mobile` | mobile | `cMobile` | String | `text` |
| 11 | `qq` | qq | `cQQ` | String | `text` |
| 12 | `remarks` | remarks | `cRemarks` | String | `text` |
| 13 | `source` | source | `source` | String | `text` |
| 14 | `userName` | user名称 | `cUserName` | String | `text` |
| 15 | `weChat` | weChat | `cWeChat` | String | `text` |
| 16 | `yhtUserId` | yhtUserID | `cyhtUserId` | String | `text` |
| 17 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 18 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 19 | `id` | ID | `id` | Long | `long` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（4 个）

- `merchantId` -> `aa.merchant.Merchant` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `iPosition` -> `bd.duty.Position` ()
- `tenant` -> `base.tenant.Tenant` ()
