---
tags: [BIP, 元数据, 数据字典, bd.adminOrg.DeptOrgExtA]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 部门扩展信息A (`bd.adminOrg.DeptOrgExtA`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_dept_ext` | 应用: `GZTORG` | 类型: `Class`

## 属性（14 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 2 | `deptLevel` | deptLevel | `dept_level` | 35c233ff-f2ff-4e4c-bbc8-7ac90ea36ae9 | `quote` |
| 3 | `deptCategory` | deptCategory | `dept_category` | a9e28e89-a584-48cb-a7a2-c4e777f4b021 | `quote` |
| 4 | `otherPrincipal` | otherPrincipal | `other_principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 5 | `hrbp` | hrbp | `hrbp` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 6 | `approvalOrg` | approvalOrg | `approval_org` | String | `text` |
| 7 | `approvalCode` | approval编码 | `approval_code` | String | `text` |
| 8 | `deptRank` | deptRank | `dept_rank` | b030fd11-3f64-4ea5-8056-3f81d243ba5e | `quote` |
| 9 | `establishmentDate` | establishmentDate | `establishment_date` | Date | `date` |
| 10 | `authorizedStrength` | authorizedStrength | `authorized_strength` | Integer | `int` |
| 11 | `attachment` | attachment | `attachment` | String | `text` |
| 12 | `managepositionid` | managepositionid | `manage_position_id` | a06cee30-92b1-4a03-b399-3886f55e4ba1 | `quote` |
| 13 | `deptResponsibilities` | deptResponsibilities | `dept_responsibilities` | String | `text` |
| 14 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（8 个）

- `deptRank` -> `bd.deptTier.DeptTier` ()
- `deptCategory` -> `bd.deptType.DeptType` ()
- `deptLevel` -> `bd.deptlevel.DeptLevel` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `hrbp` -> `bd.staff.Staff` ()
- `otherPrincipal` -> `bd.staff.Staff` ()
- `id` -> `bd.adminOrg.AdminOrgVO` (1)
- `managepositionid` -> `bd.duty.Position` ()
