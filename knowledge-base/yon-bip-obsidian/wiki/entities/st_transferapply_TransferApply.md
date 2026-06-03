---
tags: [BIP, metadata, st, TransferApply]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调拨订单主表 (st.transferapply.TransferApply)

> Platform: BIP V5 | Module: st | Table: st_transferapply | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调拨订单主表 |
| uri | st.transferapply.TransferApply |
| tableName | st_transferapply |
| domain | ustock |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (19)

| # | Name | URI |
|---|------|-----|
| 1 | 汇率信息 (IExchangeRate) | voucher.base.IExchangeRate |
| 2 | 关闭信息 (IClosing) | base.itf.IClosing |
| 3 | 商家相关 (IShop) | base.itf.IShop |
| 4 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 5 | 表头整单件数合计信息 (IHeadTotalPiece) | st.voucher.IHeadTotalPiece |
| 6 | 收货人信息 (IReceiver) | st.voucher.IReceiver |
| 7 | 审批信息 (IApprovalInfo) | base.itf.IApprovalInfo |
| 8 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 9 | 门店 (IRetailStore) | retail.voucher.IRetailStore |
| 10 | 调拨信息 (ITransfer) | st.voucher.ITransfer |
| 11 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 12 | 业务流程信息接口 (IBizFlow) | st.transferapply.IBizFlow |
| 13 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 14 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 15 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 16 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 17 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 18 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 19 | 外部来源线索 (IOutSysObjClue) | base.itf.IOutSysObjClue |

---

