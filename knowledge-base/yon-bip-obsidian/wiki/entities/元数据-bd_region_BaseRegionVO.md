---
tags: [BIP, 元数据, 数据字典, bd.region.BaseRegionVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行政区划 (`bd.region.BaseRegionVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_baseregion` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：`0f012d25-573b-4161-aae3-79be728e3173`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 行政区划 |
| 物理表 | `bd_baseregion` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 27 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `BaseRegionStatusVOList` | `bd.region.BaseRegionStatusVO` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `bd_baseregiontreeref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |

## 继承接口 (5个, 12字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `en_name` | `en_name` | `enName` | 英文名称 |
| `parent_code` | `parent_code` | `parentCode` | 父节点编码 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `country_code` | `country_code` | `countryCode` | 国家/地区编码 |
| `sly_code` | `sly_code` | `slyCode` | 商旅云编码 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `path` | `path` | `path` | 路径 |
| `log` | `log` | `log` | 操作日志 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ispreset` | `ispreset` | `ispreset` | 是否预置 |
| `level` | `level` | `level` | 层级 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `enable` | `enable` | `enable` | 启用状态 |
| `dr` | `dr` | `dr` | 删除状态 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `path_name` | `path_name` | `pathName` | 展示层级 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `BaseRegionStatusVOList` | 行政区划状态 |
