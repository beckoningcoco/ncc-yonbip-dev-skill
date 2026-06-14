---
tags: [BIP, 元数据, 数据字典, st.salesout.SalesOutsExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售出库单子表扩展 (`st.salesout.SalesOutsExtend`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`st_salesouts_extend` | domain：`ustock` | 应用：`ST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售出库单子表扩展 |
| 物理表 | `st_salesouts_extend` |
| domain/服务域 | `ustock` |
| schema | `ustock` |
| 所属应用 | `ST` |
| 直连字段 | 39 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `provider_profit_center` | `` |
| `receivingCustomer` | `` |
| `ytenant_id` | `` |
| `cost_center` | `` |
| `ptoId` | `` |
| `id` | `` |
| `consumer_profit_center` | `` |

## 继承接口 (5个, 16字段)

- **财务成本中心** (`st.inventoryaccounting.CostCenter`)
  - `cost_center` → `cost_center`
- **财务利润中心** (`st.inventoryaccounting.ProfitCenter`)
  - `consumer_profit_center` → `consumer_profit_center`
  - `provider_profit_center` → `provider_profit_center`
- **源销售出库线索组** (`st.sourcesalesoutclue.ISourceSalesOutClue`)
  - `iSourceSalesOutBillType` → `iSourceSalesOutBillType`
  - `iSourceSalesOutCode` → `iSourceSalesOutCode`
  - `iSourceSalesOutId` → `iSourceSalesOutId`
  - `iSourceSalesOutRowId` → `iSourceSalesOutRowId`
  - `iSourceSalesOutRowNo` → `iSourceSalesOutRowNo`
- **PTO信息** (`usp.pto.IProductToOrder`)
  - `ptoCostScrap` → `ptoCostScrap`
  - `ptoHierarchyType` → `ptoHierarchyType`
  - `ptoId` → `ptoId`
  - `ptoPricingMethod` → `ptoPricingMethod`
  - `ptoQty` → `ptoQty`
  - `ptoRowId` → `ptoRowId`
  - `ptoSonQty` → `ptoSonQty`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 39 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `coSourceType` | String | 协同源头单据类型 |
| `` | `coUpcode` | String | 协同源头单据号 |
| `contractLot` | `contractLot` | String | 贸易合同批次  |
| `deliveryLot` | `deliveryLot` | String | 贸易合同交付批号 |
| `manual_amount` | `manual_amount` | String | 手动修改金额标识 |
| `iSourceSalesOutBillType` | `iSourceSalesOutBillType` | String | 源销售出库单据类型 |
| `iSourceSalesOutCode` | `iSourceSalesOutCode` | String | 源销售出库单号 |
| `` | `subBusinessSourceNo` | String | 子业务源头单据号 |
| `` | `subBusinessSourceType` | String | 子业务源头单据类型 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `consumer_profit_center` | `consumer_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | 需方利润中心 |
| `cost_center` | `cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 | 成本中心 |
| `id` | `id` | 9d6edef7-90a4-419a-b3a6-058b118270e0 | 销售出库单子表id |
| `provider_profit_center` | `provider_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | 供方利润中心 |
| `ptoId` | `ptoId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | PTO件id |
| `receivingCustomer` | `receivingCustomer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 收货客户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `source_salesout_vouchdate` | `source_salesout_vouchdate` | Date | 源销售出库单据日期（仅财务事项过账可用_不存储数据） |

### 整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `ptoHierarchyType` | `ptoHierarchyType` | Integer | 层级结构类型 |
| `ptoPricingMethod` | `ptoPricingMethod` | Integer | 定价方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `excessivesigning` | `excessivesigning` | Short | 超量签收 |

### 长整数 (8个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `coSourceautoid` | Long | 协同源头单据行id |
| `` | `coSourceid` | Long | 协同源头单据头id |
| `despatchDetailId` | `despatchDetailId` | Long | 发运单孙表行id |
| `ptoRowId` | `ptoRowId` | Long | PTO件行id |
| `iSourceSalesOutId` | `iSourceSalesOutId` | Long | 源销售出库单id |
| `iSourceSalesOutRowId` | `iSourceSalesOutRowId` | Long | 源销售出库单行id |
| `` | `subBusinessSourceId` | Long | 子业务源头单据id |
| `` | `subBusinessSourceLineId` | Long | 子业务源头单据行id |

### 数值字段 (11个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `auditedReceivedDiffQty` | `auditedReceivedDiffQty` | Decimal | 已审签收差异数量 |
| `auditedReceivedPriceQty` | `auditedReceivedPriceQty` | Decimal | 已审签收计价数量 |
| `auditedReceivedQuantity` | `auditedReceivedQuantity` | Decimal | 已审签收数量 |
| `` | `coSourceLineNo` | Decimal | 协同源头行号 |
| `overflowRate` | `overflowRate` | Decimal | 溢装率% |
| `ptoCostScrap` | `ptoCostScrap` | Decimal | 成本比例 |
| `ptoQty` | `ptoQty` | Decimal | PTO件底数 |
| `ptoSonQty` | `ptoSonQty` | Decimal | PTO子件主数量 |
| `shortageRate` | `shortageRate` | Decimal | 短装率% |
| `iSourceSalesOutRowNo` | `iSourceSalesOutRowNo` | Decimal | 源销售出库单行号 |
| `` | `subBusinessSourceLineNo` | Decimal | 子业务源头单据行号 |
