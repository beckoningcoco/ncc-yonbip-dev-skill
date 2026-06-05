---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.constraintRule.ConstraintRule"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 约束规则清单 (`cmp.constraintRule.ConstraintRule`)

> DCRP | 物理表：`cmp_capacity_constraint_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 约束规则清单 |
| 物理表 | `cmp_capacity_constraint_rule` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:20.7110` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（25个）

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
| 12 | `constraintType` | 约束类型 | `constraint_type` | String |
| 13 | `appScene` | 应用场景 | `app_scene` | String |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `creator` | 创建人名称 | `creator` | String |
| 19 | `modifier` | 修改人名称 | `modifier` | String |
| 20 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `enable` | 启用 | `enable` | sys_intboolean |
| 23 | `enablets` | 启用时间 | `enablets` | DateTime |
| 24 | `disablets` | 停用时间 | `disablets` | DateTime |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
