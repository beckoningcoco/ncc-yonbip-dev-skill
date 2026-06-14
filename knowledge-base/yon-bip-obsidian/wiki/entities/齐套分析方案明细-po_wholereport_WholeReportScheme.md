---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholereport.WholeReportScheme"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析方案明细 (`po.wholereport.WholeReportScheme`)

> PO | 物理表：`po_whole_scheme`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析方案明细 |
| 物理表 | `po_whole_scheme` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:21.1680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `pubts` | 时间戳 | `pubts` | DateTime |
| 2 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 3 | `wholeId` | 齐套分析id | `whole_id` | a8af8064-3e34-4ffe-9eb9-8f289b1aabcc |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `id` | ID | `id` | Long |
| 6 | `orgId` | 库存组织ID | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 7 | `warehouseId` | 仓库ID | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 8 | `isSubcontractW` | 是否委外仓 | `is_subcontract_w` | Boolean |
| 9 | `lineNo` | 行号 | `line_no` | Decimal |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `warehouseId` | 仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `orgId` | 库存组织ID | `org.func.InventoryOrg` | Service |  |
| 4 | `wholeId` | 齐套分析id | `po.wholereport.WholeReport` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
