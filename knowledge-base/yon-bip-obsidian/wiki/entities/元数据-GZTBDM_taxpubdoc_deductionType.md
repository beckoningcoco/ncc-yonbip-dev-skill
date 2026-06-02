---
tags: [BIP, 元数据, 数据字典, GZTBDM.taxpubdoc.deductionType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 抵扣类型 (`GZTBDM.taxpubdoc.deductionType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_deduction_type` | 应用: `DPMTAX`

## 属性（17 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `name` | 名称 | `name` | String | `multiLanguage` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 4 | `classification` | classification | `classification` | taxDeductionClassification | `singleOption` |
| 5 | `taxCategoryId` | taxCategoryID | `tax_category_id` | 01a37978-70b8-4e8c-83d7-3a9b79d84917 | `quote` |
| 6 | `isGlobal` | 是否Global | `is_global` | taxpubdocYNEnum | `singleOption` |
| 7 | `id` | ID | `id` | String | `text` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 10 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 13 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 14 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 15 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 16 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 17 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（5 个）

- `country` -> `bd.country.CountryVO` () [废]
- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `taxCategoryId` -> `archive.taxArchives.TaxCategoryArchive` () [废]
