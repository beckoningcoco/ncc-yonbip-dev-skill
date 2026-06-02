---
tags: [BIP, 元数据, 数据字典, 其他入库, ST, st.othinrecord.OthInRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 其他入库单主表 (`st.othinrecord.OthInRecord`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_othinrecord` | 应用: `ST`

## 属性（93 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `othInRecordDefineCharacter` | othInRecordDefineCharacter | `othInRecordDefineCharacter` | 1a1d1489-28e9-4145-b2dd-a2df3c7ff29f | `UserDefine` |
| 2 | `externalSystem` | externalSystem | `externalSystem` | String | `text` |
| 3 | `voucherType` | voucherType | `voucher_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 4 | `inventoryowner` | inventoryowner | `inventoryowner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e | `quote` |
| 5 | `lendCustom` | lendCustom | `lend_custom` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 6 | `lendDept` | lendDept | `lend_dept` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |
| 7 | `lendSupplier` | lendSupplier | `lend_supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 8 | `isAssets` | 是否Assets | `isAssets` | Boolean | `switch` |
| 9 | `manageInTransit` | manageInTransit | `manageintransit` | Integer | `int` |
| 10 | `vmiCustom` | vmiCustom | `vmi_custom` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 11 | `isUpdateStock` | 是否UpdateStock | `isUpdateStock` | Boolean | `switch` |
| 12 | `impactStockTiming` | impactStockTiming | `impact_stock_timing` | Integer | `int` |
| 13 | `alreadyUpdateStock` | alreadyUpdateStock | `already_update_stock` | Integer | `int` |
| 14 | `impactFinancialTiming` | impactFinancialTiming | `impact_financial_timing` | Integer | `int` |
| 15 | `alreadyUpdateFinancial` | alreadyUpdateFinancial | `already_update_financial` | Integer | `int` |
| 16 | `writeOffEnable` | writeOffEnable | `write_off_enable` | Short | `short` |
| 17 | `writeOffStatus` | writeOffStatus | `write_off_status` | Integer | `int` |
| 18 | `writeOffSourceid` | writeOffSourceid | `write_off_sourceid` | Long | `long` |
| 19 | `writeOffUpcode` | writeOffUpcode | `write_off_upcode` | String | `text` |
| 20 | `writeOffReason` | writeOffReason | `write_off_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 | `quote` |
| 21 | `expenseNatSum` | expenseNatSum | `expenseNatSum` | Decimal | `number` |
| 22 | `expenseNatMoney` | expenseNatMoney | `expenseNatMoney` | Decimal | `number` |
| 23 | `sourceDomain` | sourceDomain | `sourcedomain` | String | `text` |
| 24 | `noPostReasonMsg` | noPostReasonMsg | `noPostReasonMsg` | String | `text` |
| 25 | `fiEventDataId` | fiEventDataID | `fiEventDataId` | String | `text` |
| 26 | `fiEventId` | fiEventID | `fiEventId` | String | `text` |
| 27 | `fiEventCode` | fiEvent编码 | `fiEventCode` | String | `text` |
| 28 | `fiEventAccountingDate` | fiEventAccounting日期 | `fiEventAccountingDate` | String | `text` |
| 29 | `certificateVersion` | certificateVersion | `certificate_version` | Long | `long` |
| 30 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 31 | `out_sys_id` | out_sys_id | `out_sys_id` | String | `text` |
| 32 | `out_sys_code` | out_sys_code | `out_sys_code` | String | `text` |
| 33 | `out_sys_version` | out_sys_version | `out_sys_version` | String | `text` |
| 34 | `out_sys_type` | out_sys_type | `out_sys_type` | String | `text` |
| 35 | `wmsUnique` | wmsUnique | `wmsUnique` | String | `text` |
| 36 | `lendType` | lendType | `lend_type` | Short | `short` |
| 37 | `ownertype` | ownertype | `ownertype` | Integer | `int` |
| 38 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 39 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 40 | `id` | ID | `id` | Long | `long` |
| 41 | `org` | org | `iOrgid` | c1135e08-c4bf-4499-90bf-67030d1f2654 | `quote` |
| 42 | `accountOrg` | accountOrg | `account_org` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | `quote` |
| 43 | `code` | 编码 | `code` | String | `text` |
| 44 | `vouchdate` | 单据日期 | `vouchdate` | Date | `date` |
| 45 | `bustype` | bustype | `iBusType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 46 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 47 | `store` | store | `iStoreID` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 48 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 49 | `returncount` | returncount | `returncount` | Short | `short` |
| 50 | `shop` | shop | `iShopID` | Long | `long` |
| 51 | `warehouse` | warehouse | `iWarehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 52 | `department` | department | `department` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |
| 53 | `stockMgr` | stockMgr | `stock_mgr` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 54 | `operator` | operator | `iOperatorId` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 55 | `printCount` | printCount | `printCount` | Integer | `int` |
| 56 | `totalQuantity` | 总数量 | `fTotalQuantity` | Decimal | `number` |
| 57 | `totalPieces` | totalPieces | `total_pieces` | Decimal | `number` |
| 58 | `status` | 状态 | `status` | Short | `short` |
| 59 | `barCode` | bar编码 | `bar_code` | String | `text` |
| 60 | `memo` | 备注 | `cMemo` | String | `text` |
| 61 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 62 | `tplid` | tplid | `tplid` | Long | `long` |
| 63 | `creator` | 创建人 | `creator` | String | `text` |
| 64 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 65 | `createDate` | create日期 | `create_date` | Date | `date` |
| 66 | `modifier` | 修改人 | `modifier` | String | `text` |
| 67 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 68 | `modifyDate` | modify日期 | `modify_date` | Date | `date` |
| 69 | `auditor` | auditor | `auditor` | String | `text` |
| 70 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 71 | `auditDate` | audit日期 | `audit_date` | Date | `date` |
| 72 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 73 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 74 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 75 | `isUpdateCost` | 是否UpdateCost | `isUpdateCost` | Boolean | `switch` |
| 76 | `srcBillType` | srcBillType | `cSrcBillType` | String | `text` |
| 77 | `srcType` | srcType | `srcType` | Integer | `int` |
| 78 | `costStart` | costStart | `costStart` | Boolean | `switch` |
| 79 | `stockStart` | stockStart | `stockStart` | Boolean | `switch` |
| 80 | `isFlowCoreBill` | 是否FlowCoreBill | `isFlowCoreBill` | Boolean | `switch` |
| 81 | `bizFlow` | bizFlow | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |
| 82 | `wmsBillno` | wmsBillno | `wmsbillno` | String | `text` |
| 83 | `wmsInStatus` | wmsInStatus | `wmsinstatus` | Short | `short` |
| 84 | `wmsCancelStatus` | wmsCancelStatus | `wmscancelstatus` | Short | `short` |
| 85 | `postAccountStatus` | postAccountStatus | `postAccountStatus` | Short | `short` |
| 86 | `postAccountVersion` | postAccountVersion | `postAccountVersion` | Long | `long` |
| 87 | `lendUser` | lendUser | `lend_user` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 88 | `serviceNo` | serviceNo | `service_no` | String | `text` |
| 89 | `barcodeRecord` | barcodeRecord | `` | 853feac6-99f3-414f-85a3-6f75ebfad4fd | `` |
| 90 | `defines` | defines | `` | ad508bd8-7921-47e2-b6a5-81c050ecd4a8 | `` |
| 91 | `headItem` | headItem | `` | fb3f6570-a40e-4054-b500-3d4636b7cf07 | `` |
| 92 | `headParallel` | headParallel | `` | 1d573b16-9452-4236-a941-eae643b6e140 | `` |
| 93 | `othInRecords` | othInRecords | `` | 6bbb450a-8303-4528-978e-f552eda93a6f | `` |

## 关联（29 个）

- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `bizFlow` -> `bf.bizflow.BusinessFlow` () 
- `operator` -> `bd.staff.Staff` () 
- `defines` -> `st.othinrecord.OthInRecordDefine` (1) [废]
- `writeOffReason` -> `aa.reason.Reason` () 
- `vendor` -> `aa.vendor.Vendor` () 
- `department` -> `aa.baseorg.DeptMV` () 
- `tenant` -> `base.tenant.Tenant` () 
- `voucherType` -> `bd.bill.BillTypeVO` () 
- `org` -> `aa.baseorg.InventoryOrgMV` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `headParallel` -> `st.othinrecord.OthInRecordParallel` (1) 
- `lendCustom` -> `aa.merchant.Merchant` () 
- `lendUser` -> `bd.staff.Staff` () 
- `othInRecordDefineCharacter` -> `st.othinrecord.OthInRecordDefineCharacter` () 
- `barcodeRecord` -> `st.othinrecord.BarcodeRecord` (0..n) 
- `accountOrg` -> `aa.baseorg.FinanceOrgMV` () 
- `stockMgr` -> `bd.staff.Staff` () 
- `headItem` -> `st.othinrecord.OthInRecordCustomItem` (1) [废]
- `store` -> `aa.store.Store` () 
- `warehouse` -> `aa.warehouse.Warehouse` () 
- `bustype` -> `bd.bill.TransType` () 
- `auditorId` -> `base.user.User` () 
- `vmiCustom` -> `aa.merchant.Merchant` () 
- `lendSupplier` -> `aa.vendor.Vendor` () 
- `othInRecords` -> `st.othinrecord.OthInRecords` (1..n) 
- `inventoryowner` -> `st.inventoryowner.InventoryOwner` () 
- `lendDept` -> `aa.baseorg.DeptMV` () 
