---
tags: [BIP, metadata, hrjx, EvaObject]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核对象实体 (hrjx.pmScheme.EvaObject)

> Platform: BIP V5 | Table: pm_eva_object | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核对象实体 |
| uri | hrjx.pmScheme.EvaObject |
| tableName | pm_eva_object |
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

## All Fields (30)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | EvaSettingList | 考核流程整体轮次设置 | - | - | hrjx.pmScheme.EvaSetting |  |  |  |
| 2 | coreStaffOrder | 核心人力排序码 | core_staff_order | long | Long |  |  | nullable |
| 3 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 4 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 5 | defid | 绩效流程id | defid | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 6 | defineCharacter1 | 自定义特征 | define_character_001 | UserDefine | hrjx.pmScheme.EvaObjectChar |  |  | nullable |
| 7 | deptid | 部门id | deptid | quote | org.func.AdminOrg |  |  | nullable |
| 8 | gaugecopyid | 实际公共量表id | gaugecopyid | text | String |  |  | nullable |
| 9 | gaugeid | 原始公共量表id | gaugeid | quote | hrjx.pmgauge.Gauge |  |  | nullable |
| 10 | groupid | 组id | groupid | quote | hrjx.pmScheme.EvaGroup |  |  | nullable |
| 11 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 12 | indisetcopyid | 指标模板副本id | indisetcopyid | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 13 | indisetid | 指标模板id | indisetid | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 14 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 15 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 16 | moveFlag | 移动标识,未移动过0  | move_flag | long | Long |  |  | nullable |
| 17 | orgid | 组织绩效考核组织 | orgid | quote | org.func.AdminOrg |  |  | nullable |
| 18 | originschemeid | 引入考核对象原始方案主键 | originschemeid | text | String |  |  | nullable |
| 19 | pmStaffOrder | 绩效排序码 | pm_staff_order | long | Long |  |  | nullable |
| 20 | pmtemplateid | 绩效模板id | pmtemplateid | quote | hrjx.pmSheet.Template |  |  | nullable |
| 21 | postid | 任职id | postid | text | String |  |  | nullable |
| 22 | probationid | 试用信息id | probationid | quote | hred.staff.StaffProbation |  |  | nullable |
| 23 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 24 | reftype | 引用类型 | reftype | short | Short |  |  | nullable |
| 25 | resultReviewId | 结果审核id | result_review_id | quote | hrjx.pmScheme.ResultReview |  |  | nullable |
| 26 | schemeid | 明细方案类型 | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 27 | staffJobId | 任职id | staffjobid | quote | hred.staff.StaffJob |  |  | nullable |
| 28 | staffid | 员工id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 29 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 30 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (16)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | defid | 绩效流程id | defid | hrjx.pmPhaseFlow.PhaseFlowDef |
| 3 | deptid | 部门id | deptid | org.func.AdminOrg |
| 4 | gaugeid | 原始公共量表id | gaugeid | hrjx.pmgauge.Gauge |
| 5 | groupid | 组id | groupid | hrjx.pmScheme.EvaGroup |
| 6 | indisetcopyid | 指标模板副本id | indisetcopyid | hrjx.pmSheet.TemplateIndiSet |
| 7 | indisetid | 指标模板id | indisetid | hrjx.pmSheet.TemplateIndiSet |
| 8 | modifier | 修改人 | modifier | base.user.BipUser |
| 9 | orgid | 组织绩效考核组织 | orgid | org.func.AdminOrg |
| 10 | pmtemplateid | 绩效模板id | pmtemplateid | hrjx.pmSheet.Template |
| 11 | probationid | 试用信息id | probationid | hred.staff.StaffProbation |
| 12 | resultReviewId | 结果审核id | result_review_id | hrjx.pmScheme.ResultReview |
| 13 | schemeid | 明细方案类型 | schemeid | hrjx.pmScheme.Scheme |
| 14 | staffJobId | 任职id | staffjobid | hred.staff.StaffJob |
| 15 | staffid | 员工id | staffid | hred.staff.Staff |
| 16 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | EvaSettingList | 考核流程整体轮次设置 | hrjx.pmScheme.EvaSetting |
