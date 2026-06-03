---
tags: [BIP, metadata, hrjx, EvaObjectTypeRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核对象类型关系表 (hrjx.evaObjType.EvaObjectTypeRelation)

> Platform: BIP V5 | Table: pm_eva_object_type_relation | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核对象类型关系表 |
| uri | hrjx.evaObjType.EvaObjectTypeRelation |
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
| 1 | evaObjectTypeId | 关联考核对象类型id | evaobjecttypeid | quote | hrjx.evaObjType.EvaObjectType |  |  | nullable |
| 2 | bizType | 业务类型 | biztype | text | String |  |  | nullable |
| 3 | bizId | 业务档案id | bizid | text | String |  |  | nullable |
| 4 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 5 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 6 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 7 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | evaObjectTypeId | 关联考核对象类型id | evaobjecttypeid | hrjx.evaObjType.EvaObjectType |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
