---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.LLCheckApply.LLCheckInformation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验信息子表 (`QMSQIT.LLCheckApply.LLCheckInformation`)

> QMSQIT | 物理表：`qms_qit_llapply_chcek`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验信息子表 |
| 物理表 | `qms_qit_llapply_chcek` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:40.4500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（71个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `attachmentId` | 附件 | `attachmentId` | String |
| 5 | `coord` | 是否协同 | `coord` | Boolean |
| 6 | `inspectastnum` | 取样数量 | `inspectastnum` | Decimal |
| 7 | `samplingPrecision` | 取样精度 | `samplingPrecision` | Integer |
| 8 | `samplingUnit` | 取样单位Id | `samplingUnit` | String |
| 9 | `samplingUnitName` | 取样单位 | `samplingUnitName` | String |
| 10 | `statutoryStandard` | 法定标准规定 | `statutoryStandard` | String |
| 11 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detailid` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 12 | `inspectStep` | 质检步骤 | `inspectStep` | Integer |
| 13 | `samplePlanType` | 抽样方案类型 | `sample_plan_type` | String |
| 14 | `destroyInspect` | 破坏性检验 | `destroy_inspect` | Short |
| 15 | `sampling` | 取样 | `sampling` | Short |
| 16 | `makingSample` | 制样 | `making_sample` | Short |
| 17 | `originalRecord` | 原始记录 | `original_record` | Short |
| 18 | `inspectionPlanClass` | 检验方案分类id | `inspection_plan_class` | fb967f62-dd79-432d-88d0-aa4789da86d4 |
| 19 | `checkPlan` | 检验方案 | `check_plan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 20 | `inspectstepGroup` | 检验步骤分组 | `inspectstep_group` | String |
| 21 | `inspectstepId` | 检验步骤id | `inspectstep_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 22 | `dynamicInspectPlanId` | 动态检验方案id | `dynamic_inspectplan_id` | f9c8adf8-5485-417b-bb35-f242b0995126 |
| 23 | `dynamicInspectPlanCheckProject` | 动态检验方案检验项目 | `dynamic_inspectplan_check_project` | f926d74c-ff03-4613-b3e0-9162876b39b0 |
| 24 | `standardFormula` | 标准值公式 | `standard_formula` | String |
| 25 | `checkPlanDetailId` | 检验方案主表id | `check_plan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 26 | `isGeneOriRecord` | 已生成原始记录 | `is_gene_ori_record` | Short |
| 27 | `sampleMethodDetailId` | 取样方式主表id | `sample_method_detailid` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 28 | `inspectstepOrder` | 检验步骤顺序 | `inspectstep_order` | Integer |
| 29 | `characRefCode` | 特征参照编码 | `charac_refcode` | String |
| 30 | `standValCharacId` | 标准值特征 | `standval_charac_id` | String |
| 31 | `defaInspValCharacId` | 默认检验值特征 | `defa_inspval_charac_id` | String |
| 32 | `inspectionitembId` | 检验方案项目信息id | `inspectionitemb_id` | 5b4c30ac-48b7-41ad-9875-0350d15062e2 |
| 33 | `standardDes` | 标准描述 | `standard_des` | String |
| 34 | `checkProjectClass_name` | 检验项目分类名称 | `checkProjectClass_name` | String |
| 35 | `definect_information` | 检验信息自定义项特征 | `definect_information` | 201a8f20-347b-492f-b42a-a802137f529b |
| 36 | `vrowno` | 行号 | `rowIndex` | Integer |
| 37 | `checkProject` | 检验项目编码ID | `checkProject` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 38 | `cruxProject` | 关键项目 | `cruxProject` | String |
| 39 | `sampleMethod` | 取样方式ID | `sampleMethod` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 40 | `inspectiontype` | 检验值类型 | `inspectiontype` | String |
| 41 | `qualitynature` | 质量指标性质 | `qualitynature` | String |
| 42 | `standardValue` | 标准值 | `standardValue` | String |
| 43 | `vnote` | 备注 | `vnote` | String |
| 44 | `testBasis` | 检测依据ID | `testBasis` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 45 | `testMethod` | 检测方法ID | `testMethod` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 46 | `additionalSample` | 附加检验 | `additionalSample` | String |
| 47 | `dr` | 逻辑删除标记 | `dr` | Short |
| 48 | `calFormula` | 计算公式 | `calFormula` | String |
| 49 | `sampleValue` | 记录样本值 | `sampleValue` | String |
| 50 | `pubts` | 时间戳 | `pubts` | DateTime |
| 51 | `checkValue` | 多样本检验值 | `checkValue` | String |
| 52 | `rule` | 修约规则 | `rule` | String |
| 53 | `decimalNumber` | 小数位数 | `decimalNumber` | Integer |
| 54 | `inspectionValueEnum` | 检验值枚举 | `inspectionValueEnum` | String |
| 55 | `checkProjectClass` | 检验项目分类ID | `checkProjectClass` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 56 | `inspectionUnit` | 检验值单位ID | `inspectionUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 57 | `flag` | 是否从检验方案带入 | `flag` | String |
| 58 | `standardValue2` | 标准值2 | `standardValue2` | String |
| 59 | `standardValue3` | 标准值3 | `standardValue3` | String |
| 60 | `standardValue1` | 标准值1 | `standardValue1` | String |
| 61 | `standardValue10` | 标准值10 | `standardValue10` | String |
| 62 | `standValueN` | 标准值1N | `standValueN` | String |
| 63 | `standardValue6` | 标准值6 | `standardValue6` | String |
| 64 | `standardValue7` | 标准值7 | `standardValue7` | String |
| 65 | `standardValue4` | 标准值4 | `standardValue4` | String |
| 66 | `standardValue5` | 标准值5 | `standardValue5` | String |
| 67 | `parent_id` | 来料检验申请ID | `parent_id` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 |
| 68 | `standardValue8` | 标准值8 | `standardValue8` | String |
| 69 | `standardValue9` | 标准值9 | `standardValue9` | String |
| 70 | `checkRoom` | 检测室 | `check_room` | 3e356da1-f619-432f-8cac-5aef30828e76 |
| 71 | `defines` | 检验信息子表自定义项 | `` | 05f7a301-0e24-45e8-a8fe-f033bb40af26 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `checkRoom` | 检测室 | `QMSDFM.inspectioncenter.inspectioncenter` | Service |  |
| 2 | `sampleMethod` | 取样方式ID | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
| 3 | `checkProject` | 检验项目编码ID | `QMSDFM.checkProject.checkProject` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `dynamicInspectPlanCheckProject` | 动态检验方案检验项目 | `QMSQIT.dynamicinspectplan.InspectItem` | None |  |
| 6 | `inspectionPlanClass` | 检验方案分类id | `QMSDFM.inspectionPlanClass.inspectionplanclass` | Service |  |
| 7 | `testBasis` | 检测依据ID | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 8 | `checkProjectClass` | 检验项目分类ID | `QMSDFM.checkProjectClass.checkProjectClass` | Service |  |
| 9 | `defines` | 检验信息子表自定义项 | `QMSQIT.LLCheckApply.LLCheckInformationDefine` | None | true |
| 10 | `checkPlan` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 11 | `inspectionitembId` | 检验方案项目信息id | `QMSDFM.inspectionPlan.inspectionItemB` | Service |  |
| 12 | `parent_id` | 来料检验申请ID | `QMSQIT.LLCheckApply.LLCheckApply` | None | true |
| 13 | `definect_information` | 检验信息自定义项特征 | `QMSQIT.LLCheckApply.LLCheckInformationDefineCharacter` | None |  |
| 14 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | Service |  |
| 15 | `testMethod` | 检测方法ID | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | Service |  |
| 16 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | Service |  |
| 17 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 18 | `dynamicInspectPlanId` | 动态检验方案id | `QMSQIT.dynamicinspectplan.DynamicInspectPlan` | None |  |
| 19 | `inspectstepId` | 检验步骤id | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 20 | `inspectionUnit` | 检验值单位ID | `pc.unit.Unit` | Service |  |
