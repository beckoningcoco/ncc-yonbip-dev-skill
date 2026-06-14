---
tags: [BIP, metadata, st, DemandApplySourceOrder]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 单据来源 (st.demandapply.DemandApplySourceOrder)

> Platform: BIP V5 | Module: st | Table: st_demandapply_sourceorder | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 单据来源 |
| uri | st.demandapply.DemandApplySourceOrder |
| tableName | st_demandapply_sourceorder |
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

## All Fields (7)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | demandapply | 要货主表 | iDemandapply | quote | st.demandapply.DemandApply |  |  | nullable |
| 2 | code | 要货申请单编码 | code | text | String |  |  | nullable |
| 3 | id | 要货来源单据id | id | long | Long |  |  | nullable,REF.ID |
| 4 | pubts | 时间戳1 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 5 | sourceType | 要货来源单据类型 | sourcetype | text | String |  |  | nullable |
| 6 | sourceCode | 要货来源单据 | sourcecode | text | String |  |  | nullable |
| 7 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | demandapply | 要货主表 | iDemandapply | st.demandapply.DemandApply |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
