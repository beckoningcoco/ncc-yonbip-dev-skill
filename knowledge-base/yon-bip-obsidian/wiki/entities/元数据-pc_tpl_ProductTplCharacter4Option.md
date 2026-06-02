---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplCharacter4Option]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板选配-特征 (`pc.tpl.ProductTplCharacter4Option`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_tpl_character` | 应用: `GZTBDM` | 类型: `Class`

## 属性（29 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `template` | template | `tpl_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |
| 3 | `characteristicsType` | characteristicsType | `iCharacteristicsTypeId` | d4536390-1a46-49d5-8ffe-04412bfeb6d7 | `quote` |
| 4 | `characteristics` | characteristics | `iCharacteristicsId` | 2bbf5f38-d9cd-41f4-828c-936c89972323 | `quote` |
| 5 | `dataType` | dataType | `data_type` | Integer | `int` |
| 6 | `character` | character | `iCharacterId` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b | `quote` |
| 7 | `characterCode` | character编码 | `cCharacterCode` | String | `text` |
| 8 | `skuSens` | skuSens | `bSkuSens` | Integer | `int` |
| 9 | `batchSens` | batchSens | `bBatchSens` | Integer | `int` |
| 10 | `SNSens` | SNSens | `bSNSens` | Integer | `int` |
| 11 | `stockSens` | stockSens | `bStockSens` | Integer | `int` |
| 12 | `costAffec` | costAffec | `bCostAffec` | Integer | `int` |
| 13 | `BOMAffec` | BOMAffec | `bBOMAffec` | Integer | `int` |
| 14 | `manuAffec` | manuAffec | `bManuAffec` | Integer | `int` |
| 15 | `twoDimensionalInput` | twoDimensionalInput | `bTwoDimensionalInput` | Integer | `int` |
| 16 | `iOrder` | iOrder | `iOrder` | Integer | `int` |
| 17 | `webShow` | webShow | `web_show` | Integer | `int` |
| 18 | `priceAffec` | priceAffec | `bPriceAffec` | Integer | `int` |
| 19 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 21 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 22 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 23 | `creator` | 创建人 | `creator` | String | `text` |
| 24 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 25 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 26 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 27 | `modifier` | 修改人 | `modifier` | String | `text` |
| 28 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 29 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |

## 关联（8 个）

- `template` -> `pc.tpl.ProductTpl` (0..n)
- `character` -> `base.character.Character` ()
- `characteristics` -> `base.character.Characteristics` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `characteristicsType` -> `base.character.CharacteristicsType` ()
- `tenant` -> `base.tenant.Tenant` ()
