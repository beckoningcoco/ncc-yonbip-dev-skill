---
tags: [BIP, 元数据, 数据字典, aa.merchant.AgentFinancial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 银行信息 (`aa.merchant.AgentFinancial`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`agentfinancialnew` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 银行信息 |
| 物理表 | `agentfinancialnew` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 26 个 |
| 子表 | 1 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `agentFinancialDefine` | `aa.merchant.AgentFinancialDefine` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `agentBankForElectronic` | `` |
| `` | `` |
| `iCountryId` | `ucfbasedoc.bd_countryref` |
| `agent_financial_character` | `` |
| `iBankId` | `ucfbasedoc.bd_bankcard` |
| `iProvinceId` | `productcenter.pc_addressarchivesref` |
| `imerchantId` | `productcenter.aa_merchantref` |
| `iOpenBankId` | `ucfbasedoc.bd_bankdotref` |
| `ytenant_id` | `` |
| `org_fin_ban_acct` | `ucfbasedoc.bd_enterprisebankacct` |
| `iCurrencyId` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |

## 继承接口 (4个, 5字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `erpCode` | `erpCode` | `erpCode` | ERP编码 |
| `cBankAccount` | `cBankAccount` | `bankAccount` | 银行账号 |
| `cJointLineNo` | `cJointLineNo` | `jointLineNo` | 联行号 |
| `cRemarks` | `cRemarks` | `remarks` | 备注 |
| `swiftCode` | `swiftCode` | `swiftCode` | swift码 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 客户 |
| `iCountryId` | `iCountryId` | `country` | 国家/地区 |
| `iProvinceId` | `iProvinceId` | `province` | 省份 |
| `org_fin_ban_acct` | `org_fin_ban_acct` | `orgFinBankAcct` | 企业银行账户 |
| `iCurrencyId` | `iCurrencyId` | `currency` | 币种 |
| `iBankId` | `iBankId` | `bank` | 银行类别 |
| `iOpenBankId` | `iOpenBankId` | `openBank` | 银行网点 |
| `agentBankForElectronic` | `agentBankForElectronic` | `agentBankForElectronic` | 电票银行网点 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_open_date` | `account_open_date` | `accountOpeningDate` | 开户日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `defaultBank` | `defaultBank` | `isDefault` | 默认银行账号 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iAccountType` | `iAccountType` | `accountType` | 账户类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `agentFinancialDefine` | 客户档案银行信息自定义项（废弃） |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cBankAccountName` | `cBankAccountName` | `bankAccountName` | 账户名称 |
| `account_opening_address` | `account_opening_address` | `accountOpeningAddress` | 开户地址 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agent_financial_character` | `agent_financial_character` | `agentFinancialCharacter` | 银行信息自定义项 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
