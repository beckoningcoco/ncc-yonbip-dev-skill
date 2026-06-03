---
tags: [BIP, 元数据, 数据字典, eeac.influencefactorsetting.InfluenceFactorDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 影响因素 (`eeac.influencefactorsetting.InfluenceFactorDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_influence_factor` | domain：`yonbip-fi-eeac` | 应用：`EVNT` | 业务对象ID：`56295bbb-3f18-42d4-9e73-1d2f9b474cca`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 影响因素 |
| 物理表 | `epub_influence_factor` |
| 数据库 schema | `yonbip-fi-eeac` |
| 所属应用 | `EVNT` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `doctype_id` | `fiepub.epub_doctype_ref` |
| `ytenant_id` | `` |

## 继承接口 (4个, 9字段)

- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 影响因素编码 |
| `enum_attr` | `enum_attr` | `enumAttr` | 枚举属性 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `sys_id` | `sys_id` | `sysId` | 关联0租户预置数据的id,取自本表的id |
| `using_status` | `using_status` | `usingStatus` | 对预置数据的使用控制,0:停用;1:启用 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `doctype_id` | `doctype_id` | `doctypeId` | 档案类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_user_def` | `bln_user_def` | `blnUserDef` | 是否自定义 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `sort_num` | `sort_num` | `sortNum` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 影响因素名称 |
| `remarks` | `remarks` | `remarks` | 备注 |
