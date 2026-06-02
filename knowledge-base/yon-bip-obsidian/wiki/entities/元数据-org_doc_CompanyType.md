---
tags: [BIP, 元数据, 数据字典, org.doc.CompanyType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 组织形态 (`org.doc.CompanyType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_company_type` | 应用: `GZTORG` | 类型: `Class`

## 属性（24 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `name2` | name2 | `name2` | String | `text` |
| 5 | `name3` | name3 | `name3` | String | `text` |
| 6 | `name4` | name4 | `name4` | String | `text` |
| 7 | `name5` | name5 | `name5` | String | `text` |
| 8 | `name6` | name6 | `name6` | String | `text` |
| 9 | `displayorder` | displayorder | `displayorder` | Integer | `int` |
| 10 | `enable` | enable | `enable` | Integer | `int` |
| 11 | `memo` | 备注 | `memo` | String | `text` |
| 12 | `creator` | 创建人 | `creator` | String | `text` |
| 13 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 14 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 15 | `modifiedtime` | modifiedtime | `modifiedtime` | Date | `date` |
| 16 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 17 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 18 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 19 | `sysid` | sysid | `sysid` | String | `text` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 21 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 22 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 23 | `sysdefine` | sysdefine | `sysdefine` | Integer | `int` |
| 24 | `relatedFunc` | relatedFunc | `related_func` | String | `text` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
