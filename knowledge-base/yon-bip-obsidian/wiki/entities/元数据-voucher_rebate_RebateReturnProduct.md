---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateReturnProduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 返利回退商品 (`voucher.rebate.RebateReturnProduct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rebateReturnProduct` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利回退商品 |
| 物理表 | `rebateReturnProduct` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 43 个 |
| 子表 | 1 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rebateReturnProduct2Records` | `voucher.rebate.RebateReturnProductRecord` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `expenseItemId` | `` |
| `iAgentId` | `` |
| `iProductClassId` | `productcenter.pc_presentationclassref` |
| `iProductId` | `productcenter.productref` |
| `ytenant_id` | `` |
| `iProductBrandId` | `productcenter.pc_brandref` |
| `rebateReturnProductCharacteristics` | `` |
| `` | `` |
| `cUnitType` | `` |
| `marketingActiveId` | `` |
| `iRebateId` | `` |
| `expenseItemTypeId` | `` |
| `iSkuId` | `productcenter.productskuref` |
| `iProductLineId` | `productcenter.pc_productlineref` |

## 继承接口 (2个, 2字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 43 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cBizSkuIds` | `cBizSkuIds` | `bizSkuIds` | cBizSkuIds |
| `cProductCode` | `cProductCode` | `cProductCode` | 商品编码 |
| `cOutSysKey` | `cOutSysKey` | `outSysKey` | 外部接口唯一标识 |
| `cProductName` | `cProductName` | `productName` | 商品名称 |
| `productOutSysKey` | `productOutSysKey` | `productOutSysKey` | 商品的外部主键 |
| `iCorpId` | `iCorpId` | `uordercorp` | uordercorp |
| `cUseWayCode` | `cUseWayCode` | `useWayCode` | 应用方式Code |
| `cRebateNo` | `cRebateNo` | `rebateNo` | 返利单号 |
| `cSpecDescription` | `cSpecDescription` | `specDescription` | 描述 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iProductId` | `iProductId` | `productAuth` | 物料权限 |
| `iProductLineId` | `iProductLineId` | `productLineId` | 产品线id |
| `iRebateId` | `iRebateId` | `rebateId` | 费用单id |
| `iProductBrandId` | `iProductBrandId` | `productBrandId` | 品牌id |
| `iProductClassId` | `iProductClassId` | `productClassId` | 商品分类id |
| `iProductId` | `iProductId` | `productId` | 商品ID |
| `iSkuId` | `iSkuId` | `skuId` | skuId |
| `cUnitType` | `cUnitType` | `unitType` | 返货数量单位Id |
| `iAgentId` | `iAgentId` | `agentId` | 客户id |
| `expenseItemId` | `expenseItemId` | `expenseItemId` | 费用项目 |
| `expenseItemTypeId` | `expenseItemTypeId` | `expenseItemTypeId` | 费用项目类别 |
| `marketingActiveId` | `marketingActiveId` | `marketingActiveId` | 营销活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `usmpPayModel` | `usmpPayModel` | `usmpPayModel` | 上游单据商品类型 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iSourceId` | `iSourceId` | `sourceId` | 来源id |
| `id` | `id` | `id` | 商品返利商品行Id |
| `iBizProductId` | `iBizProductId` | `bizProductId` | biz商品ID |
| `cSourceDetailId` | `cSourceDetailId` | `sourceDetailId` | 来源单ID |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iUsedAmount` | `iUsedAmount` | `usedAmount` | 使用金额 |
| `iUsedQuantity` | `iUsedQuantity` | `usedQuantity` | 应用数量 |
| `iQuantity` | `iQuantity` | `quantity` | 返货数量 |
| `iAmount` | `iAmount` | `amount` | 返货金额 |
| `iSurplusQuantity` | `iSurplusQuantity` | `surplusQuantity` | 剩余数量 |
| `iSurplusAmount` | `iSurplusAmount` | `surplusAmount` | 剩余金额 |
| `fReduceRebateQuantity` | `fReduceRebateQuantity` | `reduceRebateQuantity` | 费用扣减数量 |
| `fReduceRebateAmount` | `fReduceRebateAmount` | `reduceRebateAmount` | 费用扣减金额 |
| `maxRebateMoney` | `maxRebateMoney` | `maxRebateMoney` | 最大使用金额 |
| `maxRebateRatio` | `maxRebateRatio` | `maxRebateRatio` | 最大使用比例 |
| `minRebateMoney` | `minRebateMoney` | `minRebateMoney` | 最低购买金额 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateDate` | `dCreateDate` | `createDate` | 创建时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicableType` | `applicableType` | `applicableType` | 适用类型 |
| `` | `` | `rebateReturnProduct2Records` | 返利回退商品记录 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rebateReturnProductCharacteristics` | `rebateReturnProductCharacteristics` | `rebateReturnProductCharacteristics` | 自由项特征组 |
