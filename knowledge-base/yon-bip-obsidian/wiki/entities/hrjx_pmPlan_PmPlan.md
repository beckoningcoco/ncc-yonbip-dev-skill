---
tags: [BIP, metadata, hrjx, PmPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工绩效计划 (hrjx.pmPlan.PmPlan)

> Platform: BIP V5 | Table: pm_plan | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 员工绩效计划 |
| uri | hrjx.pmPlan.PmPlan |
| tableName | pm_plan |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |
| description | 0 停用 1 启用 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 树型结构 (ITree) | base.itf.ITree |
| 5 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (58)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | applyobj | 主兼职考核结果汇总 | applyobj | int | Integer |  |  | nullable |
| 2 | businessList | 绩效计划代理人明细表 | - | - | hrjx.pmPlan.PmPlanAgentBusiness |  |  |  |
| 3 | copyFromPlanId | 复制绩效计划来源ID | copy_from_plan_id | quote | hrjx.pmPlan.PmPlan |  |  | nullable |
| 4 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 5 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 6 | curstepid | 当前流程阶段id | curstepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 7 | defineCharacter1 | 基础设置自定义特征 | define_character_001 | UserDefine | hrjx.pmPlan.PlanBasicChar |  |  | nullable |
| 8 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 9 | enable | 启用 | enable | singleOption | bd.systemEnum.sys_intboolean |  |  | nullable,uiDesign |
| 10 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 11 | evaAddRule | 考核对象添加规则id | eva_add_rule | quote | hrcb.rule_bizrule.BizRule |  |  | nullable |
| 12 | fdate | 启动时间 | fdate | timestamp | Timestamp |  |  | nullable |
| 13 | flowDefId | 绩效流程id | flow_def_id | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 14 | flowDefStepId | 当前步骤 | flow_def_step_id | quote | hrjx.pmPhaseFlow.PhaseFlowStep |  |  | nullable |
| 15 | gradeId | 绩效等级ID | grade_id | quote | hrjx.pmCore.Grade |  |  | nullable |
| 16 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 17 | indisetid | 默认指标模板id | indisetid | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 18 | isAutoEnd | 计划是否自动结束 | is_auto_end | int | Integer |  |  | nullable |
| 19 | isEnd | 是否末级 | isEnd | switch | Boolean |  |  | nullable |
| 20 | isPmEnd | 计划是否结束 | is_pm_end | short | Short |  |  | nullable |
| 21 | isProjectBased | 按项目考核 | is_project_based | int | Integer |  |  | nullable |
| 22 | isSumjobs | 是否主兼职汇总 | is_sumjobs | int | Integer |  |  | nullable |
| 23 | isallowmtr | 是否开启中期回顾 | isallowmtr | int | Integer |  |  | nullable |
| 24 | ismergemsg | 待办合并 | ismergemsg | int | Integer |  |  | nullable |
| 25 | isrule | 是否开启时间规则 | isrule | int | Integer |  |  | nullable |
| 26 | issyncstaff | 同步人员子集异步标识 | issyncstaff | int | Integer |  |  | nullable |
| 27 | issynindi | 是否回写指标 | issynindi | int | Integer |  |  | nullable |
| 28 | level | 层级 | level | int | Integer |  |  | nullable |
| 29 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 30 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 31 | orgid | 所属组织 | orgid | quote | org.func.AdminOrg |  |  | data_auth,nullable |
| 32 | parent | 上级分类 | parent_id | long | Long |  |  | nullable |
| 33 | path | 路径 | path | text | String |  |  | nullable |
| 34 | pdate | 绩效发布时间 | pdate | timestamp | Timestamp |  |  | nullable |
| 35 | periodCode | 期间编码 | period_code | text | String |  |  | nullable |
| 36 | periodId | 期间id | period_id | quote | hrjx.pmCore.Period |  |  | nullable |
| 37 | planMode | 方案类型 | plan_mode | int | Integer |  |  | nullable |
| 38 | planName | 计划名称 | plan_name | text | String |  |  | isName,nullable |
| 39 | planState | 方案状态 | plan_state | int | Integer |  |  | nullable |
| 40 | planType | 计划类型 | plan_type | int | Integer |  |  | nullable |
| 41 | pmPlanPhaseRuleList | 试用考核时间规则设置 | - | - | hrjx.pmPlan.PmPlanPhaseRule |  |  |  |
| 42 | pmPlanScopeList | 试用考核适用范围 | - | - | hrjx.pmPlan.PmPlanScope |  |  |  |
| 43 | principalnotice | 被代理人是否接收通知 | principalnotice | int | Integer |  |  | nullable |
| 44 | publishStaffDate | 人员子集发布时间 | publish_staff_date | timestamp | Timestamp |  |  | nullable |
| 45 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 46 | remark | 计划描述 | remark | text | String |  |  | nullable |
| 47 | resultAuditType | 审核方式 | result_audit_type | int | Integer |  |  | nullable |
| 48 | resultTemplateId | 审核模版id | result_template_id | quote | hrjx.pmSheet.Template |  |  | nullable |
| 49 | runtimeDefid | 实例绩效流程id | runtime_defid | quote | hrjx.pmPhaseFlow.PhaseFlowDefRuntime |  |  | nullable |
| 50 | sort | 排序号 | sort_num | int | Integer |  |  | nullable |
| 51 | tagid | 标签id | tagid | text | String |  |  | nullable |
| 52 | tdate | 停止时间 | tdate | timestamp | Timestamp |  |  | nullable |
| 53 | templateId | 绩效模板id | template_id | quote | hrjx.pmSheet.Template |  |  | nullable |
| 54 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 55 | timeRules | 绩效计划时间规则 | - | - | hrjx.pmPlan.PmPlanTimeRule |  |  |  |
| 56 | transferType | 流转方式 | transfer_type | int | Integer |  |  | nullable |
| 57 | vid | 所属组织时间轴id | vid | quote | org.func.AdminOrgTimeline |  |  | nullable |
| 58 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (16)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | copyFromPlanId | 复制绩效计划来源ID | copy_from_plan_id | hrjx.pmPlan.PmPlan |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | curstepid | 当前流程阶段id | curstepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 4 | evaAddRule | 考核对象添加规则id | eva_add_rule | hrcb.rule_bizrule.BizRule |
| 5 | flowDefId | 绩效流程id | flow_def_id | hrjx.pmPhaseFlow.PhaseFlowDef |
| 6 | flowDefStepId | 当前步骤 | flow_def_step_id | hrjx.pmPhaseFlow.PhaseFlowStep |
| 7 | gradeId | 绩效等级ID | grade_id | hrjx.pmCore.Grade |
| 8 | indisetid | 默认指标模板id | indisetid | hrjx.pmSheet.TemplateIndiSet |
| 9 | modifier | 修改人 | modifier | base.user.BipUser |
| 10 | orgid | 所属组织 | orgid | org.func.AdminOrg |
| 11 | periodId | 期间id | period_id | hrjx.pmCore.Period |
| 12 | resultTemplateId | 审核模版id | result_template_id | hrjx.pmSheet.Template |
| 13 | runtimeDefid | 实例绩效流程id | runtime_defid | hrjx.pmPhaseFlow.PhaseFlowDefRuntime |
| 14 | templateId | 绩效模板id | template_id | hrjx.pmSheet.Template |
| 15 | vid | 所属组织时间轴id | vid | org.func.AdminOrgTimeline |
| 16 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enable | 启用 | enable | bd.systemEnum.sys_intboolean |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | timeRules | 绩效计划时间规则 | hrjx.pmPlan.PmPlanTimeRule |
| 2 | pmPlanScopeList | 试用考核适用范围 | hrjx.pmPlan.PmPlanScope |
| 3 | businessList | 绩效计划代理人明细表 | hrjx.pmPlan.PmPlanAgentBusiness |
| 4 | pmPlanPhaseRuleList | 试用考核时间规则设置 | hrjx.pmPlan.PmPlanPhaseRule |

---

## Enum Value Details

### 启用 (enable) -> enable
> Enum: bd.systemEnum.sys_intboolean

| code | value | name |
|------|-------|------|
| 0 | 0 | 停用 |
| 1 | 1 | 启用 |
