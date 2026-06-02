---
tags: [BIP, 元数据, 数据字典, tmsp.fundbusinobjarchives.FundBusinObjArchivesItemarthivesItemCharacterDefineUserDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 资金业务伙伴_业务对象银行信息_自定义特征实体 (`tmsp.fundbusinobjarchives.FundBusinObjArchivesItemarthivesItemCharacterDefineUserDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tmsp_item_character_def` | 应用: `TMSP`

## 属性（4 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 2 | `id` | ID | `id` | String | `text` |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 4 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（1 个）

- `ytenantId` -> `yht.tenant.YhtTenant` () 
