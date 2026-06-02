---
tags: [BIP, 元数据, 数据字典, hrxc.mddGroupDoc.waGroupDoc]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资组参照 (`hrxc.mddGroupDoc.waGroupDoc`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `wa_group_doc` | 应用: `HRXZHS_MDD` | 类型: `Class`

## 属性（27 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `orgId` | 组织ID | `ORGID` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |
| 2 | `description2` | description2 | `DESCRIPTION2` | String | `text` |
| 3 | `description3` | description3 | `DESCRIPTION3` | String | `text` |
| 4 | `description4` | description4 | `DESCRIPTION4` | String | `text` |
| 5 | `description5` | description5 | `DESCRIPTION5` | String | `text` |
| 6 | `description6` | description6 | `DESCRIPTION6` | String | `text` |
| 7 | `orgName` | org名称 | `ORG_NAME` | String | `text` |
| 8 | `name2` | name2 | `NAME2` | String | `text` |
| 9 | `name3` | name3 | `NAME3` | String | `text` |
| 10 | `name4` | name4 | `NAME4` | String | `text` |
| 11 | `name5` | name5 | `NAME5` | String | `text` |
| 12 | `name6` | name6 | `NAME6` | String | `text` |
| 13 | `code` | 编码 | `CODE` | String | `text` |
| 14 | `name` | 名称 | `NAME` | String | `multiLanguage` |
| 15 | `description` | description | `DESCRIPTION` | String | `text` |
| 16 | `enable` | enable | `ENABLE` | Integer | `int` |
| 17 | `id` | ID | `ID` | String | `text` |
| 18 | `dr` | 逻辑删除 | `DR` | Integer | `int` |
| 19 | `pubts` | 时间戳 | `PUBTS` | DateTime | `timestamp` |
| 20 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 21 | `creator` | 创建人 | `CREATOR` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 22 | `createTime` | 创建时间 | `CREATIONTIME` | DateTime | `timestamp` |
| 23 | `modifier` | 修改人 | `MODIFIER` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 24 | `modifyTime` | 修改时间 | `MODIFIEDTIME` | DateTime | `timestamp` |
| 25 | `ts` | ts | `TS` | DateTime | `timestamp` |
| 26 | `tenant` | tenant | `TENANTID` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 27 | `waGroupAuths` | waGroupAuths | `` | 27570a4a-7ee6-426c-b2d5-93fe803ff309 | `` |

## 关联（6 个）

- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `orgId` -> `org.func.AdminOrg` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
- `waGroupAuths` -> `hrxc.mddGroupDoc.WaGroupDocAuth` (0..n)
