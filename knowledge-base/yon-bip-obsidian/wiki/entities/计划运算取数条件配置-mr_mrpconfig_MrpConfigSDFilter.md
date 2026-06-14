---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.mrpconfig.MrpConfigSDFilter"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划运算取数条件配置 (`mr.mrpconfig.MrpConfigSDFilter`)

> MR | 物理表：`mr_mrp_config_sd_filter`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划运算取数条件配置 |
| 物理表 | `mr_mrp_config_sd_filter` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:01.0750` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `condition` | 过滤条件 | `condition` | String |
| 2 | `configId` | 配置Id | `config_id` | 2e8546a9-4f84-47e0-9162-f137be31dec4 |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `docType` | 供需单据类型 | `doc_type` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 8 | `docTypeCode` | 供需单据类型编码 | `doc_type_code` | String |
| 9 | `enabled` | 启用 | `enabled` | Boolean |
| 10 | `id` | ID | `id` | Long |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `name` | 名称 | `name` | String |
| 16 | `node` | 组件 | `node` | String |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `remark` | 备注 | `remark` | String |
| 19 | `sdType` | 供需类型 | `sd_type` | String |
| 20 | `sequence` | 顺序号 | `sequence` | Decimal |
| 21 | `srcdataid` | 来源数据id | `srcdataid` | Long |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `configId` | 配置Id | `mr.mrpconfig.MrpConfig` | None | true |
| 2 | `docType` | 供需单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
