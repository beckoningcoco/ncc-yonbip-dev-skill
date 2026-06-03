---
tags: [BIP, metadata, voucher, SaleReturnAttachment]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 退货附件 (voucher.salereturn.SaleReturnAttachment)

> Platform: BIP V5 | Module: voucher | Table: salereturnattachment | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 退货附件 |
| uri | voucher.salereturn.SaleReturnAttachment |
| tableName | salereturnattachment |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderBizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | U订货租户相关 (IUordercorp) | base.itf.IUordercorp |
| 2 | 逻辑删除相关 (Deletable) | base.itf.Deletable |
| 3 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | folder | 附件路径 | cUrl | text | String |  |  | nullable |
| 2 | saleReturnId | 退货单ID | iSaleReturnId | quote | voucher.salereturn.SaleReturn |  |  | nullable |
| 3 | type | 附件类型 | cType | text | String |  |  | nullable |
| 4 | size | 附件大小 | cFileSize | text | String |  |  | nullable |
| 5 | fileName | 附件 | cOriginalName | text | String |  |  | nullable |
| 6 | id | 主键ID | id | long | Long |  |  | nullable,REF.ID |
| 7 | udhFolder | 路径 | cFolder | text | String |  |  | nullable |
| 8 | creator | 创建人 | cCreator | text | String |  |  | isGlobalization,nullable |
| 9 | udhFileName | 附件名称 | cFileName | text | String |  |  | nullable |
| 10 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 11 | fullUrl | 附件URL | fullUrl | text | String |  |  | nullable |
| 12 | modifier | 修改人 | cModifier | text | String |  |  | isGlobalization,nullable |
| 13 | extName | 扩展名，用来标识附件类型 | cExtName | text | String |  |  | nullable |
| 14 | modifyTime | 创建时间 | dModifyTime | timestamp | Timestamp |  |  | nullable |
| 15 | isDeleted | 逻辑删除标记 | iDeleted | switch | Boolean |  | Y | nullable |
| 16 | createdTime | 创建时间 | dCreatedTime | timestamp | Timestamp |  |  | nullable |
| 17 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 18 | createDate | 创建时间 | dCreateDate | date | Date |  |  | nullable |
| 19 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | saleReturnId | 退货单ID | iSaleReturnId | voucher.salereturn.SaleReturn |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
