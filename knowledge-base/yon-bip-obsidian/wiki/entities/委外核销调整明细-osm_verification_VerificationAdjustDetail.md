---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.verification.VerificationAdjustDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外核销调整明细 (`osm.verification.VerificationAdjustDetail`)

> OSM | 物理表：`po_verification_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外核销调整明细 |
| 物理表 | `po_verification_detail` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:54.6740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（48个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `batchNumber` | 批号 | `batch_number` | String |
| 2 | `curOsmInVerificationQuantity` | 本单核销数量 | `cur_osmin_hx_quantity` | Decimal |
| 3 | `curVerificationQuantity` | 本次核销数量（主计量） | `cur_verification_quantity` | Decimal |
| 4 | `curVerificationStockQuantity` | 本次核销数量 | `cur_hx_stock_quantity` | Decimal |
| 5 | `fixedQuantity` | 固定用量 | `fixed_quantity` | Integer |
| 6 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 33b0a649-3200-4b5b-b856-efbd612a6b2b |
| 7 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 8 | `id` | ID | `id` | Long |
| 9 | `isBackflush` | 倒冲生成 | `is_backflush` | Boolean |
| 10 | `isFromOSMIn` | 入库单领退料 | `is_fromOSMIn` | Boolean |
| 11 | `isLast` | 最后一笔 | `is_last` | Boolean |
| 12 | `isScrap` | 是否废品 | `isScrap` | Boolean |
| 13 | `isSelfDoc` | 委外订单材料 | `is_selfDoc` | Boolean |
| 14 | `isUpdateCost` | 更新存货成本 | `isUpdateCost` | Boolean |
| 15 | `lineNo` | 行号 | `line_no` | Decimal |
| 16 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 17 | `materialId` | 制造物料Id | `material_id` | Long |
| 18 | `materialOutId` | 出库单行 | `materialOut_id` | afca740c-2499-4845-a15f-eca55761a10f |
| 19 | `materialOutQuantity` | 出库数量 | `material_out_quantity` | Decimal |
| 20 | `ordermaterialId` | 来源委外订单备料行 | `ordermaterial_id` | 1b1bb4a9-8a2a-44af-9c61-f22d398ec0b7 |
| 21 | `outAccountingDate` | 材料出库记账日期 | `out_accounting_date` | String |
| 22 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 23 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `purinrecordsId` | 入库行id | `purinrecords_id` | 3928fe10-4802-4d6d-9545-dfd2ac3aba9c |
| 26 | `rowno` | 序号 | `rowno` | Integer |
| 27 | `skuId` | SKUid | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 28 | `source` | 上游单据类型 | `source` | String |
| 29 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 30 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 31 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 32 | `stockOrgId` | 库存组织 | `stock_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 33 | `stockToMain` | 库存-主计量转换率 | `stock_to_main` | Decimal |
| 34 | `stockToMainDen` | 换算率分母 | `stock_to_main_den` | Decimal |
| 35 | `stockToMainNum` | 换算率分子 | `stock_to_main_num` | Decimal |
| 36 | `stockUnitId` | 库存单位 | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 37 | `storeoutdetailId` | 来源调出单行id | `storeoutdetail_id` | 115a7d25-c0a5-4953-975c-b3e50dbeb868 |
| 38 | `subcontractId` | 委外订单id | `subcontract_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 39 | `subcontractproductId` | 委外订单行id | `subcontractproduct_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 40 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 41 | `unitId` | 主计量单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 42 | `unitUseQuantity` | 单位使用用量 | `unit_use_quantity` | Decimal |
| 43 | `upcode` | 来源单据号 | `upcode` | String |
| 44 | `verificationBy` | 核销依据 | `verification_by` | String |
| 45 | `verificationId` | 核销调整主表 | `verification_id` | e005561a-4488-4d64-9826-d76144ccfdb5 |
| 46 | `verificationQuantity` | 已核销数量 | `verification_quantity` | Decimal |
| 47 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 48 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ordermaterialId` | 来源委外订单备料行 | `po.order.OrderMaterial` | None |  |
| 2 | `materialOutId` | 出库单行 | `st.materialout.MaterialOuts` | Service |  |
| 3 | `subcontractId` | 委外订单id | `po.order.Order` | None |  |
| 4 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `subcontractproductId` | 委外订单行id | `po.order.OrderProduct` | None |  |
| 7 | `purinrecordsId` | 入库行id | `st.osminrecord.OsmInRecords` | Service |  |
| 8 | `freeCharacteristics` | 自由项特征组 | `po.verification.MaterialFreeCharacteristics` | None |  |
| 9 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 10 | `storeoutdetailId` | 来源调出单行id | `st.storeout.StoreOutDetail` | Service |  |
| 11 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 12 | `stockOrgId` | 库存组织 | `aa.baseorg.OrgMV` | Service |  |
| 13 | `unitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 14 | `verificationId` | 核销调整主表 | `osm.verification.VerificationAdjust` | None | true |
| 15 | `skuId` | SKUid | `pc.product.ProductSKU` | Service |  |
| 16 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 17 | `stockUnitId` | 库存单位 | `pc.unit.Unit` | Service |  |
