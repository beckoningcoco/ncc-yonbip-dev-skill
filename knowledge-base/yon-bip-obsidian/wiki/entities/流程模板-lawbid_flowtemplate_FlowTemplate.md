---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.flowtemplate.FlowTemplate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 流程模板 (`lawbid.flowtemplate.FlowTemplate`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_flow_template`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流程模板 |
| 物理表 | `cpu_flow_template` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:54.8500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-05-22 22:09:33:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 模板编号 | `code` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `flowType` | 流程类型 | `flow_type` | String |
| 4 | `id` | ID | `id` | Long |
| 5 | `name` | 模板名称 | `name` | String |
| 6 | `nameResId` | 模板名称多语资源ID | `name_res_id` | String |
| 7 | `nodes` | 流程模板节点 | `` | 7c3e629e-cdc2-4a67-bc02-21efefa1a38e |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `nodes` | 流程模板节点 | `lawbid.flowtemplate.FlowTemplateNode` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
