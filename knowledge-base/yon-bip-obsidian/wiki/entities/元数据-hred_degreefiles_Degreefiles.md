---
tags: [BIP, 元数据, 数据字典, hred.degreefiles.Degreefiles]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 学位档案 (`hred.degreefiles.Degreefiles`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`degreefiles` | domain：`hrcloud-staff-mgr` | 应用：`HRED` | 业务对象ID：`173569a5-17f0-44ac-be67-ed323ad33c5b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 学位档案 |
| 物理表 | `degreefiles` |
| 数据库 schema | `hrcloud-staff-mgr` |
| 所属应用 | `HRED` |
| 直连字段 | 30 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `country` | `hred.degreefiles.Country` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `` | `` |
| `user_define_character` | `` |
| `ytenant_id` | `` |
| `distribution_site` | `` |

## 继承接口 (7个, 17字段)

- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **站点** (`hrbase.hrbaseItf.IDistributionSource`)
  - `distribution_site` → `distribution_site`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cloudid` | `cloudid` | `cloudid` | 社会化id |
| `log` | `log` | `log` | 日志 |
| `sysid` | `sysid` | `sysid` | sysid |
| `id` | `id` | `id` | ID |
| `code` | `code` | `ccode` | 编码 |
| `tenantid` | `tenantid` | `tenant` | 租户ID |
| `name` | `name` | `name` | 节点标题 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `distribution_site` | `distribution_site` | `distributionSite` | 站点 |
| `parent_id` | `parent_id` | `parent` | 上级学历 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isEnd` | `isEnd` | `isEnd` | 是否末级节点 |
| `ispreset` | `ispreset` | `ispreset` | 是否预置 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `sortnum` | `sortnum` | `sortnum` | 序号 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status` | `status` | `enable` | 状态 |
| `bsystem` | `bsystem` | `system` | 来源 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `cname` | 名称 |
| `description` | `description` | `description` | 描述 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `disablets` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `country` | 国家/地区 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `userDefineCharacter` | 特征 |
