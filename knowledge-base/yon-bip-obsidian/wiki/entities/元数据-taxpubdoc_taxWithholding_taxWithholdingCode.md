---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxWithholding.taxWithholdingCode]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 代扣税税码 (`taxpubdoc.taxWithholding.taxWithholdingCode`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_withholding_code` | 应用: `DPMTAX`

## 属性（21 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `countryId` | countryID | `country_id` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `delFlag` | delFlag | `del_flag` | deleteFlag | `singleOption` |
| 5 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 6 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 7 | `drFlag` | drFlag | `dr_flag` | String | `text` |
| 8 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 9 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 10 | `id` | ID | `id` | String | `text` |
| 11 | `log` | log | `log` | String | `bigText` |
| 12 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 15 | `taskId` | taskID | `task_id` | String | `text` |
| 16 | `taxCalculatePoint` | taxCalculatePoint | `tax_calculate_point` | taxCalculationPointEnum | `multipleOption` |
| 17 | `taxCode` | tax编码 | `tax_code` | String | `text` |
| 18 | `taxCodeDescription` | taxCodeDescription | `tax_code_description` | String | `multiLanguage` |
| 19 | `taxWithholdingCodeSubList` | taxWithholdingCodeSubList | `` | 0b8d1aef-21b5-4089-bfc4-aa2d283826f8 | `` |
| 20 | `taxWithholdingScopeList` | taxWithholdingScopeList | `` | 185de92e-eb8f-4050-afdc-f3834340f2ed | `` |
| 21 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `creator` -> `base.user.BipUser` () 
- `taxWithholdingScopeList` -> `taxpubdoc.taxWithholding.taxWithholdingScope` (1..n) 
- `modifier` -> `base.user.BipUser` () 
- `taxWithholdingCodeSubList` -> `taxpubdoc.taxWithholding.taxWithholdingCodeSub` (1..n) 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `countryId` -> `bd.country.CountryVO` () 
