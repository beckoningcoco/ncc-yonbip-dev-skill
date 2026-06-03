---
tags: [BIP, 元数据, 数据字典, st.salesout.PaymentExeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款执行明细 (`st.salesout.PaymentExeDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`paymentexedetail` | domain：`ustock` | 应用：`ST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款执行明细 |
| 物理表 | `paymentexedetail` |
| 数据库 schema | `ustock` |
| 所属应用 | `ST` |
| 直连字段 | 14 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `iDetailId` | `` |
| `settleWay` | `` |
| `iStartDate` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `iDetailId` | `iDetailId` | 9d6edef7-90a4-419a-b3a6-058b118270e0 | detailid |
| `settleWay` | `settleWay` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | 结算方式id |
| `iStartDate` | `iStartDate` | dba40d49-c056-440a-9b39-7697f24364b3 | 起算时点 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bDeposit` | `bDeposit` | Boolean | 是否保证金 |
| `bPreReceive` | `bPreReceive` | Boolean | 是否预收款 |

### 整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `iOrder` | `iOrder` | Integer | 期号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `fPayMoney` | `fPayMoney` | Decimal | 收款金额 |
| `dPayNatMoney` | `dPayNatMoney` | Decimal | 本币收款金额 |
| `fPayRatio` | `fPayRatio` | Decimal | 收款比例 |

### timestamp (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dExpireDate` | `dExpireDate` | DateTime | 到期日 |
| `dStartBaseDate` | `dStartBaseDate` | DateTime | 起算日期 |

### other (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `iPreReceiveType` | `iPreReceiveType` | PreReceiveType | 预收折算方式 |
