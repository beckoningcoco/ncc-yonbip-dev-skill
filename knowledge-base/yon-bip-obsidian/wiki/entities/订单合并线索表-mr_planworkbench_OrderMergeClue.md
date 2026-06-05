---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.OrderMergeClue"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 订单合并线索表 (`mr.planworkbench.OrderMergeClue`)

> MR | 物理表：`mr_order_merge_clue`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单合并线索表 |
| 物理表 | `mr_order_merge_clue` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:13:01.2080` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `id` | ID | `id` | Long |
| 6 | `modifier` | 修改人名称 | `modifier` | String |
| 7 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 9 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `srcOrderId` | 来源订单id | `src_order_id` | Long |
| 12 | `targetOrderId` | 目标订单ID | `target_order_id` | 8217afbf-acdc-42ef-a799-75a88d9fa69d |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `targetOrderId` | 目标订单ID | `mr.planworkbench.PlanOrder` | None | true |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
