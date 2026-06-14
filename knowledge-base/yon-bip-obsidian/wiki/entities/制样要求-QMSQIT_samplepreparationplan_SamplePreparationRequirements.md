---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplepreparationplan.SamplePreparationRequirements"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 制样要求 (`QMSQIT.samplepreparationplan.SamplePreparationRequirements`)

> QMSQIT | 物理表：`qms_qit_samp_prepare_plan_requ`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 制样要求 |
| 物理表 | `qms_qit_samp_prepare_plan_requ` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:46:14.3740` |

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
| 3 | `SamplePreparationPlanId` | 制样方案 | `sample_preparation_plan_id` | d0c92763-f04e-4002-9fbb-7e88ab1acdf0 |
| 4 | `productCategory` | 物料分类 | `product_category` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 5 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `merchant` | 客户 | `merchant` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 7 | `vendor` | 供应商 | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 8 | `standardProcessId` | 标准工序 | `standard_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 9 | `defineCharacteristics` | 自定义特征组 | `define_characteristics` | a6207d6d-b954-4a97-80e5-8df88dec3d72 |
| 10 | `samplePreparationSize` | 制样大小 | `sample_preparation_size` | String |
| 11 | `samplePreparationShape` | 样品形态 | `sample_preparation_shape` | String |
| 12 | `samplePreparationMemo` | 制样说明 | `sample_preparation_memo` | String |
| 13 | `sampleNum` | 制样个数 | `sample_num` | Integer |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `standardProcessId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 2 | `defineCharacteristics` | 自定义特征组 | `QMSQIT.samplepreparationplan.SamplePreparationRequirementsDCT` | None |  |
| 3 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `vendor` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 6 | `SamplePreparationPlanId` | 制样方案 | `QMSQIT.samplepreparationplan.SamplePreparationPlan` | None | true |
| 7 | `merchant` | 客户 | `aa.merchant.Merchant` | Service |  |
| 8 | `productCategory` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
