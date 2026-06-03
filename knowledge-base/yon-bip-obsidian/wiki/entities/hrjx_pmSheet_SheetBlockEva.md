---
tags: [BIP, metadata, hrjx, SheetBlockEva]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 区域考核关系 (hrjx.pmSheet.SheetBlockEva)

> Platform: BIP V5 | Table: pm_sheet_block_eva | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 区域考核关系 |
| uri | hrjx.pmSheet.SheetBlockEva |
| tableName | pm_sheet_block_eva |
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

## All Fields (20)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bizPhaseTypeId | 阶段类型id | biz_phase_type_id | quote | hrjx.pmPhaseFlow.PhaseBizType |  |  | nullable |
| 2 | blockPath | 区域路径 | block_path | text | String |  |  | nullable |
| 3 | blockid | 区块id | blockid | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 4 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 5 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 6 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 7 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 8 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 9 | originalid | 设置态区域id | originalid | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 10 | psnweight | 评价人权重 | psnweight | number | Decimal |  |  | nullable |
| 11 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 12 | roleid | 执行角色id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 13 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 14 | showorder | 顺序 | showorder | text | String |  |  | nullable |
| 15 | staffid | 人员id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 16 | stepid | 步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 17 | turn | 轮次 | turn | text | String |  |  | nullable |
| 18 | type | 阶段类型 | type | text | String |  |  | nullable |
| 19 | weight | 轮次权重 | weight | number | Decimal |  |  | nullable |
| 20 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (10)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | bizPhaseTypeId | 阶段类型id | biz_phase_type_id | hrjx.pmPhaseFlow.PhaseBizType |
| 2 | blockid | 区块id | blockid | hrjx.pmSheet.TemplateBlock |
| 3 | creator | 创建人 | creator | base.user.BipUser |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | originalid | 设置态区域id | originalid | hrjx.pmSheet.TemplateBlock |
| 6 | roleid | 执行角色id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 7 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 8 | staffid | 人员id | staffid | hred.staff.Staff |
| 9 | stepid | 步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 10 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
