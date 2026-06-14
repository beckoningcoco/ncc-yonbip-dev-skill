---
tags: [BIP, 元数据, 数据字典, bd.country.CountryVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 国家/地区 (`bd.country.CountryVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_country` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：`c735713d-9fb9-43dd-ba92-b1219576a427`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 国家/地区 |
| 物理表 | `bd_country` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |

## 继承接口 (5个, 9字段)

- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `alpha_code` | `alpha_code` | `alpha_code` | ISO编码 |
| `numeric_code` | `numeric_code` | `numeric_code` | 数字编码 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `name_resid` | `name_resid` | `name_resid` | 多语资源 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `log` | `log` | `log` | 操作日志 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ispreset` | `ispreset` | `ispreset` | 是否预置 |
| `sort_num` | `sort_num` | `sort_num` | 排序号 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `dr` | `dr` | `dr` | 删除状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用状态 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
