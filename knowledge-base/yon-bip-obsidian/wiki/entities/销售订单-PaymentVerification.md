---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.PaymentVerification]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: voucher.order.Order
---

# 支付核销表 (`voucher.order.PaymentVerification`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`paymentverification` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 支付核销表 |
| 描述 |  |
| 物理表 | `paymentverification` |
| 所属应用 | `SCMSA` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 数据权限场景 | `` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键ID |

## 部署信息

- **部署时间**: 2024-09-27 23:46:26:000
- **安装来源**: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V3_R6_2407/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202407/202407091921_metadata_voucher-order_delta.zip`
- **安装人**: mongoTools

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

---

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| 2 | Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| 3 | IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

### IUordercorp (`IUordercorp`)
> URI: `base.itf.IUordercorp` | 版本: 73

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `uordercorp` (公司(分区键)) | `iCorpId` | `long` | `Long` |

### Deletable (`Deletable`)
> URI: `base.itf.Deletable` | 版本: 67

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `isDeleted` (isDeleted) | `iDeleted` | `switch` | `Boolean` |

### IYTenantExt (`IYTenantExt`)
> URI: `ucfbase.ucfbaseItf.IYTenantExt` | 版本: 24

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

---

## 全部直接属性（共 37 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `agentId` | 客户 | `iAgentId` | Long | `long` |  | true | `voucher.order.PaymentVerification.agentId` |
| 2 | `amount` | amount | `iAmount` | Decimal | `number` |  | true | `voucher.order.PaymentVerification.amount` |
| 3 | `createTime` | 创建时间 | `dCreatedTime` | DateTime | `timestamp` |  | true | `voucher.order.PaymentVerification.createTime` |
| 4 | `creator` | 创建人 | `cCreator` | String | `text` |  | true | `voucher.order.PaymentVerification.creator` |
| 5 | `creatorId` | 创建人ID | `iSubmiterId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true | `voucher.order.PaymentVerification.creatorId` |
| 6 | `financeDetailId` | financeDetailId | `iFinanceDetailId` | String | `text` |  | true | `voucher.order.PaymentVerification.financeDetailId` |
| 7 | `financeId` | financeId | `iFinancePaymentId` | String | `text` |  | true | `voucher.order.PaymentVerification.financeId` |
| 8 | `iSsueNo` | iSsueNo | `iSsueNo` | Integer | `int` |  | true | `voucher.order.PaymentVerification.iSsueNo` |
| 9 | `id` | 主键ID | `id` | Long | `long` |  | true | `base.entity.BizObject.id` |
| 10 | `isDeleted` | isDeleted | `iDeleted` | Boolean | `switch` |  | true | `base.itf.Deletable.isDeleted` |
| 11 | `isVerification` | isVerification | `isVerification` | Boolean | `switch` |  | true | `voucher.order.PaymentVerification.isVerification` |
| 12 | `modifier` | 修改人 | `cModifier` | String | `text` |  | true | `voucher.order.PaymentVerification.modifier` |
| 13 | `modifierId` | 修改人ID | `iModifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true | `voucher.order.PaymentVerification.modifierId` |
| 14 | `modifyTime` | 修改时间 | `dModifyTime` | DateTime | `timestamp` |  | true | `voucher.order.PaymentVerification.modifyTime` |
| 15 | `orderAmount` | orderAmount | `iorderAmount` | Decimal | `number` |  | true | `voucher.order.PaymentVerification.orderAmount` |
| 16 | `orderCurrency` | orderCurrency | `cOrderCurrencyPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true | `voucher.order.PaymentVerification.orderCurrency` |
| 17 | `orderDetailId` | orderDetailId | `iOrderDetailId` | Long | `long` |  | true | `voucher.order.PaymentVerification.orderDetailId` |
| 18 | `orderId` | 订单ID | `iOrderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.PaymentVerification.orderId` |
| 19 | `outSyskey` | outSyskey | `cOutSyskey` | String | `text` |  | true | `voucher.order.PaymentVerification.outSyskey` |
| 20 | `parVoucherNo` | parVoucherNo | `cParVoucherNo` | String | `text` |  | true | `voucher.order.PaymentVerification.parVoucherNo` |
| 21 | `payBusinessDate` | payBusinessDate | `dPayBusinessDate` | Date | `date` |  | true | `voucher.order.PaymentVerification.payBusinessDate` |
| 22 | `payCurrency` | payCurrency | `cPayCurrencyPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true | `voucher.order.PaymentVerification.payCurrency` |
| 23 | `payDate` | 收款时间 | `dPayDate` | DateTime | `timestamp` |  | true | `voucher.order.PaymentVerification.payDate` |
| 24 | `payNo` | payNo | `cPayNo` | String | `text` |  | true | `voucher.order.PaymentVerification.payNo` |
| 25 | `paymentDetailId` | paymentDetailId | `iPaymentDetailId` | 831ceb71-a226-4ea3-9eb2-0c809c82669f | `quote` |  | true | `voucher.order.PaymentVerification.paymentDetailId` |
| 26 | `paymentVoucher` | paymentVoucher | `iPaymentId` | c74e56b1-57e1-4d21-b8d5-e31fdcaf803e | `quote` |  | true | `voucher.order.PaymentVerification.paymentVoucher` |
| 27 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true | `uorder.voucher.UorderBizObject.pubts` |
| 28 | `rate` | rate | `iRate` | Decimal | `number` |  | true | `voucher.order.PaymentVerification.rate` |
| 29 | `rollBackDate` | rollBackDate | `dRollBackDate` | DateTime | `timestamp` |  | true | `voucher.order.PaymentVerification.rollBackDate` |
| 30 | `rollBackUser` | rollBackUser | `iRollBackUserId` | Long | `long` |  | true | `voucher.order.PaymentVerification.rollBackUser` |
| 31 | `status` | 状态 | `cStatus` | String | `text` |  | true | `voucher.order.PaymentVerification.status` |
| 32 | `uordercorp` | 公司(分区键) | `iCorpId` | Long | `long` |  | true | `base.itf.IUordercorp.uordercorp` |
| 33 | `verificationType` | verificationType | `iVerificationType` | Integer | `int` |  | true | `voucher.order.PaymentVerification.verificationType` |
| 34 | `voucherNo` | voucherNo | `cVoucherNo` | String | `text` |  | true | `voucher.order.PaymentVerification.voucherNo` |
| 35 | `voucherType` | voucherType | `cVoucherType` | String | `text` |  | true | `voucher.order.PaymentVerification.voucherType` |
| 36 | `voucherTypeName` | voucherTypeName | `cVoucherTypeName` | String | `text` |  | true | `voucher.order.PaymentVerification.voucherTypeName` |
| 37 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true | `ucfbase.ucfbaseItf.IYTenantExt.ytenant` |

---

## 关联属性（共 8 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `orderCurrency` | orderCurrency | `bd.currencytenant.CurrencyTenantVO` | `cOrderCurrencyPk` | 外键引用 |  |  | Service |  |
| 2 | `orderId` | 订单ID | `voucher.order.Order` | `iOrderId` | paymentVerifications → orderId | 0..n | Y | None |  |
| 3 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |
| 4 | `paymentDetailId` | paymentDetailId | `voucher.upaymentvoucher.PaymentVoucherDetail` | `iPaymentDetailId` | 外键引用 |  |  | None |  |
| 5 | `paymentVoucher` | paymentVoucher | `voucher.upaymentvoucher.PaymentVoucher` | `iPaymentId` | 外键引用 |  |  | None |  |
| 6 | `creatorId` | 创建人ID | `base.user.User` | `iSubmiterId` | 外键引用 |  |  | Service |  |
| 7 | `modifierId` | 修改人ID | `base.user.User` | `iModifierId` | 外键引用 |  |  | Service |  |
| 8 | `payCurrency` | payCurrency | `bd.currencytenant.CurrencyTenantVO` | `cPayCurrencyPk` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **订单ID**: `orderId` → `voucher.order.Order` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `orderCurrency` (orderCurrency) | `bd.currencytenant.CurrencyTenantVO` | `cOrderCurrencyPk` |
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人ID) | `base.user.User` | `iSubmiterId` |
| `modifierId` (修改人ID) | `base.user.User` | `iModifierId` |
| `payCurrency` (payCurrency) | `bd.currencytenant.CurrencyTenantVO` | `cPayCurrencyPk` |

---

## 使用示例

```sql
-- 查询 支付核销表 数据
SELECT iAgentId, iAmount, dCreatedTime, cCreator, iSubmiterId, iFinanceDetailId, iFinancePaymentId, iSsueNo, id, iDeleted
FROM paymentverification
WHERE orderId = ? -- 关联订单ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.PaymentVerification
```
