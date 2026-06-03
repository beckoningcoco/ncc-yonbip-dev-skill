---
tags: [BIP, 元数据, 数据字典, sccs.multitrade.TradeRoutes]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 贸易路径子表 (`sccs.multitrade.TradeRoutes`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`scmmp_traderoutes` | domain：`scmmp` | 应用：`SCCS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 贸易路径子表 |
| 物理表 | `scmmp_traderoutes` |
| 数据库 schema | `scmmp` |
| 所属应用 | `SCCS` |
| 直连字段 | 37 个 |
| 子表 | 0 个 |
| 关联引用 | 17 个 |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `orderOrgId` | `` |
| `red_saleout_trans_type_id` | `` |
| `ytenant_id` | `` |
| `invoiceOrgId` | `` |
| `siTransTypeId` | `` |
| `outWarehouseId` | `` |
| `inWarehouseId` | `` |
| `sale_return_trans_type_id` | `` |
| `soTransTypeId` | `` |
| `outTransTypeId` | `` |
| `poTransTypeId` | `` |
| `red_purin_trans_type_id` | `` |
| `stockOrgId` | `` |
| `cCurrencyId` | `` |
| `inTransTypeId` | `` |
| `piTransTypeId` | `` |
| `mainid` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **后端自动行号接口** (`base.itf.ILineNo`)
  - `lineno` → `lineno`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `memo` | `memo` | `memo` | 备注 |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCurrencyId` | `cCurrencyId` | `currency` | 币种Id |
| `inTransTypeId` | `inTransTypeId` | `inTransTypeId` | 采购入库交易类型Id |
| `inWarehouseId` | `inWarehouseId` | `inWarehouseId` | 采购入库仓库 |
| `invoiceOrgId` | `invoiceOrgId` | `invoiceOrgId` | 开票组织 |
| `mainid` | `mainid` | `mainid` | 贸易路径主表ID |
| `orderOrgId` | `orderOrgId` | `orderOrgId` | 订单组织 |
| `outTransTypeId` | `outTransTypeId` | `outTransTypeId` | 销售出库交易类型Id |
| `outWarehouseId` | `outWarehouseId` | `outWarehouseId` | 销售出库仓库 |
| `piTransTypeId` | `piTransTypeId` | `piTransTypeId` | 采购发票交易类型Id |
| `poTransTypeId` | `poTransTypeId` | `poTransTypeId` | 采购订单交易类型Id |
| `red_purin_trans_type_id` | `red_purin_trans_type_id` | `redPurinTransTypeId` | 红字采购入库交易类型ID |
| `red_saleout_trans_type_id` | `red_saleout_trans_type_id` | `redSaleoutTransTypeId` | 红字销售出库交易类型ID |
| `sale_return_trans_type_id` | `sale_return_trans_type_id` | `saleReturnTransTypeId` | 销售退货单交易类型ID |
| `siTransTypeId` | `siTransTypeId` | `siTransTypeId` | 销售发票交易类型Id |
| `soTransTypeId` | `soTransTypeId` | `soTransTypeId` | 销售订单交易类型Id |
| `stockOrgId` | `stockOrgId` | `stockOrgId` | 库存组织 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `returnInPause` | `returnInPause` | `returnInPause` | 红字采购入库停顿 |
| `returnOutPause` | `returnOutPause` | `returnOutPause` | 红字销售出库停顿 |

### 短整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `inPause` | `inPause` | `inPause` | 采购入库停顿 |
| `outPause` | `outPause` | `outPause` | 销售出库停顿 |
| `piPause` | `piPause` | `piPause` | 采购发票停顿 |
| `piStatus` | `piStatus` | `piStatus` | 采购发票状态 |
| `poPause` | `poPause` | `poPause` | 采购订单停顿 |
| `poStatus` | `poStatus` | `poStatus` | 采购订单状态 |
| `priceBasic` | `priceBasic` | `priceBasic` | 价格基准 |
| `priceType` | `priceType` | `priceType` | 价格计算方式 |
| `siPause` | `siPause` | `siPause` | 销售发票停顿 |
| `siStatus` | `siStatus` | `siStatus` | 销售发票状态 |
| `soPause` | `soPause` | `soPause` | 销售订单停顿 |
| `soStatus` | `soStatus` | `soStatus` | 销售订单状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `discountRate` | `discountRate` | `discountRate` | 扣率% |
| `lineno` | `lineno` | `lineno` | 行号 |
| `priceDifference` | `priceDifference` | `priceDifference` | 价差 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
