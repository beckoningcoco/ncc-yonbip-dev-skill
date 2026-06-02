---
tags: [BIP, 元数据, 数据字典, bd.enterprise.AccountPurposeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 账户用途 (`bd.enterprise.AccountPurposeVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_account_purpose` | 应用: `DPMSETL`

## 属性（18 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `isdefault` | 是否default | `isdefault` | Boolean | `switch` |
| 5 | `description` | description | `description` | String | `text` |
| 6 | `sourcetype` | sourcetype | `sourcetype` | Boolean | `switch` |
| 7 | `log` | log | `log` | String | `text` |
| 8 | `sysid` | sysid | `sysid` | String | `text` |
| 9 | `enable` | enable | `enable` | Integer | `int` |
| 10 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 14 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 15 | `tenant` | tenant | `tenantid` | String | `text` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 18 | `sort` | sort | `sort` | Integer | `int` |

## 关联（3 个）

- `creator` -> `base.user.BipUser` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
