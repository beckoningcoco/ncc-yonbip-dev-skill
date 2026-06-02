---
tags: [BIP, 元数据, 数据字典, eeac.influencefactorsetting.InfluenceFactorDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 影响因素 (`eeac.influencefactorsetting.InfluenceFactorDO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `epub_influence_factor` | 应用: `EVNT`

## 属性（20 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `blnUserDef` | blnUserDef | `bln_user_def` | Boolean | `switch` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `doctypeId` | doctypeID | `doctype_id` | 2ecd73ee-bb84-43ef-aa19-faa40bdd87f0 | `quote` |
| 4 | `enumAttr` | enumAttr | `enum_attr` | String | `text` |
| 5 | `name` | 名称 | `name` | String | `multiLanguage` |
| 6 | `remarks` | remarks | `remarks` | String | `multiLanguage` |
| 7 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 8 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 9 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 10 | `sortNum` | sortNum | `sort_num` | Integer | `int` |
| 11 | `sysId` | sysID | `sys_id` | String | `text` |
| 12 | `usingStatus` | usingStatus | `using_status` | String | `text` |
| 13 | `id` | ID | `id` | String | `text` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 16 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 17 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 19 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 20 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（4 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `doctypeId` -> `epub.doctype.DoctypePO` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
