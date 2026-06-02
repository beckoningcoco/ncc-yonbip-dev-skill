---
tags: [BIP, 元数据, 数据字典, bd.project.ProjectApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目适用范围 (`bd.project.ProjectApplyRange`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_project_applyrange` | 应用: `DPMPRJ` | 类型: `Class`

## 属性（6 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `rangeOrgId` | rangeOrgID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 3 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 4 | `isCreator` | 是否Creator | `iscreator` | Integer | `int` |
| 5 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 6 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `projectId` -> `bd.project.ProjectVO` (0..n)
- `rangeOrgId` -> `org.func.BaseOrg` ()
