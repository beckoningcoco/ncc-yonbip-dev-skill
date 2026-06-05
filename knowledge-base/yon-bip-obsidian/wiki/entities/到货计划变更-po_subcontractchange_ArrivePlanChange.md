---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.ArrivePlanChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 到货计划变更 (`po.subcontractchange.ArrivePlanChange`)

> OSM | 物理表：`osm_arrive_plan_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 到货计划变更 |
| 物理表 | `osm_arrive_plan_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:10.4390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 到货计划变更id |

---

## 直接属性（78个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `acceptQuantity` | 累计实收数量 | `accept_quantity` | Decimal |
| 2 | `acceptSubQuantity` | 累计实收件数 | `accept_sub_quantity` | Decimal |
| 3 | `arriveQuantity` | 累计到货数量 | `arrive_quantity` | Decimal |
| 4 | `arriveSubQuantity` | 累计到货件数 | `arrive_sub_quantity` | Decimal |
| 5 | `auxilaryWarehousingQuantity` | 累计入库件数 | `auxilary_warehousing_quantity` | Decimal |
| 6 | `batchNo` | 批次号 | `batch_no` | String |
| 7 | `batchnoid` | 批次参照 | `batchnoid` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 8 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 9 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 10 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 11 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 12 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 13 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 14 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 15 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 16 | `closer` | 关闭人名称 | `closer` | String |
| 17 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `confirmAuxQuantity` | 确认件数 | `confirm_aux_qty` | Decimal |
| 19 | `confirmDeliveryDate` | 确认交期 | `confirm_delivery_date` | Date |
| 20 | `confirmQuantity` | 确认数量 | `confirm_qty` | Decimal |
| 21 | `confirmStatus` | 确认状态 | `confirm_status` | Integer |
| 22 | `consultStatus` | 协同状态 | `consult_status` | Integer |
| 23 | `createDate` | 创建日期 | `create_date` | Date |
| 24 | `createTime` | 创建时间 | `create_time` | DateTime |
| 25 | `creator` | 创建人名称 | `creator` | String |
| 26 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | d850c45f-bae4-495f-9d66-351e46e66242 |
| 28 | `deliveryAuxiliaryQuantity` | 计划到货件数 | `delivery_auxiliary_quantity` | Decimal |
| 29 | `deliveryDate` | 计划到货日期 | `delivery_date` | Date |
| 30 | `deliveryPlanId` | 交货计划id | `delivery_plan_id` | Long |
| 31 | `deliveryPlanNo` | 交货计划单号  | `delivery_plan_no` | String |
| 32 | `deliveryQuantity` | 计划到货数量 | `delivery_quantity` | Decimal |
| 33 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 34 | `freeCharacteristics` | 自由项特征组 | `free_cts` | c832ab3b-4dda-4ddd-a60e-ce0e8d2513b3 |
| 35 | `id` | 到货计划变更id | `id` | Long |
| 36 | `initiator` | 发起方 | `initiator` | Integer |
| 37 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 38 | `lineNo` | 行号 | `line_no` | Decimal |
| 39 | `mainUnitId` | 主单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 40 | `modifier` | 修改人名称 | `modifier` | String |
| 41 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 42 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 43 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 44 | `orderByproductId` | 委外订单联副变更ID | `order_byproduct_id` | 9c8336c4-8fb2-48e2-94b6-927b809815a0 |
| 45 | `orderId` | 委外订单变更ID | `order_id` | dadfc2eb-7638-4b21-95b9-e274fb4fe84d |
| 46 | `orderProductId` | 委外订单产品变更ID | `order_product_id` | 874c6c6f-0c0e-4582-800e-77098c273c53 |
| 47 | `originalByproductId` | 源订单联副产品ID | `original_byproduct_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 48 | `originalId` | 原到货计划id | `original_id` | 0ded6928-4faa-46fc-9ff1-ee1a5d02f189 |
| 49 | `originalOrderId` | 源订单ID | `original_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 50 | `originalProductId` | 源订单产品ID | `original_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 51 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 52 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 53 | `priceUnitId` | 计价单位 | `price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 54 | `produceDate` | 生产日期 | `produce_date` | Date |
| 55 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 56 | `productionType` | 产出类型 | `production_type` | String |
| 57 | `pubts` | 时间戳 | `pubts` | DateTime |
| 58 | `rcvOrgId` | 收货组织 | `rcv_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 59 | `refuseQuantity` | 累计拒收数量 | `refuse_quantity` | Decimal |
| 60 | `refuseSubQuantity` | 累计拒收件数 | `refuse_sub_quantity` | Decimal |
| 61 | `remark` | 备注 | `remark` | String |
| 62 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 63 | `replenishSubQuantity` | 拒收需补货件数 | `replenish_sub_quantity` | Decimal |
| 64 | `requireConfirm` | 需要委外商确认 | `require_confirm` | Boolean |
| 65 | `requireConsult` | 需要与委外商协同 | `require_consult` | Boolean |
| 66 | `saleRemark` | 理由 | `sale_remark` | String |
| 67 | `status` | 状态 | `status` | String |
| 68 | `subcontractQuantityPU` | 计价数量 | `subcontract_quantity_pu` | Decimal |
| 69 | `subcontractToPrice` | 计价换算率 | `subcontract_to_price` | Decimal |
| 70 | `subcontractToPriceDen` | 计价换算率分母 | `subcontract_to_priceden` | Decimal |
| 71 | `subcontractToPriceNum` | 计价换算率分子 | `subcontract_to_pricenum` | Decimal |
| 72 | `subcontractUnitId` | 委外单位 | `subcontract_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 73 | `subcontractVendorId` | 委外供应商ID | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 74 | `vendorEnterpriseId` | 委外商企业 | `vendor_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 75 | `vendorTenant` | 委外商租户 | `vendor_tenant` | String |
| 76 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 77 | `warehousingQuantity` | 累计入库数量 | `warehousing_quantity` | Decimal |
| 78 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（24个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `priceUnitId` | 计价单位 | `pc.unit.Unit` | Service |  |
| 2 | `batchnoid` | 批次参照 | `st.batchno.Batchno` | Service |  |
| 3 | `rcvOrgId` | 收货组织 | `aa.baseorg.OrgMV` | Service |  |
| 4 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 5 | `orderId` | 委外订单变更ID | `po.subcontractchange.OsmOrderChange` | None | true |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `subcontractUnitId` | 委外单位 | `pc.unit.Unit` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 11 | `orderProductId` | 委外订单产品变更ID | `po.subcontractchange.OsmOrderProductChange` | None |  |
| 12 | `subcontractVendorId` | 委外供应商ID | `aa.vendor.Vendor` | Service |  |
| 13 | `originalByproductId` | 源订单联副产品ID | `po.order.OrderByProduct` | None |  |
| 14 | `defineCharacteristics` | 自定义项特征组 | `po.subcontractchange.ArrivePlanChangeDefineCharacteristics` | None |  |
| 15 | `freeCharacteristics` | 自由项特征组 | `po.subcontractchange.ArrivePlanChangeFreeCharacteristics` | None |  |
| 16 | `originalOrderId` | 源订单ID | `po.order.Order` | None |  |
| 17 | `originalProductId` | 源订单产品ID | `po.order.OrderProduct` | None |  |
| 18 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 19 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 20 | `vendorEnterpriseId` | 委外商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 21 | `orderByproductId` | 委外订单联副变更ID | `po.subcontractchange.OsmOrderByProductChange` | None |  |
| 22 | `originalId` | 原到货计划id | `po.order.ArrivePlan` | None |  |
| 23 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 24 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
