---
tags: [BIP, 元数据, 数据字典, pc.pub_org_group.PubOrgGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分级管理组织集合 (`pc.pub_org_group.PubOrgGroup`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pub_org_group` | 应用: `GZTBDM` | 类型: `Class`

## 属性（7 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `hashCode` | hash编码 | `hash_code` | String | `text` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `name` | 名称 | `name` | String | `text` |
| 5 | `orgGroupDetailList` | orgGroupDetailList | `` | c565ab23-e96c-4cb1-9008-44a5c660e0e0 | `` |
| 6 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `orgGroupDetailList` -> `pc.pub_org_group.PubOrgGroupDetail` (0..n)
