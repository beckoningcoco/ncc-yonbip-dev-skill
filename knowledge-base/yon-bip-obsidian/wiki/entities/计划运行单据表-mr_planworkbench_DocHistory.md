---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.DocHistory"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划运行单据表 (`mr.planworkbench.DocHistory`)

> MR | 物理表：`mr_mrp_doc_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划运行单据表 |
| 物理表 | `mr_mrp_doc_history` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:51.8100` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `datasub` | 应用来源 | `datasub` | String |
| 6 | `docDate` | 单据日期 | `doc_date` | Date |
| 7 | `docId` | 单据 | `doc_id` | Long |
| 8 | `docLineId` | 单据行 | `doc_line_id` | Long |
| 9 | `docLineNo` | 单据行号 | `doc_line_no` | String |
| 10 | `docNo` | 单据号 | `doc_no` | String |
| 11 | `docOrg` | 供需组织 | `doc_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 12 | `docQty` | 单据数量 | `doc_qty` | Decimal |
| 13 | `docTypeCode` | 供需单据类型 | `doc_type_code` | String |
| 14 | `id` | ID | `id` | Long |
| 15 | `mainUom` | 单位 | `main_uom` | Long |
| 16 | `materialId` | 制造物料 | `material_id` | Long |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `planOrg` | 计划组织 | `plan_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 22 | `planType` | 订单类型 | `plan_type` | PlanTypeAllEnum |
| 23 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `state` | 单据状态 | `state` | Short |
| 26 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `docOrg` | 供需组织 | `org.func.BaseOrg` | Service |  |
| 2 | `planOrg` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 3 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
