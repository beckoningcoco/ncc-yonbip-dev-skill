---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.retentionsampleplan.RetentionSampleRequirements"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 留样要求 (`QMSQIT.retentionsampleplan.RetentionSampleRequirements`)

> QMSQIT | 物理表：`qms_qit_retentionsample_requirements`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 留样要求 |
| 物理表 | `qms_qit_retentionsample_requirements` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:39.3040` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `retentionSamplePlanId` | 留样方案 | `retentionsample_plan_id` | 796856f9-9afa-4e80-be76-0557abe84b5e |
| 4 | `productCategory` | 物料分类 | `product_category` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 5 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `merchant` | 客户 | `merchant` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 7 | `vendor` | 供应商 | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 8 | `processId` | 工序 | `process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 9 | `userDefineCharacterHead` | 自定义项实体 | `body_dct` | 542efade-9f3b-47ac-92a8-587b8cd71de6 |
| 10 | `retentionsampleRequirements` | 留样要求 | `retentionsample_requirements` | String |
| 11 | `storageConditions` | 存储条件 | `storage_conditions` | String |
| 12 | `retentionsampleExpirationDate` | 留样效期 | `retentionsample_expiration_date` | Integer |
| 13 | `retentionsampleExpirationUnit` | 留样效期单位 | `retentionsample_expiration_unit` | String |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 2 | `processId` | 工序 | `ed.operation.Operation` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `vendor` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 5 | `merchant` | 客户 | `aa.merchant.Merchant` | Service |  |
| 6 | `retentionSamplePlanId` | 留样方案 | `QMSQIT.retentionsampleplan.RetentionSamplePlan` | None | true |
| 7 | `productCategory` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 8 | `userDefineCharacterHead` | 自定义项实体 | `QMSQIT.retentionsampleplan.RetentionSampleRequirementsDCT` | None |  |
