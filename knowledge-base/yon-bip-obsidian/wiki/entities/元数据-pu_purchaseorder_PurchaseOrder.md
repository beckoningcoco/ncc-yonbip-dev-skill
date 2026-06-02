---
tags: [BIP, 元数据, 数据字典, pu.purchaseorder.PurchaseOrder]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 采购订单主表 (`pu.purchaseorder.PurchaseOrder`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_purchaseorder` | 应用: `PU`

## 属性（172 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `def1` | def1 | `string_0` | String | `text` |
| 2 | `bustype_code` | bustype_code | `bustype_code` | String | `text` |
| 3 | `isFeedback` | 是否Feedback | `isFeedback` | Boolean | `switch` |
| 4 | `sendERPStatus` | sendERPStatus | `senderp_status` | Short | `short` |
| 5 | `sendFailCause` | sendFailCause | `cause_sendfail` | String | `text` |
| 6 | `purchaseOrderDefineCharacter` | purchaseOrderDefineCharacter | `purchaseOrderDefineCharacter` | 0cd82149-36ec-4ca8-b329-70f0a2174b2a | `UserDefine` |
| 7 | `exchRateDate` | exchRate日期 | `exchRateDate` | Date | `date` |
| 8 | `contactAddress` | contactAddress | `cContactAddress` | String | `text` |
| 9 | `despatchMode` | despatchMode | `despatchMode` | aa2f6845-347d-499f-a5b2-964b84747d99 | `quote` |
| 10 | `oriTax` | oriTax | `oriTax` | Decimal | `number` |
| 11 | `natSum` | natSum | `natSum` | Decimal | `number` |
| 12 | `allTotalInvoiceMoney` | allTotalInvoiceMoney | `fAllTotalInvoiceMoney` | Decimal | `number` |
| 13 | `withdrawpp` | withdrawpp | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 14 | `allTotalArrivedTaxMoney` | allTotalArrivedTaxMoney | `fAllTotalArrivedTaxMoney` | Decimal | `number` |
| 15 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 16 | `tradeRouteLineno` | tradeRouteLineno | `tradeRouteLineno` | Decimal | `number` |
| 17 | `beyondBudget` | beyondBudget | `beyondBudget` | Integer | `int` |
| 18 | `headDiscountRate` | headDiscountRate | `headDiscountRate` | Decimal | `number` |
| 19 | `headDiscountMoney` | headDiscountMoney | `headDiscountMoney` | Decimal | `number` |
| 20 | `headOriSumOriginal` | headOriSumOriginal | `headOriSumOriginal` | Decimal | `number` |
| 21 | `isUserUpLoadFile` | 是否UserUpLoadFile | `is_user_upload_file` | String | `text` |
| 22 | `noControl` | noControl | `no_control` | Short | `short` |
| 23 | `ctTplId` | ctTplID | `contract_template_id` | String | `text` |
| 24 | `ctTplName` | ctTpl名称 | `contract_template_name` | String | `text` |
| 25 | `ctTplCode` | ctTpl编码 | `contract_template_code` | String | `text` |
| 26 | `ctTplVersion` | ctTplVersion | `contract_template_version` | String | `text` |
| 27 | `waitingSignFileId` | waitingSignFileID | `waiting_sign_file_id` | String | `attachment` |
| 28 | `signStatus` | signStatus | `contract_sign_status` | Short | `short` |
| 29 | `completedSignFileId` | completedSignFileID | `completed_sign_file_id` | String | `attachment` |
| 30 | `ctsignProcessId` | ctsignProcessID | `contract_sign_process_id` | String | `text` |
| 31 | `tradeThrowVersion` | tradeThrowVersion | `trade_throw_version` | Short | `short` |
| 32 | `throwStatus` | throwStatus | `throw_status` | Integer | `int` |
| 33 | `exchRateOps` | exchRateOps | `exchRateOps` | ExchangeRateMethod | `` |
| 34 | `isEndTrade` | 是否EndTrade | `isEndTrade` | Short | `short` |
| 35 | `tradeRouteID` | tradeRouteID | `tradeRouteID` | c69f1d6a-783c-4f79-b446-b4da14cb7fff | `quote` |
| 36 | `out_sys_code` | out_sys_code | `out_sys_code` | String | `text` |
| 37 | `out_sys_id` | out_sys_id | `out_sys_id` | String | `text` |
| 38 | `out_sys_version` | out_sys_version | `out_sys_version` | String | `text` |
| 39 | `isExeDetailedReconciliation` | 是否ExeDetailedReconciliation | `isExeDetailedReconciliation` | Boolean | `switch` |
| 40 | `out_sys_type` | out_sys_type | `out_sys_type` | String | `text` |
| 41 | `totalPayMoney` | totalPayMoney | `fTotalPayMoney` | Decimal | `number` |
| 42 | `oriSum` | oriSum | `oriSum` | Decimal | `number` |
| 43 | `taxSettingType` | taxSettingType | `taxSettingType` | TaxSettingTypeEnum | `` |
| 44 | `stampattachment` | stampattachment | `stampattachment` | String | `text` |
| 45 | `natMoney` | natMoney | `natMoney` | Decimal | `number` |
| 46 | `closeReason` | closeReason | `close_reason` | String | `text` |
| 47 | `bankAccount` | bankAccount | `bankAccount` | String | `text` |
| 48 | `bankId` | bankID | `bankId` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 49 | `syncattachment` | syncattachment | `syncattachment` | String | `text` |
| 50 | `closeIsCollaboration` | closeIsCollaboration | `close_is_collaboration` | Boolean | `switch` |
| 51 | `oriMoney` | oriMoney | `oriMoney` | Decimal | `number` |
| 52 | `paymentProcess` | paymentProcess | `paymentProcess` | Short | `short` |
| 53 | `supplierattachment` | supplierattachment | `supplierattachment` | String | `text` |
| 54 | `submitter` | submitter | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 55 | `bankName` | bank名称 | `bankName` | String | `text` |
| 56 | `totalPayNATMoney` | totalPayNATMoney | `fTotalPayNATMoney` | Decimal | `number` |
| 57 | `withdrawTime` | withdrawTime | `withdraw_time` | DateTime | `dateTime` |
| 58 | `allTotalInTaxMoney` | allTotalInTaxMoney | `fAllTotalInTaxMoney` | Decimal | `number` |
| 59 | `refuseReason` | refuseReason | `refuse_reason` | String | `text` |
| 60 | `inventoryowner` | inventoryowner | `inventoryowner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e | `quote` |
| 61 | `isDespatch` | 是否Despatch | `isDespatch` | Boolean | `switch` |
| 62 | `natTaxUnitPrice` | natTaxUnitPrice | `natTaxUnitPrice` | Decimal | `number` |
| 63 | `natUnitPrice` | natUnitPrice | `natUnitPrice` | Decimal | `number` |
| 64 | `oriTaxUnitPrice` | oriTaxUnitPrice | `oriTaxUnitPrice` | Decimal | `number` |
| 65 | `oriUnitPrice` | oriUnitPrice | `oriUnitPrice` | Decimal | `number` |
| 66 | `receAreaId` | receAreaID | `receAreaId` | 373171f0-f497-4bab-bda7-ff4b6489c13e | `quote` |
| 67 | `store` | store | `store` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 68 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 69 | `wbTime` | wbTime | `wbTime` | String | `text` |
| 70 | `org` | org | `iOrgid` | 528ae807-a9d3-4f2a-9ee7-1db3e5eddc01 | `quote` |
| 71 | `vendorcontact` | vendorcontact | `vendorcontactid` | b94fa77c-2f2b-464c-96fb-d028543825ee | `quote` |
| 72 | `id` | ID | `id` | Long | `long` |
| 73 | `paymentagrement` | paymentagrement | `iPaymentagrement` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |
| 74 | `generalPurchaseOrderType` | generalPurchaseOrderType | `iGeneralPurchaseOrderType` | String | `text` |
| 75 | `bustype` | bustype | `iBusType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 76 | `taxitems` | taxitems | `iTaxItems` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 77 | `code` | 编码 | `code` | String | `text` |
| 78 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 79 | `expectDate` | expect日期 | `expectDate` | Date | `date` |
| 80 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 81 | `settlemethod` | settlemethod | `iSettleMethodId` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 82 | `retailAgentName` | retailAgent名称 | `iRetailAgentName` | String | `text` |
| 83 | `contact` | contact | `cContact` | String | `text` |
| 84 | `paymentIsContract` | paymentIsContract | `paymentIsContract` | String | `text` |
| 85 | `contactAddressID` | contactAddressID | `contactAddressID` | 454acb9a-6245-41e4-bddc-7fc0b8f793ca | `quote` |
| 86 | `contactTel` | contactTel | `cContactTel` | String | `text` |
| 87 | `socialStatus` | socialStatus | `socialStatus` | String | `text` |
| 88 | `isContract` | 是否Contract | `is_contract` | Boolean | `switch` |
| 89 | `isAllowAdjustPrice` | 是否AllowAdjustPrice | `isAllowAdjustPrice` | String | `text` |
| 90 | `otherOrderCode` | otherOrder编码 | `cOtherOrderCode` | String | `text` |
| 91 | `delivery_method` | delivery_method | `delivery_method` | 19cfc516-55f8-446a-9c3e-1ca20d8bd941 | `quote` |
| 92 | `inInvoiceOrg` | inInvoiceOrg | `iInInvoiceOrg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 93 | `outSourceOrg` | outSourceOrg | `outSourceOrg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 94 | `department` | department | `iDepartment` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 95 | `invoiceVendor` | invoiceVendor | `iInvoiceVendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 96 | `dealPhone` | dealPhone | `deal_phone` | String | `text` |
| 97 | `currency` | currency | `iCurrencyID` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 98 | `dealTime` | dealTime | `deal_time` | DateTime | `timestamp` |
| 99 | `dealPersonId` | dealPersonID | `dealPersonId` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 100 | `dealDate` | deal日期 | `deal_Date` | Date | `date` |
| 101 | `natCurrency` | natCurrency | `iNatCurrencyID` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 102 | `exchRateType` | exchRateType | `iExchRateType` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 103 | `exchRate` | exchRate | `exchRate` | Decimal | `number` |
| 104 | `taxRate` | taxRate | `fTaxRate` | Decimal | `number` |
| 105 | `payAgreement` | payAgreement | `iPayAgreement` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |
| 106 | `accountDate` | account日期 | `accountDate` | Date | `date` |
| 107 | `maturityDate` | maturity日期 | `maturityDate` | Date | `date` |
| 108 | `accountDays` | accountDays | `accountDays` | Integer | `int` |
| 109 | `modifyStatus` | modifyStatus | `modifyStatus` | PurchaseModifyStatus | `` |
| 110 | `bizstatus` | bizstatus | `bizstatus` | PurchaseStatus | `` |
| 111 | `status` | 状态 | `status` | Short | `short` |
| 112 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 113 | `isMaxLimitPrice` | 是否MaxLimitPrice | `isMaxLimitPrice` | Boolean | `switch` |
| 114 | `isVMI` | 是否VMI | `isVMI` | Boolean | `switch` |
| 115 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 116 | `memo` | 备注 | `cMemo` | String | `text` |
| 117 | `barCode` | bar编码 | `bar_code` | String | `text` |
| 118 | `oadayConfirmType` | oadayConfirmType | `oadayConfirmType` | Short | `short` |
| 119 | `printCount` | printCount | `printCount` | Integer | `int` |
| 120 | `expiredayConfirmType` | expiredayConfirmType | `expiredayConfirmType` | Short | `short` |
| 121 | `returncount` | returncount | `returncount` | Short | `short` |
| 122 | `totalQuantity` | totalQuantity | `fTotalQuantity` | Decimal | `number` |
| 123 | `expenseOriSum` | expenseOriSum | `expenseOriSum` | Decimal | `number` |
| 124 | `natTax` | natTax | `natTax` | Decimal | `number` |
| 125 | `approvenum` | approvenum | `approvenum` | Decimal | `number` |
| 126 | `phasedInvoice` | phasedInvoice | `phasedInvoice` | Boolean | `switch` |
| 127 | `storagenum` | storagenum | `storagenum` | Decimal | `number` |
| 128 | `closenum` | closenum | `closenum` | Decimal | `number` |
| 129 | `moneysum` | moneysum | `fMoneySum` | Decimal | `number` |
| 130 | `sourceTenant` | sourceTenant | `sourceTenant` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 131 | `custom` | custom | `iCustomId` | Long | `long` |
| 132 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 133 | `tplid` | tplid | `tplid` | Long | `long` |
| 134 | `operator` | operator | `iOperatorId` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 135 | `creator` | 创建人 | `creator` | String | `text` |
| 136 | `locker` | locker | `locker` | String | `text` |
| 137 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 138 | `lockTime` | lockTime | `lock_time` | DateTime | `timestamp` |
| 139 | `createDate` | create日期 | `create_date` | Date | `date` |
| 140 | `lockDate` | lock日期 | `lock_Date` | Date | `date` |
| 141 | `modifier` | 修改人 | `modifier` | String | `text` |
| 142 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 143 | `modifyDate` | modify日期 | `modify_date` | Date | `date` |
| 144 | `closeDate` | close日期 | `close_Date` | Date | `date` |
| 145 | `auditor` | auditor | `auditor` | String | `text` |
| 146 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 147 | `auditDate` | audit日期 | `audit_date` | Date | `date` |
| 148 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 149 | `lockerId` | lockerID | `lockerId` | String | `text` |
| 150 | `closer` | closer | `closer` | String | `text` |
| 151 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 152 | `closeTime` | closeTime | `close_time` | DateTime | `timestamp` |
| 153 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 154 | `closerId` | closerID | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 155 | `srcBill` | srcBill | `iSrcBillID` | Long | `long` |
| 156 | `srcBillNO` | srcBillNO | `cSrcBillNO` | String | `text` |
| 157 | `source` | source | `cSource` | String | `text` |
| 158 | `directShipment` | directShipment | `iDirectShipment` | String | `text` |
| 159 | `bEffectStock` | bEffectStock | `bEffectStock` | Boolean | `switch` |
| 160 | `bizFlow` | bizFlow | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |
| 161 | `isFlowCoreBill` | 是否FlowCoreBill | `isFlowCoreBill` | Boolean | `switch` |
| 162 | `lowCodeFlowId` | lowCodeFlowID | `lowCodeFlowId` | String | `text` |
| 163 | `submitTime` | submitTime | `submit_time` | DateTime | `dateTime` |
| 164 | `headFreeItem` | headFreeItem | `` | 053c5b95-c8a5-48e1-a212-7dfe0b161e79 | `` |
| 165 | `headItem` | headItem | `` | aa70d47d-cda4-4098-8bc9-80a9ac1259dc | `` |
| 166 | `headParallel` | headParallel | `` | 1876af69-c5f4-4cac-85c8-f7ba729ae66d | `` |
| 167 | `logistics` | logistics | `` | 7e3b73ea-5792-4c72-8a37-8b99afbec60e | `` |
| 168 | `offsetPreInvoice` | offsetPreInvoice | `offset_pre_invoice` | Integer | `int` |
| 169 | `paymentExeDetail` | paymentExeDetail | `` | 91c78cf6-0876-4fbb-8376-291fdaa7608d | `` |
| 170 | `paymentSchedules` | paymentSchedules | `` | dc8eacac-306c-4460-bc12-ad63290275fd | `` |
| 171 | `purchaseOrders` | purchaseOrders | `` | 68e65921-f77c-4794-a820-768e10ec6d28 | `` |
| 172 | `signSubjects` | signSubjects | `` | 9d678019-1660-4896-b361-2b4460407041 | `` |

## 关联（44 个）

- `vendorcontact` -> `aa.vendor.VendorContacts` () 
- `submitter` -> `base.user.BipUser` () 
- `receAreaId` -> `base.shipregion.ShipRegion` () 
- `paymentSchedules` -> `pu.purchaseorder.PaymentSchedules` (0..n) 
- `paymentExeDetail` -> `pu.purchaseorder.PaymentExeDetail` (0..n) 
- `invoiceVendor` -> `aa.vendor.Vendor` () 
- `headFreeItem` -> `pu.purchaseorder.PurchaseOrderFreeItem` (1) [废]
- `settlemethod` -> `aa.settlemethod.SettleMethod` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `bizFlow` -> `bf.bizflow.BusinessFlow` () 
- `logistics` -> `pu.purchaseorder.Logistics` (0..n) 
- `dealPersonId` -> `bd.staff.Staff` () 
- `operator` -> `bd.staff.Staff` () 
- `outSourceOrg` -> `aa.baseorg.OrgMV` () 
- `natCurrency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `inInvoiceOrg` -> `aa.baseorg.OrgMV` () 
- `withdrawpp` -> `base.user.BipUser` () 
- `vendor` -> `aa.vendor.Vendor` () 
- `closerId` -> `base.user.User` () 
- `delivery_method` -> `usp.deliverymethod.Deliverymethod` () 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `department` -> `bd.adminOrg.AdminOrgVO` () 
- `contactAddressID` -> `aa.vendor.VendorAddress` () 
- `paymentagrement` -> `bd.payments.PayAgreement` () 
- `tenant` -> `base.tenant.Tenant` () 
- `sourceTenant` -> `base.tenant.Tenant` () 
- `org` -> `aa.baseorg.PurchaseOrgMV` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `headParallel` -> `pu.purchaseorder.PurchaseOrderParallel` (1) 
- `headItem` -> `pu.purchaseorder.PurchaseOrderCustomItem` (1) [废]
- `store` -> `aa.store.Store` () 
- `tradeRouteID` -> `sccs.multitrade.TradeRoute` () 
- `signSubjects` -> `pu.purchaseorder.SignSubject` (0..n) 
- `bustype` -> `bd.bill.TransType` () 
- `bankId` -> `aa.vendor.VendorBank` () 
- `payAgreement` -> `bd.payments.PayAgreement` () 
- `auditorId` -> `base.user.User` () 
- `exchRateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () 
- `despatchMode` -> `aa.sendtrans.SendTransWay` () 
- `purchaseOrderDefineCharacter` -> `pu.purchaseorder.NPurchaseOrderDefineCharacter` () 
- `taxitems` -> `archive.taxArchives.TaxRateArchive` () 
- `purchaseOrders` -> `pu.purchaseorder.PurchaseOrders` (1..n) 
- `inventoryowner` -> `st.inventoryowner.InventoryOwner` () 
