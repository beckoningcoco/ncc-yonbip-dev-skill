---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.optimization.Affect"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 优化影响因素 (`mr.optimization.Affect`)

> MR | 物理表：`mr_opt_affect`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优化影响因素 |
| 物理表 | `mr_opt_affect` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:18:26.5050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 影响因素编码 | `code` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `disablets` | 停用时间 | `disablets` | DateTime |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `enable` | 启用 | `enable` | sys_intboolean |
| 9 | `enablets` | 启用时间 | `enablets` | DateTime |
| 10 | `factorList` | 优化影响因子 | `` | d193c2aa-357f-4fda-82c5-fd7f839b2315 |
| 11 | `id` | ID | `id` | Long |
| 12 | `isSystem` | 是否系统预置 | `is_system` | Integer |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `name` | 影响因素名称 | `name` | String |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `remark` | 影响因素说明 | `remark` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `factorList` | 优化影响因子 | `mr.optimization.AffectFactor` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
