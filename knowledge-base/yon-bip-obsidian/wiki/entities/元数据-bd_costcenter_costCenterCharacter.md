---
tags: [BIP, 元数据, 数据字典, bd.costcenter.costCenterCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本中心特征 (`bd.costcenter.costCenterCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_costcenter_ch` | 应用: `DPMACCT` | 类型: `Class`

## 属性（6 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `XCDJ` | XCDJ | `vcol1` | 1c45fed3-b15f-43c3-967a-c96d6c885904 | `quote` |
| 2 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 5 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 6 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `XCDJ` -> `bd.customerdoc_XCDA.XCDA` ()
- `tenant` -> `base.tenant.Tenant` ()
