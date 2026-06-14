---
tags: [BIP, 元数据, 数据字典, cam.agreement.AgreementQuotaDistribution]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信机构额度分配 (`cam.agreement.AgreementQuotaDistribution`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_agreement_quota_distribution` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信机构额度分配 |
| 物理表 | `cam_agreement_quota_distribution` |
| domain/服务域 | `yonbip-fi-ctmcam` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `CAM` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creditOrganAcc` | `` |
| `agreement` | `cam_agreementref` |
| `agreementfee_quota_character_def` | `` |
| `ytenant_id` | `` |
| `conversionExchangeRateType` | `` |
| `currency` | `bd_currencytenantreflist` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreementCode` | `agreementCode` | `agreementCode` | 单据编号 |
| `agreementNo` | `agreementNo` | `agreementNo` | 授信协议号 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 合同id |
| `agreement` | `agreement` | `agreement` | 子授信id |
| `currency` | `currency` | `currency` | 币种id |
| `conversionExchangeRateType` | `conversionExchangeRateType` | `conversionExchangeRateType` | 折算汇率类型 |
| `creditOrganAcc` | `creditOrganAcc` | `creditOrganAcc` | 授信机构 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `carry` | `carry` | `carry` | 是否结转 |
| `conversionexchangerate_ops` | `conversionexchangerate_ops` | `conversionExchangeRateOps` | 汇率折算方式 |
| `creditBillStatus` | `creditBillStatus` | `creditBillStatus` | 协议状态 |
| `creditType` | `creditType` | `creditType` | 授信类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 子表id |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actualUsedLimit` | `actualUsedLimit` | `actualUsedLimit` | 实际已用额度 |
| `baseRate` | `baseRate` | `baseRate` | 汇率 |
| `conversionExchangeRate` | `conversionExchangeRate` | `conversionExchangeRate` | 折算汇率 |
| `creditAmount` | `creditAmount` | `creditAmount` | 授信额度 |
| `creditAmountTotalCredit` | `creditAmountTotalCredit` | `creditAmountTotalCredit` | 授信额度(总授信币种) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreementfee_quota_character_def` | `agreementfee_quota_character_def` | `agreementQuotaCharacterDef` | 授信合同机构额度特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
