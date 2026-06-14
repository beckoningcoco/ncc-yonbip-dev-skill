---
tags: ["BIP", "元数据", "数据字典", "PO", "po.replenishdemand.ReplenishDemandPullCardChildMaterialVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 补货需求拉单卡片(子件物料) (`po.replenishdemand.ReplenishDemandPullCardChildMaterialVO`)

> PO | 物理表：`v_po_replenish_demand_card_child_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 补货需求拉单卡片(子件物料) |
| 物理表 | `v_po_replenish_demand_card_child_material` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:05.9050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` |  |  |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `childMaterialId` | 子件物料id | `child_material_id` | Long |
| 2 | `childProductId` | 子件的物料id | `child_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 3 | `childProductAuth` | 数据权限 | `child_product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 4 | `mainId` | 主表id | `main_id` | c55a0bf3-6302-4657-bc99-39effb0409fb |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `childProductId` | 子件的物料id | `pc.product.Product` | Service |  |
| 3 | `childProductAuth` | 数据权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 4 | `mainId` | 主表id | `po.replenishdemand.ReplenishDemandPullCardVO` | None | true |
