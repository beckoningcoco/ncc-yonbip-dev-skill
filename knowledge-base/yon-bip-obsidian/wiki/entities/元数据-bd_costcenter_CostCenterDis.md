---
tags: [BIP, 元数据, 数据字典, bd.costcenter.CostCenterDis]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本中心组织信息 (`bd.costcenter.CostCenterDis`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_costcenter_dis` | 应用: `DPMACCT` | 类型: `Class`

## 属性（17 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `header` | header | `header` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 3 | `enableDate` | enableDate | `enabledate` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 6 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 7 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 8 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 11 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 12 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 13 | `profitCenter` | profitCenter | `profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 14 | `modifier` | 修改人 | `modifier` | String | `text` |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 16 | `accPurpose` | accPurpose | `acc_purpose` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | `quote` |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `header` -> `bd.costcenter.CostCenter` (0..n)
- `profitCenter` -> `bd.virtualaccbody.VirtualAccbody` ()
- `accPurpose` -> `bd.accpurpose.AccPurposeVO` ()
- `tenant` -> `base.tenant.Tenant` ()
