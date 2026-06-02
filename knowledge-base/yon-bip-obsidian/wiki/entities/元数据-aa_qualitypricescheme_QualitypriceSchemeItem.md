---
tags: [BIP, 元数据, 数据字典, aa.qualitypricescheme.QualitypriceSchemeItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 优质优价方案组成项 (`aa.qualitypricescheme.QualitypriceSchemeItem`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cpu_qualityprice_scheme_item` | 应用: `ycPriceCenter`

## 属性（21 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `schemaLineNumber` | schemaLineNumber | `schema_line_number` | String | `text` |
| 3 | `priceStandardId` | priceStandardID | `price_standard_id` | bf9f35b7-ea48-444e-9de9-dee31f271568 | `quote` |
| 4 | `priority` | priority | `priority` | String | `text` |
| 5 | `featureValueTreatmentMethod` | featureValueTreatmentMethod | `feature_value_treatment_method` | FeatureValueTreatmentMethodEnum | `` |
| 6 | `transmitParam` | transmitParam | `transmit_param` | String | `text` |
| 7 | `vmemo` | vmemo | `vmemo` | String | `text` |
| 8 | `transmitParamIds` | transmitParamIds | `transmit_param_ids` | String | `text` |
| 9 | `QualitypriceSchemeItemDefineCharacter` | QualitypriceSchemeItemDefineCharacter | `cpu_qualityprice_scheme_item_define` | 76c48783-e279-464e-9bd6-a9a0224b6198 | `UserDefine` |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `emptyResultProcessMethod` | emptyResultProcessMethod | `empty_result_process_method` | EmptyResultProcessMethod | `` |
| 13 | `featureValueTreatmentScope` | featureValueTreatmentScope | `feature_value_treatment_scope` | String | `text` |
| 14 | `halfAdjustType` | halfAdjustType | `halfAdjustType` | HalfAdjustType | `` |
| 15 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 17 | `numLength` | numLength | `numLength` | Short | `short` |
| 18 | `priceSchemeId` | priceSchemeID | `price_scheme_id` | c7cc8895-2b03-4c7d-a327-da6e09410f76 | `quote` |
| 19 | `priceSchemeItemTransmitParamList` | priceSchemeItemTransmitParamList | `` | 4f54bcbf-65e8-43df-91db-f3aec2f86ace | `` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 21 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `creator` -> `base.user.BipUser` () 
- `priceSchemeItemTransmitParamList` -> `aa.qualitypricescheme.TransmitParam` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `QualitypriceSchemeItemDefineCharacter` -> `aa.qualitypricescheme.QualitypriceSchemeItemDefine` () 
- `priceSchemeId` -> `aa.qualitypricescheme.QualitypriceScheme` (1..n) 
- `priceStandardId` -> `aa.qualitypricestandard.PriceStandard` () 
