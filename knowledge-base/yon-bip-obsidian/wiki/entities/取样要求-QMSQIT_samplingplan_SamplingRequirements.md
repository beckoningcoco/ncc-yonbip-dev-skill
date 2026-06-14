---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplingplan.SamplingRequirements"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 取样要求 (`QMSQIT.samplingplan.SamplingRequirements`)

> QMSQIT | 物理表：`qms_qit_sampling_requirements`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取样要求 |
| 物理表 | `qms_qit_sampling_requirements` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:46:22.4590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `id` | ID | `id` | Long |
| 3 | `merchant` | 客户 | `merchant` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 4 | `processId` | 工序 | `process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 5 | `productCategory` | 物料分类 | `product_category` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 6 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `sampleNum` | 取样个数 | `sample_num` | Integer |
| 9 | `samplingContainer` | 取样容器 | `sampling_container` | String |
| 10 | `samplingDirection` | 取样方向 | `sampling_direction` | String |
| 11 | `samplingLocation` | 取样位置 | `sampling_location` | String |
| 12 | `samplingMemo` | 取样说明 | `sampling_memo` | String |
| 13 | `samplingMorphology` | 取样形态 | `sampling_morphology` | String |
| 14 | `samplingPlace` | 取样地点 | `sampling_place` | String |
| 15 | `samplingPlanId` | 取样方案 | `sampling_plan_id` | 5961aff7-b759-4498-a39b-6aef93301023 |
| 16 | `samplingSize` | 取样大小 | `sampling_size` | String |
| 17 | `userDefineCharacterHead` | 自定义项实体 | `body_dct` | 08a9c774-8fa2-4591-a7b5-29cf28d49087 |
| 18 | `vendor` | 供应商 | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 2 | `processId` | 工序 | `ed.operation.Operation` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `vendor` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 5 | `samplingPlanId` | 取样方案 | `QMSQIT.samplingplan.SamplingPlan` | None | true |
| 6 | `merchant` | 客户 | `aa.merchant.Merchant` | Service |  |
| 7 | `productCategory` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 8 | `userDefineCharacterHead` | 自定义项实体 | `QMSQIT.samplingplan.SamplingRequirementsDCT` | None |  |
