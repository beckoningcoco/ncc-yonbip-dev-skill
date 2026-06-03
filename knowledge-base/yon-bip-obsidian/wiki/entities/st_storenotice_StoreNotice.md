---
tags: [BIP, metadata, st, StoreNotice]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 入库通知单主表 (st.storenotice.StoreNotice)

> Platform: BIP V5 | Module: st | Table: st_storenotice | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 入库通知单主表 |
| uri | st.storenotice.StoreNotice |
| tableName | st_storenotice |
| domain | ustock |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (6)

| # | Name | URI |
|---|------|-----|
| 1 | 汇率信息 (IExchangeRate) | voucher.base.IExchangeRate |
| 2 | 关闭信息 (IClosing) | base.itf.IClosing |
| 3 | 调拨信息 (ITransfer) | st.voucher.ITransfer |
| 4 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 5 | 表头整单件数合计信息 (IHeadTotalPiece) | st.voucher.IHeadTotalPiece |
| 6 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (62)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 2 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 3 | store | 所属门店 | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable,dataPowerFlag |
| 4 | outStore | 调出门店id | ioutstoreid | quote | aa.store.Store |  |  | nullable |
| 5 | outaccount | 调出会计主体id | ioutaccount | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 6 | outWarehouse | 调出仓库id | ioutwarehouseid | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 7 | inaccount | 调入会计主体id | iinaccount | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 8 | inStore | 调入门店id | iinstoreid | quote | aa.store.Store |  |  | nullable |
| 9 | inWarehouse | 调入仓库id | iinwarehouseid | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 10 | inorg | 入库组织 | iinorgid | quote | aa.baseorg.InventoryOrgMV |  |  | nullable,isMasterOrg |
| 11 | operator | 经办人id | iOperatorId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,isSalesman,nullable |
| 12 | outorg | 出库组织 | ioutorgid | quote | aa.baseorg.InventoryOrgMV |  |  | nullable |
| 13 | bustype | 业务类型id | ibustypeid | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 14 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | nullable |
| 15 | vendor | 供应商id | iVendorId | quote | aa.vendor.Vendor |  |  | dataPowerFlag,data_auth,nullable |
| 16 | memo | 备注 | cmemo | text | String |  |  | isBusinessLog,nullable |
| 17 | srcBill | 来源单据id | csrcbillid | text | String |  |  | nullable |
| 18 | srcBillNO | 来源单据号 | csrcbillno | text | String |  |  | nullable |
| 19 | srcTop | 来源申请单id | csrctopid | text | String |  |  | nullable |
| 20 | srcTopNO | 来源申请单号 | csrctopno | text | String |  |  | nullable |
| 21 | srcBillType | 来源单据类型 | csrcbilltype | - | st.storenotice.SrcBillType |  |  | nullable |
| 22 | bizstatus | 业务状态 | bizstatus | - | st.storenotice.StoreNoticeStatus |  |  | nullable |
| 23 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 24 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 25 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 26 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 27 | modifier | 最后修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 28 | modifyTime | 最后修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 29 | auditor | 提交人 | auditor | text | String |  |  | isGlobalization,nullable |
| 30 | auditTime | 提交时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 31 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 32 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 33 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 34 | totalPieces | 整单数量 | total_pieces | number | Decimal |  |  | nullable |
| 35 | invoiceVendor | 开票供应商 | invoice_vendor | quote | aa.vendor.Vendor |  |  | nullable |
| 36 | currency | 币种 | iCurrencyID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 37 | natCurrency | 本币 | iNatCurrencyID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 38 | exchRate | 汇率 | exchRate | number | Decimal |  |  | nullable |
| 39 | exchRateType | 汇率类型ID | iExchangeratetype | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 40 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 41 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 42 | breturn | 调拨退货 | breturn | switch | Boolean |  |  | nullable |
| 43 | closeDate | 关闭日期 | close_Date | date | Date |  |  | nullable |
| 44 | closeTime | 关闭时间 | close_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 45 | closer | 关闭人名称 | closer | text | String |  |  | isGlobalization,nullable,reportHide |
| 46 | closerId | 关闭人 | closerId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 47 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 48 | details | 入库通知单子表 | - | - | st.storenotice.StoreNoticeDetail |  |  |  |
| 49 | exchRateOps | 汇率折算方式 | exchRateOps | - | unitfyEnum.GZTBDM.ExchangeRateMethod |  |  | nullable |
| 50 | headItem | 入库通知单主表自定义项 | - | - | st.storenotice.StoreNoticeCustomItem |  |  |  |
| 51 | inbizperson | 调入业务员 | iinbizperson | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 52 | indepartment | 调入部门 | iindepartmentid | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 53 | inwarehouse | 调入仓库 | iInWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 54 | logs | 入库通知单物流信息子表 | - | - | st.storenotice.StoreNoticeLog |  |  |  |
| 55 | merchant | 商家 | imerchant | quote | aa.merchant.Merchant |  |  | nullable |
| 56 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 57 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 58 | outbizperson | 调出业务员 | ioutbizperson | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 59 | outdepartment | 调出部门 | ioutdepartmentid | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 60 | outwarehouse | 调出仓库 | ioutwarehouseid | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 61 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 62 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (29)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | store | 所属门店 | iStoreID | aa.store.Store |
| 2 | outStore | 调出门店id | ioutstoreid | aa.store.Store |
| 3 | outaccount | 调出会计主体id | ioutaccount | aa.baseorg.FinanceOrgMV |
| 4 | outWarehouse | 调出仓库id | ioutwarehouseid | aa.warehouse.Warehouse |
| 5 | inaccount | 调入会计主体id | iinaccount | aa.baseorg.FinanceOrgMV |
| 6 | inStore | 调入门店id | iinstoreid | aa.store.Store |
| 7 | inWarehouse | 调入仓库id | iinwarehouseid | aa.warehouse.Warehouse |
| 8 | inorg | 入库组织 | iinorgid | aa.baseorg.InventoryOrgMV |
| 9 | operator | 经办人id | iOperatorId | bd.staff.Staff |
| 10 | outorg | 出库组织 | ioutorgid | aa.baseorg.InventoryOrgMV |
| 11 | bustype | 业务类型id | ibustypeid | bd.bill.TransType |
| 12 | vendor | 供应商id | iVendorId | aa.vendor.Vendor |
| 13 | invoiceVendor | 开票供应商 | invoice_vendor | aa.vendor.Vendor |
| 14 | currency | 币种 | iCurrencyID | bd.currencytenant.CurrencyTenantVO |
| 15 | natCurrency | 本币 | iNatCurrencyID | bd.currencytenant.CurrencyTenantVO |
| 16 | exchRateType | 汇率类型ID | iExchangeratetype | bd.exchangeRate.ExchangeRateTypeVO |
| 17 | auditorId | 审批人 | auditorId | base.user.User |
| 18 | closerId | 关闭人 | closerId | base.user.User |
| 19 | creatorId | 创建人 | creatorId | base.user.User |
| 20 | inbizperson | 调入业务员 | iinbizperson | bd.staff.Staff |
| 21 | indepartment | 调入部门 | iindepartmentid | aa.baseorg.DeptMV |
| 22 | inwarehouse | 调入仓库 | iInWarehouseId | aa.warehouse.Warehouse |
| 23 | merchant | 商家 | imerchant | aa.merchant.Merchant |
| 24 | modifierId | 修改人 | modifierId | base.user.User |
| 25 | outbizperson | 调出业务员 | ioutbizperson | bd.staff.Staff |
| 26 | outdepartment | 调出部门 | ioutdepartmentid | aa.baseorg.DeptMV |
| 27 | outwarehouse | 调出仓库 | ioutwarehouseid | aa.warehouse.Warehouse |
| 28 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 29 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 2 | status | 单据状态 | status | short |
| 3 | totalPieces | 整单数量 | total_pieces | number |
| 4 | exchRate | 汇率 | exchRate | number |

---

## Date Fields (5)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | vouchdate | 单据日期 | vouchdate | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | auditDate | 审批日期 | audit_date | date |
| 4 | closeDate | 关闭日期 | close_Date | date |
| 5 | modifyDate | 修改日期 | modify_date | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | details | 入库通知单子表 | st.storenotice.StoreNoticeDetail |
| 2 | headItem | 入库通知单主表自定义项 | st.storenotice.StoreNoticeCustomItem |
| 3 | logs | 入库通知单物流信息子表 | st.storenotice.StoreNoticeLog |
