---
tags: ["BIP", "元数据", "数据字典", "PO", "po.exceptioncheck.ExceptionCheck"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 异常检查 (`po.exceptioncheck.ExceptionCheck`)

> PO | 物理表：`po_exception_check`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异常检查 |
| 物理表 | `po_exception_check` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:39.0700` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `exceptionCheckDetail` | 生产管理异常检查详情 | `` | 4b4863cd-9f4e-47e2-80e2-6edb11888d65 |
| 2 | `exceptionQty` | 异常数量 | `exc_qty` | Integer |
| 3 | `id` | ID | `id` | Long |
| 4 | `poExcItem` | 异常项 | `po_exc_item` | Short |
| 5 | `poExcType` | 异常类型 | `po_exc_type` | Short |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `exceptionCheckDetail` | 生产管理异常检查详情 | `po.exceptioncheck.ExceptionCheckDetail` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
