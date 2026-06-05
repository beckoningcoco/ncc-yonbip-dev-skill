---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPABomByProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# MRP联副产品结构 (`mr.rpadata.RPABomByProduct`)

> MR | 物理表：`mr_rpa_bom_byproduct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | MRP联副产品结构 |
| 物理表 | `mr_rpa_bom_byproduct` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:06.1270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（33个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bPMaterialId` | 联副制造物料Id | `bp_material_id` | Long |
| 2 | `bPProductId` | 联副产品物料Id | `bp_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 3 | `bomId` | bomId | `bom_id` | Long |
| 4 | `byDenominatorQuantity` | 母件底数 | `by_denominator_quantity` | Decimal |
| 5 | `byEffectiveDate` | 联副生效时间 | `by_effective_date` | DateTime |
| 6 | `byExpiryDate` | 联副失效时间 | `by_expiry_date` | DateTime |
| 7 | `byNumeratorQuantity` | 分子用量 | `by_numerator_quantity` | Decimal |
| 8 | `byProductId` | 联副产品Id | `by_product_id` | Long |
| 9 | `byQuantity` | 联副数量 | `by_quantity` | Decimal |
| 10 | `byScrap` | 联副损耗率 | `by_scrap` | Decimal |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 16 | `effectiveDate` | 母件生效时间 | `effective_date` | DateTime |
| 17 | `expiryDate` | 母件失效时间 | `expiry_date` | DateTime |
| 18 | `id` | ID | `id` | Long |
| 19 | `materialId` | 母件制造物料Id | `material_id` | Long |
| 20 | `modifier` | 修改人名称 | `modifier` | String |
| 21 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 24 | `orgId` | 工厂组织 | `org_id` | 4ea0642e-e7eb-4171-aa70-e8a0bb77c391 |
| 25 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 26 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 27 | `productId` | 母件Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 28 | `productionType` | 产出类型 | `production_type` | Integer |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |
| 30 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 31 | `scrap` | 母件废品率 | `scrap` | Decimal |
| 32 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 2 | `productId` | 母件Id | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 7 | `bPProductId` | 联副产品物料Id | `pc.product.Product` | Service |  |
| 8 | `orgId` | 工厂组织 | `bd.adminOrg.FactoryOrgVO` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
