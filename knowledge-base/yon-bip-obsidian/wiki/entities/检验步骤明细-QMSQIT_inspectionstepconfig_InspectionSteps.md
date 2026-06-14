---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.inspectionstepconfig.InspectionSteps"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验步骤明细 (`QMSQIT.inspectionstepconfig.InspectionSteps`)

> QMSQIT | 物理表：`qms_qit_inspection_steps`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验步骤明细 |
| 物理表 | `qms_qit_inspection_steps` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:45.7860` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `stepConfigId` | 检验步骤配置ID | `step_config_id` | d793bf8a-3e9f-444b-a8ac-5f95511b2a46 |
| 4 | `inspectionPlan` | 检验方案 | `inspection_plan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 5 | `inspectionVersion` | 检验方案版本 | `inspection_version` | String |
| 6 | `inspectStepId` | 检验步骤 | `inspect_step_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 7 | `inspectStepOrder` | 检验顺序 | `inspect_step_order` | Integer |
| 8 | `memo` | 备注 | `memo` | String |
| 9 | `inspectionStepsDCT` | 检验步骤明细自定义项 | `inspection_steps_dct` | 7f6224c7-d3cd-4afa-a8f1-068ee3f9c867 |
| 10 | `latestVersion` | 最新版本 | `latest_version` | Short |
| 11 | `sampling` | 取样 | `sampling` | Short |
| 12 | `samplingStage` | 取样环节 | `sampling_stage` | String |
| 13 | `makingSample` | 制样 | `making_sample` | Short |
| 14 | `originalRecord` | 原始记录 | `original_record` | Short |
| 15 | `isExemptedFromInspection` | 未匹配到标准时免检 | `is_exempted_from_inspection` | Short |
| 16 | `inspectionDetailId` | 检验方案主表id | `inspection_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectionDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 2 | `inspectStepId` | 检验步骤 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `stepConfigId` | 检验步骤配置ID | `QMSQIT.inspectionstepconfig.InspectionStepConfig` | None | true |
| 5 | `inspectionPlan` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 6 | `inspectionStepsDCT` | 检验步骤明细自定义项 | `QMSQIT.inspectionstepconfig.InspectionStepsDCT` | None |  |
