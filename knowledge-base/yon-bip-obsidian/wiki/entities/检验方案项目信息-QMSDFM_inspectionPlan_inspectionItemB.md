---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectionPlan.inspectionItemB"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验方案项目信息 (`QMSDFM.inspectionPlan.inspectionItemB`)

> QIC | 物理表：`qms_dfm_inspectionitemb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验方案项目信息 |
| 物理表 | `qms_dfm_inspectionitemb` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:53.5860` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（56个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `inspectionPlanDetailId` | 检验方案主表id | `inspectionplan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 4 | `standardDes` | 标准描述 | `standardDes` | String |
| 5 | `definect_x` | 检验方案项目信息自定义项 | `definect_x` | 5770a09c-ce1a-42a6-bebb-78a58f685dc3 |
| 6 | `inspectionItem` | 检验项目id | `inspectionItem` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 7 | `rownum` | 行号 | `row_num` | Integer |
| 8 | `note` | 行备注 | `note` | String |
| 9 | `default_inspectvalue` | 默认检验值 | `default_inspectvalue` | String |
| 10 | `coord` | 是否协同 | `coord` | String |
| 11 | `inspectStep` | 质检步骤 | `inspectStep` | Integer |
| 12 | `destroyInspect` | 破坏性检验 | `destroy_inspect` | String |
| 13 | `recordValueType` | 记录样本值方式 | `recordValueType` | String |
| 14 | `pointNumber` | 测点数 | `pointNumber` | Integer |
| 15 | `originalRecordVisible` | 仅原始记录可见 | `originalRecordVisible` | String |
| 16 | `samplingUnit` | 取样单位 | `samplingUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 17 | `defaultUnqualNum` | 单项不合格数默认值 | `default_unqual_num` | Integer |
| 18 | `lineNumber` | 行号 | `row_num` | Integer |
| 19 | `sampleMethodDetailid` | 取样方式主表id | `sample_method_detailid` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 20 | `inspectitemDetailid` | 检验项目主表id | `inspectitem_detailid` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 21 | `statutoryStandard` | 法定标准规定 | `statutoryStandard` | String |
| 22 | `standardFormula` | 标准值公式 | `standard_formula` | String |
| 23 | `standValCharacId` | 标准值引用档案ID | `standval_charac_id` | String |
| 24 | `defaInspValCharacId` | 默认标准值引用档案ID | `defa_inspval_charac_id` | String |
| 25 | `inspectStage` | 适用检验阶段 | `inspect_stage` | String |
| 26 | `inspectionValueUnit` | 检验值单位id | `inspectionValueUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 27 | `keyItem` | 关键项目 | `keyItem` | String |
| 28 | `qualityIndexType` | 质量指标类型 | `qualityIndexType` | String |
| 29 | `inspectionValueType` | 检验值类型 | `inspectionValueType` | String |
| 30 | `standardvalue` | 标准值 | `standardvalue` | String |
| 31 | `recordValue` | 记录样本值 | `recordValue` | String |
| 32 | `samplingMethod` | 取样方式id | `samplingMethod` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 33 | `multipleCheckValue` | 多样本检验值 | `multipleCheckValue` | String |
| 34 | `additionalInspection` | 附加检验 | `additionalInspection` | String |
| 35 | `decimalPlace` | 小数位数 | `decimalPlace` | Integer |
| 36 | `roudingRule` | 修约规则 | `roudingRule` | String |
| 37 | `formula` | 计算公式 | `formula` | String |
| 38 | `inspectionBasic` | 检测依据id | `inspectionBasic` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 39 | `inspectionMethod` | 检测方法id | `inspectionMethod` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 40 | `attachmentId` | 附件id | `attachmentId` | String |
| 41 | `inspectionItemClass` | 检验项目分类id | `inspectionItemClass` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 42 | `vindex` | 显示顺序 | `vindex` | String |
| 43 | `pubts` | 时间戳 | `pubts` | DateTime |
| 44 | `inspectionFrequency` | 检验频次 | `inspectionFrequency` | String |
| 45 | `inspectionValueEnum` | 检验项目枚举 | `inspectionValueEnum` | String |
| 46 | `inspectionPlanID` | 检验方案id | `inspectionPlanID` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 47 | `rid` | 行id | `rid` | String |
| 48 | `defaultItem` | 默认项目 | `defaultItem` | String |
| 49 | `tenant` | 租户ID | `tenant_id` | String |
| 50 | `datasource` | 数据来源 | `datasource` | String |
| 51 | `isAchieve` | 必须达到 | `isAchieve` | String |
| 52 | `dr` | 逻辑删除标记 | `dr` | Short |
| 53 | `instrument` | 仪器 | `instrument` | String |
| 54 | `itemDefines` | 检验项目自定义项 | `` | e69ee522-8adb-49a1-9dfe-507bd4f23e04 |
| 55 | `qmsEquipId` | 仪器设备 | `qms_equip_id` | 3125a9f7-0630-4531-b129-e10d05feb67f |
| 56 | `standardValueList` | 标准值 | `` | 089c8a1d-275b-4bb9-90d0-ab88604ffd04 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `itemDefines` | 检验项目自定义项 | `QMSDFM.inspectionPlan.inspectionItemDefine` | None | true |
| 2 | `inspectionItem` | 检验项目id | `QMSDFM.checkProject.checkProject` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `inspectionValueUnit` | 检验值单位id | `pc.unit.Unit` | Service |  |
| 5 | `samplingUnit` | 取样单位 | `pc.unit.Unit` | Service |  |
| 6 | `definect_x` | 检验方案项目信息自定义项 | `QMSDFM.inspectionPlan.InspectionItemBDefineCharacter` | None |  |
| 7 | `inspectionBasic` | 检测依据id | `QMSDFM.detectionbasis.qam_detectionbasis` | None |  |
| 8 | `qmsEquipId` | 仪器设备 | `QMSDFM.inspectinstrumequip.InspectInstrumEquip` | None |  |
| 9 | `inspectionItemClass` | 检验项目分类id | `QMSDFM.checkProjectClass.checkProjectClass` | None |  |
| 10 | `inspectionPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | None | true |
| 11 | `inspectitemDetailid` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | None |  |
| 12 | `standardValueList` | 标准值 | `QMSDFM.inspectionPlan.standardValue` | None | true |
| 13 | `sampleMethodDetailid` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | None |  |
| 14 | `inspectionPlanID` | 检验方案id | `QMSDFM.inspectionPlan.inspectionPlan` | None |  |
| 15 | `samplingMethod` | 取样方式id | `QMSDFM.sampleMethod.sampleMethod` | None |  |
| 16 | `inspectionMethod` | 检测方法id | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | None |  |
