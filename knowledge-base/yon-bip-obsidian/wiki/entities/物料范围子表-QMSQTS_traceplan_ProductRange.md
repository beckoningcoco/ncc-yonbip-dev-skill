---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.traceplan.ProductRange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料范围子表 (`QMSQTS.traceplan.ProductRange`)

> QMSQTS | 物理表：`qms_qts_trace_product_range`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料范围子表 |
| 物理表 | `qms_qts_trace_product_range` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:32.5260` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `planId` | 追溯方案id | `plan_id` | f2f38b82-14b7-4035-ba4d-1aeebe02a881 |
| 4 | `productClassId` | 物料分类 | `productclass_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 5 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `isInclude` | 是否包含 | `is_include` | Short |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `planId` | 追溯方案id | `QMSQTS.traceplan.TracePlan` | None | true |
