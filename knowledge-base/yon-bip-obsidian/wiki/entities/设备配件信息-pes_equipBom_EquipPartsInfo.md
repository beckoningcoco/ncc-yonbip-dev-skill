---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.equipBom.EquipPartsInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 设备配件信息 (`pes.equipBom.EquipPartsInfo`)

> IMP_PES | 物理表：`imp_pes_equip_bom_parts`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 设备配件信息 |
| 物理表 | `imp_pes_equip_bom_parts` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:52.5830` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `productId` | 配件Id | `product_Id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 2 | `vendorId` | 供应商ID | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 3 | `qaDate` | 质保到期日 | `qa_date` | String |
| 4 | `count` | 数量 | `count` | Decimal |
| 5 | `desc` | 描述 | `desc` | String |
| 6 | `bomNodeId` | 设备BOM树节点 | `bom_node_id` | 51162cb7-12e5-46a2-9557-a41f5b74d3a8 |
| 7 | `bomId` | 设备BOM | `bom_id` | 86c1accf-1b85-4301-b35f-0980b4d7a9d5 |
| 8 | `id` | ID | `id` | Long |
| 9 | `tenant` | 租户ID | `tenant_id` | String |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `equipPartsSerialNumbers` | 设备配件序列号 | `` | 64ff09ed-c56e-45a4-8455-bcb3f01621a1 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bomId` | 设备BOM | `pes.equipBom.EquipBOMInfo` | None |  |
| 2 | `productId` | 配件Id | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `equipPartsSerialNumbers` | 设备配件序列号 | `pes.equipBom.EquipPartsSerialNumber` | None | true |
| 5 | `vendorId` | 供应商ID | `aa.vendor.Vendor` | Service |  |
| 6 | `bomNodeId` | 设备BOM树节点 | `pes.equipBom.EquipBomTree` | None | true |
