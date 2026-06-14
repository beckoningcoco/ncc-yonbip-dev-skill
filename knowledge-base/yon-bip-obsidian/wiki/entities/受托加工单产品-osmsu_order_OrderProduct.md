---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "osmsu.order.OrderProduct"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 受托加工单产品 (`osmsu.order.OrderProduct`)

> ycSaleCoor | 物理表：`osmsu_order_product`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 受托加工单产品 |
| 物理表 | `osmsu_order_product` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:50.3240` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（160个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `lineNo` | 行号 | `line_no` | Decimal |
| 3 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 4 | `bomId` | bomId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 5 | `subcontractQuantitySU` | 委外数量 | `subcontract_quantity_su` | Decimal |
| 6 | `sellerConfirmNo` | 确认委外数量 | `seller_confirm_no` | Decimal |
| 7 | `subcontractUnitId` | 委外单位id | `subcontract_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 8 | `changeRate` | 委外换算率 | `change_rate` | Decimal |
| 9 | `subcontractQuantityPU` | 计价数量 | `subcontract_quantity_pu` | Decimal |
| 10 | `productModel` | 型号 | `product_model` | String |
| 11 | `purContractNo` | 采购合同号 | `pur_contract_no` | String |
| 12 | `wbs` | WBS任务Id | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 13 | `wbsName` | WBS任务 | `wbs_name` | String |
| 14 | `lineAttachId` | 附件 | `line_attach_id` | String |
| 15 | `isArrivePlan` | 是否到货计划 | `is_arrive_plan` | Short |
| 16 | `isSupPullDelplan` | 允许供应商发起交货计划 | `is_sup_pull_delplan` | Short |
| 17 | `hasArrivePlan` | 有到货计划 | `has_arrive_plan` | Short |
| 18 | `signType` | 签收方 | `sign_type` | Integer |
| 19 | `tenant` | 租户ID | `tenant_id` | String |
| 20 | `mainUnitId` | 主计量id | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 21 | `activityName` | 活动 | `activity_name` | String |
| 22 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 23 | `mainUnitName` | 主计量名称 | `main_unit_name` | String |
| 24 | `rcvVendor` | 收货委外商 | `rcv_vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 25 | `ctId` | 自定义项特征组id | `ct_id` | ba1a9284-e882-486a-a986-661743ea7bcf |
| 26 | `activity` | 活动id | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 27 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 28 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |
| 30 | `requireSign` | 需要与签收方协同 | `require_sign` | Boolean |
| 31 | `signerEnterpriseId` | 签收方企业 | `signer_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 32 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 33 | `materialCode` | 物料编码 | `material_code` | String |
| 34 | `signerTenant` | 签收方租户 | `signer_tenant` | String |
| 35 | `dctId` | 自由项特征组id | `dct_id` | 8159541a-f082-4a54-9c89-5a249b5ac4a0 |
| 36 | `operationCode` | 工序编码 | `operation_code` | String |
| 37 | `source` | 上游单据类型 | `source` | String |
| 38 | `define30` | 自定义项30 | `define30` | String |
| 39 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 40 | `activityCode` | 活动编码 | `activity_code` | String |
| 41 | `define27` | 自定义项27 | `define27` | String |
| 42 | `define28` | 自定义项28 | `define28` | String |
| 43 | `define29` | 自定义项29 | `define29` | String |
| 44 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 45 | `orgName` | 收货组织 | `org_ame` | String |
| 46 | `rcvCustomer` | 收货客户 | `rcv_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 47 | `subcontractUnitName` | 委外单位 | `subcontract_unit_name` | String |
| 48 | `ulRate` | 超发上限比例 | `ul_rate` | Decimal |
| 49 | `rcvAddrType` | 收货地址类型 | `rcv_addr_type` | Integer |
| 50 | `materialName` | 物料名称 | `material_name` | String |
| 51 | `ntaxrate` | 税率 | `ntaxrate` | Decimal |
| 52 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 53 | `projectName` | 项目名称 | `project_name` | String |
| 54 | `define2` | 自定义项2 | `define2` | String |
| 55 | `define1` | 自定义项1 | `define1` | String |
| 56 | `define12` | 自定义项12 | `define12` | String |
| 57 | `define9` | 自定义项9 | `define9` | String |
| 58 | `define13` | 自定义项13 | `define13` | String |
| 59 | `define8` | 自定义项8 | `define8` | String |
| 60 | `define14` | 自定义项14 | `define14` | String |
| 61 | `linecloseDate` | 行关闭日期 | `lineclose_date` | DateTime |
| 62 | `define7` | 自定义项7 | `define7` | String |
| 63 | `define15` | 自定义项15 | `define15` | String |
| 64 | `define6` | 自定义项6 | `define6` | String |
| 65 | `define5` | 自定义项5 | `define5` | String |
| 66 | `define4` | 自定义项4 | `define4` | String |
| 67 | `define10` | 自定义项10 | `define10` | String |
| 68 | `define3` | 自定义项3 | `define3` | String |
| 69 | `define11` | 自定义项11 | `define11` | String |
| 70 | `productModelDescription` | 规格 | `product_model_description` | String |
| 71 | `linecloser` | 行关闭人 | `linecloser` | String |
| 72 | `purContractId` | 采购合同Id | `pur_contract_id` | Long |
| 73 | `taxRateName` | 税率名称 | `tax_rate_name` | String |
| 74 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 75 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 76 | `define23` | 自定义项23 | `define23` | String |
| 77 | `define24` | 自定义项24 | `define24` | String |
| 78 | `define25` | 自定义项25 | `define25` | String |
| 79 | `operationName` | 工序名称 | `operation_name` | String |
| 80 | `define26` | 自定义项26 | `define26` | String |
| 81 | `define20` | 自定义项20 | `define20` | String |
| 82 | `arriveClose` | 到货关闭 | `arrive_close` | Short |
| 83 | `define21` | 自定义项21 | `define21` | String |
| 84 | `define22` | 自定义项22 | `define22` | String |
| 85 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 86 | `define16` | 自定义项16 | `define16` | String |
| 87 | `define17` | 自定义项17 | `define17` | String |
| 88 | `define18` | 自定义项18 | `define18` | String |
| 89 | `define19` | 自定义项19 | `define19` | String |
| 90 | `upcode` | 上游单据号 | `upcode` | String |
| 91 | `priceUnitId` | 计价单位id | `price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 92 | `subcontractToPrice` | 计价换算率 | `subcontract_to_price` | Decimal |
| 93 | `subcontractMainQuantitySU` | 委外主数量 | `subcontract_main_quantity_su` | Decimal |
| 94 | `oriTaxUnitPrice` | 含税单价 | `oritax_unit_price` | Decimal |
| 95 | `sellerConfirmPrice` | 确认含税单价 | `seller_confirm_price` | Decimal |
| 96 | `oriUnitPrice` | 无税单价 | `ori_unit_price` | Decimal |
| 97 | `sellerConfirmNotaxPrice` | 确认无税单价 | `seller_confirm_notax_price` | Decimal |
| 98 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String |
| 99 | `taxRateId` | 税率id | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 100 | `netMoneyTC` | 无税金额 | `netmoney_tc` | Decimal |
| 101 | `oriSum` | 含税金额 | `ori_sum` | Decimal |
| 102 | `taxTC` | 税额 | `tax_tc` | Decimal |
| 103 | `deliveryDate` | 交货日期 | `delivery_date` | Date |
| 104 | `sellerConfirmDate` | 卖方确认交期 | `seller_confirm_date` | DateTime |
| 105 | `orgId` | 收货组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 106 | `warehouseAddress` | 收货地址 | `warehouse_address` | String |
| 107 | `isPresent` | 赠品 | `is_present` | Boolean |
| 108 | `sellerMemo` | 卖方备注 | `seller_memo` | String |
| 109 | `buyerMemo` | 买方备注 | `buyer_memo` | String |
| 110 | `invoicedQuantity` | 已发货数量 | `invoiced_quantity` | Decimal |
| 111 | `invoicedMainQuantity` | 已发货主数量 | `invoiced_main_quantity` | Decimal |
| 112 | `invoicedPriceQuantity` | 已发货计价数量 | `invoiced_price_quantity` | Decimal |
| 113 | `invoicedPublishedQuantity` | 发货已发布数量 | `invoiced_published_quantity` | Decimal |
| 114 | `invoicedPublishedMainQuantity` | 发货已发布主数量 | `invoiced_published_main_quantity` | Decimal |
| 115 | `invoicedPublishedPriceQuantity` | 发货已发布计价数量 | `invoiced_published_price_quantity` | Decimal |
| 116 | `acceptQuantity` | 累计实收数量 | `accept_quantity` | Decimal |
| 117 | `acceptMainQuantity` | 累计实收主数量 | `accept_main_quantity` | Decimal |
| 118 | `refuseQuantity` | 累计拒收数量 | `refuse_quantity` | Decimal |
| 119 | `refuseMainQuantity` | 累计拒收主数量 | `refuse_main_quantity` | Decimal |
| 120 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 121 | `replenishMainQuantity` | 拒收需补货主数量 | `replenish_main_quantity` | Decimal |
| 122 | `incomingQuantity` | 累计入库主数量 | `incoming_quantity` | Decimal |
| 123 | `incomingMainQuantity` | 累计入库主数量 | `incoming_main_quantity` | Decimal |
| 124 | `returnQuantity` | 累计退货数量 | `return_quantity` | Decimal |
| 125 | `returnMainQuantity` | 累计退货主数量 | `return_main_quantity` | Decimal |
| 126 | `lineCloseStatus` | 行关闭状态 | `line_close_status` | Integer |
| 127 | `lineCloseReason` | 行关闭原因 | `line_close_reason` | String |
| 128 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 129 | `orderId` | 受托加工单id | `order_id` | cdf60441-7279-4389-b801-45e77f50dbae |
| 130 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String |
| 131 | `sourceBillId` | 来源单据id | `source_bill_id` | Long |
| 132 | `sourceBillNo` | 来源单据号 | `source_bill_no` | String |
| 133 | `sourceBillRowId` | 来源单据子表id | `source_bill_row_id` | Long |
| 134 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 135 | `projectId` | 项目id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 136 | `free1` | 产品规格1 | `free1` | String |
| 137 | `free2` | 产品规格2 | `free2` | String |
| 138 | `free3` | 产品规格3 | `free3` | String |
| 139 | `free4` | 产品规格4 | `free4` | String |
| 140 | `free5` | 产品规格5 | `free5` | String |
| 141 | `free6` | 产品规格6 | `free6` | String |
| 142 | `free7` | 产品规格7 | `free7` | String |
| 143 | `free8` | 产品规格8 | `free8` | String |
| 144 | `free9` | 产品规格9 | `free9` | String |
| 145 | `free10` | 产品规格10 | `free10` | String |
| 146 | `changeRateDen` | 委外换算率分母 | `change_rateden` | Decimal |
| 147 | `changeRateNum` | 委外换算率分子 | `change_ratenum` | Decimal |
| 148 | `mainActualNum` | 实际到货主数量 | `main_actual_num` | Decimal |
| 149 | `maindiffActualNum` | 实际到货差异主数量 | `main_diff_actual_num` | Decimal |
| 150 | `orderByProduct` | 受托加工单联副产品 | `` | cb3a1d7c-bdbd-4fd0-ab2d-42a00bd5505c |
| 151 | `orderMaterial` | 受托加工单材料 | `` | f6928505-dec5-43c4-bc70-76c30b7b791e |
| 152 | `orderProcess` | 受托加工单工序 | `` | 0fd0e017-0099-404a-8973-0cf9c86a7f3b |
| 153 | `orderProductAttrextItem` | 产品表自由自定义项 | `` | ba068474-0085-468d-b9d4-52bd526736bb |
| 154 | `orderProductUserdefItem` | 产品表固定自定义项 | `` | 339ce9c1-da46-40e0-9e20-b4e8a6565a2b |
| 155 | `priceActualNum` | 实际到货计价数量 | `price_actual_num` | Decimal |
| 156 | `pricediffActualNum` | 实际到货差异计价数量 | `price_diff_actual_num` | Decimal |
| 157 | `purchaseActualNum` | 实际到货采购数量 | `purchase_actual_num` | Decimal |
| 158 | `purchasediffActualNum` | 实际到货差异采购数量 | `purchase_diff_actual_num` | Decimal |
| 159 | `subcontractToPriceDen` | 计价换算率分母 | `subcontract_to_priceden` | Decimal |
| 160 | `subcontractToPriceNum` | 计价换算率分子 | `subcontract_to_pricenum` | Decimal |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `priceUnitId` | 计价单位id | `pc.unit.Unit` | Service |  |
| 2 | `bomId` | bomId | `ed.bom.Bom` | Service |  |
| 3 | `ctId` | 自定义项特征组id | `osmsu.order.OrderProductCt` | None |  |
| 4 | `orderProductAttrextItem` | 产品表自由自定义项 | `osmsu.order.OrderProductAttrextItem` | None | true |
| 5 | `activity` | 活动id | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 7 | `orderId` | 受托加工单id | `osmsu.order.Order` | None | true |
| 8 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 9 | `rcvCustomer` | 收货客户 | `aa.merchant.Merchant` | Service |  |
| 10 | `subcontractUnitId` | 委外单位id | `pc.unit.Unit` | Service |  |
| 11 | `wbs` | WBS任务Id | `BGDM.wbs.wbs_doc` | Service |  |
| 12 | `orgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 13 | `orderMaterial` | 受托加工单材料 | `osmsu.order.OrderMaterial` | None | true |
| 14 | `orderProductUserdefItem` | 产品表固定自定义项 | `osmsu.order.OrderProductUserdefItem` | None | true |
| 15 | `orderProcess` | 受托加工单工序 | `osmsu.order.OrderProcess` | None | true |
| 16 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 17 | `orderByProduct` | 受托加工单联副产品 | `osmsu.order.OrderByProduct` | None | true |
| 18 | `taxRateId` | 税率id | `archive.taxArchives.TaxRateArchive` | Service |  |
| 19 | `projectId` | 项目id | `bd.project.ProjectVO` | Service |  |
| 20 | `rcvVendor` | 收货委外商 | `aa.vendor.Vendor` | Service |  |
| 21 | `dctId` | 自由项特征组id | `osmsu.order.OrderProductDct` | None |  |
| 22 | `mainUnitId` | 主计量id | `pc.unit.Unit` | Service |  |
| 23 | `signerEnterpriseId` | 签收方企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
