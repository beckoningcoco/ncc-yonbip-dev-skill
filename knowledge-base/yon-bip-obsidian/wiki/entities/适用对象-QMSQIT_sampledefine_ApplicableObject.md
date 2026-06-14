---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.sampledefine.ApplicableObject"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 适用对象 (`QMSQIT.sampledefine.ApplicableObject`)

> QMSQIT | 物理表：`qms_qit_applicable_object`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用对象 |
| 物理表 | `qms_qit_applicable_object` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:43.1450` |

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
| 3 | `sampleDefineId` | 样品类别定义 | `sample_define_id` | bf808ae5-0ef4-49c7-8560-721d1bceaff2 |
| 4 | `vendor` | 供应商 | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 5 | `operation` | 工序 | `operation` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 6 | `merchant` | 客户 | `merchant` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sampleDefineId` | 样品类别定义 | `QMSQIT.sampledefine.SampleDefine` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `vendor` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 4 | `merchant` | 客户 | `aa.merchant.Merchant` | Service |  |
| 5 | `operation` | 工序 | `ed.operation.Operation` | Service |  |
