---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxengine.TaxCode]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 税码 (`taxpubdoc.taxengine.TaxCode`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_code` | 应用: `DPMTAX`

## 属性（14 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `name` | 名称 | `name` | String | `multiLanguage` |
| 2 | `taxCode` | tax编码 | `tax_code` | String | `text` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 6 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 7 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 9 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 10 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 11 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 12 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 13 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 14 | `TaxCodeDetailList` | TaxCodeDetailList | `` | e5271a8d-1197-4b0e-aef1-c58524a99855 | `` |

## 关联（4 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `TaxCodeDetailList` -> `taxpubdoc.taxengine.TaxCodeDetail` (0..n) 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
