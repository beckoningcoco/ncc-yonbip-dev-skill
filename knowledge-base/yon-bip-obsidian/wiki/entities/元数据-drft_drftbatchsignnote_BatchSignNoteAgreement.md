---
tags: [BIP, 元数据, 数据字典, drft.drftbatchsignnote.BatchSignNoteAgreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信信息 (`drft.drftbatchsignnote.BatchSignNoteAgreement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_batchsignnote_agreement` | domain：`drft` | 应用：`DRFT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信信息 |
| 物理表 | `drft_batchsignnote_agreement` |
| 数据库 schema | `drft` |
| 所属应用 | `DRFT` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ratetype` | `` |
| `ytenant_id` | `` |
| `agreementid` | `` |
| `currency` | `` |
| `mainid` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `occupycreditid` | `occupycreditid` | `occupyCreditId` | 占授信id |
| `releasecreditid` | `releasecreditid` | `releaseCreditId` | 释放授信id |
| `supply_bill_info` | `supply_bill_info` | `supplyBillInfo` | 供票平台关联信息 |
| `unit_credit_code` | `unit_credit_code` | `unitCreditCode` | 来源单位统一社会信用代码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreementid` | `agreementid` | `agreementId` | 授信协议id |
| `currency` | `currency` | `currency` | 业务币种 |
| `mainid` | `mainid` | `mainid` | 票据签发id |
| `ratetype` | `ratetype` | `ratetype` | 汇率类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rate_ops` | `rate_ops` | `rateOps` | 汇率折算方式 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreementmainid` | `agreementmainid` | `agreementMainId` | 授信主表id |
| `id` | `id` | `id` | ID |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreeamount` | `agreeamount` | `agreeamount` | 授信占用额度(授信币种) |
| `busiamount` | `busiamount` | `busiamount` | 授信占用额度(业务币种) |
| `rate` | `rate` | `rate` | 汇率 |
| `reduceamount` | `reduceamount` | `reduceAmount` | 授信剩余可释放额度 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
