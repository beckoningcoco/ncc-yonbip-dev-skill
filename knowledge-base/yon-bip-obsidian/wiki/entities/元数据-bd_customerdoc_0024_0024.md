---
tags: [BIP, 元数据, 数据字典, bd.customerdoc_0024.0024]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 专业类别 (`bd.customerdoc_0024.0024`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`hred_refer_majorcategory` | domain：`hrcloud-staff-mgr` | 应用：`HRED` | 业务对象ID：`886e91ed-b1dd-49c3-80bb-e0e3bc7f94a5`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专业类别 |
| 物理表 | `hred_refer_majorcategory` |
| 数据库 schema | `hrcloud-staff-mgr` |
| 所属应用 | `HRED` |
| 直连字段 | 35 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `country` | `bd.customerdoc_0024.Country` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `` | `` |
| `user_define_character` | `` |
| `ytenant_id` | `` |
| `orgid` | `ucf-org-center.org_pure_tree_ref` |

## 继承接口 (6个, 16字段)

- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mnecode` | `mnecode` | `mnecode` | 助记码 |
| `path` | `path` | `path` | 路径 |
| `objid` | `objid` | `objid` | 友企联id |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `innercode` | `innercode` | `innercode` | 内部编码 |
| `buid` | `buid` | `buid` | 所属业务群 |
| `code` | `code` | `code` | 编码 |
| `shortname` | `shortname` | `shortname` | 简称 |
| `parentid` | `parentid` | `parentid` | 上级档案 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `custdocdefid` | `custdocdefid` | `custdocdefid` | 所属档案 |
| `id` | `id` | `id` | ID |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `orgid` | `orgid` | `orgid` | 所属组织 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |
| `ispreset` | `ispreset` | `ispreset` | 是否预置 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sortnum` | `sortnum` | `sortnum` | 序号 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `enable` | `enable` | `enable` | 启用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `description` | `description` | `description` | 描述 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `country` | 国家/地区 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `userDefineCharacter` | 特征 |
