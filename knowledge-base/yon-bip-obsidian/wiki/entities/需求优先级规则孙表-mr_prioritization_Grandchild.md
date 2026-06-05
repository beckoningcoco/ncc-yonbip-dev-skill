---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.prioritization.Grandchild"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 需求优先级规则孙表 (`mr.prioritization.Grandchild`)

> MR | 物理表：`mr_prioritization_rules_subline`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 需求优先级规则孙表 |
| 物理表 | `mr_prioritization_rules_subline` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:46.5780` |

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
| 3 | `childId` | 子表id | `prioritization_child_id` | 54f75249-619b-48a4-b5b8-d28877b636da |
| 4 | `id` | ID | `id` | Long |
| 5 | `customizeValueName` | 字段值名称 | `customize_value_name` | String |
| 6 | `customizeValue` | 字段值 | `customize_value` | String |
| 7 | `customizeType` | 字段类型 | `customize_type` | String |
| 8 | `sequence` | 优先级 | `sequence` | Integer |
| 9 | `creator` | 创建人名称 | `creator` | String |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `childId` | 子表id | `mr.prioritization.Child` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
