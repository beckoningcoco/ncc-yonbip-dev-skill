---
tags: [BIP, metadata, hrjx, SheetApprover]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表指标审核人实体 (hrjx.pmSheet.SheetApprover)

> Platform: BIP V5 | Table: pm_sheet_approver | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表指标审核人实体 |
| uri | hrjx.pmSheet.SheetApprover |
| tableName | pm_sheet_approver |
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

## All Fields (23)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeid | 方案id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 2 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 3 | indicatorid | 指标id | indicatorid | quote | hrjx.pmCore.Indicator |  |  | nullable |
| 4 | indiId | 量表指标id | indi_id | quote | hrjx.pmSheet.SheetIndicator |  |  | nullable |
| 5 | staffid | 人员id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 6 | roleid | 执行人类别id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 7 | dimid | 考核人类别id | dimid | quote | hrjx.pmCore.Dimensionality |  |  | nullable |
| 8 | blockid | 考核部分id | blockid | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 9 | stagename | 审核阶段 | stagename | text | String |  |  | nullable |
| 10 | aprState | 审核状态 | apr_state | int | Integer |  |  | nullable |
| 11 | aprLevel | 审核轮次 | apr_level | int | Integer |  |  | nullable |
| 12 | comment | 审核意见 | comment | text | String |  |  | nullable |
| 13 | apprgroup | 审核人组id | apprgroup | text | String |  |  | nullable |
| 14 | stepid | 绩效流程步骤 | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 15 | actAprLevel | 实际审核轮次 | act_apr_level | int | Integer |  |  | nullable |
| 16 | sysApprove | 是否系统审批 | sys_approve | int | Integer |  |  | nullable |
| 17 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 18 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 19 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 20 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 21 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 22 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 23 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (12)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeid | 方案id | schemeid | hrjx.pmScheme.Scheme |
| 2 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 3 | indicatorid | 指标id | indicatorid | hrjx.pmCore.Indicator |
| 4 | indiId | 量表指标id | indi_id | hrjx.pmSheet.SheetIndicator |
| 5 | staffid | 人员id | staffid | hred.staff.Staff |
| 6 | roleid | 执行人类别id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 7 | dimid | 考核人类别id | dimid | hrjx.pmCore.Dimensionality |
| 8 | blockid | 考核部分id | blockid | hrjx.pmSheet.TemplateBlock |
| 9 | stepid | 绩效流程步骤 | stepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 10 | creator | 创建人 | creator | base.user.BipUser |
| 11 | modifier | 修改人 | modifier | base.user.BipUser |
| 12 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
