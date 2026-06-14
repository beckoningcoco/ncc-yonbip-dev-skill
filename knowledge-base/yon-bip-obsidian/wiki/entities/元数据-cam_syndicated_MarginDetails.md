---
tags: [BIP, 元数据, 数据字典, cam.syndicated.MarginDetails]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 保证金明细 (`cam.syndicated.MarginDetails`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_syndicated_margin_details` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 保证金明细 |
| 物理表 | `cam_syndicated_margin_details` |
| domain/服务域 | `yonbip-fi-ctmcam` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `CAM` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `marginAccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `nat_currency` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `nat_exchange_rate_type` | `` |
| `currentAccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `cam_define_character_def` | `` |
| `mainid` | `` |
| `settleMethod` | `aa_settlemethodref` |
| `marginCurrency` | `bd_currencytenantreflist` |
| `tenant_id` | `` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditSubagreement` | `creditSubagreement` | `creditSubagreement` | 授信子协议号 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `backItem1` | `backItem1` | `backItem1` | 备用字段1 |
| `backItem2` | `backItem2` | `backItem2` | 备用字段2 |
| `backItem3` | `backItem3` | `backItem3` | 备用字段3 |
| `backItem4` | `backItem4` | `backItem4` | 备用字段4 |
| `backItem5` | `backItem5` | `backItem5` | 备用字段5 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 授信信息主表id |
| `currentAccount` | `currentAccount` | `currentAccount` | 活期账号id |
| `marginCurrency` | `marginCurrency` | `marginCurrency` | 保证金币种id |
| `marginAccount` | `marginAccount` | `marginAccount` | 保证金账号id |
| `settleMethod` | `settleMethod` | `settleMethod` | 结算方式id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `nat_currency` | `nat_currency` | `natCurrency` | 本币币种 |
| `nat_exchange_rate_type` | `nat_exchange_rate_type` | `natExchangeRateType` | 本币币种汇率类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isSettle` | `isSettle` | `isSettle` | 是否结算 |
| `nat_exchange_rate_ops` | `nat_exchange_rate_ops` | `natExchangeRateOps` | 保证金本币汇率折算方式 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `marginRatio` | `marginRatio` | `marginRatio` | 保证金比例（%） |
| `marginAmount` | `marginAmount` | `marginAmount` | 保证金金额（保证金币种） |
| `nat_exchange_rate` | `nat_exchange_rate` | `natExchangeRate` | 本币币种汇率 |
| `nat_margin_amount` | `nat_margin_amount` | `natMarginAmount` | 本币保证金金额 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cam_define_character_def` | `cam_define_character_def` | `camDefineCharacterDef` | 银团授信保证金特征 |
