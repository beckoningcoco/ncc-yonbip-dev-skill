---
tags: [BIP, 元数据, 数据字典, sact.contract.OrderExecute]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同执行情况 (`sact.contract.OrderExecute`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sact_orderexecute` | domain：`sact` | 应用：`SACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同执行情况 |
| 物理表 | `sact_orderexecute` |
| 数据库 schema | `sact` |
| 所属应用 | `SACT` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `cunit_id` | `` |
| `ytenant_id` | `` |
| `saco_oId` | `` |
| `sact_vid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `sact_vid` | `sact_vid` | `sactVId` | 执行情况外键 |
| `saco_oId` | `saco_oId` | `sacoOId` | 对应标的行 |
| `cunit_id` | `cunit_id` | `sactUnitId` | 合同单位 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `irowno` | `irowno` | `rowNo` | 行号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 执行情况 |

### 数值字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sactnum` | `sactnum` | `sactNum` | 合同数量 |
| `sactmoney` | `sactmoney` | `sactMoney` | 合同金额 |
| `ordernum` | `ordernum` | `orderNum` | 订单累计数量 |
| `ordermoney` | `ordermoney` | `orderMoney` | 订单累计金额 |
| `projectNum` | `projectNum` | `projectNum` | 项目累计数量 |
| `totalsendnum` | `totalsendnum` | `totalSendNum` | 已发货数量 |
| `totaloutnum` | `totaloutnum` | `totalOutNum` | 已出库数量 |
| `totalinvoicenum` | `totalinvoicenum` | `totalInvoiceNum` | 已开票数量 |
| `totalinvoicemoney` | `totalinvoicemoney` | `totalInvoiceMoney` | 已开票金额 |
| `demand_money` | `demand_money` | `demandMoney` | 已要货金额 |
| `demandNum` | `demandNum` | `demandNum` | 累计已要货量 |
| `settledMoeny` | `settledMoeny` | `settledMoeny` | 已价格结算金额 |
| `settledQty` | `settledQty` | `settledQty` | 已价格结算数量 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
