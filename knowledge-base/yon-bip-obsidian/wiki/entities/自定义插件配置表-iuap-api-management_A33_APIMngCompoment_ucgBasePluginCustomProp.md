---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBasePluginCustomProp"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 自定义插件配置表 (`iuap-api-management.A33_APIMngCompoment.ucgBasePluginCustomProp`)

> INPAPI | 物理表：`ucg_base_plugin_custom_prop`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自定义插件配置表 |
| 物理表 | `ucg_base_plugin_custom_prop` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:09.4520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | code | `code` | String |
| 2 | `defaultValue` | defaultValue | `default_value` | String |
| 3 | `dr` | dr | `dr` | Integer |
| 4 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 5 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 6 | `id` | id | `id` | String |
| 7 | `name` | name | `name` | String |
| 8 | `required` | required | `required` | Integer |
| 9 | `sort` | sort | `sort` | Integer |
| 10 | `valueType` | valueType | `value_type` | String |
| 11 | `visible` | visible | `visible` | Integer |
| 12 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
