---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxWithholding.taxWithholdingType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 代扣税类型 (`taxpubdoc.taxWithholding.taxWithholdingType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_withholding_type` | 应用: `DPMTAX`

## 属性（23 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accumulateType` | accumulateType | `accumulate_type` | accumulateType | `singleOption` |
| 2 | `accuracy` | accuracy | `accuracy` | Integer | `int` |
| 3 | `countryId` | countryID | `country_id` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 5 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 6 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 7 | `description` | description | `description` | String | `multiLanguage` |
| 8 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 9 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 10 | `drFlag` | drFlag | `dr_flag` | String | `text` |
| 11 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 12 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 13 | `id` | ID | `id` | String | `text` |
| 14 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 17 | `roundingRule` | roundingRule | `rounding_rule` | taxRoundingRule | `singleOption` |
| 18 | `taxBasis` | taxBasis | `tax_basis` | taxBasisEnum | `singleOption` |
| 19 | `taxCategoryArchiveId` | taxCategoryArchiveID | `tax_category_archive_id` | 01a37978-70b8-4e8c-83d7-3a9b79d84917 | `quote` |
| 20 | `taxRateCode` | taxRate编码 | `tax_rate_code` | String | `text` |
| 21 | `taxRateId` | taxRateID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 22 | `taxWithholdingTypeCode` | taxWithholdingType编码 | `tax_withholding_type_code` | String | `text` |
| 23 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `taxCategoryArchiveId` -> `archive.taxArchives.TaxCategoryArchive` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () 
- `taxRateId` -> `archive.taxArchives.TaxRateArchive` () 
- `countryId` -> `bd.country.CountryVO` () 
