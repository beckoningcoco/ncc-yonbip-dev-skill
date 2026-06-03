---
tags: [BIP, 元数据, 数据字典, drft.drftnoteinformation.DrftNoteInformationAgreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信信息 (`drft.drftnoteinformation.DrftNoteInformationAgreement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_noteinformation_agreement` | domain：`drft` | 应用：`DRFT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信信息 |
| 物理表 | `drft_noteinformation_agreement` |
| 数据库 schema | `drft` |
| 所属应用 | `DRFT` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ratetype` | `` |
| `ytenant_id` | `` |
| `agreementid` | `bd_currencytenantreflist` |
| `mainid` | `` |
| `businessCurrency` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoiceplatformassociatedinfo` | `invoiceplatformassociatedinfo` | `invoiceplatformassociatedinfo` | 供票平台关联信息 |
| `occupycreditid` | `occupycreditid` | `occupyCreditId` | 占授信id |
| `releasecreditid` | `releasecreditid` | `releaseCreditId` | 释放授信id |
| `sourceorganizationcreditcode` | `sourceorganizationcreditcode` | `sourceorganizationcreditcode` | 来源单位统一社会信用代码 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 卡片主表关联标识 |
| `agreementid` | `agreementid` | `agreementId` | 授信id |
| `businessCurrency` | `businessCurrency` | `businessCurrency` | 业务币种 |
| `ratetype` | `ratetype` | `ratetype` | 汇率类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `controlMode` | `controlMode` | `controlMode` | 控制方式 |
| `rate_ops` | `rate_ops` | `rateOps` | 汇率折算方式 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 授信子表id |
| `agreementmainid` | `agreementmainid` | `agreementMainId` | 授信主表id |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount` | `amount` | `amount` | 授信占用额度 |
| `olcamount` | `olcamount` | `olcamount` | 组织本币授信占用额度 |
| `agreementAmount` | `agreementAmount` | `agreementAmount` | 授信占用额度(授信币种) |
| `rate` | `rate` | `rate` | 汇率 |
| `reduceamount` | `reduceamount` | `reduceAmount` | 剩余占用授信额度 |
| `reduceolcamount` | `reduceolcamount` | `reduceOlcamount` | 剩余组织本币授信占用额度 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
