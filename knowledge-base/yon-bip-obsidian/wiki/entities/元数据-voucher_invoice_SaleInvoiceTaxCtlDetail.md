---
tags: [BIP, 元数据, 数据字典, voucher.invoice.SaleInvoiceTaxCtlDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售发票税控信息子表 (`voucher.invoice.SaleInvoiceTaxCtlDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sa_saleinvoicetaxctldetail` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售发票税控信息子表 |
| 物理表 | `sa_saleinvoicetaxctldetail` |
| domain/服务域 | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `mainid` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cProductCode` | `cProductCode` | `productCode` | 商品编码 |
| `cProductName` | `cProductName` | `productName` | 商品名称 |
| `cChargeUnitName` | `cChargeUnitName` | `chargeUnitName` | 计价单位名称 |
| `cSpeciDes` | `cSpeciDes` | `speciDes` | 属性 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 主表ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iColumnNo` | `iColumnNo` | `columnNo` | 行号 |
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iProductId` | `iProductId` | `productId` | 商品ID |
| `iChargeUnitId` | `iChargeUnitId` | `chargeUnitId` | 计价单位 |
| `iSkuId` | `iSkuId` | `skuId` | skuId |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iChargeQuantity` | `iChargeQuantity` | `chargeQuantity` | 计价数量 |
| `iOrigUnitPrice` | `iOrigUnitPrice` | `origUnitPrice` | 单价 |
| `iTaxMoney` | `iTaxMoney` | `taxMoney` | 税额 |
| `iTaxRate` | `iTaxRate` | `taxRate` | 税率% |
| `iTotalTaxFreeMoney` | `iTotalTaxFreeMoney` | `totalTaxFreeMoney` | 无税金额 |
| `iTotalTaxeMoney` | `iTotalTaxeMoney` | `totalTaxMoney` | 含税金额 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
