---
tags: [BIP, 元数据, 数据字典, bd.project.ProjectClassVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目类别 (`bd.project.ProjectClassVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_projectclass` | 应用: `DPMPRJ` | 类型: `Class`

## 属性（24 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` |
| 5 | `objid` | objid | `objid` | String | `text` |
| 6 | `parent` | parent | `parent_id` | 5924adca-3894-4034-85ac-3a1b9222c69d | `quote` |
| 7 | `description` | description | `description` | String | `multiLanguage` |
| 8 | `enable` | enable | `enable` | Integer | `int` |
| 9 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 10 | `sysid` | sysid | `sysid` | String | `text` |
| 11 | `level` | 层级 | `level` | Integer | `int` |
| 12 | `path` | path | `path` | String | `text` |
| 13 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 14 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 15 | `defineCharacter` | defineCharacter | `defineCharacter` | de126978-f360-452a-b5ff-62997b274b61 | `UserDefine` |
| 16 | `log` | log | `log` | String | `text` |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 19 | `tenant` | tenant | `tenantid` | String | `text` |
| 20 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 21 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 22 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 23 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 24 | `execStatus` | execStatus | `exec_status` | String | `text` |

## 关联（6 个）

- `parent` -> `bd.project.ProjectClassVO` ()
- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `defineCharacter` -> `bd.project.ProjectClassVODefineCharacter` ()
- `orgid` -> `org.func.BaseOrg` ()
