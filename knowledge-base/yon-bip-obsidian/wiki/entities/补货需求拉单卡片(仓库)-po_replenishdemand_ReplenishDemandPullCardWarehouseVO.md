---
tags: ["BIP", "元数据", "数据字典", "PO", "po.replenishdemand.ReplenishDemandPullCardWarehouseVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 补货需求拉单卡片(仓库) (`po.replenishdemand.ReplenishDemandPullCardWarehouseVO`)

> PO | 物理表：`v_po_replenish_demand_card_warehouse`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 补货需求拉单卡片(仓库) |
| 物理表 | `v_po_replenish_demand_card_warehouse` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:12.2550` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` |  |  |

---

## 直接属性（3个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `warehouseId` | 仓库Id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 2 | `mainId` | 主表id | `main_id` | c55a0bf3-6302-4657-bc99-39effb0409fb |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `warehouseId` | 仓库Id | `aa.warehouse.Warehouse` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `mainId` | 主表id | `po.replenishdemand.ReplenishDemandPullCardVO` | None | true |
