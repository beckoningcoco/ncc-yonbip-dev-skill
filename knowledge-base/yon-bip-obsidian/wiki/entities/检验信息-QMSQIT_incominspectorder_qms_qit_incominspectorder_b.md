---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.qms_qit_incominspectorder_b"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验信息 (`QMSQIT.incominspectorder.qms_qit_incominspectorder_b`)

> QMSQIT | 物理表：`qms_qit_incominspectorder_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验信息 |
| 物理表 | `qms_qit_incominspectorder_b` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:35.4560` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（82个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `pk_inspectorder_h` | 检验单id | `pk_inspectorder_h` | d4ef5893-2422-4c08-8e7e-df2087db7a8f |
| 5 | `pk_inspect_item` | 检验项目id | `pk_inspect_item` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 6 | `badItemFlag` | 不良项目标识 | `badItemFlag` | String |
| 7 | `definect_b` | 检验信息自定义项特征实体 | `definect_b` | 887f1fe9-a4d1-473d-853f-fa48808af8e1 |
| 8 | `rownum` | 行号 | `row_num` | Integer |
| 9 | `pk_inspect_itemclass` | 检验项目分类id | `pk_inspect_itemclass` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 10 | `standardDes` | 内控标准规定 | `standard_des` | String |
| 11 | `samplingUnitName` | 取样单位 | `samplingUnitName` | String |
| 12 | `inspectionitembId` | 检验方案项目信息id | `inspectionitemb_id` | 5b4c30ac-48b7-41ad-9875-0350d15062e2 |
| 13 | `samplePlanType` | 抽样方案类型 | `sample_plan_type` | String |
| 14 | `destroyInspect` | 破坏性检验 | `destroy_inspect` | Short |
| 15 | `inspectStep` | 质检步骤 | `inspectStep` | Integer |
| 16 | `attacheImage` | 结果图片 | `attacheImage` | String |
| 17 | `checkPlan` | 检验方案 | `check_plan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 18 | `dynamicInspectPlanId` | 动态检验方案 | `dynamic_inspectplan_id` | f9c8adf8-5485-417b-bb35-f242b0995126 |
| 19 | `dynamicInspectPlanCheckProject` | 动态检验方案检验项目 | `dynamic_inspectplan_check_project` | f926d74c-ff03-4613-b3e0-9162876b39b0 |
| 20 | `standardFormula` | 标准值公式 | `standard_formula` | String |
| 21 | `checkPlanDetailId` | 检验方案主表id | `check_plan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 22 | `inspectstepGroup` | 检验步骤分组 | `inspectstep_group` | String |
| 23 | `inspectstepId` | 检验步骤id | `inspectstep_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 24 | `feature_code` | 特征编码 | `characteristic_code` | String |
| 25 | `standValCharacId` | 标准值特征 | `standval_charac_id` | String |
| 26 | `defaInspValCharacId` | 检验值特征 | `defa_inspval_charac_id` | String |
| 27 | `characRefCode` | 特征参照编码 | `charac_refcode` | String |
| 28 | `samplePlanId` | 抽样计划 | `sample_plan_id` | 5539bfee-9f1a-4ea1-84d3-fc996d2426c4 |
| 29 | `inspectstepOrder` | 检验步骤顺序 | `inspectstep_order` | Integer |
| 30 | `sampleMethodDetailId` | 取样方式主表id | `samplemethod_detail_id` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 31 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 32 | `inspect_cpk_value` | CPK | `inspect_cpk_value` | Decimal |
| 33 | `attachmentId` | 附件 | `attachmentId` | String |
| 34 | `samplingUnit` | 取样单位id | `samplingUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 35 | `statutoryStandard` | 法定标准规定 | `statutory_standard` | String |
| 36 | `coord` | 是否协同 | `coord` | Boolean |
| 37 | `feature` | 特征 | `characteristic` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b |
| 38 | `judgmentState` | 单项判定状态 | `judgment_state` | Short |
| 39 | `inspectvalue_unit` | 检验值单位id | `inspectvalue_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 40 | `keyitem_b` | 关键项目 | `keyitem_b` | String |
| 41 | `pk_sample_method` | 取样方式id | `pk_sample_method` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 42 | `spotcheck_rate` | 抽检率(%) | `spotcheck_rate` | Decimal |
| 43 | `fixed_samples` | 固定抽样数 | `fixed_samples` | Integer |
| 44 | `standard_value` | 标准值 | `standard_value` | String |
| 45 | `inspectvalue_actually` | 检验值 | `inspectvalue_actually` | String |
| 46 | `record_value_b` | 记录样本值 | `record_value_b` | String |
| 47 | `check_number` | 检验数量 | `check_number` | Decimal |
| 48 | `qualified_number` | 单项合格数量 | `qualified_number` | Decimal |
| 49 | `unqualified_number` | 单项不合格数量 | `unqualified_number` | Decimal |
| 50 | `unqualified_proj` | 不良项目id | `unqualified_proj` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 51 | `judgment_result` | 单项判定结果 | `judgment_result` | String |
| 52 | `ac_value` | AC | `ac_value` | Decimal |
| 53 | `re_value` | RE | `re_value` | Decimal |
| 54 | `inspect_min_value` | 最小值 | `inspect_min_value` | Decimal |
| 55 | `inspect_max_value` | 最大值 | `inspect_max_value` | Decimal |
| 56 | `inspect_avg_value` | 平均值 | `inspect_avg_value` | Decimal |
| 57 | `index_nature` | 质量指标性质 | `index_nature` | String |
| 58 | `accuracy` | 小数位数 | `accuracy` | Integer |
| 59 | `round_off_rule` | 修约规则 | `round_off_rule` | String |
| 60 | `multisample_inspectval_type` | 多样本检验值 | `multisample_inspectval_type` | String |
| 61 | `formula` | 计算公式 | `formula` | String |
| 62 | `attach_sample_b` | 附加样本 | `attach_sample_b` | String |
| 63 | `pk_inspect_detectbasis` | 检测依据id | `pk_inspect_detectbasis` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 64 | `pk_inspect_method` | 检测方法id | `pk_inspect_method` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 65 | `qualify_grade_result` | 质量等级结果 | `qualify_grade_result` | String |
| 66 | `inspector` | 检验员id | `inspector` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 67 | `inspectdate` | 检验日期 | `inspectdate` | Date |
| 68 | `inspecttime` | 检验时间 | `inspecttime` | DateTime |
| 69 | `vnote` | 备注 | `vnote` | String |
| 70 | `inspectvalue_type` | 检验值类型 | `inspectvalue_type` | String |
| 71 | `inspectionValueEnum` | 检验值枚举 | `inspectionValueEnum` | String |
| 72 | `inspect_type` | 检验方式 | `inspect_type` | String |
| 73 | `pubts` | 时间戳 | `pubts` | DateTime |
| 74 | `dr` | 逻辑删除标记 | `dr` | Short |
| 75 | `incom_b_define` | 检验信息自定义项 | `` | b824a21e-a4c5-4ae6-b806-2761eff3957c |
| 76 | `matchDegree` | 匹配度 | `match_degree` | Short |
| 77 | `matchDesc` | 匹配说明 | `match_desc` | String |
| 78 | `qmsEquipId` | 检验仪器设备 | `qms_equip_id` | 3125a9f7-0630-4531-b129-e10d05feb67f |
| 79 | `qms_qit_bad_itemsList` | 检验信息不良项目详情 | `` | 02b9ec59-0634-4ca4-996e-4101ba1bc590 |
| 80 | `qms_qit_inspectorder_sim_recordList_fixed2` | 样本记录 | `` | d0e223b4-98ed-4ee6-8edc-451047aa8a18 |
| 81 | `sourceFile` | 来源文件 | `source_file` | String |
| 82 | `sourceFileID` | 来源文件ID | `source_file_id` | String |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `definect_b` | 检验信息自定义项特征实体 | `QMSQIT.incominspectorder.IncomInspectOrderBDefineCharacter` | None |  |
| 2 | `qms_qit_inspectorder_sim_recordList_fixed2` | 样本记录 | `QMSQIT.incominspectorder.IncomInspectOrderSimRecord` | None | true |
| 3 | `incom_b_define` | 检验信息自定义项 | `QMSQIT.incominspectorder.incom_b_define` | None | true |
| 4 | `dynamicInspectPlanCheckProject` | 动态检验方案检验项目 | `QMSQIT.dynamicinspectplan.InspectItem` | None |  |
| 5 | `pk_inspect_detectbasis` | 检测依据id | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 6 | `samplePlanId` | 抽样计划 | `QMSDFM.samplePlan.SamplePlan` | Service |  |
| 7 | `checkPlan` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 8 | `inspectionitembId` | 检验方案项目信息id | `QMSDFM.inspectionPlan.inspectionItemB` | Service |  |
| 9 | `feature` | 特征 | `base.character.Character` | Service |  |
| 10 | `unqualified_proj` | 不良项目id | `QMSDFM.badItems.badItems` | Service |  |
| 11 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | Service |  |
| 12 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | Service |  |
| 13 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 14 | `dynamicInspectPlanId` | 动态检验方案 | `QMSQIT.dynamicinspectplan.DynamicInspectPlan` | None |  |
| 15 | `qms_qit_bad_itemsList` | 检验信息不良项目详情 | `QMSQIT.incominspectorder.qms_qit_incom_bad_items_b` | None | true |
| 16 | `pk_inspect_itemclass` | 检验项目分类id | `QMSDFM.checkProjectClass.checkProjectClass` | Service |  |
| 17 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 18 | `inspectvalue_unit` | 检验值单位id | `pc.unit.Unit` | Service |  |
| 19 | `samplingUnit` | 取样单位id | `pc.unit.Unit` | Service |  |
| 20 | `inspector` | 检验员id | `bd.staff.Staff` | Service |  |
| 21 | `qmsEquipId` | 检验仪器设备 | `QMSDFM.inspectinstrumequip.InspectInstrumEquip` | Service |  |
| 22 | `pk_inspect_method` | 检测方法id | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | Service |  |
| 23 | `inspectstepId` | 检验步骤id | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 24 | `pk_inspectorder_h` | 检验单id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_h` | None | true |
| 25 | `pk_inspect_item` | 检验项目id | `QMSDFM.checkProject.checkProject` | Service |  |
| 26 | `pk_sample_method` | 取样方式id | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
