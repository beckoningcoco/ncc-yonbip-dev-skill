---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.partsTree.PartsDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 配件树模型配件信息 (`pes.partsTree.PartsDetail`)

> IMP_PES | 物理表：`imp_pes_parts_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配件树模型配件信息 |
| 物理表 | `imp_pes_parts_detail` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:56.2190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `productId` | 配件Id | `product_Id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 2 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 3 | `count` | 数量 | `count` | Decimal |
| 4 | `desc` | 描述 | `desc` | String |
| 5 | `partsNodeId` | 配件树模型节点 | `parts_node_id` | aebac340-12aa-4ebf-975f-919001321347 |
| 6 | `id` | ID | `id` | Long |
| 7 | `tenant` | 租户ID | `tenant_id` | String |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 配件Id | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `partsNodeId` | 配件树模型节点 | `pes.partsTree.PartsTreeModel` | None | true |
| 4 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
