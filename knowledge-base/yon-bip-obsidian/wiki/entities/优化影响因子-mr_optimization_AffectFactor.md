---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.optimization.AffectFactor"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 优化影响因子 (`mr.optimization.AffectFactor`)

> MR | 物理表：`mr_opt_affect_factors`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优化影响因子 |
| 物理表 | `mr_opt_affect_factors` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:18:30.3150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `affectId` | 影响因素表ID | `affect_id` | 157c19f9-7acc-495f-b59b-4e4127ce271e |
| 2 | `code` | 影响因子编码 | `code` | String |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `disablets` | 停用时间 | `disablets` | DateTime |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `enable` | 启用 | `enable` | sys_intboolean |
| 10 | `enablets` | 启用时间 | `enablets` | DateTime |
| 11 | `id` | ID | `id` | Long |
| 12 | `isSystem` | 是否系统预置 | `is_system` | Integer |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `name` | 影响因子名称 | `name` | String |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `remark` | 影响因子说明 | `remark` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `affectId` | 影响因素表ID | `mr.optimization.Affect` | None | true |
