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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`base_character` | domain：`u8c-userdefine` | 应用：`CHARACTER` | 业务对象ID：`891fd15d-f24e-4d05-91a5-c7c4b96ceec4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征 |
| 物理表 | `base_character` |
| 数据库 schema | `u8c-userdefine` |
| 所属应用 | `CHARACTER` |
| 直连字段 | 60 个 |
| 子表 | 2 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `characterValueNums` | `base.character.CharacterValueNum` | composition |
| `characterValueEnums` | `base.character.CharacterValueEnum` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ref_doc_id` | `` |
| `unit` | `` |
| `iCharacterClassId` | `` |
| `org_id` | `` |
| `ytenant_id` | `` |
| `creatorId` | `yonbip-ndi-meeting.RefTable_d3d3cf3d50` |
| `enum_type` | `` |
| `modifierId` | `yonbip-ndi-meeting.RefTable_d3d3cf3d50` |

## 继承接口 (5个, 12字段)

- **排序** (`base.character.IOrder`)
  - `iOrder` → `iOrder`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 60 个直连字段

### 文本字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enum_code` | `enum_code` | `enumCode` | 枚举编码 |
| `cAlias` | `cAlias` | `alias` | 别名 |
| `enum_source` | `enum_source` | `enumSource` | 枚举来源 |
| `enum_uri` | `enum_uri` | `enumUri` | 枚举uri |
| `object_class` | `object_class` | `object_class` | 来源标识 |
| `object_code` | `object_code` | `object_code` | 对象编码 |
| `cCode` | `cCode` | `code` | 编码 |
| `original_character_code` | `original_character_code` | `original_character_code` | 原始特征编码 |
| `ref_doc_res_id` | `ref_doc_res_id` | `refDocName_resid` | 引用档案多语资源 |
| `ref_name` | `ref_name` | `refName` | 引用参照 |
| `ref_name_res_id` | `ref_name_res_id` | `refName_resid` | 引用参照多语资源 |
| `ref_ret_field_res_id` | `ref_ret_field_res_id` | `refRetFieldCode_resid` | 引用档案返回字段多语 |
| `unique_code` | `unique_code` | `unique_code` | 唯一码 |
| `cControlType` | `cControlType` | `controlType` | 展示类型 |
| `creator` | `creator` | `creator` | 创建人名称 |
| `dataTypeCode` | `dataTypeCode` | `dataTypeCode` | 数据类型 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `modifier` | `modifier` | `modifier` | 修改人名称 |
| `name_res_id` | `name_res_id` | `nameResid` | 名称多语资源 |
| `ref_doc_code` | `ref_doc_code` | `refDocCode` | 参照编码 |
| `ref_doc_domain` | `ref_doc_domain` | `refDocDomain` | 参照领域 |
| `ref_doc_name` | `ref_doc_name` | `refDocName` | 引用档案名称 |
| `ref_doc_uri` | `ref_doc_uri` | `refDocURI` | 引用档案URI |
| `ref_ret_attr_code` | `ref_ret_attr_code` | `refRetAttrCode` | 引用档案元数据字段 |
| `ref_ret_field_code` | `ref_ret_field_code` | `refRetFieldCode` | 引用档案返回字段 |
| `ref_ret_field_name` | `ref_ret_field_name` | `refRetFieldName` | 引用档案返回字段 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCharacterClassId` | `iCharacterClassId` | `characterClass` | 特征分类 |
| `org_id` | `org_id` | `org` | 所属组织 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `enum_type` | `enum_type` | `enumType` | 枚举id |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `ref_doc_id` | `ref_doc_id` | `refDoc` | 引用档案 |
| `unit` | `unit` | `unit` | 计量单位 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auth_controlled` | `auth_controlled` | `authControlled` | 是否有权限控制 |
| `is_standard_code` | `is_standard_code` | `isStandardCode` | 是否标准特征编码 |
| `ui_hide` | `ui_hide` | `uiHide` | 是否默认隐藏 |
| `bIsMulLang` | `bIsMulLang` | `isMulLang` | 是否多语 |
| `is_null` | `is_null` | `isNull` | 是否显示 |
| `bIsRange` | `bIsRange` | `isRange` | 是否范围 |
| `is_show` | `is_show` | `isShow` | 是否显示 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dataType` | `dataType` | `dataType` | 数据类型 |
| `iLength` | `iLength` | `length` | 录入长度 |
| `iOrder` | `iOrder` | `order` | 排序 |
| `pic_show_height` | `pic_show_height` | `picShowHeight` | 图片高度 |
| `pic_show_width` | `pic_show_width` | `picShowWidth` | 图片宽度 |
| `iPrecision` | `iPrecision` | `precision` | 精度 |
| `ref_show_type` | `ref_show_type` | `referShowType` | 参照方式 |
| `status` | `status` | `status` | 状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cComment` | `cComment` | `comment` | 备注 |
| `cName` | `cName` | `name` | 名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `characterValueEnums` | 特征值枚举项子表 |
| `` | `` | `characterValueNums` | 特征值范围子表 |
