---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.AgentFinancial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申请单银行信息 (`cust.customeraddapply.AgentFinancial`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_agent_financial` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申请单银行信息 |
| 物理表 | `cust_customeraddapply_agent_financial` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `iCountryId` | `ucfbasedoc.bd_countryref` |
| `agent_financial_character` | `` |
| `iBankId` | `ucfbasedoc.bd_bankcard` |
| `iProvinceId` | `productcenter.pc_addressarchivesref` |
| `imerchantId` | `` |
| `iOpenBankId` | `ucfbasedoc.bd_bankdotref` |
| `ytenant_id` | `` |
| `org_fin_ban_acct` | `` |
| `iCurrencyId` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (3个, 4字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表ID |
| `dataStatus` | `dataStatus` | `dataStatus` | 数据状态 |
| `cBankAccount` | `cBankAccount` | `bankAccount` | 银行账号 |
| `cJointLineNo` | `cJointLineNo` | `jointLineNo` | 联行号 |
| `cRemarks` | `cRemarks` | `remarks` | 备注 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `swiftCode` | `swiftCode` | `swiftCode` | swift码 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 手工码 |
| `iCountryId` | `iCountryId` | `country` | 国家id |
| `iProvinceId` | `iProvinceId` | `province` | 省份id |
| `iCurrencyId` | `iCurrencyId` | `currency` | 币种id |
| `iBankId` | `iBankId` | `bank` | 银行类别id |
| `iOpenBankId` | `iOpenBankId` | `openBank` | 银行网点id |
| `org_fin_ban_acct` | `org_fin_ban_acct` | `orgFinBankAcct` | 企业银行账户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_open_date` | `account_open_date` | `accountOpeningDate` | 开户日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `defaultBank` | `defaultBank` | `isDefault` | 默认银行 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iAccountType` | `iAccountType` | `accountType` | 账户类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_opening_address` | `account_opening_address` | `accountOpeningAddress` | 开户地址 |
| `cBankAccountName` | `cBankAccountName` | `bankAccountName` | 账户名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agent_financial_character` | `agent_financial_character` | `agentFinancialCharacter` | 自定义项特征组 |
