---
tags: [BIP, metadata, hrjx, AppraiseVirTual]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表考核信息(虚拟) (hrjx.pmSheet.AppraiseVirTual)

> Platform: BIP V5 | Table: pm_appraise | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表考核信息(虚拟) |
| uri | hrjx.pmSheet.AppraiseVirTual |
| tableName | pm_appraise |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | hrjx.pmAppraise.Appraise |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (29)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | AppraiseDataList1 | 量表具体考核信息(虚拟) | - | - | hrjx.pmSheet.AppraiseDataVirtual |  |  |  |
| 2 | adjustscore | 调整分 | adjustscore | number | Decimal |  |  | nullable |
| 3 | advantage | 优势项 | advantage | text | String |  |  | nullable |
| 4 | annex | 非MDD基于OSS的综合评价附件 | annex | text | String |  |  | nullable |
| 5 | appraiser | 考核人id | appraiser | quote | hred.staff.Staff |  |  | nullable |
| 6 | attachment | MDD协同综合评价附件 | attachment | text | String |  |  | nullable |
| 7 | comment | 综合评价 | comment | text | String |  |  | nullable |
| 8 | defineCharacter1 | 基础设置自定义特征 | define_character_001 | UserDefine | hrjx.pmCharacter.AppraiseChar |  |  | nullable |
| 9 | deptid | 部门id | deptid | quote | org.func.AdminOrg |  |  | nullable |
| 10 | developComment | 发展建议 | develop_comment | text | String |  |  | nullable |
| 11 | disadvantage | 劣势项 | disadvantage | text | String |  |  | nullable |
| 12 | exerciseStatus | 行权状态 | exercise_status | int | Integer |  |  | nullable |
| 13 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 14 | isindilevel | 是否按指标级轮次评分 | isindilevel | int | Integer |  |  | nullable,uiHide |
| 15 | markStatus | 状态 | mark_status | int | Integer |  |  | nullable |
| 16 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 17 | returnReason | 被退回时原因 | return_reason | text | String |  |  | nullable |
| 18 | roleid | 执行角色id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 19 | schemeid | 方案id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 20 | score | 分数 | score | number | Decimal |  |  | nullable |
| 21 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 22 | state | 评分状态,兼容筛选区 | state | int | Integer |  |  | nullable |
| 23 | stepid | 步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 24 | systemScore | 系统自动评分 | system_score | short | Short |  |  | nullable |
| 25 | systemScoreTime | 系统自动评分时间 | system_score_time | timestamp | Timestamp |  |  | nullable |
| 26 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 27 | text | 等级 | text | text | String |  |  | nullable |
| 28 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 29 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | appraiser | 考核人id | appraiser | hred.staff.Staff |
| 2 | deptid | 部门id | deptid | org.func.AdminOrg |
| 3 | roleid | 执行角色id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 4 | schemeid | 方案id | schemeid | hrjx.pmScheme.Scheme |
| 5 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 6 | stepid | 步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | AppraiseDataList1 | 量表具体考核信息(虚拟) | hrjx.pmSheet.AppraiseDataVirtual |
