---
tags: [BIP, 元数据, 数据字典, pc.cls.ManagementClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料分类 (`pc.cls.ManagementClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_management_class` | 应用: `GZTBDM` | 类型: `Class`

## 属性（48 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `orgId` | 组织ID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` |
| 5 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 6 | `parent` | parent | `parent_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 7 | `template` | template | `tpl_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |
| 8 | `expenseItem` | expenseItem | `expenseItem` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 9 | `remark` | remark | `remark` | String | `multiLanguage` |
| 10 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 11 | `firstLevel` | firstLevel | `firstLevelId` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 12 | `secondLevel` | secondLevel | `secondLevelId` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 13 | `thirdLevel` | thirdLevel | `thirdLevelId` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 14 | `fourthLevel` | fourthLevel | `fourthLevelId` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 15 | `fifthLevel` | fifthLevel | `fifthLevelId` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 16 | `sixthLevel` | sixthLevel | `sixthLevelId` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 17 | `seventhLevel` | seventhLevel | `seventhLevelId` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 18 | `eighthLevel` | eighthLevel | `eighthLevelId` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 19 | `order` | order | `iOrder` | Integer | `int` |
| 20 | `productClass` | productClass | `oProductClass_id` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |
| 21 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 22 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 23 | `level` | 层级 | `level` | Integer | `int` |
| 24 | `path` | path | `path` | String | `text` |
| 25 | `fullPath` | fullPath | `cFullPath` | String | `text` |
| 26 | `productCount` | productCount | `productCount` | Decimal | `number` |
| 27 | `managementClassCharacter` | managementClassCharacter | `management_class_character` | fe203533-4747-4319-9bbc-47c356ceb2c9 | `UserDefine` |
| 28 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 29 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 30 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 31 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |
| 32 | `logicallyDeleteType` | logicallyDeleteType | `logically_delete_type` | LogicallyDeleteType | `` |
| 33 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 34 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 35 | `orgGroupId` | orgGroupID | `org_group_id` | 6a8af5af-0687-4254-ab87-c07e00fc8398 | `quote` |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 37 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 38 | `creator` | 创建人 | `creator` | String | `text` |
| 39 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 40 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 41 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 42 | `modifier` | 修改人 | `modifier` | String | `text` |
| 43 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 44 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 45 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 46 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 47 | `managementClassApplyRanges` | managementClassApplyRanges | `` | f784b641-7c72-4b5d-a3f9-c58199445899 | `` |
| 48 | `managementClassDefines` | managementClassDefines | `` | 2acab3c2-e505-468c-bd4d-8614113b761d | `` |

## 关联（21 个）

- `expenseItem` -> `bd.expenseitem.ExpenseItem` ()
- `template` -> `pc.tpl.ProductTpl` ()
- `parent` -> `pc.cls.ManagementClass` ()
- `productClass` -> `pc.cls.PresentationClass` ()
- `thirdLevel` -> `pc.cls.ManagementClass` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `fourthLevel` -> `pc.cls.ManagementClass` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `sixthLevel` -> `pc.cls.ManagementClass` ()
- `firstLevel` -> `pc.cls.ManagementClass` ()
- `managementClassDefines` -> `pc.cls.ManagementClassDefine` (1)
- `eighthLevel` -> `pc.cls.ManagementClass` ()
- `orgId` -> `bd.adminOrg.BaseOrgVO` ()
- `managementClassCharacter` -> `pc.cls.ManagementClassCharacter` ()
- `seventhLevel` -> `pc.cls.ManagementClass` ()
- `secondLevel` -> `pc.cls.ManagementClass` ()
- `orgGroupId` -> `pc.pub_org_group.PubOrgGroup` ()
- `managementClassApplyRanges` -> `pc.cls.ManagementClassApplyRangeGroup` (0..n)
- `fifthLevel` -> `pc.cls.ManagementClass` ()
- `tenant` -> `base.tenant.Tenant` ()
