---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.mrpconfig.MrpConfig"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划运算配置 (`mr.mrpconfig.MrpConfig`)

> MR | 物理表：`mr_mrp_config`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划运算配置 |
| 物理表 | `mr_mrp_config` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:28.1170` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
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
| 12 | `mrpConfigNodeList` | 计划运算配置节点 | `` | bbfa00e1-c7af-4e7d-b749-40b9de7519d8 |
| 13 | `mrpConfigSDFilterList` | 计划运算取数条件配置 | `` | 8647fd03-52a0-40ce-8176-237185b006ac |
| 14 | `name` | 名称 | `name` | String |
| 15 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 16 | `planId` | 计划名称 | `plan_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 17 | `prefabFlag` | 系统预置 | `prefab_flag` | Boolean |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `remark` | 备注 | `remark` | String |
| 20 | `srcdataid` | 来源数据id | `srcdataid` | Long |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 2 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 3 | `planId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 4 | `mrpConfigSDFilterList` | 计划运算取数条件配置 | `mr.mrpconfig.MrpConfigSDFilter` | None | true |
| 5 | `mrpConfigNodeList` | 计划运算配置节点 | `mr.mrpconfig.MrpConfigNode` | None | true |
| 6 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
