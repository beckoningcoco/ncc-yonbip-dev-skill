---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.rejectbill.bspec"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 不良品检验信息 (`QMSQIT.rejectbill.bspec`)

> QMSQIT | 物理表：`qms_qit_rejectbill_spec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 不良品检验信息 |
| 物理表 | `qms_qit_rejectbill_spec` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:29.2980` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（60个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `pk_rejectbill` | 不良品处理单表头id | `pk_rejectbill` | 41f6d3f3-61a7-4bfd-a749-fc8d48b9f4e7 |
| 5 | `attachmentId` | 附件 | `attachmentId` | String |
| 6 | `coord` | 是否协同 | `coord` | Boolean |
| 7 | `feature` | 特征 | `characteristic` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b |
| 8 | `inspectionitembId` | 检验方案项目信息id | `inspectionitemb_id` | 5b4c30ac-48b7-41ad-9875-0350d15062e2 |
| 9 | `badItemFlag` | 不良项目标识 | `badItemFlag` | String |
| 10 | `pk_inspectorder_h` | 检验单id | `pk_inspectorder_h` | 30720069-2233-4271-8edb-a442eaab5e38 |
| 11 | `rownum` | 行号 | `row_num` | Integer |
| 12 | `pk_inspect_itemclass` | 检验项目分类id | `pk_inspect_itemclass` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 13 | `sampleMethodDetailId` | 取样方式主表id | `samplemethod_detail_id` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 14 | `pk_inspect_item` | 检验项目id | `pk_inspect_item` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 15 | `checkPlan` | 检验方案 | `check_plan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 16 | `dynamicInspectPlanId` | 动态检验方案id | `dynamic_inspectplan_check_project` | f9c8adf8-5485-417b-bb35-f242b0995126 |
| 17 | `inspectvalue_unit` | 检验值单位id | `inspectvalue_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 18 | `dynamicInspectPlanCheckProject` | 动态检验方案检验项目 | `dynamic_inspectplan_check_project` | f926d74c-ff03-4613-b3e0-9162876b39b0 |
| 19 | `inspectvalue_type` | 检验值类型 | `inspectvalue_type` | String |
| 20 | `standardFormula` | 标准值公式 | `standard_formula` | String |
| 21 | `index_nature` | 质量指标性质 | `index_nature` | String |
| 22 | `checkPlanDetailId` | 检验方案主表id | `check_plan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 23 | `record_value_b` | 记录样本值 | `record_value_b` | String |
| 24 | `inspectstepOrder` | 检验步骤顺序 | `inspectstep_order` | Integer |
| 25 | `accuracy` | 小数位数 | `accuracy` | Integer |
| 26 | `inspectstepId` | 检验步骤id | `inspectstep_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 27 | `round_off_rule` | 修约规则 | `round_off_rule` | String |
| 28 | `inspectstepGroup` | 检验步骤分组 | `inspectstep_group` | String |
| 29 | `multisample_inspectval_type` | 多样本检验值 | `multisample_inspectval_type` | String |
| 30 | `samplingUnit` | 取样单位id | `sampling_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 31 | `formula` | 计算公式 | `formula` | String |
| 32 | `pk_sample_method` | 取样方式id | `pk_sample_method` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 33 | `spotcheck_rate` | 抽检率 | `spotcheck_rate` | Decimal |
| 34 | `fixed_samples` | 固定抽样数 | `fixed_samples` | Integer |
| 35 | `attach_sample_b` | 附加样本 | `attach_sample_b` | String |
| 36 | `keyitem_b` | 关键项目 | `keyitem_b` | String |
| 37 | `pk_inspect_detectbasis` | 检测依据id | `pk_inspect_detectbasis` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 38 | `pk_inspect_method` | 检测方法id | `pk_inspect_method` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 39 | `standard_value` | 标准值 | `standard_value` | String |
| 40 | `inspectvalue_actually` | 检验值 | `inspectvalue_actually` | String |
| 41 | `ac_value` | AC | `ac_value` | Decimal |
| 42 | `re_value` | RE | `re_value` | Decimal |
| 43 | `qualified_number` | 单项合格数量 | `qualified_number` | Decimal |
| 44 | `unqualified_number` | 单项不合格数量 | `unqualified_number` | Decimal |
| 45 | `inspect_max_value` | 最大值 | `inspect_max_value` | Decimal |
| 46 | `inspect_min_value` | 最小值 | `inspect_min_value` | Decimal |
| 47 | `inspect_avg_value` | 平均值 | `inspect_avg_value` | Decimal |
| 48 | `qualify_grade_result` | 质量等级结果 | `qualify_grade_result` | String |
| 49 | `judgment_result` | 单项判定结果 | `judgment_result` | String |
| 50 | `unqualified_proj` | 不良项目id | `unqualified_proj` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 51 | `inspector` | 检验员id | `inspector` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 52 | `inspectdate` | 检验日期 | `inspectdate` | Date |
| 53 | `inspecttime` | 检验时间 | `inspecttime` | Time |
| 54 | `vnote` | 备注 | `vnote` | String |
| 55 | `pubts` | 时间戳 | `pubts` | DateTime |
| 56 | `dr` | 逻辑删除标记 | `dr` | Short |
| 57 | `inspect_type` | 检验方法 | `inspect_type` | String |
| 58 | `inspectionValueEnum` | 检验值枚举 | `inspectionValueEnum` | String |
| 59 | `check_number` | 检验数量 | `check_number` | Decimal |
| 60 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_inspect_itemclass` | 检验项目分类id | `QMSDFM.checkProjectClass.checkProjectClass` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `inspectvalue_unit` | 检验值单位id | `pc.unit.Unit` | Service |  |
| 4 | `dynamicInspectPlanCheckProject` | 动态检验方案检验项目 | `QMSQIT.dynamicinspectplan.InspectItem` | None |  |
| 5 | `samplingUnit` | 取样单位id | `pc.unit.Unit` | Service |  |
| 6 | `inspector` | 检验员id | `bd.staff.Staff` | Service |  |
| 7 | `pk_inspect_detectbasis` | 检测依据id | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 8 | `checkPlan` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 9 | `inspectionitembId` | 检验方案项目信息id | `QMSDFM.inspectionPlan.inspectionItemB` | Service |  |
| 10 | `pk_inspect_method` | 检测方法id | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | Service |  |
| 11 | `feature` | 特征 | `base.character.Character` | Service |  |
| 12 | `unqualified_proj` | 不良项目id | `QMSDFM.badItems.badItems` | Service |  |
| 13 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | Service |  |
| 14 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | Service |  |
| 15 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 16 | `dynamicInspectPlanId` | 动态检验方案id | `QMSQIT.dynamicinspectplan.DynamicInspectPlan` | None |  |
| 17 | `inspectstepId` | 检验步骤id | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 18 | `pk_inspectorder_h` | 检验单id | `QMSQIT.baseinspectorder.qms_qit_baseinspectorder_h` | None |  |
| 19 | `pk_inspect_item` | 检验项目id | `QMSDFM.checkProject.checkProject` | Service |  |
| 20 | `pk_rejectbill` | 不良品处理单表头id | `QMSQIT.rejectbill.rejectbill` | None | true |
| 21 | `pk_sample_method` | 取样方式id | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
