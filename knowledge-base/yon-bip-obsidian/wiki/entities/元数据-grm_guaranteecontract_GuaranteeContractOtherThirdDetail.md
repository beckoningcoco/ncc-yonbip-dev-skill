---
tags: [BIP, 元数据, 数据字典, grm.guaranteecontract.GuaranteeContractOtherThirdDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 其他第三方担保明细 (`grm.guaranteecontract.GuaranteeContractOtherThirdDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`grm_contract_other_third_detail` | domain：`yonbip-fi-ctmgrm` | 应用：`GRM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 其他第三方担保明细 |
| 物理表 | `grm_contract_other_third_detail` |
| 数据库 schema | `yonbip-fi-ctmgrm` |
| 所属应用 | `GRM` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `accentity_guarantor` | `` |
| `vendor_guarantor` | `` |
| `ytenant_id` | `` |
| `otherThirdDetailDef` | `` |
| `currency` | `` |
| `customer_guarantor` | `` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guarantee_method` | `guarantee_method` | `guaranteeMethod` | 担保方式 |
| `guarantor` | `guarantor` | `guarantor` | 担保人 |
| `guarantor_type` | `guarantor_type` | `guarantorType` | 担保人类型 |
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_guarantor` | `accentity_guarantor` | `accentityGuarantor` | 资金业务对象担保人 |
| `currency` | `currency` | `currency` | 币种 |
| `customer_guarantor` | `customer_guarantor` | `customerGuarantor` | 客户担保人 |
| `mainid` | `mainid` | `mainid` | 担保合同id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vendor_guarantor` | `vendor_guarantor` | `vendorGuarantor` | 供应商担保人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `equity_funds` | `equity_funds` | `equityFunds` | 少数股东含有员工持股计划或股权基金 |
| `is_in_the_market` | `is_in_the_market` | `isInTheMarket` | 是否上市 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `equity_relationship` | `equity_relationship` | `equityRelationship` | 股权关系 |
| `ispower` | `ispower` | `ispower` | 是否有担保效力 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount` | `amount` | `amount` | 金额 |
| `execute_balance` | `execute_balance` | `executeBalance` | 执行余额 |
| `finance_execute_balance` | `finance_execute_balance` | `financeExecuteBalance` | 融资执行余额 |
| `last_execute_amount` | `last_execute_amount` | `lastExecuteAmount` | 上次执行金额 |
| `shareholding_ratio` | `shareholding_ratio` | `shareholdingRatio` | 持股比例(%) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `otherThirdDetailDef` | `otherThirdDetailDef` | `otherThirdDetailDef` | 其他第三方担保明细自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
