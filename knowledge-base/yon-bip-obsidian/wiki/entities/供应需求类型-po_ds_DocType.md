---
tags: ["BIP", "元数据", "数据字典", "po.ds.DocType"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供应需求类型 (`po.ds.DocType`)

>  | 物理表：`po_ds_doctype`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应需求类型 |
| 物理表 | `po_ds_doctype` |
| 数据库 schema | `productionorder` |
| 所属应用 | `` |
| 构建时间 | `2026-06-05 09:34:47.7290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `ds_code` | String |
| 2 | `dsType` | 供需类型 | `ds_type` | String |
| 3 | `enabled` | 是否启用 | `ds_enabled` | Integer |
| 4 | `id` | ID | `id` | Long |
| 5 | `name` | 名称 | `ds_name` | String |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `remark` | 备注 | `ds_remark` | String |
| 8 | `sn` | 顺序号 | `ds_sn` | Integer |
| 9 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
