---
tags: [BIP, 元数据, 数据字典, STB.sourceapplication.SourceApplication]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 来源应用 (`STB.sourceapplication.SourceApplication`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `stb_source_application` | 应用: `STB`

## 属性（16 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `name` | 名称 | `name` | String | `multiLanguage` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `frameWork` | frameWork | `frame_work` | Integer | `int` |
| 4 | `system` | system | `system` | String | `text` |
| 5 | `sortnum` | sortnum | `sort_num` | Integer | `int` |
| 6 | `category` | category | `category` | String | `text` |
| 7 | `categoryName` | category名称 | `category_name` | String | `multiLanguage` |
| 8 | `mappingapplicationdomain` | mappingapplicationdomain | `mapping_application_domain` | String | `multiLanguage` |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 10 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 12 | `id` | ID | `id` | String | `text` |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 16 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
