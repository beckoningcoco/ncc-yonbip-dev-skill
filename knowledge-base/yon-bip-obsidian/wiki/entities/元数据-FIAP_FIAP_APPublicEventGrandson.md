---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.APPublicEventGrandson]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 应付公共计划信息 (`FIAP.FIAP.APPublicEventGrandson`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `arap_ledger_g` | 应用: `EAP`

## 属性（71 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accAmount` | accAmount | `acc_amount` | Decimal | `number` |
| 2 | `accBalance` | accBalance | `acc_balance` | Decimal | `number` |
| 3 | `accBook` | accBook | `acc_book_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | `quote` |
| 4 | `accPeriod` | accPeriod | `acc_period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 5 | `accYear` | accYear | `acc_year_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 6 | `amountDirection` | amountDirection | `amount_direction` | AmountDirection | `singleOption` |
| 7 | `apSubject` | apSubject | `ap_subject_id` | b56c7f52-183c-4cea-a310-d6ee902365af | `quote` |
| 8 | `apSubjectVid` | apSubjectVid | `ap_subject_vid` | ce8d451a-3779-4a48-ba8b-894e68a87fed | `quote` |
| 9 | `balanceState` | balanceState | `balance_state` | eap_balanceState | `singleOption` |
| 10 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 11 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 12 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 13 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 14 | `blnCarryover` | blnCarryover | `bln_carryover` | Short | `short` |
| 15 | `blnDeposit` | blnDeposit | `bln_deposit` | Boolean | `switch` |
| 16 | `blnHangUp` | blnHangUp | `bln_hangup` | Boolean | `switch` |
| 17 | `blnPrepare` | blnPrepare | `bln_prepare` | Boolean | `switch` |
| 18 | `body` | body | `body_id` | 11df05ba-d92b-4e64-a061-e083057642a8 | `quote` |
| 19 | `carryoverBody` | carryoverBody | `carryover_body_id` | String | `text` |
| 20 | `carryoverEvent` | carryoverEvent | `carryover_event_id` | String | `text` |
| 21 | `carryoverGrandson` | carryoverGrandson | `carryover_grandson_id` | String | `text` |
| 22 | `carryoverPeriod` | carryoverPeriod | `carryover_period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 23 | `carryoverPeriodCode` | carryoverPeriod编码 | `carryover_period_code` | String | `text` |
| 24 | `carryoverYear` | carryoverYear | `carryover_year_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 25 | `carryoverYearCode` | carryoverYear编码 | `carryover_year_code` | String | `text` |
| 26 | `clearTime` | clearTime | `clear_time` | String | `date` |
| 27 | `convertWay` | convertWay | `convert_way` | ConvertWay | `singleOption` |
| 28 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 29 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 30 | `digest` | digest | `digest` | ARAPDigestTypeEnum | `singleOption` |
| 31 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 32 | `event` | event | `event_id` | 5a4e7d5d-57c1-4d58-b931-0477ad5ca5d2 | `quote` |
| 33 | `eventType` | eventType | `event_type_id` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | `quote` |
| 34 | `expireDate` | expireDate | `expire_date` | String | `date` |
| 35 | `financeOrg` | financeOrg | `finance_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 36 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 37 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 38 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 39 | `firstId` | firstID | `first_id` | String | `text` |
| 40 | `gblAmount` | gblAmount | `gbl_amount` | Decimal | `number` |
| 41 | `gblBalance` | gblBalance | `gbl_balance` | Decimal | `number` |
| 42 | `grpAmount` | grpAmount | `grp_amount` | Decimal | `number` |
| 43 | `grpBalance` | grpBalance | `grp_balance` | Decimal | `number` |
| 44 | `id` | ID | `id` | String | `text` |
| 45 | `issueNo` | 是否sueNo | `issue_no` | Integer | `int` |
| 46 | `localBalanceState` | localBalanceState | `local_balance_state` | eap_balanceState | `singleOption` |
| 47 | `localClearTime` | localClearTime | `local_clear_time` | String | `date` |
| 48 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 49 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 50 | `orgAmount` | orgAmount | `org_amount` | Decimal | `number` |
| 51 | `orgBalance` | orgBalance | `org_balance` | Decimal | `number` |
| 52 | `oriAmount` | oriAmount | `ori_amount` | Decimal | `number` |
| 53 | `oriArapEventType` | oriArapEventType | `ori_arap_event_type` | String | `text` |
| 54 | `oriBalance` | oriBalance | `ori_balance` | Decimal | `number` |
| 55 | `oriGrandsonId` | oriGrandsonID | `ori_grandson_id` | String | `text` |
| 56 | `oriOcupyAmount` | oriOcupyAmount | `ori_ocupy_amount` | Decimal | `number` |
| 57 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 58 | `quickType` | quickType | `b_quick_type_id` | 14b092f3-5d27-4a47-82a0-d6bad074c9f1 | `quote` |
| 59 | `ratio` | ratio | `ratio` | Decimal | `number` |
| 60 | `rowNo` | rowNo | `row_no` | Decimal | `number` |
| 61 | `settleMode` | settleMode | `settle_mode_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 62 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 63 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 64 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 65 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 66 | `sourceId` | sourceID | `source_id` | String | `text` |
| 67 | `srcExeDetailId` | srcExeDetailID | `src_exe_detail_id` | String | `text` |
| 68 | `srcGrandson` | srcGrandson | `src_grandson_id` | String | `text` |
| 69 | `startDate` | startDate | `start_date` | String | `date` |
| 70 | `writeOffSrcDataId` | writeOffSrcDataID | `write_off_src_data_id` | String | `text` |
| 71 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（16 个）

- `creator` -> `base.user.BipUser` () 
- `financeOrg` -> `org.func.FinanceOrg` () 
- `carryoverYear` -> `bd.period.Period` () 
- `modifier` -> `base.user.BipUser` () 
- `apSubject` -> `epub.subject.AccSubject` () 
- `carryoverPeriod` -> `bd.period.Period` () 
- `apSubjectVid` -> `epub.subjectversion.AccsubjectVersion` () 
- `eventType` -> `eeac.fievent.FiEventDO` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `body` -> `FIAP.FIAP.APPublicEventBody` (0..n) 
- `quickType` -> `bd.paymenttype.PaymentTypeVO` () 
- `accPeriod` -> `bd.period.Period` () 
- `accBook` -> `epub.accountbook.AccountBook` () 
- `settleMode` -> `aa.settlemethod.SettleMethod` () 
- `accYear` -> `bd.period.Period` () 
- `event` -> `FIAP.FIAP.APPublicEvent` () 
