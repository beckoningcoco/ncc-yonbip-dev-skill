---
tags: [BIP, metadata, hrjx, Scheme]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 方案信息 (hrjx.pmScheme.Scheme)

> Platform: BIP V5 | Table: pm_scheme | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 方案信息 |
| uri | hrjx.pmScheme.Scheme |
| tableName | pm_scheme |
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
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 树型结构 (ITree) | base.itf.ITree |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (94)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemename | 方案名称 | schemename | multiLanguage | String |  |  | isName,nullable |
| 2 | periodcode | 期间code | periodcode | text | String |  |  | nullable |
| 3 | periodid | 绩效期间id | periodid | quote | hrjx.pmCore.Period |  |  | nullable |
| 4 | applyobj | 适用对象 | applyobj | int | Integer |  |  | nullable |
| 5 | schemestate | 状态 | schemestate | int | Integer |  |  | nullable |
| 6 | fdate | 方案开始时间 | fdate | timestamp | Timestamp |  |  | nullable |
| 7 | tdate | 方案结束时间 | tdate | timestamp | Timestamp |  |  | nullable |
| 8 | orgid | 所属组织id | orgid | quote | org.func.AdminOrg |  |  | nullable |
| 9 | remark | 方案说明 | remark | text | String |  |  | nullable |
| 10 | templateid | 模板id | templateid | quote | hrjx.pmSchemeTemplate.SchemeTemplateVO |  |  | nullable |
| 11 | scoreruleid | 指标评分规则id | scoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 12 | gradeid | 考核结果等级id | gradeid | quote | hrjx.pmCore.Grade |  |  | nullable |
| 13 | scoreway | 总分汇总规则 | scoreway | int | Integer |  |  | nullable |
| 14 | viewresults | 结果查看方式 | viewresults | int | Integer |  |  | nullable |
| 15 | abstentionmode | 评分结束未评分人 | abstentionmode | int | Integer |  |  | nullable |
| 16 | agentschemeid | 代理人方案id | agentschemeid | text | String |  |  | nullable |
| 17 | copyagentschemeid | 方案启动后复制的代理人方案id | copyagentschemeid | text | String |  |  | nullable |
| 18 | indisource | 指标来源 | indisource | int | Integer |  |  | nullable |
| 19 | schememode | 方案类型 | schememode | int | Integer |  |  | nullable |
| 20 | viewauditresults | 结果审核查看 | viewauditresults | int | Integer |  |  | nullable |
| 21 | isindiapprover | 是否按指标设置审核人 | isindiapprover | short | Short |  |  | nullable |
| 22 | isentryresult | 录入考核结果 | isentryresult | switch | Boolean |  |  | nullable |
| 23 | isresultaudited | 考核结果审核 | isresultaudited | switch | Boolean |  |  | nullable |
| 24 | isresultconfirm | 结果需员工确认 | isresultconfirm | switch | Boolean |  |  | nullable |
| 25 | isoverdueconfirm | 是否逾期系统确认 | isoverdueconfirm | switch | Boolean |  |  | nullable |
| 26 | isresultconfirmsign | 结果确认时需手工签名 | isresultconfirmsign | switch | Boolean |  |  | nullable |
| 27 | isallowmtr | 支持中期回顾 | isallowmtr | switch | Boolean |  |  | nullable |
| 28 | isturn | 按轮次顺序打分 | isturn | switch | Boolean |  |  | nullable |
| 29 | ismergemsg | 前面多人时只收到最后一条消息 | ismergemsg | switch | Boolean |  |  | nullable |
| 30 | isdoubleweight | 按指标分类、指标两级设置权重 | isdoubleweight | switch | Boolean |  |  | nullable |
| 31 | ismodifyappr | 允许考核对象修改考核流程 | ismodifyappr | switch | Boolean |  |  | nullable |
| 32 | isshowapprproccess | 是否允许查看过程打分 | isshowapprproccess | switch | Boolean |  |  | nullable |
| 33 | ismainindi | 支持指标多层级 | ismainindi | int | Integer |  |  | nullable |
| 34 | isqualitativeacquisition | 定性指标支持数据采集 | isqualitativeacquisition | switch | Boolean |  |  | nullable |
| 35 | isindiassign | 支持指标指派 | isindiassign | switch | Boolean |  |  | nullable |
| 36 | isallowfillup | 是否允许员工填报 | isallowfillup | switch | Boolean |  |  | nullable |
| 37 | indiconfirm | 指标需员工确认 | indiconfirm | int | Integer |  |  | nullable |
| 38 | indiaudit | 指标需审核 | indiaudit | int | Integer |  |  | nullable |
| 39 | isallowcalc | 是否支持指标评分 | isallowcalc | switch | Boolean |  |  | nullable |
| 40 | ishidehrindi | 定量指标是否隐藏评分明细 | ishidehrindi | short | Short |  |  | nullable |
| 41 | distid | 强分id | distid | quote | hrjx.pmScheme.Distribution |  |  | nullable |
| 42 | issyncstaff | 是否同步人员子集 | issyncstaff | int | Integer |  |  | nullable |
| 43 | parent | 上级分类 | parent | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 44 | level | 层级 | level | int | Integer |  |  | nullable |
| 45 | tagid | 方案类型id | tagid | text | String |  |  | nullable |
| 46 | path | 路径 | path | text | String |  |  | nullable |
| 47 | isauditnomodifysheet | 不允许指标审核人修改考核表 | isauditnomodifysheet | short | Short |  |  | nullable |
| 48 | pdate | 方案发布时间 | pdate | timestamp | Timestamp |  |  | nullable |
| 49 | isEnd | 是否末级 | isEnd | switch | Boolean |  |  | nullable |
| 50 | isPmEnd | 是否结束 | is_pm_end | switch | Boolean |  |  | nullable |
| 51 | pmtemplateid | 绩效模板id | pmtemplateid | quote | hrjx.pmSheet.Template |  |  | nullable |
| 52 | planid | 绩效计划id | planid | quote | hrjx.pmPlan.PmPlan |  |  | nullable |
| 53 | defid | 绩效流程id | defid | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 54 | runtimeDefid | 绩效流程实例id | runtime_defid | quote | hrjx.pmPhaseFlow.PhaseFlowDefRuntime |  |  | nullable |
| 55 | curstepid | 当前状态 | curstepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 56 | nextstepid | 下一状态 | nextstepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 57 | sort | 排序号 | sort_num | int | Integer |  |  | nullable |
| 58 | defaultGauge | 指标默认量表 | default_gauge | text | String |  |  | nullable |
| 59 | silentperson | 静默发布人员 | silentperson | text | String |  |  | nullable |
| 60 | noInvolvedIsExpired | 未填报/未评分人员是否失效 0失效 1生效 | noInvolved_is_expired | int | Integer |  |  | nullable |
| 61 | isindiappraise | 是否按指标设置考核人 | isindiappraise | short | Short |  |  | nullable |
| 62 | isAllowResultAppeal | 是否允许考核对象申诉绩效结果 | is_allow_result_appeal | int | Integer |  |  | nullable |
| 63 | isshowappr | 查看评分明细时隐藏考核人 | isshowappr | int | Integer |  |  | nullable |
| 64 | autoApprove | 指标审核自动通过 | auto_approve | int | Integer |  |  | nullable |
| 65 | leaderNotice | 是否给部门领导发送考核结果通知 | leader_notice | short | Short |  |  | nullable |
| 66 | autoScore | 到期自动评分 | auto_score | int | Integer |  |  | nullable |
| 67 | publishStaffDate | 人员子集发布时间 | publish_staff_date | timestamp | Timestamp |  |  | nullable |
| 68 | define_1 | 字段1 | define_1 | text | String |  |  | nullable |
| 69 | define_2 | 字段2 | define_2 | text | String |  |  | nullable |
| 70 | define_3 | 字段3 | define_3 | text | String |  |  | nullable |
| 71 | define_4 | 字段4 | define_4 | text | String |  |  | nullable |
| 72 | define_5 | 字段5 | define_5 | text | String |  |  | nullable |
| 73 | schemecode | 编码 | schemecode | text | String |  |  | nullable |
| 74 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 75 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 76 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 77 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 78 | id | tid | id | text | String |  |  | nullable,REF.ID,uiHide |
| 79 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 80 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 81 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 82 | EvaObjectList | 考核对象实体 | - | - | hrjx.pmScheme.EvaObject |  |  |  |
| 83 | adjustResultList | 考核结果调整分数 | - | - | hrjx.pmScheme.ResultAdjustScore |  |  |  |
| 84 | adminList | 绩效单元负责人实体 | - | - | hrjx.pmScheme.SchemeAdmin |  |  |  |
| 85 | copyFromSchemeId | 复制来源ID | copy_from_scheme_id | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 86 | entryresultmethods | 录入考核结果方式 | entry_result_methods | int | Integer |  |  | nullable |
| 87 | evaAddRule | 考核对象添加规则id | eva_add_rule | quote | hrcb.rule_bizrule.BizRule |  |  | nullable |
| 88 | gradeAndScoreLinkage | 等级与得分调整联动 | gradeandscorelinkage | short | Short |  |  | nullable |
| 89 | indisetid | 默认指标模板id | indisetid | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 90 | isautostartresultaudit | 评分结束后自动结果审核 | isautostartresultaudit | short | Short |  |  | nullable |
| 91 | isrule | 是否开启时间规则 | isrule | int | Integer |  |  | nullable |
| 92 | noticeAdjustLeader | 通知部门经理参数 | notice_adjust_leader | int | Integer |  |  | nullable |
| 93 | noticeAdjustPerson | 通知员工参数 | notice_adjust_person | int | Integer |  |  | nullable |
| 94 | pmPlanPhaseRuleList | 试用考核时间规则设置虚拟实体 | - | - | hrjx.pmScheme.PmPlanPhaseRuleVirtual |  |  |  |

