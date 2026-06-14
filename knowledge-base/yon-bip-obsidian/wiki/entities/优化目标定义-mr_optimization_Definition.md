---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.optimization.Definition"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 优化目标定义 (`mr.optimization.Definition`)

> MR | 物理表：`mr_opt_def`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优化目标定义 |
| 物理表 | `mr_opt_def` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:02.3970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `disablets` | 停用时间 | `disablets` | DateTime |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `enable` | 启用 | `enable` | sys_intboolean |
| 9 | `enablets` | 启用时间 | `enablets` | DateTime |
| 10 | `goalList` | 优化目标定义子表 | `` | c12d5c43-7e36-46a8-8660-bc386a8dd4be |
| 11 | `id` | ID | `id` | Long |
| 12 | `isSystem` | 是否系统预置 | `is_system` | Integer |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `name` | 名称 | `name` | String |
| 18 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `remark` | 备注 | `remark` | String |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `goalList` | 优化目标定义子表 | `mr.optimization.DefinitionGoal` | None | true |
| 5 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
