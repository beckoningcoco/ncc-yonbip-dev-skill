---
tags: [BIP, metadata, st, GoodChange]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 货位调整单主表 (st.goodchange.GoodChange)

> Platform: BIP V5 | Module: st | Table: st_goodchange | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 货位调整单主表 |
| uri | st.goodchange.GoodChange |
| tableName | st_goodchange |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (7)

| # | Name | URI |
|---|------|-----|
| 1 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 2 | 库存表头抽取 (IHeadInfo) | voucher.st.IHeadInfo |
| 3 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 4 | 外部系统 (ExternalSystem) | st.externalsystem.ExternalSystem |
| 5 | 库存移动记录版本 (ICertificateVersion) | st.billstate.ICertificateVersion |
| 6 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 7 | 门店相关 (IRetailStoreAll) | retail.voucher.IRetailStoreAll |

---

## All Fields (41)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | externalSystem | 外系统来源标识 | externalSystem | text | String |  |  | nullable |
| 2 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 3 | org | 库存组织id | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isBusinessLog,isMasterOrg,nullable |
| 4 | certificateVersion | 库存移动记录版本 | certificate_version | long | Long |  |  | nullable |
| 5 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 6 | code | 单据编码 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 7 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 8 | store | 门店id | iStoreID | quote | aa.store.Store |  | Y | data_auth,nullable |
| 9 | warehouse | 仓库id | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 10 | bustype | 业务类型id | iBusType | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 11 | goodchangeDefineCharacter | 自定义项特征组 | goodchangeDefineCharacter | UserDefine | st.goodchange.GoodChangeDefineCharacter |  |  | nullable |
| 12 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 13 | changeType | 单据类型 | changeType | text | String |  |  | nullable |
| 14 | memo | 备注 | cMemo | text | String |  |  | isBusinessLog,nullable |
| 15 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 16 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 17 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 18 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 19 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 20 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 21 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 22 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 23 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 24 | auditor | 审批人 | auditor | text | String |  |  | isGlobalization,nullable |
| 25 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 26 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 27 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 28 | modifierId | 修改人id | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 29 | auditorId | 审批人id | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 30 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 31 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 32 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 33 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 34 | stockMgr | 库管员ID | stock_mgr | quote | bd.staff.Staff |  |  | BUSINESSMESSAGE,dataPowerFlag,data_auth,isBusinessLog,nullable |
| 35 | totalPieces | 整单件数 | total_pieces | number | Decimal |  |  | isBusinessLog,nullable,reportHide |
| 36 | accountOrg | 会计主体 | account_org | quote | aa.baseorg.FinanceOrgMV |  |  | nullable |
| 37 | department | 部门 | department | quote | aa.baseorg.DeptMV |  |  | dataPowerFlag,data_auth,isBusinessLog,nullable |
| 38 | operator | 业务员 | iOperatorId | quote | bd.staff.Staff |  |  | isBusinessLog,data_auth,isSalesman,nullable,dataPowerFlag |
| 39 | defines | 货位调整单主表自由自定义项 | - | - | st.goodchange.GoodChangeAttrextItem |  |  |  |
| 40 | goodChanges | 调整单子表 | - | - | st.goodchange.GoodChanges |  |  |  |
| 41 | headItem | 货位调整单主表自定义项 | - | - | st.goodchange.GoodChangeCustomItem |  |  |  |

---

## Reference Fields (13)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 2 | org | 库存组织id | iOrgid | aa.baseorg.InventoryOrgMV |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 4 | store | 门店id | iStoreID | aa.store.Store |
| 5 | warehouse | 仓库id | iWarehouseId | aa.warehouse.Warehouse |
| 6 | bustype | 业务类型id | iBusType | bd.bill.TransType |
| 7 | creatorId | 创建人 | creatorId | base.user.User |
| 8 | modifierId | 修改人id | modifierId | base.user.User |
| 9 | auditorId | 审批人id | auditorId | base.user.User |
| 10 | stockMgr | 库管员ID | stock_mgr | bd.staff.Staff |
| 11 | accountOrg | 会计主体 | account_org | aa.baseorg.FinanceOrgMV |
| 12 | department | 部门 | department | aa.baseorg.DeptMV |
| 13 | operator | 业务员 | iOperatorId | bd.staff.Staff |

---

## Number Fields (5)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | status | 单据状态 | status | short |
| 2 | returncount | 退回次数 | returncount | short |
| 3 | totalQuantity | 整单数量 | fTotalQuantity | number |
| 4 | verifystate | 审批状态 | verifystate | short |
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
| 1 | goodChanges | 调整单子表 | st.goodchange.GoodChanges |
| 2 | headItem | 货位调整单主表自定义项 | st.goodchange.GoodChangeCustomItem |
| 3 | defines | 货位调整单主表自由自定义项 | st.goodchange.GoodChangeAttrextItem |
