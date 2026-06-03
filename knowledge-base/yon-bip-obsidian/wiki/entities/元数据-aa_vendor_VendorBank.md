---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorBank]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商银行 (`aa.vendor.VendorBank`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_vendorbank` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商银行 |
| 物理表 | `aa_vendorbank` |
| 数据库 schema | `yssupplier` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 29 个 |
| 子表 | 1 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `aa.vendor.VendorBankDefine` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `iCountryId` | `ucfbasedoc.bd_countryref` |
| `iBankId` | `ucfbasedoc.bd_bankcard` |
| `ytenant_id` | `` |
| `iVendorId` | `` |
| `iOpenAccountBankId` | `ucfbasedoc.bd_bankdotref` |
| `vendorBankCharacterDefine` | `` |
| `iCurrencyId` | `ucfbasedoc.bd_currencytenantref` |
| `entBank` | `ucfbasedoc.bd_enterprisebankacct` |
| `tenant_id` | `` |
| `elecBillBankNode` | `` |
| `` | `` |

## 继承接口 (4个, 5字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enter_mode` | `enter_mode` | `enterMode` | 数据录入方式 |
| `bank_account_file` | `bank_account_file` | `bankAccountFile` | 银行账号附件 |
| `cProvince` | `cProvince` | `province` | 省份 |
| `cAccount` | `cAccount` | `account` | 银行账号 |
| `cCorrespondentCode` | `cCorrespondentCode` | `correspondentcode` | 联行号 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `cRegion` | `cRegion` | `region` | 开户地区 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 开户地区编码 |
| `bank_file_path` | `bank_file_path` | `bankFilePath` | 附件 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iVendorId` | `iVendorId` | `vendor` | 供应商档案主键 |
| `elecBillBankNode` | `elecBillBankNode` | `elecBillBankNode` | 代理电票银行网点 |
| `entBank` | `entBank` | `entBank` | 企业银行账户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `iCountryId` | `iCountryId` | `country` | 国家地区主键 |
| `iCurrencyId` | `iCurrencyId` | `currency` | 币种主键 |
| `iBankId` | `iBankId` | `bank` | 银行类别主键 |
| `iOpenAccountBankId` | `iOpenAccountBankId` | `openaccountbank` | 银行网点主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bDefaultBank` | `bDefaultBank` | `defaultbank` | 默认银行 |
| `stopstatus` | `stopstatus` | `stopstatus` | 状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iAccountType` | `iAccountType` | `accountType` | 账号类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 供应商银行主键 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `receiveAddress` | `receiveAddress` | `receiveAddress` | 收款地址 |
| `cAccountName` | `cAccountName` | `accountname` | 账号名称 |
| `cmemo` | `cmemo` | `memo` | 备注 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vendorBankCharacterDefine` | `vendorBankCharacterDefine` | `vendorBankCharacterDefine` | 供应商银行自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 供应商银行自定义项 |
