---
tags: [BIP, 元数据, 数据字典, hrcm.contractentity.ContractEntityScope]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 适用范围 (`hrcm.contractentity.ContractEntityScope`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cs_corp_scope_orgdept` | 应用: `HRCM` | 类型: `Class`

## 属性（10 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `orgdeptId` | orgdeptID | `orgdept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 2 | `orgdeptName` | orgdept名称 | `orgdept_name` | String | `text` |
| 3 | `contractentityId` | contractentityID | `contractentity_id` | a754b1bb-3377-4617-922e-a6108548cd73 | `quote` |
| 4 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 5 | `id` | ID | `id` | String | `text` |
| 6 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 7 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 8 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 9 | `tenant` | tenant | `tenantid` | String | `text` |
| 10 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `contractentityId` -> `hrcm.contractentity.ContractEntity` (0..n)
- `orgdeptId` -> `bd.adminOrg.AdminOrgVO` ()
