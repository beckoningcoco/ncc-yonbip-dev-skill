---
tags: [BIP, 元数据, 数据字典, bd.costcenter.ContrastRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 对照关系 (`bd.costcenter.ContrastRelation`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_contrast_relation` | 应用: `DPMACCT` | 类型: `Class`

## 属性（21 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `header` | header | `header` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 3 | `accentity` | accentity | `accentity` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | `quote` |
| 4 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 5 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 7 | `creator` | 创建人 | `creator` | String | `text` |
| 8 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 9 | `dept` | dept | `dept` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 10 | `effect` | effect | `effect` | Boolean | `switch` |
| 11 | `isDefault` | 是否Default | `is_default` | Boolean | `switch` |
| 12 | `modifier` | 修改人 | `modifier` | String | `text` |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 16 | `org` | org | `orgId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 18 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 19 | `workCenter` | workCenter | `work_center` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f | `quote` |
| 20 | `defaultCostcenter` | defaultCostcenter | `default_costcenter` | Boolean | `switch` |
| 21 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（9 个）

- `org` -> `org.func.BaseOrg` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `header` -> `bd.costcenter.CostCenter` (0..n)
- `dept` -> `bd.adminOrg.AdminOrgVO` ()
- `accentity` -> `bd.virtualaccbody.VirtualAccbody_view` ()
- `workCenter` -> `ed.workcenter.WorkCenter` ()
- `tenant` -> `base.tenant.Tenant` ()
