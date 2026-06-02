---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.PaymentSchedules]
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

# 收款协议子表 (`voucher.order.PaymentSchedules`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`paymentschedules` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款协议子表 |
| 描述 |  |
| 物理表 | `paymentschedules` |
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

- **部署时间**: 2026-05-22 23:41:49:000
- **安装来源**: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202602/202601051010_metadata_voucher-order_delta.zip`
- **安装人**: mongoTools

## 术语标记

`BusinessData`, `reportHide`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

---

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| 2 | IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

### IUordercorp (`IUordercorp`)
> URI: `base.itf.IUordercorp` | 版本: 73

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `uordercorp` (公司(分区键)) | `iCorpId` | `long` | `Long` |

### IYTenantExt (`IYTenantExt`)
> URI: `ucfbase.ucfbaseItf.IYTenantExt` | 版本: 24

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

---

## 全部直接属性（共 45 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `fixedexpireday` | fixedexpireday | `fixedexpireday` | Short | `short` |  | true | `voucher.order.PaymentSchedules.fixedexpireday` |
| 2 | `fixedoaday` | fixedoaday | `fixedoaday` | Short | `short` |  | true | `voucher.order.PaymentSchedules.fixedoaday` |
| 3 | `paidMoneyNew` | paidMoneyNew | `paidMoneyNew` | Decimal | `number` |  | true | `voucher.order.PaymentSchedules.paidMoneyNew` |
| 4 | `rebateCashMoney` | rebateCashMoney | `fRebateCashMoney` | Decimal | `number` |  | true | `voucher.order.PaymentSchedules.rebateCashMoney` |
| 5 | `settleWay` | settleWay | `settleWay` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |  | true | `voucher.order.PaymentSchedules.settleWay` |
| 6 | `milestoneId` | milestoneId | `cmilestoneid` | 057f2dea-55a5-4003-93c1-3ab6d39d47a2 | `quote` |  | true | `voucher.order.PaymentSchedules.milestoneId` |
| 7 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true | `ucfbase.ucfbaseItf.IYTenantExt.ytenant` |
| 8 | `number` | number | `iNumber` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.number` |
| 9 | `name` | 名称 | `iName` | String | `text` |  | true | `voucher.order.PaymentSchedules.name` |
| 10 | `payRatio` | payRatio | `iPayRatio` | Decimal | `number` | false | true | `voucher.order.PaymentSchedules.payRatio` |
| 11 | `amount` | amount | `iAmount` | Decimal | `number` |  | true | `voucher.order.PaymentSchedules.amount` |
| 12 | `accountDay` | accountDay | `iAccountDay` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.accountDay` |
| 13 | `accountUnit` | accountUnit | `iAccountUnit` | DateUnit | `` |  | true | `voucher.order.PaymentSchedules.accountUnit` |
| 14 | `accountType` | accountType | `iAccounType` | AccountType | `` |  | true | `voucher.order.PaymentSchedules.accountType` |
| 15 | `startDateTime` | startDateTime | `iStartDateTime` | DateTime | `timestamp` |  | true | `voucher.order.PaymentSchedules.startDateTime` |
| 16 | `fixAccoutDateTime` | fixAccoutDateTime | `iFixAccoutDateTime` | DateTime | `timestamp` |  | true | `voucher.order.PaymentSchedules.fixAccoutDateTime` |
| 17 | `expiringDateTime` | expiringDateTime | `iExpiringDateTime` | DateTime | `timestamp` |  | true | `voucher.order.PaymentSchedules.expiringDateTime` |
| 18 | `paidAmount` | paidAmount | `iPaidAmount` | Decimal | `number` |  | true | `voucher.order.PaymentSchedules.paidAmount` |
| 19 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true | `uorder.voucher.UorderBizObject.pubts` |
| 20 | `startDate` | startDate | `iStartDate` | dba40d49-c056-440a-9b39-7697f24364b3 | `quote` |  | true | `voucher.order.PaymentSchedules.startDate` |
| 21 | `mainid` | 主表ID | `iOrderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.PaymentSchedules.mainid` |
| 22 | `controlMode` | controlMode | `iControlMode` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.controlMode` |
| 23 | `controlOppt` | controlOppt | `iControlOppt` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.controlOppt` |
| 24 | `controlLink` | controlLink | `iControlLink` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.controlLink` |
| 25 | `currencyPk` | currencyPk | `cOriginalPk` | String | `text` |  | true | `voucher.order.PaymentSchedules.currencyPk` |
| 26 | `natCurrencyPk` | natCurrencyPk | `cDomesticPk` | String | `text` |  | true | `voucher.order.PaymentSchedules.natCurrencyPk` |
| 27 | `rate` | rate | `fRate` | Decimal | `number` | false | true | `voucher.order.PaymentSchedules.rate` |
| 28 | `id` | 主键ID | `id` | Long | `long` |  | true | `base.entity.BizObject.id` |
| 29 | `fixExpireDayThree` | fixExpireDayThree | `iFixExpireDayThree` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.fixExpireDayThree` |
| 30 | `fixExpireDayTwo` | fixExpireDayTwo | `iFixExpireDayTwo` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.fixExpireDayTwo` |
| 31 | `fixAccoutDayTwo` | fixAccoutDayTwo | `iFixAccoutDayTwo` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.fixAccoutDayTwo` |
| 32 | `fixExpireDayOne` | fixExpireDayOne | `iFixExpireDayOne` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.fixExpireDayOne` |
| 33 | `preReceiveType` | preReceiveType | `iPreReceiveType` | PreReceiveType | `` |  | true | `voucher.order.PaymentSchedules.preReceiveType` |
| 34 | `tenant` | tenant | `tenant_id` | Long | `long` |  | true | `voucher.order.PaymentSchedules.tenant` |
| 35 | `delayMonth` | delayMonth | `iDelayMonth` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.delayMonth` |
| 36 | `preReceive` | preReceive | `bPreReceive` | Boolean | `switch` |  | true | `voucher.order.PaymentSchedules.preReceive` |
| 37 | `fixAccoutDayOne` | fixAccoutDayOne | `iFixAccoutDayOne` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.fixAccoutDayOne` |
| 38 | `fixExpireDayFour` | fixExpireDayFour | `iFixExpireDayFour` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.fixExpireDayFour` |
| 39 | `sourceType` | 来源单据类型 | `bStartSourceType` | Boolean | `switch` |  | true | `voucher.order.PaymentSchedules.sourceType` |
| 40 | `deposit` | deposit | `bDeposit` | Boolean | `switch` |  | true | `voucher.order.PaymentSchedules.deposit` |
| 41 | `fixAccoutDayThree` | fixAccoutDayThree | `iFixAccoutDayThree` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.fixAccoutDayThree` |
| 42 | `fixAccoutDayFour` | fixAccoutDayFour | `iFixAccoutDayFour` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.fixAccoutDayFour` |
| 43 | `delayDay` | delayDay | `iDelayDay` | Integer | `int` |  | true | `voucher.order.PaymentSchedules.delayDay` |
| 44 | `scheduleDefineCharacter` | scheduleDefineCharacter | `scheduleDefineCharacter` | de550f87-5c92-4809-96ba-96255a12eeaa | `UserDefine` |  | true | `voucher.order.PaymentSchedules.scheduleDefineCharacter` |
| 45 | `uordercorp` | 公司(分区键) | `iCorpId` | Long | `long` |  | true | `base.itf.IUordercorp.uordercorp` |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `scheduleDefineCharacter` | scheduleDefineCharacter | `voucher.order.PaymentScheduleDefineCharacter` | `scheduleDefineCharacter` | 外键引用 |  |  | None |  |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |
| 3 | `milestoneId` | milestoneId | `BGDM.milestones.project_milepost` | `cmilestoneid` | 外键引用 |  |  | Service |  |
| 4 | `mainid` | 主表ID | `voucher.order.Order` | `iOrderId` | paymentSchedules → mainid | 0..n | Y | None |  |
| 5 | `settleWay` | settleWay | `aa.settlemethod.SettleMethod` | `settleWay` | 外键引用 |  |  | Service |  |
| 6 | `startDate` | startDate | `bd.receivables.ReceiveStartBase` | `iStartDate` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **主表ID**: `mainid` → `voucher.order.Order` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `milestoneId` (milestoneId) | `BGDM.milestones.project_milepost` | `cmilestoneid` |
| `settleWay` (settleWay) | `aa.settlemethod.SettleMethod` | `settleWay` |
| `startDate` (startDate) | `bd.receivables.ReceiveStartBase` | `iStartDate` |

---

## 使用示例

```sql
-- 查询 收款协议子表 数据
SELECT fixedexpireday, fixedoaday, paidMoneyNew, fRebateCashMoney, settleWay, cmilestoneid, ytenant_id, iNumber, iName, iPayRatio
FROM paymentschedules
WHERE mainid = ? -- 关联主表ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.PaymentSchedules
```
