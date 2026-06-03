---
tags: [BIP, metadata, st, StoreIn]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调拨入库单主表 (st.storein.StoreIn)

> Platform: BIP V5 | Module: st | Table: st_storein | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调拨入库单主表 |
| uri | st.storein.StoreIn |
| tableName | st_storein |
| domain | ustock |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (24)

| # | Name | URI |
|---|------|-----|
| 1 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 2 | 事项交换 (IMatterInfoAble) | st.matterinfo.IMatterInfoAble |
| 3 | 审批信息 (IApprovalInfo) | base.itf.IApprovalInfo |
| 4 | 商家相关 (IShop) | base.itf.IShop |
| 5 | 调拨信息 (ITransfer) | st.voucher.ITransfer |
| 6 | 表头整单件数合计信息 (IHeadTotalPiece) | st.voucher.IHeadTotalPiece |
| 7 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 8 | 库存接口_标识 (IInventorySign) | st.internaltransaction.IInventorySign |
| 9 | 内部交易交换信息接口 (IIntTradeinfo) | st.inttradeinfo.IIntTradeinfo |
| 10 | 业务流程信息接口 (IBizFlow) | st.transferapply.IBizFlow |
| 11 | 奇门相关字段 (QiMen) | voucher.st.QiMen |
| 12 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 13 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 14 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 15 | 过账信息 (IPostAccountInfo) | gscm.itf.IPostAccountInfo |
| 16 | 外部系统 (ExternalSystem) | st.externalsystem.ExternalSystem |
| 17 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 18 | 会计事务过账信息-存货 (FiEventAccInfo) | gscm.interf.FiEventAccInfo |
| 19 | 库存移动记录版本 (ICertificateVersion) | st.billstate.ICertificateVersion |
| 20 | 出入库类型 (IStockInOutType) | st.billstate.IStockInOutType |
| 21 | 财务过账相关信息记录 (FiInfoRecord) | gscm.interf.FiInfoRecord |
| 22 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 23 | 库存是否更新存量标识接口 (IStockUpdate) | st.stockupdate.IStockUpdate |
| 24 | 奇门多次回传 (QiMenMultiplePostback) | voucher.st.QiMenMultiplePostback |

---

