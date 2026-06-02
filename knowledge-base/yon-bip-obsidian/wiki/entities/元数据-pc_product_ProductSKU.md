---
tags: [BIP, 元数据, 数据字典, pc, pc.product.ProductSKU]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 物料SKU (`pc.product.ProductSKU`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productsku` | 应用: `GZTBDM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料SKU |
| 物理表 | `productsku` |
| 应用 | `GZTBDM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:06:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0001_material/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202602021529_metadata_pc-product.zip`

## 术语标记

`isAssigned`, `isExtend`, `data_auth`, `isMultiCodeRule`, `MasterData`, `isMain`, `doc`, `DirectConnection`, `isUseCondition`

## 依赖接口（6 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IErp编码 (`IErpCode`) | `base.itf.IErpCode` | 73 | 1 |
| Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| ISociCoreArchive (`ISociCoreArchive`) | `base.itf.ISociCoreArchive` | 28 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| TenantObselete (`TenantObselete`) | `coredoc.pub.TenantObselete` | 43 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（70 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `productId` | productId | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true |
| 3 | `code` | 编码 | `code` | String | `text` |  | true |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 5 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 6 | `skudefine` | skudefine | `` | 1d9640f3-7d91-4c25-bb67-8b1e40e63cb6 | `` |  |  |
| 7 | `modelDescription` | modelDescription | `cModelDescription` | String | `multiLanguage` |  | true |
| 8 | `model` | model | `cModel` | String | `multiLanguage` |  | true |
| 9 | `batchUnit` | batchUnit | `batchUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true |
| 10 | `batchRate` | batchRate | `batchRate` | Decimal | `number` |  | true |
| 11 | `weight` | 重量 | `weight` | Decimal | `number` |  | true |
| 12 | `volume` | 体积 | `volume` | Decimal | `number` |  | true |
| 13 | `source` | source | `source` | ProductSource | `` |  | true |
| 14 | `isSKU` | 是否SKU | `isSKU` | Integer | `int` |  | true |
| 15 | `isStandard` | 是否Standard | `is_standard` | Integer | `int` |  | true |
| 16 | `isED` | 是否ED | `is_ed` | Integer | `int` |  | true |
| 17 | `isIa` | 是否Ia | `is_ia` | Integer | `int` |  | true |
| 18 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |  | true |
| 19 | `skuFreeCharacter` | skuFreeCharacter | `skufreecharacter` | d67917f8-98fb-48aa-be8a-ce2a44865ae5 | `FreeCT` |  | true |
| 20 | `freeValueIds` | reeValueIds(金额) | `free_value_ids` | String | `text` |  | true |
| 21 | `freeValueIdsMd5` | reeValueIdsMd5(金额) | `free_value_ids_md5` | String | `text` |  | true |
| 22 | `freeValues` | reeValues(金额) | `free_values` | String | `text` |  | true |
| 23 | `skuPropCharacter` | skuPropCharacter | `skupropcharacter` | 7717628c-43bf-4a4c-a5bf-d47a86851ae9 | `SkuPropCT` |  | true |
| 24 | `productSkuCharacterDef` | productSkuCharacterDef | `productsku_character_def` | fd116ec7-aef8-4e40-9fa3-faa49700d21e | `UserDefine` |  | true |
| 25 | `free1` | ree1(金额) | `free1` | String | `text` |  | true |
| 26 | `free2` | ree2(金额) | `free2` | String | `text` |  | true |
| 27 | `free3` | ree3(金额) | `free3` | String | `text` |  | true |
| 28 | `free4` | ree4(金额) | `free4` | String | `text` |  | true |
| 29 | `free5` | ree5(金额) | `free5` | String | `text` |  | true |
| 30 | `free6` | ree6(金额) | `free6` | String | `text` |  | true |
| 31 | `free7` | ree7(金额) | `free7` | String | `text` |  | true |
| 32 | `free8` | ree8(金额) | `free8` | String | `text` |  | true |
| 33 | `free9` | ree9(金额) | `free9` | String | `text` |  | true |
| 34 | `free10` | ree10(金额) | `free10` | String | `text` |  | true |
| 35 | `freeidx1` | reeidx1(金额) | `freeidx1` | 8420b5e5-7919-41ca-a192-7b8c4fb1d8b8 | `quote` |  | true |
| 36 | `freex1` | reex1(金额) | `freex1` | String | `text` |  | true |
| 37 | `freeidx2` | reeidx2(金额) | `freeidx2` | 8420b5e5-7919-41ca-a192-7b8c4fb1d8b8 | `quote` |  | true |
| 38 | `freex2` | reex2(金额) | `freex2` | String | `text` |  | true |
| 39 | `freeidx3` | reeidx3(金额) | `freeidx3` | 8420b5e5-7919-41ca-a192-7b8c4fb1d8b8 | `quote` |  | true |
| 40 | `freex3` | reex3(金额) | `freex3` | String | `text` |  | true |
| 41 | `freeidx4` | reeidx4(金额) | `freeidx4` | 8420b5e5-7919-41ca-a192-7b8c4fb1d8b8 | `quote` |  | true |
| 42 | `freex4` | reex4(金额) | `freex4` | String | `text` |  | true |
| 43 | `freeidx5` | reeidx5(金额) | `freeidx5` | 8420b5e5-7919-41ca-a192-7b8c4fb1d8b8 | `quote` |  | true |
| 44 | `freex5` | reex5(金额) | `freex5` | String | `text` |  | true |
| 45 | `specNames` | specNames | `specNames` | String | `text` |  | true |
| 46 | `specIds` | specIds | `cSpecIds` | String | `text` |  | true |
| 47 | `specs` | specs | `cSpecs` | String | `text` |  | true |
| 48 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 49 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 50 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |  | true |
| 51 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 52 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 53 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 54 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 55 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 56 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 57 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 58 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 59 | `tenant` | tenant | `tenant_id` | Long | `long` | true | true |
| 60 | `productSKUAppliedDetail` | productSKUAppliedDetail | `` | fe1868eb-1d25-4917-9dc8-3e3708af5f7c | `` |  |  |
| 61 | `productSKUDetail` | productSKUDetail | `` | 246a7c83-d1b7-47e8-844d-323144e0b07d | `` |  |  |
| 62 | `productSKUSpecItems` | productSKUSpecItems | `` | aeb3555c-e522-41ff-8c82-495ad3b4ea60 | `` |  |  |
| 63 | `productSkuDetailNew` | productSkuDetailNew | `` | da35aa40-15cd-4e54-b5fb-4608d40aa13c | `` |  |  |
| 64 | `productSkuOrderProperty` | productSkuOrderProperty | `` | a810167f-b9ce-465d-ae5d-de40bc42b82f | `` |  |  |
| 65 | `skuAppliedOrderProperties` | skuAppliedOrderProperties | `` | 61b929f0-9b2e-438e-82d4-a4e978a184b9 | `` |  |  |
| 66 | `skuFreeDefine` | skuFreeDefine | `` | 7a2a3a0f-3df9-48de-9f55-3a9a890bd482 | `` |  |  |
| 67 | `skuOrderProperties` | skuOrderProperties | `` | ffe4348b-a1f1-41fe-a489-253ea8ff22d4 | `` |  |  |
| 68 | `skuTagNew` | skuTagNew | `` | 3fa4d3ea-fbf8-4f49-8b4f-9af7d282a8f6 | `` |  |  |
| 69 | `skuTags` | skuTags | `` | 668971d2-82e7-47fc-9015-08fca762b76c | `` |  |  |
| 70 | `skufreecharacteritems` | skufreecharacteritems | `` | 363dbf6a-5cb5-4aaf-9659-3fe073fad3e5 | `` |  |  |

## 关联属性（25 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 2 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 3 | `productSKUSpecItems` | productSKUSpecItems | `pc.product.ProductSKUSpecItem` | `` | productSKUSpecItems → skuId | 0..n | Y | None | true |
| 4 | `skuTags` | skuTags | `pc.product.SKUTagExtend` | `` | skuTags → skuId | 0..n | Y | None | true |
| 5 | `productSkuOrderProperty` | productSkuOrderProperty | `pc.product.ProductSkuOrderProperty` | `` | productSkuOrderProperty → skuId | 0..n | Y | None |  |
| 6 | `productSKUAppliedDetail` | productSKUAppliedDetail | `pc.product.ProductSKUDetail` | `` | productSKUAppliedDetail → skuId | 1 | Y | None | true |
| 7 | `skuTagNew` | skuTagNew | `pc.product.SkuTagNew` | `` | skuTagNew → skuId | 0..n | Y | None |  |
| 8 | `freeidx1` | reeidx1(金额) | `pc.userdef.UserDefineClass` | `freeidx1` | 外键 |  |  | None | true |
| 9 | `freeidx2` | reeidx2(金额) | `pc.userdef.UserDefineClass` | `freeidx2` | 外键 |  |  | None | true |
| 10 | `freeidx3` | reeidx3(金额) | `pc.userdef.UserDefineClass` | `freeidx3` | 外键 |  |  | None | true |
| 11 | `freeidx4` | reeidx4(金额) | `pc.userdef.UserDefineClass` | `freeidx4` | 外键 |  |  | None | true |
| 12 | `freeidx5` | reeidx5(金额) | `pc.userdef.UserDefineClass` | `freeidx5` | 外键 |  |  | None | true |
| 13 | `skudefine` | skudefine | `pc.product.ProductSKUDefine` | `` | skudefine → skuId | 1 | Y | None | true |
| 14 | `skuFreeDefine` | skuFreeDefine | `pc.product.ProductSkuFreeDefine` | `` | skuFreeDefine → id | 1 | Y | None | true |
| 15 | `productId` | productId | `pc.product.Product` | `productId` | productskus → productId | 0..n | Y | None |  |
| 16 | `productSkuDetailNew` | productSkuDetailNew | `pc.product.ProductSkuDetailNew` | `` | productSkuDetailNew → skuId | 0..n | Y | None |  |
| 17 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 18 | `productSkuCharacterDef` | productSkuCharacterDef | `pc.product.ProductSkuCharacterDef` | `productsku_character_def` | 外键 |  |  | None |  |
| 19 | `skuFreeCharacter` | skuFreeCharacter | `pc.product.SkuFreeCharacter` | `skufreecharacter` | 外键 |  |  | None |  |
| 20 | `skuOrderProperties` | skuOrderProperties | `pc.product.SKUOrderPropertyExtend` | `` | skuOrderProperties → skuId | 0..n | Y | None | true |
| 21 | `productSKUDetail` | productSKUDetail | `pc.product.ProductSKUExtend` | `` | productSKUDetail → skuId | 1 | Y | None | true |
| 22 | `skufreecharacteritems` | skufreecharacteritems | `pc.product.SkuFreeCharacterItem` | `` | skufreecharacteritems → skuId | 0..n | Y | None | true |
| 23 | `batchUnit` | batchUnit | `pc.unit.Unit` | `batchUnitId` | 外键 |  |  | None |  |
| 24 | `skuPropCharacter` | skuPropCharacter | `pc.product.SkuPropCharacter` | `skupropcharacter` | 外键 |  |  | None |  |
| 25 | `skuAppliedOrderProperties` | skuAppliedOrderProperties | `pc.product.SKUOrderProperty` | `` | skuAppliedOrderProperties → skuId | 0..n | Y | None | true |

---

## SQL 示例

```sql
SELECT id, productId, code, name, erpCode, cModelDescription, cModel, batchUnitId
FROM productsku
```