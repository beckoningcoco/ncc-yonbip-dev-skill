---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateReturnProductRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 返利回退商品记录 (`voucher.rebate.RebateReturnProductRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rebateReturnProductRecord` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利回退商品记录 |
| 物理表 | `rebateReturnProductRecord` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `iAgentId` | `` |
| `iProductId` | `` |
| `iSkuId` | `` |
| `iOrderId` | `` |
| `iSubmiterId` | `` |
| `ytenant_id` | `` |
| `iRebateId` | `` |
| `iRebateReturnProductId` | `` |

## 继承接口 (2个, 2字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cOrderDetailIdKey` | `cOrderDetailIdKey` | `orderDetailIdKey` | 订单详情 |
| `cOrderNo` | `cOrderNo` | `orderNo` | 订单号 |
| `cOutSysKey` | `cOutSysKey` | `outSysKey` | 外部接口唯一标识 |
| `cRebateNo` | `cRebateNo` | `rebateNo` | 返利单号 |
| `cRecordStatus` | `cRecordStatus` | `recordStatus` | 状态(待确认，已生效，已作废) |
| `recordStatusName` | `recordStatusName` | `recordStatusName` | 状态名称 |
| `cRebateDetailType` | `cRebateDetailType` | `rebateDetailType` | 返利明细类型 |
| `cSaleReturnNo` | `cSaleReturnNo` | `saleReturnNo` | 退货单编号 |
| `settlementNo` | `settlementNo` | `settlementNo` | 冲销单号 |
| `cVoucherSourceType` | `cVoucherSourceType` | `voucherSourceType` | 单据来源类型 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iAgentId` | `iAgentId` | `agentId` | 客户id |
| `iOrderId` | `iOrderId` | `orderId` | 订单id |
| `iProductId` | `iProductId` | `product` | 商品 |
| `iSkuId` | `iSkuId` | `productSku` | 商品 |
| `iRebateId` | `iRebateId` | `rebateId` | 返利单id |
| `iRebateReturnProductId` | `iRebateReturnProductId` | `rebateReturnProductId` | 返商品返利 详情id |
| `iSubmiterId` | `iSubmiterId` | `submitUser` | 创建人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `feeTransferStatus` | `feeTransferStatus` | `feeTransferStatus` | 费用转移状态 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |
| `iSaleReturnDetailId` | `iSaleReturnDetailId` | `saleReturnDetailId` | 退货单明细ID |
| `iSaleReturnId` | `iSaleReturnId` | `saleReturnId` | 退货单ID |
| `settlementId` | `settlementId` | `settlementId` | 冲销单id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iQuantity` | `iQuantity` | `quantity` | 使用数量 |
| `iUsedAmount` | `iUsedAmount` | `usedAmount` | 使用金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateDate` | `dCreateDate` | `createDate` | 创建时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
| `freezeDate` | `freezeDate` | `freezeDate` | 授信截止日期 |
