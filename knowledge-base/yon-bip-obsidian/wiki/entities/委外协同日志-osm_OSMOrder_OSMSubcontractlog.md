---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.OSMSubcontractlog"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外协同日志 (`osm.OSMOrder.OSMSubcontractlog`)

> OSM | 物理表：`po_order_subcontract_log`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外协同日志 |
| 物理表 | `po_order_subcontract_log` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:50.1140` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billcode` | 订单号 | `bill_code` | String |
| 2 | `id` | id | `id` | Long |
| 3 | `operStatus` | 处理状态 | `oper_status` | String |
| 4 | `operTime` | 处理时间 | `oper_time` | DateTime |
| 5 | `operType` | 身份 | `oper_type` | Integer |
| 6 | `operUser` | 处理人 | `oper_user` | String |
| 7 | `orderId` | 委外订单id | `order_id` | 823b74a3-0ec8-440f-91a3-fdf94ae2f1bd |
| 8 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `orderId` | 委外订单id | `osm.OSMOrder.OSMOrder` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
