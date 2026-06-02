---
tags: [BIP, 元数据, 数据字典, archive.taxArchives.progressiveTaxRate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 累进税率 (`archive.taxArchives.progressiveTaxRate`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `progressive_tax_rate` | 应用: `DPMTAX` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `accumulateTaxInBegin` | accumulateTaxInBegin | `accumulate_tax_in_begin` | Decimal | `number` |
| 2 | `accumulateTaxInEnd` | accumulateTaxInEnd | `accumulate_tax_in_end` | Decimal | `number` |
| 3 | `progressiveTaxRate` | progressiveTaxRate | `progressive_tax_rate` | Decimal | `number` |
| 4 | `quickDeduction` | quickDeduction | `quick_deduction` | Decimal | `number` |
| 5 | `taxRateArchiveId` | taxRateArchiveID | `tax_rate_archive_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 7 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 9 | `id` | ID | `id` | String | `text` |
| 10 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 13 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `creator` -> `base.user.BipUser` ()
- `modifier` -> `base.user.BipUser` ()
- `taxRateArchiveId` -> `archive.taxArchives.TaxRateArchive` (0..n)
- `ytenantId` -> `yht.tenant.YhtTenant` ()
