---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.costquote.CpuCostPricing"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价清单 (`aa.costquote.CpuCostPricing`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_costpricing` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.costquote.CpuCostPricing` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价清单 |
| 物理表 | `cpu_costpricing` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `99bfee3f-bb05-45f9-becc-8ef900769855` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:19:16.5190` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-10-24 23:29:23:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509141347_metadata_aa-costquote_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `ec3fda67-0340-44a0-8cf9-08a481c1e802`

## 业务场景

- `UITemplate`
- `billcode`
- `userdefine`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 22 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `acceptTaxCost` | 承兑含税金额 | `accept_tax_cost` | Decimal | `number` |  | ✓ |
| 2 | `acceptUntaxCost` | 承兑无税金额 | `accept_untax_cost` | Decimal | `number` |  | ✓ |
| 3 | `accountTaxCost` | 账期含税金额 | `account_tax_cost` | Decimal | `number` |  | ✓ |
| 4 | `accountUntaxCost` | 账期无税金额 | `account_untax_cost` | Decimal | `number` |  | ✓ |
| 5 | `canmodifyBySupplier` | 供应商是否可修改成本项结构 | `canmodify_by_supplier` | Integer | `int` |  | ✓ |
| 6 | `costpricingId` | 参考报价清单ID | `costpricing_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd | `quote` |  | ✓ |
| 7 | `cpuCostpricingDetailList` | 报价清单明细 | `` | 575c0982-2f70-4b26-844f-be557a7e5732 | `` |  |  |
| 8 | `currency` | 币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 9 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 11 | `readyTaxCost` | 现金含税金额 | `ready_tax_cost` | Decimal | `number` |  | ✓ |
| 12 | `readyUntaxCost` | 现金无税金额 | `ready_untax_cost` | Decimal | `number` |  | ✓ |
| 13 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String | `text` |  | ✓ |
| 14 | `sourceChildId` | 来源单据明细id | `source_child_id` | Long | `long` |  | ✓ |
| 15 | `sourceMainId` | 来源单据ID | `source_main_id` | Long | `long` |  | ✓ |
| 16 | `supplierDealType` | 供应商操作类型 | `supplier_deal_type` | String | `text` |  | ✓ |
| 17 | `supplyDocId` | 供应商id | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 18 | `taxCost` | 含税金额 | `tax_cost` | Decimal | `number` |  | ✓ |
| 19 | `templateId` | 参考模板ID | `template_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a | `quote` |  | ✓ |
| 20 | `untaxCost` | 无税金额 | `untax_cost` | Decimal | `number` |  | ✓ |
| 21 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String | `text` |  | ✓ |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `costpricingId` | 参考报价清单ID | `aa.costquote.CpuCostPricing` | `costpricing_id` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `currency` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency` |  →  |  |  | Service |  |
| 4 | `supplyDocId` | 供应商id | `aa.vendor.Vendor` | `supply_doc_id` |  →  |  |  | Service |  |
| 5 | `templateId` | 参考模板ID | `aa.costitem.CostItemTemplate` | `template_id` |  →  |  |  | None |  |
| 6 | `cpuCostpricingDetailList` | 报价清单明细 | `aa.costquote.CpuCostpricingDetail` | `` | cpuCostpricingDetailList → costpricingId | 1..n | true | None |  |

### Composition（子表）

- **cpuCostpricingDetailList**: `cpuCostpricingDetailList` → `aa.costquote.CpuCostpricingDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `currency` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency` |
| `supplyDocId` (供应商id) | `aa.vendor.Vendor` | `supply_doc_id` |
