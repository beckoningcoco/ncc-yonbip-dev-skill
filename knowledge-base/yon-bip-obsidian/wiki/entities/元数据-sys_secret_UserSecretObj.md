---
tags: [BIP, 元数据, 数据字典, sys.secret.UserSecretObj]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 用户密级枚举对象 (`sys.secret.UserSecretObj`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `military_usersecretobj` | 应用: `GFJGMJ` | 类型: `Class`

## 属性（15 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `text` |
| 4 | `secretType` | secretType | `secret_type` | Integer | `int` |
| 5 | `weight` | weight | `weight` | Integer | `int` |
| 6 | `enable` | enable | `enable` | Boolean | `switch` |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 8 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 9 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 10 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 11 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 14 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 15 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
