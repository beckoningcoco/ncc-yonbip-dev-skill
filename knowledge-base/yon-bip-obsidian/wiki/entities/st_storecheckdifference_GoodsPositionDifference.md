---
tags: [BIP, metadata, st, GoodsPositionDifference]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点货位 (st.storecheckdifference.GoodsPositionDifference)

> Platform: BIP V5 | Module: st | Table: st_storecheckplan_goodsposition | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点货位 |
| uri | st.storecheckdifference.GoodsPositionDifference |
| tableName | st_storecheckplan_goodsposition |
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
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (5)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | goodsPosition | 盘点货位 | goodsposition | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 2 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 3 | mainidinposition | 盘点差异单主表id | mainidinposition | quote | st.storecheckdifference.StoreCheckDifference |  |  | nullable |
| 4 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 5 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | goodsPosition | 盘点货位 | goodsposition | aa.goodsposition.GoodsPosition |
| 2 | mainidinposition | 盘点差异单主表id | mainidinposition | st.storecheckdifference.StoreCheckDifference |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
