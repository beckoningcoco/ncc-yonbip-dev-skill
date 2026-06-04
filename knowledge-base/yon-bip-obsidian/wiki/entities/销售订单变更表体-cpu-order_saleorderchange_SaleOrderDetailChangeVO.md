---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorderchange.SaleOrderDetailChangeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单变更表体 (`cpu-order.saleorderchange.SaleOrderDetailChangeVO`)

> ycSaleCoor | 物理表：`cpu_sale_order_detail_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单变更表体 |
| 物理表 | `cpu_sale_order_detail_change` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:34.9530` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（128个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lineNum` | 行号 | `line_num` | String |
| 2 | `rowConMessage` | 确认状态 | `row_con_message` | String |
| 3 | `saleOrderDetailId` | 销售订单明细主键 | `sale_order_detail_id` | Long |
| 4 | `productSpec` | 规格 | `product_spec` | String |
| 5 | `productModel` | 型号 | `product_model` | String |
| 6 | `productName` | 商品名称+规格参数(sku) | `product_name` | String |
| 7 | `gmtCreate` | 创建时间 | `gmt_create` | DateTime |
| 8 | `orderOtherId` | 采购订单编号 | `order_other_id` | String |
| 9 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 10 | `purChangeId` | 采购订单变更 | `pur_change_id` | Long |
| 11 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 12 | `purDetailChangeId` | 采购订单变更明细 | `pur_detail_change_id` | Long |
| 13 | `materialCode` | 物料编码 | `material_code` | String |
| 14 | `ts` | 时间戳 | `ts` | DateTime |
| 15 | `source` | 上游单据类型 | `source` | String |
| 16 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 17 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 18 | `rowRefReaStatus` | 表体拒绝理由状态 | `row_ref_rea_status` | String |
| 19 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 20 | `fileId` | 附件 | `fileId` | String |
| 21 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 22 | `ytenant` | 租户编码 | `ytenant_id` | String |
| 23 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 24 | `lineno` | 行号 | `lineno` | Decimal |
| 25 | `upcode` | 上游单据号 | `upcode` | String |
| 26 | `productDescribe` | 物料描述 | `product_describe` | String |
| 27 | `requireBrand` | 要求品牌 | `require_brand` | String |
| 28 | `ticketOrgId` | 收票组织 | `ticket_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 29 | `taxType` | 扣税类别 | `tax_type` | String |
| 30 | `giftsFlag` | 赠品 | `gifts_flag` | String |
| 31 | `confirmBrand` | 确认品牌 | `confirm_brand` | String |
| 32 | `priceMark` | 价格标识 | `price_mark` | String |
| 33 | `projectName` | 项目名称 | `project_name` | String |
| 34 | `purchaseNum` | 需求采购数量 | `purchase_num` | Decimal |
| 35 | `purOrderId` | 附件 | `pur_order_id` | Long |
| 36 | `purchaseUnitName` | 采购单位 | `purchase_unit_name` | String |
| 37 | `purchaseExchRate` | 采购换算率 | `purchase_exch_rate` | Decimal |
| 38 | `mainNum` | 需求主数量 | `main_num` | Decimal |
| 39 | `mainMetrologyName` | 主计量单位 | `main_metrology_name` | String |
| 40 | `quantity` | 需求计价数量 | `quantity` | Decimal |
| 41 | `unit` | 计价单位 | `unit` | String |
| 42 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal |
| 43 | `upperLimitRatio` | 超发上限比例(%) | `upper_limit_ratio` | Decimal |
| 44 | `productIid` | 附件(物料附件) | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 45 | `conQuantity` | 确认计价数量 | `con_quantity` | Decimal |
| 46 | `purOrderDetailId` | 采购订单明细id | `pur_order_detail_id` | Long |
| 47 | `buyofferdetailid` | 询价单id | `buyofferdetailid` | Long |
| 48 | `financeOrg` | 财务组织 | `finance_org` | String |
| 49 | `saleOrderDetailDefineCharacter` | 自定义项特征组 | `defineCharacter` | 02134504-cdcc-4e59-b492-be1074d4fcc1 |
| 50 | `saleOrderDetailFreeCharacteristics` | 自由项特征组 | `instance_id` | 2196ebc0-7d28-4f26-b341-a9074a79291b |
| 51 | `price` | 无税单价 | `price` | Decimal |
| 52 | `contractMaterialId` | 采购合同物料id | `contractMaterial_id` | Long |
| 53 | `floatMoney` | 含税单价浮动金额 | `float_money` | Decimal |
| 54 | `floatProp` | 含税单价浮动比例(%) | `float_prop` | String |
| 55 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 56 | `taxrate` | 税率% | `taxrate` | Decimal |
| 57 | `amount` | 无税金额 | `amount` | Decimal |
| 58 | `taxAmount` | 含税金额 | `tax_amount` | Decimal |
| 59 | `conPrice` | 确认无税单价 | `con_price` | Decimal |
| 60 | `conTaxPrice` | 确认含税单价 | `con_tax_price` | Decimal |
| 61 | `planDeliverDate` | 交货日期 | `plan_deliver_date` | DateTime |
| 62 | `confirmArriveDate` | 确认到货日期 | `confirm_arrive_date` | DateTime |
| 63 | `recv_orgname` | 收货组织 | `recv_orgname` | String |
| 64 | `deliverAddress` | 收货地址 | `deliver_address` | String |
| 65 | `recPeople` | 收货人 | `rec_people` | String |
| 66 | `contactWay` | 收货人联系方式 | `contact_way` | String |
| 67 | `contractRowNum` | 合同行号 | `contract_rownum` | Long |
| 68 | `recvstor` | 收货仓库 | `recvstor` | String |
| 69 | `contractBillno` | 合同 | `contract_billno` | String |
| 70 | `memo` | 备注 | `memo` | String |
| 71 | `actualMoney` | 实价 | `actual_money` | Decimal |
| 72 | `benchmarkType` | 基准价参考 | `benchmark_type` | String |
| 73 | `isArrivePlan` | 是否到货计划 | `is_arrive_plan` | Boolean |
| 74 | `settlementType` | 结算基准日 | `settlement_type` | String |
| 75 | `refArea` | 参考地区 | `ref_area` | String |
| 76 | `id` | ID | `id` | Long |
| 77 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 78 | `productPuType` | 采购类型 | `product_pu_type` | String |
| 79 | `rowRefuseReason` | 理由说明 | `row_refuse_reason` | String |
| 80 | `unitid` | 外系统过来的物料单位ID | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 81 | `unitCode` | 计价单位code | `unit_code` | String |
| 82 | `saleOrderChangeId` | 销售订单变更id | `sale_order_change_id` | 885ed154-e570-4cd5-a2ac-d9fdbe34f93d |
| 83 | `pricedecisionid` | 定价单主表id | `pricedecisionid` | Long |
| 84 | `pricedecidetailid` | 定价单子表id | `pricedecidetailid` | Long |
| 85 | `pritemId` | 需求单的id | `pritemid` | String |
| 86 | `skuId` | 物料SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 87 | `reqOrgId` | 需求组织ID | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 88 | `materialBrand` | 物料品牌 | `material_brand` | String |
| 89 | `recv_org` | 收货组织ID | `recv_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 90 | `blargess` | 赠品 | `blargess` | Boolean |
| 91 | `materialclassId` | 物料分类 | `materialclass_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 92 | `materialclassName` | 物料分类名称 | `materialclass_name` | String |
| 93 | `materialclassCode` | 物料分类编码 | `materialclass_code` | String |
| 94 | `receivePersonId` | 收货人 | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 95 | `reqDate` | 需求时间 | `req_date` | DateTime |
| 96 | `requireBrandId` | 要求品牌品牌id | `require_brand_id` | Long |
| 97 | `tax` | 税额 | `tax` | Decimal |
| 98 | `contractId` | 采购合同id | `contract_id` | Long |
| 99 | `projectId` | 项目档案id | `project_id` | Long |
| 100 | `projectCode` | 项目编码 | `project_code` | String |
| 101 | `purchaseUnitId` | 采购单位 | `purchase_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 102 | `purchaseUnitCode` | 采购单位code | `purchase_unit_code` | String |
| 103 | `mainMetrologyId` | 主单位id | `main_metrology_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 104 | `mainMetrologyCode` | 主单位code | `main_metrology_code` | String |
| 105 | `confirmBrandId` | 确认品牌品牌id | `confirm_brand_id` | Long |
| 106 | `closeOrderReason` | 订单关闭理由 | `close_order_reason` | String |
| 107 | `isNeedLetPass` | 是否需放行验收 | `is_need_letpass` | Boolean |
| 108 | `letPassType` | 放行类型 | `letpass_type` | String |
| 109 | `taxRateId` | 税目 | `taxrate_id` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 |
| 110 | `signatory` | 签收方 | `signatory` | String |
| 111 | `outsourcerId` | 委外商主键 | `outsourcer_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 112 | `outsourcer` | 委外商 | `outsourcer` | String |
| 113 | `isOutsourceCollaborate` | 是否与委外商协同 | `is_outsource_collaborate` | Boolean |
| 114 | `commodityUnit` | 商品单位 | `commodity_unit` | String |
| 115 | `defines` | 销售订单变更表体自定义项 | `` | 8b198148-5f7f-46b6-b37c-76cabc84c8cd |
| 116 | `detailParallel` | 销售订单变更子表平行表 | `` | 2365c3ca-4f38-41c7-844a-5bbf8ad63a23 |
| 117 | `isServiceMaterial` | 物料类型 | `is_service_material` | Integer |
| 118 | `mallOrderDetailId` | 超市订单id | `mall_order_detail_id` | a6cf30ba-d19e-40fb-83d2-615ee56f6f85 |
| 119 | `mallOrderId` | 超市订单id | `mall_order_id` | a5e54491-d54a-45d6-9800-4557b5d7b306 |
| 120 | `paymentProgressACKs` | 销售订单进度确认执行变更孙表 | `` | 6f947988-dc5a-4e11-ac8f-dce1445edd49 |
| 121 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal |
| 122 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal |
| 123 | `pubts` | 时间戳 | `ts` | DateTime |
| 124 | `purchaseExchRateDen` | 采购换算率分母 | `purchase_exch_rateden` | Decimal |
| 125 | `purchaseExchRateNum` | 采购换算率分子 | `purchase_exch_ratenum` | Decimal |
| 126 | `recvstorId` | 仓库档案ID | `recvstor_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 127 | `targetBillId` | 目标单据id | `target_bill_Id` | String |
| 128 | `targetDetailBillId` | 目标单据子表id | `target_detail_bill_id` | String |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mallOrderId` | 超市订单id | `mall.mallofficeorder.MallOrder` | Service |  |
| 2 | `purchaseUnitId` | 采购单位 | `pc.unit.Unit` | Service |  |
| 3 | `saleOrderChangeId` | 销售订单变更id | `cpu-order.saleorderchange.SaleOrderChangeVO` | None | true |
| 4 | `paymentProgressACKs` | 销售订单进度确认执行变更孙表 | `cpu-order.saleorderchange.SaleOrdersPaymentProgressAckChange` | None | true |
| 5 | `productIid` | 附件(物料附件) | `pc.product.Product` | Service |  |
| 6 | `mallOrderDetailId` | 超市订单id | `mall.mallofficeorder.OrderDetail` | Service |  |
| 7 | `mainMetrologyId` | 主单位id | `pc.unit.Unit` | Service |  |
| 8 | `defines` | 销售订单变更表体自定义项 | `cpu-order.saleorderchange.SaleOrderDetailChangeVODefine` | None | true |
| 9 | `receivePersonId` | 收货人 | `bd.staff.Staff` | Service |  |
| 10 | `saleOrderDetailFreeCharacteristics` | 自由项特征组 | `cpu-order.saleorderchange.SaleOrderChangeCharacteristicsDefine` | None |  |
| 11 | `saleOrderDetailDefineCharacter` | 自定义项特征组 | `cpu-order.saleorderchange.SaleOrderChangeCharacterDefine` | None |  |
| 12 | `ticketOrgId` | 收票组织 | `org.func.BaseOrg` | Service |  |
| 13 | `unitid` | 外系统过来的物料单位ID | `pc.unit.Unit` | Service |  |
| 14 | `materialclassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 15 | `outsourcerId` | 委外商主键 | `aa.vendor.Vendor` | Service |  |
| 16 | `reqOrgId` | 需求组织ID | `org.func.BaseOrg` | Service |  |
| 17 | `taxRateId` | 税目 | `bd.taxrate.TaxRateVO` | Service |  |
| 18 | `recv_org` | 收货组织ID | `org.func.BaseOrg` | Service |  |
| 19 | `detailParallel` | 销售订单变更子表平行表 | `cpu-order.saleorderchange.SaleOrderDetailParallelChangeVO` | None | true |
| 20 | `recvstorId` | 仓库档案ID | `aa.warehouse.Warehouse` | Service |  |
| 21 | `skuId` | 物料SKU | `pc.product.ProductSKU` | Service |  |
