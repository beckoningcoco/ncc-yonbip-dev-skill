---
tags: [BIP, 元数据, 数据字典, aa.vendorclass.VendorClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商分类 (`aa.vendorclass.VendorClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_vendorclass` | 应用: `DPMSPL` | 类型: `Class`

## 属性（35 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `vcCrowd` | vcCrowd | `vcCrowd` | cab397ab-358b-440d-8dc7-2e7150077fb1 | `quote` |
| 5 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 6 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 7 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 9 | `level` | 层级 | `iDepth` | Integer | `int` |
| 10 | `parent` | parent | `iParentId` | 59ec0b4d-4e38-483d-9bdd-e7aa44176ce8 | `quote` |
| 11 | `path` | path | `cPath` | String | `text` |
| 12 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 13 | `order` | order | `iOrder` | Integer | `int` |
| 14 | `erpCode` | erp编码 | `cErpCode` | String | `text` |
| 15 | `comment` | comment | `cComment` | String | `multiLanguage` |
| 16 | `isEnabled` | 启用 | `isEnabled` | Boolean | `switch` |
| 17 | `classType` | classType | `iCreatorType` | VendorClassType | `` |
| 18 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 19 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 20 | `creator` | 创建人 | `creator` | String | `text` |
| 21 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 22 | `creatorName` | creator名称 | `cCreatorName` | String | `text` |
| 23 | `iDeleted` | iDeleted | `iDeleted` | Integer | `int` |
| 24 | `modifier` | 修改人 | `modifier` | String | `text` |
| 25 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 26 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 27 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 28 | `org` | org | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 29 | `outSysKey` | outSysKey | `cOutSysKey` | String | `text` |
| 30 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 31 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 33 | `vendorClassCharacterDefine` | vendorClassCharacterDefine | `vendorClassCharacterDefine` | 46a147ee-f4fc-463d-8b89-9015e98b32fc | `UserDefine` |
| 34 | `defines` | defines | `` | c98cec35-ac4e-4d0e-82fd-bbcc739c8464 | `` |
| 35 | `vendorClassOrgs` | vendorClassOrgs | `` | 3a87d4bf-5e1e-48b8-8397-ccfbda3020c3 | `` |

## 关联（10 个）

- `parent` -> `aa.vendorclass.VendorClass` ()
- `vendorClassOrgs` -> `aa.vendorclass.VendorClassOrg` (0..n)
- `vendorClassCharacterDefine` -> `aa.vendorclass.VendorClassCharacterDefine` ()
- `vcCrowd` -> `aa.vendorclass.VcCrowd` ()
- `org` -> `bd.adminOrg.BaseOrgVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `tenant` -> `base.tenant.Tenant` ()
- `defines` -> `aa.vendorclass.VendorClassDefine` (1)
