---
tags: [BIP, 元数据, 数据字典, um.templatepage.Wiget]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 店铺装修组件表 (`um.templatepage.Wiget`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`wiget` | domain：`umall` | 应用：`SDMA` | 业务对象ID：`4c0de0c4-b7f1-4742-8a85-d940241fafc8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 店铺装修组件表 |
| 物理表 | `wiget` |
| 数据库 schema | `umall` |
| 所属应用 | `SDMA` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `itemplateid` | `` |

## 继承接口 (2个, 2字段)

- **商城租户相关** (`base.itf.IMallcorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cMemo` | `cMemo` | `cMemo` | 备注 |
| `cMemoResid` | `cMemoResid` | `cMemoResid` | 备注 |
| `cdatatype` | `cdatatype` | `cdatatype` | 数据类型 |
| `cwigetname` | `cwigetname` | `cwigetname` | 组件名称 |
| `route` | `route` | `route` | 路由 |
| `templateType` | `templateType` | `templateType` | 模板类型 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `itemplateid` | `itemplateid` | `itemplateid` | 模板ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `itype` | `itype` | `itype` | 类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `mallcorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
