---
tags: [BIP, metadata, st, StockStatusChange]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 库存状态调整主表 (st.stockstatuschange.StockStatusChange)

> Platform: BIP V5 | Module: st | Table: st_goodchange | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 库存状态调整主表 |
| uri | st.stockstatuschange.StockStatusChange |
| tableName | st_goodchange |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.goodchange.GoodChange |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 库存移动记录版本 (ICertificateVersion) | st.billstate.ICertificateVersion |
| 2 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 3 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |

---

## All Fields (45)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | org | 库存组织id | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isBusinessLog,isMasterOrg,nullable |
| 2 | code | 单据编码 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 3 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 4 | srcBillType | 来源类型 | csrcbilltype | text | String |  |  | bMakeBill,nullable |
| 5 | adjustType | 调整类型 | adjust_type | text | String |  |  | nullable |
| 6 | certificateVersion | 库存移动记录版本 | certificate_version | long | Long |  |  | nullable |
| 7 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide,notGenerate |
| 8 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 9 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 10 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 11 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 12 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 13 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 14 | store | 门店id | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 15 | warehouse | 仓库id | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 16 | goodchangeDefineCharacter | 自定义项特征组 | goodchangeDefineCharacter | UserDefine | st.goodchange.GoodChangeDefineCharacter |  |  | nullable |
| 17 | bustype | 业务类型id | iBusType | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 18 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 19 | changeType | 单据类型 | changeType | text | String |  |  | nullable |
| 20 | externalSystem | 外系统来源标识 | externalSystem | text | String |  |  | nullable |
| 21 | memo | 备注 | cMemo | text | String |  |  | isBusinessLog,nullable |
| 22 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 23 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 24 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 25 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 26 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 27 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 28 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 29 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 30 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 31 | auditor | 审批人 | auditor | text | String |  |  | isGlobalization,nullable |
| 32 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 33 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 34 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 35 | modifierId | 修改人id | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 36 | auditorId | 审批人id | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 37 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 38 | stockMgr | 库管员ID | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isBusinessLog,nullable |
| 39 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 40 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 41 | department | 部门 | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,isBusinessLog,nullable |
| 42 | operator | 业务员 | iOperatorId | quote | bd.staff.Staff |  |  | isBusinessLog,data_auth,isSalesman,nullable,dataPowerFlag |
| 43 | defines | 库存状态调整主表自由自定义项 | - | - | st.stockstatuschange.StockStatusChangeAttrextItem |  |  |  |
| 44 | headItem | 库存状态调整主表自定义项 | - | - | st.stockstatuschange.StockStatusChangeCustomItem |  |  |  |
| 45 | stockStatusChanges | 库存状态调整子表 | - | - | st.stockstatuschange.StockStatusChanges |  |  |  |

---

## Reference Fields (14)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | org | 库存组织id | iOrgid | aa.baseorg.InventoryOrgMV |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 3 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 4 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 5 | store | 门店id | iStoreID | aa.store.Store |
| 6 | warehouse | 仓库id | iWarehouseId | aa.warehouse.Warehouse |
| 7 | bustype | 业务类型id | iBusType | bd.bill.TransType |
| 8 | creatorId | 创建人 | creatorId | base.user.User |
| 9 | modifierId | 修改人id | modifierId | base.user.User |
| 10 | auditorId | 审批人id | auditorId | base.user.User |
| 11 | stockMgr | 库管员ID | stock_mgr | bd.staff.Staff |
| 12 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 13 | department | 部门 | department | aa.baseorg.DeptMV |
| 14 | operator | 业务员 | iOperatorId | bd.staff.Staff |

---

## Number Fields (5)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | verifystate | 审批状态 | verifystate | short |
| 2 | returncount | 退回次数 | returncount | short |
| 3 | status | 单据状态 | status | short |
| 4 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 5 | totalPieces | 整单件数 | total_pieces | number |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | vouchdate | 单据日期 | vouchdate | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | modifyDate | 修改日期 | modify_date | date |
| 4 | auditDate | 审批日期 | audit_date | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | stockStatusChanges | 库存状态调整子表 | st.stockstatuschange.StockStatusChanges |
| 2 | headItem | 库存状态调整主表自定义项 | st.stockstatuschange.StockStatusChangeCustomItem |
| 3 | defines | 库存状态调整主表自由自定义项 | st.stockstatuschange.StockStatusChangeAttrextItem |
