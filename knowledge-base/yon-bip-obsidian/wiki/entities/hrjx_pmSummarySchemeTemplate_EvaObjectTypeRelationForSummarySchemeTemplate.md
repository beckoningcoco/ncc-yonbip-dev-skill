---
tags: [BIP, metadata, hrjx, EvaObjectTypeRelationForSummarySchemeTemplate]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 汇总模板与考核对象类型关联表 (hrjx.pmSummarySchemeTemplate.EvaObjectTypeRelationForSummarySchemeTemplate)

> Platform: BIP V5 | Table: pm_eva_object_type_relation | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 汇总模板与考核对象类型关联表 |
| uri | hrjx.pmSummarySchemeTemplate.EvaObjectTypeRelationForSummarySchemeTemplate |
| tableName | pm_eva_object_type_relation |
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

## All Fields (7)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bizid | 业务id | bizid | quote | hrjx.pmSummarySchemeTemplate.SummarySchemeTemplateVO |  |  | nullable |
| 2 | biztype | 业务类型 | biztype | text | String |  |  | nullable |
| 3 | evaobjecttypeid | 基表类型id | evaobjecttypeid | quote | hrjx.pmCore.EvaObjectType |  |  | nullable |
| 4 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 5 | pubts | 时间 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 6 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 7 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | bizid | 业务id | bizid | hrjx.pmSummarySchemeTemplate.SummarySchemeTemplateVO |
| 2 | evaobjecttypeid | 基表类型id | evaobjecttypeid | hrjx.pmCore.EvaObjectType |
| 3 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
