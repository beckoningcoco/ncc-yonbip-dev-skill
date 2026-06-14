---
tags: [BIP, 元数据, 数据字典, marketing.cpq.OptionalQuotation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置报价清单表头 (`marketing.cpq.OptionalQuotation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`optionalquotation` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：`b0604c0c-acbf-497f-9c85-b3dfad5db6bf`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置报价清单表头 |
| 物理表 | `optionalquotation` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 74 个 |
| 子表 | 3 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `detailGroups` | `marketing.cpq.OptionalQuotationDetailGroup` | composition |
| `details` | `marketing.cpq.OptionalQuotationDetail` | composition |
| `vouchers` | `marketing.cpq.OptionalQuotationVoucher` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `optionalQuotationRuleId` | `` |
| `agentId` | `productcenter.merchantRef` |
| `costPricingId` | `` |
| `productId` | `productcenter.productref` |
| `transaction_type_id` | `transtype.bd_billtyperef` |
| `vcCtsId` | `` |
| `ytenant_id` | `` |
| `creatorId` | `` |
| `` | `` |
| `productDefineCharacter` | `` |
| `staff` | `` |
| `dept` | `` |
| `orgId` | `market_salesorgref` |
| `productUnitId` | `productcenter.pc_unitref_new` |
| `auditor_id` | `` |
| `phasedisplayRuleId` | `` |
| `stock_org_id` | `stockOrgref` |
| `currencyId` | `ucfbasedoc.bd_currencytenantref` |
| `vcConfigId` | `engineeringdata.ed_variant_configuration_ref` |
| `headCharacter` | `` |
| `main_unit_id` | `` |

## 继承接口 (4个, 13字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``

## 字段列表（按类型分组）

> 共 74 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `cExplain` | `cExplain` | `explain` | 说明 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `priceIdentification` | `priceIdentification` | `priceIdentification` | 价格标识 |
| `remark` | `remark` | `remark` | 备注 |
| `vcCtsCode` | `vcCtsCode` | `vcCtsCode` | 配置号 |
| `vcCtsVersion` | `vcCtsVersion` | `vcCtsVersion` | 选配单版本 |
| `voucherDetailNum` | `voucherDetailNum` | `voucherDetailNum` | 来源单据行号 |
| `voucherNum` | `voucherNum` | `voucherNum` | 来源单据号 |
| `voucherType` | `voucherType` | `voucherType` | 来源单据类型 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agentId` | `agentId` | `agentId` | 客户 |
| `auditor_id` | `auditor_id` | `auditorId` | 审核人 |
| `costPricingId` | `costPricingId` | `costPricingId` | 成本取价方案ID |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `currencyId` | `currencyId` | `currencyId` | 币种 |
| `dept` | `dept` | `dept` | 部门 |
| `main_unit_id` | `main_unit_id` | `mainUnitId` | 主单位 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `optionalQuotationRuleId` | `optionalQuotationRuleId` | `optionalQuotationRuleId` | 配置报价清单规则 |
| `orgId` | `orgId` | `orgId` | 销售组织 |
| `phasedisplayRuleId` | `phasedisplayRuleId` | `phasedisplayRuleId` | 盈亏显示规则ID |
| `productId` | `productId` | `productId` | 顶层物料 |
| `productUnitId` | `productUnitId` | `productUnitId` | 计价单位 |
| `staff` | `staff` | `staff` | 业务员 |
| `stock_org_id` | `stock_org_id` | `stockOrgId` | 库存组织 |
| `transaction_type_id` | `transaction_type_id` | `transactionTypeId` | 交易类型 |
| `vcConfigId` | `vcConfigId` | `vcConfigId` | 选配参数文件 |
| `vcCtsId` | `vcCtsId` | `vcCtsId` | 选配单 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `end_date` | `end_date` | `endDate` | 报价有效期止 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `start_date` | `start_date` | `startDate` | 报价有效期起 |
| `voucherDate` | `voucherDate` | `voucherDate` | 报价日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_wf_controlled` | `is_wf_controlled` | `isWfControlled` | 是否受审批流控制 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `return_count` | `return_count` | `returncount` | 退回次数 |
| `verify_state` | `verify_state` | `verifystate` | 审批状态 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStatus` | `iStatus` | `isEnable` | 启用状态 |
| `iSourceType` | `iSourceType` | `sourceType` | 来源类型 |
| `i_status` | `i_status` | `status` | 审批状态 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_id` | `bom_id` | `bomId` | bomId |
| `id` | `id` | `id` | id |
| `sourceChangeId` | `sourceChangeId` | `sourceChangeId` | 变更历史 |
| `voucherDetailId` | `voucherDetailId` | `voucherDetailId` | 来源单据行 |
| `voucherId` | `voucherId` | `voucherId` | 来源单据 |

### 数值字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `baseDeductionMoney` | `baseDeductionMoney` | `baseDeductionMoney` | 基价扣额(基价金额-折后基价金额) |
| `baseDeductionRate` | `baseDeductionRate` | `baseDeductionRate` | 基价扣率(折后基价金额/基价金额) |
| `baseMoney` | `baseMoney` | `baseMoney` | 基价金额(基价*数量) |
| `basePrice` | `basePrice` | `basePrice` | 选配件基价(询价带出) |
| `deductionMoney` | `deductionMoney` | `deductionMoney` | 扣额(报价金额-金额) |
| `deductionRate` | `deductionRate` | `deductionRate` | 扣率(折后金额/报价金额) |
| `discountedBaseMoney` | `discountedBaseMoney` | `discountedBaseMoney` | 折后基价金额 |
| `discountedBasePrice` | `discountedBasePrice` | `discountedBasePrice` | 折后基价(折后金额/计价单位数量) |
| `discounted_base_qty` | `discounted_base_qty` | `discountedBaseQty` | 计价单位数量 |
| `discountedMoney` | `discountedMoney` | `discountedMoney` | 折后金额(子件汇总) |
| `discountedPrice` | `discountedPrice` | `discountedPrice` | 折后单价(折后金额/计价单位数量) |
| `main_qty` | `main_qty` | `mainQty` | 主数量 |
| `otherMoney` | `otherMoney` | `otherMoney` | 其他随单金额(报价金额-金额) |
| `priceQty` | `priceQty` | `priceQty` | 计价数量 |
| `quoteMoney` | `quoteMoney` | `quoteMoney` | 报价金额(子件汇总) |
| `quotePrice` | `quotePrice` | `quotePrice` | 报价单价(报价金额/计价单位数量) |
| `reverseBaseDeductionRate` | `reverseBaseDeductionRate` | `reverseBaseDeductionRate` | 基价倒扣率(1-扣率) |
| `reverseDeductionRate` | `reverseDeductionRate` | `reverseDeductionRate` | 倒扣率(1-扣率) |
| `totalMoney` | `totalMoney` | `totalMoney` | 总报价金额(金额+其他随单金额) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审核时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `detailGroups` | 配置报价清单详情分组 |
| `` | `` | `details` | 配置报价清单详情 |
| `` | `` | `vouchers` | 配置报价清单关联单据 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `headCharacter` | `headCharacter` | `headCharacter` | 自定义项特征 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自由项特征组 |
