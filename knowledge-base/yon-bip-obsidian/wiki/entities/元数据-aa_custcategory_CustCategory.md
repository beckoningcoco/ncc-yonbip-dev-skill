---
tags: [BIP, 元数据, 数据字典, aa, aa.custcategory.CustCategory]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 客户分类 (`aa.custcategory.CustCategory`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `agentcategory` | 应用: `DPMCUS`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `cCode` | |

## 全部属性（45 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` | false | true |
| 2 | `orgId` | orgID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` | false | true |
| 3 | `code` | 编码 | `cCode` | String | `text` | true | false |
| 4 | `name` | 名称 | `cName` | String | `multiLanguage` | true | false |
| 5 | `erpCode` | erp编码 | `cErpCode` | String | `text` | false | true |
| 6 | `parent` | parent | `iParentId` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 7 | `order` | order | `iOrder` | Integer | `int` | false | true |
| 8 | `comment` | comment | `cComment` | String | `multiLanguage` | false | true |
| 9 | `isEnabled` | 是否Enabled | `isEnabled` | Boolean | `switch` | true | false |
| 10 | `custCategoryCharacter` | custCategoryCharacter | `agentcategory_character` | cad4ee8f-852a-4e70-a443-e454bb6a42a0 | `UserDefine` | false | true |
| 11 | `custType` | custType | `iCreatorType` | CustType | `` | false | true |
| 12 | `shop` | shop | `iShopID` | Long | `long` |  | true |
| 13 | `path` | path | `cPath` | String | `text` | false | true |
| 14 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` | false | true |
| 15 | `level` | level | `iDepth` | Integer | `int` | false | true |
| 16 | `firstLevel` | firstLevel | `firstLevelId` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 17 | `secondLevel` | secondLevel | `secondLevelId` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 18 | `thirdLevel` | thirdLevel | `thirdLevelId` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 19 | `fourthLevel` | fourthLevel | `fourthLevelId` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 20 | `fifthLevel` | fifthLevel | `fifthLevelId` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 21 | `sixthLevel` | sixthLevel | `sixthLevelId` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 22 | `seventhLevel` | seventhLevel | `seventhLevelId` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 23 | `eighthLevel` | eighthLevel | `eighthLevelId` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 24 | `orgGroupId` | orgGroupID | `org_group_id` | 6a8af5af-0687-4254-ab87-c07e00fc8398 | `quote` | false | true |
| 25 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |  | true |
| 26 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |  | true |
| 27 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |  | true |
| 28 | `iDeleted` | iDeleted | `iDeleted` | Integer | `int` | false | true |
| 29 | `logicallyDeleteType` | logicallyDeleteType | `logically_delete_type` | LogicallyDeleteType | `` | false | true |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 31 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 32 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 33 | `sort` | sort | `sort_num` | Integer | `int` | false | true |
| 34 | `outSysKey` | outSysKey | `cOutSysKey` | String | `text` | false | true |
| 35 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 36 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 37 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 38 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 39 | `creatorName` | creator名称 | `cCreatorName` | String | `text` | false | true |
| 40 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 41 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 42 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 43 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 44 | `custCategoryApplyRanges` | custCategoryApplyRanges | `` | 9db4ff2c-312f-47cd-b0c8-61abae44f371 | `` |  |  |
| 45 | `custCategoryDefines` | custCategoryDefines | `` | 8bd647c6-9050-4287-9a80-edd5d7cfce77 | `` |  |  |

## 关联属性（18 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `parent` | `aa.custcategory.CustCategory` | `iParentId` |  |  |  |
| 2 | `thirdLevel` | `aa.custcategory.CustCategory` | `thirdLevelId` |  |  |  |
| 3 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 4 | `fourthLevel` | `aa.custcategory.CustCategory` | `fourthLevelId` |  |  |  |
| 5 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 6 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 7 | `sixthLevel` | `aa.custcategory.CustCategory` | `sixthLevelId` |  |  |  |
| 8 | `firstLevel` | `aa.custcategory.CustCategory` | `firstLevelId` |  |  |  |
| 9 | `eighthLevel` | `aa.custcategory.CustCategory` | `eighthLevelId` |  |  |  |
| 10 | `orgId` | `bd.adminOrg.BaseOrgVO` | `orgId` |  |  |  |
| 11 | `seventhLevel` | `aa.custcategory.CustCategory` | `seventhLevelId` |  |  |  |
| 12 | `secondLevel` | `aa.custcategory.CustCategory` | `secondLevelId` |  |  |  |
| 13 | `custCategoryDefines` | `aa.custcategory.CustCategoryDefine` | `` | 1 | Y |  |
| 14 | `orgGroupId` | `pc.pub_org_group.PubOrgGroup` | `org_group_id` |  |  |  |
| 15 | `custCategoryApplyRanges` | `aa.custcategory.CustCategoryApplyRange` | `` | 0..n | Y |  |
| 16 | `custCategoryCharacter` | `aa.custcategory.CustCategoryCharacter` | `agentcategory_character` |  |  |  |
| 17 | `fifthLevel` | `aa.custcategory.CustCategory` | `fifthLevelId` |  |  |  |
| 18 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |

## 依赖接口（7 个）

- `ITree` → `base.itf.ITree` (v231)
- `IAuditInfo` → `base.itf.IAuditInfo` (v340)
- `ITenant` → `base.itf.ITenant` (v73)
- `IShop` → `base.itf.IShop` (v65)
- `ISocialMcType` → `bd.social.ISocialMcType` (v977)
- `IAutoCode` → `voucher.base.IAutoCode` (v49)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)

## SQL 示例

```sql
SELECT id, orgId, cCode, cName, cErpCode, iParentId, iOrder, cComment
FROM agentcategory
```