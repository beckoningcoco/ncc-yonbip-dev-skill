---
tags: [BIP, 元数据, 数据字典, rscm.projectmaterial.MaterialItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目物资清单明细 (`rscm.projectmaterial.MaterialItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prpr_material_b` | domain：`yonbip-pm-projectme` | 应用：`RSCM` | 业务对象ID：`df40af34-9a0c-497b-a146-0041db0653e9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目物资清单明细 |
| 物理表 | `prpr_material_b` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `RSCM` |
| 直连字段 | 120 个 |
| 子表 | 0 个 |
| 关联引用 | 31 个 |

## 关联引用 (31个)

| 字段名 | 引用类型 |
|--------|---------|
| `project_material_list_id` | `` |
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `agent_id` | `productcenter.aa_invoicemerchantref` |
| `sale_product_id` | `productcenter.pc_nomalproductref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `supplier_suggest_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `order_id` | `udinghuo.voucher_orderlistref` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `sale_contract_id` | `developplatform.XXHT` |
| `alter_source_id` | `` |
| `costcenter_id` | `finbd.bd_costcenterref` |
| `inventory_org` | `ucf-org-center.bd_inventoryorg` |
| `activity_id` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |
| `auxiliary_unit_id` | `productcenter.pc_unitref` |
| `row_type` | `ucfbasedoc.bd_billtyperef` |
| `suggest_vendor_id` | `yssupplier.aa_vendor` |
| `contractJournal` | `yonbip-ec-contract.RefTable_bf5ca95c96` |
| `cqt_unit_id` | `productcenter.pc_unitref` |
| `define_characteristic` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `reserve_id` | `i-isp-medc-med.user_ustock_reservationref` |
| `contract_payment_type_id` | `yonbip-ec-contract.clmFundsCategoryRef` |
| `purchase_org_id` | `ucf-org-center.bd_purchaseorg` |
| `ytenant_id` | `` |
| `define_characteristics` | `` |
| `receiver_cust_id` | `productcenter.aa_invoicemerchantref` |
| `material_classify_id` | `productcenter.pc_managementclassref` |
| `tax_category_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |

## 继承接口 (5个, 19字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 120 个直连字段

### 文本字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `blue_source_id` | `blue_source_id` | `blueSourceId` | 蓝字源头数量 |
| `designated_contract_id` | `designated_contract_id` | `designatedContractId` | 指定合同来源合同Id |
| `from_id` | `from_id` | `fromId` | 来源id |
| `invest_project_id` | `invest_project_id` | `investProjectId` | 投资项目号 |
| `material_desc` | `material_desc` | `materialDesc` | 物料描述 |
| `material_supplylog_id` | `material_supplylog_id` | `materialSupplyLogId` | 推荐供应商日志ID |
| `memo` | `memo` | `memo` | 备注 |
| `oid` | `oid` | `oid` | 原始ID |
| `prj_sale_item_id` | `prj_sale_item_id` | `prjSaleItemId` | 项目销售清单明细 |
| `purchaset_contract_id` | `purchaset_contract_id` | `purchasetContractId` | 采购合同Id |
| `receive_address` | `receive_address` | `receiveAddress` | 收货地址 |
| `receive_mobile` | `receive_mobile` | `receiveMobile` | 收货联系人移动电话 |
| `receive_tele_phone` | `receive_tele_phone` | `receiveTelePhone` | 收货联系人固定电话 |
| `receiver` | `receiver` | `receiver` | 收货联系人 |
| `sale_contract_object_id` | `sale_contract_object_id` | `saleContractObjectId` | 销售合同标的ID |
| `tracking_no` | `tracking_no` | `trackingNO` | 跟踪号 |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity_id` | `activity_id` | `activityId` | 项目活动id |
| `agent_id` | `agent_id` | `agentId` | 客户 |
| `alter_source_id` | `alter_source_id` | `alterSourceId` | 变更来源 |
| `auxiliary_unit_id` | `auxiliary_unit_id` | `auxiliaryUnitId` | 辅单位 |
| `contractJournal` | `contractJournal` | `contractJournal` | 指定合同 |
| `costcenter_id` | `costcenter_id` | `costcenterId` | 成本中心 |
| `cqt_unit_id` | `cqt_unit_id` | `cqtUnitId` | 计价单位 |
| `expense_item_id` | `expense_item_id` | `expenseItemId` | 费用项目 |
| `inventory_org` | `inventory_org` | `inventoryOrg` | 库存组织 |
| `material_classify_id` | `material_classify_id` | `materialClassifyId` | 物料分类 |
| `org_id` | `org_id` | `orgId` | 主组织 |
| `product_id` | `product_id` | `productId` | 物料 |
| `project_material_list_id` | `project_material_list_id` | `projectMaterialListId` | 外键 |
| `purchase_org_id` | `purchase_org_id` | `purchaseOrgId` | 采购组织 |
| `receiver_cust_id` | `receiver_cust_id` | `receiverCustId` | 收货客户id |
| `reserve_id` | `reserve_id` | `reserveId` | 线索id |
| `row_type` | `row_type` | `rowType` | 行类型 |
| `sale_contract_id` | `sale_contract_id` | `saleContractId` | 销售合同 |
| `order_id` | `order_id` | `saleOrderId` | 订单ID |
| `sale_product_id` | `sale_product_id` | `saleProductId` | 销售物料 |
| `suggest_vendor_id` | `suggest_vendor_id` | `suggestVendorId` | 建议委外商 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `supplier_suggest_id` | `supplier_suggest_id` | `supplierSuggestId` | 推荐供应商 |
| `tax_category_id` | `tax_category_id` | `taxCategoryId` | 税率id |
| `wbs` | `wbs` | `wbs` | WBS |
| `contract_payment_type_id` | `contract_payment_type_id` | `contractPaymentTypeId` | 合同款项类别 |
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

### 枚举字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_order_flag` | `apply_order_flag` | `applyOrderFlag` | 是否请购 |
| `edirection` | `edirection` | `edirection` | 方向 |
| `effect_flag` | `effect_flag` | `effectFlag` | 是否生效 |
| `ereturn_flag` | `ereturn_flag` | `ereturnFlag` | 是否退货 |
| `mrp_demand_flag` | `mrp_demand_flag` | `mrpDemandFlag` | 是否MRP需求 |
| `new_flag` | `new_flag` | `newFlag` | 是否最新版本 |
| `product_source` | `product_source` | `productSource` | 物料来源 |
| `production_order_flag` | `production_order_flag` | `productionOrderFlag` | 是否生产订单 |
| `purchase_direct_ship_flag` | `purchase_direct_ship_flag` | `purchaseDirectShipFlag` | 采购直运标识 |
| `requirement_plan_flag` | `requirement_plan_flag` | `requirementPlanFlag` | 是否计划独立需求 |
| `row_status` | `row_status` | `rowStatus` | 行状态 |
| `shipment_flag` | `shipment_flag` | `shipmentFlag` | 是否发货 |
| `specially_flag` | `specially_flag` | `speciallyFlag` | 是否专用料管理 |
| `sub_requisition_flag` | `sub_requisition_flag` | `subRequisitionFlag` | 是否委外 |
| `unit_exchange_type` | `unit_exchange_type` | `unitExchangeType` | 换算方式 |
| `withdraw_materials_flag` | `withdraw_materials_flag` | `withdrawMaterialsFlag` | 是否领料 |
| `eengineering_contract_flag` | `eengineering_contract_flag` | `eengineeringContractFlag` | 是否工程合同 |
| `eengineering_procurement_flag` | `eengineering_procurement_flag` | `eengineeringProcurementFlag` | 是否工程采购 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrua_amount` | `accrua_amount` | `accruaAmount` | 累计预提金额 |
| `applyed_qty` | `applyed_qty` | `applyedQty` | 累计请购数量 |
| `closed_purchase_task_qty` | `closed_purchase_task_qty` | `closedPurchaseTaskQty` | 采购任务关闭数量 |
| `complete_qty` | `complete_qty` | `completeQty` | 累计完成数量 |
| `conversion_rate` | `conversion_rate` | `conversionRate` | 辅单位换算率 |
| `purchaset_taskt_qty` | `purchaset_taskt_qty` | `purchasetTasktQty` | 采购任务数量 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `signe_purch_contr_qty` | `signe_purch_contr_qty` | `signedPurchContrQty` | 签订采购合同数量 |
| `sub_qty` | `sub_qty` | `subQty` | 件数 |
| `tax_mny` | `tax_mny` | `taxMny` | 税额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `this_accrua_amount` | `this_accrua_amount` | `thisAccruaAmount` | 本次预提金额 |
| `total_mny` | `total_mny` | `totalMny` | 无税金额 |
| `total_out_stock_qty` | `total_out_stock_qty` | `totalOutStockQty` | 累计出库数量 |
| `total_outbound_application_qty` | `total_outbound_application_qty` | `totalOutboundApplicationQty` | 累计出库申请数量 |
| `total_product_incoming_qty` | `total_product_incoming_qty` | `totalProductIncomingQty` | 累计生产入库数量 |
| `total_product_qty` | `total_product_qty` | `totalProductQty` | 累计生产数量 |
| `total_purin_stock_quantity` | `total_purin_stock_quantity` | `totalPurInStockQuantity` | 累计采购入库数量 |
| `total_red_quantity` | `total_red_quantity` | `totalRedQuantity` | 累计红字需求 |
| `total_return_goods_quantity` | `total_return_goods_quantity` | `totalReturnGoodsQuantity` | 累计退货数量 |
| `total_return_store_quantity` | `total_return_store_quantity` | `totalReturnStoreQuantity` | 累计退库数量 |
| `total_ship_qty` | `total_ship_qty` | `totalShipQty` | 累计发货数量 |
| `total_sign_qty` | `total_sign_qty` | `totalSignQty` | 累计签收确认数量 |
| `total_sub_arrive_qty` | `total_sub_arrive_qty` | `totalSubArriveQty` | 累计委外到货数量 |
| `total_sub_incoming_qty` | `total_sub_incoming_qty` | `totalSubIncomingQty` | 累计委外入库数量 |
| `total_sub_order_qty` | `total_sub_order_qty` | `totalSubOrderQty` | 累计委外订单数量 |
| `total_sub_require_qty` | `total_sub_require_qty` | `totalSubRequireQty` | 累计委外申请数量 |
| `total_tax_mny` | `total_tax_mny` | `totalTaxMny` | 价税合计 |
| `total_withdraw_materials_qty` | `total_withdraw_materials_qty` | `totalWithdrawMaterialsQty` | 累计领料数量 |
| `unit_price` | `unit_price` | `unitPrice` | 无税单价 |
| `unit_tax_price` | `unit_tax_price` | `unitTaxPrice` | 含税单价 |
| `wait_applyed_qty` | `wait_applyed_qty` | `waitApplyedQty` | 待请购数量 |
| `wait_purchase_task_qty` | `wait_purchase_task_qty` | `waitPurchaseTaskQty` | 待采购任务数量 |
| `total_engineering_contract_quantity` | `total_engineering_contract_quantity` | `totalEngineeringContractQuantity` | 累计工程合同数量 |
| `invexch_rate_den` | `invexch_rate_den` | `invExchRateDen` | 换算率分母 |
| `invexch_rate_num` | `invexch_rate_num` | `invExchRateNum` | 换算率分子 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristic` | `define_characteristic` | `defineCharacteristic` | 自定义项属性 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristics` | `define_characteristics` | `defineCharacteristics` | 自由特征组实体 |
