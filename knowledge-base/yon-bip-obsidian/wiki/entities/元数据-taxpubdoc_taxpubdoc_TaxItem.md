---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxpubdoc.TaxItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 税目 (`taxpubdoc.taxpubdoc.TaxItem`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_item` | 应用: `DPMTAX`

## 属性（22 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `define` | define | `define` | ddd44cdc-b4cd-4919-a543-4d899350e68c | `UserDefine` |
| 2 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 3 | `itemCode` | item编码 | `item_code` | String | `text` |
| 4 | `precision` | precision | `precision` | Integer | `int` |
| 5 | `taxBureauId` | taxBureauID | `tax_bureau_id` | d910183c-a1c4-48b2-8bc4-0b9f1dda6eb8 | `quote` |
| 6 | `taxCategoryId` | taxCategoryID | `tax_category_id` | 01a37978-70b8-4e8c-83d7-3a9b79d84917 | `quote` |
| 7 | `taxItem` | taxItem | `tax_item` | String | `multiLanguage` |
| 8 | `taxRateName` | taxRate名称 | `tax_rate_name` | String | `text` |
| 9 | `taxSubItem` | taxSubItem | `tax_sub_item` | String | `multiLanguage` |
| 10 | `taxrateId` | taxrateID | `taxrate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 11 | `withholdRemit` | withholdRemit | `with_hold_remit` | taxYesNo1 | `singleOption` |
| 12 | `id` | ID | `id` | String | `text` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 15 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 16 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 18 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 19 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 20 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 21 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 22 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（8 个）

- `country` -> `bd.country.CountryVO` () [废]
- `creator` -> `base.user.BipUser` () 
- `taxrateId` -> `archive.taxArchives.TaxRateArchive` () [废]
- `taxBureauId` -> `archive.taxArchives.TaxBureauArchive` () [废]
- `modifier` -> `base.user.BipUser` () 
- `define` -> `taxpubdoc.taxpubdoc.TaxItemdefineUserDefine` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `taxCategoryId` -> `archive.taxArchives.TaxCategoryArchive` () [废]
