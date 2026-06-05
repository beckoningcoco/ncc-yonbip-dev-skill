---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.timefence.TimeFenceAllot"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划策略分配 (`mr.timefence.TimeFenceAllot`)

> MR | 物理表：`mr_time_fence_allot`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划策略分配 |
| 物理表 | `mr_time_fence_allot` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:19.5440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | 计划组织ID |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `datasub` | 应用来源 | `datasub` | String |
| 4 | `timeFenceAllotType` | 类型 | `time_fence_allot_type` | String |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `creator` | 创建人名称 | `creator` | String |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `modifier` | 修改人名称 | `modifier` | String |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 14 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 15 | `id` | id | `id` | Long |
| 16 | `orgId` | 计划组织ID | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 17 | `timeFenceId` | 计划策略ID | `time_fence_id` | 69a6556e-bd79-4981-b6fd-86d13b77c6aa |
| 18 | `allotType` | 分配类型 | `allot_type` | TacticAllotTypeEnum |
| 19 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 20 | `allotOrg` | 组织ID | `allot_org` | 598482c6-0ad7-493a-b944-5493a8b9fb8e |
| 21 | `allotCategory` | 计划分类ID | `allot_category` | 5f9b1ee7-d6e8-4ba0-b5d7-6728fa089ae3 |
| 22 | `allotItem` | 物料id | `allot_item` | Long |
| 23 | `stopstatus` | 启用状态 | `stopstatus` | Boolean |
| 24 | `remark` | 备注 | `remark` | String |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `timeFenceId` | 计划策略ID | `mr.timefence.TimeFence` | None |  |
| 6 | `allotCategory` | 计划分类ID | `pc.cls.PlanClass` | Service |  |
| 7 | `allotOrg` | 组织ID | `bd.adminOrg.InventoryOrgVO` | Service |  |
| 8 | `orgId` | 计划组织ID | `aa.baseorg.OrgMV` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