## All Fields (93)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 2 | closeDate | 关闭日期 | close_Date | date | Date |  |  | nullable |
| 3 | closerId | 关闭人 | closerId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 4 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 5 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 6 | shop | 商家 | iShopID | long | Long |  | Y | nullable,reportHide |
| 7 | store | 门店ID | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 8 | taxRate | 税率 | taxRate | number | Decimal |  |  | nullable |
| 9 | masterOrgSetting | 主组织设置 | master_org_setting | text | String |  |  | nullable |
| 10 | exchRateOps | 汇率折算方式 | exchRateOps | - | unitfyEnum.GZTBDM.ExchangeRateMethod |  |  | nullable |
| 11 | taxitems | 税目 | iTaxItems | quote | archive.taxArchives.TaxRateArchive |  |  | nullable |
| 12 | transferType | 调拨类型 | transferType | int | Integer |  |  | nullable |
| 13 | consignmentCustomer | 寄售客户 | consignment_customer | quote | aa.merchant.Merchant |  |  | nullable |
| 14 | isCS | 是否寄售库存 | iscs | switch | Boolean |  |  | nullable |
| 15 | signForBilltype | 录入签收量单据 | sign_for_billtype | text | String |  |  | nullable |
| 16 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 17 | out_sys_id | 外部来源线索 | out_sys_id | text | String |  |  | nullable |
| 18 | out_sys_code | 外部来源编码 | out_sys_code | text | String |  |  | nullable |
| 19 | out_sys_version | 外部来源版本 | out_sys_version | text | String |  |  | nullable |
| 20 | out_sys_type | 外部来源类型 | out_sys_type | text | String |  |  | nullable |
| 21 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 22 | transferApplyDefineCharacter | 自定义项特征组 | transferApplyDefineCharacter | UserDefine | st.transferapply.TransferApplyDefineCharacter |  |  | nullable |
| 23 | outorg | 调出组织 | ioutorgid | quote | aa.baseorg.InventoryOrgMV |  |  | nullable,isMasterOrg |
| 24 | outaccount | 调出会计主体id | ioutaccount | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 25 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 26 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 27 | bustype | 交易类型 | iBusType | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 28 | breturn | 调拨退货 | breturn | switch | Boolean |  |  | nullable |
| 29 | merchant | 商家id | imerchant | quote | aa.merchant.Merchant |  |  | nullable |
| 30 | outstore | 调出门店id | iOutStoreId | quote | aa.store.Store |  | Y | nullable |
| 31 | instore | 调入门店id | iInStoreId | quote | aa.store.Store |  | Y | nullable |
| 32 | outwarehouse | 调出仓库 | ioutwarehouseid | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 33 | inorg | 调入组织 | iinorgid | quote | aa.baseorg.InventoryOrgMV |  |  | nullable |
| 34 | inaccount | 调入会计主体id | iinaccount | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 35 | inwarehouse | 调入仓库 | iInWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 36 | bizType | 自动调拨 | bizType | short | Short |  |  | nullable |
| 37 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 38 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 39 | bizstatus | 单据状态 | bizstatus | text | String |  |  | nullable |
| 40 | outdepartment | 调出部门 | ioutdepartmentid | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 41 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 42 | outbizperson | 调出业务员 | ioutbizperson | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 43 | indepartment | 调入部门 | iindepartmentid | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 44 | inbizperson | 调入业务员 | iinbizperson | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 45 | operator | 经办人id | iOperatorId | quote | bd.staff.Staff |  |  | nullable |
| 46 | settlementAccount | 结算主体id | settlement_account | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 47 | inttraderule | 内部交易规则id | inttraderuleId | text | String |  |  | nullable |
| 48 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 49 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 50 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 51 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | nullable |
| 52 | cust | 客户id | iCustId | quote | aa.merchant.Merchant |  |  | nullable |
| 53 | vendor | 供应商id | iVendorId | quote | aa.vendor.Vendor |  |  | nullable |
| 54 | currency | 原币id | iCurrencyID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 55 | natCurrency | 本币id | iNatCurrencyID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 56 | exchRate | 汇率 | exchRate | number | Decimal |  |  | nullable |
| 57 | srcBillType | 来源类型 | cSrcBillype | text | String |  |  | bMakeBill,nullable |
| 58 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | nullable |
| 59 | dplanshipmentdate | 计划发货日期 | dPlanShipmentDate | date | Date |  |  | nullable |
| 60 | dplanarrivaldate | 计划到货日期 | dPlanArrivalDate | date | Date |  |  | nullable |
| 61 | receiver | 收货人 | cReceiver | text | String |  |  | nullable |
| 62 | receivemobile | 收货人电话 | cReceiveMobile | text | String |  |  | nullable |
| 63 | receiveaddr | 收货人地址 | cReceiveAddr | text | String |  |  | nullable |
| 64 | receivezipcode | 邮编 | cReceiveZipCode | text | String |  |  | nullable |
| 65 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 66 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 67 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 68 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 69 | memo | 备注 | cMemo | text | String |  |  | isBusinessLog,nullable |
| 70 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 71 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 72 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 73 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 74 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 75 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 76 | auditor | 审批人 | auditor | text | String |  |  | isGlobalization,nullable |
| 77 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 78 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 79 | closer | 关闭人 | closer | text | String |  |  | isGlobalization,nullable,reportHide |
| 80 | closeTime | 关闭时间 | close_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 81 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 82 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 83 | isNeedSign | 需要签收 | isNeedSign | switch | Boolean |  |  | nullable |
| 84 | inTransit | 在途归属 | inTransit | text | String |  |  | nullable |
| 85 | isContract | 是否与委外商协同 | isContract | switch | Boolean |  |  | nullable |
| 86 | subcontractor | 委外商id | subcontractor | quote | aa.vendor.Vendor |  |  | nullable |
| 87 | contractStatus | 与委外商协同状态 | contractStatus | text | String |  |  | nullable |
| 88 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 89 | defines | 调拨出库主表自由自定义项 | - | - | st.transferapply.TransferApplyAttrextItem |  |  |  |
| 90 | headItem | 调拨订单主表自定义项 | - | - | st.transferapply.TransferApplyCustomItem |  |  |  |
| 91 | isUpdateStock | 影响可用量 | isUpdateStock | switch | Boolean |  |  | nullable |
| 92 | manageInTransit | 管理在途 | manageintransit | int | Integer |  |  | nullable |
| 93 | transferApplys | 调拨订单子表 | - | - | st.transferapply.TransferApplys |  |  |  |

---

