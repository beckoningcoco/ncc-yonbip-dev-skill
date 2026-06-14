---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.CpuContractSkuextHistoryNew"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合同物料SKU属性扩展表 (`cpu-contract.contractchangenew.CpuContractSkuextHistoryNew`)

> ycContractManagement | 物理表：`cpu_contract_skuext_hisory`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同物料SKU属性扩展表 |
| 物理表 | `cpu_contract_skuext_hisory` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:45:20.0110` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billBid` | 单据子表id | `bill_bid` | 49d72350-dc01-4208-9c50-c07ddee61c26 |
| 2 | `billId` | 单据主表id | `bill_id` | 49f97b1c-2c1f-4fc9-855d-6a465985bdf3 |
| 3 | `dr` | dr | `dr` | Integer |
| 4 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 5 | `id` | ID | `id` | Long |
| 6 | `materialId` | 物料id | `material_id` | Long |
| 7 | `skuCode` | SKU编码 | `sku_code` | String |
| 8 | `skuId` | sku档案id | `sku_id` | Long |
| 9 | `skuModel` | SKU型号 | `sku_model` | String |
| 10 | `skuName` | SKU名称 | `sku_name` | String |
| 11 | `skuSpec` | SKU规格描述 | `sku_spec` | String |
| 12 | `specNames` | SKU规格 | `spec_names` | String |
| 13 | `pubts` | 时间戳 | `ts` | DateTime |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billBid` | 单据子表id | `cpu-contract.contractchangenew.ContractMaterialHistoryNewVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `billId` | 单据主表id | `cpu-contract.contractchangenew.ContractHistryNewVO` | None |  |
