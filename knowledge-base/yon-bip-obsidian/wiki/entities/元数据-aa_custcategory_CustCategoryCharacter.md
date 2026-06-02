---
tags: [BIP, 元数据, 数据字典, aa.custcategory.CustCategoryCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户分类特征自定义项 (`aa.custcategory.CustCategoryCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `agentcategory_character` | 应用: `DPMCUS` | 类型: `Class`

## 属性（5 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `CQ111` | CQ111 | `vcol1` | 7f5ae223-0579-4c27-a0f1-11bf4fd9ff45 | `quote` |
| 2 | `GXXKHFL01` | GXXKHFL01 | `vcol55` | String | `text` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `CQ111` -> `bd.customerdoc_CQ111.CQ111` ()
