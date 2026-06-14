---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.originalrecord.OriginalRecordBody"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 原始记录检验信息 (`QMSQIT.originalrecord.OriginalRecordBody`)

> QMSQIT | 物理表：`qms_qit_originalrecord_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 原始记录检验信息 |
| 物理表 | `qms_qit_originalrecord_b` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:16.9360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（61个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `originalRecordId` | 原始记录id | `originalrecord_id` | d380185e-d5f5-439c-8c3e-e88eb07140fd |
| 4 | `judgmentResult` | 单项判定结果 | `judgment_result` | String |
| 5 | `inspectType` | 检验方式 | `inspect_type` | String |
| 6 | `definect_b` | 检验信息自定义项特征 | `definect_b` | f64d918e-c8b2-4d96-85da-88b2d4a9c69f |
| 7 | `dynamicInspectItemId` | 动态检验方案检验项目id | `dynamic_inspectitem_id` | f926d74c-ff03-4613-b3e0-9162876b39b0 |
| 8 | `standardValue` | 标准值1N | `standard_value` | String |
| 9 | `sampleSourceId` | 样品来源单据id | `sample_source_id` | Long |
| 10 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 11 | `sampleMethodDetailId` | 取样方式主表id | `samplemethod_detail_id` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 12 | `sampleSourceCode` | 样品来源单据号 | `sample_source_code` | String |
| 13 | `sampleUseNum` | 样品使用数量 | `sample_use_num` | Decimal |
| 14 | `sampleUnit` | 样品计量单位 | `sample_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 15 | `standValCharacId` | 标准值特征 | `standval_charac_id` | String |
| 16 | `defaInspValCharacId` | 检验值特征 | `defa_inspval_charac_id` | String |
| 17 | `characRefCode` | 特征参照编码 | `charac_refcode` | String |
| 18 | `latestOriRecord` | 最新原始记录 | `latest_ori_record` | Short |
| 19 | `standardDes` | 内控标准规定 | `standard_des` | String |
| 20 | `inspectMaxValue` | 最大值 | `inspect_max_value` | Decimal |
| 21 | `inspectAvgValue` | 平均值 | `inspect_avg_value` | Decimal |
| 22 | `accuracy` | 小数位数 | `accuracy` | Integer |
| 23 | `dr` | 逻辑删除标记 | `dr` | Short |
| 24 | `unqualifiedNumber` | 单项不合格件数 | `unqualified_number` | Decimal |
| 25 | `roundOffRule` | 修约规则 | `round_off_rule` | String |
| 26 | `reinspectReason` | 复检原因 | `reinspect_reason` | String |
| 27 | `standardFormula` | 标准值计算公式 | `standard_formula` | String |
| 28 | `lineNo` | 行号 | `line_no` | Integer |
| 29 | `inspectItemClassId` | 检验项目分类id | `inspectitem_class_id` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 30 | `indexNature` | 质量指标性质 | `index_nature` | String |
| 31 | `inspectDetectBasisId` | 检测依据id | `inspect_detectbasis_id` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 32 | `multiSampleInspectValType` | 多样本检验值 | `multisample_inspectval_type` | String |
| 33 | `spotCheckRate` | 抽检率 | `spotcheck_rate` | Decimal |
| 34 | `fixedSamples` | 固定抽样数 | `fixed_samples` | Integer |
| 35 | `sampleId` | 样品id | `sample_id` | 8ae568a3-5aa6-44ed-8283-9fe5a36cf435 |
| 36 | `attacheImage` | 检验结果图片 | `attache_image` | String |
| 37 | `inspectionItemBId` | 检验方案行id | `inspectionitemb_id` | 5b4c30ac-48b7-41ad-9875-0350d15062e2 |
| 38 | `samplingUnitId` | 取样单位id | `sampling_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 39 | `samplingNumber` | 取样数量 | `sampling_number` | Decimal |
| 40 | `reValue` | RE | `re_value` | Decimal |
| 41 | `statutoryStandard` | 法定标准规定 | `statutory_standard` | String |
| 42 | `inspectItemId` | 检验项目id | `inspect_item_id` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 43 | `inspectMinValue` | 最小值 | `inspect_min_value` | Decimal |
| 44 | `inspectValueType` | 检验值类型 | `inspectvalue_type` | String |
| 45 | `inspectionValueEnum` | 检验值枚举 | `inspection_value_enum` | String |
| 46 | `reinspectProject` | 复验项目 | `reinspect_project` | Short |
| 47 | `sampleMethodId` | 取样方式id | `sample_method_id` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 48 | `inspectValueUnitId` | 检验值单位id | `inspectvalue_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 49 | `qualifyGradeResult` | 质量等级结果 | `qualify_grade_result` | String |
| 50 | `recordValueB` | 记录样本值 | `record_value_b` | String |
| 51 | `meaPointNum` | 测点数 | `meapoint_num` | Decimal |
| 52 | `isReinspectRecord` | 是否复验记录 | `is_reinspectrecord` | Short |
| 53 | `keyItemB` | 关键项目 | `keyitem_b` | String |
| 54 | `pubts` | 时间戳 | `pubts` | DateTime |
| 55 | `inspectMethodId` | 检测方法id | `inspect_method_id` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 56 | `qualifiedNumber` | 单项合格件数 | `qualified_number` | Decimal |
| 57 | `inspectValue` | 检验值 | `inspect_value` | String |
| 58 | `formula` | 检验值计算公式 | `formula` | String |
| 59 | `acValue` | AC | `ac_value` | Decimal |
| 60 | `isNeedReinspect` | 是否需复验 | `is_need_reinspect` | Short |
| 61 | `OriginalRecordPointList` | 原始记录检验信息测点记录 | `` | ee5fdf91-e269-4489-98cb-fedfa3de427c |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectMethodId` | 检测方法id | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | Service |  |
| 2 | `sampleId` | 样品id | `QMSQIT.samplerecord.SampleRecord` | None |  |
| 3 | `sampleMethodId` | 取样方式id | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `definect_b` | 检验信息自定义项特征 | `QMSQIT.originalrecord.OriginalRecordBDefineCharacter` | None |  |
| 6 | `dynamicInspectItemId` | 动态检验方案检验项目id | `QMSQIT.dynamicinspectplan.InspectItem` | None |  |
| 7 | `sampleUnit` | 样品计量单位 | `pc.unit.Unit` | Service |  |
| 8 | `inspectValueUnitId` | 检验值单位id | `pc.unit.Unit` | Service |  |
| 9 | `inspectionItemBId` | 检验方案行id | `QMSDFM.inspectionPlan.inspectionItemB` | Service |  |
| 10 | `originalRecordId` | 原始记录id | `QMSQIT.originalrecord.OriginalRecordHead` | None | true |
| 11 | `samplingUnitId` | 取样单位id | `pc.unit.Unit` | Service |  |
| 12 | `OriginalRecordPointList` | 原始记录检验信息测点记录 | `QMSQIT.originalrecord.OriginalRecordPoint` | None | true |
| 13 | `inspectItemClassId` | 检验项目分类id | `QMSDFM.checkProjectClass.checkProjectClass` | Service |  |
| 14 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | Service |  |
| 15 | `inspectDetectBasisId` | 检测依据id | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 16 | `inspectItemId` | 检验项目id | `QMSDFM.checkProject.checkProject` | Service |  |
| 17 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | Service |  |
