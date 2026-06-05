---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.PlanOrderByProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划订单联副产品 (`mr.planworkbench.PlanOrderByProduct`)

> MR | 物理表：`mr_plan_order_byproduct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划订单联副产品 |
| 物理表 | `mr_plan_order_byproduct` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:25.7330` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（43个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `assistUnitId` | 单位 | `assist_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 2 | `auxiliaryQuantity` | 数量 | `auxiliary_quantity` | Decimal |
| 3 | `bomId` | bomId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 4 | `byProductDefineDts` | 自定义项特征组 | `define_cts` | 2ce0cd30-3af5-45d2-a9a5-172cebc156f5 |
| 5 | `byProductFreeCts` | 自由项特征组 | `free_cts` | 75dd0a71-35f3-4a28-ac0b-3ed7a00089b3 |
| 6 | `byProductId` | 行id | `byproduct_id` | 0445cbea-e503-4d98-83bb-4761d390762b |
| 7 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 8 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 9 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 10 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 11 | `denominatorQuantity` | 分母用量 | `denominator_quantity` | Decimal |
| 12 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 13 | `free1` | 规格1 | `free1` | String |
| 14 | `free10` | 规格10 | `free10` | String |
| 15 | `free2` | 规格2 | `free2` | String |
| 16 | `free3` | 规格3 | `free3` | String |
| 17 | `free4` | 规格4 | `free4` | String |
| 18 | `free5` | 规格5 | `free5` | String |
| 19 | `free6` | 规格6 | `free6` | String |
| 20 | `free7` | 规格7 | `free7` | String |
| 21 | `free8` | 规格8 | `free8` | String |
| 22 | `free9` | 规格9 | `free9` | String |
| 23 | `id` | ID | `id` | Long |
| 24 | `mainNumeratorQuantity` | 分子用量(主计量) | `main_numerator_quantity` | Decimal |
| 25 | `mainUnitUseQuantity` | 单位使用数量(主计量) | `main_unit_use_quantity` | Decimal |
| 26 | `materialId` | 制造物料 | `material_id` | Long |
| 27 | `numeratorQuantity` | 分子用量 | `numerator_quantity` | Decimal |
| 28 | `orgId` | 库存组织 | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 29 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 30 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 31 | `planOrderByProductUserdefItem` | 联副产品表固定自定义项 | `` | 407e4014-cb0d-4e42-b6ba-d17481f35aa0 |
| 32 | `planOrderId` | 计划订单ID | `plan_order_id` | 8217afbf-acdc-42ef-a799-75a88d9fa69d |
| 33 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 34 | `productionDate` | 产出日期 | `production_date` | DateTime |
| 35 | `productionType` | 产出类型 | `production_type` | ProductionTypeEnum |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime |
| 37 | `quantity` | 主计量数量 | `quantity` | Decimal |
| 38 | `remark` | 备注 | `remark` | String |
| 39 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 40 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 41 | `unitUseQuantity` | 单位使用数量 | `unit_use_quantity` | Decimal |
| 42 | `warehouseId` | 预入仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 43 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bomId` | bomId | `ed.bom.Bom` | Service |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `byProductFreeCts` | 自由项特征组 | `mr.planworkbench.ByProductFCT` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 6 | `assistUnitId` | 单位 | `pc.unit.Unit` | Service |  |
| 7 | `byProductDefineDts` | 自定义项特征组 | `mr.planworkbench.ByProductDCT` | None |  |
| 8 | `orgId` | 库存组织 | `org.func.InventoryOrg` | Service |  |
| 9 | `byProductId` | 行id | `ed.bom.BomByproduct` | Service |  |
| 10 | `planOrderByProductUserdefItem` | 联副产品表固定自定义项 | `mr.planworkbench.PlanOrderByProductUserdefItem` | None | true |
| 11 | `warehouseId` | 预入仓库 | `aa.warehouse.Warehouse` | Service |  |
| 12 | `planOrderId` | 计划订单ID | `mr.planworkbench.PlanOrder` | None | true |
| 13 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
