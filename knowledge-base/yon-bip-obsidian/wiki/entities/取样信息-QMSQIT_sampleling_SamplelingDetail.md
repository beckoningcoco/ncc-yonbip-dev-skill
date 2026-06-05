---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.sampleling.SamplelingDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 取样信息 (`QMSQIT.sampleling.SamplelingDetail`)

> QMSQIT | 物理表：`qms_qit_sampleling_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取样信息 |
| 物理表 | `qms_qit_sampleling_detail` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:48.3280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 样品编码 |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `samplelingId` | 取样单 | `sampleling_id` | 8fa335d2-240b-4542-b313-dda2f485b01f |
| 4 | `code` | 样品编码 | `code` | String |
| 5 | `sampleId` | 样品 | `sample_id` | bf808ae5-0ef4-49c7-8560-721d1bceaff2 |
| 6 | `samplelingMeasureUnitid` | 样品计量单位 | `sampleling_measure_unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 7 | `sampleSite` | 取样地点 | `sample_site` | String |
| 8 | `sampleContainer` | 样品容器 | `sample_container` | String |
| 9 | `sampleMorphology` | 样品形态 | `sample_morphology` | String |
| 10 | `sampleUsage` | 样品用途 | `sample_usage` | String |
| 11 | `samplingTime` | 取样时间 | `sampling_time` | DateTime |
| 12 | `sampleMemo` | 样品备注 | `sample_memo` | String |
| 13 | `inspectionScenario` | 检验方案 | `inspection_scenario` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 14 | `userDefineCharacterBody` | 自定义项实体 | `body_dct` | 5917622b-f88b-4595-90f7-789ea27e334f |
| 15 | `multInspectionPlan` | 动态检验方案 | `mult_inspection_plan` | f9c8adf8-5485-417b-bb35-f242b0995126 |
| 16 | `samplingType` | 样品类型 | `sampling_type` | String |
| 17 | `version` | 检验方案版本 | `version` | String |
| 18 | `sampleRecordId` | 样品记录 | `sample_record_id` | 8ae568a3-5aa6-44ed-8283-9fe5a36cf435 |
| 19 | `inspectstepId` | 检验步骤 | `inspectstep_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 20 | `originalRecord` | 原始记录 | `original_record` | Short |
| 21 | `checkPlanDetailId` | 检验方案主表id | `check_plan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 22 | `isRetestSample` | 是否复验样品 | `is_retest_sample` | Short |
| 23 | `inspectStepOrder` | 检验步骤顺序 | `inspect_step_order` | Integer |
| 24 | `samplingPlan` | 取样方案 | `sampling_plan` | 5961aff7-b759-4498-a39b-6aef93301023 |
| 25 | `samplingLocation` | 取样位置 | `sampling_location` | String |
| 26 | `samplingDirection` | 取样方向 | `sampling_direction` | String |
| 27 | `samplingSize` | 取样大小 | `sampling_size` | String |
| 28 | `samplingMemo` | 取样说明 | `sampling_memo` | String |
| 29 | `sampleCapacity` | 样品数量 | `sample_capacity` | Decimal |
| 30 | `dr` | 逻辑删除标记 | `dr` | Short |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime |
| 32 | `inspectionItemsList` | 检验项目 | `` | 973d162b-bbd8-4348-b9d3-e5e1ade1b4ca |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectionScenario` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 2 | `sampleId` | 样品 | `QMSQIT.sampledefine.SampleDefine` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `samplelingMeasureUnitid` | 样品计量单位 | `pc.unit.Unit` | Service |  |
| 5 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 6 | `inspectstepId` | 检验步骤 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 7 | `multInspectionPlan` | 动态检验方案 | `QMSQIT.dynamicinspectplan.DynamicInspectPlan` | None |  |
| 8 | `userDefineCharacterBody` | 自定义项实体 | `QMSQIT.sampleling.SamplelingDetailDCT` | None |  |
| 9 | `sampleRecordId` | 样品记录 | `QMSQIT.samplerecord.SampleRecord` | None |  |
| 10 | `samplelingId` | 取样单 | `QMSQIT.sampleling.Sampleling` | None | true |
| 11 | `samplingPlan` | 取样方案 | `QMSQIT.samplingplan.SamplingPlan` | None |  |
| 12 | `inspectionItemsList` | 检验项目 | `QMSQIT.sampleling.InspectionItems` | None | true |
