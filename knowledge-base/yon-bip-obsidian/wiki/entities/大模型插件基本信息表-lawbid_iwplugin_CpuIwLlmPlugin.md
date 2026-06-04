---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.iwplugin.CpuIwLlmPlugin"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 大模型插件基本信息表 (`lawbid.iwplugin.CpuIwLlmPlugin`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_iw_llm_plugin`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 大模型插件基本信息表 |
| 物理表 | `cpu_iw_llm_plugin` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:26:05.7370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:13:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `chatType` | 大模型厂商编码 | `chat_type` | Short |
| 2 | `createdBy` | 创建人 | `created_by` | String |
| 3 | `createdDate` | 创建时间 | `created_date` | DateTime |
| 4 | `dr` | 删除状态 0 有效 1 已删除 | `dr` | Short |
| 5 | `iconOssPath` | 插件图标 | `icon_oss_path` | String |
| 6 | `id` | id | `id` | Long |
| 7 | `lastModifiedBy` | 最后修改人 | `last_modified_by` | String |
| 8 | `lastModifiedDate` | 最后修改时间 | `last_modified_date` | DateTime |
| 9 | `pluginCode` | 插件编码 | `plugin_code` | String |
| 10 | `pluginDescription` | 描述 | `plugin_description` | String |
| 11 | `pluginDocList` | 大模型插件文件表 | `` | f8303dd9-dfd9-4d86-8b33-0dcd20e6b696 |
| 12 | `pluginModel` | 模型 | `plugin_model` | String |
| 13 | `pluginName` | 插件名称 | `plugin_name` | String |
| 14 | `pluginPromptList` | 大模型插件提示语表 | `` | 25336f5a-357d-423a-8730-41b43f957125 |
| 15 | `pluginSetting` | 插件设置 | `plugin_setting` | String |
| 16 | `pluginSort` | 插件排序 | `plugin_sort` | Short |
| 17 | `pluginStatus` | 状态 0 未发布 1 已发布 | `plugin_status` | Short |
| 18 | `pluginType` | 插件类型 | `plugin_type` | Short |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `tempOssPath` | 模板地址 | `temp_oss_path` | String |
| 21 | `welcomeMsg` | 欢迎语 | `welcome_msg` | String |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pluginPromptList` | 大模型插件提示语表 | `lawbid.iwplugin.CpuIwLlmPluginPrompt` | None | true |
| 2 | `pluginDocList` | 大模型插件文件表 | `lawbid.iwplugin.CpuIwLlmPluginDoc` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
