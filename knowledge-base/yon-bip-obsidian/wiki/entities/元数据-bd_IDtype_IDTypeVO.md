---
tags: [BIP, 元数据, 数据字典, bd.IDtype.IDTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 证件类型 (`bd.IDtype.IDTypeVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_idtype` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`be3be248-b7d5-4e0a-b894-8509219ed2b2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 证件类型 |
| 物理表 | `bd_idtype` |
| 数据库 schema | `ucf-staff-center` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 27 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `countryList` | `bd.IDtype.IDTypeVOCountry` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `tenantid` | `` |

## 继承接口 (5个, 10字段)

- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name2` | `name2` | `name2` | name2 |
| `name3` | `name3` | `name3` | name3 |
| `name4` | `name4` | `name4` | name4 |
| `name5` | `name5` | `name5` | name5 |
| `name6` | `name6` | `name6` | name6 |
| `name_resid` | `name_resid` | `name_resid` | 多语资源id |
| `code` | `code` | `code` | 证件类型简称 |
| `id` | `id` | `id` | ID |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `distribution_site` | `distribution_site` | `distributionSite` | 来源站点 |
| `objid` | `objid` | `objid` | 友企连主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ispreset` | `ispreset` | `ispreset` | 是否预置 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `sortnum` | `sortnum` | `sortnum` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 证件类型名称 |
| `description` | `description` | `description` | 描述 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `countryList` | 国家地区 |
