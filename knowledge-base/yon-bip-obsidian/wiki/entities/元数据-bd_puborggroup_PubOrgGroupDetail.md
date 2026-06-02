---
tags: [BIP, 元数据, 数据字典, bd.puborggroup.PubOrgGroupDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分级管理集合详情 (`bd.puborggroup.PubOrgGroupDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pub_org_group_detail` | 应用: `DPMPI` | 类型: `Class`

## 属性（5 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `groupId` | 组ID | `group_id` | 44210b7f-0ffa-4cf9-be11-8fdfa006a2ae | `quote` |
| 2 | `id` | ID | `id` | String | `text` |
| 3 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 4 | `tenant` | tenant | `tenantid` | String | `text` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `groupId` -> `bd.puborggroup.PubOrgGroup` (0..n)
- `orgId` -> `org.func.BaseOrg` ()
