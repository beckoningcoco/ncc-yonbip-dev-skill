---
tags: [BIP, metadata, hrjx, Distribution]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 强制分布主实体 (hrjx.pmScheme.Distribution)

> Platform: BIP V5 | Table: pm_distribution | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 强制分布主实体 |
| uri | hrjx.pmScheme.Distribution |
| tableName | pm_distribution |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 3 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (30)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | orggradeitemid | 组织绩效等级明细id | orggradeitemid | quote | hrjx.pmCore.GradeItem |  |  | nullable |
| 2 | orgdeptid | 指定关联组织id | orgdeptid | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 3 | schemeid | 方案主键 | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 4 | groupid | 考核组id | groupid | text | String |  |  | nullable |
| 5 | multigroupid | 跨考核组id | multigroupid | text | String |  |  | nullable |
| 6 | gradeway | 是否全部等级校验 | gradeway | int | Integer |  |  | nullable |
| 7 | distway | 强制方式 | distway | int | Integer |  |  | nullable |
| 8 | distsum | 汇总人数 | distsum | int | Integer |  |  | nullable |
| 9 | disttype | 规则类别 | disttype | int | Integer |  |  | nullable |
| 10 | distcalc | 尾数处理方式 | distcalc | int | Integer |  |  | nullable |
| 11 | isorg | 关联组织绩效 | isorg | switch | Boolean |  |  | nullable |
| 12 | distruleid | 强分规则id | distruleid | quote | hrjx.pmCore.DistRule |  |  | nullable |
| 13 | templateid | 强分规则模板id | templateid | quote | hrjx.pmSchemeTemplate.DistTemplateVo |  |  | nullable |
| 14 | orgschemeid | 组织绩效方案id | orgschemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 15 | gradeid | 考核等级id | gradeid | quote | hrjx.pmCore.Grade |  |  | nullable |
| 16 | gradeStrongSetting | 等级强制设置 | grade_strong_setting | int | Integer |  |  | nullable |
| 17 | resultReviewId | 结果审核id | result_review_id | quote | hrjx.pmScheme.ResultReview |  |  | nullable |
| 18 | enable | 启用状态 | enablestate | int | Integer |  |  | nullable,uiDesign |
| 19 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 20 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 21 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 22 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 23 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 24 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 25 | id | 强制分布主实体id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 26 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 27 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 28 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 29 | isDist | 强制分布控制 | is_dist | int | Integer |  |  | nullable |
| 30 | oDistributionItem | 强制分布子实体 | - | - | hrjx.pmScheme.DistributionItem |  |  |  |

---

## Reference Fields (11)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orggradeitemid | 组织绩效等级明细id | orggradeitemid | hrjx.pmCore.GradeItem |
| 2 | orgdeptid | 指定关联组织id | orgdeptid | org.func.AdminOrg |
| 3 | schemeid | 方案主键 | schemeid | hrjx.pmScheme.Scheme |
| 4 | distruleid | 强分规则id | distruleid | hrjx.pmCore.DistRule |
| 5 | templateid | 强分规则模板id | templateid | hrjx.pmSchemeTemplate.DistTemplateVo |
| 6 | orgschemeid | 组织绩效方案id | orgschemeid | hrjx.pmScheme.Scheme |
| 7 | gradeid | 考核等级id | gradeid | hrjx.pmCore.Grade |
| 8 | resultReviewId | 结果审核id | result_review_id | hrjx.pmScheme.ResultReview |
| 9 | creator | 创建人 | creator | base.user.BipUser |
| 10 | modifier | 修改人 | modifier | base.user.BipUser |
| 11 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | oDistributionItem | 强制分布子实体 | hrjx.pmScheme.DistributionItem |
