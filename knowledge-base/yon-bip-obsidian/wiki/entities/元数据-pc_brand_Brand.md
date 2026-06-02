---
tags: [BIP, 元数据, 数据字典, pc, pc.brand.Brand]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 品牌 (`pc.brand.Brand`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `brand` | 应用: `GZTBDM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 品牌 |
| 物理表 | `brand` |
| 应用 | `GZTBDM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:10:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0001_material/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202603161603_metadata_pc-brand.zip`

## 术语标记

`data_auth`, `DirectConnection`, `doc`, `isMain`, `MasterData`

## 依赖接口（9 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| IErp编码 (`IErpCode`) | `base.itf.IErpCode` | 73 | 1 |
| ISociCoreArchive (`ISociCoreArchive`) | `base.itf.ISociCoreArchive` | 28 | 1 |
| ISocialMcType(类型) (`ISocialMcType`) | `bd.social.ISocialMcType` | 977 | 3 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（40 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `brandLogoBusinessId` | brandLogoBusinessId | `brand_logo_business_id` | String | `text` |  | true |
| 3 | `brandLogo` | brandLogo | `brand_logo` | String | `text` |  | true |
| 4 | `defines` | efines(日期) | `` | e2d66f7b-eea0-4300-a42c-f6f5223239a6 | `` |  |  |
| 5 | `cfolder` | folder | `cfolder` | String | `text` |  | true |
| 6 | `cimgname` | imgname | `cimgname` | String | `text` |  | true |
| 7 | `code` | 编码 | `code` | String | `text` | false | true |
| 8 | `name` | 名称 | `brand_name` | String | `multiLanguage` | true | false |
| 9 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 10 | `randKeywords` | randKeywords | `rand_keywords` | String | `multiLanguage` |  | true |
| 11 | `ordernumber` | ordernumber | `ordernumber` | Integer | `int` | true | false |
| 12 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 13 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 14 | `brandUrl` | brandUrl | `brand_url` | String | `multiLanguage` |  | true |
| 15 | `brandClass` | brandClass | `brandClass` | cc6094c7-dfef-4554-8216-ee747c04a945 | `quote` |  | true |
| 16 | `brandDesc` | brandDesc | `brand_desc` | String | `multiLanguage` |  | true |
| 17 | `adImageBusinessId` | adImageBusinessId | `adImage_business_id` | String | `text` |  | true |
| 18 | `adImage` | adImage | `adImage` | String | `text` |  | true |
| 19 | `brandCharacterDef` | brandCharacterDef | `brand_character_def` | a8df79d4-c225-499f-957d-02c44d3da0c3 | `UserDefine` |  | true |
| 20 | `coriginalname` | originalname | `coriginalname` | String | `text` |  | true |
| 21 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |  | true |
| 22 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |  | true |
| 23 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |  | true |
| 24 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |  | true |
| 25 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |  | true |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 27 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 28 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 29 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 30 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 31 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 32 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 33 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 34 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 35 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 36 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 37 | `brandKeywords` | brandKeywords | `rand_keywords` | String | `text` |  | true |
| 38 | `brandName` | 品牌名称 | `brand_name` | String | `text` |  | true |
| 39 | `brandUserDefines` | brandUserDefines | `` | 96c4194b-2f92-44ac-9479-6fafae598033 | `` |  |  |
| 40 | `productTplBrands` | productTplBrands | `` | dbc746d3-6e31-4be7-803b-63a720b6335c | `` |  |  |

## 关联属性（9 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 2 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 3 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 4 | `productTplBrands` | productTplBrands | `pc.brand.ProductTplBrand` | `` | productTplBrands → brand | 0..n | Y | None |  |
| 5 | `brandCharacterDef` | brandCharacterDef | `pc.brand.BrandCharacterDef` | `brand_character_def` | 外键 |  |  | None |  |
| 6 | `brandClass` | brandClass | `pc.brand.BrandClass` | `brandClass` | brands → brandClass | 0..n | Y | None |  |
| 7 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |
| 8 | `brandUserDefines` | brandUserDefines | `pc.brand.BrandUserDefine` | `` | brandUserDefines → id | 1 | Y | None |  |
| 9 | `defines` | efines(日期) | `pc.brand.BrandDefine` | `` | defines → id | 1 | Y | None |  |

---

## SQL 示例

```sql
SELECT id, brand_logo_business_id, brand_logo, cfolder, cimgname, code, brand_name, erpCode
FROM brand
```