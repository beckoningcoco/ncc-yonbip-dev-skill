---
tags: [BIP, 元数据, 数据字典, pc, pc.tpl.ProductTpl]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 物料模板 (`pc.tpl.ProductTpl`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_tpl` | 应用: `GZTBDM`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |

## 全部属性（41 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 3 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 4 | `name` | 名称 | `cName` | String | `multiLanguage` | true | true |
| 5 | `deliveryType` | deliveryType | `dlyFeeRuleId` | b4505671-79b1-4593-8be4-ddc7eed18484 | `quote` |  | true |
| 6 | `enableCyclePurchase` | enableCyclePurchase | `iEnableCyclePurchase` | Boolean | `switch` |  | true |
| 7 | `involveSKUNaming` | involveSKUNaming | `isInvolveSKUNaming` | Boolean | `switch` |  | true |
| 8 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 9 | `skuBusinessDynamic` | skuBusinessDynamic | `sku_business_dynamic` | Boolean | `switch` |  | true |
| 10 | `nameSpacer` | nameSpacer | `nameSpacer` | String | `text` |  | true |
| 11 | `FreightRule` | FreightRule | `freightId` | Long | `long` |  | true |
| 12 | `freeCT` | freeCT | `iFreeCT` | 2bbf5f38-d9cd-41f4-828c-936c89972323 | `quote` |  | true |
| 13 | `materialPropCT` | materialPropCT | `iMaterialPropCT` | 2bbf5f38-d9cd-41f4-828c-936c89972323 | `quote` |  | true |
| 14 | `skuPropCT` | skuPropCT | `iSkuPropCT` | 2bbf5f38-d9cd-41f4-828c-936c89972323 | `quote` |  | true |
| 15 | `isOptionalTemplate` | 是否OptionalTemplate | `is_optional_template` | Integer | `int` |  | true |
| 16 | `optionCT` | optionCT | `iOptionCT` | 2bbf5f38-d9cd-41f4-828c-936c89972323 | `quote` |  | true |
| 17 | `enableWeighing` | enableWeighing | `iEnableWeighing` | Boolean | `switch` |  | true |
| 18 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 19 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |  | true |
| 20 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |  | true |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 22 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 23 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 24 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 25 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 26 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 27 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 28 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 31 | `Brands` | Brands | `` | 4c3c3979-84fc-48e7-8717-deb6be946037 | `` |  |  |
| 32 | `CycleProperties` | CycleProperties | `` | f1e17219-7af3-460c-a7a9-335bf0fe150b | `` |  |  |
| 33 | `OrderProperties` | OrderProperties | `` | 8ce8fd53-c231-4a19-953d-5081a4c9bf20 | `` |  |  |
| 34 | `OrderPropertySums` | OrderPropertySums | `` | 1e8003d3-2660-4335-805a-9787b3decd23 | `` |  |  |
| 35 | `Parameters` | Parameters | `` | c06be101-c80b-40a1-b607-c41329151c48 | `` |  |  |
| 36 | `Units` | Units | `` | b3dff947-0b1d-4fdb-8215-8c4f5c4be7dc | `` |  |  |
| 37 | `freeCharacters` | freeCharacters | `` | 90afd2b1-265d-40fd-b988-b13b3f8ac5fb | `` |  |  |
| 38 | `optionCharacters` | optionCharacters | `` | 58e1b64e-2e00-4053-8e04-2b938b90e3df | `` |  |  |
| 39 | `productPropCharacters` | productPropCharacters | `` | 3c3d20c9-3a0f-4ad3-ba43-6de74aa1de80 | `` |  |  |
| 40 | `productTplAssistUnitExchanges` | productTplAssistUnitExchanges | `` | 00812a8b-9368-4c11-b99d-b341bd3432b2 | `` |  |  |
| 41 | `skuCharacters` | skuCharacters | `` | f43be8a9-4112-494b-879b-f05e02f7bf0e | `` |  |  |

## 关联属性（20 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `CycleProperties` | `pc.tpl.ProductTplCycleProperty` | `` | 0..n | Y |  |
| 2 | `skuPropCT` | `base.character.Characteristics` | `iSkuPropCT` |  |  |  |
| 3 | `Parameters` | `pc.tpl.ProductTplParameter` | `` | 0..n | Y |  |
| 4 | `productTplAssistUnitExchanges` | `pc.tpl.ProductTplAssistUnitExchange` | `` | 0..n | Y |  |
| 5 | `freeCharacters` | `pc.tpl.ProductTplCharacter` | `` | 0..n | Y |  |
| 6 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 7 | `productPropCharacters` | `pc.tpl.ProductTplCharacter4ProductProp` | `` | 0..n | Y |  |
| 8 | `deliveryType` | `um.logisticssetting.Deliverytype` | `dlyFeeRuleId` |  |  |  |
| 9 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 10 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 11 | `skuCharacters` | `pc.tpl.ProductTplCharacter4SKU` | `` | 0..n | Y |  |
| 12 | `optionCT` | `base.character.Characteristics` | `iOptionCT` |  |  |  |
| 13 | `optionCharacters` | `pc.tpl.ProductTplCharacter4Option` | `` | 0..n | Y |  |
| 14 | `Units` | `pc.tpl.ProductTplUnit` | `` | 0..n | Y |  |
| 15 | `OrderProperties` | `pc.tpl.ProductTplOrderProperty` | `` | 0..n | Y |  |
| 16 | `Brands` | `pc.tpl.ProductTplBrand` | `` | 0..n | Y |  |
| 17 | `OrderPropertySums` | `pc.tpl.ProductTplOrderPropertySum` | `` | 0..n | Y |  |
| 18 | `freeCT` | `base.character.Characteristics` | `iFreeCT` |  |  |  |
| 19 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |
| 20 | `materialPropCT` | `base.character.Characteristics` | `iMaterialPropCT` |  |  |  |

## 依赖接口（7 个）

- `ITenant` → `base.itf.ITenant` (v73)
- `IErpCode` → `base.itf.IErpCode` (v73)
- `IAuditInfo` → `base.itf.IAuditInfo` (v340)
- `Deletable` → `base.itf.Deletable` (v67)
- `IStopping` → `base.itf.IStopping` (v111)
- `ISociCoreArchive` → `base.itf.ISociCoreArchive` (v28)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)

## SQL 示例

```sql
SELECT id, ytenant_id, erpCode, cName, dlyFeeRuleId, iEnableCyclePurchase, isInvolveSKUNaming, stopstatus
FROM product_tpl
```