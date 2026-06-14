---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.qualitypricehistory.PriceHisLibBodyEntity"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 优质优价历史库表体 (`aa.qualitypricehistory.PriceHisLibBodyEntity`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_history_detail` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.qualitypricehistory.PriceHisLibBodyEntity` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优质优价历史库表体 |
| 物理表 | `cpu_price_history_detail` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:53.5770` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 22:09:33:000
- **安装来源**: `/app/iuap-metadata-base-common/iuap-metadata-base/metadata-bootstrap/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-metadata-base/0010_iuap_common/DML/0270_iuap_metadata/202604/202604161115_metadata_ucfbase-ucfbaseItf.zip`
- **安装人**: mongoTools
- **安装排名**: `b5b48373-4313-49fc-8cb9-9678b9a19b33`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 23 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `adjustResult` | 调整结果 | `adjust_result` | Decimal | `number` |  | ✓ |
| 2 | `aggrFormula` | 优质优价公式 | `aggr_formula` | String | `text` |  | ✓ |
| 3 | `aggrFormulaCode` | 优质优价公式编码 | `aggr_formula_code` | String | `text` |  | ✓ |
| 4 | `exeFormula` | 优质优价执行公式 | `exe_formula` | String | `text` |  | ✓ |
| 5 | `exeSeq` | 执行顺序 | `exe_seq` | Integer | `int` |  | ✓ |
| 6 | `featureHitted` | 命中特征组合 | `feature_hitted` | String | `text` |  | ✓ |
| 7 | `headId` | 价格历史库表头ID | `head_id` | 38b294db-088a-4381-bd53-c30aedeba4a9 | `quote` |  | ✓ |
| 8 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 9 | `money` | 金额 | `money` | Decimal | `number` |  | ✓ |
| 10 | `moneyAdjustValue` | 总金额调整量 | `money_adjust_value` | Decimal | `number` |  | ✓ |
| 11 | `nextLevelBase` | 作为下一优先级计算的基础数据项 | `next_level_base` | String | `text` |  | ✓ |
| 12 | `price` | 单价 | `price` | Decimal | `number` |  | ✓ |
| 13 | `priceAdjustValue` | 单价调整量 | `price_adjust_value` | Decimal | `number` |  | ✓ |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 15 | `qualitypriceMoney` | 优质优价-金额 | `qualityprice_money` | Decimal | `number` |  | ✓ |
| 16 | `qualitypricePrice` | 优质优价-单价 | `qualityprice_price` | Decimal | `number` |  | ✓ |
| 17 | `qualitypriceQuantity` | 优质优价-数量 | `qualityprice_quantity` | Decimal | `number` |  | ✓ |
| 18 | `quantity` | 数量 | `quantity` | Decimal | `number` |  | ✓ |
| 19 | `quantityAdjustValue` | 数量调整量 | `quantity_adjust_value` | Decimal | `number` |  | ✓ |
| 20 | `schemeItemId` | 方案行ID | `scheme_item_id` | f0819815-58ef-4551-91e4-d7fa8cfc56d3 | `quote` |  | ✓ |
| 21 | `standardId` | 标准ID | `standard_id` | bf9f35b7-ea48-444e-9de9-dee31f271568 | `quote` |  | ✓ |
| 22 | `standardItemId` | 标准行ID | `standard_item_id` | 9ba07035-505d-48f6-9bed-685946596297 | `quote` |  | ✓ |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `standardItemId` | 标准行ID | `aa.qualitypricestandard.PriceStandardItem` | `standard_item_id` |  →  |  |  | None |  |
| 3 | `standardId` | 标准ID | `aa.qualitypricestandard.PriceStandard` | `standard_id` |  →  |  |  | None |  |
| 4 | `schemeItemId` | 方案行ID | `aa.qualitypricescheme.QualitypriceSchemeItem` | `scheme_item_id` |  →  |  |  | None |  |
| 5 | `headId` | 价格历史库表头ID | `aa.qualitypricehistory.PriceHisLibHeadEntity` | `head_id` | bodys → headId | 1..n | true | None |  |

### Composition（子表）

- **headId**: `bodys` → `aa.qualitypricehistory.PriceHisLibHeadEntity` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
