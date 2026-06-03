---
tags: [BIP, 元数据, 数据字典, bd.customerdoc_0003.0003]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 婚姻状况 (`bd.customerdoc_0003.0003`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`hred_refer_marital` | domain：`hrcloud-staff-mgr` | 应用：`HRED` | 业务对象ID：`9ec65031-6b00-41c1-a754-86567380a636`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 婚姻状况 |
| 物理表 | `hred_refer_marital` |
| 数据库 schema | `hrcloud-staff-mgr` |
| 所属应用 | `HRED` |
| 直连字段 | 35 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `country` | `bd.customerdoc_0003.Country` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `user_define_character` | `` |
| `ytenant_id` | `` |
| `orgid` | `` |

## 继承接口 (5个, 10字段)

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
- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `custdocdefid` | `custdocdefid` | `custdocdefid` | 所属档案 |
| `parentid` | `parentid` | `parentid` | 上级档案 |
| `buid` | `buid` | `buid` | 所属业务群 |
| `id` | `id` | `id` | ID |
| `innercode` | `innercode` | `innercode` | 内部编码 |
| `mnecode` | `mnecode` | `mnecode` | 助记码 |
| `objid` | `objid` | `objid` | 友企联ID |
| `shortname` | `shortname` | `shortname` | 简称 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgid` | `orgid` | `orgid` | 所属组织 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ispreset` | `ispreset` | `ispreset` | 是否预置 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用状态 |
| `sortnum` | `sortnum` | `sortnum` | 序号 |
| `level` | `level` | `level` |  层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `description` | `description` | `description` | 描述 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `userDefineCharacter` | 特征 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `country` | 国家/地区 |
