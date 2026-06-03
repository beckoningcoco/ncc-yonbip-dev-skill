---
tags: [BIP, 元数据, 数据字典, marketing.cpq.OptionalQuotationDetailGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置报价清单详情分组 (`marketing.cpq.OptionalQuotationDetailGroup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`optionalquotationdetailgroup` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置报价清单详情分组 |
| 物理表 | `optionalquotationdetailgroup` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 16 个 |
| 子表 | 1 个 |
| 关联引用 | 3 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `voucherDetailGroups` | `marketing.cpq.OptionalQuotationVoucherGroup` | composition |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `optionalQuotationId` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | code |
| `name` | `name` | `name` | name |
| `parentId` | `parentId` | `parent` | 父节点 |
| `voucher_detail_num` | `voucher_detail_num` | `voucherDetailNum` | 来源单据行号 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `optionalQuotationId` | `optionalQuotationId` | `optionalQuotationId` | 配置报价清单 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `configGroup` | `configGroup` | `configGroup` | 选配参数文件分组 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `voucher_detail_id` | `voucher_detail_id` | `voucherDetailId` | 来源单据行ID |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deductionMoney` | `deductionMoney` | `deductionMoney` | 扣额(报价金额-金额) |
| `deductionRate` | `deductionRate` | `deductionRate` | 扣率(折后金额/报价金额) |
| `discountedMoney` | `discountedMoney` | `discountedMoney` | 折后金额(子件汇总) |
| `quoteMoney` | `quoteMoney` | `quoteMoney` | 报价金额(子件汇总) |
| `reverseDeductionRate` | `reverseDeductionRate` | `reverseDeductionRate` | 倒扣率(1-扣率) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `voucherDetailGroups` | 配置报价清单关联单据本币分组报价信息 |
