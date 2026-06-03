---
tags: [BIP, metadata, hrjx, GradeScope]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核等级规则实体适用范围 (hrjx.pmCore.GradeScope)

> Platform: BIP V5 | Table: pm_grade_scope | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核等级规则实体适用范围 |
| uri | hrjx.pmCore.GradeScope |
| tableName | pm_grade_scope |
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
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (10)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 2 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 3 | gradeid | 等级id | gradeid | quote | hrjx.pmCore.Grade |  |  | nullable |
| 4 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 5 | includesub | 是否包含下级 | includesub | int | Integer |  |  | nullable |
| 6 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 7 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 8 | orgid | 所属组织 | orgid | quote | org.func.AdminOrg |  |  | nullable |
| 9 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 10 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | gradeid | 等级id | gradeid | hrjx.pmCore.Grade |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | orgid | 所属组织 | orgid | org.func.AdminOrg |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
