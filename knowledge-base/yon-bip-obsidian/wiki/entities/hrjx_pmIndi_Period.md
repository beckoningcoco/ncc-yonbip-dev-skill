---
tags: [BIP, metadata, hrjx, Period]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效期间 (hrjx.pmIndi.Period)

> Platform: BIP V5 | Table: pm_period | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效期间 |
| uri | hrjx.pmIndi.Period |
| tableName | pm_period |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | periodname | 期间名称 | periodname | text | String |  |  | isName,nullable |
| 2 | periodcode | 期间编码 | periodcode | text | String |  |  | isCode,nullable |
| 3 | year | 所属年度 | year | int | Integer |  |  | nullable |
| 4 | periodtype | 所属年度 | periodtype | int | Integer |  |  | nullable |
| 5 | day | 天 | day | text | String |  |  | nullable |
| 6 | week | 周 | week | text | String |  |  | nullable |
| 7 | month | 月 | month | text | String |  |  | nullable |
| 8 | season | 季度 | season | text | String |  |  | nullable |
| 9 | halfyear | 半年 | halfyear | text | String |  |  | nullable |
| 10 | fdate | 开始时间 | fdate | timestamp | Timestamp |  |  | nullable |
| 11 | tdate | 结束时间 | tdate | timestamp | Timestamp |  |  | nullable |
| 12 | enable | 启用状态 | enablestate | int | Integer |  |  | nullable |
| 13 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 14 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 15 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 16 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
