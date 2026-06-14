---
tags: [BIP, 元数据, 数据字典, marketing.cpq.OptionalQuotationDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置报价清单详情 (`marketing.cpq.OptionalQuotationDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`optionalquotationdetail` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置报价清单详情 |
| 物理表 | `optionalquotationdetail` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 42 个 |
| 子表 | 1 个 |
| 关联引用 | 14 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `voucherDetails` | `marketing.cpq.OptionalQuotationVoucherDetail` | composition |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `optionalQuotationRuleId` | `` |
| `detailCharacter` | `` |
| `parentProductId` | `productcenter.productref` |
| `productId` | `productcenter.productref` |
| `ytenant_id` | `` |
| `optionalQuotationRuleDetailId` | `` |
| `pricingUnitId` | `productcenter.pc_productassitunitsref` |
| `detailGroupId` | `` |
| `productDefineCharacter` | `` |
| `` | `` |
| `optionalQuotationId` | `` |
| `vcConfigDetailId` | `` |
| `vcCtsDetailId` | `` |
| `bomUnitId` | `productcenter.pc_productassitunitsref` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 42 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bomLevel` | `bomLevel` | `bomLevel` | bom层级 |
| `create_type` | `create_type` | `createType` | 创建类型 |
| `dosageType` | `dosageType` | `dosageType` | 用量类型(枚举:变动/固定) |
| `lineType` | `lineType` | `lineType` | 行类型 |
| `parentDetailGroupId` | `parentDetailGroupId` | `parentDetailGroupId` | 父类分组编码 |
| `voucher_detail_num` | `voucher_detail_num` | `voucherDetailNum` | 来源单据行号 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bomUnitId` | `bomUnitId` | `bomUnitId` | BOM单位 |
| `detailGroupId` | `detailGroupId` | `detailGroupId` | 分组id |
| `optionalQuotationId` | `optionalQuotationId` | `optionalQuotationId` | 配置报价清单ID |
| `optionalQuotationRuleDetailId` | `optionalQuotationRuleDetailId` | `optionalQuotationRuleDetailId` | 配置报价清单规则ID |
| `optionalQuotationRuleId` | `optionalQuotationRuleId` | `optionalQuotationRuleId` | 配置报价清单规则ID |
| `parentProductId` | `parentProductId` | `parentProductId` | 母件物料 |
| `pricingUnitId` | `pricingUnitId` | `pricingUnitId` | 取价单位 |
| `productId` | `productId` | `productId` | 物料 |
| `vcConfigDetailId` | `vcConfigDetailId` | `vcConfigDetailId` | 选配单表体ID |
| `vcCtsDetailId` | `vcCtsDetailId` | `vcCtsDetailId` | 选配单表体ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `numCanChange` | `numCanChange` | `numCanChange` | 数量可改 |
| `bSelect` | `bSelect` | `select` | 是否选中 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `must_select` | `must_select` | `groupEx` | 组内互斥 |
| `group_first` | `group_first` | `groupFirst` | 组内首选 |
| `mustSelect` | `mustSelect` | `mustSelect` | 必选 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bomComponentId` | `bomComponentId` | `bomComponentId` | 子件ID |
| `bomId` | `bomId` | `bomId` | bomId |
| `id` | `id` | `id` | id |
| `pBomId` | `pBomId` | `pBomId` | pBomId |
| `sourceChangeId` | `sourceChangeId` | `sourceChangeId` | 变更历史 |
| `voucher_detail_id` | `voucher_detail_id` | `voucherDetailId` | 来源单据行ID |

### 数值字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `childQty` | `childQty` | `childQty` | 子件用量 |
| `componentUseNum` | `componentUseNum` | `componentUseNum` | 子件使用数量 |
| `deductionMoney` | `deductionMoney` | `deductionMoney` | 扣额(报价金额-金额) |
| `deductionRate` | `deductionRate` | `deductionRate` | 扣率(折后金额/报价金额) |
| `discountedMoney` | `discountedMoney` | `discountedMoney` | 折后金额(子件汇总) |
| `discountedPrice` | `discountedPrice` | `discountedPrice` | 折后单价(折后金额/计价单位数量) |
| `pricingQty` | `pricingQty` | `pricingQty` | 取价数量 |
| `quoteMoney` | `quoteMoney` | `quoteMoney` | 报价金额(报价*取价数量) |
| `quotePrice` | `quotePrice` | `quotePrice` | 报价单价(取价) |
| `reverseDeductionRate` | `reverseDeductionRate` | `reverseDeductionRate` | 倒扣率(1-扣率) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detailCharacter` | `detailCharacter` | `detailCharacter` | 自定义项特征 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自由项特征组 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `voucherDetails` | 配置报价清单关联单据报价详情 |
