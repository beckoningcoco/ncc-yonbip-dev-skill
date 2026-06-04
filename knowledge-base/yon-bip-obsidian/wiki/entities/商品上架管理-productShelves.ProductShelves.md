---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.productShelves.ProductShelves"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商品上架管理 (`mall.productShelves.ProductShelves`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_supplycategory` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.productShelves.ProductShelves` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商品上架管理 |
| 物理表 | `cpu_supplycategory` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `d180414e-bdd6-43a1-aef4-48646fbf7f53` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:37.5300` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `skucode` | `skucode` | String | SKU编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-23 00:59:46:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202603041511_metadata_mall-productShelves_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `a10aac7f-592f-4004-9aa9-fa8d60f62a30`

## 业务场景

- `dataMultilanguage`
- `UITemplate`
- `imextmp`
- `report`
- `msgtemplate`
- `api`

## 术语标记

`BusinessData`, `skipReferenceCheck`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 68 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `productId` | 商品ID | `product_id` | Long | `long` |  | ✓ |
| 3 | `productCode` | 商品编码 | `product_code` | String | `text` |  | ✓ |
| 4 | `productName` | 商品名称 | `product_name` | String | `text` |  | ✓ |
| 5 | `productSubject` | 商品标题 | `product_subject` | String | `text` |  | ✓ |
| 6 | `productUnit` | 商品单位 | `unit` | String | `text` |  | ✓ |
| 7 | `productSupplyDetailId` | 商品供货清单子表ID | `sourceautoid` | Long | `long` |  | ✓ |
| 8 | `productMainPicture` | 商品主图 | `imgurl` | String | `text` |  | ✓ |
| 9 | `skuId` | skuId | `skuid` | Long | `long` |  | ✓ |
| 10 | `skuCode` | SKU编码 | `skucode` | String | `text` |  | ✓ |
| 11 | `mallclassId` | 商品分类ID | `mallclass_id` | c58dfa3a-81e5-4d0e-b4ba-794bced793a1 | `quote` |  | ✓ |
| 12 | `innercode` | 商品类目层级码 | `innercode` | String | `text` |  | ✓ |
| 13 | `minOrderQuantity` | 最小起订量 | `min_order_quantity` | Decimal | `number` |  | ✓ |
| 14 | `purchaseMultiple` | 采购倍量 | `purchase_multiple` | Decimal | `number` |  | ✓ |
| 15 | `validTime` | 过期时间 | `validtime` | DateTime | `timestamp` |  | ✓ |
| 16 | `materialId` | 物料Id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 17 | `status` | 状态 | `status` | String | `text` |  | ✓ |
| 18 | `forwardSale` | 是否可预售 | `forward_sale` | Integer | `int` |  | ✓ |
| 19 | `quotaType` | 报价方式 | `quota_type` | String | `text` |  | ✓ |
| 20 | `taxPrice` | 含税单价 | `taxprice` | Decimal | `number` |  | ✓ |
| 21 | `price` | 无税单价 | `price` | Decimal | `number` |  | ✓ |
| 22 | `taxrate` | 税率 | `taxrate` | Decimal | `number` |  | ✓ |
| 23 | `openTaxprice` | 含税公开价 | `open_taxprice` | Decimal | `number` |  | ✓ |
| 24 | `openPrice` | 无税公开价 | `open_price` | Decimal | `number` |  | ✓ |
| 25 | `originTaxPrice` | 原始允销含税单价 | `origin_tax_price` | Decimal | `number` |  | ✓ |
| 26 | `originPrice` | 原始允销无税单价 | `origin_price` | Decimal | `number` |  | ✓ |
| 27 | `oldPrice` | 上次价格 | `oldprice` | Decimal | `number` |  | ✓ |
| 28 | `allowsaleId` | 允销申请ID | `allowsale_id` | Long | `long` |  | ✓ |
| 29 | `purchaseOrgId` | 采购组织ID | `purchase_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 30 | `title` | 申请标题 | `title` | String | `text` |  | ✓ |
| 31 | `type` | 允销类型 | `type` | String | `text` |  | ✓ |
| 32 | `intType` | 允销类型 | `int_type` | Integer | `int` |  | ✓ |
| 33 | `applyDate` | 允销申请日期 | `apply_date` | DateTime | `timestamp` |  | ✓ |
| 34 | `offShelfCause` | 下架原因 | `offshelf_cause` | String | `text` |  | ✓ |
| 35 | `approvalStatus` | 下架审批状态 | `approval_status` | String | `text` |  | ✓ |
| 36 | `approvalRejectReason` | 审批驳回原因 | `approval_reject_reason` | String | `text` |  | ✓ |
| 37 | `contractId` | 合同id | `contract_id` | Long | `long` |  | ✓ |
| 38 | `contractCode` | 合同编码 | `contract_code` | String | `text` |  | ✓ |
| 39 | `contractMaterialId` | 合同id | `pur_contract_material_id` | Long | `long` |  | ✓ |
| 40 | `operatingPriceId` | 运营协议id | `price_id` | 54f73169-773d-40df-9fbc-c092f4201577 | `quote` |  | ✓ |
| 41 | `priceProductId` | 运营协议子表ID | `price_product_id` | de39a65e-7538-46bf-8b50-6f90b55d8067 | `quote` |  | ✓ |
| 42 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 43 | `creator` | 创建人 | `creator` | String | `text` |  | ✓ |
| 44 | `modifyTime` | 修改时间 | `modified_time` | DateTime | `timestamp` |  | ✓ |
| 45 | `modifier` | 修改人 | `modifier` | String | `text` |  | ✓ |
| 46 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 47 | `dr` | 逻辑删除标记位 | `dr` | Integer | `int` |  | ✓ |
| 48 | `stock` | 库存量 | `stock` | Decimal | `number` |  | ✓ |
| 49 | `salesVolume` | 销量 | `sales_volume` | Long | `long` |  | ✓ |
| 50 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 51 | `source` | 来源类型 | `source` | String | `text` |  | ✓ |
| 52 | `productMall` | 商品可采专区 | `product_mall` | Integer | `int` |  | ✓ |
| 53 | `isPackage` | 是否包邮 | `is_package` | Integer | `int` |  | ✓ |
| 54 | `carriageRuleId` | 运费定价规则ID | `carriage_rule_id` | Long | `long` |  | ✓ |
| 55 | `carriageRuleTempleteName` | 运费模板名称 | `carriage_rule_templete_name` | String | `text` |  | ✓ |
| 56 | `customerId` | 采购商企业ID | `customer_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 57 | `supplierId` | 供应商企业ID | `supplier_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 58 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String | `text` |  | ✓ |
| 59 | `supplyDocId` | 供应商档案 | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 60 | `chanelId` | 电商渠道id | `chanelid` | Long | `long` |  | ✓ |
| 61 | `showingLable` | 电商渠道名称 | `showing_lable` | String | `text` |  | ✓ |
| 62 | `purchasetype` | 供货类型 | `purchasetype` | String | `text` |  | ✓ |
| 63 | `supplyablity` | 可供数量 | `supplyablity` | String | `text` |  | ✓ |
| 64 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 65 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 66 | `applyOrg` | 商品适用组织 | `` | 5cdd431f-7b19-44f0-8254-54083935e83e | `` |  |  |
| 67 | `applyOrgGroup` | 商品适用组织分组 | `` | b3b1902c-da1f-4c96-8aaa-468e309ffae4 | `` |  |  |
| 68 | `productTag` | 商品标签 | `` | bbabccfb-e853-4339-aada-7714219c5321 | `` |  |  |

