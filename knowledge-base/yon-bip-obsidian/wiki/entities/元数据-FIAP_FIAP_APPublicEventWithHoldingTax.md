---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.APPublicEventWithHoldingTax]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 应付公共代扣税信息 (`FIAP.FIAP.APPublicEventWithHoldingTax`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `arap_ledger_g_wht` | 应用: `EAP`

## 属性（35 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accBook` | accBook | `acc_book_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | `quote` |
| 2 | `accPeriod` | accPeriod | `acc_period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 3 | `accPeriodCode` | accPeriod编码 | `acc_period_code` | String | `text` |
| 4 | `accWhtaxAmount` | accWhtaxAmount | `acc_whtax_amount` | Decimal | `number` |
| 5 | `accYear` | accYear | `acc_year_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 6 | `accYearCode` | accYear编码 | `acc_year_code` | String | `text` |
| 7 | `arapEventType` | arapEventType | `arap_event_type` | EventTypeEnum | `singleOption` |
| 8 | `blnCarryover` | blnCarryover | `bln_carryover` | Short | `short` |
| 9 | `body` | body | `body_id` | 11df05ba-d92b-4e64-a061-e083057642a8 | `quote` |
| 10 | `carryoverPeriod` | carryoverPeriod | `carryover_period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 11 | `carryoverPeriodCode` | carryoverPeriod编码 | `carryover_period_code` | String | `text` |
| 12 | `carryoverYear` | carryoverYear | `carryover_year_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 13 | `carryoverYearCode` | carryoverYear编码 | `carryover_year_code` | String | `text` |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 15 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 16 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 17 | `event` | event | `event_id` | 408249c8-4dac-4be2-b135-49c55657ded1 | `quote` |
| 18 | `eventType` | eventType | `event_type_id` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | `quote` |
| 19 | `financeOrg` | financeOrg | `finance_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 20 | `gblWhtaxAmount` | gblWhtaxAmount | `gbl_whtax_amount` | Decimal | `number` |
| 21 | `grpWhtaxAmount` | grpWhtaxAmount | `grp_whtax_amount` | Decimal | `number` |
| 22 | `id` | ID | `id` | String | `text` |
| 23 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 25 | `orderNo` | orderNo | `order_no` | Integer | `int` |
| 26 | `orgWhtaxAmount` | orgWhtaxAmount | `org_whtax_amount` | Decimal | `number` |
| 27 | `oriWhtaxAmount` | oriWhtaxAmount | `ori_whtax_amount` | Decimal | `number` |
| 28 | `oriWhtaxBaseAmount` | oriWhtaxBaseAmount | `ori_whtax_base_amount` | Decimal | `number` |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 30 | `rowNo` | rowNo | `row_no` | Decimal | `number` |
| 31 | `whtax` | whtax | `whtax_id` | aaae292d-ebbc-4b8f-a9f7-b67bff16c947 | `quote` |
| 32 | `whtaxRate` | whtaxRate | `whtax_rate` | Decimal | `number` |
| 33 | `whtaxSubject` | whtaxSubject | `whtax_subject_id` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 | `quote` |
| 34 | `whtaxType` | whtaxType | `whtax_type_id` | affa6a3e-faa4-4896-baca-8b4da5dda6d8 | `quote` |
| 35 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（15 个）

- `creator` -> `base.user.BipUser` () 
- `financeOrg` -> `org.func.FinanceOrg` () 
- `whtax` -> `taxpubdoc.taxWithholding.taxWithholdingCode` () 
- `carryoverYear` -> `bd.period.Period` () 
- `modifier` -> `base.user.BipUser` () 
- `carryoverPeriod` -> `bd.period.Period` () 
- `eventType` -> `eeac.fievent.FiEventDO` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `body` -> `FIAP.FIAP.APPublicEventBody` (0..n) 
- `accPeriod` -> `bd.period.Period` () 
- `whtaxType` -> `taxpubdoc.taxWithholding.taxWithholdingType` () 
- `whtaxSubject` -> `bd.taxrate.TaxRateVO` () 
- `accBook` -> `epub.accountbook.AccountBook` () 
- `accYear` -> `bd.period.Period` () 
- `event` -> `FIAP.FIAP.ArapWithHoldingTax` () 
