---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplepreparationplan.SamplePreparationStep"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 制样步骤 (`QMSQIT.samplepreparationplan.SamplePreparationStep`)

> QMSQIT | 物理表：`qms_qit_samp_prepare_plan_step`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 制样步骤 |
| 物理表 | `qms_qit_samp_prepare_plan_step` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:46:16.9470` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `SamplePreparationPlanId` | 制样方案 | `sample_preparation_plan_id` | d0c92763-f04e-4002-9fbb-7e88ab1acdf0 |
| 4 | `sampleStepCode` | 制样步骤编码 | `sample_step_name` | String |
| 5 | `sampleStepName` | 制样步骤名称 | `sample_step_code` | String |
| 6 | `samplePreparationMemo` | 制样说明 | `sample_preparation_memo` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `SamplePreparationPlanId` | 制样方案 | `QMSQIT.samplepreparationplan.SamplePreparationPlan` | None | true |
