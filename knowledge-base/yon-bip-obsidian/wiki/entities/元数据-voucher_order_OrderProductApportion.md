---
tags: [BIP, 元数据, 数据字典, voucher.order.OrderProductApportion]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单分摊 (`voucher.order.OrderProductApportion`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`orderproductapportion` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单分摊 |
| 物理表 | `orderproductapportion` |
| 数据库 schema | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `iOrderDetailId` | `` |

## 继承接口 (2个, 2字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cApportionAttr` | `cApportionAttr` | `apportionAttr` | 优惠阶梯 |
| `cApportionName` | `cApportionName` | `apportionName` | 优惠名称 |
| `cApportionType` | `cApportionType` | `apportionType` | 优惠类型 |
| `cOrderNo` | `cOrderNo` | `orderNo` | 单据编号 |
| `cProductType` | `cProductType` | `productType` | 商品类型 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrderDetailId` | `iOrderDetailId` | `orderDetailId` | 订单商品ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bEnableMaxPreferential` | `bEnableMaxPreferential` | `enableMaxPreferential` | 是否启用最大数量 |
| `bHide` | `bHide` | `hide` | 是否显示 |
| `bOverlimit` | `bOverlimit` | `overlimit` | 是否超限额 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pType` | `pType` | `type` | 活动的类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iEntityPreType` | `iEntityPreType` | `entityPreType` | 整单优惠的类型 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDetailSkuId` | `iDetailSkuId` | `detailSkuId` | 商品SKUID |
| `id` | `id` | `id` | id |
| `iOrderId` | `iOrderId` | `orderId` | 订单Id |
| `iPreId` | `iPreId` | `preId` | 活动的ID |
| `iProId` | `iProId` | `proId` | 商品对应商品行的Id |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fApportionMoney` | `fApportionMoney` | `apportionMoney` | 优惠金额 |
| `fApportionNum` | `fApportionNum` | `apportionNum` | 优惠的数量 |
| `iDiscount` | `iDiscount` | `discount` | 折扣 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
