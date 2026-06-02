---
tags: [BIP, 元数据, 数据字典, pc, pc.cls.PresentationClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 商品分类 (`pc.cls.PresentationClass`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_presentation_class` | 应用: `GZTBDM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商品分类 |
| 物理表 | `product_presentation_class` |
| 应用 | `GZTBDM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:11:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0001_material/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202604071230_metadata_pc-cls_delta.zip`

## 术语标记

`data_auth`, `MasterData`, `dataAuth`, `doc`, `DirectConnection`

## 依赖接口（3 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| ISocialMcType(类型) (`ISocialMcType`) | `bd.social.ISocialMcType` | 977 | 3 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（51 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | true | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | true | true |
| 4 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 5 | `parent` | parent | `parent_id` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |  | true |
| 6 | `template` | template | `tpl_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |  | true |
| 7 | `manageClass` | manageClass | `manageclass_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | true |
| 8 | `order` | order | `iOrder` | Integer | `int` |  | true |
| 9 | `isRecommend` | 是否Recommend | `isRecommend` | Boolean | `switch` |  | true |
| 10 | `iUOrderStatus` | iUOrderStatus(状态) | `iUOrderStatus` | Boolean | `switch` |  | true |
| 11 | `isURecommend` | 是否URecommend | `isURecommend` | Boolean | `switch` |  | true |
| 12 | `showInFront` | showInFront | `showInFront` | Boolean | `switch` |  | true |
| 13 | `showInTouchpad` | showInTouchpad | `showInTouchpad` | Boolean | `switch` |  | true |
| 14 | `pageTitle` | pageTitle | `pageTitle` | String | `multiLanguage` |  | true |
| 15 | `seoKeyword` | seoKeyword | `seoKeyword` | String | `multiLanguage` |  | true |
| 16 | `seoDescription` | seoDescription | `seoDescription` | String | `multiLanguage` |  | true |
| 17 | `shareDescription` | shareDescription | `shareDescription` | String | `multiLanguage` |  | true |
| 18 | `adImageBusinessId` | adImageBusinessId | `adImage_business_id` | String | `text` |  | true |
| 19 | `adImage` | adImage | `adImage` | String | `text` |  | true |
| 20 | `imageBusinessId` | imageBusinessId | `image_business_id` | String | `text` |  | true |
| 21 | `image` | mage(ID) | `image` | String | `text` |  | true |
| 22 | `remark` | 备注 | `remark` | String | `multiLanguage` |  | true |
| 23 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 24 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 25 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 26 | `level` | level | `level` | Integer | `int` |  | true |
| 27 | `path` | path | `path` | String | `text` |  | true |
| 28 | `fullPath` | ullPath(金额) | `cFullPath` | String | `text` |  | true |
| 29 | `firstLevel` | irstLevel(金额) | `firstLevelId` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |  | true |
| 30 | `thirdLevel` | thirdLevel | `thirdLevelId` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |  | true |
| 31 | `secondLevel` | secondLevel | `secondLevelId` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |  | true |
| 32 | `productCount` | productCount | `productCount` | Decimal | `number` |  | true |
| 33 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |  | true |
| 34 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |  | true |
| 35 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |  | true |
| 36 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |  | true |
| 37 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |  | true |
| 38 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 39 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 40 | `presentationClassCharacter` | presentationClassCharacter | `presentation_class_character` | edb477bf-08c5-47f1-a351-ce46e25a9fe3 | `UserDefine` |  | true |
| 41 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 42 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 43 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 44 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 45 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 46 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 47 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 48 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 49 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 50 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | true |
| 51 | `presentationClassDefines` | presentationClassDefines | `` | 5067309b-8976-4a7c-9a81-fcb012b118dc | `` |  |  |

## 关联属性（12 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `secondLevel` | secondLevel | `pc.cls.PresentationClass` | `secondLevelId` | 外键 |  |  | None |  |
| 2 | `template` | template | `pc.tpl.ProductTpl` | `tpl_id` | 外键 |  |  | None |  |
| 3 | `parent` | parent | `pc.cls.PresentationClass` | `parent_id` | 外键 |  |  | None |  |
| 4 | `thirdLevel` | thirdLevel | `pc.cls.PresentationClass` | `thirdLevelId` | 外键 |  |  | None |  |
| 5 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 6 | `manageClass` | manageClass | `pc.cls.ManagementClass` | `manageclass_id` | 外键 |  |  | None |  |
| 7 | `presentationClassCharacter` | presentationClassCharacter | `pc.cls.PresentationClassCharacter` | `presentation_class_character` | 外键 |  |  | None |  |
| 8 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 9 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 10 | `firstLevel` | irstLevel(金额) | `pc.cls.PresentationClass` | `firstLevelId` | 外键 |  |  | None |  |
| 11 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |
| 12 | `presentationClassDefines` | presentationClassDefines | `pc.cls.PresentationClassDefine` | `` | presentationClassDefines → id | 1 | Y | None |  |

---

## SQL 示例

```sql
SELECT id, code, name, erpCode, parent_id, tpl_id, manageclass_id, iOrder
FROM product_presentation_class
```