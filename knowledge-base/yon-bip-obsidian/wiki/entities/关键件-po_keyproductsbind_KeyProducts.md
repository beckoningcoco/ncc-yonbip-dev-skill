---
tags: ["BIP", "元数据", "数据字典", "PO", "po.keyproductsbind.KeyProducts"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 关键件 (`po.keyproductsbind.KeyProducts`)

> PO | 物理表：`po_key_prds`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 关键件 |
| 物理表 | `po_key_prds` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:33:34.7870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `KeyProductsBindId` | 关键件绑定主表Id | `key_products_bind_id` | 3b8f51ce-3868-450f-98e1-b34599d23129 |
| 2 | `batchId` | 批次 | `batch_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 3 | `changeRate` | 库存换算率 | `change_rate` | Decimal |
| 4 | `changeRateDen` | 库存换算率分母 | `change_rateden` | Decimal |
| 5 | `changeRateNum` | 库存换算率分子 | `change_ratenum` | Decimal |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `freeCharacteristics` | 自由项特征组 | `free_cts` | a4ad9996-9a17-4b1c-865b-8c03dd159d48 |
| 12 | `id` | ID | `id` | Long |
| 13 | `keyProductSn` | 关键件序列号 | `` | c79b80bf-706c-436e-aa05-7008de818fbf |
| 14 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `orderMaterialId` | 生产订单材料 | `order_material_id` | 1b1bb4a9-8a2a-44af-9c61-f22d398ec0b7 |
| 20 | `proQty` | 件数 | `pro_qty` | Decimal |
| 21 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `qty` | 数量 | `qty` | Decimal |
| 24 | `stockChangeType` | 库存换算方式 | `stock_change_type` | Short |
| 25 | `stockUnitId` | 库存单位 | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `orderMaterialId` | 生产订单材料 | `po.order.OrderMaterial` | None |  |
| 2 | `freeCharacteristics` | 自由项特征组 | `po.keyproductsbind.KeyProductsFreeCharacter` | None |  |
| 3 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `KeyProductsBindId` | 关键件绑定主表Id | `po.keyproductsbind.KeyProductsBind` | None | true |
| 8 | `keyProductSn` | 关键件序列号 | `po.keyproductsbind.KeyProductSn` | None | true |
| 9 | `batchId` | 批次 | `st.batchno.Batchno` | Service |  |
| 10 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 11 | `stockUnitId` | 库存单位 | `pc.unit.Unit` | Service |  |
