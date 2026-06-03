---
tags: [BIP, metadata, hrjx, ResultEnter]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结果录入 (hrjx.pmSheet.ResultEnter)

> Platform: BIP V5 | Table: pm_result_enter | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 结果录入 |
| uri | hrjx.pmSheet.ResultEnter |
| tableName | pm_result_enter |
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
| 1 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 2 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 3 | schemeid | 方案id | schemeid | text | String |  |  | nullable |
| 4 | sheetid | 量表id | sheetid | text | String |  |  | nullable |
| 5 | status | 状态 | status | int | Integer |  |  | nullable |
| 6 | stepid | 当前步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 7 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 8 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | stepid | 当前步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
