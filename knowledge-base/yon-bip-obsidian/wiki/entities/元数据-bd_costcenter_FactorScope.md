---
tags: [BIP, 元数据, 数据字典, bd.costcenter.FactorScope]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 要素范围 (`bd.costcenter.FactorScope`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_factor_scope_relation` | 应用: `DPMACCT` | 类型: `Class`

## 属性（15 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 3 | `creator` | 创建人 | `creator` | String | `text` |
| 4 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 5 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 6 | `factorScope` | factorScope | `factor_scope` | c823e22a-3b1f-4c41-9cf5-11f2b56f6fd2 | `quote` |
| 7 | `header` | header | `header` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 8 | `id` | ID | `id` | Long | `long` |
| 9 | `modifier` | 修改人 | `modifier` | String | `text` |
| 10 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 14 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 15 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `header` -> `bd.costcenter.CostCenter` (0..n)
- `factorScope` -> `bd.costcenter.CostCenterFactorScope` ()
- `tenant` -> `base.tenant.Tenant` ()
