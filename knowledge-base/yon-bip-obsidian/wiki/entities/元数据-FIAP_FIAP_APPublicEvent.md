---
tags: [BIP, 元数据, 数据字典, FIAP, 应付, FIAP.FIAP.APPublicEvent]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 应付公共基本信息 (`FIAP.FIAP.APPublicEvent`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `arap_ledger_h` | 应用: `EAP` | 类型: `Class`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |

## 依赖接口（7 个）

- `IAuditInfo` -> `iuap.busiObj.IAuditInfo` (v679)
- `BusinessFlowItf` -> `iuap.busiObj.BusinessFlowItf` (v1221)
- `ApprovalFlowItf` -> `iuap.busiObj.ApprovalFlowItf` (v830)
- `BusinessFlowSourcesItf` -> `iuap.busiObj.BusinessFlowSourcesItf` (v800)
- `IEARAPCarryover` -> `FIAP.FIAP.IEARAPCarryover` (v45)
- `IYTenant` -> `iuap.busiObj.IYTenant` (v214)
- `LogicDelete` -> `iuap.busiObj.LogicDelete` (v211)

## 属性（109 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accAmount` | accAmount | `acc_amount` | Decimal | `number` |
| 2 | `accBalance` | accBalance | `acc_balance` | Decimal | `number` |
| 3 | `accBook` | accBook | `acc_book_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | `quote` |
| 4 | `accConvertParam` | accConvertParam | `acc_convert_param` | ConvertParamEnum | `singleOption` |
| 5 | `accCurrency` | accCurrency | `acc_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 6 | `accDate` | acc日期 | `acc_date` | String | `date` |
| 7 | `accPeriod` | accPeriod | `acc_period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 8 | `accPeriodCode` | accPeriod编码 | `acc_period_code` | String | `text` |
| 9 | `accPurpose` | accPurpose | `acc_purpose` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | `quote` |
| 10 | `accYear` | accYear | `acc_year_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 11 | `accYearCode` | accYear编码 | `acc_year_code` | String | `text` |
| 12 | `arapEventType` | arapEventType | `arap_event_type` | EventTypeEnum | `singleOption` |
| 13 | `auditNote` | auditNote | `auditnote` | String | `text` |
| 14 | `balanceState` | balanceState | `balance_state` | eap_balanceState | `multipleOption` |
| 15 | `batchNo` | batchNo | `batch_no` | String | `text` |
| 16 | `bizBillCode` | bizBill编码 | `biz_bill_code` | String | `text` |
| 17 | `bizBillId` | bizBillID | `biz_bill_id` | String | `text` |
| 18 | `bizBillType` | bizBillType | `biz_bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 19 | `bizTradeType` | bizTradeType | `biz_bill_trade_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 20 | `blnEffect` | blnEffect | `bln_effect` | EffectEnum | `singleOption` |
| 21 | `blnWriteOff` | blnWriteOff | `bln_write_off` | earap_boolean_writeOff | `singleOption` |
| 22 | `checkErrorMsg` | checkErrorMsg | `check_error_msg` | String | `text` |
| 23 | `clearTime` | clearTime | `clear_time` | String | `date` |
| 24 | `code` | 编码 | `event_code` | String | `text` |
| 25 | `dtcGtxid` | dtcGtxid | `dtc_gtxid` | String | `text` |
| 26 | `dtcStatus` | dtcStatus | `dtc_status` | Integer | `int` |
| 27 | `employee` | employee | `employee_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 28 | `entry` | entry | `entry_id` | String | `text` |
| 29 | `entryCode` | entry编码 | `entry_code` | String | `text` |
| 30 | `eventType` | eventType | `event_type_id` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | `quote` |
| 31 | `financeOrg` | financeOrg | `finance_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 32 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 33 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 34 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 35 | `firstId` | firstID | `first_id` | String | `text` |
| 36 | `freeChId` | freeChID | `free_ch_id` | 63d88602-7cfa-42b8-9b38-ce0d9d09bf11 | `UserDefine` |
| 37 | `funder` | funder | `funder_id` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 38 | `gblAmount` | gblAmount | `gbl_amount` | Decimal | `number` |
| 39 | `gblBalance` | gblBalance | `gbl_balance` | Decimal | `number` |
| 40 | `gblConvertParam` | gblConvertParam | `gbl_convert_param` | ConvertParamEnum | `singleOption` |
| 41 | `gblCurrency` | gblCurrency | `gbl_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 42 | `grpAmount` | grpAmount | `grp_amount` | Decimal | `number` |
| 43 | `grpBalance` | grpBalance | `grp_balance` | Decimal | `number` |
| 44 | `grpConvertParam` | grpConvertParam | `grp_convert_param` | ConvertParamEnum | `singleOption` |
| 45 | `grpCurrency` | grpCurrency | `grp_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 46 | `modifyTime` | 修改时间 | `modify_time` | Date | `dateTime` |
| 47 | `objectType` | objectType | `object_type` | ObjectTypeApEnum | `singleOption` |
| 48 | `oppBillId` | oppBillID | `opp_bill_id` | String | `text` |
| 49 | `org` | org | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 50 | `orgAmount` | orgAmount | `org_amount` | Decimal | `number` |
| 51 | `orgBalance` | orgBalance | `org_balance` | Decimal | `number` |
| 52 | `orgConvertParam` | orgConvertParam | `org_convert_param` | ConvertParamEnum | `singleOption` |
| 53 | `orgCurrency` | orgCurrency | `org_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 54 | `oriAmount` | oriAmount | `ori_amount` | Decimal | `number` |
| 55 | `oriBalance` | oriBalance | `ori_balance` | Decimal | `number` |
| 56 | `oriCurrency` | oriCurrency | `ori_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 57 | `oriOcupyAmount` | oriOcupyAmount | `ori_ocupy_amount` | Decimal | `number` |
| 58 | `partner` | partner | `partner_id` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |
| 59 | `postState` | postState | `post_state` | ArApPostStatusEnum | `singleOption` |
| 60 | `postStatusCode` | postStatus编码 | `post_status_code` | String | `text` |
| 61 | `remarks` | remarks | `remarks` | String | `text` |
| 62 | `retailer` | retailer | `retailer_name` | String | `text` |
| 63 | `settleState` | settleState | `settle_state` | SettleStateEnum | `singleOption` |
| 64 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 65 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 66 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 67 | `sourceId` | sourceID | `source_id` | String | `text` |
| 68 | `srcApp` | srcApp | `src_app_id` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | `quote` |
| 69 | `srcBillCode` | srcBill编码 | `src_bill_code` | String | `text` |
| 70 | `srcBillDate` | srcBill日期 | `src_bill_date` | String | `date` |
| 71 | `srcBillId` | srcBillID | `src_bill_id` | String | `text` |
| 72 | `srcBillType` | srcBillType | `src_bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 73 | `srcDataId` | srcDataID | `src_data_id` | String | `text` |
| 74 | `srcDataType` | srcDataType | `src_data_type` | String | `text` |
| 75 | `srcEvent` | srcEvent | `src_event_id` | String | `text` |
| 76 | `srcSystem` | srcSystem | `src_system` | eap_srcSystem | `multipleOption` |
| 77 | `srcTradeType` | srcTradeType | `src_trade_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 78 | `status` | 状态 | `status` | EventStatusEnum | `singleOption` |
| 79 | `supplier` | supplier | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 80 | `voucher` | voucher | `voucher_id` | String | `text` |
| 81 | `voucherCode` | voucher编码 | `voucher_code` | String | `text` |
| 82 | `voucherType` | voucherType | `voucher_type_id` | 4a2cdeef-16cd-46c6-91b6-629eaf7be9e1 | `quote` |
| 83 | `writeOffReason` | writeOffReason | `write_off_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 | `quote` |
| 84 | `writeOffSrcDataCode` | writeOffSrcData编码 | `write_off_src_data_code` | String | `text` |
| 85 | `writeOffSrcDataId` | writeOffSrcDataID | `write_off_src_data_id` | String | `text` |
| 86 | `writeOffState` | writeOffState | `write_off_state` | WriteOffStateEnum | `singleOption` |
| 87 | `auditTime` | auditTime | `audit_time` | DateTime | `dateTime` |
| 88 | `auditor` | auditor | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 89 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 90 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 91 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 92 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 93 | `blnCarryover` | blnCarryover | `bln_carryover` | Short | `short` |
| 94 | `bodyItem` | bodyItem | `` | 11df05ba-d92b-4e64-a061-e083057642a8 | `` |
| 95 | `carryoverEvent` | carryoverEvent | `carryover_event_id` | String | `text` |
| 96 | `carryoverPeriod` | carryoverPeriod | `carryover_period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 97 | `carryoverPeriodCode` | carryoverPeriod编码 | `carryover_period_code` | String | `text` |
| 98 | `carryoverYear` | carryoverYear | `carryover_year_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 99 | `carryoverYearCode` | carryoverYear编码 | `carryover_year_code` | String | `text` |
| 100 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 101 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 102 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 103 | `id` | ID | `id` | String | `text` |
| 104 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 105 | `procinstId` | procinstID | `procinst_id` | String | `text` |
| 106 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 107 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 108 | `verifyState` | verifyState | `verifystate` | sys_verifystate | `singleOption` |
| 109 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（31 个）

| # | 字段 | 目标实体 | 多重性 | 组合 | 废弃 |
|---|------|---------|--------|------|------|
| 1 | `funder` | `tmsp.fundbusinobjarchives.FundBusinObjArchives` |  |  | false |
| 2 | `oriCurrency` | `bd.currencytenant.CurrencyTenantVO` |  |  | false |
| 3 | `financeOrg` | `org.func.FinanceOrg` |  |  | false |
| 4 | `gblCurrency` | `bd.currencytenant.CurrencyTenantVO` |  |  | false |
| 5 | `modifier` | `base.user.BipUser` |  |  |  |
| 6 | `bizTradeType` | `bd.bill.TransType` |  |  | false |
| 7 | `employee` | `bd.staff.Staff` |  |  | false |
| 8 | `writeOffReason` | `aa.reason.Reason` |  |  | false |
| 9 | `accYear` | `bd.period.Period` |  |  | false |
| 10 | `supplier` | `aa.vendor.Vendor` |  |  | false |
| 11 | `accCurrency` | `bd.currencytenant.CurrencyTenantVO` |  |  | false |
| 12 | `grpCurrency` | `bd.currencytenant.CurrencyTenantVO` |  |  | false |
| 13 | `orgCurrency` | `bd.currencytenant.CurrencyTenantVO` |  |  | false |
| 14 | `creator` | `base.user.BipUser` |  |  |  |
| 15 | `bodyItem` | `FIAP.FIAP.APPublicEventBody` | 0..n | Y |  |
| 16 | `srcTradeType` | `bd.bill.TransType` |  |  | false |
| 17 | `org` | `org.func.BaseOrg` |  |  | false |
| 18 | `voucherType` | `epub.vouchertype.VoucherType` |  |  | false |
| 19 | `carryoverYear` | `bd.period.Period` |  |  |  |
| 20 | `auditor` | `base.user.BipUser` |  |  |  |
| 21 | `carryoverPeriod` | `bd.period.Period` |  |  |  |
| 22 | `eventType` | `eeac.fievent.FiEventDO` |  |  | false |
| 23 | `freeChId` | `FIAP.FIAP.APPublicEventfreeItemUserDefine` |  |  | false |
| 24 | `ytenantId` | `yht.tenant.YhtTenant` |  |  |  |
| 25 | `srcApp` | `epub.sourceapplication.SourceApplication` |  |  | false |
| 26 | `srcBillType` | `bd.bill.BillTypeVO` |  |  | false |
| 27 | `accPurpose` | `bd.accpurpose.AccPurposeVO` |  |  | false |
| 28 | `accPeriod` | `bd.period.Period` |  |  | false |
| 29 | `accBook` | `epub.accountbook.AccountBook` |  |  | false |
| 30 | `partner` | `base.businesspartner.BusinessPartner` |  |  | false |
| 31 | `bizBillType` | `bd.bill.BillTypeVO` |  |  | false |
