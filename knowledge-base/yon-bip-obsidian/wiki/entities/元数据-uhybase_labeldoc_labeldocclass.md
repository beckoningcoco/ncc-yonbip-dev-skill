---
tags: [BIP, 元数据, 数据字典, uhybase.labeldoc.labeldocclass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标签分类档案 (`uhybase.labeldoc.labeldocclass`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_labelclassdoc` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`48a64e58-0061-45bf-8202-4068a9802a27`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标签分类档案 |
| 物理表 | `mp_labelclassdoc` |
| 数据库 schema | `uhy` |
| 所属应用 | `SDMB` |
| 直连字段 | 24 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `labeldocFuncs` | `uhybase.labeldoc.labeldoc` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `` |
| `iParentID` | `mm_labeldocclasstree` |
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (3个, 3字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **创建时间** (`uhy.itf.CreateTime`)
  - `dCreateTime` → `dCreateTime`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cWXBizID` | `cWXBizID` | `cWXBizID` | 企微标签分组ID |
| `cCode` | `cCode` | `code` | 标签分类编码 |
| `cDesc` | `cDesc` | `desc` | 描述 |
| `iLabelType` | `iLabelType` | `labelType` | 标签类型 |
| `cName` | `cName` | `name` | 名称 |
| `cFullPath` | `cFullPath` | `path` | 路径 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍 |
| `iParentID` | `iParentID` | `parent` | 上级分类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bInner` | `bInner` | `bInner` | 是否内部标签 |
| `bWXBizSync` | `bWXBizSync` | `bWXBizSync` | 是否同步企微 |
| `iPreset` | `iPreset` | `preset` | 是否预置 |
| `bShowInMarketing` | `bShowInMarketing` | `showInMarketing` | 营销端显示 |
| `iStatus` | `iStatus` | `status` | 启用状态 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateTime` | `dCreateTime` | `createTime` | 生成日期 |
| `bDefault` | `bDefault` | `default` | 是否默认标签分类 |
| `iCrowdType` | `iCrowdType` | `iCrowdType` | 人群属性(0:标签,1:人群) |
| `iSourceType` | `iSourceType` | `iSourceType` | 来源系统标志 |
| `iSource` | `iSource` | `source` | 标签分类属性 |
| `dUpdateTime` | `dUpdateTime` | `updateTime` | 修改日期 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `labeldocFuncs` | 标签档案 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
