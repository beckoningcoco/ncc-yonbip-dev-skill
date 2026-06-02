---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.ProductRebateRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: voucher.order.Order
---

# 商品返利单记录 (`voucher.order.ProductRebateRecord`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`orderproductrebaterecord` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商品返利单记录 |
| 描述 |  |
| 物理表 | `orderproductrebaterecord` |
| 所属应用 | `SCMSA` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 数据权限场景 | `` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键ID |
| 编码 | `rowno` | `rowno` | Integer | rowno |

## 部署信息

- **部署时间**: 2024-09-27 23:46:28:000
- **安装来源**: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V3_R6_2407/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202409/202408191632_metadata_voucher-order_delta.zip`
- **安装人**: mongoTools

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

---

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| 2 | Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| 3 | IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

### IUordercorp (`IUordercorp`)
> URI: `base.itf.IUordercorp` | 版本: 73

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `uordercorp` (公司(分区键)) | `iCorpId` | `long` | `Long` |

### Deletable (`Deletable`)
> URI: `base.itf.Deletable` | 版本: 67

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `isDeleted` (isDeleted) | `iDeleted` | `switch` | `Boolean` |

### IYTenantExt (`IYTenantExt`)
> URI: `ucfbase.ucfbaseItf.IYTenantExt` | 版本: 24

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

---

## 全部直接属性（共 20 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true | `voucher.order.ProductRebateRecord.id` |
| 2 | `orderId` | 订单ID | `iorderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.ProductRebateRecord.orderId` |
| 3 | `isModifyProductSalePrice` | isModifyProductSalePrice | `isModifyProductSalePrice` | Boolean | `switch` |  | true | `voucher.order.ProductRebateRecord.isModifyProductSalePrice` |
| 4 | `shareSettingId` | shareSettingId | `iShareSettingId` | 6353a3f1-4736-4c35-bc35-64ec2ea8bb7d | `quote` |  | true | `voucher.order.ProductRebateRecord.shareSettingId` |
| 5 | `productRebateRecordCharacteristics` | productRebateRecordCharacteristics | `productrebaterecord_characteristics` | 8764a3df-6f1f-4d5c-9983-f5d248cfafc8 | `FreeCT` |  | true | `voucher.order.ProductRebateRecord.productRebateRecordCharacteristics` |
| 6 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true | `ucfbase.ucfbaseItf.IYTenantExt.ytenant` |
| 7 | `productRebateId` | productRebateId | `iproductrebateid` | 631cf218-f93d-48a9-8d02-7c2d4c520538 | `quote` |  | true | `voucher.order.ProductRebateRecord.productRebateId` |
| 8 | `rebateProductBrandId` | rebateProductBrandId | `irebateproductbrandid` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |  | true | `voucher.order.ProductRebateRecord.rebateProductBrandId` |
| 9 | `rebateProductLineId` | rebateProductLineId | `irebateproductlineid` | fcdf5213-a995-4874-928f-ff97bcfa4b91 | `quote` |  | true | `voucher.order.ProductRebateRecord.rebateProductLineId` |
| 10 | `rebateProductClassId` | rebateProductClassId | `irebateproductclassid` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |  | true | `voucher.order.ProductRebateRecord.rebateProductClassId` |
| 11 | `rebateProductId` | 返利产品ID | `irebateproductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true | `voucher.order.ProductRebateRecord.rebateProductId` |
| 12 | `rebateSkuId` | rebateSkuId | `irebateskuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | true | `voucher.order.ProductRebateRecord.rebateSkuId` |
| 13 | `rebateUnitId` | rebateUnitId | `irebateunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true | `voucher.order.ProductRebateRecord.rebateUnitId` |
| 14 | `usedProductQty` | usedProductQty | `fusedproductqty` | Decimal | `number` |  | true | `voucher.order.ProductRebateRecord.usedProductQty` |
| 15 | `productSalePrice` | productSalePrice | `fproductsaleprice` | Decimal | `number` |  | true | `voucher.order.ProductRebateRecord.productSalePrice` |
| 16 | `usedProductMoney` | usedProductMoney | `fusedproductmoney` | Decimal | `number` |  | true | `voucher.order.ProductRebateRecord.usedProductMoney` |
| 17 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true | `uorder.voucher.UorderVouchLine.pubts` |
| 18 | `isDeleted` | isDeleted | `iDeleted` | Boolean | `switch` |  | true | `base.itf.Deletable.isDeleted` |
| 19 | `rowno` | rowno | `rowno` | Integer | `int` |  | true | `voucher.base.IRowNum.rowno` |
| 20 | `uordercorp` | 公司(分区键) | `iCorpId` | Long | `long` |  | true | `base.itf.IUordercorp.uordercorp` |

