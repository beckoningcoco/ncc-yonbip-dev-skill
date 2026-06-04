---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.iwplugin.CpuIwLlmPluginPrompt"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 大模型插件提示语表 (`lawbid.iwplugin.CpuIwLlmPluginPrompt`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_iw_llm_plugin_prompt`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 大模型插件提示语表 |
| 物理表 | `cpu_iw_llm_plugin_prompt` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:26.6860` |

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

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createdBy` | 创建人 | `created_by` | String |
| 2 | `createdDate` | 创建时间 | `created_date` | DateTime |
| 3 | `dr` | 删除状态 0 有效 1 已删除 | `dr` | Short |
| 4 | `id` | id | `id` | Long |
| 5 | `lastModifiedBy` | 最后修改人 | `last_modified_by` | String |
| 6 | `lastModifiedDate` | 最后修改时间 | `last_modified_date` | DateTime |
| 7 | `pluginId` | 插件主键 | `plugin_id` | f7af0a0e-50da-4989-aa3d-130f40c77aa5 |
| 8 | `prompt` | 提示词 | `prompt` | String |
| 9 | `promptType` | 提示词类型1普通文本 2模板 | `prompt_type` | Short |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `pluginId` | 插件主键 | `lawbid.iwplugin.CpuIwLlmPlugin` | None | true |
