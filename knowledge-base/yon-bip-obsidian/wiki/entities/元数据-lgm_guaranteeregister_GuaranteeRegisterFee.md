---
tags: [BIP, 元数据, 数据字典, lgm.guaranteeregister.GuaranteeRegisterFee]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 开函登记费用明细 (`lgm.guaranteeregister.GuaranteeRegisterFee`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`lgm_guaranteeregister_fee` | domain：`yonbip-fi-ctmlgm` | 应用：`LGM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开函登记费用明细 |
| 物理表 | `lgm_guaranteeregister_fee` |
| domain/服务域 | `yonbip-fi-ctmlgm` |
| schema | `yonbip_fi_ctmlc` |
| 所属应用 | `LGM` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `oppositeType` | `` |
| `feeAccount` | `` |
| `ytenant_id` | `` |
| `fee` | `` |
| `feeCurrency` | `` |
| `oppositeUnit` | `` |
| `accentity` | `` |
| `` | `` |
| `oppositeBankAccount` | `` |
| `mainid` | `` |
| `settleMethod` | `` |
| `feeItem` | `` |
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

> 共 27 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `oppositeBankAccountName` | `oppositeBankAccountName` | `oppositeBankAccountName` | 对方账户名称 |
| `oppositeBankAccountBankType` | `oppositeBankAccountBankType` | `oppositeBankAccountBankType` | 对方账户银行类别 |
| `oppositeBankAccountOpenBank` | `oppositeBankAccountOpenBank` | `oppositeBankAccountOpenBank` | 对方账户开户行 |
| `oppositeBankAccountUnionNumber` | `oppositeBankAccountUnionNumber` | `oppositeBankAccountUnionNumber` | 对方账户联行号 |
| `` | `auditor` | `auditor` | 审批人名称 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 开函登记id |
| `fee` | `fee` | `fee` | 保函费用id |
| `accentity` | `accentity` | `accentity` | 费用主体 |
| `feeItem` | `feeItem` | `feeItem` | 费用项目 |
| `feeCurrency` | `feeCurrency` | `feeCurrency` | 费用币种 |
| `feeAccount` | `feeAccount` | `feeAccount` | 付费账号 |
| `oppositeUnit` | `oppositeUnit` | `oppositeUnit` | 对方单位 |
| `oppositeType` | `oppositeType` | `oppositeType` | 对方类型 |
| `oppositeBankAccount` | `oppositeBankAccount` | `oppositeBankAccount` | 对方银行账号 |
| `settleMethod` | `settleMethod` | `settleMethod` | 结算方式 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `feeDate` | `feeDate` | `feeDate` | 费用日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fundPayMode` | `fundPayMode` | `fundPayMode` | 费用支付模式 |
| `settleStatus` | `settleStatus` | `settleStatus` | 结算状态 |
| `feeParam` | `feeParam` | `feeParam` | 费用参数 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `feeAmt` | `feeAmt` | `feeAmt` | 费用金额(费用币种) |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
