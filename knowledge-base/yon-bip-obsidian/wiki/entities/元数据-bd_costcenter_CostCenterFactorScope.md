---
tags: [BIP, 元数据, 数据字典, bd.costcenter.CostCenterFactorScope]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 要素范围 (`bd.costcenter.CostCenterFactorScope`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_factor_scope` | 应用: `DPMACCT` | 类型: `Class`

## 属性（18 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 7 | `enableDate` | enableDate | `enabledate` | DateTime | `timestamp` |
| 8 | `expireDate` | expireDate | `expiredate` | DateTime | `timestamp` |
| 9 | `id` | ID | `id` | Long | `long` |
| 10 | `manager` | manager | `manager` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 11 | `modifier` | 修改人 | `modifier` | String | `text` |
| 12 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 15 | `name` | 名称 | `name` | String | `multiLanguage` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 17 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 18 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `manager` -> `bd.staff.Staff` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `tenant` -> `base.tenant.Tenant` ()
