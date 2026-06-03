---
tags: [BIP, metadata, hrjx, SheetAssessee]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 指标制定人表 (hrjx.pmSheet.SheetAssessee)

> Platform: BIP V5 | Table: pm_sheet_assessee | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 指标制定人表 |
| uri | hrjx.pmSheet.SheetAssessee |
| tableName | pm_sheet_assessee |
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
| 1 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 2 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 3 | deptid | 部门id | deptid | text | String |  |  | nullable |
| 4 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 5 | issued | 下达状态 | issued | int | Integer |  |  | nullable |
| 6 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 7 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 8 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 9 | roleid | 执行角色id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 10 | schemeid | 绩效单元主键 | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 11 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 12 | staffJobId | 任职id | staffjobid | text | String |  |  | nullable |
| 13 | staffid | 指定人id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 14 | status | 填报状态 | status | int | Integer |  |  | nullable |
| 15 | stepOriginalid | 定义态步骤id | step_originalid | quote | hrjx.pmPhaseFlow.PhaseFlowStep |  |  | nullable |
| 16 | stepid | 步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 17 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 18 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | roleid | 执行角色id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 4 | schemeid | 绩效单元主键 | schemeid | hrjx.pmScheme.Scheme |
| 5 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 6 | staffid | 指定人id | staffid | hred.staff.Staff |
| 7 | stepOriginalid | 定义态步骤id | step_originalid | hrjx.pmPhaseFlow.PhaseFlowStep |
| 8 | stepid | 步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
