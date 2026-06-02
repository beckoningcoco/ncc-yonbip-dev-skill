---
tags: [BIP, 元数据, 数据字典, base.businesspartner.RoleClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 角色类别 (`base.businesspartner.RoleClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `base_role_class` | 应用: `DPMBP` | 类型: `Class`

## 属性（9 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `partnerId` | partnerID | `partnerId` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |
| 3 | `roleClassName` | roleClass名称 | `roleClassName` | RoleClassName | `` |
| 4 | `isCheck` | 是否Check | `isCheck` | Boolean | `switch` |
| 5 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 6 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 8 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 9 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `partnerId` -> `base.businesspartner.BusinessPartner` (0..n)
