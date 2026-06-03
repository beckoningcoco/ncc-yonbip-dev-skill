---
tags: [BIP, 元数据, 数据字典, um.templatepage.Pagelayout]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 页面布局表 (`um.templatepage.Pagelayout`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pagelayout` | domain：`umall` | 应用：`SDMA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 页面布局表 |
| 物理表 | `pagelayout` |
| 数据库 schema | `umall` |
| 所属应用 | `SDMA` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `ipageid` | `` |

## 继承接口 (2个, 2字段)

- **商城租户相关** (`base.itf.IMallcorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cMemo` | `cMemo` | `cMemo` | 备注 |
| `cMemo2` | `cMemo2` | `cMemo2` | 备注 |
| `cMemo3` | `cMemo3` | `cMemo3` | 备注 |
| `cMemo4` | `cMemo4` | `cMemo4` | 备注 |
| `cMemo5` | `cMemo5` | `cMemo5` | 备注 |
| `cMemo6` | `cMemo6` | `cMemo6` | 备注 |
| `cMemoResid` | `cMemoResid` | `cMemoResid` | 备注 |
| `clayout` | `clayout` | `clayout` | layout |
| `versionMemo` | `versionMemo` | `versionMemo` | 版本备注 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ipageid` | `ipageid` | `ipageid` | 页面ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `mallcorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
