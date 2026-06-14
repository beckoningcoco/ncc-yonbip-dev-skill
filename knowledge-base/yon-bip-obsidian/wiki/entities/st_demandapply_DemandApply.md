---
tags: [BIP, metadata, st, DemandApply]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调拨申请单主表 (st.demandapply.DemandApply)

> Platform: BIP V5 | Module: st | Table: st_demandapply | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调拨申请单主表 |
| uri | st.demandapply.DemandApply |
| tableName | st_demandapply |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |
| description | 调拨申请单主表 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (13)

| # | Name | URI |
|---|------|-----|
| 1 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 2 | 调拨信息 (ITransfer) | st.voucher.ITransfer |
| 3 | 关闭信息 (IClosing) | base.itf.IClosing |
| 4 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 5 | 库存表头抽取 (IHeadInfo) | voucher.st.IHeadInfo |
| 6 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 7 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 8 | 商家相关 (IShop) | base.itf.IShop |
| 9 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 10 | 收货人信息 (IReceiver) | st.voucher.IReceiver |
| 11 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 12 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 13 | 外部来源线索 (IOutSysObjClue) | base.itf.IOutSysObjClue |

---

## All Fields (75)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 2 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 3 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 4 | closeDate | 关闭日期 | close_Date | date | Date |  |  | nullable |
| 5 | closerId | 关闭人 | closerId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 6 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 7 | demandApplyDefineCharacter | 自定义项特征组 | demandApplyDefineCharacter | UserDefine | st.demandapply.DemandApplyDefineCharacter |  |  | nullable |
| 8 | signForBilltype | 录入签收量单据 | sign_for_billtype | text | String |  |  | nullable |
| 9 | out_sys_code | 外部来源编码 | out_sys_code | text | String |  |  | nullable |
| 10 | out_sys_type | 外部来源类型 | out_sys_type | text | String |  |  | nullable |
| 11 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 12 | out_sys_id | 外部来源线索 | out_sys_id | text | String |  |  | nullable |
| 13 | out_sys_version | 外部来源版本 | out_sys_version | text | String |  |  | nullable |
| 14 | department | 部门 | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,isBusinessLog,nullable |
| 15 | inwarehouse | 调入仓库(废弃) | iInWarehouseId | quote | aa.warehouse.Warehouse |  |  | nullable,dataPowerFlag |
| 16 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 17 | org | 库存组织 | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isBusinessLog,nullable |
| 18 | outwarehouse | 调出仓库(废弃) | ioutwarehouseid | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 19 | stockMgr | 库管员 | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isBusinessLog,nullable |
| 20 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 21 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 22 | outorg | 调出组织 | ioutorgid | quote | aa.baseorg.InventoryOrgMV |  |  | nullable |
| 23 | outaccount | 调出会计主体id | ioutaccount | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 24 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 25 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 26 | businesstype | 交易类型 | businesstype | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 27 | breturn | 调拨退货 | breturn | switch | Boolean |  |  | nullable |
| 28 | demandWarehouse | 要货仓库(调入仓库) | idemandwarehouseid | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 29 | merchant | 商家id | imerchant | quote | aa.merchant.Merchant |  |  | nullable |
| 30 | shop | 商家id | iShopID | long | Long |  | Y | nullable,reportHide |
| 31 | store | 门店 | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 32 | outdepartment | 调出部门id | ioutdepartmentid | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 33 | inorg | 调入组织 | iinorgid | quote | aa.baseorg.InventoryOrgMV |  |  | nullable,isMasterOrg |
| 34 | inaccount | 调入会计主体id | iinaccount | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 35 | indepartment | 调入部门id | iindepartmentid | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 36 | inbizperson | 调入业务员id | iinbizperson | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 37 | dplanshipmentdate | 计划发货日期 | dPlanShipmentDate | date | Date |  |  | nullable |
| 38 | dplanarrivaldate | 计划到货日期 | dPlanArrivalDate | date | Date |  |  | nullable |
| 39 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 40 | memo | 备注 | cMemo | text | String |  |  | isBusinessLog,nullable |
| 41 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 42 | bizstatus | 单据状态 | bizstatus | text | String |  |  | nullable |
| 43 | srcBillType | 来源类型 | cSrcBillype | text | String |  |  | bMakeBill,nullable |
| 44 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 45 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 46 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 47 | outbizperson | 调出业务员id | ioutbizperson | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 48 | operator | 经办人主键 | ioperatorid | quote | bd.staff.Staff |  |  | isBusinessLog,data_auth,isSalesman,nullable,dataPowerFlag |
| 49 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 50 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 51 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 52 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 53 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 54 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 55 | auditor | 审批人 | auditor | text | String |  |  | isGlobalization,nullable |
| 56 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 57 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 58 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 59 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 60 | receiver | 收货人 | cReceiver | text | String |  |  | nullable |
| 61 | receivemobile | 收货人电话 | cReceiveMobile | text | String |  |  | nullable |
| 62 | receiveaddr | 收货人地址 | cReceiveAddr | text | String |  |  | nullable |
| 63 | receivezipcode | 邮编 | cReceiveZipCode | text | String |  |  | nullable |
| 64 | totalPieces | 整单数量 | total_pieces | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 65 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 66 | recieveDateTop | 希望到货日期 | dPlanArrivalDate | date | Date |  |  | nullable |
| 67 | closer | 关闭人 | closer | text | String |  |  | isGlobalization,nullable,reportHide |
| 68 | closeTime | 关闭时间 | close_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 69 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 70 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 71 | defines | 调拨申请单主表自由自定义项 | - | - | st.demandapply.DemandapplyAttrextItem |  |  |  |
| 72 | demandapplydetails | 调拨申请单子表 | - | - | st.demandapply.DemandApplyDetail |  |  |  |
| 73 | headItem | 调拨申请单主表自定义项 | - | - | st.demandapply.DemandApplyCustomItem |  |  |  |
| 74 | outWarehouse | 出库仓库 | ioutwarehouseid | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 75 | sourceorders | 单据来源 | - | - | st.demandapply.DemandApplySourceOrder |  |  |  |

