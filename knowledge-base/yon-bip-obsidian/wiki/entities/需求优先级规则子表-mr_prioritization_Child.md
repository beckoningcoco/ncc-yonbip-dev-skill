---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.prioritization.Child"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 需求优先级规则子表 (`mr.prioritization.Child`)

> MR | 物理表：`mr_prioritization_rules_line`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 需求优先级规则子表 |
| 物理表 | `mr_prioritization_rules_line` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:13:25.1800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `prioritizationRulesId` | 主表id | `prioritization_rules_id` | 17a09d25-1e8d-4e89-af42-76d5be478153 |
| 5 | `sortType` | 排序类型 | `sort_type` | SortTypeEnum |
| 6 | `sortDirection` | 排序方向 | `sort_direction` | SortDirectionEnum |
| 7 | `sequence` | 优先级 | `sequence` | Integer |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `grandchild` | 需求优先级规则孙表 | `` | dd1d1dab-b7d8-4b6b-8666-617431c846eb |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `prioritizationRulesId` | 主表id | `mr.prioritization.Rules` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `grandchild` | 需求优先级规则孙表 | `mr.prioritization.Grandchild` | None | true |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
