---
tags: [BIP, metadata, st, WareAndInv]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 仓库物料关系 (st.wareandinv.WareAndInv)

> Platform: BIP V5 | Module: st | Table: st_wareandinv | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 仓库物料关系 |
| uri | st.wareandinv.WareAndInv |
| tableName | st_wareandinv |
| domain | ustock |
| applicationCode | ST |
| superUri | archive.base.TenantArchive |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 树型结构 (ITree) | base.itf.ITree |
| 2 | 租户相关 (ITenant) | base.itf.ITenant |
| 3 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (34)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 2 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 3 | productclassId | 物料分类ID | productclass_id | quote | pc.cls.ManagementClass |  |  | dataPowerFlag,data_auth,nullable |
| 4 | batchRule | 批量规则 | iBatchRule | int | Integer |  |  | nullable |
| 5 | economicQuantity | 经济批量 | iEconomicQuantity | number | Decimal |  |  | nullable |
| 6 | batchDouble | 批量倍量 | iBatchDouble | number | Decimal |  |  | nullable |
| 7 | fixedLeadTime | 固定提前期 | iFixedLeadTime | int | Integer |  |  | nullable |
| 8 | parent | 上级分类 | parent_id | long | Long |  |  | nullable |
| 9 | level | 层级 | level | int | Integer |  |  | nullable |
| 10 | path | 路径 | path | text | String |  |  | nullable |
| 11 | sort | 排序号 | sort_num | int | Integer |  |  | nullable |
| 12 | isEnd | 是否末级 | isEnd | switch | Boolean |  |  | nullable |
| 13 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 15 | code | 编码 | code | text | String |  |  | jointUnique,extintable,isBusinessLog,CODE,testtemplates1,nullable,isCode,BUSINESSMESSAGE,logsManagement |
| 16 | name | 名称 | name | text | String |  |  | 216-2,bom,isName,NAME,REF.NAME |
| 17 | productId | 商品Id | product_id | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 18 | productskuId | 商品SKUID | productsku_id | quote | pc.product.ProductSKU |  |  | nullable |
| 19 | operatorId | 库管员ID | operator_id | quote | bd.staff.Staff |  |  | nullable |
| 20 | warehouseGroupId | 仓库组id | warehousegroup_id | long | Long |  |  | nullable |
| 21 | warehouseId | 仓库id | warehouse_id | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 22 | wareLookId | 仓库目录Id | warelook_id | quote | st.wareandinv.WareLook |  |  | nullable |
| 23 | wareGroupLookId | 仓库组目录Id | waregrouplook_id | quote | st.wareandinv.WareGroupLook |  |  | nullable |
| 24 | lookat | 维度 | lookat | text | String |  |  | nullable |
| 25 | mapstyle | 分配方式 | mapstyle | text | String |  |  | nullable |
| 26 | org | 库存组织id | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | dataPowerFlag,data_auth,isMasterOrg,nullable |
| 27 | productUnitId | 单位Id | product_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 28 | maxStock | 最高库存 | max_stock | number | Decimal |  |  | nullable |
| 29 | miniStock | 最低库存 | mini_stock | number | Decimal |  |  | nullable |
| 30 | safetyStock | 安全库存 | safety_stock | number | Decimal |  |  | nullable |
| 31 | reorderPoint | 再订货点 | reorder_point | number | Decimal |  |  | nullable |
| 32 | miniOrderQuantity | 最低订货量 | mini_order_quantity | number | Decimal |  |  | nullable |
| 33 | miniPackingQuantity | 最低打包量 | mini_packing_quantity | number | Decimal |  |  | nullable |
| 34 | replenishmentCycle | 补货周期 | replenishment_cycle | number | Decimal |  |  | nullable |

---

## Reference Fields (11)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | productclassId | 物料分类ID | productclass_id | pc.cls.ManagementClass |
| 2 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 4 | productId | 商品Id | product_id | pc.product.Product |
| 5 | productskuId | 商品SKUID | productsku_id | pc.product.ProductSKU |
| 6 | operatorId | 库管员ID | operator_id | bd.staff.Staff |
| 7 | warehouseId | 仓库id | warehouse_id | aa.warehouse.Warehouse |
| 8 | wareLookId | 仓库目录Id | warelook_id | st.wareandinv.WareLook |
| 9 | wareGroupLookId | 仓库组目录Id | waregrouplook_id | st.wareandinv.WareGroupLook |
| 10 | org | 库存组织id | iOrgid | aa.baseorg.InventoryOrgMV |
| 11 | productUnitId | 单位Id | product_unit_id | pc.unit.Unit |

---

## Number Fields (13)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | batchRule | 批量规则 | iBatchRule | int |
| 2 | economicQuantity | 经济批量 | iEconomicQuantity | number |
| 3 | batchDouble | 批量倍量 | iBatchDouble | number |
| 4 | fixedLeadTime | 固定提前期 | iFixedLeadTime | int |
| 5 | level | 层级 | level | int |
| 6 | sort | 排序号 | sort_num | int |
| 7 | maxStock | 最高库存 | max_stock | number |
| 8 | miniStock | 最低库存 | mini_stock | number |
| 9 | safetyStock | 安全库存 | safety_stock | number |
| 10 | reorderPoint | 再订货点 | reorder_point | number |
| 11 | miniOrderQuantity | 最低订货量 | mini_order_quantity | number |
| 12 | miniPackingQuantity | 最低打包量 | mini_packing_quantity | number |
| 13 | replenishmentCycle | 补货周期 | replenishment_cycle | number |
