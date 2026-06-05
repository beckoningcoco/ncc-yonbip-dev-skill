---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplepreparation.SampleDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 制样信息 (`QMSQIT.samplepreparation.SampleDetail`)

> QMSQIT | 物理表：`qms_qit_sample_preparation_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 制样信息 |
| 物理表 | `qms_qit_sample_preparation_detail` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:50.9230` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 主键 | `id` | Long |
| 3 | `samplePreparationId` | 制样单 | `sample_preparation_id` | b9d9cb16-b46a-4b88-a4a6-4340a80072b3 |
| 4 | `sampleRecordId` | 样品记录 | `sample_record_id` | 8ae568a3-5aa6-44ed-8283-9fe5a36cf435 |
| 5 | `sampleDefineId` | 样品定义 | `sample_define_id` | bf808ae5-0ef4-49c7-8560-721d1bceaff2 |
| 6 | `sampleType` | 样品类型 | `sample_type` | String |
| 7 | `sampleUnit` | 样品计量单位 | `sample_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 8 | `sampleContainer` | 样品容器 | `sample_container` | String |
| 9 | `sampleSize` | 制样大小 | `sample_size` | String |
| 10 | `sampleShape` | 制样样品形态 | `sample_shape` | String |
| 11 | `sampleMemo` | 制样说明 | `sample_memo` | String |
| 12 | `samplingDate` | 制样时间 | `sampling_date` | DateTime |
| 13 | `sampleRemark` | 样品备注 | `sample_remark` | String |
| 14 | `multInspectionPlanId` | 检验方案 | `mult_inspection_plan_id` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 15 | `checkPlanDetailId` | 检验方案主表id | `check_plan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 16 | `bodyDct` | 自定义项实体 | `body_dct` | 948e7fe6-06da-40c5-9bdc-6acbb57d7474 |
| 17 | `inspectStepId` | 检验步骤 | `inspect_step_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 18 | `originalRecord` | 原始记录 | `original_record` | Short |
| 19 | `retestSample` | 是否复验样品 | `retest_sample` | Short |
| 20 | `inspectStepOrder` | 检验步骤顺序 | `inspect_step_order` | Integer |
| 21 | `samplePreparationPlanId` | 制样方案 | `sample_preparation_plan_id` | d0c92763-f04e-4002-9fbb-7e88ab1acdf0 |
| 22 | `dynamicInspectionPlanId` | 动态检验方案id | `dynamic_inspection_plan_id` | f9c8adf8-5485-417b-bb35-f242b0995126 |
| 23 | `sampleCapacity` | 样品数量 | `sample_capacity` | Decimal |
| 24 | `dr` | 逻辑删除标记 | `dr` | Short |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |
| 26 | `sampleInspectionItemList` | 检验项目 | `` | 6e5c16ed-619f-4f74-ab7c-07f9a0594cc4 |
| 27 | `sampleSourceList` | 样品来源 | `` | 350a8aee-f158-459e-86a7-0a392f9ea875 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sampleDefineId` | 样品定义 | `QMSQIT.sampledefine.SampleDefine` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `sampleSourceList` | 样品来源 | `QMSQIT.samplepreparation.SampleSource` | None | true |
| 4 | `samplePreparationId` | 制样单 | `QMSQIT.samplepreparation.SamplePreparation` | None | true |
| 5 | `sampleUnit` | 样品计量单位 | `pc.unit.Unit` | Service |  |
| 6 | `dynamicInspectionPlanId` | 动态检验方案id | `QMSQIT.dynamicinspectplan.DynamicInspectPlan` | None |  |
| 7 | `inspectStepId` | 检验步骤 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 8 | `bodyDct` | 自定义项实体 | `QMSQIT.samplepreparation.SampleDetailDCT` | None |  |
| 9 | `samplePreparationPlanId` | 制样方案 | `QMSQIT.samplepreparationplan.SamplePreparationPlan` | None |  |
| 10 | `multInspectionPlanId` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 11 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 12 | `sampleInspectionItemList` | 检验项目 | `QMSQIT.samplepreparation.SampleInspectionItem` | None | true |
| 13 | `sampleRecordId` | 样品记录 | `QMSQIT.samplerecord.SampleRecord` | None |  |
