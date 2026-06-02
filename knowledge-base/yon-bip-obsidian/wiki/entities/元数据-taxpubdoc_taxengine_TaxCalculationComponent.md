---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxengine.TaxCalculationComponent]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 计税组件 (`taxpubdoc.taxengine.TaxCalculationComponent`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_calculation_component` | 应用: `DPMTAX`

## 属性（24 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `taxBaseFormulaName` | taxBaseFormula名称 | `tax_base_formula_name` | String | `text` |
| 2 | `formulaName` | formula名称 | `formula_name` | String | `bigText` |
| 3 | `applicationType` | applicationType | `application_type` | TaxCalcAppType | `singleOption` |
| 4 | `formula` | formula | `formula` | String | `bigText` |
| 5 | `taxCategoryId` | taxCategoryID | `tax_category_id` | 01a37978-70b8-4e8c-83d7-3a9b79d84917 | `quote` |
| 6 | `taxItemId` | taxItemID | `tax_item_id` | 0eea81a1-2a5f-4f44-af40-c1da88b6edde | `quote` |
| 7 | `taxBureauId` | taxBureauID | `tax_bureau_id` | d910183c-a1c4-48b2-8bc4-0b9f1dda6eb8 | `quote` |
| 8 | `componentCode` | component编码 | `component_code` | String | `text` |
| 9 | `formulaJson` | formulaJson | `formula_json` | String | `bigText` |
| 10 | `taxSubItem` | taxSubItem | `tax_sub_item` | String | `text` |
| 11 | `name` | 名称 | `name` | String | `multiLanguage` |
| 12 | `taxBaseFormula` | taxBaseFormula | `tax_base_formula` | String | `bigText` |
| 13 | `id` | ID | `id` | String | `text` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 16 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 17 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 19 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 20 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 21 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 22 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 23 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 24 | `TaxCalculationComponentDetailList` | TaxCalculationComponentDetailList | `` | 16cf0e36-9b2f-4afd-9b23-d03d7cbab7cd | `` |

## 关联（7 个）

- `creator` -> `base.user.BipUser` () 
- `taxBureauId` -> `archive.taxArchives.TaxBureauArchive` () [废]
- `modifier` -> `base.user.BipUser` () 
- `TaxCalculationComponentDetailList` -> `taxpubdoc.taxengine.TaxCalculationComponentDetail` (0..n) 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `taxItemId` -> `taxpubdoc.taxpubdoc.TaxItem` () [废]
- `taxCategoryId` -> `archive.taxArchives.TaxCategoryArchive` () [废]