## All Fields (95)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 2 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 3 | externalSystem | 外系统来源标识 | externalSystem | text | String |  |  | nullable |
| 4 | internalSign | 是否走内部交易的标识 | iInternalSign | switch | Boolean |  |  |  |
| 5 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 6 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 7 | postAccountStatus | 过账状态 | postAccountStatus | short | Short |  |  | nullable |
| 8 | consignmentCustomer | 寄售客户 | consignment_customer | quote | aa.merchant.Merchant |  |  | nullable |
| 9 | expenseNatSum | 费用本币含税金额 | expenseNatSum | number | Decimal |  |  | nullable |
| 10 | expenseNatMoney | 费用本币无税金额 | expenseNatMoney | number | Decimal |  |  | nullable |
| 11 | impactStockTiming | 更新存量时机 | impact_stock_timing | int | Integer |  |  | nullable |
| 12 | alreadyUpdateStock | 已更新存量 | already_update_stock | int | Integer |  |  | nullable |
| 13 | impactFinancialTiming | 传财务时机 | impact_financial_timing | int | Integer |  |  | nullable |
| 14 | alreadyUpdateFinancial | 已传财务 | already_update_financial | int | Integer |  |  | nullable |
| 15 | writeOffEnable | 启用冲销 | write_off_enable | short | Short |  |  | nullable |
| 16 | writeOffStatus | 冲销状态 | write_off_status | short | Short |  |  | nullable |
| 17 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 18 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 19 | writeOffReason | 冲销原因 | write_off_reason | quote | aa.reason.Reason |  |  | nullable |
| 20 | isCS | 是否寄售库存 | iscs | switch | Boolean |  |  | nullable |
| 21 | signForBilltype | 录入签收量单据 | sign_for_billtype | text | String |  |  | nullable |
| 22 | isFinish | 调入完成 | is_finish | switch | Boolean |  |  | nullable |
| 23 | noPostReasonMsg | 不过账原因信息 | noPostReasonMsg | text | String |  |  | nullable |
| 24 | fiEventDataId | 会计事务数据ID | fiEventDataId | text | String |  |  | nullable |
| 25 | fiEventId | 会计事务类型ID | fiEventId | text | String |  |  | nullable |
| 26 | fiEventCode | 会计事务类型编码 | fiEventCode | text | String |  |  | nullable |
| 27 | fiEventAccountingDate | 会计事务记账日期 | fiEventAccountingDate | text | String |  |  | nullable |
| 28 | certificateVersion | 库存移动记录版本 | certificate_version | long | Long |  |  | nullable |
| 29 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 30 | isUpdateStock | 是否更新存量 | isUpdateStock | switch | Boolean |  |  | nullable |
| 31 | postAccountVersion | 过账版本 | postAccountVersion | long | Long |  |  | nullable |
| 32 | storeInDefineCharacter | 自定义项特征组 | storeInDefineCharacter | UserDefine | st.storein.StoreInDefineCharacter |  |  | nullable |
| 33 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 34 | outorg | 调出组织 | ioutorgid | quote | aa.baseorg.InventoryOrgMV |  |  | nullable |
| 35 | outaccount | 调出会计主体id | ioutaccount | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 36 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 37 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 38 | bustype | 交易类型 | ibustypeid | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 39 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 40 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 41 | breturn | 调拨退货 | breturn | switch | Boolean |  |  | nullable |
| 42 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 43 | merchant | 商家 | imerchant | quote | aa.merchant.Merchant |  |  | nullable |
| 44 | shop | 商家id | iShopID | long | Long |  | Y | nullable,reportHide |
| 45 | store | 所属门店 | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 46 | outStore | 调出门店id | ioutstoreid | quote | aa.store.Store |  |  | nullable |
| 47 | outwarehouse | 调出仓库 | ioutwarehouseid | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 48 | outdepartment | 调出部门 | ioutdepartmentid | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 49 | outbizperson | 调出业务员 | ioutbizperson | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 50 | inorg | 调入组织 | iinorgid | quote | aa.baseorg.InventoryOrgMV |  |  | nullable,isMasterOrg |
| 51 | voucherType | 单据类型 | voucherType | quote | bd.bill.BillTypeVO |  |  | nullable |
| 52 | inaccount | 调入会计主体id | iinaccount | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 53 | inStore | 调入门店id | iinstoreid | quote | aa.store.Store |  |  | nullable |
| 54 | inwarehouse | 调入仓库 | iInWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 55 | indepartment | 调入部门 | iindepartmentid | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 56 | inbizperson | 调入业务员 | iinbizperson | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 57 | inStorekeeper | 调入库管员id | instorekeeperid | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 58 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 59 | bizType | 自动调拨 | bizType | short | Short |  |  | nullable |
| 60 | operator | 经办人id | ioperatorid | quote | bd.staff.Staff |  |  | nullable |
| 61 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 62 | memo | 备注 | cmemo | text | String |  |  | isBusinessLog,nullable |
| 63 | srcBill | 来源单据id | csrcbillid | text | String |  |  | nullable |
| 64 | srcBillNO | 来源单据号 | csrcbillno | text | String |  |  | bMakeBill,nullable |
| 65 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 66 | isBulkConver | 已散装转换 | isBulkConver | switch | Boolean |  |  | nullable |
| 67 | srcBillType | 来源单据类型 | csrcbilltype | text | String |  |  | nullable |
| 68 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 69 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 70 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 71 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 72 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 73 | auditor | 提交人 | auditor | text | String |  |  | isGlobalization,nullable |
| 74 | auditTime | 提交时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 75 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 76 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 77 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 78 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 79 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | nullable |
| 80 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | nullable |
| 81 | isUpdateCost | 更新存货成本 | isUpdateCost | switch | Boolean |  |  | nullable |
| 82 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 83 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 84 | wmsBillno | WMS单号 | wmsbillno | text | String |  |  | nullable |
| 85 | wmsInStatus | WMS转入状态 | wmsinstatus | short | Short |  |  | nullable |
| 86 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short | Short |  |  | nullable |
| 87 | stockInOutType | 出入库类型 | stock_in_out_type | int | Integer |  |  | nullable |
| 88 | barcodeRecord | 调入单扫描 | - | - | st.storein.BarcodeRecord |  |  |  |
| 89 | defines | 调拨出库主表自由自定义项 | - | - | st.storein.StoreInAttrextItem |  |  |  |
| 90 | details | 调拨入库单子表 | - | - | st.storein.StoreInDetail |  |  |  |
| 91 | docBusiType | 单据业务类型 | doc_busi_type | text | String |  |  | nullable |
| 92 | headItem | 调拨入库单主表自定义项 | - | - | st.storein.StoreInCustomItem |  |  |  |
| 93 | headParallel | 调拨入库单主表平行表 | - | - | st.storein.StoreInParallel |  |  |  |
| 94 | manageInTransit | 管理在途 | manageintransit | int | Integer |  |  | nullable |
| 95 | wmsUnique | wms回传唯一标识 | wmsUnique | text | String |  |  | nullable |

