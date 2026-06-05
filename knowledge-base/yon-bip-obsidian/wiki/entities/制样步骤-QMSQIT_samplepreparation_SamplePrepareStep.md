---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplepreparation.SamplePrepareStep"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 制样步骤 (`QMSQIT.samplepreparation.SamplePrepareStep`)

> QMSQIT | 物理表：`qms_qit_sample_preparation_step`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 制样步骤 |
| 物理表 | `qms_qit_sample_preparation_step` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:55.5490` |

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
| 3 | `samplePreparationId` | 制样单 | `sample_preparation_id` | b9d9cb16-b46a-4b88-a4a6-4340a80072b3 |
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
| 2 | `samplePreparationId` | 制样单 | `QMSQIT.samplepreparation.SamplePreparation` | None | true |
