---
tags: [BIP, metadata, st, ShareMo]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分摊生产订单 (st.storecheckplan.ShareMo)

> Platform: BIP V5 | Module: st | Table: st_storecheckplan_sharemo | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 分摊生产订单 |
| uri | st.storecheckplan.ShareMo |
| tableName | st_storecheckplan_sharemo |
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
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (5)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | 分摊生产订单主键 | id | long | Long |  |  | nullable,REF.ID |
| 2 | mainid | 盘点订单主表主键 | mainid | quote | st.storecheckplan.StoreCheckPlan |  |  | nullable |
| 3 | shareMo | 分摊生产订单 | sharemo | quote | po.order.Order |  |  | nullable |
| 4 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 5 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | mainid | 盘点订单主表主键 | mainid | st.storecheckplan.StoreCheckPlan |
| 2 | shareMo | 分摊生产订单 | sharemo | po.order.Order |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
