---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.pricestrategy.ApplyOrganization"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 取价策略适用范围 (`aa.pricestrategy.ApplyOrganization`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_strategy_applyorg` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.pricestrategy.ApplyOrganization` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取价策略适用范围 |
| 物理表 | `cpu_price_strategy_applyorg` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:45.3740` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |

## 部署信息

- **部署时间**: 2026-05-22 23:53:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604031337_metadata_aa-pricestrategy_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `e2fadb64-ba36-49ee-81a7-435ed0ec3da5`

## 术语标记

`ConfigData`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `formId` | 表单id | `form_id` | String | `text` |  | ✓ |
| 2 | `orgId` | 采购组织 | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 3 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 4 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 6 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 7 | `billType` | 应用单据id | `bill_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |  | ✓ |
| 8 | `productClassId` | 物料分类 | `productclass_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 9 | `vendorClassId` | 供应商分类 | `vendorclass_id` | 59ec0b4d-4e38-483d-9bdd-e7aa44176ce8 | `quote` |  | ✓ |
| 10 | `applyMaterial` | 取价策略物料适用范围 | `` | f4499185-ed0a-4177-84d5-db57e66c0b81 | `` |  |  |
| 11 | `applyMaterialclass` | 取价策略物料分类适用范围 | `` | b735d226-2689-4215-a1f6-5f585d314bab | `` |  |  |
| 12 | `applyOrg` | 取价策略组织适用范围 | `` | 525a7ab7-3eb8-4932-8b6e-eb018d5d3137 | `` |  |  |
| 13 | `applyVendor` | 取价策略供应商适用范围 | `` | 5c0d09ce-6f30-496e-994e-905396220bc3 | `` |  |  |
| 14 | `applyVendorclass` | 取价策略供应商分类适用范围 | `` | a2663c34-1c15-43af-b974-04a57aec4658 | `` |  |  |
| 15 | `businessType` | 业务类型 | `business_type` | String | `text` |  | ✓ |
| 16 | `priceStrategyId` | 取价策略主表id | `price_strategy_id` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 | `quote` |  | ✓ |
| 17 | `transtypeId` | 交易类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 14 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `applyMaterialclass` | 取价策略物料分类适用范围 | `aa.pricestrategy.cpuPriceStrategyApplyMaterialclass` | `` | applyMaterialclass → strategyApplyId | 0..n | true | None |  |
| 2 | `applyOrg` | 取价策略组织适用范围 | `aa.pricestrategy.cpuPriceStrategyApplyOrg` | `` | applyOrg → strategyApplyId | 0..n | true | None |  |
| 3 | `productClassId` | 物料分类 | `pc.cls.ManagementClass` | `productclass_id` |  →  |  |  | Service |  |
| 4 | `priceStrategyId` | 取价策略主表id | `aa.pricestrategy.PriceStrategy` | `price_strategy_id` | applyOrganization → priceStrategyId | 1..n | true | None |  |
| 5 | `productId` | 物料 | `pc.product.Product` | `product_id` |  →  |  |  | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 7 | `billType` | 应用单据id | `bd.bill.BillTypeVO` | `bill_type` |  →  |  |  | Service |  |
| 8 | `vendorId` | 供应商 | `aa.vendor.Vendor` | `vendor_id` |  →  |  |  | Service |  |
| 9 | `orgId` | 采购组织 | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |
| 10 | `applyVendorclass` | 取价策略供应商分类适用范围 | `aa.pricestrategy.cpuPriceStrategyApplyVendorclass` | `` | applyVendorclass → strategyApplyId | 0..n | true | None |  |
| 11 | `vendorClassId` | 供应商分类 | `aa.vendorclass.VendorClass` | `vendorclass_id` |  →  |  |  | Service |  |
| 12 | `applyMaterial` | 取价策略物料适用范围 | `aa.pricestrategy.cpuPriceStrategyApplyMaterial` | `` | applyMaterial → strategyApplyId | 0..n | true | None |  |
| 13 | `applyVendor` | 取价策略供应商适用范围 | `aa.pricestrategy.cpuPriceStrategyApplyVendor` | `` | applyVendor → strategyApplyId | 0..n | true | None |  |
| 14 | `transtypeId` | 交易类型id | `bd.bill.TransType` | `transtype_id` |  →  |  |  | Service |  |

### Composition（子表）

- **applyMaterialclass**: `applyMaterialclass` → `aa.pricestrategy.cpuPriceStrategyApplyMaterialclass` | 0..n
- **applyOrg**: `applyOrg` → `aa.pricestrategy.cpuPriceStrategyApplyOrg` | 0..n
- **priceStrategyId**: `applyOrganization` → `aa.pricestrategy.PriceStrategy` | 1..n
- **applyVendorclass**: `applyVendorclass` → `aa.pricestrategy.cpuPriceStrategyApplyVendorclass` | 0..n
- **applyMaterial**: `applyMaterial` → `aa.pricestrategy.cpuPriceStrategyApplyMaterial` | 0..n
- **applyVendor**: `applyVendor` → `aa.pricestrategy.cpuPriceStrategyApplyVendor` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `productClassId` (物料分类) | `pc.cls.ManagementClass` | `productclass_id` |
| `productId` (物料) | `pc.product.Product` | `product_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `billType` (应用单据id) | `bd.bill.BillTypeVO` | `bill_type` |
| `vendorId` (供应商) | `aa.vendor.Vendor` | `vendor_id` |
| `orgId` (采购组织) | `bd.adminOrg.BaseOrgVO` | `org_id` |
| `vendorClassId` (供应商分类) | `aa.vendorclass.VendorClass` | `vendorclass_id` |
| `transtypeId` (交易类型id) | `bd.bill.TransType` | `transtype_id` |
