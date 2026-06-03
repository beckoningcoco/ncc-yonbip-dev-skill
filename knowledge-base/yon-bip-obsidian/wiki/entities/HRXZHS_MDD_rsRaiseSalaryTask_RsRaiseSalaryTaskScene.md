---
tags: [BIP, metadata, HRXZHS_MDD, RsRaiseSalaryTaskScene]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调薪任务关联调薪场景 (HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskScene)

> Platform: BIP V5 | Table: rs_raise_salary_task_scene | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调薪任务关联调薪场景 |
| uri | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskScene |
| tableName | rs_raise_salary_task_scene |
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
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (13)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | taskId | 任务主键 | task_id | quote | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTask |  |  | nullable |
| 2 | sceneId | 场景主键 | scene_id | quote | bd.billref.TransTypeRef |  |  | nullable |
| 3 | sceneName | 场景名称 | scene_name | text | String |  |  | nullable |
| 4 | sceneCode | 场景编码 | scene_code | text | String |  |  | nullable |
| 5 | salaryAdjustmentBizRule | 调薪额度业务规则主键 | salary_adjustment_biz_rule | text | String |  |  | nullable |
| 6 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 7 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 8 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 9 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 10 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 11 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 12 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 13 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | taskId | 任务主键 | task_id | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTask |
| 2 | sceneId | 场景主键 | scene_id | bd.billref.TransTypeRef |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
