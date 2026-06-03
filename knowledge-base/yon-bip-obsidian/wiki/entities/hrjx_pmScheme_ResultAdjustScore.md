---
tags: [BIP, metadata, hrjx, ResultAdjustScore]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核结果调整分数 (hrjx.pmScheme.ResultAdjustScore)

> Platform: BIP V5 | Table: pm_result_adjust_score | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核结果调整分数 |
| uri | hrjx.pmScheme.ResultAdjustScore |
| tableName | pm_result_adjust_score |
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

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | adjustGrade | 调整等级 | adjust_grade | text | String |  |  | nullable |
| 2 | adjustScore | 调整分数 | adjust_score | number | Decimal |  |  | nullable |
| 3 | adjustStaffId | 调整人员 | adjust_staff_id | quote | hred.staff.Staff |  |  | nullable |
| 4 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 5 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 6 | evaobjectId | 考核对象实体id | evaobject_id | quote | hrjx.pmScheme.EvaObject |  |  | nullable |
| 7 | grade | 考核等级 | grade | text | String |  |  | nullable |
| 8 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 9 | isView | 是否展示 | is_view | int | Integer |  |  | nullable |
| 10 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 11 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 12 | planId | 绩效计划id | plan_id | quote | hrjx.pmPlan.PmPlan |  |  | nullable |
| 13 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 14 | resultAdjustRecordList | 考核结果调整分数记录 | - | - | hrjx.pmScheme.ResultAdjustScoreRecord |  |  |  |
| 15 | schemeId | 绩效单元id | scheme_id | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 16 | score | 考核得分 | score | number | Decimal |  |  | nullable |
| 17 | sheetId | 量表id | sheet_id | text | String |  |  | nullable |
| 18 | text | 调整原因 | text | text | String |  |  | nullable |
| 19 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | adjustStaffId | 调整人员 | adjust_staff_id | hred.staff.Staff |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | evaobjectId | 考核对象实体id | evaobject_id | hrjx.pmScheme.EvaObject |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | planId | 绩效计划id | plan_id | hrjx.pmPlan.PmPlan |
| 6 | schemeId | 绩效单元id | scheme_id | hrjx.pmScheme.Scheme |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | resultAdjustRecordList | 考核结果调整分数记录 | hrjx.pmScheme.ResultAdjustScoreRecord |
