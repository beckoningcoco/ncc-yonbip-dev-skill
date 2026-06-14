---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBasePluginInstance"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 插件实例表 (`iuap-api-management.A33_APIMngCompoment.ucgBasePluginInstance`)

> INPAPI | 物理表：`ucg_base_plugin_instance`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 插件实例表 |
| 物理表 | `ucg_base_plugin_instance` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:44.7500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applicationcode` | applicationcode | `applicationCode` | String |
| 2 | `dr` | dr | `dr` | Integer |
| 3 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 4 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 5 | `id` | id | `id` | String |
| 6 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 7 | `openStatus` | openStatus | `open_status` | Integer |
| 8 | `pluginId` | pluginId | `plugin_id` | String |
| 9 | `required` | required | `required` | Integer |
| 10 | `seq` | seq | `seq` | Integer |
| 11 | `strategyId` | strategyId | `strategy_id` | String |
| 12 | `strategyName` | strategyName | `strategy_name` | String |
| 13 | `superiorId` | superiorId | `superior_id` | String |
| 14 | `superiorLevel` | superiorLevel | `superior_level` | String |
| 15 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