---

## Reference Fields (27)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 2 | auditorId | 审批人 | auditorId | base.user.User |
| 3 | closerId | 关闭人 | closerId | base.user.User |
| 4 | creatorId | 创建人 | creatorId | base.user.User |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 6 | department | 部门 | department | aa.baseorg.DeptMV |
| 7 | inwarehouse | 调入仓库(废弃) | iInWarehouseId | aa.warehouse.Warehouse |
| 8 | modifierId | 修改人 | modifierId | base.user.User |
| 9 | org | 库存组织 | iOrgid | aa.baseorg.InventoryOrgMV |
| 10 | outwarehouse | 调出仓库(废弃) | ioutwarehouseid | aa.warehouse.Warehouse |
| 11 | stockMgr | 库管员 | stock_mgr | bd.staff.Staff |
| 12 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 13 | outorg | 调出组织 | ioutorgid | aa.baseorg.InventoryOrgMV |
| 14 | outaccount | 调出会计主体id | ioutaccount | aa.baseorg.FinanceOrgMV |
| 15 | businesstype | 交易类型 | businesstype | bd.bill.TransType |
| 16 | demandWarehouse | 要货仓库(调入仓库) | idemandwarehouseid | aa.warehouse.Warehouse |
| 17 | merchant | 商家id | imerchant | aa.merchant.Merchant |
| 18 | store | 门店 | iStoreID | aa.store.Store |
| 19 | outdepartment | 调出部门id | ioutdepartmentid | aa.baseorg.DeptMV |
| 20 | inorg | 调入组织 | iinorgid | aa.baseorg.InventoryOrgMV |
| 21 | inaccount | 调入会计主体id | iinaccount | aa.baseorg.FinanceOrgMV |
| 22 | indepartment | 调入部门id | iindepartmentid | aa.baseorg.DeptMV |
| 23 | inbizperson | 调入业务员id | iinbizperson | bd.staff.Staff |
| 24 | outbizperson | 调出业务员id | ioutbizperson | bd.staff.Staff |
| 25 | operator | 经办人主键 | ioperatorid | bd.staff.Staff |
| 26 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 27 | outWarehouse | 出库仓库 | ioutwarehouseid | aa.warehouse.Warehouse |

---

## Number Fields (6)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | printCount | 打印次数 | printCount | int |
| 2 | status | 单据状态 | status | short |
| 3 | verifystate | 审批状态 | verifystate | short |
| 4 | returncount | 退回次数 | returncount | short |
| 5 | totalPieces | 整单数量 | total_pieces | number |
| 6 | totalQuantity | 整单数量 | fTotalQuantity | number |

---

## Date Fields (8)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | closeDate | 关闭日期 | close_Date | date |
| 2 | vouchdate | 单据日期 | vouchdate | date |
| 3 | dplanshipmentdate | 计划发货日期 | dPlanShipmentDate | date |
| 4 | dplanarrivaldate | 计划到货日期 | dPlanArrivalDate | date |
| 5 | createDate | 创建日期 | create_date | date |
| 6 | modifyDate | 修改日期 | modify_date | date |
| 7 | auditDate | 审批日期 | audit_date | date |
| 8 | recieveDateTop | 希望到货日期 | dPlanArrivalDate | date |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | sourceorders | 单据来源 | st.demandapply.DemandApplySourceOrder |
| 2 | headItem | 调拨申请单主表自定义项 | st.demandapply.DemandApplyCustomItem |
| 3 | demandapplydetails | 调拨申请单子表 | st.demandapply.DemandApplyDetail |
| 4 | defines | 调拨申请单主表自由自定义项 | st.demandapply.DemandapplyAttrextItem |
