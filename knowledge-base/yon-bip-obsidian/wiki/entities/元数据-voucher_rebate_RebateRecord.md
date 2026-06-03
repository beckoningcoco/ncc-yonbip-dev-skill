---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 返利记录 (`voucher.rebate.RebateRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rebateRecord` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利记录 |
| 物理表 | `rebateRecord` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 26 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `iAgentId` | `` |
| `iOrderId` | `` |
| `saleInvoiceId` | `` |
| `iSubmiterId` | `` |
| `ytenant_id` | `` |
| `iRebateId` | `` |

## 继承接口 (2个, 2字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cOrderNo` | `cOrderNo` | `orderNo` | 订单号 |
| `cOutSysKey` | `cOutSysKey` | `outSysKey` | 外部接口唯一标识 |
| `cRebateNo` | `cRebateNo` | `rebateNo` | 返利单号 |
| `cRecordStatus` | `cRecordStatus` | `recordStatus` | 状态(使用中，已生效，已作废) |
| `recordStatusName` | `recordStatusName` | `recordStatusName` | 状态名称 |
| `cSaleReturnNo` | `cSaleReturnNo` | `saleReturnNo` | 退货单编号 |
| `cUseWayCode` | `cUseWayCode` | `useWayCode` | 应用方式Code |
| `cVoucherSourceType` | `cVoucherSourceType` | `voucherSourceType` | 单据来源类型 |
| `cPaymentFinanceCode` | `cPaymentFinanceCode` | `paymentFinanceCode` | 收款单code |
| `settlementNo` | `settlementNo` | `settlementNo` | 冲销单号 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iAgentId` | `iAgentId` | `agentId` | 客户id |
| `iOrderId` | `iOrderId` | `orderId` | 订单id |
| `iRebateId` | `iRebateId` | `rebateId` | 返利单id |
| `iSubmiterId` | `iSubmiterId` | `submitUser` | 创建人Id |
| `saleInvoiceId` | `saleInvoiceId` | `saleInvoiceId` | 销售发票主表id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `feeTransferStatus` | `feeTransferStatus` | `feeTransferStatus` | 费用转移状态 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iSaleReturnId` | `iSaleReturnId` | `saleReturnId` | 退货单id |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |
| `iPaymentFinanceId` | `iPaymentFinanceId` | `paymentFinanceId` | 收款单id |
| `settlementId` | `settlementId` | `settlementId` | 冲销单id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fOrderRebateMoney` | `fOrderRebateMoney` | `orderRebateMoney` | 返利金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateDate` | `dCreateDate` | `createDate` | 创建时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
| `freezeDate` | `freezeDate` | `freezeDate` | 授信截止日期 |