---

## 关联属性（共 11 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `rebateProductClassId` | rebateProductClassId | `pc.cls.PresentationClass` | `irebateproductclassid` | 外键引用 |  |  | Service |  |
| 2 | `rebateSkuId` | rebateSkuId | `pc.product.ProductSKU` | `irebateskuid` | 外键引用 |  |  | Service |  |
| 3 | `orderId` | 订单ID | `voucher.order.Order` | `iorderId` | productRebateRecords → orderId | 0..n | Y | None |  |
| 4 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |
| 5 | `rebateUnitId` | rebateUnitId | `pc.unit.Unit` | `irebateunitid` | 外键引用 |  |  | Service |  |
| 6 | `rebateProductLineId` | rebateProductLineId | `pc.productline.ProductLine` | `irebateproductlineid` | 外键引用 |  |  | Service |  |
| 7 | `productRebateRecordCharacteristics` | productRebateRecordCharacteristics | `voucher.order.ProductRebateRecordCharacteristics` | `productrebaterecord_characteristics` | 外键引用 |  |  | None |  |
| 8 | `rebateProductBrandId` | rebateProductBrandId | `pc.brand.Brand` | `irebateproductbrandid` | 外键引用 |  |  | Service |  |
| 9 | `productRebateId` | productRebateId | `voucher.rebate.RebateReturnProduct` | `iproductrebateid` | 外键引用 |  |  | Service |  |
| 10 | `rebateProductId` | 返利产品ID | `pc.product.Product` | `irebateproductid` | 外键引用 |  |  | Service |  |
| 11 | `shareSettingId` | shareSettingId | `voucher.rebate.RebateShareSetting` | `iShareSettingId` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **订单ID**: `orderId` → `voucher.order.Order` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `rebateProductClassId` (rebateProductClassId) | `pc.cls.PresentationClass` | `irebateproductclassid` |
| `rebateSkuId` (rebateSkuId) | `pc.product.ProductSKU` | `irebateskuid` |
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `rebateUnitId` (rebateUnitId) | `pc.unit.Unit` | `irebateunitid` |
| `rebateProductLineId` (rebateProductLineId) | `pc.productline.ProductLine` | `irebateproductlineid` |
| `rebateProductBrandId` (rebateProductBrandId) | `pc.brand.Brand` | `irebateproductbrandid` |
| `productRebateId` (productRebateId) | `voucher.rebate.RebateReturnProduct` | `iproductrebateid` |
| `rebateProductId` (返利产品ID) | `pc.product.Product` | `irebateproductid` |
| `shareSettingId` (shareSettingId) | `voucher.rebate.RebateShareSetting` | `iShareSettingId` |

---

## 使用示例

```sql
-- 查询 商品返利单记录 数据
SELECT id, iorderId, isModifyProductSalePrice, iShareSettingId, productrebaterecord_characteristics, ytenant_id, iproductrebateid, irebateproductbrandid, irebateproductlineid, irebateproductclassid
FROM orderproductrebaterecord
WHERE orderId = ? -- 关联订单ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.ProductRebateRecord
```
