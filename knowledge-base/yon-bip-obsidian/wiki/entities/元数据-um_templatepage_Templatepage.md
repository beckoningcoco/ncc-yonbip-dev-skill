---
tags: [BIP, 元数据, 数据字典, um.templatepage.Templatepage]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 移动端模板 (`um.templatepage.Templatepage`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`templatepage` | domain：`umall` | 应用：`SDMA` | 业务对象ID：`ac546061-332a-4e29-9d6c-72f404727ce8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 移动端模板 |
| 物理表 | `templatepage` |
| domain/服务域 | `umall` |
| schema | `upmalls` |
| 所属应用 | `SDMA` |
| 直连字段 | 29 个 |
| 子表 | 4 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `pagelayout` | `um.templatepage.Pagelayout` | composition |
| `wigetconfig` | `um.templatepage.Wigetconfig` | composition |
| `pageinfoconfig` | `um.templatepage.Pageinfoconfig` | composition |
| `version` | `um.templatepage.Version` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `itemplateid` | `` |

## 继承接口 (2个, 2字段)

- **商城租户相关** (`base.itf.IMallcorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `Pagehtml` | `Pagehtml` | `Pagehtml` | 页面文件 |
| `cCreateOrg` | `cCreateOrg` | `cCreateOrg` | 创建组织 |
| `cCreator` | `cCreator` | `cCreator` | 创建人 |
| `cLastEditor` | `cLastEditor` | `cLastEditor` | 最后编辑人 |
| `cMemo` | `cMemo` | `cMemo` | 备注 |
| `cpagename` | `cpagename` | `cpagename` | 页面名称 |
| `dCreateDate` | `dCreateDate` | `dCreateDate` | 创建时间 |
| `dLastEditorDate` | `dLastEditorDate` | `dLastEditorDate` | 最后编辑时间 |
| `iAreaIds` | `iAreaIds` | `iAreaIds` | 区域id |
| `pageType` | `pageType` | `pageType` | 页面类型 |
| `router` | `router` | `router` | 路由 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `itemplateid` | `itemplateid` | `itemplateid` | 模板ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isMainPage` | `isMainPage` | `isMainPage` | 是否主页 |
| `isSupplierEnable` | `isSupplierEnable` | `isSupplierEnable` | isSupplierEnable |
| `isTempdb` | `isTempdb` | `isTempdb` | 是否临时 |
| `isTemplate` | `isTemplate` | `isTemplate` | 是否自定义模板 |
| `isusefooter` | `isusefooter` | `isusefooter` | 是否使用底部导航 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCount` | `iCount` | `iCount` | iCount |
| `iDeleted` | `iDeleted` | `iDeleted` | 是否删除 |
| `isOrder` | `isOrder` | `isOrder` | 是否点餐模板 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCustom` | `iCustom` | `iCustom` | 是否自定义页面 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `mallcorp` | 租户 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `pageinfoconfig` | 页面配置信息表 |
| `` | `` | `pagelayout` | 页面布局表 |
| `` | `` | `version` | 版本信息表 |
| `` | `` | `wigetconfig` | 组件表 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
