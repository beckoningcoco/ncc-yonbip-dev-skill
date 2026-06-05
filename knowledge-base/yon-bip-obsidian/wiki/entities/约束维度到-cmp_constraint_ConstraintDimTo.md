---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.constraint.ConstraintDimTo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 约束维度到 (`cmp.constraint.ConstraintDimTo`)

> DCRP | 物理表：`cmp_constraint_dim_to`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 约束维度到 |
| 物理表 | `cmp_constraint_dim_to` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 14:00:06.8240` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `bussinessKey` | 业务主键 | `bussiness_key` | String |
| 4 | `constraintFromId` | 约束维度从 | `constraint_from_id` | c9043593-fa55-49bf-b59b-d1aa0dbfbcff |
| 5 | `dimToDct` | 约束维度到自定义项 | `dim_to_dct` | 77c57549-523a-49ce-b0ea-3c11d3e2c075 |
| 6 | `productType` | 物料分类 | `product_type` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 7 | `product` | 物料 | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `changeTime` | 换产时间 | `change_time` | Decimal |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `constraintFromId` | 约束维度从 | `cmp.constraint.ConstraintDimFrom` | None | true |
| 2 | `product` | 物料 | `pc.product.Product` | Service |  |
| 3 | `dimToDct` | 约束维度到自定义项 | `cmp.constraint.ConstraintDimToDct` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `productType` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
