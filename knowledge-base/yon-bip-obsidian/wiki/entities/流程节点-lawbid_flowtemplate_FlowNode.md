---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.flowtemplate.FlowNode"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 流程节点 (`lawbid.flowtemplate.FlowNode`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_flow_node`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流程节点 |
| 物理表 | `cpu_flow_node` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:46.9510` |

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

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billNo` | 节点对应单据编码 | `bill_no` | String |
| 2 | `code` | 节点编号 | `code` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `icon` | 图标 | `icon` | String |
| 5 | `id` | ID | `id` | Long |
| 6 | `name` | 法招节点名称 | `name` | String |
| 7 | `nameResId` | 法招节点名称多语资源ID | `name_res_id` | String |
| 8 | `nodeType` | 节点类别 | `node_type` | String |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `subFlowType` | 节点对应子流程类型 | `sub_flow_type` | String |
| 11 | `unlawbidName` | 非法招节点名称 | `unlawbid_name` | String |
| 12 | `unlawbidNameResId` | 非法招节点名称多语资源ID | `unlawbid_name_res_id` | String |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
