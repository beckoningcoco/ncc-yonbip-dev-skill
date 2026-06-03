---
tags: [BIP, metadata, st, StoreTrans]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 转库单主表 (st.storetrans.StoreTrans)

> Platform: BIP V5 | Module: st | Table: st_storetrans | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 转库单主表 |
| uri | st.storetrans.StoreTrans |
| tableName | st_storetrans |
| domain | ustock |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (11)

| # | Name | URI |
|---|------|-----|
| 1 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 2 | 商家相关 (IShop) | base.itf.IShop |
| 3 | 库存表头抽取 (IHeadInfo) | voucher.st.IHeadInfo |
| 4 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 5 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |
| 6 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 7 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 8 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 9 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 10 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 11 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |

---

## All Fields (54)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 2 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 3 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 4 | storetranDefineCharacter | 自定义项特征属性组 | storetranDefineCharacter | UserDefine | st.storetrans.StoretranDefineCharacter |  |  | nullable |
| 5 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 6 | writeOffEnable | 启用冲销 | write_off_enable | short | Short |  |  | nullable |
| 7 | writeOffStatus | 冲销状态 | write_off_status | short | Short |  |  | nullable |
| 8 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 9 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 10 | writeOffReason | 冲销原因 | write_off_reason | quote | aa.reason.Reason |  |  | nullable |
| 11 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 12 | inStockMgr | 入库库管员 | inStock_mgr | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 13 | inDepartment | 转入部门 | inDepartment | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,nullable |
| 14 | inOperator | 入库业务员 | inIOperatorId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 15 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 16 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 17 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 18 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 19 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 20 | org | 库存组织 | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isBusinessLog,isMasterOrg,nullable |
| 21 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 22 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 23 | businesstype | 交易类型 | ibusinesstype | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 24 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 25 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 26 | shop | 商家id | iShopID | long | Long |  | Y | nullable,reportHide |
| 27 | store | 门店 | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 28 | outWarehouse | 出库仓库 | ioutwarehouseid | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 29 | inWarehouse | 入库仓库 | iinwarehouseid | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 30 | department | 出库部门 | department | quote | aa.baseorg.DeptMV |  |  | isBusinessLog,data_auth,nullable,dataPowerFlag |
| 31 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 32 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 33 | stockMgr | 出库库管员 | stock_mgr | quote | bd.staff.Staff |  |  | isBusinessLog,data_auth,nullable,dataPowerFlag,BUSINESSMESSAGE |
| 34 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 35 | operator | 出库业务员 | iOperatorId | quote | bd.staff.Staff |  |  | isBusinessLog,data_auth,isSalesman,nullable,dataPowerFlag |
| 36 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 37 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 38 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 39 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 40 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 41 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 42 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 43 | auditor | 审核人 | auditor | text | String |  |  | isGlobalization,nullable |
| 44 | auditTime | 审核时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 45 | auditDate | 审核日期 | audit_date | date | Date |  |  | nullable |
| 46 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 47 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 48 | memo | 备注 | cMemo | text | String |  |  | isBusinessLog,nullable |
| 49 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 50 | isWfControlled | 是否为审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 51 | returncount | 返回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 52 | defines | 转库单主表自由自定义项 | - | - | st.storetrans.StoreTransAttrextItem |  |  |  |
| 53 | details | 转库单子表 | - | - | st.storetrans.StoreTransDetail |  |  |  |
| 54 | storeTransCustomItem | 主表自定义项 | - | - | st.storetrans.StoreTransCustomItem |  |  |  |

---

## Reference Fields (20)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditorId | 审批人 | auditorId | base.user.User |
| 2 | creatorId | 创建人 | creatorId | base.user.User |
| 3 | modifierId | 修改人 | modifierId | base.user.User |
| 4 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 5 | writeOffReason | 冲销原因 | write_off_reason | aa.reason.Reason |
| 6 | inStockMgr | 入库库管员 | inStock_mgr | bd.staff.Staff |
| 7 | inDepartment | 转入部门 | inDepartment | aa.baseorg.DeptMV |
| 8 | inOperator | 入库业务员 | inIOperatorId | bd.staff.Staff |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 10 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 11 | org | 库存组织 | iOrgid | aa.baseorg.InventoryOrgMV |
| 12 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 13 | businesstype | 交易类型 | ibusinesstype | bd.bill.TransType |
| 14 | store | 门店 | iStoreID | aa.store.Store |
| 15 | outWarehouse | 出库仓库 | ioutwarehouseid | aa.warehouse.Warehouse |
| 16 | inWarehouse | 入库仓库 | iinwarehouseid | aa.warehouse.Warehouse |
| 17 | department | 出库部门 | department | aa.baseorg.DeptMV |
| 18 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |
| 19 | stockMgr | 出库库管员 | stock_mgr | bd.staff.Staff |
| 20 | operator | 出库业务员 | iOperatorId | bd.staff.Staff |

---

## Number Fields (9)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | writeOffEnable | 启用冲销 | write_off_enable | short |
| 2 | writeOffStatus | 冲销状态 | write_off_status | short |
| 3 | status | 单据状态 | status | short |
| 4 | verifystate | 审批状态 | verifystate | short |
| 5 | ownertype | 货权归属 | ownertype | int |
| 6 | totalPieces | 整单件数 | total_pieces | number |
| 7 | printCount | 打印次数 | printCount | int |
| 8 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 9 | returncount | 返回次数 | returncount | short |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | vouchdate | 单据日期 | vouchdate | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | modifyDate | 修改日期 | modify_date | date |
| 4 | auditDate | 审核日期 | audit_date | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | storeTransCustomItem | 主表自定义项 | st.storetrans.StoreTransCustomItem |
| 2 | details | 转库单子表 | st.storetrans.StoreTransDetail |
| 3 | defines | 转库单主表自由自定义项 | st.storetrans.StoreTransAttrextItem |
