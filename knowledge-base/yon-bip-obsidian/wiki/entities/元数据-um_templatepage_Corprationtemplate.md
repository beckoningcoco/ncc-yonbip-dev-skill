---
tags: [BIP, 元数据, 数据字典, um.templatepage.Corprationtemplate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 模版表 (`um.templatepage.Corprationtemplate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`corprationtemplate` | domain：`umall` | 应用：`SDMA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 模版表 |
| 物理表 | `corprationtemplate` |
| 数据库 schema | `umall` |
| 所属应用 | `SDMA` |
| 直连字段 | 19 个 |
| 子表 | 2 个 |
| 关联引用 | 3 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `templatepage` | `um.templatepage.Templatepage` | composition |
| `wiget` | `um.templatepage.Wiget` | composition |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (2个, 2字段)

- **商城租户相关** (`base.itf.IMallcorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cMemo` | `cMemo` | `cMemo` | 备注 |
| `cTemplateName` | `cTemplateName` | `cTemplateName` | 模版名称 |
| `cTemplateName2` | `cTemplateName2` | `cTemplateName2` | 模版名称 |
| `cTemplateName3` | `cTemplateName3` | `cTemplateName3` | 模版名称 |
| `cTemplateName5` | `cTemplateName5` | `cTemplateName5` | 模版名称 |
| `cTemplateName6` | `cTemplateName6` | `cTemplateName6` | 模版名称 |
| `cTemplateNameResid` | `cTemplateNameResid` | `cTemplateNameResid` | 模版名称 |
| `templateAlias` | `templateAlias` | `templateAlias` | 模板名称英文缩写 |
| `templateType` | `templateType` | `templateType` | 模板类型 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isUsed` | `isUsed` | `isUsed` | 是否启用 |
| `issystem` | `issystem` | `issystem` | 是否系统模板 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `iDeleted` | 是否删除 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `isystemid` | `isystemid` | `isystemid` | 模板系统id |
| `iCorpId` | `iCorpId` | `mallcorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `templatepage` | 移动端模板 |
| `` | `` | `wiget` | 店铺装修组件表 |
