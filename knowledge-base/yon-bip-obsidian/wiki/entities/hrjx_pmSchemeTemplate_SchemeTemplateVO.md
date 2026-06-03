---
tags: [BIP, metadata, hrjx, SchemeTemplateVO]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 方案模板 (hrjx.pmSchemeTemplate.SchemeTemplateVO)

> Platform: BIP V5 | Table: pm_scheme_template | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 方案模板 |
| uri | hrjx.pmSchemeTemplate.SchemeTemplateVO |
| tableName | pm_scheme_template |
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

## All Fields (51)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeTemplateName | 模板名称 | schemetemplatename | text | String |  |  | isName,nullable |
| 2 | orgId | 所属组织id | orgid | quote | org.func.AdminOrg |  |  | data_auth,nullable |
| 3 | periodId | 绩效期间id | periodid | quote | hrjx.pmCore.Period |  |  | nullable |
| 4 | applyObj | 适用对象 | applyobj | int | Integer |  |  | nullable |
| 5 | remark | 模板描述 | remark | text | String |  |  | nullable |
| 6 | scoreRuleId | 指标评分规则id | scoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 7 | gradeId | 考核结果等级id | gradeid | quote | hrjx.pmCore.Grade |  |  | nullable |
| 8 | scoreWay | 总分汇总规则 | scoreway | int | Integer |  |  | nullable |
| 9 | viewResults | 结果查看等级 | viewresults | int | Integer |  |  | nullable |
| 10 | indiSource | 指标来源 | indisource | int | Integer |  |  | nullable |
| 11 | viewauditresults | 结果审核查看 | viewauditresults | int | Integer |  |  | nullable |
| 12 | schemeprincipal | 考核方案负责人选项 | schemeprincipal | int | Integer |  |  | nullable |
| 13 | isEntryResult | 录入考核结果 | isentryresult | int | Integer |  |  | nullable |
| 14 | isResultAudited | 考核结果审核 | isresultaudited | int | Integer |  |  | nullable |
| 15 | isResultConfirm | 结果需要员工确认 | isresultconfirm | int | Integer |  |  | nullable |
| 16 | isOverDueConfirm | 是否逾期系统确认 | isoverdueconfirm | int | Integer |  |  | nullable |
| 17 | isAllowMtr | 支持中期回顾 | isallowmtr | int | Integer |  |  | nullable |
| 18 | isTurn | 按轮次顺序打分 | isturn | int | Integer |  |  | nullable |
| 19 | isMergeMsg | 前面多人时只收到最后一条消息 | ismergemsg | int | Integer |  |  | nullable |
| 20 | isDoubleWeight | 按指标分类、指标两级设置权重 | isdoubleweight | int | Integer |  |  | nullable |
| 21 | isIndiAssign | 支持指标指派 | isindiassign | int | Integer |  |  | nullable |
| 22 | isModifyAppr | 允许考核对象修改考核流程 | ismodifyappr | int | Integer |  |  | nullable |
| 23 | isShowApprProccess | 是否允许查看过程打分 | isshowapprproccess | int | Integer |  |  | nullable |
| 24 | isShowAppr | 查看评分明细时隐藏考核人 | isshowappr | int | Integer |  |  | nullable |
| 25 | isqualitativeacquisition | 定性指标支持数据采集 | isqualitativeacquisition | text | String |  |  | nullable |
| 26 | isAllowFillup | 允许员工填报 | isallowfillup | int | Integer |  |  | nullable |
| 27 | indiAudit | 指标需审核 | indiaudit | int | Integer |  |  | nullable |
| 28 | indiConfirm | 指标需员工确认 | indiconfirm | int | Integer |  |  | nullable |
| 29 | distId | 强分id | distid | quote | hrjx.pmSchemeTemplate.DistTemplateVo |  |  | nullable |
| 30 | isAllowCalc | 是否支持指标评分 | isallowcalc | int | Integer |  |  | nullable |
| 31 | abstentionMode | 评分结束未评分人 | abstentionmode | int | Integer |  |  | nullable |
| 32 | isauditnomodifysheet | 不允许指标审核人修改考核表 | isauditnomodifysheet | short | Short |  |  | nullable |
| 33 | isAllowResultAppeal | 是否允许考核对象申诉绩效结果 | is_allow_result_appeal | int | Integer |  |  | nullable |
| 34 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 35 | vid | 所属组织时间轴id | vid | quote | org.func.AdminOrgTimeline |  |  | data_auth,migrationIgnoreRef,nullable |
| 36 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 37 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 38 | enable | 启用 | enable | singleOption | bd.systemEnum.sys_intboolean |  |  | nullable,uiDesign |
| 39 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 40 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 41 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 42 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 43 | id | tid | id | text | String |  |  | nullable,REF.ID,uiHide |
| 44 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 45 | tenant | 租户ID | tenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 46 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 47 | EvaObjectTypeRelationForSchemeTemplateList | 考核模板与考核对象类型关联表 | - | - | hrjx.pmSchemeTemplate.EvaObjectTypeRelationForSchemeTemplate |  |  |  |
| 48 | distList | 强分设置模板主表 | - | - | hrjx.pmSchemeTemplate.DistTemplateVo |  |  |  |
| 49 | evaApprList | 考核/审核流程设置模板 | - | - | hrjx.pmSchemeTemplate.EvaApprTemplateVo |  |  |  |
| 50 | gradeAndScoreLinkage | 等级与得分调整联动 | gradeandscorelinkage | short | Short |  |  | nullable |
| 51 | relationList | 方案模板与方案关联表 | - | - | hrjx.pmSchemeTemplate.SchemetemplateRelation |  |  |  |

---

## Reference Fields (10)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 所属组织id | orgid | org.func.AdminOrg |
| 2 | periodId | 绩效期间id | periodid | hrjx.pmCore.Period |
| 3 | scoreRuleId | 指标评分规则id | scoreruleid | hrjx.pmCore.ScoreRule |
| 4 | gradeId | 考核结果等级id | gradeid | hrjx.pmCore.Grade |
| 5 | distId | 强分id | distid | hrjx.pmSchemeTemplate.DistTemplateVo |
| 6 | vid | 所属组织时间轴id | vid | org.func.AdminOrgTimeline |
| 7 | creator | 创建人 | creator | base.user.BipUser |
| 8 | modifier | 修改人 | modifier | base.user.BipUser |
| 9 | tenant | 租户ID | tenant_id | yht.tenant.YhtTenant |
| 10 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enable | 启用 | enable | bd.systemEnum.sys_intboolean |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | distList | 强分设置模板主表 | hrjx.pmSchemeTemplate.DistTemplateVo |
| 2 | relationList | 方案模板与方案关联表 | hrjx.pmSchemeTemplate.SchemetemplateRelation |
| 3 | EvaObjectTypeRelationForSchemeTemplateList | 考核模板与考核对象类型关联表 | hrjx.pmSchemeTemplate.EvaObjectTypeRelationForSchemeTemplate |
| 4 | evaApprList | 考核/审核流程设置模板 | hrjx.pmSchemeTemplate.EvaApprTemplateVo |

---

## Enum Value Details

### 启用 (enable) -> enable
> Enum: bd.systemEnum.sys_intboolean

| code | value | name |
|------|-------|------|
| 0 | 0 | 停用 |
| 1 | 1 | 启用 |
