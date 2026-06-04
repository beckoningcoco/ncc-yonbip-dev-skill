---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.flowtemplate.FlowTemplateNode"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 流程模板节点 (`lawbid.flowtemplate.FlowTemplateNode`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_flow_template_node`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流程模板节点 |
| 物理表 | `cpu_flow_template_node` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:23.9070` |

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
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `id` | ID | `id` | Long |
| 3 | `nodeId` | 节点表ID | `node_id` | e3c334b7-b195-425a-b89b-b90794598b01 |
| 4 | `nodeOrder` | 节点执行顺序 | `node_order` | Integer |
| 5 | `nodeStage` | 节点所属阶段 | `node_stage` | Integer |
| 6 | `parentNodeId` | 上级节点表ID | `parent_node_id` | e3c334b7-b195-425a-b89b-b90794598b01 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `templateId` | 模板ID | `template_id` | a0d21d3e-f884-49cc-bc6d-216a97ead94c |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `parentNodeId` | 上级节点表ID | `lawbid.flowtemplate.FlowNode` | None |  |
| 3 | `templateId` | 模板ID | `lawbid.flowtemplate.FlowTemplate` | None | true |
| 4 | `nodeId` | 节点表ID | `lawbid.flowtemplate.FlowNode` | None |  |
