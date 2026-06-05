---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.ArrivePlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外到货安排 (`osm.OSMOrder.ArrivePlan`)

> OSM | 物理表：`osm_arrive_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外到货安排 |
| 物理表 | `osm_arrive_plan` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:16.5510` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（74个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lineNo` | 行号 | `line_no` | Decimal |
| 2 | `orderId` | 委外订单ID | `order_id` | 823b74a3-0ec8-440f-91a3-fdf94ae2f1bd |
| 3 | `orderProductId` | 委外订单产品行ID | `order_product_id` | 7d39c327-90bf-4f63-b030-c953035dd99e |
| 4 | `productionType` | 产出类型 | `production_type` | String |
| 5 | `orderByproductId` | 联副产品ID | `order_byproduct_id` | 815c3a03-9e21-40c0-baa1-08961b64fc38 |
| 6 | `subcontractVendorId` | 委外供应商ID | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 7 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `requireConsult` | 需要与委外商协同 | `require_consult` | Boolean |
| 9 | `requireConfirm` | 需要委外商确认 | `require_confirm` | Boolean |
| 10 | `consultStatus` | 协同状态 | `consult_status` | Integer |
| 11 | `vendorTenant` | 委外商租户 | `vendor_tenant` | String |
| 12 | `vendorEnterpriseId` | 委外商企业 | `vendor_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 13 | `confirmDeliveryDate` | 确认交期 | `confirm_delivery_date` | Date |
| 14 | `confirmQuantity` | 确认数量 | `confirm_qty` | Decimal |
| 15 | `confirmAuxQuantity` | 确认件数 | `confirm_aux_qty` | Decimal |
| 16 | `saleRemark` | 理由 | `sale_remark` | String |
| 17 | `deliveryPlanId` | 交货计划id | `delivery_plan_id` | Long |
| 18 | `deliveryPlanNo` | 交货计划单号  | `delivery_plan_no` | String |
| 19 | `initiator` | 发起方 | `initiator` | Integer |
| 20 | `confirmStatus` | 确认状态 | `confirm_status` | Integer |
| 21 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 22 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 23 | `closer` | 关闭人名称 | `closer` | String |
| 24 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 26 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 27 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 28 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 29 | `freeCharacteristics` | 自由项特征组 | `free_cts` | d7d80da7-ec53-4b53-ae46-608c11c0fbd5 |
| 30 | `deliveryQuantity` | 计划到货数量 | `delivery_quantity` | Decimal |
| 31 | `deliveryAuxiliaryQuantity` | 计划到货件数 | `delivery_auxiliary_quantity` | Decimal |
| 32 | `mainUnitId` | 主单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 33 | `subcontractUnitId` | 委外单位 | `subcontract_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 34 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 35 | `subcontractToPrice` | 计价换算率 | `subcontract_to_price` | Decimal |
| 36 | `subcontractQuantityPU` | 计价数量 | `subcontract_quantity_pu` | Decimal |
| 37 | `priceUnitId` | 计价单位 | `price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 38 | `deliveryDate` | 计划到货日期 | `delivery_date` | Date |
| 39 | `rcvOrgId` | 收货组织 | `rcv_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 40 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 41 | `batchnoid` | 批次参照 | `batchnoid` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 42 | `batchNo` | 批次号 | `batch_no` | String |
| 43 | `status` | 状态 | `status` | String |
| 44 | `remark` | 备注 | `remark` | String |
| 45 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | 43244b98-51a7-409b-9472-43aa45cb6e4f |
| 46 | `arriveQuantity` | 累计到货数量 | `arrive_quantity` | Decimal |
| 47 | `arriveSubQuantity` | 累计到货件数 | `arrive_sub_quantity` | Decimal |
| 48 | `acceptQuantity` | 累计实收数量 | `accept_quantity` | Decimal |
| 49 | `acceptSubQuantity` | 累计实收件数 | `accept_sub_quantity` | Decimal |
| 50 | `refuseQuantity` | 累计拒收数量 | `refuse_quantity` | Decimal |
| 51 | `refuseSubQuantity` | 累计拒收件数 | `refuse_sub_quantity` | Decimal |
| 52 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 53 | `replenishSubQuantity` | 拒收需补货件数 | `replenish_sub_quantity` | Decimal |
| 54 | `warehousingQuantity` | 累计入库数量 | `warehousing_quantity` | Decimal |
| 55 | `auxilaryWarehousingQuantity` | 累计入库件数 | `auxilary_warehousing_quantity` | Decimal |
| 56 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 57 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 58 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 59 | `createTime` | 创建时间 | `create_time` | DateTime |
| 60 | `createDate` | 创建日期 | `create_date` | Date |
| 61 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 62 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 63 | `creator` | 创建人名称 | `creator` | String |
| 64 | `modifier` | 修改人名称 | `modifier` | String |
| 65 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 66 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 67 | `produceDate` | 生产日期 | `produce_date` | Date |
| 68 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 69 | `id` | ID | `id` | Long |
| 70 | `pubts` | 时间戳 | `pubts` | DateTime |
| 71 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 72 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 73 | `subcontractToPriceDen` | 计价换算率分母 | `subcontract_to_priceden` | Decimal |
| 74 | `subcontractToPriceNum` | 计价换算率分子 | `subcontract_to_pricenum` | Decimal |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `priceUnitId` | 计价单位 | `pc.unit.Unit` | Service |  |
| 2 | `batchnoid` | 批次参照 | `st.batchno.Batchno` | Service |  |
| 3 | `rcvOrgId` | 收货组织 | `aa.baseorg.OrgMV` | Service |  |
| 4 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 5 | `orderId` | 委外订单ID | `osm.OSMOrder.OSMOrder` | None | true |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `subcontractUnitId` | 委外单位 | `pc.unit.Unit` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 11 | `orderProductId` | 委外订单产品行ID | `osm.OSMOrder.OSMOrderProduct` | None |  |
| 12 | `subcontractVendorId` | 委外供应商ID | `aa.vendor.Vendor` | Service |  |
| 13 | `defineCharacteristics` | 自定义项特征组 | `po.order.ArrivePlanDefineCharacteristics` | None |  |
| 14 | `freeCharacteristics` | 自由项特征组 | `po.order.ArrivePlanFreeCharacteristics` | None |  |
| 15 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 16 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 17 | `vendorEnterpriseId` | 委外商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 18 | `orderByproductId` | 联副产品ID | `osm.OSMOrder.OSMOrderByProduct` | None |  |
| 19 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 20 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
