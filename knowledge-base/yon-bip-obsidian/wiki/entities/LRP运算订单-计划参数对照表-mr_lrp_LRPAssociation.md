---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.lrp.LRPAssociation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# LRP运算订单-计划参数对照表 (`mr.lrp.LRPAssociation`)

> MR | 物理表：`mr_lrp_association`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | LRP运算订单-计划参数对照表 |
| 物理表 | `mr_lrp_association` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:29.8360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `executeDate` | 创建时间 | `execute_date` | DateTime |
| 2 | `id` | ID | `id` | Long |
| 3 | `operationException` | 运算异常信息 | `operation_exception` | String |
| 4 | `orderId` | 订单id | `order_id` | Long |
| 5 | `orderRowId` | 订单行id | `order_row_id` | Long |
| 6 | `orderType` | 订单类型 | `order_type` | LRPOrderTypeEnum |
| 7 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 8 | `planParamId` | 计划参数 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 9 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 10 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `rootDocLineId` | 源头单据行id | `root_doc_line_id` | Long |
| 13 | `simulateFlag` | 模拟需求 | `simulate_flag` | Boolean |
| 14 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `planParamId` | 计划参数 | `mr.planworkbench.PlanParam` | None |  |
| 4 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
