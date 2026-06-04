---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.returnorder.CpuReturnOrderDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 退换货子表 (`cpu-order.returnorder.CpuReturnOrderDetail`)

> ycSaleCoor | 物理表：`cpu_return_order_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 退换货子表 |
| 物理表 | `cpu_return_order_detail` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:24.4370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（109个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `activity` | 活动主键 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 2 | `activityCode` | 活动编码 | `activity_code` | String |
| 3 | `activityName` | 活动 | `activity_name` | String |
| 4 | `amount` | 无税金额 | `amount` | Decimal |
| 5 | `arriveorderCode` | 原单到货单号 | `arriveorder_code` | String |
| 6 | `arriveorderCodeLineNum` | 原单到货单号行号 | `arriveorder_code_line_num` | String |
| 7 | `arriveorderDetaiId` | 到货单子表id | `arriveorder_detail_id` | Long |
| 8 | `arriveorderId` | 到货单id | `arriveorder_id` | Long |
| 9 | `batchNo` | 批次号 | `batch_no` | String |
| 10 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 11 | `creator` | 创建人 | `creator` | String |
| 12 | `currencyCode` | 币种编号 | `currency_code` | String |
| 13 | `currencyId` | 币种Id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 14 | `currencyName` | 币种 | `currency_name` | String |
| 15 | `currencySymbol` | 币种币符 | `currency_symbol` | String |
| 16 | `defines` | 退换货子表自由自定义项 | `` | 5482234b-2ae2-4b5e-9657-3b7e1756d6ec |
| 17 | `deliveryorderCode` | 原单发货单号 | `deliveryorder_code` | String |
| 18 | `deliveryorderCodeLineNum` | 原单发货单号行号 | `deliveryorder_code_line_num` | String |
| 19 | `deliveryplanCode` | 原单到货计划单号 | `deliveryplan_code` | String |
| 20 | `deliveryplanCodeLineNum` | 原单到货计划行号 | `deliveryplan_code_line_num` | String |
| 21 | `delplanCode` | 原单交货计划单号 | `delplan_code` | String |
| 22 | `delplanCodeLineNum` | 原单交货计划行号 | `delplan_code_line_num` | String |
| 23 | `dr` | 删除标志 | `dr` | Integer |
| 24 | `effectiveDate` | 生效日期 | `effective_date` | DateTime |
| 25 | `expirationDate` | 失效日期 | `expiration_date` | DateTime |
| 26 | `fileId` | 附件 | `fileId` | String |
| 27 | `gmtCreate` | 创建时间 | `gmt_create` | DateTime |
| 28 | `gmtModified` | 修改时间 | `gmt_Modified` | DateTime |
| 29 | `godownCode` | 原单入库单号 | `godown_code` | String |
| 30 | `godownCodeLineNum` | 原单入库单行号 | `godown_code_line_num` | String |
| 31 | `id` | ID | `id` | Long |
| 32 | `isClose` | 是否关闭 | `is_close` | Boolean |
| 33 | `mainMetrologyCode` | 主计量单位编码 | `main_metrology_code` | String |
| 34 | `mainMetrologyId` | 主计量单位主键 | `main_metrology_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 35 | `mainMetrologyName` | 主计量单位名称 | `main_metrology_name` | String |
| 36 | `mainNum` | 退货主数量 | `main_num` | Decimal |
| 37 | `materialCode` | 物料编码 | `material_code` | String |
| 38 | `materialId` | 物料主键 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 39 | `materialModel` | 物料型号 | `material_model` | String |
| 40 | `materialName` | 物料名称 | `material_name` | String |
| 41 | `memo` | 备注 | `memo` | String |
| 42 | `modifier` | 修改人 | `modifier` | String |
| 43 | `orderOtherDetailId` | 退货订单子表id(来源于其他系统) | `order_other_detail_id` | Long |
| 44 | `periodQuality` | 保质期 | `period_quality` | Integer |
| 45 | `periodQualityType` | 保质期间类型（1.月、2.天、3.年） | `period_quality_type` | Integer |
| 46 | `price` | 无税单价 | `price` | Decimal |
| 47 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal |
| 48 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal |
| 49 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal |
| 50 | `priceNum` | 退货计价数量 | `price_num` | Decimal |
| 51 | `productPuType` | 物料采购类型 | `product_pu_type` | String |
| 52 | `projectCode` | 项目编码 | `project_code` | String |
| 53 | `projectId` | 项目档案 | `project_id` | String |
| 54 | `projectName` | 项目名称 | `project_name` | String |
| 55 | `pubts` | 时间戳 | `ts` | DateTime |
| 56 | `purOrderCode` | 原单采购订单号 | `pur_order_code` | String |
| 57 | `purOrderCodeLineNum` | 原单采购订单号行号 | `pur_order_code_line_num` | String |
| 58 | `purOrderDetailId` | 采购订单明细id | `pur_order_detail_id` | Long |
| 59 | `purOrderId` | 采购订单id | `pur_order_id` | Long |
| 60 | `purchaseExchRate` | 采购单位换算率 | `purchase_exch_rate` | Decimal |
| 61 | `purchaseExchRateDen` | 采购单位换算率分母 | `purchase_exch_rateden` | Decimal |
| 62 | `purchaseExchRateNum` | 采购单位换算率分子 | `purchase_exch_ratenum` | Decimal |
| 63 | `purchaseNum` | 退货采购数量 | `purchase_num` | Decimal |
| 64 | `purchaseUnitCode` | 采购单位编码 | `purchase_unit_code` | String |
| 65 | `purchaseUnitId` | 采购业务单位主键 | `purchase_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 66 | `purchaseUnitName` | 采购单位名称 | `purchase_unit_name` | String |
| 67 | `rejectReturnReason` | 拒绝退货理由 | `reject_return_reason` | String |
| 68 | `replenishMainNum` | 需补货主数量 | `replenish_main_num` | Decimal |
| 69 | `replenishPriceNum` | 需补货计价数量 | `replenish_price_num` | Decimal |
| 70 | `replenishPurchaseNum` | 需补货采购数量 | `replenish_purchase_num` | Decimal |
| 71 | `reqOrgId` | 需求组织ID | `req_org_id` | String |
| 72 | `reqOrgName` | 需求组织名称 | `req_org_name` | String |
| 73 | `returnDeptId` | 退货部门 | `return_dept_id` | String |
| 74 | `returnDeptName` | 退货部门名称 | `return_dept_name` | String |
| 75 | `returnInwhnum` | 已退库数量 | `return_inwhnum` | Decimal |
| 76 | `returnMainInwhnum` | 已退库主数量 | `return_main_inwhnum` | Decimal |
| 77 | `returnOrderDetailDefineCharacter` | 自定义项特征属性组 | `define_character` | 795f5adb-78e4-453f-8924-53dc66dfa6bf |
| 78 | `returnOrderDetailFreeCharacteristics` | 自由项特征组实体 | `instance_id` | 64fbb46f-6e17-43d0-86ec-a5a8eb0469dd |
| 79 | `returnOrderId` | 退换货订单主表id | `return_order_id` | 269d16b1-6532-41bb-8388-126162008148 |
| 80 | `returnOrgId` | 退货组织ID | `return_org_id` | String |
| 81 | `returnOrgName` | 退货组织名称 | `return_org_name` | String |
| 82 | `returnPriceInwhnum` | 已退库计价数量 | `return_price_inwhnum` | Decimal |
| 83 | `saleOrderCode` | 原销售订单号 | `sale_order_code` | String |
| 84 | `saleOrderCodeLineNum` | 原销售订单号行号 | `sale_order_code_line_num` | String |
| 85 | `saleOrderDetailId` | 销售订单表体id{cpu_order.cpu_sale_order_detail} | `sale_order_detail_id` | Long |
| 86 | `saleOrderId` | 销售订单id{cpu_order.cpu_sale_order} | `sale_order_id` | Long |
| 87 | `skuCode` | 商品sku的skucode | `sku_code` | String |
| 88 | `skuId` | 物料SKU id {productsku} | `sku_id` | Long |
| 89 | `skuModel` | SKU型号 | `sku_model` | String |
| 90 | `skuName` | SKU名称 | `sku_name` | String |
| 91 | `skuSpec` | SKU规格 | `sku_spec` | String |
| 92 | `skuSpecCode` | SKU规格说明编码 | `sku_spec_code` | String |
| 93 | `tax` | 税额 | `tax` | Decimal |
| 94 | `taxAmount` | 含税金额 | `tax_amount` | Decimal |
| 95 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 96 | `taxrate` | 税率 | `taxrate` | String |
| 97 | `taxrateId` | 税率id | `taxrate_id` | Decimal |
| 98 | `ticketOrgId` | 收票组织ID | `ticket_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 99 | `ticketOrgName` | 收票组织名称 | `ticket_org_name` | String |
| 100 | `unitCode` | 计价单位编码 | `unit_code` | String |
| 101 | `unitId` | 计价单位id | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 102 | `unitName` | 计价单位名称 | `unit_name` | String |
| 103 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 104 | `warehouseKeeperId` | 仓管员 | `warehouse_keeper_id` | Long |
| 105 | `warehouseKeeperName` | 仓管员名称 | `warehouse_keeper_name` | String |
| 106 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 107 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 108 | `wbsName` | WBS任务 | `wbs_name` | String |
| 109 | `ytenant` | 租户编码 | `ytenant_id` | String |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `returnOrderDetailDefineCharacter` | 自定义项特征属性组 | `cpu-order.returnorder.CpuReturnOrderCharacterDefine` | None |  |
| 2 | `purchaseUnitId` | 采购业务单位主键 | `pc.unit.Unit` | Service |  |
| 3 | `activity` | 活动主键 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `returnOrderId` | 退换货订单主表id | `cpu-order.returnorder.CpuReturnOrder` | None | true |
| 5 | `ticketOrgId` | 收票组织ID | `org.func.BaseOrg` | Service |  |
| 6 | `unitId` | 计价单位id | `pc.unit.Unit` | Service |  |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 8 | `returnOrderDetailFreeCharacteristics` | 自由项特征组实体 | `cpu-order.returnorder.CpuReturnOrderCharacteristicsDefine` | None |  |
| 9 | `currencyId` | 币种Id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 10 | `materialId` | 物料主键 | `pc.product.Product` | Service |  |
| 11 | `mainMetrologyId` | 主计量单位主键 | `pc.unit.Unit` | Service |  |
| 12 | `defines` | 退换货子表自由自定义项 | `cpu-order.returnorder.CpuReturnOrderDetailFreeDefine` | None | true |
