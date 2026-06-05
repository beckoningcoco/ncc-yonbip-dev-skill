---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.OSMOrderMaterialExpinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单材料扩展信息 (`osm.OSMOrder.OSMOrderMaterialExpinfo`)

> OSM | 物理表：`po_order_material_expinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单材料扩展信息 |
| 物理表 | `po_order_material_expinfo` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:50.7350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 5c389e25-419a-44f6-abfe-4d997d1fcf20 | 生产订单材料表ID |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auxiliaryExcessQty` | 超额应领件数 | `auxiliary_excess_qty` | Decimal |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `excessRate` | 超额比例 | `excess_rate` | Decimal |
| 4 | `isWip` | 在制品 | `is_wip` | Boolean |
| 5 | `sourcePoOrderMaterialId` | 来源生产订单材料ID | `source_po_order_material_id` | Long |
| 6 | `isExcess` | 超额标识 | `is_excess` | Boolean |
| 7 | `designator` | 位置号 | `designator` | String |
| 8 | `wholePoint` | 齐套检查点 | `whole_point` | String |
| 9 | `wipOperationId` | 在制品工序ID | `wip_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 10 | `excessQty` | 超额应领数量 | `excess_qty` | Decimal |
| 11 | `wipOpSn` | 在制品工序顺序号 | `wip_op_sn` | Decimal |
| 12 | `fixedExcessQty` | 固定超额量 | `fixed_excess_qty` | Decimal |
| 13 | `id` | 生产订单材料表ID | `id` | 5c389e25-419a-44f6-abfe-4d997d1fcf20 |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 16 | `excessType` | 超额类型 | `excess_type` | Short |
| 17 | `bomUnitChangeRateDen` | BOM单位换算率分母 | `bom_unit_change_rateden` | Decimal |
| 18 | `bomUnitChangeRateNum` | BOM单位换算率分子 | `bom_unit_change_ratenum` | Decimal |
| 19 | `bomUnitChangeType` | BOM单位换算方式 | `bom_unit_change_type` | ChangeType |
| 20 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 21 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 22 | `ecnLineNo` | 最新变更单行号 | `ecn_line_no` | Decimal |
| 23 | `ecnOrderCode` | 最新变更单号 | `ecn_order_code` | String |
| 24 | `inventoryowner` | 货主ID | `inventory_owner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 25 | `isUpdateStock` | 是否更新存量 | `is_update_stock` | Short |
| 26 | `keySubPart` | 关键子件 | `key_sub_part` | Boolean |
| 27 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 28 | `ownertype` | 货主类型 | `owner_type` | Integer |
| 29 | `stepScrap` | 阶梯损耗 | `step_scrap` | Short |
| 30 | `stepScrapEnd` | 阶梯损耗截止数量 | `step_scrap_end` | Decimal |
| 31 | `stepScrapStart` | 阶梯损耗起始数量 | `step_scrap_start` | Decimal |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `wipOperationId` | 在制品工序ID | `ed.operation.Operation` | Service |  |
| 3 | `id` | 生产订单材料表ID | `osm.OSMOrder.OSMOrderMaterial` | None | true |
| 4 | `inventoryowner` | 货主ID | `st.inventoryowner.InventoryOwner` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
