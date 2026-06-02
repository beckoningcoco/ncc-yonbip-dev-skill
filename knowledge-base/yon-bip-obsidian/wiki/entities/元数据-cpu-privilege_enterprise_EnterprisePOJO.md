---
tags: [BIP, 元数据, 数据字典, cpu-privilege.enterprise.EnterprisePOJO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 企业 (`cpu-privilege.enterprise.EnterprisePOJO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cpu_enterprise` | 应用: `` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `address` | address | `address` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 4 | `id` | ID | `id` | Long | `long` |
| 5 | `loginChannl` | loginChannl | `login_channel` | String | `text` |
| 6 | `name` | 名称 | `name` | String | `text` |
| 7 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 8 | `supply` | supply | `supply` | String | `text` |
| 9 | `tenantid` | tenantid | `tenant_id` | String | `text` |
| 10 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 11 | `ycnCode` | ycn编码 | `ycn_code` | String | `text` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（1 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
