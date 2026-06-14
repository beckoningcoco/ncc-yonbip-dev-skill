---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderMaterialExpinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单材料扩展信息 (`po.order.OrderMaterialExpinfo`)

> PO | 物理表：`po_order_material_expinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单材料扩展信息 |
| 物理表 | `po_order_material_expinfo` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:25:34.3600` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 1b1bb4a9-8a2a-44af-9c61-f22d398ec0b7 | 生产订单材料表ID |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auxiliaryExcessQty` | 超额应领件数 | `auxiliary_excess_qty` | Decimal |
| 2 | `bomUnitChangeRateDen` | BOM单位换算率分母 | `bom_unit_change_rateden` | Decimal |
| 3 | `bomUnitChangeRateNum` | BOM单位换算率分子 | `bom_unit_change_ratenum` | Decimal |
| 4 | `bomUnitChangeType` | BOM单位换算方式 | `bom_unit_change_type` | ChangeType |
| 5 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 6 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 7 | `designator` | 位置号 | `designator` | String |
| 8 | `ecnLineNo` | 最新变更单行号 | `ecn_line_no` | Decimal |
| 9 | `ecnOrderCode` | 最新变更单号 | `ecn_order_code` | String |
| 10 | `excessQty` | 超额应领数量 | `excess_qty` | Decimal |
| 11 | `excessRate` | 超额比例 | `excess_rate` | Decimal |
| 12 | `excessType` | 超额类型 | `excess_type` | Short |
| 13 | `fixedExcessQty` | 固定超额量 | `fixed_excess_qty` | Decimal |
| 14 | `id` | 生产订单材料表ID | `id` | 1b1bb4a9-8a2a-44af-9c61-f22d398ec0b7 |
| 15 | `inventoryowner` | 货主ID | `inventory_owner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 16 | `isExcess` | 超额标识 | `is_excess` | Boolean |
| 17 | `isUpdateStock` | 是否更新存量 | `is_update_stock` | Short |
| 18 | `isWip` | 在制品 | `is_wip` | Boolean |
| 19 | `keySubPart` | 关键子件 | `key_sub_part` | Boolean |
| 20 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 21 | `ownertype` | 货主类型 | `owner_type` | Integer |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `sourcePoOrderMaterialId` | 来源生产订单材料ID | `source_po_order_material_id` | Long |
| 24 | `stepScrap` | 阶梯损耗 | `step_scrap` | Short |
| 25 | `stepScrapEnd` | 阶梯损耗截止数量 | `step_scrap_end` | Decimal |
| 26 | `stepScrapStart` | 阶梯损耗起始数量 | `step_scrap_start` | Decimal |
| 27 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 28 | `wholePoint` | 齐套检查点 | `whole_point` | String |
| 29 | `wipOpSn` | 在制品工序顺序号 | `wip_op_sn` | Decimal |
| 30 | `wipOperationId` | 在制品工序ID | `wip_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 31 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `wipOperationId` | 在制品工序ID | `ed.operation.Operation` | Service |  |
| 3 | `id` | 生产订单材料表ID | `po.order.OrderMaterial` | None | true |
| 4 | `inventoryowner` | 货主ID | `st.inventoryowner.InventoryOwner` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
