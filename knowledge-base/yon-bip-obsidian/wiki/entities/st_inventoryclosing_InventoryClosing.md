---
tags: [BIP, metadata, st, InventoryClosing]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 库存关账 (st.inventoryclosing.InventoryClosing)

> Platform: BIP V5 | Module: st | Table: st_inventory_closing | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 库存关账 |
| uri | st.inventoryclosing.InventoryClosing |
| tableName | st_inventory_closing |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | base.itf.IAuditInfo |

---

## All Fields (15)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | closingDate | 已关账至 | closing_date | date | Date |  |  | nullable |
| 2 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 3 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 4 | creator | 创建人名称 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 5 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 6 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 7 | modifier | 修改人名称 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 8 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 9 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 10 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 11 | org | 库存组织 | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isMasterOrg,nullable,skipReferenceCheck |
| 12 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 13 | thisClosingDate | 本次关账至 | this_closing_date | date | Date |  |  | nullable |
| 14 | warehouse | 仓库 | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable,skipReferenceCheck |
| 15 | ytenant | 租户id | ytenant_id | text | String |  |  | nullable |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creatorId | 创建人 | creatorId | base.user.User |
| 2 | modifierId | 修改人 | modifierId | base.user.User |
| 3 | org | 库存组织 | iOrgid | aa.baseorg.InventoryOrgMV |
| 4 | warehouse | 仓库 | iWarehouseId | aa.warehouse.Warehouse |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | closingDate | 已关账至 | closing_date | date |
| 2 | createDate | 创建日期 | create_date | date |
| 3 | modifyDate | 修改日期 | modify_date | date |
| 4 | thisClosingDate | 本次关账至 | this_closing_date | date |
