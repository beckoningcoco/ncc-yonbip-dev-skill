---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.equipBom.EquipBomTree"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 设备BOM树 (`pes.equipBom.EquipBomTree`)

> IMP_PES | 物理表：`imp_pes_equip_bom_tree`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 设备BOM树 |
| 物理表 | `imp_pes_equip_bom_tree` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:39.6580` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
| 3 | `productCategoryId` | 产品分类 | `product_category_Id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 4 | `equipCategoryId` | 设备类别 | `eauip_category_Id` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 5 | `equipmentId` | 设备 | `equipment_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 6 | `desc` | 描述 | `desc` | String |
| 7 | `bomId` | 设备BOM | `bom_id` | 86c1accf-1b85-4301-b35f-0980b4d7a9d5 |
| 8 | `id` | 主键 | `id` | Long |
| 9 | `parent` | 父节点 | `parent_id` | 51162cb7-12e5-46a2-9557-a41f5b74d3a8 |
| 10 | `path` | 路径 | `path` | String |
| 11 | `level` | 层级 | `level` | Integer |
| 12 | `sort` | 排序号 | `sort_num` | Integer |
| 13 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 14 | `tenant` | 租户ID | `tenant_id` | String |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `equipPartsInfos` | 设备配件信息 | `` | 1131107b-ee70-4da4-ac1e-cba5834d2eb5 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 父节点 | `pes.equipBom.EquipBomTree` | None |  |
| 2 | `bomId` | 设备BOM | `pes.equipBom.EquipBOMInfo` | None | true |
| 3 | `productCategoryId` | 产品分类 | `pc.cls.ManagementClass` | Service |  |
| 4 | `equipCategoryId` | 设备类别 | `ampub.ambase.CategoryVO` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `equipPartsInfos` | 设备配件信息 | `pes.equipBom.EquipPartsInfo` | None | true |
| 7 | `equipmentId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
