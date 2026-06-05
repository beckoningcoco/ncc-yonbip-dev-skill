---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planscheme.PlanMergeDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划合并详情 (`mr.planscheme.PlanMergeDetail`)

> MR | 物理表：`mr_plan_merge_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划合并详情 |
| 物理表 | `mr_plan_merge_detail` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:09.3580` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `characteristicsId` | 特征组ID | `characteristics_id` | 2bbf5f38-d9cd-41f4-828c-936c89972323 |
| 2 | `id` | ID | `id` | Long |
| 3 | `isDefault` | 是否默认 | `is_default` | Boolean |
| 4 | `isSelected` | 是否选中 | `is_select` | Boolean |
| 5 | `mergeType` | 合并类型 | `merge_type` | String |
| 6 | `orgId` | 组织ID | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 7 | `planMergeId` | 合并档案 | `plan_merge_id` | e019670a-881a-4a9f-b005-665671fa87fa |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `planMergeId` | 合并档案 | `mr.planscheme.PlanMerge` | None |  |
| 2 | `characteristicsId` | 特征组ID | `base.character.Characteristics` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `orgId` | 组织ID | `aa.baseorg.OrgMV` | Service |  |
