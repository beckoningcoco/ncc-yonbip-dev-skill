---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplerecord.InspectItem"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验项目 (`QMSQIT.samplerecord.InspectItem`)

> QMSQIT | 物理表：`qms_qit_inspect_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验项目 |
| 物理表 | `qms_qit_inspect_item` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:44:02.0600` |

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
| 3 | `sampleRecordId` | 样品记录 | `sample_record_id` | 8ae568a3-5aa6-44ed-8283-9fe5a36cf435 |
| 4 | `inspectionPlanBodyId` | 检验方案项目信息id | `inspection_plan_body_id` | Long |
| 5 | `inspectItemId` | 检验项目 | `inspect_item_id` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 6 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | Service |  |
| 3 | `inspectItemId` | 检验项目 | `QMSDFM.checkProject.checkProject` | Service |  |
| 4 | `sampleRecordId` | 样品记录 | `QMSQIT.samplerecord.SampleRecord` | None | true |
