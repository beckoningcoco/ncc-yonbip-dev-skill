---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.setting.Color"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 预制档案-颜色 (`cmp.setting.Color`)

> DCRP | 物理表：`cmp_setting_color`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预制档案-颜色 |
| 物理表 | `cmp_setting_color` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:10.3020` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `code` | 编码 | `code` | String |
| 4 | `colorValue` | 颜色值 | `color_value` | String |
| 5 | `useType` | 用途 | `use_type` | String |
| 6 | `serialNo` | 顺序号 | `serial_no` | Decimal |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
