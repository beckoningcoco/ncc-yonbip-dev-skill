---
tags: [BIP, metadata, HRXZHS_MDD, RsSalarySchemeScene]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 方案关联调薪场景 (HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeScene)

> Platform: BIP V5 | Table: rs_salary_scheme_scene | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 方案关联调薪场景 |
| uri | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeScene |
| tableName | rs_salary_scheme_scene |
| domain | yonbip-hr-budget |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (12)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeId | 方案主键 | scheme_id | quote | HRXZHS_MDD.rsSalaryScheme.RsSalaryScheme |  |  | nullable |
| 2 | sceneId | 场景 | scene_id | quote | bd.billref.TransTypeRef |  |  | nullable |
| 3 | sceneCode | 编码 | scene_code | text | String |  |  | nullable |
| 4 | sceneName | 名称 | scene_name | text | String |  |  | nullable |
| 5 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 6 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 7 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 8 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 9 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 10 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 11 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 12 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeId | 方案主键 | scheme_id | HRXZHS_MDD.rsSalaryScheme.RsSalaryScheme |
| 2 | sceneId | 场景 | scene_id | bd.billref.TransTypeRef |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
