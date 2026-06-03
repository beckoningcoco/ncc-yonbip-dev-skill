---
tags: [BIP, metadata, hrjx, SummarySchemeTemplateVO]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 汇总模板 (hrjx.pmSummarySchemeTemplate.SummarySchemeTemplateVO)

> Platform: BIP V5 | Table: pm_summary_schemetemplate | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 汇总模板 |
| uri | hrjx.pmSummarySchemeTemplate.SummarySchemeTemplateVO |
| tableName | pm_summary_schemetemplate |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 5 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (32)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeTemplateName | 模板名称 | schemetemplatename | text | String |  |  | isName,nullable |
| 2 | orgId | 所属组织id | orgid | quote | org.func.AdminOrg |  |  | data_auth,nullable |
| 3 | vid | 所属组织时间轴id | vid | quote | org.func.AdminOrgTimeline |  |  | data_auth,migrationIgnoreRef,nullable |
| 4 | periodId | 绩效期间id | periodid | quote | hrjx.pmCore.Period |  |  | nullable |
| 5 | remark | 模板描述 | remark | text | String |  |  | nullable |
| 6 | gradeId | 考核结果等级id | gradeid | quote | hrjx.pmCore.Grade |  |  | nullable |
| 7 | subsection | 分段计算规则 | subsection | int | Integer |  |  | nullable |
| 8 | viewResults | 结果查看方式 | viewresults | int | Integer |  |  | nullable |
| 9 | isResultAudited | 考核结果审核 | isresultaudited | int | Integer |  |  | nullable |
| 10 | isResultConfirm | 结果需要员工确认 | isresultconfirm | int | Integer |  |  | nullable |
| 11 | isPartAppraiseSum | 分段考核汇总 | ispartappraisesum | int | Integer |  |  | nullable |
| 12 | summaryObjSource | 汇总对象来源 | summaryobjsource | int | Integer |  |  | nullable |
| 13 | noneSummaryObj | 汇总对象在方案中不存在时 | nonesummaryobj | int | Integer |  |  | nullable |
| 14 | distId | 强分id | distid | quote | hrjx.pmSummarySchemeTemplate.DistSummaryTemplateVo |  |  | nullable |
| 15 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 16 | isMergeMsg | 是否前面多人时只收到最后一条消息 | ismergemsg | int | Integer |  |  | nullable |
| 17 | enable | 启用 | enable | singleOption | bd.systemEnum.sys_intboolean |  |  | nullable,uiDesign |
| 18 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 19 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 20 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 21 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 22 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 23 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 24 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 25 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 26 | tenant | 租户ID | tenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 27 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 28 | distList | 强分设置模板主表 | - | - | hrjx.pmSummarySchemeTemplate.DistSummaryTemplateVo |  |  |  |
| 29 | evaApprList | 考核/审核流程设置模板 | - | - | hrjx.pmSummarySchemeTemplate.EvaApprSummaryTemplateVo |  |  |  |
| 30 | gradeAndScoreLinkage | 等级与得分调整联动 | gradeandscorelinkage | short | Short |  |  | nullable |
| 31 | relationList | 汇总方案模板与方案关联表 | - | - | hrjx.pmSummarySchemeTemplate.SummarySchemetemplateRelation |  |  |  |
| 32 | relations | 汇总模板与考核对象类型关联表 | - | - | hrjx.pmSummarySchemeTemplate.EvaObjectTypeRelationForSummarySchemeTemplate |  |  |  |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 所属组织id | orgid | org.func.AdminOrg |
| 2 | vid | 所属组织时间轴id | vid | org.func.AdminOrgTimeline |
| 3 | periodId | 绩效期间id | periodid | hrjx.pmCore.Period |
| 4 | gradeId | 考核结果等级id | gradeid | hrjx.pmCore.Grade |
| 5 | distId | 强分id | distid | hrjx.pmSummarySchemeTemplate.DistSummaryTemplateVo |
| 6 | creator | 创建人 | creator | base.user.BipUser |
| 7 | modifier | 修改人 | modifier | base.user.BipUser |
| 8 | tenant | 租户ID | tenant_id | yht.tenant.YhtTenant |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enable | 启用 | enable | bd.systemEnum.sys_intboolean |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | distList | 强分设置模板主表 | hrjx.pmSummarySchemeTemplate.DistSummaryTemplateVo |
| 2 | relationList | 汇总方案模板与方案关联表 | hrjx.pmSummarySchemeTemplate.SummarySchemetemplateRelation |
| 3 | relations | 汇总模板与考核对象类型关联表 | hrjx.pmSummarySchemeTemplate.EvaObjectTypeRelationForSummarySchemeTemplate |
| 4 | evaApprList | 考核/审核流程设置模板 | hrjx.pmSummarySchemeTemplate.EvaApprSummaryTemplateVo |

---

## Enum Value Details

### 启用 (enable) -> enable
> Enum: bd.systemEnum.sys_intboolean

| code | value | name |
|------|-------|------|
| 0 | 0 | 停用 |
| 1 | 1 | 启用 |
