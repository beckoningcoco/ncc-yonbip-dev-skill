---
tags: [BIP, metadata, hrjx, PhaseEmpagentRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 流程与代理人关联表 (hrjx.pmPhaseFlow.PhaseEmpagentRelation)

> Platform: BIP V5 | Table: phase_empagent_relation | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 流程与代理人关联表 |
| uri | hrjx.pmPhaseFlow.PhaseEmpagentRelation |
| tableName | phase_empagent_relation |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (8)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | agent | 代理人 | agent | quote | bd.staff.Staff |  |  | nullable |
| 2 | bizPhaseType | 阶段类型 | biz_phase_type | text | String |  |  | nullable |
| 3 | bizid | 业务id | bizid | text | String |  |  | nullable |
| 4 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 5 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 6 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 7 | taskid | 任务id | taskid | quote | hrjx.pmPhaseFlow.PhaseTask |  |  | nullable |
| 8 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | agent | 代理人 | agent | bd.staff.Staff |
| 2 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 3 | taskid | 任务id | taskid | hrjx.pmPhaseFlow.PhaseTask |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
