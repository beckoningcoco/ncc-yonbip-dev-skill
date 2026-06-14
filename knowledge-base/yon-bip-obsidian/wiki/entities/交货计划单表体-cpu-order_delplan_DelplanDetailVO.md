---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.delplan.DelplanDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 交货计划单表体 (`cpu-order.delplan.DelplanDetailVO`)

> ycSaleCoor | 物理表：`cpu_delplan_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交货计划单表体 |
| 物理表 | `cpu_delplan_detail` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:20.6320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（127个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `delplanDetailDefineCharacter` | 自定义项特征属性组 | `define_character` | 49104a25-254a-447f-8a46-c6fc001d35fe |
| 2 | `delplanDetailFreeCharacteristics` | 自由项特征组实体 | `instance_id` | 299ac828-6b9b-4132-982c-04fed84eff2e |
| 3 | `deliveryLeftNum` | 可发货数量 | `delivery_left_num` | Decimal |
| 4 | `delplanId` | 交货计划主表id | `delplan_id` | 32906d9a-c3fe-45a8-911e-3fa69dea058a |
| 5 | `dr` | 删除标志 | `dr` | Integer |
| 6 | `id` | ID | `id` | Long |
| 7 | `invoiceRecOrgCode` | 收票组织编码 | `invoice_rec_org_code` | String |
| 8 | `invoiceRecOrgName` | 收票组织名称 | `invoice_rec_org_name` | String |
| 9 | `ts` | 时间戳 | `ts` | DateTime |
| 10 | `detailNo` | 交货计划子表单据编号 | `detail_no` | String |
| 11 | `lineNum` | 行号 | `line_num` | Integer |
| 12 | `materialCode` | 物料编码 | `material_code` | String |
| 13 | `materialName` | 物料名称 | `material_name` | String |
| 14 | `materialSpec` | 物料规格型号 | `material_spec` | String |
| 15 | `version` | 版本号 | `version` | String |
| 16 | `materialModel` | 物料型号 | `material_model` | String |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 18 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 19 | `purOrderLine` | 采购订单行号 | `pur_order_line` | String |
| 20 | `purOrderCode` | 采购订单号 | `pur_order_code` | String |
| 21 | `deliveryNum` | 交货数量 | `delivery_num` | Decimal |
| 22 | `confirmDeliveryNum` | 确认交货数量 | `confirm_delivery_num` | Decimal |
| 23 | `totalDeliveryNum` | 累计发货数量 | `total_delivery_num` | Decimal |
| 24 | `paidNum` | 实收数量 | `paid_num` | Decimal |
| 25 | `paidDiffNum` | 实收差异数量 | `paid_diff_num` | Decimal |
| 26 | `deliveryDate` | 要求交货时间 | `delivery_date` | DateTime |
| 27 | `confirmDeliveryDate` | 确认交货时间 | `confirm_delivery_date` | DateTime |
| 28 | `inwhNum` | 入库数量 | `inwh_num` | Decimal |
| 29 | `inwhDiffNum` | 入库差异数量 | `inwh_diff_num` | Decimal |
| 30 | `deliveryLeftMainNum` | 可发货主数量 | `delivery_left_main_num` | Decimal |
| 31 | `receivingAddressName` | 收货地址名称 | `receiving_address_name` | String |
| 32 | `deliveryReplenishNum` | 拒收需补货数量 | `delivery_replenish_num` | Decimal |
| 33 | `receiveOrgName` | 收货组织名称 | `receive_org_name` | String |
| 34 | `arrPlanId` | 到货计划单主表id | `arrPlan_id` | Long |
| 35 | `deliveryReplenishMainNum` | 拒收需补货主数量 | `delivery_replenish_main_num` | Decimal |
| 36 | `receivingAddressCode` | 收货地址编码 | `receiving_address_code` | String |
| 37 | `memo` | 备注 | `memo` | String |
| 38 | `rowRefuseReason` | 拒绝/变更理由 | `row_refuse_reason` | String |
| 39 | `fisactive` | 行状态:0.激活 1.关闭 | `fisactive` | String |
| 40 | `unitCode` | 单位编码 | `unit_code` | String |
| 41 | `unitName` | 单位名称 | `unit_name` | String |
| 42 | `unitMainCode` | 主计量单位编码 | `unit_main_code` | String |
| 43 | `unitMainName` | 主计量单位名称 | `unit_main_name` | String |
| 44 | `deliveryMainNum` | 交货主数量 | `delivery_main_num` | Decimal |
| 45 | `confirmDeliveryMainNum` | 确认交货主数量 | `confirm_delivery_main_num` | Decimal |
| 46 | `totalDeliveryMainNum` | 累计发货主数量 | `total_delivery_main_num` | Decimal |
| 47 | `paidMainNum` | 实收主数量 | `paid_main_num` | Decimal |
| 48 | `paidDiffMainNum` | 实收差异主数量 | `paid_diff_main_num` | Decimal |
| 49 | `inwhMainNum` | 入库主数量 | `inwh_main_num` | Decimal |
| 50 | `inwhDiffMainNum` | 入库差异主数量 | `inwh_diff_main_num` | Decimal |
| 51 | `purUnitCode` | 采购业务单位编码 | `pur_unit_code` | String |
| 52 | `purUnitName` | 采购业务单位名称 | `pur_unit_name` | String |
| 53 | `purUnitConRate` | 采购单位换算率 | `pur_unit_con_rate` | Decimal |
| 54 | `warehouseCode` | 仓库编码 | `warehouse_code` | String |
| 55 | `warehouseName` | 仓库名称 | `warehouse_name` | String |
| 56 | `contractNo` | 销售合同号 | `contract_no` | String |
| 57 | `skuCode` | SKU编码 | `sku_code` | String |
| 58 | `skuName` | SKU名称 | `sku_name` | String |
| 59 | `skuModel` | SKU型号 | `sku_model` | String |
| 60 | `skuSpecCode` | SKU规格说明编码 | `sku_spec_code` | String |
| 61 | `skuSpec` | SKU规格 | `sku_spec` | String |
| 62 | `purEnterpriseName` | 采购商企业名称 | `pur_enterprise_name` | String |
| 63 | `enterpriseName` | 销售商企业名称 | `enterprise_name` | String |
| 64 | `createDate` | 创建时间 | `create_date` | DateTime |
| 65 | `changeDate` | 修改时间 | `change_date` | DateTime |
| 66 | `receiveOrgCode` | 收货组织编码 | `receive_org_code` | String |
| 67 | `saleOrderLine` | 销售订单行号 | `sale_order_line` | Decimal |
| 68 | `saleOrderCode` | 销售订单号 | `sale_order_code` | String |
| 69 | `receivePersonCode` | 收货人编码 | `receive_person_code` | String |
| 70 | `receivePersonName` | 收货人名称 | `receive_person_name` | String |
| 71 | `materialId` | 物料主键 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 72 | `delplanNo` | 交货计划主表单据编号 | `delplan_no` | String |
| 73 | `saleOrderId` | 销售订单主表ID | `sale_order_id` | Long |
| 74 | `saleOrderDetailId` | 销售订单子表ID | `sale_order_detail_id` | Long |
| 75 | `unitId` | 单位主键 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 76 | `unitMainId` | 主计量单位主键 | `unit_main_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 77 | `warehouseId` | 仓库主键 | `warehouse_id` | Long |
| 78 | `receivingAddressId` | 收货地址主键 | `receiving_address_id` | Long |
| 79 | `confirmstatus` | 确认状态 | `confirmstatus` | String |
| 80 | `receiveOrgId` | 收货组织主键 | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 81 | `skuId` | SKU主键 | `sku_id` | Long |
| 82 | `purEnterpriseId` | 采购商企业ID | `pur_enterprise_id` | Long |
| 83 | `enterpriseId` | 销售商企业ID | `enterprise_id` | Long |
| 84 | `purOrderId` | 采购订单主表ID | `pur_order_id` | Long |
| 85 | `purOrderDetailId` | 采购订单子表ID | `pur_order_detail_id` | Long |
| 86 | `purUnitId` | 采购业务单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 87 | `receivePersonId` | 收货人主键 | `receive_person_id` | String |
| 88 | `invoiceRecOrgId` | 收票组织pk | `invoice_rec_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 89 | `isBarcodeMng` | 是否条码管理 | `is_barcode_mng` | Integer |
| 90 | `activity` | 活动主键 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 91 | `activityCode` | 活动编码 | `activity_code` | String |
| 92 | `activityName` | 活动 | `activity_name` | String |
| 93 | `closeExplain` | 关闭说明 | `close_explain` | String |
| 94 | `defines` | 表体自定义项 | `` | c63d0343-d448-49ba-890e-54d6df0c98a1 |
| 95 | `deliveredMainNum` | 已发货主数量 | `delivered_main_num` | Decimal |
| 96 | `deliveredPurchaseNum` | 已发货采购数量 | `delivered_purchase_num` | Decimal |
| 97 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 98 | `isOutsourceCollaborate` | 是否与委外商协同 | `is_outsource_collaborate` | Boolean |
| 99 | `lineno` | 行号 | `lineno` | Decimal |
| 100 | `mainActualNum` | 实际到货主数量 | `main_actual_num` | Decimal |
| 101 | `maindiffActualNum` | 实际到货差异主数量 | `main_diff_actual_num` | Decimal |
| 102 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 103 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 104 | `operationCode` | 工序编码 | `operation_code` | String |
| 105 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 106 | `operationName` | 工序名称 | `operation_name` | String |
| 107 | `outsourcer` | 委外商 | `outsourcer` | String |
| 108 | `outsourcerId` | 委外商主键 | `outsourcer_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 109 | `productPuType` | 物料采购类型 | `product_pu_type` | String |
| 110 | `projectCode` | 项目编码 | `project_code` | String |
| 111 | `projectId` | 项目档案 | `project_id` | String |
| 112 | `projectName` | 项目名称 | `project_name` | String |
| 113 | `pubts` | 时间戳 | `ts` | DateTime |
| 114 | `purUnitConRateDen` | 采购单位换算率分母 | `pur_unit_con_rateden` | Decimal |
| 115 | `purUnitConRateNum` | 采购单位换算率分子 | `pur_unit_con_ratenum` | Decimal |
| 116 | `purchaseActualNum` | 实际到货采购数量 | `purchase_actual_num` | Decimal |
| 117 | `purchasediffActualNum` | 实际到货差异采购数量 | `purchase_diff_actual_num` | Decimal |
| 118 | `signatory` | 签收方 | `signatory` | String |
| 119 | `source` | 上游单据类型 | `source` | String |
| 120 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 121 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 122 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 123 | `upcode` | 上游单据号 | `upcode` | String |
| 124 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 125 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 126 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 127 | `wbsName` | WBS任务 | `wbs_name` | String |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `invoiceRecOrgId` | 收票组织pk | `org.func.BaseOrg` | Service |  |
| 2 | `receiveOrgId` | 收货组织主键 | `org.func.BaseOrg` | Service |  |
| 3 | `activity` | 活动主键 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `delplanDetailDefineCharacter` | 自定义项特征属性组 | `cpu-order.delplan.DelplanCharacterDefine` | None |  |
| 6 | `purUnitId` | 采购业务单位主键 | `pc.unit.Unit` | Service |  |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 8 | `materialId` | 物料主键 | `pc.product.Product` | Service |  |
| 9 | `unitMainId` | 主计量单位主键 | `pc.unit.Unit` | Service |  |
| 10 | `delplanDetailFreeCharacteristics` | 自由项特征组实体 | `cpu-order.delplan.DelplanCharacteristicsDefine` | None |  |
| 11 | `defines` | 表体自定义项 | `cpu-order.delplan.DelplanDetailVODefine` | None | true |
| 12 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 13 | `unitId` | 单位主键 | `pc.unit.Unit` | Service |  |
| 14 | `outsourcerId` | 委外商主键 | `aa.vendor.Vendor` | Service |  |
| 15 | `delplanId` | 交货计划主表id | `cpu-order.delplan.DelplanVO` | None | true |
