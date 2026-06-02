---
tags: [BIP, 元数据, 数据字典, hrcb.distributionSite.DistributionSite]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 站点 (`hrcb.distributionSite.DistributionSite`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `distribution_site` | 应用: `HRPUB` | 类型: `Class`

## 属性（18 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `description` | description | `description` | String | `multiLanguage` |
| 5 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 6 | `distributionSite` | distributionSite | `distribution_site` | 21622298-40b3-4de4-89a6-7b8a4db38679 | `quote` |
| 7 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 8 | `enable` | enable | `enable` | String | `text` |
| 9 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 10 | `id` | ID | `id` | String | `text` |
| 11 | `isMain` | 是否Main | `is_main` | Integer | `int` |
| 12 | `isThis` | 是否This | `is_this` | Integer | `int` |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 15 | `name` | 名称 | `name` | String | `multiLanguage` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 17 | `tenant` | tenant | `tenant_id` | String | `text` |
| 18 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `distributionSite` -> `hrcb.distributionSite.DistributionSite` ()
