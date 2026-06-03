---
tags: [BIP, 元数据, 数据字典, pric.purchase.PurchaseExecutionItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 采购执行项 (`pric.purchase.PurchaseExecutionItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pm_purchase_execution_item` | domain：`yonbip-pm-revexp` | 应用：`PRPR` | 业务对象ID：`d33969d8-7ea0-4981-9bfe-03a57e4f648f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购执行项 |
| 物理表 | `pm_purchase_execution_item` |
| 数据库 schema | `yonbip-pm-revexp` |
| 所属应用 | `PRPR` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item_id` | `yonyoufi.bd_expenseitemref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `receive_org_id` | `` |
| `product_id` | `` |
| `cost_center` | `finbd.bd_costcenterref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `org_id` | `` |
| `define_characteristics` | `` |
| `purchase_exec_b_define_character` | `` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |
| `purchase_execution_id` | `` |
| `cqt_unit_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 38 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `source_id` | `source_id` | `sourceId` | 来源ID |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cqt_unit_id` | `cqt_unit_id` | `cqtUnitId` | 计价单位id |
| `org_id` | `org_id` | `orgId` | 采购组织 |
| `product_id` | `product_id` | `productId` | 商品ID |
| `purchase_execution_id` | `purchase_execution_id` | `purchaseExecutionId` | 项目采购执行主表外键 |
| `receive_org_id` | `receive_org_id` | `receiveOrgId` | 收票组织 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `creator` | `creator` | `creator` | 创建人 |
| `expense_item_id` | `expense_item_id` | `expenseItemId` | 费用项目 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tax_rate_id` | `tax_rate_id` | `taxRateId` | 税率id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `order_status` | `order_status` | `orderStatus` | 订单状态 |

### 数值字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nat_no_tax_price` | `nat_no_tax_price` | `natNoTaxPrice` | 无税单价(本币) |
| `nat_price` | `nat_price` | `natPrice` | 商品单价(本币) |
| `nat_product_mny` | `nat_product_mny` | `natProductMny` | 商品金额(本币) |
| `nat_settled_mny` | `nat_settled_mny` | `natSettledMny` | 已结算金额(本币) |
| `no_tax_price` | `no_tax_price` | `noTaxPrice` | 无税单价 |
| `price` | `price` | `price` | 商品单价 |
| `product_mny` | `product_mny` | `productMny` | 商品金额 |
| `quantity` | `quantity` | `quantity` | 商品数量 |
| `settled_mny` | `settled_mny` | `settledMny` | 已结算金额 |
| `settled_qty` | `settled_qty` | `settledQty` | 已结算数量 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `invoice_mny` | `invoice_mny` | `invoiceMny` | 收票金额 |
| `invoice_no_tax_mny` | `invoice_no_tax_mny` | `invoiceNoTaxMny` | 无税收票金额 |
| `nat_invoice_mny` | `nat_invoice_mny` | `natInvoiceMny` | 收票金额(本币) |
| `nat_invoice_no_tax_mny` | `nat_invoice_no_tax_mny` | `natInvoiceNoTaxMny` | 无税收票金额(本币) |
| `nat_withholding_amount_mny` | `nat_withholding_amount_mny` | `natWithholdingAmountMny` | 预提金额(本币) |
| `not_verified_quantity` | `not_verified_quantity` | `notVerifiedQuantity` | 待核销数量 |
| `withholding_amount_mny` | `withholding_amount_mny` | `withholdingAmountMny` | 预提金额 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristics` | `define_characteristics` | `defineCharacteristics` | 自由项特征组 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `purchase_exec_b_define_character` | `purchase_exec_b_define_character` | `purchaseExecBDefineCharacter` | 自定义项特征属性 |
