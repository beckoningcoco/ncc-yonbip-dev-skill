---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "order.singlestockplanfeedback.CpuSinglestockPlanFeedbackDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 单次备货计划反馈子表 (`order.singlestockplanfeedback.CpuSinglestockPlanFeedbackDetail`)

> ycSaleCoor | 物理表：`cpu_single_stockplan_feedback_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单次备货计划反馈子表 |
| 物理表 | `cpu_single_stockplan_feedback_detail` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:46.2680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（56个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `purPlanId` | 单次备货计划id | `pur_plan_id` | Long |
| 3 | `materialSpec` | 物料规格 | `material_spec` | String |
| 4 | `materialModel` | 物料型号 | `material_model` | String |
| 5 | `materialCode` | 物料编码 | `material_code` | String |
| 6 | `purchaseUnitCode` | 采购单位编码 | `purchase_unit_code` | String |
| 7 | `mainMetrologyCode` | 主计量单位编码 | `main_metrology_code` | String |
| 8 | `unitCode` | 计价单位编码 | `unit_code` | String |
| 9 | `ytenant` | 租户编码 | `ytenant_id` | String |
| 10 | `dr` | 删除标志 | `dr` | Integer |
| 11 | `ts` | 时间戳 | `ts` | DateTime |
| 12 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 13 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `materialName` | 物料名称 | `material_name` | String |
| 16 | `skuCode` | SKU编码 | `sku_code` | String |
| 17 | `skuName` | SKU名称 | `sku_name` | String |
| 18 | `skuSpecCode` | SKU规格说明 | `sku_spec_code` | String |
| 19 | `skuModel` | SKU型号 | `sku_model` | String |
| 20 | `skuSpec` | SKU规格 | `sku_spec` | String |
| 21 | `purchaseUnitName` | 采购单位 | `purchase_unit_name` | String |
| 22 | `mainMetrologyName` | 主计量单位 | `main_metrology_name` | String |
| 23 | `unitName` | 计价单位 | `unit_name` | String |
| 24 | `reqOrgName` | 需求组织 | `req_org_name` | String |
| 25 | `recv_orgname` | 收货组织 | `recv_orgname` | String |
| 26 | `purPlanDetailId` | 单次备货计划子表id | `pur_plan_detail_id` | Long |
| 27 | `planId` | 单次备货计划反馈订单主表 | `plan_id` | 1836f394-efcc-4207-8563-1006029ac372 |
| 28 | `materialId` | 物料主键 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 29 | `skuId` | 物料SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 30 | `purchaseUnitId` | 采购业务单位主键 | `purchase_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 31 | `purchaseExchRate` | 采购单位换算率 | `purchase_exch_rate` | Decimal |
| 32 | `mainMetrologyId` | 主计量单位主键 | `main_metrology_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 33 | `unitId` | 计价单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 34 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal |
| 35 | `mainNum` | 需求主数量 | `main_num` | Decimal |
| 36 | `purchaseNum` | 需求采购数量 | `purchase_num` | Decimal |
| 37 | `priceNum` | 需求计价数量 | `price_num` | Decimal |
| 38 | `feedbackMainNum` | 反馈主数量 | `feedback_main_num` | Decimal |
| 39 | `feedbackPurchaseNum` | 反馈采购数量 | `feedback_purchase_num` | Decimal |
| 40 | `feedbackPriceNum` | 反馈计价数量 | `feedback_price_num` | Decimal |
| 41 | `satisfyStatus` | 满足状态 | `satisfyStatus` | String |
| 42 | `planDeliverDate` | 期望交货日期 | `plan_deliver_date` | DateTime |
| 43 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 44 | `taxAmount` | 含税金额 | `tax_amount` | Decimal |
| 45 | `reqOrgId` | 需求组织ID | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 46 | `recv_org` | 收货组织ID | `recv_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 47 | `purMemo` | 采购方备注 | `pur_memo` | String |
| 48 | `supMemo` | 供应商备注 | `sup_memo` | String |
| 49 | `singlestockplanDetailDefineCharacter` | 自定义项特征组 | `define_character` | 720a7ffa-5990-43f0-83f0-8959fa9e92b5 |
| 50 | `singlestockplanDetailFreeCharacteristics` | 自由项特征组 | `instance_id` | f0757ea2-1525-4a06-8fbc-4166d949a328 |
| 51 | `totalAccomplishedNum` | 累计执行量 | `total_accomplished_num` | Decimal |
| 52 | `defines` | 单次备货计划反馈子表自由自定义项 | `` | fd59d6a8-313a-4599-bcd7-4e5349d22dc8 |
| 53 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal |
| 54 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal |
| 55 | `purchaseExchRateDen` | 采购单位换算率分母 | `purchase_exch_rateden` | Decimal |
| 56 | `purchaseExchRateNum` | 采购单位换算率分子 | `purchase_exch_ratenum` | Decimal |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purchaseUnitId` | 采购业务单位主键 | `pc.unit.Unit` | Service |  |
| 2 | `singlestockplanDetailDefineCharacter` | 自定义项特征组 | `order.singlestockplanfeedback.CpuSinglestockPlanFeedbackCharacterDefine` | None |  |
| 3 | `singlestockplanDetailFreeCharacteristics` | 自由项特征组 | `order.singlestockplanfeedback.CpuSinglestockPlanFeedbackCharacteristicsDefine` | None |  |
| 4 | `unitId` | 计价单位 | `pc.unit.Unit` | Service |  |
| 5 | `planId` | 单次备货计划反馈订单主表 | `order.singlestockplanfeedback.CpuSinglestockPlanFeedback` | None | true |
| 6 | `materialId` | 物料主键 | `pc.product.Product` | Service |  |
| 7 | `reqOrgId` | 需求组织ID | `org.func.BaseOrg` | Service |  |
| 8 | `recv_org` | 收货组织ID | `org.func.BaseOrg` | Service |  |
| 9 | `skuId` | 物料SKU | `pc.product.ProductSKU` | Service |  |
| 10 | `mainMetrologyId` | 主计量单位主键 | `pc.unit.Unit` | Service |  |
| 11 | `defines` | 单次备货计划反馈子表自由自定义项 | `order.singlestockplanfeedback.CpuSinglestockPlanFeedbackDetailDefine` | None | true |
