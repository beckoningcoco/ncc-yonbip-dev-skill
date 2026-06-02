---
tags: [BIP, 元数据, 数据字典, DZHTFW.econtract.physicalStamp]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 物理印章 (`DZHTFW.econtract.physicalStamp`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_physical_stamp` | 应用: `DZHTFW`

## 属性（26 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `feature` | feature | `feature` | b26d830e-e842-45dc-b121-c2eddb593bb6 | `UserDefine` |
| 2 | `manaDeptId` | manaDeptID | `mana_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 3 | `managerContactType` | managerContactType | `manager_contact_type` | String | `text` |
| 4 | `managerId` | managerID | `manager_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 5 | `memo` | 备注 | `memo` | String | `multiLanguage` |
| 6 | `name` | 名称 | `name` | String | `multiLanguage` |
| 7 | `sealDroped` | sealDroped | `seal_droped` | e_yesorno | `singleOption` |
| 8 | `sealImage` | sealImage | `seal_image` | String | `attachment` |
| 9 | `sealMark` | sealMark | `seal_mark` | String | `text` |
| 10 | `sealType` | sealType | `seal_type` | sealType | `singleOption` |
| 11 | `sealYt` | sealYt | `seal_yt` | String | `multiLanguage` |
| 12 | `secretLevel` | secretLevel | `secret_level` | String | `text` |
| 13 | `secretLimit` | secretLimit | `secret_limit` | String | `text` |
| 14 | `id` | ID | `id` | String | `text` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 16 | `code` | 编码 | `code` | String | `text` |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 18 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 19 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 21 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 22 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 23 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 24 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 25 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 26 | `orgId` | orgID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |

## 关联（7 个）

- `creator` -> `base.user.BipUser` () 
- `feature` -> `DZHTFW.econtract.physicalStampfeatureUserDefine` () [废]
- `modifier` -> `base.user.BipUser` () 
- `manaDeptId` -> `bd.adminOrg.AdminOrgVO` () [废]
- `managerId` -> `bd.staff.StaffNew` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `orgId` -> `org.func.BaseOrg` () 
