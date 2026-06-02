---
tags: [BIP, 元数据, 数据字典, archive.taxArchives.TaxCategoryArchive]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税种档案 (`archive.taxArchives.TaxCategoryArchive`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_category_archive` | 应用: `DPMTAX` | 类型: `Class`

## 属性（26 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `applicationScene` | applicationScene | `application_scene` | applicationScenes | `multipleOption` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 4 | `countryCode` | country编码 | `country_code` | String | `text` |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 6 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 7 | `currency` | currency | `income_currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 8 | `defaultPrecision` | defaultPrecision | `default_precision` | Integer | `int` |
| 9 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 10 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 11 | `effectiveDate` | effectiveDate | `effective_date` | String | `date` |
| 12 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 13 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 14 | `exchangeRateType` | exchangeRateType | `exchange_rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 15 | `id` | ID | `id` | String | `text` |
| 16 | `invalidationDate` | invalidationDate | `invalidation_date` | String | `date` |
| 17 | `isGlobal` | 是否Global | `is_global` | YNEnum | `singleOption` |
| 18 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 20 | `name` | 名称 | `name` | String | `multiLanguage` |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 22 | `socialData` | socialData | `social_data` | taxpubdoc_tax_bureau_archive_social_data | `singleOption` |
| 23 | `taxBureauArchiveId` | taxBureauArchiveID | `tax_bureau_archive_id` | d910183c-a1c4-48b2-8bc4-0b9f1dda6eb8 | `quote` |
| 24 | `taxPeriodType` | taxPeriodType | `tax_period_type` | taxPeriod | `multipleOption` |
| 25 | `taxRoundingRule` | taxRoundingRule | `tax_rounding_rule` | taxRoundingRule | `singleOption` |
| 26 | `ytenantId` | ytenantID | `ytenant_id` | String | `text` |

## 关联（6 个）

- `country` -> `bd.country.CountryVO` ()
- `exchangeRateType` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `creator` -> `base.user.BipUser` ()
- `modifier` -> `base.user.BipUser` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `taxBureauArchiveId` -> `archive.taxArchives.TaxBureauArchive` ()
