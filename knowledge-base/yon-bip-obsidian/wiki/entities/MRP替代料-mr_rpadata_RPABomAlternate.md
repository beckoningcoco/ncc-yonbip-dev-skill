---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPABomAlternate"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# MRP替代料 (`mr.rpadata.RPABomAlternate`)

> MR | 物理表：`mr_rpa_bom_alternate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | MRP替代料 |
| 物理表 | `mr_rpa_bom_alternate` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:09.8020` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `alternateRatio` | 替代比 | `alternate_ratio` | Decimal |
| 2 | `baMaterialId` | 替代料制造物料Id | `ba_material_id` | Long |
| 3 | `baProductId` | 替代料产品Id | `ba_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 4 | `baSkuId` | 替代制造skuId | `ba_sku_id` | String |
| 5 | `bcMaterialId` | 子项制造物料Id | `bc_material_id` | Long |
| 6 | `bcProductId` | 子项产品Id | `bc_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 7 | `bomAlternateId` | 替代料Id | `bom_alternate_Id` | Long |
| 8 | `bomComponentId` | 子项Id | `bom_component_id` | Long |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 14 | `effectiveDate` | 生效时间 | `effective_date` | DateTime |
| 15 | `expiryDate` | 失效时间 | `expiry_date` | DateTime |
| 16 | `id` | ID | `id` | Long |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `orgId` | 工厂Id | `org_id` | 4ea0642e-e7eb-4171-aa70-e8a0bb77c391 |
| 22 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 23 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `quantity` | 替代数量 | `quantity` | Decimal |
| 26 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 27 | `sequence` | 替代次序 | `sequence` | Integer |
| 28 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 6 | `bcProductId` | 子项产品Id | `pc.product.Product` | Service |  |
| 7 | `baProductId` | 替代料产品Id | `pc.product.Product` | Service |  |
| 8 | `orgId` | 工厂Id | `bd.adminOrg.FactoryOrgVO` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
