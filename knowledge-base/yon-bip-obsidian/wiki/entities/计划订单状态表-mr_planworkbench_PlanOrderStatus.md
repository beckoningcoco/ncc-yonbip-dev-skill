---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.PlanOrderStatus"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划订单状态表 (`mr.planworkbench.PlanOrderStatus`)

> MR | 物理表：`mr_plan_order_status`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划订单状态表 |
| 物理表 | `mr_plan_order_status` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:34.3700` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `plan_order_id` | 8217afbf-acdc-42ef-a799-75a88d9fa69d | 计划订单id |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bomLastPubts` | BOM最近更新时间 | `bom_last_pubts` | DateTime |
| 2 | `bomSubstituteFlag` | BOM替代标识 | `bom_substitute_flag` | String |
| 3 | `capacityStatus` | 能力状态 | `capacity_status` | Short |
| 4 | `createDate` | 创建日期 | `create_date` | Date |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime |
| 6 | `creator` | 创建人名称 | `creator` | String |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `datasub` | 应用来源 | `datasub` | String |
| 9 | `decomposeStatus` | 分解状态 | `decompose_status` | Short |
| 10 | `id` | ID | `id` | Long |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `planOrderId` | 计划订单id | `plan_order_id` | 8217afbf-acdc-42ef-a799-75a88d9fa69d |
| 16 | `productStatus` | 物料状态 | `product_status` | Short |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `planOrderId` | 计划订单id | `mr.planworkbench.PlanOrder` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
