---
tags: [BIP, metadata, hrjx, EvaSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核流程整体轮次设置 (hrjx.pmScheme.EvaSetting)

> Platform: BIP V5 | Table: pm_eva_setting | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核流程整体轮次设置 |
| uri | hrjx.pmScheme.EvaSetting |
| tableName | pm_eva_setting |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
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
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (25)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bizPhaseTypeId | 阶段类型id | biz_phase_type_id | quote | hrjx.pmPhaseFlow.PhaseBizType |  |  | nullable |
| 2 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 3 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 4 | dimid | 考核人类别id | dimid | quote | hrjx.pmCore.Dimensionality |  |  | nullable |
| 5 | evaobjectid | 考核对象实体id | evaobjectid | quote | hrjx.pmScheme.EvaObject |  |  | nullable |
| 6 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 7 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 8 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 9 | order | 顺序 | order | int | Integer |  |  | nullable |
| 10 | phaseRoleId | 步骤执行人角色id | phase_role_id | quote | hrjx.pmPhaseFlow.PhaseFlowRole |  |  | nullable |
| 11 | psnweight | 评价人权重 | psnweight | number | Decimal |  |  | nullable |
| 12 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 13 | roleid | 执行角色id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 14 | schemeid | 方案id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 15 | staffJobId | 考核对象任职id | staffjobid | quote | hred.staff.StaffJob |  |  | nullable |
| 16 | staffid | 审核/考核人id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 17 | stagename | 审核阶段 | stagename | text | String |  |  | isName,nullable |
| 18 | stepid | 步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStep |  |  | nullable |
| 19 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 20 | transferType | 流转类型 | transfer_type | text | String |  |  | nullable |
| 21 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 22 | type | 阶段类型 | type | text | String |  |  | nullable |
| 23 | weight | 轮次权重 | weight | number | Decimal |  |  | nullable |
| 24 | workstep | 环节 | workstep | int | Integer |  |  | nullable |
| 25 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (12)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | bizPhaseTypeId | 阶段类型id | biz_phase_type_id | hrjx.pmPhaseFlow.PhaseBizType |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | dimid | 考核人类别id | dimid | hrjx.pmCore.Dimensionality |
| 4 | evaobjectid | 考核对象实体id | evaobjectid | hrjx.pmScheme.EvaObject |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
| 6 | phaseRoleId | 步骤执行人角色id | phase_role_id | hrjx.pmPhaseFlow.PhaseFlowRole |
| 7 | roleid | 执行角色id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 8 | schemeid | 方案id | schemeid | hrjx.pmScheme.Scheme |
| 9 | staffJobId | 考核对象任职id | staffjobid | hred.staff.StaffJob |
| 10 | staffid | 审核/考核人id | staffid | hred.staff.Staff |
| 11 | stepid | 步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStep |
| 12 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
