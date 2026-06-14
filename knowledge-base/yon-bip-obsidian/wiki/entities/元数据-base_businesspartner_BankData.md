---
tags: [BIP, 元数据, 数据字典, base.businesspartner.BankData]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 银行信息(废弃) (`base.businesspartner.BankData`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`base_bankdata` | domain：`productcenter` | 应用：`DPMBP` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 银行信息(废弃) |
| 物理表 | `base_bankdata` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMBP` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `bank` | `ucfbasedoc.bd_bankcard` |
| `province` | `productcenter.pc_addressarchivesref` |
| `openBank` | `ucfbasedoc.bd_bankdotref` |
| `ytenant_id` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `partnerId` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `bankAccount` | `bankAccount` | `bankAccount` | 银行账号 |
| `bankAccountName` | `bankAccountName` | `bankAccountName` | 账户名称 |
| `jointLineNo` | `jointLineNo` | `jointLineNo` | 联行号 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `partnerId` | `partnerId` | `partnerId` | 业务伙伴 |
| `country` | `country` | `country` | 国家/地区 |
| `province` | `province` | `province` | 省份 |
| `currency` | `currency` | `currency` | 币种 |
| `bank` | `bank` | `bank` | 银行类别 |
| `openBank` | `openBank` | `openBank` | 银行网点 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDefault` | `isDefault` | `isDefault` | 默认银行 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accountType` | `accountType` | `accountType` | 账户类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除状态 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `comment` | `comment` | `comment` | 备注 |
