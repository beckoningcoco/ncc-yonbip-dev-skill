---
tags: [BIP, metadata, hrjx, PhaseFlowAppealRole]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申诉步骤执行角色 (hrjx.pmPhaseFlow.PhaseFlowAppealRole)

> Platform: BIP V5 | Table: phase_role | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 申诉步骤执行角色 |
| uri | hrjx.pmPhaseFlow.PhaseFlowAppealRole |
| tableName | phase_role |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | hrjx.pmPhaseFlow.PhaseFlowRole |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (17)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | appraiserelid | 考核关系id | appraiserelid | quote | hrjx.pmCore.AppraiseRelSetting |  |  | nullable |
| 2 | deptid | 人员部门 | deptid | quote | org.func.AdminOrg |  |  | nullable |
| 3 | dispSeq | 排序 | disp_seq | int | Integer |  |  | nullable |
| 4 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 5 | isshowlastscore | 评估时是否带出前轮评分 | isshowlastscore | int | Integer |  |  | nullable |
| 6 | phasedFlowDefId | 流程id | phased_flow_def_id | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 7 | psnweight | 轮次内占比 | psnweight | number | Decimal |  |  | nullable |
| 8 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 9 | pullType | 执行角色获取方式 | pull_type | int | Integer |  |  | nullable |
| 10 | roleid | 角色id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 11 | signature | 手工签名 | signature | int | Integer |  |  | nullable |
| 12 | staffid | 人员主键 | staffid | quote | hred.staff.Staff |  |  | nullable |
| 13 | stepid | 流程步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowAppealStep |  |  | nullable |
| 14 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 15 | turnweight | 轮次权重 | turnweight | number | Decimal |  |  | nullable |
| 16 | weight | 权重 | weight | number | Decimal |  |  | nullable |
| 17 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | appraiserelid | 考核关系id | appraiserelid | hrjx.pmCore.AppraiseRelSetting |
| 2 | deptid | 人员部门 | deptid | org.func.AdminOrg |
| 3 | phasedFlowDefId | 流程id | phased_flow_def_id | hrjx.pmPhaseFlow.PhaseFlowDef |
| 4 | roleid | 角色id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 5 | staffid | 人员主键 | staffid | hred.staff.Staff |
| 6 | stepid | 流程步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowAppealStep |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
