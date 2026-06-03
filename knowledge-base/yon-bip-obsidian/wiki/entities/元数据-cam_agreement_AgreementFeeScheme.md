---
tags: [BIP, 元数据, 数据字典, cam.agreement.AgreementFeeScheme]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信费用方案 (`cam.agreement.AgreementFeeScheme`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_agreementfee_scheme` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信费用方案 |
| 物理表 | `cam_agreementfee_scheme` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `fee_currency` | `bd_currencytenantreflist` |
| `mainid` | `` |
| `fee_item` | `finbd.bd_expenseitemref` |
| `tenant_id` | `` |
| `agreementfee_scheme_character_def` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fee_scheme` | `fee_scheme` | `feeScheme` | 费用方案编号 |
| `backItem1` | `backItem1` | `backItem1` | backItem1 |
| `backItem2` | `backItem2` | `backItem2` | backItem2 |
| `backItem3` | `backItem3` | `backItem3` | backItem3 |
| `backItem4` | `backItem4` | `backItem4` | backItem4 |
| `backItem5` | `backItem5` | `backItem5` | backItem5 |
| `backItem6` | `backItem6` | `backItem6` | backItem6 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 授信合同主表id |
| `fee_item` | `fee_item` | `feeItem` | 费用项目Id |
| `fee_currency` | `fee_currency` | `feeCurrency` | 费用币种id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `first_billing_date` | `first_billing_date` | `firstBillingDate` | 首次计费日 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fee_charge_method` | `fee_charge_method` | `feeChargeMethod` | 费用收取方式 |
| `fee_base` | `fee_base` | `feeBase` | 费用基数 |
| `fee_frequency` | `fee_frequency` | `feeFrequency` | 费用频率 |
| `billing_days` | `billing_days` | `billingDays` | 计费天数 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `backItem10` | `backItem10` | `backItem10` | 备用字段10 |
| `backItem9` | `backItem9` | `backItem9` | 备用字段9 |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fee_amt` | `fee_amt` | `feeAmt` | 费用金额（费用币种） |
| `annual_rate` | `annual_rate` | `annualRate` | 年费率（%） |
| `backItem7` | `backItem7` | `backItem7` | backItem7 |
| `backItem8` | `backItem8` | `backItem8` | backItem8 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreementfee_scheme_character_def` | `agreementfee_scheme_character_def` | `agreementFeeSchemeCharacterDef` | 授信合同费用方案特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
