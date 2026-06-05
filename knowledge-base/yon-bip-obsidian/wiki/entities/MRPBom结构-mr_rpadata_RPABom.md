---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPABom"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# MRPBom结构 (`mr.rpadata.RPABom`)

> MR | 物理表：`mr_rpa_bom`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | MRPBom结构 |
| 物理表 | `mr_rpa_bom` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:00.7040` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（44个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bomComponentId` | bom子项id | `bom_component_id` | Long |
| 2 | `bomId` | bomId | `bom_id` | Long |
| 3 | `bomType` | BOM类型 | `bom_type` | Integer |
| 4 | `createDate` | 创建日期 | `create_date` | Date |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime |
| 6 | `creator` | 创建人名称 | `creator` | String |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 9 | `effectiveDate` | 母件生效时间 | `effective_date` | DateTime |
| 10 | `expiryDate` | 母件失效时间 | `expiry_date` | DateTime |
| 11 | `id` | ID | `id` | Long |
| 12 | `materialId` | 母件制造物料id | `material_id` | Long |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `orgId` | 工厂Id | `org_id` | 4ea0642e-e7eb-4171-aa70-e8a0bb77c391 |
| 18 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 19 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 20 | `productId` | 母件id | `product_id` | Long |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 23 | `scrap` | 母件废品率 | `scrap` | Decimal |
| 24 | `subAdvanceDays` | 子件提前期偏置(天) | `sub_advance_days` | Short |
| 25 | `subAlternateType` | 子件替代方式 | `sub_alternate_type` | Short |
| 26 | `subDenominatorQuantity` | 母件用量 | `sub_denominator_quantity` | Decimal |
| 27 | `subEffectiveDate` | 子件生效时间 | `sub_effective_date` | DateTime |
| 28 | `subEntrustType` | 子件委外供应方式 | `sub_entrust_type` | Short |
| 29 | `subExpiryDate` | 子件失效时间 | `sub_expiry_date` | DateTime |
| 30 | `subIsVirtual` | 子件是否虚拟件 | `sub_is_virtual` | Boolean |
| 31 | `subLossType` | 子件损耗类型 | `sub_loss_type` | Short |
| 32 | `subMaterialId` | 子件制造物料id | `sub_material_id` | Long |
| 33 | `subMustLossQuantity` | 固定损耗 | `sub_must_loss_quantity` | Decimal |
| 34 | `subNumeratorQuantity` | 子件用量 | `sub_numerator_quantity` | Decimal |
| 35 | `subProductId` | 子件id | `sub_product_id` | Long |
| 36 | `subQuantity` | 子件使用数量 | `sub_quantity` | Decimal |
| 37 | `subScrap` | 子件损耗率 | `sub_scrap` | Decimal |
| 38 | `subStockOrgId` | 子件库存组织 | `sub_stock_orgId` | 4ea0642e-e7eb-4171-aa70-e8a0bb77c391 |
| 39 | `subSupplyType` | 子件供应类型(发料方式) | `sub_supply_type` | Integer |
| 40 | `subTruncUp` | 向上取整 | `sub_trunc_up` | Short |
| 41 | `subUsageType` | 子件用量类型 | `sub_usage_type` | Short |
| 42 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 43 | `useType` | 母件用途 | `use_type` | String |
| 44 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 2 | `subStockOrgId` | 子件库存组织 | `bd.adminOrg.FactoryOrgVO` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 7 | `orgId` | 工厂Id | `bd.adminOrg.FactoryOrgVO` | Service |  |
| 8 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
