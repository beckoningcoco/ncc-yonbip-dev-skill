---
tags: [BIP, metadata, st, GoodsPosition]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点货位 (st.storecheckplan.GoodsPosition)

> Platform: BIP V5 | Module: st | Table: st_storecheckplan_goodsposition | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点货位 |
| uri | st.storecheckplan.GoodsPosition |
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
| 1 | id | 盘点货位子表主键 | id | long | Long |  |  | nullable,REF.ID |
| 2 | mainidinposition | 主表主键 | mainidinposition | quote | st.storecheckplan.StoreCheckPlan |  |  | nullable |
| 3 | goodsPosition | 盘点货位 | goodsposition | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 4 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 5 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | mainidinposition | 主表主键 | mainidinposition | st.storecheckplan.StoreCheckPlan |
| 2 | goodsPosition | 盘点货位 | goodsposition | aa.goodsposition.GoodsPosition |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
