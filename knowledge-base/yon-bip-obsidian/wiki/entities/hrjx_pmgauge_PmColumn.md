---
tags: [BIP, metadata, hrjx, PmColumn]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 栏目 (hrjx.pmgauge.PmColumn)

> Platform: BIP V5 | Table: pm_column | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 栏目 |
| uri | hrjx.pmgauge.PmColumn |
| tableName | pm_column |
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

## All Fields (12)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | columncode | 栏目code | columncode | text | String |  |  | nullable |
| 2 | defaultValue | 默认值 | defaultvalue | int | Integer |  |  | nullable |
| 3 | defaultShow | 是否默认显示 | defaultshow | int | Integer |  |  | nullable |
| 4 | bizProp | 指标属性 | bizprop | int | Integer |  |  | nullable |
| 5 | columnDataType | 栏目数据类型 | columndatatype | int | Integer |  |  | nullable |
| 6 | columnname | 栏目名称 | columnname | text | String |  |  | nullable |
| 7 | isCalculable | 是否参与计算 | iscalculable | int | Integer |  |  | nullable |
| 8 | columntype | 栏目类型 | columntype | int | Integer |  |  | nullable |
| 9 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 10 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 11 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 12 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
