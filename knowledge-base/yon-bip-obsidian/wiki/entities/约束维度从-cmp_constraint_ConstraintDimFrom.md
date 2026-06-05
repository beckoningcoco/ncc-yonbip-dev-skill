---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.constraint.ConstraintDimFrom"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 约束维度从 (`cmp.constraint.ConstraintDimFrom`)

> DCRP | 物理表：`cmp_constraint_dim_from`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 约束维度从 |
| 物理表 | `cmp_constraint_dim_from` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:22.5560` |

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
| 3 | `constraintId` | 约束ID | `constraint_id` | 2818292f-74e8-4f44-945f-ce856f03c73c |
| 4 | `productType` | 物料分类 | `product_type` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 5 | `product` | 物料 | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `dimFromDct` | 约束维度自定义项 | `dim_from_dct` | 1904dc91-c333-4d43-99cc-b8aaf6eb0dda |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `dimTo` | 约束维度到 | `` | 2a96417c-b203-49a0-be02-bbe222feb550 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `constraintId` | 约束ID | `cmp.constraint.ChangeOverConstraint` | None | true |
| 2 | `dimTo` | 约束维度到 | `cmp.constraint.ConstraintDimTo` | None | true |
| 3 | `product` | 物料 | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `dimFromDct` | 约束维度自定义项 | `cmp.constraint.ConstraintDimFromDct` | None |  |
| 6 | `productType` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
