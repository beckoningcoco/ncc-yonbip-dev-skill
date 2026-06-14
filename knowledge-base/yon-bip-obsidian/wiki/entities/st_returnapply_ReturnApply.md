---
tags: [BIP, metadata, st, ReturnApply]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 退货申请单主表 (st.returnapply.ReturnApply)

> Platform: BIP V5 | Module: st | Table: st_returnapply | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 退货申请单主表 |
| uri | st.returnapply.ReturnApply |
| tableName | st_returnapply |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 关闭信息 (IClosing) | base.itf.IClosing |
| 2 | 审批信息 (IApprovalInfo) | base.itf.IApprovalInfo |
| 3 | 表头整单合计信息 (IHeadTotalData) | st.voucher.IHeadTotalData |
| 4 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (35)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 2 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 3 | auditor | 审批人名称 | auditor | text | String |  |  | isGlobalization,nullable |
| 4 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 5 | bizstatus | 业务状态 | bizstatus | text | String |  |  | nullable |
| 6 | bustype | 业务类型 | iBusType | quote | aa.businesstype.Businesstype |  |  | nullable |
| 7 | closeDate | 关闭日期 | close_Date | date | Date |  |  | nullable |
| 8 | closeTime | 关闭时间 | close_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 9 | closer | 关闭人名称 | closer | text | String |  |  | isGlobalization,nullable,reportHide |
| 10 | closerId | 关闭人 | closerId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 11 | code | 编码 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 12 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 13 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 14 | creator | 创建人名称 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 15 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 16 | headItem | 退货申请单主表自定义项 | - | - | st.returnapply.ReturnApplyCustomItem |  |  |  |
| 17 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 18 | inorg | 退回组织 | iInOrgId | quote | aa.baseorg.InventoryOrgMV |  |  | nullable |
| 19 | inwarehouse | 退回仓库 | iInWarehouseId | quote | aa.warehouse.Warehouse |  |  | nullable |
| 20 | memo | 备注 | cMemo | text | String |  |  | isBusinessLog,nullable |
| 21 | modifier | 修改人名称 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 22 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 23 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 24 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 25 | operator | 经办人 | iOperatorId | quote | bd.staff.Staff |  |  | isSalesman,nullable |
| 26 | outwarehouse | 退货仓库 | iOutWarehouseId | quote | aa.warehouse.Warehouse |  |  | nullable |
| 27 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 28 | returnApplys | 退货申请单子表 | - | - | st.returnapply.ReturnApplys |  |  |  |
| 29 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 30 | store | 退货门店 | iStoreId | quote | aa.store.Store |  | Y | nullable |
| 31 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 32 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | nullable |
| 33 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 34 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 35 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (12)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditorId | 审批人 | auditorId | base.user.User |
| 2 | bustype | 业务类型 | iBusType | aa.businesstype.Businesstype |
| 3 | closerId | 关闭人 | closerId | base.user.User |
| 4 | creatorId | 创建人 | creatorId | base.user.User |
| 5 | inorg | 退回组织 | iInOrgId | aa.baseorg.InventoryOrgMV |
| 6 | inwarehouse | 退回仓库 | iInWarehouseId | aa.warehouse.Warehouse |
| 7 | modifierId | 修改人 | modifierId | base.user.User |
| 8 | operator | 经办人 | iOperatorId | bd.staff.Staff |
| 9 | outwarehouse | 退货仓库 | iOutWarehouseId | aa.warehouse.Warehouse |
| 10 | store | 退货门店 | iStoreId | aa.store.Store |
| 11 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 12 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | status | 单据状态 | status | short |
| 2 | totalQuantity | 整单数量 | fTotalQuantity | number |

---

## Date Fields (5)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | auditDate | 审批日期 | audit_date | date |
| 2 | closeDate | 关闭日期 | close_Date | date |
| 3 | createDate | 创建日期 | create_date | date |
| 4 | modifyDate | 修改日期 | modify_date | date |
| 5 | vouchdate | 单据日期 | vouchdate | date |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | returnApplys | 退货申请单子表 | st.returnapply.ReturnApplys |
| 2 | headItem | 退货申请单主表自定义项 | st.returnapply.ReturnApplyCustomItem |
