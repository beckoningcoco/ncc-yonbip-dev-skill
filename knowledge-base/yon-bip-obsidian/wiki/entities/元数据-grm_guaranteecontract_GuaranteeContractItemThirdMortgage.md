---
tags: [BIP, 元数据, 数据字典, grm.guaranteecontract.GuaranteeContractItemThirdMortgage]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 第三方抵押担保 (`grm.guaranteecontract.GuaranteeContractItemThirdMortgage`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`grm_guarantee_contract_item_third_mortgage` | domain：`yonbip-fi-ctmgrm` | 应用：`GRM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 第三方抵押担保 |
| 物理表 | `grm_guarantee_contract_item_third_mortgage` |
| domain/服务域 | `yonbip-fi-ctmgrm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `GRM` |
| 直连字段 | 32 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `accentity_guarantor` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `thirdMortgageCharacterDef` | `` |
| `vendor_guarantor` | `yssupplier.aa_vendor` |
| `ytenant_id` | `` |
| `evaluation_agency` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `currency` | `bd_currencytenantreflist` |
| `customer_guarantor` | `productcenter.aa_merchantref` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guarantor_type` | `guarantor_type` | `guarantorType` | 担保人类型 |
| `property_right_type_name` | `property_right_type_name` | `propertyRightTypeName` | 物权类别 |
| `property_right_code` | `property_right_code` | `propertyRightCode` | 物权编号 |
| `property_right_name` | `property_right_name` | `propertyRightName` | 物权名称 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 卡片主表关联标识 |
| `customer_guarantor` | `customer_guarantor` | `customerGuarantor` | 担保人客户id |
| `vendor_guarantor` | `vendor_guarantor` | `vendorGuarantor` | 担保人供应商id |
| `accentity_guarantor` | `accentity_guarantor` | `accentityGuarantor` | 担保人会计主体id |
| `currency` | `currency` | `currency` | 币种id |
| `evaluation_agency` | `evaluation_agency` | `evaluationAgency` | 评估机构 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 到期日期 |
| `evaluation_date` | `evaluation_date` | `evaluationDate` | 评估日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_in_the_market` | `is_in_the_market` | `isInTheMarket` | 是否上市 |
| `equity_funds` | `equity_funds` | `equityFunds` | 少数股东含有员工持股计划或股权基金 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `equity_relationship` | `equity_relationship` | `equityRelationship` | 股权关系 |
| `purpose_type` | `purpose_type` | `purposeType` | 用途分类 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 子表id |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `shareholding_ratio` | `shareholding_ratio` | `shareholdingRatio` | 持股比例(%) |
| `property_right_value` | `property_right_value` | `propertyRightValue` | 物权价值 |
| `finance_execute_balance` | `finance_execute_balance` | `financeExecuteBalance` | 融资执行余额 |
| `execute_balance` | `execute_balance` | `executeBalance` | 执行余额 |
| `evaluation_value` | `evaluation_value` | `evaluationValue` | 评估价值 |
| `mortgage_rate` | `mortgage_rate` | `mortgageRate` | 抵押率（%） |
| `mortgageable_value` | `mortgageable_value` | `mortgageableValue` | 可抵押价值 |
| `mortgage_value` | `mortgage_value` | `mortgageValue` | 本次抵押价值 |
| `last_execute_amount` | `last_execute_amount` | `lastExecuteAmount` | 上次执行金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `thirdMortgageCharacterDef` | `thirdMortgageCharacterDef` | `thirdMortgageCharacterDef` | 第三方抵押担保自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
