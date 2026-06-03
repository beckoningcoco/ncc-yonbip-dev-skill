---
tags: [BIP, 元数据, 数据字典, tlm.financingregister.FinancingRegisterInquiry]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 询价信息 (`tlm.financingregister.FinancingRegisterInquiry`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingregister_inquiry` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`d3b00036-a742-4a8f-a87d-57e9f4e40a7e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价信息 |
| 物理表 | `tlm_financingregister_inquiry` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 40 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `mainid` | `` |
| `quotation_agency` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `quotation_base_rate_type` | `tlm_interestrateRef` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 40 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quotation_rate_type` | `quotation_rate_type` | `quotationRateType` | 利率类型 |
| `quotation_interest_days` | `quotation_interest_days` | `quotationInterestDays` | 计息天数 |
| `quotation_settlement_rule` | `quotation_settlement_rule` | `quotationSettlementRule` | 结息头尾规则 |
| `quotation_interest_type` | `quotation_interest_type` | `quotationInterestType` | 年/月/日利率 |
| `quotation_float_type_in` | `quotation_float_type_in` | `quotationFloatTypeIn` | 浮动方式(换入) |
| `quotation_float_type` | `quotation_float_type` | `quotationFloatType` | 浮动方式 |
| `quotation_settlement_cycle` | `quotation_settlement_cycle` | `quotationSettlementCycle` | 结息周期 |
| `quotation_remark` | `quotation_remark` | `quotationRemark` | 备注 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 融资登记主表id |
| `quotation_agency` | `quotation_agency` | `quotationAgency` | 报价机构ID |
| `quotation_base_rate_type` | `quotation_base_rate_type` | `quotationBaseRateType` | 基准利率类型id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quotation_date` | `quotation_date` | `quotationDate` | 询价日期 |
| `quotation_first_payment_ate` | `quotation_first_payment_ate` | `quotationFirstPaymentDate` | 首次付息日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_final_rival` | `is_final_rival` | `isFinalRival` | 是否最终交易对手 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quotation_init_money` | `quotation_init_money` | `quotationInitMoney` | 期初价格 |
| `quotation_end_money` | `quotation_end_money` | `quotationEndMoney` | 期末价格 |
| `quotation_base_rate` | `quotation_base_rate` | `quotationBaseRate` | 基准利率(%) |
| `quotation_float_value_in` | `quotation_float_value_in` | `quotationFloatValueIn` | 浮动值（换入） |
| `quotation_float_value` | `quotation_float_value` | `quotationFloatValue` | 浮动值 |
| `expect_price_in` | `expect_price_in` | `expectPriceIn` | 预计价格(换入) |
| `quotation_rate` | `quotation_rate` | `quotationRate` | 掉期利率(%) |
| `expect_price_near` | `expect_price_near` | `expectPriceNear` | 预计价格(近端) |
| `expect_price_far` | `expect_price_far` | `expectPriceFar` | 预计价格(远端) |
| `price` | `price` | `price` | 交易价格 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
