---
tags: [BIP, 元数据, 数据字典, tmsp.fundbusinobjtype.FundBusinObjType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 资金业务伙伴类型 (`tmsp.fundbusinobjtype.FundBusinObjType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tmsp_fundbusinobj_type` | 应用: `TMSP`

## 属性（25 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 3 | `enabled` | enabled | `enabled` | Boolean | `switch` |
| 4 | `ext` | ext | `ext` | String | `text` |
| 5 | `fundbusinobjbankid` | fundbusinobjbankid | `fundbusinobjbank_id` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 6 | `fundbusinobjid` | fundbusinobjid | `fundbusinobj_id` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 7 | `objectName` | object名称 | `objectName` | String | `multiLanguage` |
| 8 | `parent` | parent | `parent` | a1d6f36f-1ea8-46c7-a409-d38a0f14c292 | `quote` |
| 9 | `sort` | sort | `sort` | Integer | `int` |
| 10 | `systemPrepare` | systemPrepare | `systemPrepare` | Boolean | `switch` |
| 11 | `vouchdate` | vouchdate | `vouchdate` | String | `date` |
| 12 | `isEnd` | 是否End | `is_end` | Short | `short` |
| 13 | `name` | 名称 | `name` | String | `text` |
| 14 | `id` | ID | `id` | String | `text` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 17 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 18 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 20 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 21 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 22 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 23 | `level` | level | `level` | Integer | `int` |
| 24 | `path` | path | `path` | String | `text` |
| 25 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `parent` -> `tmsp.fundbusinobjtype.FundBusinObjType` () [废]
- `creator` -> `base.user.BipUser` () 
- `fundbusinobjid` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () [废]
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `fundbusinobjbankid` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () [废]
