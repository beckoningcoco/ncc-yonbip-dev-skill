---
tags: [BIP, 元数据, 数据字典, tlm.purchaseregister.PurchaseRegisterFuLiZhuanCunRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申购登记复利转存记录 (`tlm.purchaseregister.PurchaseRegisterFuLiZhuanCunRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_purchasregister_fuli_zhuancun_record` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申购登记复利转存记录 |
| 物理表 | `tlm_purchasregister_fuli_zhuancun_record` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `interest_currency` | `` |
| `capital_currency` | `` |
| `ytenant_id` | `` |
| `mainid` | `` |
| `purchasregister_fuli_zhuancun_record_character_def` | `` |
| `protocol_currency` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `extra1` | `extra1` | `extra1` | 扩展字段1 |
| `extra2` | `extra2` | `extra2` | 扩展字段2 |
| `extra3` | `extra3` | `extra3` | 扩展字段3 |
| `id` | `id` | `id` | ID |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种 |
| `interest_currency` | `interest_currency` | `interestCurrency` | 计息币种 |
| `mainid` | `mainid` | `mainid` | 申购登记id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_begin_date` | `interest_begin_date` | `interestBeginDate` | 起息日 |
| `interest_end_date` | `interest_end_date` | `interestEndDate` | 止息日 |
| `next_transfer_date` | `next_transfer_date` | `nextTransferDate` | 下次转存日期 |
| `transfer_date` | `transfer_date` | `transferDate` | 转存日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accumulated_principal_amt` | `accumulated_principal_amt` | `accumulatedPrincipalAmt` | 累计本金（协议币种） |
| `accumulated_principal_capital_amt` | `accumulated_principal_capital_amt` | `accumulatedPrincipalCapitalAmt` | 累计本金（本金币种） |
| `extra1Amt` | `extra1Amt` | `extra1Amt` | 金额扩展字段1 |
| `extra2Amt` | `extra2Amt` | `extra2Amt` | 金额扩展字段2 |
| `interest_amount` | `interest_amount` | `interestAmount` | 利息（协议币种） |
| `interest_calc_amount` | `interest_calc_amount` | `interestCalcAmount` | 利息（计息币种） |
| `purchase_amount` | `purchase_amount` | `purchaseAmount` | 申购金额（协议币种） |
| `purchase_priamount` | `purchase_priamount` | `purchasePriamount` | 申购金额（本金币种） |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `purchasregister_fuli_zhuancun_record_character_def` | `purchasregister_fuli_zhuancun_record_character_def` | `purchaseRegisterFuliZhuanCunRecordCharacterDef` | 申购登记复利转存记录子表自定义项 |
