---
tags: [BIP, 元数据, 数据字典, voucher.invoice.PaymentExeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款执行明细 (`voucher.invoice.PaymentExeDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`paymentexedetail` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款执行明细 |
| 物理表 | `paymentexedetail` |
| 数据库 schema | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 58 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `iVouchSubId` | `` |
| `iVouchId` | `` |
| `ytenant_id` | `` |
| `firstsourceid` | `` |
| `settleWay` | `` |
| `iStartDate` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 58 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cVouchCode` | `cVouchCode` | `vouchcode` | 单据编号 |
| `` | `period` | `period` | 阶段 |
| `upcode` | `upcode` | `upcode` | 来源单据号 |
| `source` | `source` | `source` | 来源单据类型 |
| `firstupcode` | `firstupcode` | `firstupcode` | 源头单据号 |
| `firstsource` | `firstsource` | `firstsource` | 源头单据类型 |
| `cStartColumn` | `cStartColumn` | `startColumn` | 起算字段 |
| `cStartBase` | `cStartBase` | `startBase` | 起算阶段 |
| `cVouchType` | `cVouchType` | `vouchtype` | 单据类型 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `firstsourceid` | `firstsourceid` | `mainid` | 订单id |
| `iVouchId` | `iVouchId` | `vouchid` | 单据主表id |
| `iVouchSubId` | `iVouchSubId` | `vouchsubid` | 单据子表id |
| `settleWay` | `settleWay` | `settleWay` | 结算方式id |
| `iStartDate` | `iStartDate` | `startDate` | 起算时点 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isInit` | `isInit` | `isInit` | 是否是订单创建时生成 |
| `bDeposit` | `bDeposit` | `deposit` | 0无保证金1有保证金 |
| `bPreReceive` | `bPreReceive` | `preReceive` | 0无预收1预收 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `rowno` | `rowno` | 行号 |
| `iAccountDay` | `iAccountDay` | `accountDay` | 账期 |
| `iDelayMonths` | `iDelayMonths` | `delayMonths` | 延迟月份 |
| `iDelayDays` | `iDelayDays` | `delayDays` | 延迟天数 |
| `iOrder` | `iOrder` | `order` | 顺序 |

### 短整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iFixedExpireDay4` | `iFixedExpireDay4` | `fixedexpireday4` | 固定到期日4 |
| `iFixedExpireDay3` | `iFixedExpireDay3` | `fixedexpireday3` | 固定到期日3 |
| `iFixedExpireDay2` | `iFixedExpireDay2` | `fixedexpireday2` | 固定到期日2 |
| `iFixedExpireDay1` | `iFixedExpireDay1` | `fixedexpireday1` | 固定到期日1 |
| `iAccountUnit` | `iAccountUnit` | `accountUnit` | 账期单位 |
| `iAccountType` | `iAccountType` | `accountType` | 账期类型 |
| `iFixedoaDay4` | `iFixedoaDay4` | `fixedoaday4` | 固定出账日4 |
| `iFixedoaDay3` | `iFixedoaDay3` | `fixedoaday3` | 固定出账日3 |
| `iFixedoaDay2` | `iFixedoaDay2` | `fixedoaday2` | 固定出账日2 |
| `iFixedoaDay1` | `iFixedoaDay1` | `fixedoaday1` | 固定出账日1 |

### 长整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 收款执行明细主键 |
| `sourceautoid` | `sourceautoid` | `sourceautoid` | 来源单据子表id |
| `sourceid` | `sourceid` | `sourceid` | 来源单据主表id |
| `iReceiveAgreementId` | `iReceiveAgreementId` | `receiveAgreementId` | 收付款协议id |
| `firstsourceautoid` | `firstsourceautoid` | `firstsourceautoid` | 源头单据子表id |
| `firstsourceid` | `firstsourceid` | `firstsourceid` | 源头单据主表id |
| `iProductid` | `iProductid` | `product` | 商品 |
| `iProductSkuid` | `iProductSkuid` | `productsku` | 商品SKUID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `blueInvId` | `blueInvId` | `blueInvId` | 蓝字发票执行明细id |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fActualPayMoney` | `fActualPayMoney` | `actualPayMoney` | 实际收款金额 |
| `fWriteBackSum` | `fWriteBackSum` | `writeBackSum` | 回写金额 |
| `dPaidNatMoney` | `dPaidNatMoney` | `paidNatMoney` | 本币冲销金额 |
| `dPayNatMoney` | `dPayNatMoney` | `payNatMoney` | 本币收款金额 |
| `dPayNatSum` | `dPayNatSum` | `payNatSum` | 本币收款总金额 |
| `fPaidMoney` | `fPaidMoney` | `paidMoney` | 冲销金额 |
| `fPayMoney` | `fPayMoney` | `payMoney` | 收款金额 |
| `fPaySum` | `fPaySum` | `paySum` | 收款总金额 |
| `fPayRatio` | `fPayRatio` | `payRatio` | 收款比例 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iPreReceiveType` | `iPreReceiveType` | `preReceiveType` | 预收折算方式 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dActualPayDate` | `dActualPayDate` | `actualPayDate` | 实际收款日 |
| `dExpireDate` | `dExpireDate` | `expireDate` | 到期日 |
| `dAccountDate` | `dAccountDate` | `accountDate` | 出账日 |
| `dStartBaseDate` | `dStartBaseDate` | `startBaseDate` | 起算日 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