---

## Reference Fields (26)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditorId | 审批人 | auditorId | base.user.User |
| 2 | creatorId | 创建人 | creatorId | base.user.User |
| 3 | modifierId | 修改人 | modifierId | base.user.User |
| 4 | consignmentCustomer | 寄售客户 | consignment_customer | aa.merchant.Merchant |
| 5 | writeOffReason | 冲销原因 | write_off_reason | aa.reason.Reason |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 7 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 8 | outorg | 调出组织 | ioutorgid | aa.baseorg.InventoryOrgMV |
| 9 | outaccount | 调出会计主体id | ioutaccount | aa.baseorg.FinanceOrgMV |
| 10 | bustype | 交易类型 | ibustypeid | bd.bill.TransType |
| 11 | merchant | 商家 | imerchant | aa.merchant.Merchant |
| 12 | store | 所属门店 | iStoreID | aa.store.Store |
| 13 | outStore | 调出门店id | ioutstoreid | aa.store.Store |
| 14 | outwarehouse | 调出仓库 | ioutwarehouseid | aa.warehouse.Warehouse |
| 15 | outdepartment | 调出部门 | ioutdepartmentid | aa.baseorg.DeptMV |
| 16 | outbizperson | 调出业务员 | ioutbizperson | bd.staff.Staff |
| 17 | inorg | 调入组织 | iinorgid | aa.baseorg.InventoryOrgMV |
| 18 | voucherType | 单据类型 | voucherType | bd.bill.BillTypeVO |
| 19 | inaccount | 调入会计主体id | iinaccount | aa.baseorg.FinanceOrgMV |
| 20 | inStore | 调入门店id | iinstoreid | aa.store.Store |
| 21 | inwarehouse | 调入仓库 | iInWarehouseId | aa.warehouse.Warehouse |
| 22 | indepartment | 调入部门 | iindepartmentid | aa.baseorg.DeptMV |
| 23 | inbizperson | 调入业务员 | iinbizperson | bd.staff.Staff |
| 24 | inStorekeeper | 调入库管员id | instorekeeperid | bd.staff.Staff |
| 25 | operator | 经办人id | ioperatorid | bd.staff.Staff |
| 26 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |

---

## Number Fields (20)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | postAccountStatus | 过账状态 | postAccountStatus | short |
| 2 | expenseNatSum | 费用本币含税金额 | expenseNatSum | number |
| 3 | expenseNatMoney | 费用本币无税金额 | expenseNatMoney | number |
| 4 | impactStockTiming | 更新存量时机 | impact_stock_timing | int |
| 5 | alreadyUpdateStock | 已更新存量 | already_update_stock | int |
| 6 | impactFinancialTiming | 传财务时机 | impact_financial_timing | int |
| 7 | alreadyUpdateFinancial | 已传财务 | already_update_financial | int |
| 8 | writeOffEnable | 启用冲销 | write_off_enable | short |
| 9 | writeOffStatus | 冲销状态 | write_off_status | short |
| 10 | verifystate | 审批状态 | verifystate | short |
| 11 | returncount | 退回次数 | returncount | short |
| 12 | status | 单据状态 | status | short |
| 13 | bizType | 自动调拨 | bizType | short |
| 14 | printCount | 打印次数 | printCount | int |
| 15 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 16 | totalPieces | 整单件数 | total_pieces | number |
| 17 | wmsInStatus | WMS转入状态 | wmsinstatus | short |
| 18 | wmsCancelStatus | WMS取消状态 | wmscancelstatus | short |
| 19 | stockInOutType | 出入库类型 | stock_in_out_type | int |
| 20 | manageInTransit | 管理在途 | manageintransit | int |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | modifyDate | 修改日期 | modify_date | date |
| 2 | vouchdate | 单据日期 | vouchdate | date |
| 3 | createDate | 创建日期 | create_date | date |
| 4 | auditDate | 审批日期 | audit_date | date |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | headParallel | 调拨入库单主表平行表 | st.storein.StoreInParallel |
| 2 | barcodeRecord | 调入单扫描 | st.storein.BarcodeRecord |
| 3 | details | 调拨入库单子表 | st.storein.StoreInDetail |
| 4 | headItem | 调拨入库单主表自定义项 | st.storein.StoreInCustomItem |
| 5 | defines | 调拨出库主表自由自定义项 | st.storein.StoreInAttrextItem |
