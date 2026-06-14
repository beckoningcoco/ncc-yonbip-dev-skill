---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.purinrecord.PurInRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 采购入库单主表 (`st.purinrecord.PurInRecord`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> YonBIP 库存（ST）模块采购入库单的完整元数据字典。
> 物理表：`st_purinrecord` | 应用：`ST` | 类型：`Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购入库单主表 |
| 物理表 | `st_purinrecord` |
| domain/服务域 | `ustock` |
| schema | `ustock` |
| 应用 | `ST` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 数据权限场景 | `bill_maintain` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 | 说明 |
|------|------|-----|------|------|
| 主键 | `id` | `id` | Long | 主键ID |
| 编码 | `code` | `code` | | 编码 |
| 创建人 | `creatorId` | -- | -> User | |

## 业务场景

- `econtract`
- `workflow`
- `DataAuth`
- `transtype`
- `isCoreBill`
- `cprk`
- `dataPrivacy`
- `userdefine`
- `classified`
- `FieldAuth`
- `print`
- `ShareServiceCenter`
- `UITemplate`
- `imextmp`
- `report`
- `billcode`
- `ruleengine`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isBusinessLog`, `isAssigned`, `isExtend`, `data_auth`, `isMultiCodeRule`, `ischeckDaysBeforeValidityReject`, `doc`, `isBatchnoAutoCode`, `isUseCondition`

## 约束

- **business_primary_key** (transformKey): 业务主键
- **migration_id** (MetaClassPrimary): ID

## 依赖接口（29 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | `ITradeRouteID` | `sccs.multitrade.ITradeRouteID` | 27 | 4 |
| 2 | `IPrintCount` | `base.itf.IPrintCount` | 66 | 1 |
| 3 | `IShop` | `base.itf.IShop` | 65 | 1 |
| 4 | `IBusinessFlow` | `base.itf.IBusinessFlow` | 77 | 2 |
| 5 | `IMatterInfoAble` | `st.matterinfo.IMatterInfoAble` | 13 | 0 |
| 6 | `ICurrency` | `voucher.base.ICurrency` | 44 | 3 |
| 7 | `IHeadInfo` | `voucher.st.IHeadInfo` | 96 | 7 |
| 8 | `IHeadWriteBack` | `st.voucher.IHeadWriteBack` | 2 | 1 |
| 9 | `IRetailStoreAll` | `retail.voucher.IRetailStoreAll` | 29 | 0 |
| 10 | `IApprovalFlow` | `base.itf.IApprovalFlow` | 134 | 3 |
| 11 | `IIntTradeinfo` | `st.inttradeinfo.IIntTradeinfo` | 5 | 0 |
| 12 | `IInventorySign` | `st.internaltransaction.IInventorySign` | 4 | 1 |
| 13 | `QiMen` | `voucher.st.QiMen` | 4 | 3 |
| 14 | `QiMenMultiplePostback` | `voucher.st.QiMenMultiplePostback` | 2 | 1 |
| 15 | `IBarCode` | `ucfbase.ucfbaseItf.IBarCode` | 45 | 1 |
| 16 | `IStockUpdate` | `st.stockupdate.IStockUpdate` | 7 | 1 |
| 17 | `IInventoryOwner` | `st.inventoryowner.IInventoryOwner` | 15 | 1 |
| 18 | `IOwnerType` | `st.inventoryowner.IOwnerType` | 15 | 1 |
| 19 | `ExternalSystem` | `st.externalsystem.ExternalSystem` | 1 | 1 |
| 20 | `IPostAccountInfo` | `gscm.itf.IPostAccountInfo` | 4 | 2 |
| 21 | `FiEventAccInfo` | `gscm.interf.FiEventAccInfo` | 9 | 4 |
| 22 | `FiEventAccInfoAp` | `gscm.interf.FiEventAccInfoAp` | 7 | 4 |
| 23 | `ICertificateVersion` | `st.billstate.ICertificateVersion` | 1 | 1 |
| 24 | `IInStockType` | `st.billstate.IInStockType` | 2 | 1 |
| 25 | `IStockInOutType` | `st.billstate.IStockInOutType` | 2 | 1 |
| 26 | `FiInfoRecord` | `gscm.interf.FiInfoRecord` | 2 | 1 |
| 27 | `IYTenantExt` | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |
| 28 | `IOutSysObjClue` | `base.itf.IOutSysObjClue` | 4 | 4 |
| 29 | `IExchangeRate` | `voucher.base.IExchangeRate` | 7 | 4 |

---

## 全部直接属性（142 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `certificateVersion` | certificateVersion | `certificate_version` | Long | `long` |  | true |
| 2 | `expenseNatMoney` | expenseNat金额 | `expenseNatMoney` | Decimal | `number` |  | true |
| 3 | `expenseNatSum` | expenseNatSum | `expenseNatSum` | Decimal | `number` |  | true |
| 4 | `expenseOriMoney` | expenseOri金额 | `expenseOriMoney` | Decimal | `number` |  | true |
| 5 | `expenseOriSum` | expenseOriSum | `expenseOriSum` | Decimal | `number` |  | true |
| 6 | `fiEventAccountingDate` | fiEventAccounting日期 | `fiEventAccountingDate` | String | `text` |  | true |
| 7 | `fiEventAccountingDateAp` | fiEventAccountingDateAp | `fiEventAccountingDateAp` | String | `text` |  | true |
| 8 | `fiEventCode` | fiEvent编码 | `fiEventCode` | String | `text` |  | true |
| 9 | `fiEventCodeAp` | fiEventCodeAp | `fiEventCodeAp` | String | `text` |  | true |
| 10 | `fiEventDataId` | fiEventDataID | `fiEventDataId` | String | `text` |  | true |
| 11 | `fiEventDataIdAp` | fiEventDataIdAp | `fiEventDataIdAp` | String | `text` |  | true |
| 12 | `noPostReasonMsg` | noPostReasonMsg | `noPostReasonMsg` | String | `text` |  | true |
| 13 | `transferMethod` | transferMethod | `transfer_method` | String | `text` |  | true |
| 14 | `vendorcontact` | vendorcontact | `vendorcontactid` | b94fa77c-2f2b-464c-96fb-d028543825ee | `quote` |  | true |
| 15 | `directShipment` | directShipment | `iDirectShipment` | String | `text` |  | true |
| 16 | `exchRateOps` | exchRateOps | `exchRateOps` | ExchangeRateMethod | `` |  | true |
| 17 | `throwStatus` | throw状态 | `throw_status` | Integer | `int` | false | true |
| 18 | `impactStockTiming` | impactStockTiming | `impact_stock_timing` | Integer | `int` |  | true |
| 19 | `alreadyUpdateStock` | alreadyUpdateStock | `already_update_stock` | Integer | `int` |  | true |
| 20 | `impactFinancialTiming` | impactFinancialTiming | `impact_financial_timing` | Integer | `int` |  | true |
| 21 | `alreadyUpdateFinancial` | alreadyUpdateFinancial | `already_update_financial` | Integer | `int` |  | true |
| 22 | `writeOffEnable` | writeOffEnable | `write_off_enable` | Short | `short` |  | true |
| 23 | `writeOffStatus` | writeOff状态 | `write_off_status` | Short | `short` |  | true |
| 24 | `writeOffSourceid` | writeOffSourceid | `write_off_sourceid` | Long | `long` |  | true |
| 25 | `writeOffUpcode` | writeOffUpcode | `write_off_upcode` | String | `text` |  | true |
| 26 | `writeOffReason` | writeOffReason | `write_off_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 | `quote` |  | true |
| 27 | `tradeRouteLineno` | tradeRouteLineno | `tradeRouteLineno` | Decimal | `number` |  | true |
| 28 | `out_sys_code` | out_sys_code | `out_sys_code` | String | `text` |  | true |
| 29 | `isEndTrade` | 是否EndTrade | `isEndTrade` | Short | `short` |  | true |
| 30 | `tradeRouteID` | tradeRouteID | `tradeRouteID` | c69f1d6a-783c-4f79-b446-b4da14cb7fff | `quote` |  | true |
| 31 | `taxSettingType` | taxSetting类型 | `taxSettingType` | String | `text` |  | true |
| 32 | `out_sys_id` | out_sys_id | `out_sys_id` | String | `text` |  | true |
| 33 | `haspaymentschedules` | haspaymentschedules | `iHaspaymentschedules` | Boolean | `switch` |  | true |
| 34 | `out_sys_version` | out_sys_version | `out_sys_version` | String | `text` |  | true |
| 35 | `inStockType` | inStock类型 | `inStockType` | Integer | `int` |  | true |
| 36 | `paymentProcess` | paymentProcess | `paymentProcess` | Short | `short` |  | true |
| 37 | `out_sys_type` | out_sys_type | `out_sys_type` | String | `text` |  | true |
| 38 | `stockInOutType` | stockInOut类型 | `stock_in_out_type` | Integer | `int` |  | true |
| 39 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |
| 40 | `isgodownentry` | 是否godownentry | `is_godownentry` | Boolean | `switch` |  | true |
| 41 | `fiEventId` | fiEventID | `fiEventId` | String | `text` |  | true |
| 42 | `fiEventIdAp` | fiEventIdAp | `fiEventIdAp` | String | `text` |  | true |
| 43 | `isFeedback` | 是否Feedback | `isFeedback` | Boolean | `switch` |  | true |
| 44 | `priceSettlementRequired` | priceSettlementRequired | `priceSettlementRequired` | Boolean | `switch` |  | true |
| 45 | `wmsUnique` | wmsUnique | `wmsUnique` | String | `text` |  | true |
| 46 | `exchRateDate` | exchRate日期 | `exch_rate_date` | Date | `date` |  | true |
| 47 | `externalSystem` | externalSystem | `externalSystem` | String | `text` |  | true |
| 48 | `postAccountStatus` | postAccount状态 | `postAccountStatus` | Short | `short` |  | true |
| 49 | `postAccountVersion` | postAccountVersion | `postAccountVersion` | Long | `long` |  | true |
| 50 | `purInRecordDefineCharacter` | purInRecordDefineCharacter | `purInRecordDefineCharacter` | 1a426055-cf8a-46e3-8d15-97f38b31de90 | `UserDefine` |  | true |
| 51 | `voucherType` | voucher类型 | `voucher_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |  | true |
| 52 | `internalSign` | internalSign | `iInternalSign` | Boolean | `switch` |  | false |
| 53 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 54 | `wbTime` | wb时间 | `wbTime` | String | `text` |  | true |
| 55 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 56 | `org` | org | `iOrgid` | c1135e08-c4bf-4499-90bf-67030d1f2654 | `quote` |  | true |
| 57 | `purchaseOrg` | purchaseOrg | `purchase_org` | 528ae807-a9d3-4f2a-9ee7-1db3e5eddc01 | `quote` |  | true |
| 58 | `accountOrg` | accountOrg | `account_org` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | `quote` |  | true |
| 59 | `inInvoiceOrg` | inInvoiceOrg | `in_invoice_org` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | `quote` |  | true |
| 60 | `isSmallTaxpayer` | 是否SmallTaxpayer | `isSmallTaxpayer` | Boolean | `switch` |  | true |
| 61 | `code` | 编码 | `code` | String | `text` |  | true |
| 62 | `isWfControlled` | 是否工作流控制 | `isWfControlled` | Boolean | `switch` |  | true |
| 63 | `vouchdate` | 单据日期 | `vouchdate` | Date | `date` |  | true |
| 64 | `verifystate` | 认证状态 | `verifystate` | Short | `short` |  | true |
| 65 | `bustype` | bustype | `iBusType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true |
| 66 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | true |
| 67 | `shop` | shop | `iShopID` | Long | `long` |  | true |
| 68 | `store` | store | `iStoreID` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |  | true |
| 69 | `warehouse` | warehouse | `iWarehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |  | true |
| 70 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | true |
| 71 | `retailAgentName` | retailAgent名称 | `retailAgentName` | String | `text` |  | true |
| 72 | `invoiceVendor` | invoiceVendor | `invoice_vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | true |
| 73 | `department` | department | `department` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |  | true |
| 74 | `isBulkConver` | 是否BulkConver | `isBulkConver` | Boolean | `switch` |  | true |
| 75 | `paymentagrement` | paymentagrement | `iPaymentagrement` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |  | true |
| 76 | `inventoryowner` | inventoryowner | `inventoryowner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e | `quote` |  | true |
| 77 | `currency` | currency | `iCurrencyID` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true |
| 78 | `ownertype` | ownertype | `ownertype` | Integer | `int` |  | true |
| 79 | `natCurrency` | natCurrency | `iNatCurrencyID` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | false |
| 80 | `isUpdateCost` | 是否UpdateCost | `isUpdateCost` | Boolean | `switch` |  | true |
| 81 | `exchRateType` | exchRate类型 | `iExchangeratetype` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | true |
| 82 | `exchRate` | exchRate | `exchRate` | Decimal | `number` |  | false |
| 83 | `taxRate` | 税率 | `tax_rate` | Decimal | `number` |  | true |
| 84 | `taxitems` | taxitems | `iTaxItems` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | true |
| 85 | `isUpdateStock` | 是否UpdateStock | `isUpdateStock` | Boolean | `switch` |  | true |
| 86 | `receiptDocEntryAndMgmt` | receiptDocEntryAndMgmt | `receiptDocEntryAndMgmt` | String | `text` |  | true |
| 87 | `invoicingDocEntryAndMgmt` | invoicingDocEntryAndMgmt | `invoicingDocEntryAndMgmt` | String | `text` |  | true |
| 88 | `contact` | contact | `cContact` | String | `text` |  | true |
| 89 | `contactTel` | contactTel | `cContactTel` | String | `text` |  | true |
| 90 | `operator` | operator | `iOperatorId` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 91 | `stockMgr` | stockMgr | `stock_mgr` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 92 | `paymentsum` | paymentsum | `fPaymentSum` | Decimal | `number` |  | true |
| 93 | `payor` | payor | `iPayor` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 94 | `paytime` | paytime | `dPayTime` | DateTime | `timestamp` |  | true |
| 95 | `paymentstatus` | paymentstatus | `cPaymentStatus` | String | `text` |  | true |
| 96 | `status` | 状态 | `status` | Short | `short` |  | true |
| 97 | `isBeginning` | 是否Beginning | `isBeginning` | Boolean | `switch` |  | true |
| 98 | `barCode` | bar编码 | `bar_code` | String | `text` |  | true |
| 99 | `memo` | 备注 | `cMemo` | String | `text` |  | true |
| 100 | `totalQuantity` | 总数量 | `fTotalQuantity` | Decimal | `number` |  | true |
| 101 | `moneysum` | moneysum | `fMoneySum` | Decimal | `number` |  | true |
| 102 | `orisum` | orisum | `oriSum` | Decimal | `number` |  | true |
| 103 | `orimoney` | orimoney | `oriMoney` | Decimal | `number` |  | true |
| 104 | `tax` | tax | `tax` | Decimal | `number` |  | true |
| 105 | `srcBill` | srcBill | `isrcbillid` | String | `text` |  | true |
| 106 | `srcBillNO` | srcBillNO | `csrcbillno` | String | `text` |  | true |
| 107 | `printCount` | 打印次数 | `printCount` | Integer | `int` |  | true |
| 108 | `custom` | custom | `iCustomId` | Long | `long` |  | true |
| 109 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 110 | `tplid` | tplid | `tplid` | Long | `long` |  | true |
| 111 | `totalPieces` | totalPieces | `total_pieces` | Decimal | `number` |  | true |
| 112 | `printer` | printer | `printer` | String | `text` |  | true |
| 113 | `printTime` | print时间 | `print_time` | DateTime | `timestamp` |  | true |
| 114 | `isInvBack` | 是否InvBack | `iIsInvBack` | Boolean | `switch` |  | true |
| 115 | `payAgreement` | payAgreement | `iPayAgreement` | Long | `long` |  | true |
| 116 | `bizFlow` | bizFlow | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | true |
| 117 | `isFlowCoreBill` | 是否FlowCoreBill | `isFlowCoreBill` | Boolean | `switch` |  | true |
| 118 | `paymentIsContract` | paymentIsContract | `paymentIsContract` | Boolean | `switch` |  | true |
| 119 | `isContract` | 是否Contract | `is_contract` | Boolean | `switch` |  | true |
| 120 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 121 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 122 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 123 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 124 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 125 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 126 | `auditor` | 审批人 | `auditor` | String | `text` |  | true |
| 127 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | true |
| 128 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | true |
| 129 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 130 | `auditorId` | 审批人ID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 131 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 132 | `srcBillType` | srcBill类型 | `csrcbilltype` | String | `text` |  | true |
| 133 | `wmsBillno` | wmsBillno | `wmsbillno` | String | `text` |  | true |
| 134 | `wmsInStatus` | wmsIn状态 | `wmsinstatus` | Short | `short` |  | true |
| 135 | `wmsCancelStatus` | wmsCancel状态 | `wmscancelstatus` | Short | `short` |  | true |
| 136 | `barcodeRecord` | barcodeRecord | `` | 5a2f40fc-7e04-4e81-8745-b16e6cd2e98f | `` |  |  |
| 137 | `defines` | defines | `` | 0e7691d0-9a35-49ae-9c69-c35b1d849785 | `` |  |  |
| 138 | `headItem` | headItem | `` | 23062336-62db-4592-b519-685abcb9b872 | `` |  |  |
| 139 | `paymentExeDetail` | paymentExeDetail | `` | 55c300a0-a5b9-487d-aa48-37f675f0562d | `` |  |  |
| 140 | `paymentSchedules` | paymentSchedules | `` | e29a2ba5-22c3-4c52-9f66-4bf4ec198e13 | `` |  |  |
| 141 | `purInRecords` | purInRecords | `` | da282394-f665-4148-b271-97b57607779a | `` |  |  |
| 142 | `purinrecordExtend` | purinrecordExtend | `` | 08143aab-5b9b-43a1-8d30-17beaf0fd994 | `` |  |  |

---

## 关联属性（37 个）

> Composition = 级联管理 | Service = 外键引用 | None = 内联

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `vendorcontact` | vendorcontact | `aa.vendor.VendorContacts` | `vendorcontactid` | 外键 |  |  | Service |  |
| 2 | `paymentSchedules` | paymentSchedules | `st.purinrecord.PaymentSchedules` | `` | paymentSchedules -> mainid | 0..n | Y | None |  |
| 3 | `paymentExeDetail` | paymentExeDetail | `st.purinrecord.PaymentExeDetail` | `` | paymentExeDetail -> mainid | 0..n | Y | None |  |
| 4 | `invoiceVendor` | invoiceVendor | `aa.vendor.Vendor` | `invoice_vendor` | 外键 |  |  | Service |  |
| 5 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 6 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 7 | `bizFlow` | bizFlow | `bf.bizflow.BusinessFlow` | `bizFlowId` | 外键 |  |  | Service |  |
| 8 | `operator` | operator | `bd.staff.Staff` | `iOperatorId` | 外键 |  |  | Service |  |
| 9 | `defines` | defines | `st.purinrecord.PurInRecordDefine` | `` | defines -> id | 1 | Y | None | true |
| 10 | `writeOffReason` | writeOffReason | `aa.reason.Reason` | `write_off_reason` | 外键 |  |  | Service |  |
| 11 | `payor` | payor | `base.user.User` | `iPayor` | 外键 |  |  | Service |  |
| 12 | `natCurrency` | natCurrency | `bd.currencytenant.CurrencyTenantVO` | `iNatCurrencyID` | 外键 |  |  | Service |  |
| 13 | `inInvoiceOrg` | inInvoiceOrg | `aa.baseorg.FinanceOrgMV` | `in_invoice_org` | 外键 |  |  | Service |  |
| 14 | `vendor` | vendor | `aa.vendor.Vendor` | `iVendorId` | 外键 |  |  | Service |  |
| 15 | `currency` | currency | `bd.currencytenant.CurrencyTenantVO` | `iCurrencyID` | 外键 |  |  | Service |  |
| 16 | `department` | department | `aa.baseorg.DeptMV` | `department` | 外键 |  |  | Service |  |
| 17 | `purchaseOrg` | purchaseOrg | `aa.baseorg.PurchaseOrgMV` | `purchase_org` | 外键 |  |  | Service |  |
| 18 | `paymentagrement` | paymentagrement | `bd.payments.PayAgreement` | `iPaymentagrement` | 外键 |  |  | Service |  |
| 19 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |
| 20 | `purinrecordExtend` | purinrecordExtend | `st.purinrecord.PurinrecordExtend` | `` | purinrecordExtend -> id | 1 | Y | None |  |
| 21 | `voucherType` | voucher类型 | `bd.bill.BillTypeVO` | `voucher_type` | 外键 |  |  | Service |  |
| 22 | `org` | org | `aa.baseorg.InventoryOrgMV` | `iOrgid` | 外键 |  |  | Service |  |
| 23 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 24 | `purInRecords` | purInRecords | `st.purinrecord.PurInRecords` | `` | purInRecords -> mainid | 1..n | Y | None |  |
| 25 | `barcodeRecord` | barcodeRecord | `st.purinrecord.BarcodeRecord` | `` | barcodeRecord -> vouchId | 0..n | Y | None |  |
| 26 | `accountOrg` | accountOrg | `aa.baseorg.FinanceOrgMV` | `account_org` | 外键 |  |  | Service |  |
| 27 | `stockMgr` | stockMgr | `bd.staff.Staff` | `stock_mgr` | 外键 |  |  | Service |  |
| 28 | `headItem` | headItem | `st.purinrecord.PurInRecordCustomItem` | `` | headItem -> id | 1 | Y | None | true |
| 29 | `store` | store | `aa.store.Store` | `iStoreID` | 外键 |  |  | Service |  |
| 30 | `warehouse` | warehouse | `aa.warehouse.Warehouse` | `iWarehouseId` | 外键 |  |  | Service |  |
| 31 | `tradeRouteID` | tradeRouteID | `sccs.multitrade.TradeRoute` | `tradeRouteID` | 外键 |  |  | Service |  |
| 32 | `bustype` | bustype | `bd.bill.TransType` | `iBusType` | 外键 |  |  | Service |  |
| 33 | `auditorId` | 审批人ID | `base.user.User` | `auditorId` | 外键 |  |  | Service |  |
| 34 | `exchRateType` | exchRate类型 | `bd.exchangeRate.ExchangeRateTypeVO` | `iExchangeratetype` | 外键 |  |  | Service |  |
| 35 | `purInRecordDefineCharacter` | purInRecordDefineCharacter | `st.purinrecord.PurInRecordDefineCharacter` | `purInRecordDefineCharacter` | 外键 |  |  | None |  |
| 36 | `taxitems` | taxitems | `archive.taxArchives.TaxRateArchive` | `iTaxItems` | 外键 |  |  | Service |  |
| 37 | `inventoryowner` | inventoryowner | `st.inventoryowner.InventoryOwner` | `inventoryowner` | 外键 |  |  | None |  |

### 子实体（Composition）

- **paymentSchedules**: `paymentSchedules` -> `st.purinrecord.PaymentSchedules` (0..n)
- **paymentExeDetail**: `paymentExeDetail` -> `st.purinrecord.PaymentExeDetail` (0..n)
- **purinrecordExtend**: `purinrecordExtend` -> `st.purinrecord.PurinrecordExtend` (1)
- **purInRecords**: `purInRecords` -> `st.purinrecord.PurInRecords` (1..n)
- **barcodeRecord**: `barcodeRecord` -> `st.purinrecord.BarcodeRecord` (0..n)

### 外部引用（Service）

| 字段 | 目标实体 | 列 |
|------|---------|-----|
| `vendorcontact` (vendorcontact) | `aa.vendor.VendorContacts` | `vendorcontactid` |
| `invoiceVendor` (invoiceVendor) | `aa.vendor.Vendor` | `invoice_vendor` |
| `creatorId` (创建人ID) | `base.user.User` | `creatorId` |
| `modifierId` (修改人ID) | `base.user.User` | `modifierId` |
| `bizFlow` (bizFlow) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `operator` (operator) | `bd.staff.Staff` | `iOperatorId` |
| `writeOffReason` (writeOffReason) | `aa.reason.Reason` | `write_off_reason` |
| `payor` (payor) | `base.user.User` | `iPayor` |
| `natCurrency` (natCurrency) | `bd.currencytenant.CurrencyTenantVO` | `iNatCurrencyID` |
| `inInvoiceOrg` (inInvoiceOrg) | `aa.baseorg.FinanceOrgMV` | `in_invoice_org` |
| `vendor` (vendor) | `aa.vendor.Vendor` | `iVendorId` |
| `currency` (currency) | `bd.currencytenant.CurrencyTenantVO` | `iCurrencyID` |
| `department` (department) | `aa.baseorg.DeptMV` | `department` |
| `purchaseOrg` (purchaseOrg) | `aa.baseorg.PurchaseOrgMV` | `purchase_org` |
| `paymentagrement` (paymentagrement) | `bd.payments.PayAgreement` | `iPaymentagrement` |
| `tenant` (tenant) | `base.tenant.Tenant` | `tenant_id` |
| `voucherType` (voucher类型) | `bd.bill.BillTypeVO` | `voucher_type` |
| `org` (org) | `aa.baseorg.InventoryOrgMV` | `iOrgid` |
| `ytenant` (ytenant) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `accountOrg` (accountOrg) | `aa.baseorg.FinanceOrgMV` | `account_org` |
| `stockMgr` (stockMgr) | `bd.staff.Staff` | `stock_mgr` |
| `store` (store) | `aa.store.Store` | `iStoreID` |
| `warehouse` (warehouse) | `aa.warehouse.Warehouse` | `iWarehouseId` |
| `tradeRouteID` (tradeRouteID) | `sccs.multitrade.TradeRoute` | `tradeRouteID` |
| `bustype` (bustype) | `bd.bill.TransType` | `iBusType` |
| `auditorId` (审批人ID) | `base.user.User` | `auditorId` |
| `exchRateType` (exchRate类型) | `bd.exchangeRate.ExchangeRateTypeVO` | `iExchangeratetype` |
| `taxitems` (taxitems) | `archive.taxArchives.TaxRateArchive` | `iTaxItems` |

---

## SQL 示例

```sql
SELECT certificate_version, expenseNatMoney, expenseNatSum, expenseOriMoney, expenseOriSum, fiEventAccountingDate, fiEventAccountingDateAp, fiEventCode
FROM st_purinrecord
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py st.purinrecord.PurInRecord
```