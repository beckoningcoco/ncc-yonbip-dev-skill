---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.PlanOrderItem"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划订单备料 (`mr.planworkbench.PlanOrderItem`)

> MR | 物理表：`mr_plan_order_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划订单备料 |
| 物理表 | `mr_plan_order_item` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:29.9620` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（71个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 2 | `alternateId` | 替代料Id | `alternate_id` | d380f5d1-7c66-44c1-9dbb-79d14b79fd93 |
| 3 | `alternateRatio` | 替代比 | `alternate_ratio` | Decimal |
| 4 | `alternateType` | 替代方式 | `alternate_type` | Short |
| 5 | `auxiliaryRequirementQuantity` | 需求件数 | `aux_req_quantity` | Decimal |
| 6 | `bomId` | BOM表体ID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 7 | `bomMainQtyFrom` | 母件起始数量 | `bom_main_qty_from` | Decimal |
| 8 | `bomMainQtyTo` | 母件截止数量(含) | `bom_main_qty_to` | Decimal |
| 9 | `bomMaterialId` | 子件Id | `bom_material_id` | Long |
| 10 | `bomRequirementQuantity` | bom需求数量 | `bom_requirement_qty` | Decimal |
| 11 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 12 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 13 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 14 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime |
| 17 | `creator` | 创建人名称 | `creator` | String |
| 18 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `currentStockQuantity` | 库存量 | `current_stock_quantity` | Decimal |
| 20 | `denominatorQuantity` | 分母用量(主计量) | `denominator_quantity` | Decimal |
| 21 | `entrustType` | 委外供应方式 | `entrust_type` | ItemEntrustType |
| 22 | `entrustedSupplyType` | 受托加工供应方式 | `entrusted_supply_type` | entrustedSupplyTypeEnum |
| 23 | `id` | ID | `id` | Long |
| 24 | `inventoryowner` | 货主ID | `inventory_owner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 25 | `itemFreeCharacteristics` | 备料自由特征组实体 | `item_fct` | e6dd4407-1a0f-4d45-a6de-e863da7f02c4 |
| 26 | `itemUserDefineCharacter` | 备料自定义项特征实体 | `item_dct` | 16216312-fa14-4d77-a18b-268247e69457 |
| 27 | `itemUserdefItem` | 备料固定自定义项 | `` | bb46d384-0e8a-42c1-9e56-8f79538fdf5e |
| 28 | `keyComponent` | 关键子件 | `key_component` | Boolean |
| 29 | `keyMaterialGroup` | 替代基准料 | `key_material_group` | Short |
| 30 | `lossType` | 损耗类型 | `loss_type` | Short |
| 31 | `mainMaterial` | 主料 | `main_material` | Short |
| 32 | `materialGroupNo` | 替代料组号 | `material_group_no` | String |
| 33 | `materialId` | 制造物料 | `material_id` | Long |
| 34 | `modifier` | 修改人名称 | `modifier` | String |
| 35 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 37 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 38 | `mustLossQuantity` | 固定损耗 | `must_loss_quantity` | Decimal |
| 39 | `numeratorQuantity` | 分子用量(主计量) | `numerator_quantity` | Decimal |
| 40 | `nwUnitUsageQuantity` | 单位使用数量(不含损耗) | `nw_unit_usage_qty` | Decimal |
| 41 | `ownertype` | 货主类型 | `owner_type` | Integer |
| 42 | `planOrderId` | 计划订单 | `plan_order_id` | 8217afbf-acdc-42ef-a799-75a88d9fa69d |
| 43 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 44 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 45 | `pubts` | 时间戳 | `pubts` | DateTime |
| 46 | `remark` | 备注 | `remark` | String |
| 47 | `reqDate` | 需求日期 | `req_date` | DateTime |
| 48 | `requirementQuantity` | 需求数量 | `req_quantity` | Decimal |
| 49 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 50 | `rowno` | 序号 | `rowno` | Integer |
| 51 | `scrap` | 损耗率 | `scrap` | Decimal |
| 52 | `sequence` | 替代顺序 | `sequence` | Long |
| 53 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 54 | `standardQuantity` | 标准用量 | `standard_qty` | Decimal |
| 55 | `stepLossFlag` | 阶梯损耗 | `step_loss_flag` | Short |
| 56 | `stockDenominatorQuantity` | 分母用量(bom单位) | `stock_denominator_quantity` | Decimal |
| 57 | `stockNumeratorQuantity` | 分子用量(bom单位) | `stock_numerator_quantity` | Decimal |
| 58 | `stockOrgId` | 库存组织id | `i_stock_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 59 | `stockUnitId` | 库存单位Id | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 60 | `stockUsageQuantity` | 单位用量(bom单位) | `stock_usage_quantity` | Decimal |
| 61 | `substituteFlag` | 替代标识 | `substitute_flag` | SubstituteFlag |
| 62 | `supplyType` | 发料方式 | `supply_type` | ItemSupplyType |
| 63 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 64 | `truncUp` | 向上取整 | `trunc_up` | Short |
| 65 | `unitUsageQuantity` | 单位用量（主计量） | `unit_usage_quantity` | Decimal |
| 66 | `usageRatio` | 使用比例 | `usage_ratio` | Decimal |
| 67 | `usageType` | 用量类型 | `usage_type` | ItemUsageTypeEnum |
| 68 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 69 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 70 | `wholeFlag` | 齐套标识 | `whole_flag` | Short |
| 71 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bomId` | BOM表体ID | `ed.bom.Bom` | Service |  |
| 2 | `itemFreeCharacteristics` | 备料自由特征组实体 | `mr.planworkbench.PlanOrderItemFCT` | None |  |
| 3 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 4 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `alternateId` | 替代料Id | `ed.bom.BomAlternate` | Service |  |
| 11 | `itemUserdefItem` | 备料固定自定义项 | `mr.planworkbench.ItemUserdefItem` | None | true |
| 12 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 13 | `stockOrgId` | 库存组织id | `org.func.BaseOrg` | Service |  |
| 14 | `itemUserDefineCharacter` | 备料自定义项特征实体 | `mr.planworkbench.OrderItemDCT` | None |  |
| 15 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 16 | `inventoryowner` | 货主ID | `st.inventoryowner.InventoryOwner` | Service |  |
| 17 | `planOrderId` | 计划订单 | `mr.planworkbench.PlanOrder` | None | true |
| 18 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 19 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 20 | `stockUnitId` | 库存单位Id | `pc.unit.Unit` | Service |  |
