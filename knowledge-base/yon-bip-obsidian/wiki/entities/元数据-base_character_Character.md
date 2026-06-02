---
tags: [BIP, 元数据, 数据字典, base.character.Character]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 特征 (`base.character.Character`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `base_character` | 应用: `CHARACTER` | 类型: `Class`

## 属性（60 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `enumCode` | enum编码 | `enum_code` | String | `text` |
| 2 | `alias` | alias | `cAlias` | String | `text` |
| 3 | `authControlled` | authControlled | `auth_controlled` | Boolean | `switch` |
| 4 | `characterClass` | characterClass | `iCharacterClassId` | edd74526-8027-46a6-b35d-12d7cfac9fbb | `quote` |
| 5 | `enumSource` | enumSource | `enum_source` | String | `text` |
| 6 | `enumUri` | enumUri | `enum_uri` | String | `text` |
| 7 | `isStandardCode` | isStandard编码 | `is_standard_code` | Boolean | `switch` |
| 8 | `object_class` | object_class | `object_class` | String | `text` |
| 9 | `object_code` | object_code | `object_code` | String | `text` |
| 10 | `code` | 编码 | `cCode` | String | `text` |
| 11 | `org` | org | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 12 | `original_character_code` | original_character_code | `original_character_code` | String | `text` |
| 13 | `refDocName_resid` | refDocName_resid | `ref_doc_res_id` | String | `text` |
| 14 | `refName` | ref名称 | `ref_name` | String | `text` |
| 15 | `refName_resid` | refName_resid | `ref_name_res_id` | String | `text` |
| 16 | `refRetFieldCode_resid` | refRetFieldCode_resid | `ref_ret_field_res_id` | String | `text` |
| 17 | `uiHide` | uiHide | `ui_hide` | Boolean | `switch` |
| 18 | `unique_code` | unique_code | `unique_code` | String | `text` |
| 19 | `comment` | comment | `cComment` | String | `multiLanguage` |
| 20 | `controlType` | controlType | `cControlType` | String | `text` |
| 21 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 22 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 23 | `creator` | 创建人 | `creator` | String | `text` |
| 24 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 25 | `dataType` | dataType | `dataType` | Integer | `int` |
| 26 | `dataTypeCode` | dataType编码 | `dataTypeCode` | String | `text` |
| 27 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 28 | `enumType` | enumType | `enum_type` | 20dccf47-b131-41a8-bf67-3d36a146544d | `quote` |
| 29 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 30 | `id` | ID | `id` | Long | `long` |
| 31 | `isMulLang` | 是否MulLang | `bIsMulLang` | Boolean | `switch` |
| 32 | `isNull` | 是否Null | `is_null` | Boolean | `switch` |
| 33 | `isRange` | 是否Range | `bIsRange` | Boolean | `switch` |
| 34 | `isShow` | 是否Show | `is_show` | Boolean | `switch` |
| 35 | `length` | length | `iLength` | Integer | `int` |
| 36 | `modifier` | 修改人 | `modifier` | String | `text` |
| 37 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 38 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 39 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 40 | `name` | 名称 | `cName` | String | `multiLanguage` |
| 41 | `nameResid` | nameResid | `name_res_id` | String | `text` |
| 42 | `order` | order | `iOrder` | Integer | `int` |
| 43 | `picShowHeight` | picShowHeight | `pic_show_height` | Integer | `int` |
| 44 | `picShowWidth` | picShowWidth | `pic_show_width` | Integer | `int` |
| 45 | `precision` | precision | `iPrecision` | Integer | `int` |
| 46 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 47 | `refDoc` | refDoc | `ref_doc_id` | 806a593a-6abe-44db-aec7-9b2d434ed698 | `quote` |
| 48 | `refDocCode` | refDoc编码 | `ref_doc_code` | String | `text` |
| 49 | `refDocDomain` | refDocDomain | `ref_doc_domain` | String | `text` |
| 50 | `refDocName` | refDoc名称 | `ref_doc_name` | String | `text` |
| 51 | `refDocURI` | refDocURI | `ref_doc_uri` | String | `text` |
| 52 | `refRetAttrCode` | refRetAttr编码 | `ref_ret_attr_code` | String | `text` |
| 53 | `refRetFieldCode` | refRetField编码 | `ref_ret_field_code` | String | `text` |
| 54 | `refRetFieldName` | refRetField名称 | `ref_ret_field_name` | String | `text` |
| 55 | `referShowType` | referShowType | `ref_show_type` | Integer | `int` |
| 56 | `status` | 状态 | `status` | Integer | `int` |
| 57 | `unit` | unit | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 58 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 59 | `characterValueEnums` | characterValueEnums | `` | b21c3f66-5475-44c9-8a12-2d238f823841 | `` |
| 60 | `characterValueNums` | characterValueNums | `` | 2fc1bf02-c301-48ce-9514-6d88e5ef8050 | `` |

## 关联（10 个）

- `characterValueNums` -> `base.character.CharacterValueNum` (0..n)
- `characterValueEnums` -> `base.character.CharacterValueEnum` (0..n)
- `refDoc` -> `aa.attrextref.PubRef` ()
- `unit` -> `pc.unit.Unit` ()
- `characterClass` -> `base.character.CharacterClass` ()
- `org` -> `org.func.BaseOrg` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `enumType` -> `bs.enum.EnumType` ()
- `modifierId` -> `base.user.User` ()
