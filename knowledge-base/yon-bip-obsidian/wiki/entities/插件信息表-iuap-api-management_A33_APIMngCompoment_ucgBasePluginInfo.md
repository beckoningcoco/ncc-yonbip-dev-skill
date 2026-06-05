---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBasePluginInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 插件信息表 (`iuap-api-management.A33_APIMngCompoment.ucgBasePluginInfo`)

> INPAPI | 物理表：`ucg_base_plugin_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 插件信息表 |
| 物理表 | `ucg_base_plugin_info` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:54.1160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `classPath` | classPath | `class_path` | String |
| 2 | `code` | code | `code` | String |
| 3 | `configurable` | configurable | `configurable` | Integer |
| 4 | `custom` | custom | `custom` | Integer |
| 5 | `defaultPlugin` | defaultPlugin | `default_plugin` | Integer |
| 6 | `description` | description | `description` | String |
| 7 | `dr` | dr | `dr` | Integer |
| 8 | `expansionConf` | expansionConf | `expansion_conf` | String |
| 9 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 10 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 11 | `id` | id | `id` | String |
| 12 | `isvId` | isvId | `isv_id` | String |
| 13 | `levelApi` | levelApi | `level_api` | Integer |
| 14 | `levelApp` | levelApp | `level_app` | Integer |
| 15 | `levelPublishapp` | levelPublishapp | `level_publishapp` | Integer |
| 16 | `levelSystem` | levelSystem | `level_system` | Integer |
| 17 | `name` | name | `name` | String |
| 18 | `openStatus` | openStatus | `open_status` | Integer |
| 19 | `packagePath` | packagePath | `package_path` | String |
| 20 | `pluginLevel` | pluginLevel | `plugin_level` | String |
| 21 | `pluginType` | pluginType | `plugin_type` | String |
| 22 | `pluginTypeName` | pluginTypeName | `plugin_type_name` | String |
| 23 | `runStatus` | runStatus | `run_status` | String |
| 24 | `runVersion` | runVersion | `run_version` | String |
| 25 | `toDeploy` | toDeploy | `to_deploy` | Integer |
| 26 | `ucgBasePluginPackageList` | 插件包上传记录表 | `` | b3c268ed-4308-4f67-92fe-dec89bf4c35c |
| 27 | `useScene` | useScene | `use_scene` | Integer |
| 28 | `visible` | visible | `visible` | Integer |
| 29 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ucgBasePluginPackageList` | 插件包上传记录表 | `iuap-api-management.A33_APIMngCompoment.ucgBasePluginPackage` | None | true |
| 2 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
