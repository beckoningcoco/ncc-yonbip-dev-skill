---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectTaskMaterial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目活动物资清单 (`pgrm.projecttask.ProjectTaskMaterial`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prpr_material_b` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`f76a015a-f5ed-4916-8354-47da523fbe1f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目活动物资清单 |
| 物理表 | `prpr_material_b` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PGRM` |
| 直连字段 | 74 个 |
| 子表 | 0 个 |
| 关联引用 | 19 个 |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `project_material_list_id` | `` |
| `define_characteristic` | `` |
| `agent_id` | `productcenter.aa_merchant_master` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `reserve_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `yonbip-pm-commonbd.RefTable_1906842236` |
| `purchase_org_id` | `ucf-org-center.bd_purchaseorg` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `inventory_org` | `ucf-org-center.bd_inventoryorg` |
| `row_type` | `yonbip-pm-projectme.rscm_row_type_ref` |
| `define_characteristics` | `` |
| `activity_id` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |
| `receiver_cust_id` | `productcenter.aa_merchant_master` |
| `suggest_vendor_id` | `yssupplier.aa_vendor` |
| `cqt_unit_id` | `productcenter.pc_unitref` |
| `tax_category_id` | `ucfbasedoc.bd_taxrate` |

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

> 共 74 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auxiliary_unit_id` | `auxiliary_unit_id` | `auxiliaryUnitId` | 辅单位 |
| `conversion_rate` | `conversion_rate` | `conversionRate` | 辅单位换算率 |
| `id` | `id` | `id` | 主键 |
| `material_desc` | `material_desc` | `materialDesc` | 物料描述 |
| `material_source_id` | `material_source_id` | `materialSourceId` | 来源ID |
| `memo` | `memo` | `memo` | 备注 |
| `oid` | `oid` | `oid` | 原始ID |
| `prj_sale_item_id` | `prj_sale_item_id` | `prjSaleItemId` | 项目销售清单明细ID |
| `purchaset_contract_id` | `purchaset_contract_id` | `purchaseContractId` | 采购合同Id |
| `receive_address` | `receive_address` | `receiveAddress` | 收货地址 |
| `receive_mobile` | `receive_mobile` | `receiveMobile` | 收货联系人移动电话 |
| `receive_tele_phone` | `receive_tele_phone` | `receiveTelePhone` | 收货联系人固定电话 |
| `receiver` | `receiver` | `receiver` | 收货联系人 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `tracking_no` | `tracking_no` | `trackingNO` | 跟踪号 |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agent_id` | `agent_id` | `agentId` | 客户 |
| `cqt_unit_id` | `cqt_unit_id` | `cqtUnitId` | 计价单位 |
| `creator` | `creator` | `creator` | 创建人 |
| `inventory_org` | `inventory_org` | `inventoryOrg` | 库存组织 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 组织ID |
| `product_id` | `product_id` | `productId` | 物料 |
| `project_material_list_id` | `project_material_list_id` | `projectMaterialListId` | 物资清单id |
| `activity_id` | `activity_id` | `projectScheduleTaskId` | 项目活动 |
| `purchase_org_id` | `purchase_org_id` | `purchaseOrgId` | 采购组织 |
| `receiver_cust_id` | `receiver_cust_id` | `receiverCustId` | 收货客户 |
| `reserve_id` | `reserve_id` | `reserveId` | 跟踪线索Id |
| `row_type` | `row_type` | `rowType` | 行类型 |
| `suggest_vendor_id` | `suggest_vendor_id` | `suggestVendorId` | 建议委外商 |
| `tax_category_id` | `tax_category_id` | `taxCategoryId` | 税率id |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `demand_time` | `demand_time` | `demandTime` | 需求时间 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_order_flag` | `apply_order_flag` | `applyOrderFlag` | 是否请购 |
| `edirection` | `edirection` | `edirection` | 方向 |
| `effect_flag` | `effect_flag` | `effectFlag` | 是否生效 |
| `latest_version` | `latest_version` | `latestVersion` | 是否最新版本 |
| `mrp_demand_flag` | `mrp_demand_flag` | `mrpDemandFlag` | 是否MRP需求 |
| `production_order_flag` | `production_order_flag` | `productionOrderFlag` | 是否生产订单 |
| `purchase_direct_ship_flag` | `purchase_direct_ship_flag` | `purchaseDirectShipFlag` | 采购直运标识 |
| `requirement_plan_flag` | `requirement_plan_flag` | `requirementPlanFlag` | 是否计划独立需求 |
| `row_status` | `row_status` | `rowStatus` | 行状态 |
| `shipment_flag` | `shipment_flag` | `shipmentFlag` | 是否发货 |
| `sub_requisition_flag` | `sub_requisition_flag` | `subRequisitionFlag` | 是否委外 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applyed_qty` | `applyed_qty` | `applyedQty` | 累计请购数量 |
| `closed_purchase_task_qty` | `closed_purchase_task_qty` | `closedPurchaseTaskQty` | 采购任务关闭数量 |
| `complete_qty` | `complete_qty` | `completeQty` | 累计完成数量 |
| `purchaset_taskt_qty` | `purchaset_taskt_qty` | `purchaseTaskQty` | 累计采购任务数量 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `signed_purch_contr_qty` | `signed_purch_contr_qty` | `signedPurchContrQty` | 签订采购合同数量 |
| `tax_mny` | `tax_mny` | `taxMny` | 税额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `total_mny` | `total_mny` | `totalMny` | 无税金额 |
| `total_out_stock_qty` | `total_out_stock_qty` | `totalOutStockQty` | 累计出库数量 |
| `total_product_incoming_qty` | `total_product_incoming_qty` | `totalProductIncomingQty` | 累计生产入库数量  |
| `total_product_qty` | `total_product_qty` | `totalProductQty` | 累计生产数量 |
| `total_purin_stock_quantity` | `total_purin_stock_quantity` | `totalPurInStockQuantity` | 累计采购入库数量 |
| `total_ship_qty` | `total_ship_qty` | `totalShipQty` | 累计发货数量 |
| `total_sign_qty` | `total_sign_qty` | `totalSignQty` | 累计签收确认数量 |
| `total_sub_arrive_qty` | `total_sub_arrive_qty` | `totalSubArriveQty` | 累计委外到货数量 |
| `total_sub_incoming_qty` | `total_sub_incoming_qty` | `totalSubIncomingQty` | 累计委外入库数量 |
| `total_sub_order_qty` | `total_sub_order_qty` | `totalSubOrderQty` | 累计委外订单数量 |
| `total_sub_require_qty` | `total_sub_require_qty` | `totalSubRequireQty` | 累计委外申请数量 |
| `total_tax_mny` | `total_tax_mny` | `totalTaxMny` | 价税合计 |
| `unit_price` | `unit_price` | `unitPrice` | 无税单价 |
| `unit_tax_price` | `unit_tax_price` | `unitTaxPrice` | 含税单价 |
| `wait_applyed_qty` | `wait_applyed_qty` | `waitApplyedQty` | 待请购数量 |
| `wait_purchase_task_qty` | `wait_purchase_task_qty` | `waitPurchaseTaskQty` | 待采购任务数量 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristic` | `define_characteristic` | `defineCharacteristic` | 自定义项属性 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristics` | `define_characteristics` | `defineCharacteristics` | 自由项特征组 |
