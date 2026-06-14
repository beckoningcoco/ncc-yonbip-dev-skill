---
tags: [BIP, 元数据, 数据字典, ams.assettag.AssetTagHeadVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产标签 (`ams.assettag.AssetTagHeadVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_assettag` | domain：`ucf-amc-aim` | 应用：`AMS` | 业务对象ID：`3f897d3c-a814-43b9-9845-8eea7df2ee9f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产标签 |
| 物理表 | `pam_assettag` |
| domain/服务域 | `ucf-amc-aim` |
| schema | `amc_aim` |
| 所属应用 | `AMS` |
| 直连字段 | 24 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `ams.assettag.AssetTagHeadVODefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `iuap-apcom-bipuser.bip_user_ref` |
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `modifier` | `iuap-apcom-bipuser.bip_user_ref` |
| `tagRule` | `ucf-amc-ambd.ams_tag_rule_ref` |
| `tenantid` | `` |
| `pk_org` | `` |
| `` | `` |

## 继承接口 (5个, 10字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`baseapp.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **停启用状态** (`baseapp.itf.IEnableState`)
  - `enablestate` → `enablestate`
  - `pk_sealer` → `pk_sealer`
  - `seal_time` → `seal_time`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tag_code` | `tag_code` | `tag_code` | 自动编码 |
| `pk_template` | `pk_template` | `pk_template` | 模板 |
| `code` | `code` | `code` | 编码 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | 主键 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `name_resid` | `name_resid` | `name_resid` | 名称多语资源号 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tagRule` | `tagRule` | `tagRule` | 条码规则 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `pk_org` | `pk_org` | `pk_org` | 业务单元 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pre_flag` | `pre_flag` | `pre_flag` | 是否预置 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicationServices` | `applicationServices` | `applicationServices` | 应用业务 |
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `dr` | `dr` | `dr` | 逻辑删除位 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 最后修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `seal_time` | `seal_time` | `seal_time` | 启用时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 资产标签自定义项 |
