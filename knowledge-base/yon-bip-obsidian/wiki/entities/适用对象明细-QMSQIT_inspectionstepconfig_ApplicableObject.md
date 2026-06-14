---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.inspectionstepconfig.ApplicableObject"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 适用对象明细 (`QMSQIT.inspectionstepconfig.ApplicableObject`)

> QMSQIT | 物理表：`qms_qit_step_applicable_object`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用对象明细 |
| 物理表 | `qms_qit_step_applicable_object` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:09.9680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `stepConfigId` | 检验步骤配置ID | `step_config_id` | d793bf8a-3e9f-444b-a8ac-5f95511b2a46 |
| 4 | `productCategory` | 物料分类 | `product_category` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 5 | `product` | 物料 | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `supplier` | 供应商 | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 7 | `customer` | 客户 | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 8 | `standardProcess` | 工序 | `standard_process` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 9 | `applicableObjectDCT` | 适用对象明细自定义项 | `applicable_object_dct` | e056dbb4-985c-4c6f-8cf7-5313a82245c9 |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `product` | 物料 | `pc.product.Product` | Service |  |
| 2 | `applicableObjectDCT` | 适用对象明细自定义项 | `QMSQIT.inspectionstepconfig.ApplicableObjectDCT` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `stepConfigId` | 检验步骤配置ID | `QMSQIT.inspectionstepconfig.InspectionStepConfig` | None | true |
| 5 | `supplier` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 6 | `standardProcess` | 工序 | `ed.operation.Operation` | Service |  |
| 7 | `customer` | 客户 | `aa.merchant.Merchant` | Service |  |
| 8 | `productCategory` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
