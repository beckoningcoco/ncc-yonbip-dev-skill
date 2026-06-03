---
tags: [BIP, metadata, st, RealityProductClass]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 实盘品类 (st.storecheckreality.RealityProductClass)

> Platform: BIP V5 | Module: st | Table: st_storecheckreality_productclass | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 实盘品类 |
| uri | st.storecheckreality.RealityProductClass |
| tableName | st_storecheckreality_productclass |
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
| 1 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 2 | productClass | 盘点品类 | productclass | quote | pc.cls.ManagementClass |  |  | nullable |
| 3 | id | 物料分类子表主键 | id | long | Long |  |  | nullable,REF.ID |
| 4 | mainidinclass | 主表主键 | mainidinclass | quote | st.storecheckreality.StoreCheckReality |  |  | nullable |
| 5 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | productClass | 盘点品类 | productclass | pc.cls.ManagementClass |
| 2 | mainidinclass | 主表主键 | mainidinclass | st.storecheckreality.StoreCheckReality |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
