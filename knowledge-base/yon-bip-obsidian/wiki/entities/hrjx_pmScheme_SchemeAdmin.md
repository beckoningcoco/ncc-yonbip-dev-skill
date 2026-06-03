---
tags: [BIP, metadata, hrjx, SchemeAdmin]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效单元负责人实体 (hrjx.pmScheme.SchemeAdmin)

> Platform: BIP V5 | Table: pm_scheme_admin | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效单元负责人实体 |
| uri | hrjx.pmScheme.SchemeAdmin |
| tableName | pm_scheme_admin |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
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

## All Fields (6)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 2 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 3 | schemeid | 方案id | schemeid | quote | hrjx.pmScheme.ResultReview |  |  | nullable |
| 4 | staffid | 负责人id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 5 | type | 负责人类型 | type | int | Integer |  |  | nullable |
| 6 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeid | 方案id | schemeid | hrjx.pmScheme.ResultReview |
| 2 | staffid | 负责人id | staffid | hred.staff.Staff |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
