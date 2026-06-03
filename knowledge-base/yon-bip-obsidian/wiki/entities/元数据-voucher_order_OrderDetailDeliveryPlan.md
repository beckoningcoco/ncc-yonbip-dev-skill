---
tags: [BIP, 元数据, 数据字典, voucher.order.OrderDetailDeliveryPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单发货计划 (`voucher.order.OrderDetailDeliveryPlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`orderdetail_deliveryplan` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单发货计划 |
| 物理表 | `orderdetail_deliveryplan` |
| 数据库 schema | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 39 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `deliveryplandefinecharacter` | `` |
| `ytenant_id` | `` |
| `ptoId` | `` |
| `iStockId` | `udinghuo.aa_warehouseref` |
| `iOrderDetailId` | `` |

## 继承接口 (5个, 11字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **后端自动行号接口** (`base.itf.ILineNo`)
  - `lineno` → `lineno`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **PTO信息** (`usp.pto.IProductToOrder`)
  - `ptoCostScrap` → `ptoCostScrap`
  - `ptoHierarchyType` → `ptoHierarchyType`
  - `ptoId` → `ptoId`
  - `ptoPricingMethod` → `ptoPricingMethod`
  - `ptoQty` → `ptoQty`
  - `ptoRowId` → `ptoRowId`
  - `ptoSonQty` → `ptoSonQty`

## 字段列表（按类型分组）

> 共 39 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `idKey` | `idKey` | `idKey` | 行标识 |
| `memo` | `memo` | `memo` | 备注 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ptoId` | `ptoId` | `ptoId` | PTO件id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `iOrderDetailId` | `iOrderDetailId` | `orderDetailId` | 订单表体id |
| `iStockId` | `iStockId` | `stockId` | 仓库id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `promisedate` | `promisedate` | `promiseDate` | 承诺日期 |
| `dHopeReceiveDate` | `dHopeReceiveDate` | `hopeReceiveDate` | 希望到货日期 |
| `dConsignTime` | `dConsignTime` | `consignTime` | 计划发货日期 |
| `wopStrateDate` | `wopStrateDate` | `wopStrateDate` | 仓储开始日期 |
| `loadDate` | `loadDate` | `loadDate` | 装载日期 |
| `planTransCompleteDate` | `planTransCompleteDate` | `planTransCompleteDate` | 运输计划完成日期 |
| `planArrivalDate` | `planArrivalDate` | `planArrivalDate` | 计划到货日期 |
| `EstiDeliveryCreateDate` | `EstiDeliveryCreateDate` | `EstiDeliveryCreateDate` | 预计发货单创建日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ptoHierarchyType` | `ptoHierarchyType` | `ptoHierarchyType` | 层级结构类型 |
| `ptoPricingMethod` | `ptoPricingMethod` | `ptoPricingMethod` | 定价方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ilinemark` | `ilinemark` | `lineMark` | 行标识mark |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |
| `id` | `id` | `id` | 表体发货计划主键 |
| `isourceid` | `isourceid` | `sourceId` | 原始计划行id |
| `ptoRowId` | `ptoRowId` | `ptoRowId` | PTO件行id |
| `iorderId` | `iorderId` | `orderId` | 订单表头id |

### 数值字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fconfirmqty` | `fconfirmqty` | `confirmQty` | 已确认数量 |
| `funconfirmqty` | `funconfirmqty` | `unConfirmQty` | 未确认数量 |
| `ptoQty` | `ptoQty` | `ptoQty` | PTO件底数 |
| `ptoSonQty` | `ptoSonQty` | `ptoSonQty` | PTO子件主数量 |
| `ptoCostScrap` | `ptoCostScrap` | `ptoCostScrap` | 成本比例 |
| `lineno` | `lineno` | `lineno` | 行号 |
| `fMasterMeasureQuantity` | `fMasterMeasureQuantity` | `qty` | 计划发货数量 |
| `iAuxUnitQuantity` | `iAuxUnitQuantity` | `subQty` | 计划发货销售数量 |
| `iQuantity` | `iQuantity` | `priceQty` | 计划发货计价数量 |
| `fSendQty` | `fSendQty` | `sendQty` | 累计已发货数量 |
| `ftotaloutstockconfirmquantity` | `ftotaloutstockconfirmquantity` | `totalOutStockConfirmQuantity` | 累计出库确认数量 |
| `ftotaloutstockconfirmsubqty` | `ftotaloutstockconfirmsubqty` | `totalOutStockConfirmSubQty` | 累计出库确认件数 |
| `fOutBoundQty` | `fOutBoundQty` | `totalOutStockQuantity` | 累计出库数量 |
| `fTotalOutStockSubQty` | `fTotalOutStockSubQty` | `totalOutStockSubQty` | 累计出库件数 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deliveryplandefinecharacter` | `deliveryplandefinecharacter` | `deliveryPlanDefineCharacter` | 自定义项特征组 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
