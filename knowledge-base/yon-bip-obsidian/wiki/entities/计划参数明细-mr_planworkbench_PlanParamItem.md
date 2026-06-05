---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.PlanParamItem"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划参数明细 (`mr.planworkbench.PlanParamItem`)

> MR | 物理表：`mr_plan_param_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划参数明细 |
| 物理表 | `mr_plan_param_item` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:39.1490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `planClassId` | 计划分类 | `plan_class_id` | 5f9b1ee7-d6e8-4ba0-b5d7-6728fa089ae3 |
| 3 | `planParamId` | 计划参数ID | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 4 | `productClassId` | 物料分类 | `product_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 5 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `rootDocId` | 源头单据 | `root_doc_id` | Long |
| 8 | `rootDocLineId` | 源头单据行 | `root_doc_line_id` | Long |
| 9 | `rootDocType` | 源头单据类型 | `root_doc_type` | String |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `planClassId` | 计划分类 | `pc.cls.PlanClass` | Service |  |
| 5 | `planParamId` | 计划参数ID | `mr.planworkbench.PlanParam` | None | true |
