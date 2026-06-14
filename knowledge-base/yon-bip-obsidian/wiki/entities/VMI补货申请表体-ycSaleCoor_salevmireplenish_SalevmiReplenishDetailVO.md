---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "ycSaleCoor.salevmireplenish.SalevmiReplenishDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# VMI补货申请表体 (`ycSaleCoor.salevmireplenish.SalevmiReplenishDetailVO`)

> ycSaleCoor | 物理表：`cpu_sale_vmi_replenish_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | VMI补货申请表体 |
| 物理表 | `cpu_sale_vmi_replenish_detail` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:19.2270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（37个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `confirmPriceQty` | 已确认补货数量(计价单位) | `confirm_price_qty` | Decimal |
| 2 | `confirmPurQty` | 已确认补货数量(采购单位) | `confirm_pur_qty` | Decimal |
| 3 | `confirmQty` | 已确认补货数量 | `confirm_qty` | Decimal |
| 4 | `currentStockUid` | 存量uid | `current_stock_uid` | String |
| 5 | `dr` | 删除标志 | `dr` | Integer |
| 6 | `gmtCreate` | 创建时间 | `gmt_create` | DateTime |
| 7 | `gmtModified` | 修改时间 | `gmt_modified` | DateTime |
| 8 | `id` | ID | `id` | Long |
| 9 | `invExchRate` | 采购换算率 | `inv_exch_rate` | Decimal |
| 10 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 11 | `lineNum` | 行号 | `line_num` | String |
| 12 | `mainId` | 主表id | `main_id` | 1e3f9b4f-c69e-41f9-9fad-da91758b2d9e |
| 13 | `mainUnitId` | 主单位 | `mian_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 14 | `materialclassId` | 物料分类 | `materialclass_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 15 | `planDeliverAddress` | 交货地点 | `product_address` | String |
| 16 | `planDeliverDate` | 计划交货日期 | `plan_deliver_date` | DateTime |
| 17 | `priceQty` | 申请补货数量(计价单位) | `price_qty` | Decimal |
| 18 | `priceUOM` | 计价单位 | `price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 19 | `productDescribe` | 物料描述 | `product_describe` | String |
| 20 | `productIid` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `purOrderId` | 采购订单主表id | `pur_order_id` | Long |
| 23 | `purQty` | 申请补货数量(采购单位) | `pur_qty` | Decimal |
| 24 | `purUOM` | 采购单位 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 25 | `qty` | 申请补货数量 | `qty` | Decimal |
| 26 | `saleVmiReplenishDetailDefineCharacter` | 自定义项特征属性组 | `defineCharacter` | ee6a1576-141a-4f1e-9059-273e6c51b3fb |
| 27 | `saleVmiReplenishDetailFreeCharacteristics` | 自由项特征组实体 | `instance_id` | 3e4094a9-197b-4206-b4aa-aad14a21a11d |
| 28 | `skuId` | 物料SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 29 | `stockOrgId` | 库存组织 | `stock_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 30 | `warehouse` | 仓库 | `warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 31 | `ytenant` | 租户编码 | `ytenant_id` | String |
| 32 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 33 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 34 | `invExchRateDen` | 采购换算率分母 | `invexchrateden` | Decimal |
| 35 | `invExchRateNum` | 采购换算率分子 | `invexchratenum` | Decimal |
| 36 | `invPriceExchRateDen` | 计价换算率分母 | `invpriceexchrateden` | Decimal |
| 37 | `invPriceExchRateNum` | 计价换算率分子 | `invpriceexchratenum` | Decimal |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purUOM` | 采购单位 | `pc.unit.Unit` | Service |  |
| 2 | `priceUOM` | 计价单位 | `pc.unit.Unit` | Service |  |
| 3 | `saleVmiReplenishDetailFreeCharacteristics` | 自由项特征组实体 | `ycSaleCoor.salevmireplenish.SalevmiReplenishFreeCharacteristics` | None |  |
| 4 | `saleVmiReplenishDetailDefineCharacter` | 自定义项特征属性组 | `ycSaleCoor.salevmireplenish.SaleVmiReplenishDetailsDefine` | None |  |
| 5 | `productIid` | 物料id | `pc.product.Product` | Service |  |
| 6 | `stockOrgId` | 库存组织 | `org.func.BaseOrg` | Service |  |
| 7 | `mainId` | 主表id | `ycSaleCoor.salevmireplenish.SalevmiReplenishVO` | None | true |
| 8 | `materialclassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 9 | `warehouse` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 10 | `skuId` | 物料SKU | `pc.product.ProductSKU` | Service |  |
| 11 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