## Reference Fields (32)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditorId | 审批人 | auditorId | base.user.User |
| 2 | closerId | 关闭人 | closerId | base.user.User |
| 3 | creatorId | 创建人 | creatorId | base.user.User |
| 4 | modifierId | 修改人 | modifierId | base.user.User |
| 5 | store | 门店ID | iStoreID | aa.store.Store |
| 6 | taxitems | 税目 | iTaxItems | archive.taxArchives.TaxRateArchive |
| 7 | consignmentCustomer | 寄售客户 | consignment_customer | aa.merchant.Merchant |
| 8 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 9 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 10 | outorg | 调出组织 | ioutorgid | aa.baseorg.InventoryOrgMV |
| 11 | outaccount | 调出会计主体id | ioutaccount | aa.baseorg.FinanceOrgMV |
| 12 | bustype | 交易类型 | iBusType | bd.bill.TransType |
| 13 | merchant | 商家id | imerchant | aa.merchant.Merchant |
| 14 | outstore | 调出门店id | iOutStoreId | aa.store.Store |
| 15 | instore | 调入门店id | iInStoreId | aa.store.Store |
| 16 | outwarehouse | 调出仓库 | ioutwarehouseid | aa.warehouse.Warehouse |
| 17 | inorg | 调入组织 | iinorgid | aa.baseorg.InventoryOrgMV |
| 18 | inaccount | 调入会计主体id | iinaccount | aa.baseorg.FinanceOrgMV |
| 19 | inwarehouse | 调入仓库 | iInWarehouseId | aa.warehouse.Warehouse |
| 20 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |
| 21 | outdepartment | 调出部门 | ioutdepartmentid | aa.baseorg.DeptMV |
| 22 | outbizperson | 调出业务员 | ioutbizperson | bd.staff.Staff |
| 23 | indepartment | 调入部门 | iindepartmentid | aa.baseorg.DeptMV |
| 24 | inbizperson | 调入业务员 | iinbizperson | bd.staff.Staff |
| 25 | operator | 经办人id | iOperatorId | bd.staff.Staff |
| 26 | settlementAccount | 结算主体id | settlement_account | aa.baseorg.FinanceOrgMV |
| 27 | cust | 客户id | iCustId | aa.merchant.Merchant |
| 28 | vendor | 供应商id | iVendorId | aa.vendor.Vendor |
| 29 | currency | 原币id | iCurrencyID | bd.currencytenant.CurrencyTenantVO |
| 30 | natCurrency | 本币id | iNatCurrencyID | bd.currencytenant.CurrencyTenantVO |
| 31 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 32 | subcontractor | 委外商id | subcontractor | aa.vendor.Vendor |

---

## Number Fields (12)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | taxRate | 税率 | taxRate | number |
| 2 | transferType | 调拨类型 | transferType | int |
| 3 | bizType | 自动调拨 | bizType | short |
| 4 | status | 单据状态 | status | short |
| 5 | ownertype | 货权归属 | ownertype | int |
| 6 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 7 | exchRate | 汇率 | exchRate | number |
| 8 | totalPieces | 整单件数 | total_pieces | number |
| 9 | verifystate | 审批状态 | verifystate | short |
| 10 | returncount | 退回次数 | returncount | short |
| 11 | printCount | 打印次数 | printCount | int |
| 12 | manageInTransit | 管理在途 | manageintransit | int |

---

## Date Fields (7)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | closeDate | 关闭日期 | close_Date | date |
| 2 | vouchdate | 单据日期 | vouchdate | date |
| 3 | dplanshipmentdate | 计划发货日期 | dPlanShipmentDate | date |
| 4 | dplanarrivaldate | 计划到货日期 | dPlanArrivalDate | date |
| 5 | createDate | 创建日期 | create_date | date |
| 6 | modifyDate | 修改日期 | modify_date | date |
| 7 | auditDate | 审批日期 | audit_date | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | transferApplys | 调拨订单子表 | st.transferapply.TransferApplys |
| 2 | headItem | 调拨订单主表自定义项 | st.transferapply.TransferApplyCustomItem |
| 3 | defines | 调拨出库主表自由自定义项 | st.transferapply.TransferApplyAttrextItem |
