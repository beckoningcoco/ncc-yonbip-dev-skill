---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.quotation.BiQuotationHead"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格目录报价模型表头 (`aa.quotation.BiQuotationHead`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_bi_quotation_head` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.quotation.BiQuotationHead` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格目录报价模型表头 |
| 物理表 | `cpu_bi_quotation_head` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `dbe6fec3-a020-4e23-8d6d-aef9ae36768c` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:42.3910` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2025-10-24 23:29:28:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509150921_metadata_aa-quotation_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `4bffbb33-521c-4caf-96c2-b631a5c734cb`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 14 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `biQuotationBodyList` | 价格目录报价模型表体 | `` | 02c5d065-2e0e-435a-82c2-edd034ab6eef | `` |  |  |
| 3 | `currency` | 币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 4 | `dr` | dr | `dr` | Integer | `int` |  | ✓ |
| 5 | `fromQuotationId` | 源报价组id | `from_costquotegroup` | efd1e4c5-9da5-490b-acfc-9b097f70f890 | `quote` |  | ✓ |
| 6 | `priceCalcuMethod` | 价格计算方式 | `price_calcu_method` | PriceCalcuMethod | `` |  | ✓ |
| 7 | `priceMode` | 报价模式 | `priceMode` | PriceMode | `` |  | ✓ |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 9 | `srcBillid` | 报价来源单据id | `src_billid` | Long | `long` |  | ✓ |
| 10 | `srcBillsubid` | 报价来源单据子表id | `src_billsubid` | Long | `long` |  | ✓ |
| 11 | `srcBilltype` | 报价来源单据类型 | `src_billtype` | String | `text` |  | ✓ |
| 12 | `supModiDim` | 供应商是否可改价格维度 | `sup_modi_dim` | SupModiDim | `` |  | ✓ |
| 13 | `supModiQuaLad` | 供应商是否可改数量阶梯 | `sup_modi_qua_lad` | SupModiQuaLad | `` |  | ✓ |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `fromQuotationId` | 源报价组id | `aa.quotation.BiQuotationHead` | `from_costquotegroup` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `currency` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency` |  →  |  |  | Service |  |
| 4 | `biQuotationBodyList` | 价格目录报价模型表体 | `aa.quotation.BiQuotationBody` | `` | biQuotationBodyList → quotationId | 1..n | true | None |  |

### Composition（子表）

- **biQuotationBodyList**: `biQuotationBodyList` → `aa.quotation.BiQuotationBody` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `currency` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency` |
