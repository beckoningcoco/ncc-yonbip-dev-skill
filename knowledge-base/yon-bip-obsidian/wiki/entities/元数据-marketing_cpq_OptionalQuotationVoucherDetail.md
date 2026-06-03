---
tags: [BIP, 元数据, 数据字典, marketing.cpq.OptionalQuotationVoucherDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置报价清单关联单据报价详情 (`marketing.cpq.OptionalQuotationVoucherDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`optionalquotationvoucherdetail` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置报价清单关联单据报价详情 |
| 物理表 | `optionalquotationvoucherdetail` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 26 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `voucher_group_id` | `` |
| `voucher_character` | `` |
| `optional_quotation_id` | `` |
| `ytenant_id` | `` |
| `voucher_id` | `` |
| `detail_group_id` | `` |
| `detail_id` | `` |
| `costCurrency` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `optional_quotation_id` | `optional_quotation_id` | `optionalQuotationId` | 配置报价清单 |
| `voucher_id` | `voucher_id` | `voucherId` | 配置报价清单关联单据 |
| `detail_group_id` | `detail_group_id` | `detailGroupId` | 配置报价清单详情分组 |
| `detail_id` | `detail_id` | `detailId` | 配置报价清单详情 |
| `voucher_group_id` | `voucher_group_id` | `voucherGroupId` | 配置报价清单关联单据分组信息 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `costCurrency` | `costCurrency` | `costCurrency` | 成本本币 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### 数值字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_sum` | `ori_sum` | `oriSum` | 含税成交金额 |
| `ori_money` | `ori_money` | `oriMoney` | 未税成交金额 |
| `nat_sum` | `nat_sum` | `natSum` | 本币含税成交金额 |
| `nat_money` | `nat_money` | `natMoney` | 本币未税成交金额 |
| `taxAmount` | `taxAmount` | `taxAmount` | 税额 |
| `materialUnitCost` | `materialUnitCost` | `materialUnitCost` | 材料成本单价 |
| `materialCost` | `materialCost` | `materialCost` | 材料成本 |
| `outsourcingProcessingFee` | `outsourcingProcessingFee` | `outsourcingProcessingFee` | 委外加工费 |
| `laborHour` | `laborHour` | `laborHour` | 人工工时 |
| `laborUnitPrice` | `laborUnitPrice` | `laborUnitPrice` | 人工单价 |
| `laborCost` | `laborCost` | `laborCost` | 人工费 |
| `manufacturingCost` | `manufacturingCost` | `manufacturingCost` | 制造费 |
| `totalCost` | `totalCost` | `totalCost` | 总成本 |
| `prepaidExpenses` | `prepaidExpenses` | `prepaidExpenses` | 待摊费用 |
| `costExchRate` | `costExchRate` | `costExchRate` | 币种-成本币种汇率 |
| `priceQty` | `priceQty` | `priceQty` | 计价数量 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `voucher_character` | `voucher_character` | `voucherCharacter` | 配置报价清单关联单据报价详情特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
