---
tags: [BIP, metadata, hrjx, Appraise]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表考核信息 (hrjx.pmAppraise.Appraise)

> Platform: BIP V5 | Table: pm_appraise | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表考核信息 |
| uri | hrjx.pmAppraise.Appraise |
| tableName | pm_appraise |
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
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (30)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 2 | sheetid | 量表名称 | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 3 | schemeid | 方案名称 | schemeid | quote | hrjx.pmAppraise.AppraiseVirtualScheme |  |  | nullable |
| 4 | appraiser | 评分人 | appraiser | quote | hred.staff.Staff |  |  | nullable |
| 5 | attachment | 附件上传 | attachment | text | String |  |  | nullable |
| 6 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 7 | comment | 综合评价 | comment | text | String |  |  | nullable |
| 8 | adjustscore | 调整分 | adjustscore | number | Decimal |  |  | nullable |
| 9 | advantage | 优势项 | advantage | text | String |  |  | nullable |
| 10 | annex | 非MDD基于OSS的综合评价附件 | annex | text | String |  |  | nullable |
| 11 | defineCharacter1 | 基础设置自定义特征 | define_character_001 | UserDefine | hrjx.pmCharacter.AppraiseChar |  |  | nullable |
| 12 | deptid | 部门id | deptid | quote | org.func.AdminOrg |  |  | nullable |
| 13 | developComment | 发展建议 | develop_comment | text | String |  |  | nullable |
| 14 | disadvantage | 劣势项 | disadvantage | text | String |  |  | nullable |
| 15 | exerciseStatus | 行权状态 | exercise_status | int | Integer |  |  | nullable |
| 16 | indiDataList | 量表指标考核信息 | - | - | hrjx.pmAppraise.AppraiseIndiData |  |  |  |
| 17 | isindilevel | 是否按指标级轮次评分 | isindilevel | int | Integer |  |  | nullable,uiHide |
| 18 | markStatus | 状态 | mark_status | int | Integer |  |  | nullable |
| 19 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 20 | recordList | 量表具体考核信息 | - | - | hrjx.pmAppraise.AppraiseData |  |  |  |
| 21 | returnReason | 被退回时原因 | return_reason | text | String |  |  | nullable |
| 22 | roleid | 执行角色id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 23 | score | 分数 | score | number | Decimal |  |  | nullable |
| 24 | state | 评分状态,兼容筛选区 | state | int | Integer |  |  | nullable |
| 25 | stepid | 步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 26 | systemScore | 系统自动评分 | system_score | short | Short |  |  | nullable |
| 27 | systemScoreTime | 系统自动评分时间 | system_score_time | timestamp | Timestamp |  |  | nullable |
| 28 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 29 | text | 等级 | text | text | String |  |  | nullable |
| 30 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | sheetid | 量表名称 | sheetid | hrjx.pmSheet.Sheet |
| 2 | schemeid | 方案名称 | schemeid | hrjx.pmAppraise.AppraiseVirtualScheme |
| 3 | appraiser | 评分人 | appraiser | hred.staff.Staff |
| 4 | deptid | 部门id | deptid | org.func.AdminOrg |
| 5 | roleid | 执行角色id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 6 | stepid | 步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | recordList | 量表具体考核信息 | hrjx.pmAppraise.AppraiseData |
| 2 | indiDataList | 量表指标考核信息 | hrjx.pmAppraise.AppraiseIndiData |
