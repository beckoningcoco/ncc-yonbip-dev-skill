---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctMargin]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 履约保证金 (`apct.contract.ApctMargin`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_margin` | 应用: `APCT`

## 属性（26 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `createDate` | createDate | `create_date` | Date | `date` |
| 3 | `acctAmtBak` | acctAmtBak | `acct_amt_bak` | Decimal | `number` |
| 4 | `unapprRefundAmtBak` | unapprRefundAmtBak | `unappr_refund_amt_bak` | Decimal | `number` |
| 5 | `apprRefundAmtBak` | apprRefundAmtBak | `appr_refund_amt_bak` | Decimal | `number` |
| 6 | `refundedAmtBak` | refundedAmtBak | `refunded_amt_bak` | Decimal | `number` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 9 | `creator` | 创建人 | `creator` | String | `text` |
| 10 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 11 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 12 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 13 | `modifier` | 修改人 | `modifier` | String | `text` |
| 14 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 15 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 17 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 18 | `id` | ID | `id` | Long | `long` |
| 19 | `receiptNum` | receiptNum | `receipt_num` | String | `text` |
| 20 | `acctDate` | acctDate | `acct_date` | Date | `date` |
| 21 | `acctAmt` | acctAmt | `acct_amt` | Decimal | `number` |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 23 | `unapprRefundAmt` | unapprRefundAmt | `unappr_refund_amt` | Decimal | `number` |
| 24 | `apprRefundAmt` | apprRefundAmt | `appr_refund_amt` | Decimal | `number` |
| 25 | `refundedAmt` | refundedAmt | `refunded_amt` | Decimal | `number` |
| 26 | `apctApctMarginDcs` | apctApctMarginDcs | `apctApctMarginDcs` | bb03975c-cebc-4937-854a-4de7405b79ad | `UserDefine` |

## 关联（6 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `apctApctMarginDcs` -> `apct.contract.ApctMarginDcsVo` () 
- `tenant` -> `base.tenant.Tenant` () 
