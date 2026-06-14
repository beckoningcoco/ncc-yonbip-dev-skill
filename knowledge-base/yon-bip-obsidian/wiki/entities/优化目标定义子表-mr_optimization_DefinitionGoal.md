---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.optimization.DefinitionGoal"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 优化目标定义子表 (`mr.optimization.DefinitionGoal`)

> MR | 物理表：`mr_opt_def_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优化目标定义子表 |
| 物理表 | `mr_opt_def_item` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:18:03.8580` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `defId` | 主表ID | `def_id` | fe030cee-cec2-4f26-a2ff-531fb2d328b8 |
| 6 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | 1df396ac-ad4f-4817-9215-98373af96f38 |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `factorFormula` | 影响因素公式 | `factor_formula` | String |
| 9 | `id` | ID | `id` | Long |
| 10 | `influenceFactor` | 影响因素 | `influence_factor` | 157c19f9-7acc-495f-b59b-4e4127ce271e |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `optDirection` | 优化方向 | `opt_direction` | String |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `weight` | 权重 | `weight` | Integer |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `defId` | 主表ID | `mr.optimization.Definition` | None | true |
| 2 | `defineCharacteristics` | 自定义项特征组 | `mr.optimization.OptimizationDefineCharacter` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `influenceFactor` | 影响因素 | `mr.optimization.Affect` | None |  |
