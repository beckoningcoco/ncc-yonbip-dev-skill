---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucg_measure_rule"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计量规则表 (`iuap-api-management.A33_APIMngCompoment.ucg_measure_rule`)

> INPAPI | 物理表：`ucg_measure_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计量规则表 |
| 物理表 | `ucg_measure_rule` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:37.5180` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `effective_date_begin` | effective_date_begin | `effective_date_begin` | Date |
| 2 | `effective_date_end` | effective_date_end | `effective_date_end` | Date |
| 3 | `id` | id | `id` | String |
| 4 | `name` | name | `name` | String |
| 5 | `speed_factor` | speed_factor | `speed_factor` | Decimal |
| 6 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
