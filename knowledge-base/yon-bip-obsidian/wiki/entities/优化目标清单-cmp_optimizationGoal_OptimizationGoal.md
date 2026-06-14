---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.optimizationGoal.OptimizationGoal"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 优化目标清单 (`cmp.optimizationGoal.OptimizationGoal`)

> DCRP | 物理表：`cmp_capacity_optimization_goal`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优化目标清单 |
| 物理表 | `cmp_capacity_optimization_goal` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:16.0470` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `domain` | 领域 | `domain` | String |
| 4 | `application` | 应用 | `application` | String |
| 5 | `code` | 编码 | `code` | String |
| 6 | `name` | 名称 | `name` | String |
| 7 | `description` | 描述 | `description` | String |
| 8 | `algorithmCode` | 算法编码 | `algorithm_code` | String |
| 9 | `isSystem` | 是否系统预制 | `is_system` | Short |
| 10 | `isMustSelect` | 是否必选 | `is_must_select` | Short |
| 11 | `isSelect` | 是否选择 | `is_select` | Short |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `createDate` | 创建日期 | `create_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `creator` | 创建人名称 | `creator` | String |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `enable` | 启用 | `enable` | sys_intboolean |
| 21 | `enablets` | 启用时间 | `enablets` | DateTime |
| 22 | `disablets` | 停用时间 | `disablets` | DateTime |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
