---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.ArrivePlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 到货计划 (`po.order.ArrivePlan`)

> PO | 物理表：`osm_arrive_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 到货计划 |
| 物理表 | `osm_arrive_plan` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:22:51.1630` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（70个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lineNo` | 行号 | `line_no` | Decimal |
| 2 | `orderId` | 委外订单ID | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 3 | `orderProductId` | 委外订单产品行ID | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 4 | `productionType` | 产出类型 | `production_type` | String |
| 5 | `orderByproductId` | 联副产品ID | `order_byproduct_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 6 | `subcontractVendorId` | 委外供应商ID | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 7 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `freeCharacteristics` | 自由项特征组 | `free_cts` | d7d80da7-ec53-4b53-ae46-608c11c0fbd5 |
| 9 | `deliveryQuantity` | 计划到货数量 | `delivery_quantity` | Decimal |
| 10 | `deliveryAuxiliaryQuantity` | 计划到货件数 | `delivery_auxiliary_quantity` | Decimal |
| 11 | `mainUnitId` | 主单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 12 | `subcontractUnitId` | 委外单位 | `subcontract_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 13 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 14 | `subcontractToPrice` | 计价换算率 | `subcontract_to_price` | Decimal |
| 15 | `subcontractQuantityPU` | 计价数量 | `subcontract_quantity_pu` | Decimal |
| 16 | `priceUnitId` | 计价单位 | `price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 17 | `deliveryDate` | 计划到货日期 | `delivery_date` | Date |
| 18 | `rcvOrgId` | 收货组织 | `rcv_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 19 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 20 | `batchnoid` | 批次参照 | `batchnoid` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 21 | `batchNo` | 批次号 | `batch_no` | String |
| 22 | `status` | 状态 | `status` | String |
| 23 | `remark` | 备注 | `remark` | String |
| 24 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | 43244b98-51a7-409b-9472-43aa45cb6e4f |
| 25 | `arriveQuantity` | 累计到货数量 | `arrive_quantity` | Decimal |
| 26 | `arriveSubQuantity` | 累计到货件数 | `arrive_sub_quantity` | Decimal |
| 27 | `acceptQuantity` | 累计实收数量 | `accept_quantity` | Decimal |
| 28 | `acceptSubQuantity` | 累计实收件数 | `accept_sub_quantity` | Decimal |
| 29 | `refuseQuantity` | 累计拒收数量 | `refuse_quantity` | Decimal |
| 30 | `refuseSubQuantity` | 累计拒收件数 | `refuse_sub_quantity` | Decimal |
| 31 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 32 | `replenishSubQuantity` | 拒收需补货件数 | `replenish_sub_quantity` | Decimal |
| 33 | `warehousingQuantity` | 累计入库数量 | `warehousing_quantity` | Decimal |
| 34 | `auxilaryWarehousingQuantity` | 累计入库件数 | `auxilary_warehousing_quantity` | Decimal |
| 35 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 36 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 37 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 38 | `createTime` | 创建时间 | `create_time` | DateTime |
| 39 | `createDate` | 创建日期 | `create_date` | Date |
| 40 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 41 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 42 | `creator` | 创建人名称 | `creator` | String |
| 43 | `modifier` | 修改人名称 | `modifier` | String |
| 44 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 45 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 46 | `produceDate` | 生产日期 | `produce_date` | Date |
| 47 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 48 | `id` | ID | `id` | Long |
| 49 | `pubts` | 时间戳 | `pubts` | DateTime |
| 50 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 51 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 52 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 53 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 54 | `closer` | 关闭人名称 | `closer` | String |
| 55 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 56 | `confirmAuxQuantity` | 确认件数 | `confirm_aux_qty` | Decimal |
| 57 | `confirmDeliveryDate` | 确认交期 | `confirm_delivery_date` | Date |
| 58 | `confirmQuantity` | 确认数量 | `confirm_qty` | Decimal |
| 59 | `confirmStatus` | 确认状态 | `confirm_status` | Integer |
| 60 | `consultStatus` | 协同状态 | `consult_status` | Integer |
| 61 | `deliveryPlanId` | 交货计划id | `delivery_plan_id` | Long |
| 62 | `deliveryPlanNo` | 交货计划单号  | `delivery_plan_no` | String |
| 63 | `initiator` | 发起方 | `initiator` | Integer |
| 64 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 65 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 66 | `requireConfirm` | 需要委外商确认 | `require_confirm` | Boolean |
| 67 | `requireConsult` | 需要与委外商协同 | `require_consult` | Boolean |
| 68 | `saleRemark` | 理由 | `sale_remark` | String |
| 69 | `vendorEnterpriseId` | 委外商企业 | `vendor_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 70 | `vendorTenant` | 委外商租户 | `vendor_tenant` | String |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `priceUnitId` | 计价单位 | `pc.unit.Unit` | Service |  |
| 2 | `batchnoid` | 批次参照 | `st.batchno.Batchno` | Service |  |
| 3 | `rcvOrgId` | 收货组织 | `aa.baseorg.OrgMV` | Service |  |
| 4 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 5 | `orderId` | 委外订单ID | `po.order.Order` | None | true |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `subcontractUnitId` | 委外单位 | `pc.unit.Unit` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 11 | `orderProductId` | 委外订单产品行ID | `po.order.OrderProduct` | None |  |
| 12 | `subcontractVendorId` | 委外供应商ID | `aa.vendor.Vendor` | Service |  |
| 13 | `defineCharacteristics` | 自定义项特征组 | `po.order.ArrivePlanDefineCharacteristics` | None |  |
| 14 | `freeCharacteristics` | 自由项特征组 | `po.order.ArrivePlanFreeCharacteristics` | None |  |
| 15 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 16 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 17 | `vendorEnterpriseId` | 委外商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 18 | `orderByproductId` | 联副产品ID | `po.order.OrderByProduct` | None |  |
| 19 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 20 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
