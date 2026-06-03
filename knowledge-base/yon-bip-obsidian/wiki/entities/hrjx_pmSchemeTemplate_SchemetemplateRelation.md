---
tags: [BIP, metadata, hrjx, SchemetemplateRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 方案模板与方案关联表 (hrjx.pmSchemeTemplate.SchemetemplateRelation)

> Platform: BIP V5 | Table: pm_schemetemplate_relation | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 方案模板与方案关联表 |
| uri | hrjx.pmSchemeTemplate.SchemetemplateRelation |
| tableName | pm_schemetemplate_relation |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 5 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (21)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeTemplateId | 方案模板主键 | schemetemplateid | quote | hrjx.pmSchemeTemplate.SchemeTemplateVO |  |  | nullable |
| 2 | schemeName | 方案名称 | schemename | text | String |  |  | isName,nullable |
| 3 | applyState | 子方案状态 | applystate | int | Integer |  |  | nullable |
| 4 | schemeId | 子方案id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 5 | orgId | 所属组织id | orgid | quote | org.func.AdminOrgTimeline |  |  | dataAuth,data_auth,nullable |
| 6 | staffId | 负责人id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 7 | userId | 用户id | userid | text | String |  |  | nullable |
| 8 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 9 | vid | 所属组织时间轴id | vid | quote | org.func.AdminOrgTimeline |  |  | dataAuth,data_auth,nullable |
| 10 | isModifyAssessTurn | 考核人轮次调整 | ismodifyassessturn | int | Integer |  |  | nullable |
| 11 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 12 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 13 | enable | 启用 | enable | singleOption | bd.systemEnum.sys_intboolean |  |  | nullable,uiDesign |
| 14 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 15 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 16 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 17 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 18 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 19 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 20 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 21 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeTemplateId | 方案模板主键 | schemetemplateid | hrjx.pmSchemeTemplate.SchemeTemplateVO |
| 2 | schemeId | 子方案id | schemeid | hrjx.pmScheme.Scheme |
| 3 | orgId | 所属组织id | orgid | org.func.AdminOrgTimeline |
| 4 | staffId | 负责人id | staffid | hred.staff.Staff |
| 5 | vid | 所属组织时间轴id | vid | org.func.AdminOrgTimeline |
| 6 | creator | 创建人 | creator | base.user.BipUser |
| 7 | modifier | 修改人 | modifier | base.user.BipUser |
| 8 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enable | 启用 | enable | bd.systemEnum.sys_intboolean |

---

## Enum Value Details

### 启用 (enable) -> enable
> Enum: bd.systemEnum.sys_intboolean

| code | value | name |
|------|-------|------|
| 0 | 0 | 停用 |
| 1 | 1 | 启用 |
