---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplepreparation.SampleSource"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 样品来源 (`QMSQIT.samplepreparation.SampleSource`)

> QMSQIT | 物理表：`qms_qit_sample_source`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 样品来源 |
| 物理表 | `qms_qit_sample_source` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:46:11.8640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 主键 | `id` | Long |
| 3 | `sampleDetailId` | 制样单样品信息 | `sample_detail_id` | 913fedde-5ffc-489d-8967-aa9b4c6d5c64 |
| 4 | `samplingDetailId` | 取样信息 | `sampling_detail_id` | 8ae568a3-5aa6-44ed-8283-9fe5a36cf435 |
| 5 | `samplingUseNum` | 使用数量 | `sampling_use_num` | Decimal |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `samplingDetailId` | 取样信息 | `QMSQIT.samplerecord.SampleRecord` | None |  |
| 2 | `sampleDetailId` | 制样单样品信息 | `QMSQIT.samplepreparation.SampleDetail` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
