---
tags: [BIP, metadata, hrjx, Approver]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 指标审核人实体 (hrjx.pmSheet.Approver)

> Platform: BIP V5 | Table: pm_approver | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 指标审核人实体 |
| uri | hrjx.pmSheet.Approver |
| tableName | pm_approver |
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
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (20)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeid | 方案id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 2 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 3 | staffid | 人员id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 4 | roleid | 角色id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 5 | stepid | 步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 6 | apprgroup | 审核人组id | apprgroup | text | String |  |  | nullable |
| 7 | dimid | 审核人类别 | dimid | quote | hrjx.pmCore.Dimensionality |  |  | nullable |
| 8 | aprLevel | 审核轮次 | apr_level | int | Integer |  |  | nullable |
| 9 | comment | 审核意见 | comment | text | String |  |  | nullable |
| 10 | stagename | 审核阶段 | stagename | text | String |  |  | nullable |
| 11 | aprStatus | 审核状态 | apr_status | int | Integer |  |  | nullable |
| 12 | sysApprove | 是否系统自动审核 | sys_approve | int | Integer |  |  | nullable |
| 13 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 14 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 15 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 16 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 17 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 18 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 19 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 20 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeid | 方案id | schemeid | hrjx.pmScheme.Scheme |
| 2 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 3 | staffid | 人员id | staffid | hred.staff.Staff |
| 4 | roleid | 角色id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 5 | stepid | 步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 6 | dimid | 审核人类别 | dimid | hrjx.pmCore.Dimensionality |
| 7 | creator | 创建人 | creator | base.user.BipUser |
| 8 | modifier | 修改人 | modifier | base.user.BipUser |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
