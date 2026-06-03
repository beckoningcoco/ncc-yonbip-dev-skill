---
tags: [BIP, metadata, st, StandingBookDetailReport]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 库存明细账 (st.standingbookdetail.StandingBookDetailReport)

> Platform: BIP V5 | Module: st | Table: st_certificate | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 库存明细账 |
| uri | st.standingbookdetail.StandingBookDetailReport |
| tableName | st_certificate |
| domain | ustock |
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
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (7)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | org | 库存组织 | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isMasterOrg,nullable |
| 2 | warehouse | 仓库 | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 3 | oppowarehouse | 对方仓库 | iOppoWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 4 | product | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 5 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 6 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 7 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | org | 库存组织 | iOrgid | aa.baseorg.InventoryOrgMV |
| 2 | warehouse | 仓库 | iWarehouseId | aa.warehouse.Warehouse |
| 3 | oppowarehouse | 对方仓库 | iOppoWarehouseId | aa.warehouse.Warehouse |
| 4 | product | 物料 | iProductid | pc.product.Product |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
