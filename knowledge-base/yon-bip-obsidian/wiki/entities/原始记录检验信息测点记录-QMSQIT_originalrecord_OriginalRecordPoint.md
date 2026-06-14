---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.originalrecord.OriginalRecordPoint"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 原始记录检验信息测点记录 (`QMSQIT.originalrecord.OriginalRecordPoint`)

> QMSQIT | 物理表：`qms_qit_originalrecord_b_point`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 原始记录检验信息测点记录 |
| 物理表 | `qms_qit_originalrecord_b_point` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:48.5360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `originalRecordBId` | 检验信息行id | `originalrecord_b_id` | 2f3c0bbe-d860-4c86-a9ea-e6cb44ee68ea |
| 4 | `sampleId` | 样品id | `sample_id` | 8ae568a3-5aa6-44ed-8283-9fe5a36cf435 |
| 5 | `inspectItemId` | 检验项目id | `inspect_item_id` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 6 | `standardValue` | 标准值 | `standard_value` | String |
| 7 | `inspectMaxValue` | 最大值 | `inspect_max_value` | Decimal |
| 8 | `inspectMinValue` | 最小值 | `inspect_min_value` | Decimal |
| 9 | `inspectAvgValue` | 平均值 | `inspect_avg_value` | Decimal |
| 10 | `meaPointNum` | 测点号 | `meapoint_num` | Decimal |
| 11 | `inspectValue` | 检验值 | `inspect_value` | String |
| 12 | `meaPointInspectResult` | 测点检验结果 | `meapoint_inspect_result` | String |
| 13 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sampleId` | 样品id | `QMSQIT.samplerecord.SampleRecord` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | Service |  |
| 4 | `inspectItemId` | 检验项目id | `QMSDFM.checkProject.checkProject` | Service |  |
| 5 | `originalRecordBId` | 检验信息行id | `QMSQIT.originalrecord.OriginalRecordBody` | None | true |