---

## 关联属性（共 13 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `applyOrg` | 商品适用组织 | `mall.productShelves.ProductApplyOrg` | `` | applyOrg → productShelvesId | 0..n | true | None |  |
| 2 | `supplierId` | 供应商企业ID | `cpu-privilege.enterprise.EnterprisePOJO` | `supplier_id` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `priceProductId` | 运营协议子表ID | `mall.operatingprice.CpuOperatingPriceProduct` | `price_product_id` |  →  |  |  | Service |  |
| 5 | `supplyDocId` | 供应商档案 | `aa.vendor.Vendor` | `supply_doc_id` |  →  |  |  | Service |  |
| 6 | `purchaseOrgId` | 采购组织ID | `org.func.BaseOrg` | `purchase_org_id` |  →  |  |  | Service |  |
| 7 | `materialId` | 物料Id | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 8 | `mallclassId` | 商品分类ID | `ycYuncaiMall.marketProductClass.marketProductClass` | `mallclass_id` |  →  |  |  | Service |  |
| 9 | `applyOrgGroup` | 商品适用组织分组 | `mall.productShelves.ProductApplyOrgGroup` | `` | applyOrgGroup → productShelvesId | 0..n | true | None |  |
| 10 | `productTag` | 商品标签 | `mall.productShelves.ProductTag` | `` | productTag → productShelvesId | 0..n | true | None |  |
| 11 | `customerId` | 采购商企业ID | `cpu-privilege.enterprise.EnterprisePOJO` | `customer_id` |  →  |  |  | Service |  |
| 12 | `operatingPriceId` | 运营协议id | `mall.operatingprice.CpuOperatingPrice` | `price_id` |  →  |  |  | Service |  |
| 13 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |

### Composition（子表）

- **applyOrg**: `applyOrg` → `mall.productShelves.ProductApplyOrg` | 0..n
- **applyOrgGroup**: `applyOrgGroup` → `mall.productShelves.ProductApplyOrgGroup` | 0..n
- **productTag**: `productTag` → `mall.productShelves.ProductTag` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `supplierId` (供应商企业ID) | `cpu-privilege.enterprise.EnterprisePOJO` | `supplier_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `priceProductId` (运营协议子表ID) | `mall.operatingprice.CpuOperatingPriceProduct` | `price_product_id` |
| `supplyDocId` (供应商档案) | `aa.vendor.Vendor` | `supply_doc_id` |
| `purchaseOrgId` (采购组织ID) | `org.func.BaseOrg` | `purchase_org_id` |
| `materialId` (物料Id) | `pc.product.Product` | `material_id` |
| `mallclassId` (商品分类ID) | `ycYuncaiMall.marketProductClass.marketProductClass` | `mallclass_id` |
| `customerId` (采购商企业ID) | `cpu-privilege.enterprise.EnterprisePOJO` | `customer_id` |
| `operatingPriceId` (运营协议id) | `mall.operatingprice.CpuOperatingPrice` | `price_id` |
| `currencyId` (币种id) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
