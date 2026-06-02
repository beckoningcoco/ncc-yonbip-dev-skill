---
tags: [BIP, 元数据, 数据字典, org.doc.DeptType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 部门性质 (`org.doc.DeptType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_dept_type` | 应用: `GZTORG` | 类型: `Class`

## 属性（20 个）

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
| 9 | `helpcode` | helpcode | `helpcode` | String | `text` |
| 10 | `displayorder` | displayorder | `displayorder` | Integer | `int` |
| 11 | `enable` | enable | `enable` | Integer | `int` |
| 12 | `memo` | 备注 | `memo` | String | `text` |
| 13 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 14 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 15 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 16 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 18 | `sysid` | sysid | `sysid` | String | `text` |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 20 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（3 个）

- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
