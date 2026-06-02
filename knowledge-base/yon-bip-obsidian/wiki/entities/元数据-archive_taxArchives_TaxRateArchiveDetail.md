---
tags: [BIP, 元数据, 数据字典, archive.taxArchives.TaxRateArchiveDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税率档案明细 (`archive.taxArchives.TaxRateArchiveDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_taxrate_detail` | 应用: `DPMTAX` | 类型: `Class`

## 属性（17 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `unit` | unit | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 2 | `effectiveDate` | effectiveDate | `effective_date` | String | `date` |
| 3 | `ntaxrate` | ntaxrate | `ntaxrate` | Decimal | `number` |
| 4 | `taxRateArchiveId` | taxRateArchiveID | `taxRateArchive_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 5 | `taxfree` | taxfree | `taxfree` | Boolean | `switch` |
| 6 | `notaxation` | notaxation | `notaxation` | Boolean | `switch` |
| 7 | `define` | define | `define` | aa6ce0d7-dc0c-4003-b8de-613de5dcc6e1 | `UserDefine` |
| 8 | `invalidationDate` | invalidationDate | `invalidation_date` | String | `date` |
| 9 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 13 | `id` | ID | `id` | String | `text` |
| 14 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 17 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `unit` -> `pc.unit.Unit` ()
- `creator` -> `base.user.BipUser` ()
- `modifier` -> `base.user.BipUser` ()
- `define` -> `archive.taxArchives.TaxRateArchiveDetaildefineUserDefine` ()
- `taxRateArchiveId` -> `archive.taxArchives.TaxRateArchive` (0..n)
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
