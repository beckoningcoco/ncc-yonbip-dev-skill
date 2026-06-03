---
tags: [BIP, metadata, hrjx, PmInterview]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效面谈 (hrjx.pmInterview.PmInterview)

> Platform: BIP V5 | Table: pm_interview | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效面谈 |
| uri | hrjx.pmInterview.PmInterview |
| tableName | pm_interview |
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

## All Fields (18)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | abilityKeyPoint | 能力讨论要点 | ability_key_point | text | String |  |  | nullable |
| 2 | attachment | 附件 | attachment | text | String |  |  | nullable |
| 3 | attitudeKeyPoint | 态度讨论要点 | attitude_key_point | text | String |  |  | nullable |
| 4 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 5 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 6 | defineCharacter | 特征弹性域 | define_character | UserDefine | hrjx.pmCharacter.InterviewCharacter |  |  | nullable |
| 7 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 8 | interviewDate | 面谈日期 | interview_date | date | Date |  |  | nullable |
| 9 | interviewLocation | 面谈地点 | interview_location | text | String |  |  | nullable |
| 10 | interviewStaffList | 绩效面谈人 | - | - | hrjx.pmInterview.PmInterviewStaff |  |  |  |
| 11 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 12 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 13 | performanceKeyPoint | 业绩讨论要点 | performance_key_point | text | String |  |  | nullable |
| 14 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 15 | schemeid | 绩效单元ID | scheme_id | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 16 | sheetid | 考核量表ID | sheet_id | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 17 | stepId | 绩效流程步骤ID | step_id | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 18 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | schemeid | 绩效单元ID | scheme_id | hrjx.pmScheme.Scheme |
| 4 | sheetid | 考核量表ID | sheet_id | hrjx.pmSheet.Sheet |
| 5 | stepId | 绩效流程步骤ID | step_id | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | interviewStaffList | 绩效面谈人 | hrjx.pmInterview.PmInterviewStaff |
