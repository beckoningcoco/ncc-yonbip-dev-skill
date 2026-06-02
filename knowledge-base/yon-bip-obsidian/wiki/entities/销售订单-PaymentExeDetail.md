---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.PaymentExeDetail]
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

# 收款执行明细 (`voucher.order.PaymentExeDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`paymentexedetail` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款执行明细 |
| 描述 | 收款执行明细 |
| 物理表 | `paymentexedetail` |
| 所属应用 | `SCMSA` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 数据权限场景 | `bill_maintain` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键ID |

## 部署信息

- **部署时间**: 2026-01-24 01:22:20:000
- **安装来源**: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202603/202601191751_metadata_voucher-order_delta.zip`
- **安装人**: mongoTools

## 术语标记

`BusinessData`, `isView`, `reportHide`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

---

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

### IYTenantExt (`IYTenantExt`)
> URI: `ucfbase.ucfbaseItf.IYTenantExt` | 版本: 24

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

---

## 全部直接属性（共 72 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true | `base.entity.BizObject.id` |
| 2 | `mainid` | 主表ID | `firstsourceid` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` | false | true | `voucher.order.PaymentExeDetail.mainid` |
| 3 | `fixedexpireday` | fixedexpireday | `fixedexpireday` | Integer | `int` |  | true | `voucher.paymentexedetail.PaymentExeDetail.fixedexpireday` |
| 4 | `fixedoaday` | fixedoaday | `fixedoaday` | Integer | `int` |  | true | `voucher.paymentexedetail.PaymentExeDetail.fixedoaday` |
| 5 | `settleWay` | settleWay | `settleWay` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |  | true | `voucher.paymentexedetail.PaymentExeDetail.settleWay` |
| 6 | `accountDate` | accountDate | `dAccountDate` | DateTime | `timestamp` |  | true | `voucher.paymentexedetail.PaymentExeDetail.accountDate` |
| 7 | `accountDay` | accountDay | `iAccountDay` | Integer | `int` |  | true | `voucher.paymentexedetail.PaymentExeDetail.accountDay` |
| 8 | `accountType` | accountType | `iAccountType` | Short | `short` |  | true | `voucher.paymentexedetail.PaymentExeDetail.accountType` |
| 9 | `accountUnit` | accountUnit | `iAccountUnit` | Short | `short` |  | true | `voucher.paymentexedetail.PaymentExeDetail.accountUnit` |
| 10 | `actualPayDate` | actualPayDate | `dActualPayDate` | DateTime | `timestamp` |  | true | `voucher.paymentexedetail.PaymentExeDetail.actualPayDate` |
| 11 | `delayDays` | delayDays | `iDelayDays` | Integer | `int` |  | true | `voucher.paymentexedetail.PaymentExeDetail.delayDays` |
| 12 | `delayMonths` | delayMonths | `iDelayMonths` | Integer | `int` |  | true | `voucher.paymentexedetail.PaymentExeDetail.delayMonths` |
| 13 | `deposit` | deposit | `bDeposit` | Boolean | `switch` |  | true | `voucher.paymentexedetail.PaymentExeDetail.deposit` |
| 14 | `expireDate` | expireDate | `dExpireDate` | DateTime | `timestamp` |  | true | `voucher.paymentexedetail.PaymentExeDetail.expireDate` |
| 15 | `firstsource` | firstsource | `firstsource` | String | `text` |  | true | `voucher.paymentexedetail.PaymentExeDetail.firstsource` |
| 16 | `firstsourceautoid` | firstsourceautoid | `firstsourceautoid` | Long | `long` |  | true | `voucher.paymentexedetail.PaymentExeDetail.firstsourceautoid` |
| 17 | `firstsourceid` | firstsourceid | `firstsourceid` | Long | `long` |  | true | `voucher.paymentexedetail.PaymentExeDetail.firstsourceid` |
| 18 | `firstupcode` | firstupcode | `firstupcode` | String | `text` |  | true | `voucher.paymentexedetail.PaymentExeDetail.firstupcode` |
| 19 | `fixedexpireday1` | fixedexpireday1 | `iFixedExpireDay1` | Short | `short` |  | true | `voucher.paymentexedetail.PaymentExeDetail.fixedexpireday1` |
| 20 | `fixedexpireday2` | fixedexpireday2 | `iFixedExpireDay2` | Short | `short` |  | true | `voucher.paymentexedetail.PaymentExeDetail.fixedexpireday2` |
| 21 | `fixedexpireday3` | fixedexpireday3 | `iFixedExpireDay3` | Short | `short` |  | true | `voucher.paymentexedetail.PaymentExeDetail.fixedexpireday3` |
| 22 | `fixedexpireday4` | fixedexpireday4 | `iFixedExpireDay4` | Short | `short` |  | true | `voucher.paymentexedetail.PaymentExeDetail.fixedexpireday4` |
| 23 | `fixedoaday1` | fixedoaday1 | `iFixedoaDay1` | Short | `short` |  | true | `voucher.paymentexedetail.PaymentExeDetail.fixedoaday1` |
| 24 | `fixedoaday2` | fixedoaday2 | `iFixedoaDay2` | Short | `short` |  | true | `voucher.paymentexedetail.PaymentExeDetail.fixedoaday2` |
| 25 | `fixedoaday3` | fixedoaday3 | `iFixedoaDay3` | Short | `short` |  | true | `voucher.paymentexedetail.PaymentExeDetail.fixedoaday3` |
| 26 | `fixedoaday4` | fixedoaday4 | `iFixedoaDay4` | Short | `short` |  | true | `voucher.paymentexedetail.PaymentExeDetail.fixedoaday4` |
| 27 | `isInit` | isInit | `isInit` | Boolean | `switch` |  | true | `voucher.paymentexedetail.PaymentExeDetail.isInit` |
| 28 | `order` | order | `iOrder` | Integer | `int` |  | true | `voucher.paymentexedetail.PaymentExeDetail.order` |
| 29 | `paidNatMoney` | paidNatMoney | `dPaidNatMoney` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.paidNatMoney` |
| 30 | `payNatMoney` | payNatMoney | `dPayNatMoney` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.payNatMoney` |
| 31 | `payNatSum` | payNatSum | `dPayNatSum` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.payNatSum` |
| 32 | `preReceive` | preReceive | `bPreReceive` | Boolean | `switch` |  | true | `voucher.paymentexedetail.PaymentExeDetail.preReceive` |
| 33 | `product` | product | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true | `voucher.order.PaymentExeDetail.product` |
| 34 | `productsku` | productsku | `iProductSkuid` | Long | `long` |  | true | `voucher.paymentexedetail.PaymentExeDetail.productsku` |
| 35 | `receiveAgreementId` | 收款协议 | `iReceiveAgreementId` | Long | `long` |  | true | `voucher.paymentexedetail.PaymentExeDetail.receiveAgreementId` |
| 36 | `source` | 订单来源 | `source` | String | `text` |  | true | `voucher.paymentexedetail.PaymentExeDetail.source` |
| 37 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |  | true | `voucher.paymentexedetail.PaymentExeDetail.sourceautoid` |
| 38 | `sourceid` | sourceid | `sourceid` | Long | `long` |  | true | `voucher.paymentexedetail.PaymentExeDetail.sourceid` |
| 39 | `startBase` | startBase | `cStartBase` | String | `text` |  | true | `voucher.paymentexedetail.PaymentExeDetail.startBase` |
| 40 | `startBaseDate` | startBaseDate | `dStartBaseDate` | DateTime | `timestamp` |  | true | `voucher.paymentexedetail.PaymentExeDetail.startBaseDate` |
| 41 | `startColumn` | startColumn | `cStartColumn` | String | `text` |  | true | `voucher.paymentexedetail.PaymentExeDetail.startColumn` |
| 42 | `tenant` | tenant | `tenant_id` | Long | `long` | true | true | `voucher.paymentexedetail.PaymentExeDetail.tenant` |
| 43 | `upcode` | upcode | `upcode` | String | `text` |  | true | `voucher.paymentexedetail.PaymentExeDetail.upcode` |
| 44 | `number` | number | `iOrder` | Integer | `int` | false | true | `voucher.order.PaymentExeDetail.number` |
| 45 | `period` | period | `period` | String | `text` | false | true | `voucher.order.PaymentExeDetail.period` |
| 46 | `payRatio` | payRatio | `fPayRatio` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.payRatio` |
| 47 | `payMoney` | 支付金额 | `fPayMoney` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.payMoney` |
| 48 | `vouchtype` | vouchtype | `cVouchType` | String | `text` |  | true | `voucher.paymentexedetail.PaymentExeDetail.vouchtype` |
| 49 | `vouchid` | vouchid | `iVouchId` | Long | `long` |  | true | `voucher.paymentexedetail.PaymentExeDetail.vouchid` |
| 50 | `vouchsubid` | vouchsubid | `iVouchSubId` | Long | `long` |  | true | `voucher.paymentexedetail.PaymentExeDetail.vouchsubid` |
| 51 | `vouchcode` | vouchcode | `cVouchCode` | String | `text` |  | true | `voucher.paymentexedetail.PaymentExeDetail.vouchcode` |
| 52 | `paySum` | paySum | `fPaySum` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.paySum` |
| 53 | `paidMoney` | 已付金额 | `fPaidMoney` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.paidMoney` |
| 54 | `writeBackSum` | writeBackSum | `fWriteBackSum` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.writeBackSum` |
| 55 | `startDateTime` | startDateTime | `dStartBaseDate` | DateTime | `timestamp` |  | true | `voucher.order.PaymentExeDetail.startDateTime` |
| 56 | `fixAccoutDateTime` | fixAccoutDateTime | `dAccountDate` | Date | `date` | false | true | `voucher.order.PaymentExeDetail.fixAccoutDateTime` |
| 57 | `expiringDateTime` | expiringDateTime | `dExpireDate` | Date | `date` | false | true | `voucher.order.PaymentExeDetail.expiringDateTime` |
| 58 | `isAdvancePay` | isAdvancePay | `bPreReceive` | Boolean | `switch` | false | true | `voucher.order.PaymentExeDetail.isAdvancePay` |
| 59 | `rowno` | rowno | `rowno` | Integer | `int` | false | true | `voucher.order.PaymentExeDetail.rowno` |
| 60 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true | `base.entity.BizObject.pubts` |
| 61 | `actualPayMoney` | actualPayMoney | `fActualPayMoney` | Decimal | `number` |  | true | `voucher.order.PaymentExeDetail.actualPayMoney` |
| 62 | `startDate` | startDate | `iStartDate` | dba40d49-c056-440a-9b39-7697f24364b3 | `quote` |  | true | `voucher.paymentexedetail.PaymentExeDetail.startDate` |
| 63 | `autoDetailid` | autoDetailid | `firstsourceautoid` | 3722d563-08aa-453d-ac82-6b8cf906b1ab | `quote` |  | true | `voucher.order.PaymentExeDetail.autoDetailid` |
| 64 | `blueInvId` | blueInvId | `blueInvId` | Long | `long` |  | true | `voucher.paymentexedetail.PaymentExeDetail.blueInvId` |
| 65 | `paidMoneyNew` | paidMoneyNew | `paidMoneyNew` | Decimal | `number` | false | true | `voucher.order.PaymentExeDetail.paidMoneyNew` |
| 66 | `payExe` | payExe | `payExe` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.payExe` |
| 67 | `payNatExe` | payNatExe | `payNatExe` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.payNatExe` |
| 68 | `rebateCashMoney` | rebateCashMoney | `fRebateCashMoney` | Decimal | `number` |  | true | `voucher.order.PaymentExeDetail.rebateCashMoney` |
| 69 | `settlementOrgId` | 开票组织 | `iSettlementOrgId` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` | false | true | `voucher.order.PaymentExeDetail.settlementOrgId` |
| 70 | `srcExedetailId` | srcExedetailId | `src_exedetail_id` | Long | `long` |  | true | `voucher.paymentexedetail.PaymentExeDetail.srcExedetailId` |
| 71 | `totalPaidMoneyNew` | totalPaidMoneyNew | `fTotalPaidMoneyNew` | Decimal | `number` |  | true | `voucher.paymentexedetail.PaymentExeDetail.totalPaidMoneyNew` |
| 72 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true | `ucfbase.ucfbaseItf.IYTenantExt.ytenant` |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `product` | product | `pc.product.Product` | `iProductid` | 外键引用 |  |  | Service |  |
| 2 | `autoDetailid` | autoDetailid | `voucher.order.OrderDetail` | `firstsourceautoid` | 外键引用 |  |  | None |  |
| 3 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |
| 4 | `settlementOrgId` | 开票组织 | `org.func.FinanceOrg` | `iSettlementOrgId` | 外键引用 |  |  | Service |  |
| 5 | `mainid` | 主表ID | `voucher.order.Order` | `firstsourceid` | paymentExeDetail → mainid | 0..n | Y | None |  |
| 6 | `settleWay` | settleWay | `aa.settlemethod.SettleMethod` | `settleWay` | 外键引用 |  |  | Service |  |
| 7 | `startDate` | startDate | `bd.receivables.ReceiveStartBase` | `iStartDate` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **主表ID**: `mainid` → `voucher.order.Order` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `product` (product) | `pc.product.Product` | `iProductid` |
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `settlementOrgId` (开票组织) | `org.func.FinanceOrg` | `iSettlementOrgId` |
| `settleWay` (settleWay) | `aa.settlemethod.SettleMethod` | `settleWay` |
| `startDate` (startDate) | `bd.receivables.ReceiveStartBase` | `iStartDate` |

---

## 使用示例

```sql
-- 查询 收款执行明细 数据
SELECT id, firstsourceid, fixedexpireday, fixedoaday, settleWay, dAccountDate, iAccountDay, iAccountType, iAccountUnit, dActualPayDate
FROM paymentexedetail
WHERE mainid = ? -- 关联主表ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.PaymentExeDetail
```
