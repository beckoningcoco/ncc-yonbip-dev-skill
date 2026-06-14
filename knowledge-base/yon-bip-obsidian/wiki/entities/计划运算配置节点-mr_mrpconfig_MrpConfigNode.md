---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.mrpconfig.MrpConfigNode"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划运算配置节点 (`mr.mrpconfig.MrpConfigNode`)

> MR | 物理表：`mr_mrp_config_node`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划运算配置节点 |
| 物理表 | `mr_mrp_config_node` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:15:59.7440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `configId` | 配置Id | `config_id` | 2e8546a9-4f84-47e0-9162-f137be31dec4 |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `enabled` | 启用 | `enabled` | Boolean |
| 7 | `id` | ID | `id` | Long |
| 8 | `modifier` | 修改人名称 | `modifier` | String |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `node` | 组件 | `node` | String |
| 13 | `parentNode` | 上级组件 | `parent_node` | String |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `remark` | 备注 | `remark` | String |
| 16 | `sequence` | 顺序号 | `sequence` | Integer |
| 17 | `srcdataid` | 来源数据id | `srcdataid` | Long |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `configId` | 配置Id | `mr.mrpconfig.MrpConfig` | None | true |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
