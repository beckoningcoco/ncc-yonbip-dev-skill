---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.dfmCheck.QmsDfmCheckInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验信息 (`QMSDFM.dfmCheck.QmsDfmCheckInfo`)

> QIC | 物理表：`qms_dfm_check_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验信息 |
| 物理表 | `qms_dfm_check_info` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:22.9510` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 检验信息id |

---

## 直接属性（57个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 检验信息id | `id` | Long |
| 3 | `pkDfmCheckRecord` | 检验记录id | `pk_dfm_check_record` | 631cb01f-3080-4010-9744-e5b5bea34d6a |
| 4 | `checkInfoFeature` | 特征 | `checkInfoFeature` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b |
| 5 | `ac` | AC | `ac` | String |
| 6 | `re` | Re | `re` | String |
| 7 | `coord` | 是否协同 | `coord` | Boolean |
| 8 | `inspect_item_name` | 检验项目名称 | `inspect_item_name` | String |
| 9 | `qualify_grade_id` | 质量等级ID | `qualify_grade_id` | 0807260c-f881-4419-9dab-a412fad4e530 |
| 10 | `pk_inspect_detectbasis` | 检测依据 | `pk_inspect_detectbasis` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 11 | `pk_inspect_method` | 检测方法 | `pk_inspect_method` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 12 | `checkInfo_definect` | 检验信息自定义项特征 | `checkInfo_definect` | 48d9c342-c56f-4994-bb88-3ebb0e449e59 |
| 13 | `inspectionitembId` | 检验方案项目信息id | `inspectionitemb_id` | 5b4c30ac-48b7-41ad-9875-0350d15062e2 |
| 14 | `inspectionValueUnit` | 检验值单位 | `inspection_value_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 15 | `samplingUnit` | 取样单位 | `samplingUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 16 | `attacheImage` | 结果图片 | `attache_image` | String |
| 17 | `standardDes` | 内控标准规定 | `standardDes` | String |
| 18 | `inspectvalue_type` | 检验值类型 | `inspectvalue_type` | String |
| 19 | `inspect_type` | 检验方式 | `inspect_type` | String |
| 20 | `index_nature` | 质量指标性质 | `index_nature` | String |
| 21 | `samplePlanType` | 抽样方案 | `samplePlanType` | String |
| 22 | `statutoryStandard` | 法定标准规定 | `statutoryStandard` | String |
| 23 | `checkInfoFeatureCode` | 特征编码 | `checkInfo_feature_code` | String |
| 24 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 25 | `standvalCharacId` | 标准值特征 | `standval_charac_id` | String |
| 26 | `defaInspvalCharacId` | 检验值特征 | `defa_inspval_charac_id` | String |
| 27 | `characRefcode` | 检验值特征参照编码 | `charac_refcode` | String |
| 28 | `dr` | 逻辑删除标记 | `dr` | Short |
| 29 | `inspectvalueUnit` | 计量单位 | `inspectvalue_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 30 | `pkInspectItem` | 检验项目 | `pk_inspect_item` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 31 | `tenant` | 租户ID | `tenant_id` | String |
| 32 | `upstream_id` | 上游id | `upstream_id` | String |
| 33 | `check_number` | 检验数量 | `check_number` | Decimal |
| 34 | `recordValue` | 标准值 | `record_value` | String |
| 35 | `inspectvalueActually` | 检验值 | `inspectvalue_actually` | String |
| 36 | `qualifiedNumber` | 单项合格数量 | `qualified_number` | Decimal |
| 37 | `unqualifiedNumber` | 单项不合格数量 | `unqualified_number` | Decimal |
| 38 | `judgmentResult` | 单项判定结果 | `judgment_result` | String |
| 39 | `rowNum` | 行号 | `row_num` | String |
| 40 | `inspectMaxValue` | 最大值 | `inspect_max_value` | Decimal |
| 41 | `inspectMinValue` | 最小值 | `inspect_min_value` | Decimal |
| 42 | `inspectAvgValue` | 平均值 | `inspect_avg_value` | Decimal |
| 43 | `qualifyGradeResult` | 质量等级 | `qualify_grade_result` | String |
| 44 | `unqualifiedProj` | 不良项目 | `unqualified_proj` | String |
| 45 | `note` | 备注 | `note` | String |
| 46 | `inspector` | 检验员 | `inspector` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 47 | `inspectTime` | 检验时间 | `inspect_time` | DateTime |
| 48 | `createDate` | 创建日期 | `create_date` | Date |
| 49 | `createTime` | 创建时间 | `create_time` | DateTime |
| 50 | `creator` | 创建人名称 | `creator` | String |
| 51 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 52 | `modifier` | 修改人名称 | `modifier` | String |
| 53 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 54 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 55 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 56 | `pubts` | 时间戳 | `pubts` | DateTime |
| 57 | `qmsDfmCheckBadItem` | 不良项目 | `` | 16a8dae3-d5fb-44a0-9a77-e6b49b7d810b |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `inspectionValueUnit` | 检验值单位 | `pc.unit.Unit` | Service |  |
| 3 | `pkInspectItem` | 检验项目 | `QMSDFM.checkProject.checkProject` | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `inspector` | 检验员 | `bd.staff.Staff` | Service |  |
| 7 | `pk_inspect_detectbasis` | 检测依据 | `QMSDFM.detectionbasis.qam_detectionbasis` | None |  |
| 8 | `samplingUnit` | 取样单位 | `pc.unit.Unit` | Service |  |
| 9 | `qmsDfmCheckBadItem` | 不良项目 | `QMSDFM.dfmCheck.QmsDfmCheckBadItem` | None | true |
| 10 | `inspectionitembId` | 检验方案项目信息id | `QMSDFM.inspectionPlan.inspectionItemB` | None |  |
| 11 | `pk_inspect_method` | 检测方法 | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | None |  |
| 12 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | None |  |
| 13 | `inspectvalueUnit` | 计量单位 | `pc.unit.Unit` | Service |  |
| 14 | `pkDfmCheckRecord` | 检验记录id | `QMSDFM.dfmCheck.QmsDfmCheckRecord` | None | true |
| 15 | `checkInfo_definect` | 检验信息自定义项特征 | `QMSDFM.dfmCheck.CheckInfoDefineCharacter` | None |  |
| 16 | `qualify_grade_id` | 质量等级ID | `QMSDFM.qualityGrade.qualityGradeBody` | None |  |
| 17 | `checkInfoFeature` | 特征 | `base.character.Character` | Service |  |