---

## Reference Fields (19)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | periodid | 绩效期间id | periodid | hrjx.pmCore.Period |
| 2 | orgid | 所属组织id | orgid | org.func.AdminOrg |
| 3 | templateid | 模板id | templateid | hrjx.pmSchemeTemplate.SchemeTemplateVO |
| 4 | scoreruleid | 指标评分规则id | scoreruleid | hrjx.pmCore.ScoreRule |
| 5 | gradeid | 考核结果等级id | gradeid | hrjx.pmCore.Grade |
| 6 | distid | 强分id | distid | hrjx.pmScheme.Distribution |
| 7 | parent | 上级分类 | parent | hrjx.pmScheme.Scheme |
| 8 | pmtemplateid | 绩效模板id | pmtemplateid | hrjx.pmSheet.Template |
| 9 | planid | 绩效计划id | planid | hrjx.pmPlan.PmPlan |
| 10 | defid | 绩效流程id | defid | hrjx.pmPhaseFlow.PhaseFlowDef |
| 11 | runtimeDefid | 绩效流程实例id | runtime_defid | hrjx.pmPhaseFlow.PhaseFlowDefRuntime |
| 12 | curstepid | 当前状态 | curstepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 13 | nextstepid | 下一状态 | nextstepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 14 | creator | 创建人 | creator | base.user.BipUser |
| 15 | modifier | 修改人 | modifier | base.user.BipUser |
| 16 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 17 | copyFromSchemeId | 复制来源ID | copy_from_scheme_id | hrjx.pmScheme.Scheme |
| 18 | evaAddRule | 考核对象添加规则id | eva_add_rule | hrcb.rule_bizrule.BizRule |
| 19 | indisetid | 默认指标模板id | indisetid | hrjx.pmSheet.TemplateIndiSet |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | EvaObjectList | 考核对象实体 | hrjx.pmScheme.EvaObject |
| 2 | adjustResultList | 考核结果调整分数 | hrjx.pmScheme.ResultAdjustScore |
| 3 | adminList | 绩效单元负责人实体 | hrjx.pmScheme.SchemeAdmin |
| 4 | pmPlanPhaseRuleList | 试用考核时间规则设置虚拟实体 | hrjx.pmScheme.PmPlanPhaseRuleVirtual |
