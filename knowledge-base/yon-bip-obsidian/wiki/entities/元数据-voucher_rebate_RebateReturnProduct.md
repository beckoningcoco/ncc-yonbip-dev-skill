---
tags: [BIP, 元数据, 数据字典, voucher, voucher.rebate.RebateReturnProduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 返利回退商品 (`voucher.rebate.RebateReturnProduct`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `rebateReturnProduct` | 应用: `BBSMK` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利回退商品 |
| 物理表 | `rebateReturnProduct` |
| 应用 | `BBSMK` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |

## 部署信息

- 部署时间: 2026-05-23 00:59:58:000
- 安装来源: `/app/marketingbill/src/marketingbill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-mkt-mkc2b/0010_iuap_common/DML/0270_iuap_metadata/20260515/001rebate/202604011749_metadata_voucher-rebate_delta.zip`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`

## 依赖接口（2 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

---

## 全部属性（43 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `bizSkuIds` | bizSkuIds | `cBizSkuIds` | String | `text` |  | true |
| 2 | `cProductCode` | cProduct编码 | `cProductCode` | String | `text` |  | true |
| 3 | `createDate` | 创建日期 | `dCreateDate` | DateTime | `timestamp` |  | true |
| 4 | `outSysKey` | outSysKey | `cOutSysKey` | String | `text` |  | true |
| 5 | `productAuth` | 产品权限 | `iProductId` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | `quote` |  | true |
| 6 | `productName` | 产品名称 | `cProductName` | String | `text` |  | true |
| 7 | `productOutSysKey` | productOutSysKey | `productOutSysKey` | String | `text` |  | true |
| 8 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true |
| 9 | `uordercorp` | uordercorp | `iCorpId` | String | `text` |  | true |
| 10 | `useWayCode` | useWay编码 | `cUseWayCode` | String | `text` |  | true |
| 11 | `usedAmount` | usedAmount | `iUsedAmount` | Decimal | `number` |  | true |
| 12 | `usedQuantity` | usedQuantity | `iUsedQuantity` | Decimal | `number` |  | true |
| 13 | `productLineId` | 产品线 | `iProductLineId` | fcdf5213-a995-4874-928f-ff97bcfa4b91 | `quote` |  | true |
| 14 | `sourceId` | sourceId | `iSourceId` | Long | `long` |  | true |
| 15 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 16 | `rebateNo` | rebateNo | `cRebateNo` | String | `text` |  | true |
| 17 | `rebateId` | rebateId | `iRebateId` | 9b73cf61-0421-4d25-8694-116cbe27ba7c | `quote` |  | true |
| 18 | `productBrandId` | 产品品牌ID | `iProductBrandId` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |  | true |
| 19 | `productClassId` | 产品分类ID | `iProductClassId` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |  | true |
| 20 | `productId` | productId | `iProductId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true |
| 21 | `skuId` | skuId | `iSkuId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | true |
| 22 | `quantity` | quantity | `iQuantity` | Decimal | `number` |  | true |
| 23 | `amount` | amount | `iAmount` | Decimal | `number` |  | true |
| 24 | `surplusQuantity` | surplusQuantity | `iSurplusQuantity` | Decimal | `number` |  | true |
| 25 | `unitType` | 单位类型 | `cUnitType` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true |
| 26 | `bizProductId` | bizProductId | `iBizProductId` | Long | `long` |  | true |
| 27 | `surplusAmount` | surplusAmount | `iSurplusAmount` | Decimal | `number` |  | true |
| 28 | `reduceRebateQuantity` | reduceRebateQuantity | `fReduceRebateQuantity` | Decimal | `number` |  | true |
| 29 | `reduceRebateAmount` | reduceRebateAmount | `fReduceRebateAmount` | Decimal | `number` |  | true |
| 30 | `agentId` | agentId | `iAgentId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 31 | `applicableType` | applicableType(类型) | `applicableType` | RebateApplicableTypeEnum | `` |  | true |
| 32 | `expenseItemId` | expenseItemId | `expenseItemId` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |  | true |
| 33 | `expenseItemTypeId` | expenseItemTypeId | `expenseItemTypeId` | f21b5eab-a129-49f6-ae72-9f9a2f415134 | `quote` |  | true |
| 34 | `marketingActiveId` | marketingActiveId | `marketingActiveId` | 924ae32c-2a09-4ec0-aff9-5959ec1f8024 | `quote` |  | true |
| 35 | `maxRebateMoney` | maxRebateMoney | `maxRebateMoney` | Decimal | `number` |  | true |
| 36 | `maxRebateRatio` | maxRebateRatio | `maxRebateRatio` | Decimal | `number` |  | true |
| 37 | `minRebateMoney` | minRebateMoney | `minRebateMoney` | Decimal | `number` |  | true |
| 38 | `rebateReturnProduct2Records` | rebateReturnProduct2Records | `` | 18a0fb7c-4997-4818-b148-cd8b3a5ebb2c | `` |  |  |
| 39 | `rebateReturnProductCharacteristics` | rebateReturnProductCharacteristics | `rebateReturnProductCharacteristics` | d022a717-5896-4ec6-ac01-ebd42fef1cae | `FreeCT` |  | true |
| 40 | `sourceDetailId` | sourceDetailId | `cSourceDetailId` | Long | `long` |  | true |
| 41 | `specDescription` | specDescription | `cSpecDescription` | String | `text` |  | true |
| 42 | `usmpPayModel` | usmpPayModel | `usmpPayModel` | Short | `short` |  | true |
| 43 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（15 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `expenseItemId` | expenseItemId | `bd.expenseitem.ExpenseItem` | `expenseItemId` | 外键 |  |  | Service |  |
| 2 | `agentId` | agentId | `aa.merchant.Merchant` | `iAgentId` | 外键 |  |  | Service |  |
| 3 | `productClassId` | 产品分类ID | `pc.cls.PresentationClass` | `iProductClassId` | 外键 |  |  | Service |  |
| 4 | `productId` | productId | `pc.product.Product` | `iProductId` | 外键 |  |  | Service |  |
| 5 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 6 | `productBrandId` | 产品品牌ID | `pc.brand.Brand` | `iProductBrandId` | 外键 |  |  | Service |  |
| 7 | `rebateReturnProductCharacteristics` | rebateReturnProductCharacteristics | `voucher.rebate.RebateReturnProductCharacteristics` | `rebateReturnProductCharacteristics` | 外键 |  |  | None |  |
| 8 | `rebateReturnProduct2Records` | rebateReturnProduct2Records | `voucher.rebate.RebateReturnProductRecord` | `` | rebateReturnProduct2Records → rebateReturnProductId | 0..n | Y | None |  |
| 9 | `unitType` | 单位类型 | `pc.unit.Unit` | `cUnitType` | 外键 |  |  | Service |  |
| 10 | `productAuth` | 产品权限 | `pb.dataauth.ProductDataAuth` | `iProductId` | 外键 |  |  | None |  |
| 11 | `marketingActiveId` | marketingActiveId | `mka.activity.Activity` | `marketingActiveId` | 外键 |  |  | Service |  |
| 12 | `rebateId` | rebateId | `voucher.rebate.ProductRebate` | `iRebateId` | rebateReturnProducts → rebateId | 0..n | Y | None |  |
| 13 | `expenseItemTypeId` | expenseItemTypeId | `bd.expenseitem.ExpenseItemType` | `expenseItemTypeId` | 外键 |  |  | Service |  |
| 14 | `skuId` | skuId | `pc.product.ProductSKU` | `iSkuId` | 外键 |  |  | Service |  |
| 15 | `productLineId` | 产品线 | `pc.productline.ProductLine` | `iProductLineId` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT cBizSkuIds, cProductCode, dCreateDate, cOutSysKey, iProductId, cProductName, productOutSysKey, pubuts
FROM rebateReturnProduct
```