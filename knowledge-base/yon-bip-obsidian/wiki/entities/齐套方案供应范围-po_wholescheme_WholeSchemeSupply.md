---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholescheme.WholeSchemeSupply"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套方案供应范围 (`po.wholescheme.WholeSchemeSupply`)

> PO | 物理表：`po_wholescheme_supply`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套方案供应范围 |
| 物理表 | `po_wholescheme_supply` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:35:45.6130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `orgId` | 库存组织 | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 3 | `wholeSchemeId` | 齐套分析方案id | `whole_scheme_id` | 6be06ae9-de34-4f29-9179-350ede7390b9 |
| 4 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 5 | `isSubcontractW` | 是否是委外仓 | `is_subcontract_w` | Boolean |
| 6 | `lineNo` | 行号 | `line_no` | Decimal |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `wholeSchemeId` | 齐套分析方案id | `po.wholescheme.WholeScheme` | None | true |
| 4 | `orgId` | 库存组织 | `org.func.InventoryOrg` | Service |  |
