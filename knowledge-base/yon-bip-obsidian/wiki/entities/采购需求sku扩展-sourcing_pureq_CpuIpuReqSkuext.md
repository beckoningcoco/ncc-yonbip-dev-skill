---
tags: ["BIP", "元数据", "数据字典", "ycReqManagement", "sourcing.pureq.CpuIpuReqSkuext"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购需求sku扩展 (`sourcing.pureq.CpuIpuReqSkuext`)

> ycReqManagement | 物理表：`cpu_ipu_req_skuext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购需求sku扩展 |
| 物理表 | `cpu_ipu_req_skuext` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycReqManagement` |
| 构建时间 | `2026-06-04 23:26:20.2410` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billBid` | 单据字表id | `bill_bid` | Long |
| 2 | `billId` | 单据id | `bill_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `id` | ID | `id` | Long |
| 5 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `skuCode` | 物料SKU编码 | `sku_code` | String |
| 8 | `skuId` | 物料SKU ID | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 9 | `skuModel` | SKU型号 | `sku_model` | String |
| 10 | `skuName` | 物料SKU名称 | `sku_name` | String |
| 11 | `skuSpec` | 规格 | `sku_spec` | String |
| 12 | `specNames` | SKU规格型号、规格 | `spec_names` | String |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 14 | `skuCode_rca` | 物料SKU编码 | `sku_code` | String |
| 15 | `skuModel_rca` | SKU型号 | `sku_model` | String |
| 16 | `skuName_rca` | 物料SKU名称 | `sku_name` | String |
| 17 | `skuSpec_rca` | 规格 | `sku_spec` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `billId` | 单据id | `sourcing.pureq.IpuPuReq` | None | true |
| 3 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 4 | `skuId` | 物料SKU ID | `pc.product.ProductSKU` | Service |  |
