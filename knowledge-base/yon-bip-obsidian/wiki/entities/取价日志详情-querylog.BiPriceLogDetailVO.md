---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.querylog.BiPriceLogDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 取价日志详情 (`aa.querylog.BiPriceLogDetailVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_bi_price_query_record_detail` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.querylog.BiPriceLogDetailVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取价日志详情 |
| 物理表 | `cpu_bi_price_query_record_detail` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:59.5880` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-10-24 23:29:18:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509022125_metadata_aa-querylog.zip`
- **安装人**: mongoTools
- **安装排名**: `39f77bbd-7aa8-4e7e-8f76-478b6462b2c0`

## 术语标记

`BusinessData`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 27 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `logId` | 取价日志id | `log_id` | 2eb62ece-5690-4259-aa60-ab7feb99b292 | `quote` |  | ✓ |
| 3 | `log_dimension` | 取价维度 | `` | 0cef6574-5218-4e86-bf10-20165b804327 | `` |  |  |
| 4 | `npriceNoTaxOrigin` | 价格目录无税单价 | `nprice_notax_origin` | Decimal | `number` |  | ✓ |
| 5 | `npriceOrigin` | 价格目录含税单价 | `nprice_origin` | Decimal | `number` |  | ✓ |
| 6 | `nsupplierId` | 供应商Id | `nsupplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 7 | `ntax` | 价格目录税率 | `ntax` | Decimal | `number` |  | ✓ |
| 8 | `priceId` | 价格目录id | `price_id` | eb9690f1-b4ed-4223-8ce3-06710f2c6242 | `quote` |  | ✓ |
| 9 | `priceProcessType` | 价格处理方式 | `price_process_type` | Integer | `int` |  | ✓ |
| 10 | `priceRetrievalProcess` | 取价过程 | `price_retrieval_process` | String | `text` |  | ✓ |
| 11 | `priceSchemeId` | 价格方案id | `price_scheme_id` | 4850dcd9-c8e1-4882-bbd1-67a6dd8db017 | `quote` |  | ✓ |
| 12 | `priceSource` | 价格来源 | `price_source` | String | `text` |  | ✓ |
| 13 | `priceStrategyId` | 取价策略id | `price_strategy_id` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 | `quote` |  | ✓ |
| 14 | `pricingEndTime` | 取价时间止 | `pricing_end_time` | DateTime | `timestamp` |  | ✓ |
| 15 | `pricingStartTime` | 取价时间起 | `pricing_start_time` | DateTime | `timestamp` |  | ✓ |
| 16 | `pricingTime` | 取价时间 | `pricing_time` | DateTime | `timestamp` |  | ✓ |
| 17 | `processStatus` | 状态 | `process_status` | String | `text` |  | ✓ |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 19 | `purchaseOrgId` | 采购组织id | `purchase_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 20 | `queryNum` | 数量 | `queryNum` | Decimal | `number` |  | ✓ |
| 21 | `retrievalResult` | 结果/失败原因 | `retrieval_result` | String | `text` |  | ✓ |
| 22 | `step` | 步骤 | `step` | Integer | `int` |  | ✓ |
| 23 | `vbusinessType` | 业务类型 | `vbusiness_type` | String | `text` |  | ✓ |
| 24 | `vcurrency` | 价格目录币种id | `vcurrency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 25 | `vmaterialId` | 物料id | `vmaterial_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 26 | `vunitId` | 价格目录单位id | `vunit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 11 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `vcurrency` | 价格目录币种id | `bd.currencytenant.CurrencyTenantVO` | `vcurrency` |  →  |  |  | Service |  |
| 2 | `vunitId` | 价格目录单位id | `pc.unit.Unit` | `vunit_id` |  →  |  |  | Service |  |
| 3 | `vmaterialId` | 物料id | `pc.product.Product` | `vmaterial_id` |  →  |  |  | Service |  |
| 4 | `priceStrategyId` | 取价策略id | `aa.pricestrategy.PriceStrategy` | `price_strategy_id` |  →  |  |  | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `log_dimension` | 取价维度 | `aa.querylog.BiPriceLogDimensionVO` | `` | log_dimension → detailId | 0..n | true | None |  |
| 7 | `logId` | 取价日志id | `aa.querylog.BiPriceLogVO` | `log_id` | log_detail → logId | 1..n | true | None |  |
| 8 | `purchaseOrgId` | 采购组织id | `org.func.BaseOrg` | `purchase_org_id` |  →  |  |  | Service |  |
| 9 | `nsupplierId` | 供应商Id | `aa.vendor.Vendor` | `nsupplier_id` |  →  |  |  | Service |  |
| 10 | `priceId` | 价格目录id | `aa.pricecenter.BiPriceEntity` | `price_id` |  →  |  |  | None |  |
| 11 | `priceSchemeId` | 价格方案id | `aa.dynamicpricescheme.PriceScheme` | `price_scheme_id` |  →  |  |  | None |  |

### Composition（子表）

- **log_dimension**: `log_dimension` → `aa.querylog.BiPriceLogDimensionVO` | 0..n
- **logId**: `log_detail` → `aa.querylog.BiPriceLogVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `vcurrency` (价格目录币种id) | `bd.currencytenant.CurrencyTenantVO` | `vcurrency` |
| `vunitId` (价格目录单位id) | `pc.unit.Unit` | `vunit_id` |
| `vmaterialId` (物料id) | `pc.product.Product` | `vmaterial_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `purchaseOrgId` (采购组织id) | `org.func.BaseOrg` | `purchase_org_id` |
| `nsupplierId` (供应商Id) | `aa.vendor.Vendor` | `nsupplier_id` |
