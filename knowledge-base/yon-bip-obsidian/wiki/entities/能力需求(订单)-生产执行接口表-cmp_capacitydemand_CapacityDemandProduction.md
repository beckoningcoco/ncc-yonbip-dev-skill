---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacitydemand.CapacityDemandProduction"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 能力需求(订单)-生产执行接口表 (`cmp.capacitydemand.CapacityDemandProduction`)

> DCRP | 物理表：`cmp_capacity_demand_production`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 能力需求(订单)-生产执行接口表 |
| 物理表 | `cmp_capacity_demand_production` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:07.0690` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `capacityDemandId` | 能力需求ID | `capacity_demand_id` | c09df742-e522-466c-a5ac-757f34e80092 |
| 5 | `orderType` | 订单类型 | `order_type` | String |
| 6 | `demandId` | 需求ID | `demand_id` | Long |
| 7 | `demandCode` | 需求单号 | `demand_code` | String |
| 8 | `demandLineNo` | 需求行号 | `demand_line_no` | Decimal |
| 9 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 10 | `productionQuantity` | 生产数量 | `production_quantity` | Decimal |
| 11 | `startQuantity` | 开工数量 | `start_quantity` | Decimal |
| 12 | `completeQuantity` | 完工数量 | `complete_quantity` | Decimal |
| 13 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 14 | `scrapReplenishQty` | 报废补单数量 | `scrap_replenish_qty` | Decimal |
| 15 | `unfinishQty` | 未完工数量 | `unfinish_qty` | Decimal |
| 16 | `productionAuxQuantity` | 生产件数 | `production_aux_quantity` | Decimal |
| 17 | `startAuxiliaryQuantity` | 开工件数 | `start_auxiliary_quantity` | Decimal |
| 18 | `completedAuxiliaryQuantity` | 完工件数 | `completed_auxiliary_quantity` | Decimal |
| 19 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 20 | `scrapRepAuxQty` | 报废补单件数 | `scrap_rep_aux_qty` | Decimal |
| 21 | `unfinishAuxQuantity` | 未完工数量 | `unfinish_aux_quantity` | Decimal |
| 22 | `createTime` | 创建时间 | `create_time` | DateTime |
| 23 | `createDate` | 创建日期 | `create_date` | Date |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 26 | `creator` | 创建人名称 | `creator` | String |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `capacityDemandId` | 能力需求ID | `cmp.capacitydemand.CapacityDemand` | None | true |
| 6 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
