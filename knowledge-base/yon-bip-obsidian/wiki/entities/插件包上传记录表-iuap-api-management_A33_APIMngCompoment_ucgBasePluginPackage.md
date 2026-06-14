---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBasePluginPackage"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 插件包上传记录表 (`iuap-api-management.A33_APIMngCompoment.ucgBasePluginPackage`)

> INPAPI | 物理表：`ucg_base_plugin_package`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 插件包上传记录表 |
| 物理表 | `ucg_base_plugin_package` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:20.9660` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applyTime` | applyTime | `apply_time` | Date |
| 2 | `applyUser` | applyUser | `apply_user` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 3 | `approveMsg` | approveMsg | `approve_msg` | String |
| 4 | `approveStatus` | approveStatus | `approve_status` | String |
| 5 | `approveTime` | approveTime | `approve_time` | Date |
| 6 | `approveType` | approveType | `approve_type` | String |
| 7 | `approveUser` | approveUser | `approve_user` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 8 | `classPath` | classPath | `class_path` | String |
| 9 | `deployResult` | deployResult | `deploy_result` | String |
| 10 | `deployTime` | deployTime | `deploy_time` | Date |
| 11 | `dr` | dr | `dr` | Integer |
| 12 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 13 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 14 | `id` | id | `id` | String |
| 15 | `name` | name | `name` | String |
| 16 | `packagePath` | packagePath | `package_path` | String |
| 17 | `pluginId` | pluginId | `plugin_id` | 0d710585-39b6-4bbd-88cb-04f2484b1020 |
| 18 | `publishContent` | publishContent | `publish_content` | String |
| 19 | `runStatus` | runStatus | `run_status` | String |
| 20 | `version` | version | `version` | String |
| 21 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `applyUser` | applyUser | `base.user.BipUser` | Service |  |
| 2 | `pluginId` | pluginId | `iuap-api-management.A33_APIMngCompoment.ucgBasePluginInfo` | None | true |
| 3 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `approveUser` | approveUser | `base.user.BipUser` | Service |  |
