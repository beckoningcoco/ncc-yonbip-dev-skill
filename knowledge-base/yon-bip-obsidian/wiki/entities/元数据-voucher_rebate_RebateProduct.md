---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateProduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 返利使用商品 (`voucher.rebate.RebateProduct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rebateProduct` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利使用商品 |
| 物理表 | `rebateProduct` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `iAgentId` | `` |
| `iProductId` | `productcenter.productskuref` |
| `ytenant_id` | `` |
| `iRebateId` | `` |
| `iSkuId` | `` |

## 继承接口 (2个, 2字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cProductCode` | `cProductCode` | `productCode` | 商品编码 |
| `cProductName` | `cProductName` | `productName` | 商品名称 |
| `cRebateNo` | `cRebateNo` | `rebateNo` | 返利单号 |
| `cRebateUseWay` | `cRebateUseWay` | `rebateUseWay` | 返利类型 |
| `cSkuCode` | `cSkuCode` | `skuCode` | sku编码 |
| `cSpecDescription` | `cSpecDescription` | `specDescription` | 描述 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iAgentId` | `iAgentId` | `agentId` | 客户id |
| `iProductId` | `iProductId` | `productAuth` | 物料权限 |
| `iProductId` | `iProductId` | `productId` | 商品id |
| `iRebateId` | `iRebateId` | `rebateId` | 费用单id |
| `iSkuId` | `iSkuId` | `skuId` | iSkuId |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isWiteList` | `isWiteList` | `isWiteList` | 是否是白名单  ture白名单  false 黑名单 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 行号 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iBizProductId` | `iBizProductId` | `bizProductId` | 商品id |
| `iBizSkuId` | `iBizSkuId` | `bizSkuId` | iBizSkuId |
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
