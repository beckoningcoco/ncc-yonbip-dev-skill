---
tags: [BIP, 元数据, 数据字典, RSCM.materialadjust.MaterialAdjustItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物资变更明细 (`RSCM.materialadjust.MaterialAdjustItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rscm_material_adjust_item` | domain：`yonbip-pm-projectme` | 应用：`RSCM` | 业务对象ID：`ff1278ee-29d0-4c6e-adfb-ca2c819c4679`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物资变更明细 |
| 物理表 | `rscm_material_adjust_item` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `RSCM` |
| 直连字段 | 79 个 |
| 子表 | 0 个 |
| 关联引用 | 24 个 |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `inventory_org_id` | `ucf-org-center.bd_inventoryorg` |
| `define_characteristic` | `` |
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `agent_id` | `productcenter.aa_invoicemerchantref` |
| `sale_product_id` | `productcenter.pc_nomalproductref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `supplier_suggest_id` | `` |
| `contract_payment_type_id` | `yonbip-ec-contract.clmFundsCategoryRef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `order_id` | `udinghuo.voucher_orderlistref` |
| `purchase_org_id` | `ucf-org-center.bd_purchaseorg` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.bd_baseorgref` |
| `sale_contract_id` | `developplatform.XXHT` |
| `costcenter_id` | `finbd.bd_costcenterref` |
| `auxiliary_unit_id` | `productcenter.pc_unitref` |
| `row_type` | `ucfbasedoc.bd_billtyperef` |
| `receiver_cust_id` | `productcenter.aa_invoicemerchantref` |
| `MaterialAdjust_id` | `` |
| `material_classify_id` | `productcenter.pc_managementclassref` |
| `cqt_unit_id` | `productcenter.pc_unitref` |
| `tax_category_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 79 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `designated_contract_id` | `designated_contract_id` | `designatedContractId` | 指定合同id |
| `invest_project_id` | `invest_project_id` | `investProjectId` | 投资项目号 |
| `material_desc` | `material_desc` | `materialDesc` | 物料描述 |
| `material_supply_log_id` | `material_supply_log_id` | `materialSupplyLogId` | 供应商推荐历史 |
| `memo` | `memo` | `memo` | 备注 |
| `oid` | `oid` | `oid` | 物资清单原始ID |
| `purchaset_contract_id` | `purchaset_contract_id` | `purchasetContractId` | 采购合同id |
| `receive_address` | `receive_address` | `receiveAddress` | 收货地址 |
| `receive_mobile` | `receive_mobile` | `receiveMobile` | 收货联系人移动电话 |
| `receive_tele_phone` | `receive_tele_phone` | `receiveTelePhone` | 收货联系人固定电话 |
| `receiver` | `receiver` | `receiver` | 收货联系人 |
| `red_source_id` | `red_source_id` | `redSourceId` | 红字源头id |
| `sale_contract_object_id` | `sale_contract_object_id` | `saleContractObjectId` | 销售合同标的ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_payment_type_id` | `contract_payment_type_id` | `contractPaymentTypeId` | 合同款项类别 |
| `MaterialAdjust_id` | `MaterialAdjust_id` | `MaterialAdjust_id` | 项目物资变更 |
| `agent_id` | `agent_id` | `agentId` | 客户 |
| `auxiliary_unit_id` | `auxiliary_unit_id` | `auxiliaryUnitId` | 辅单位 |
| `costcenter_id` | `costcenter_id` | `costcenterId` | 成本中心 |
| `cqt_unit_id` | `cqt_unit_id` | `cqtUnitId` | 计价单位 |
| `expense_item_id` | `expense_item_id` | `expenseItemId` | 费用项目 |
| `inventory_org_id` | `inventory_org_id` | `inventoryOrgId` | 库存组织 |
| `material_classify_id` | `material_classify_id` | `materialClassifyId` | 物料分类 |
| `org_id` | `org_id` | `orgId` | 主组织 |
| `product_id` | `product_id` | `productId` | 物料 |
| `purchase_org_id` | `purchase_org_id` | `purchaseOrgId` | 采购组织 |
| `receiver_cust_id` | `receiver_cust_id` | `receiverCustId` | 收货客户 |
| `row_type` | `row_type` | `rowType` | 行类型 |
| `sale_contract_id` | `sale_contract_id` | `saleContractId` | 销售合同 |
| `order_id` | `order_id` | `saleOrderId` | 订单ID |
| `sale_product_id` | `sale_product_id` | `saleProductId` | 销售物料 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `supplier_suggest_id` | `supplier_suggest_id` | `supplierSuggestId` | 供应商推荐id |
| `tax_category_id` | `tax_category_id` | `taxCategoryId` | 税率id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `demand_time` | `demand_time` | `demandTime` | 需求时间 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `eengineering_procurement_flag` | `eengineering_procurement_flag` | `eengineeringProcurementFlag` | 是否工程采购 |
| `product_source` | `product_source` | `productSource` | 物料来源 |
| `row_status` | `row_status` | `rowStatus` | 行状态 |
| `unit_exchange_type` | `unit_exchange_type` | `unitExchangeType` | 换算方式 |
| `eengineering_contract_flag` | `eengineering_contract_flag` | `eengineeringContractFlag` | 是否工程合同 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrua_amount` | `accrua_amount` | `accruaAmount` | 累计预提金额 |
| `adjust_quantity` | `adjust_quantity` | `adjustQuantity` | 变更的数量 |
| `adjust_tax_mny` | `adjust_tax_mny` | `adjustTaxMny` | 变更的税额 |
| `adjust_tax_rate` | `adjust_tax_rate` | `adjustTaxRate` | 变更的税率 |
| `adjust_total_mny` | `adjust_total_mny` | `adjustTotalMny` | 变更的无税金额 |
| `adjust_total_tax_mny` | `adjust_total_tax_mny` | `adjustTotalTaxMny` | 变更的价税合计 |
| `adjust_unit_price` | `adjust_unit_price` | `adjustUnitPrice` | 变更的无税单价 |
| `adjust_unit_tax_price` | `adjust_unit_tax_price` | `adjustUnitTaxPrice` | 变更的含税单价 |
| `applyed_qty` | `applyed_qty` | `applyedQty` | 累计请购数量 |
| `conversion_rate` | `conversion_rate` | `conversionRate` | 辅单位换算率 |
| `origin_quantity` | `origin_quantity` | `originQuantity` | 变更前数量 |
| `origin_tax_mny` | `origin_tax_mny` | `originTaxMny` | 变更前税额 |
| `origin_tax_rate` | `origin_tax_rate` | `originTaxRate` | 变更前税率 |
| `origin_total_mny` | `origin_total_mny` | `originTotalMny` | 变更前无税金额 |
| `origin_total_tax_mny` | `origin_total_tax_mny` | `originTotalTaxMny` | 变更前价税合计 |
| `origin_unit_price` | `origin_unit_price` | `originUnitPrice` | 变更前无税单价 |
| `origin_unit_tax_price` | `origin_unit_tax_price` | `originUnitTaxPrice` | 变更前含税单价 |
| `purchaset_taskt_qty` | `purchaset_taskt_qty` | `purchasetTasktQty` | 采购任务数量 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `signe_purch_contr_qty` | `signe_purch_contr_qty` | `signedPurchContrQty` | 签订采购合同数量 |
| `sub_qty` | `sub_qty` | `subQty` | 件数 |
| `tax_mny` | `tax_mny` | `taxMny` | 税额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `this_accrua_amount` | `this_accrua_amount` | `thisAccruaAmount` | 本次预提金额 |
| `total_mny` | `total_mny` | `totalMny` | 无税金额 |
| `total_tax_mny` | `total_tax_mny` | `totalTaxMny` | 价税合计 |
| `unit_price` | `unit_price` | `unitPrice` | 无税单价 |
| `unit_tax_price` | `unit_tax_price` | `unitTaxPrice` | 含税单价 |
| `total_engineering_contract_quantity` | `total_engineering_contract_quantity` | `totalEngineeringContractQuantity` | 累计工程合同数量 |
| `invexch_rate_den` | `invexch_rate_den` | `invExchRateDen` | 换算率分母 |
| `invexch_rate_num` | `invexch_rate_num` | `invExchRateNum` | 换算率分子 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristic` | `define_characteristic` | `defineCharacteristic` | 自定义项特征组 |
