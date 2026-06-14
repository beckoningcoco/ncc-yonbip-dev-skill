---
tags: [BIP, 元数据, 数据字典, ams.tagrule.TagRuleHeadVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产标签 (`ams.tagrule.TagRuleHeadVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_tagrule` | domain：`ucf-amc-aim` | 应用：`AMS` | 业务对象ID：`0e8dbeb4-cd5c-471e-a7c4-16b82c08b8d7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产标签 |
| 物理表 | `pam_tagrule` |
| domain/服务域 | `ucf-amc-aim` |
| schema | `amc_aim` |
| 所属应用 | `AMS` |
| 直连字段 | 25 个 |
| 子表 | 2 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyvos` | `ams.tagrule.TagRuleBodyVO` | composition |
| `defines` | `ams.tagrule.TagRuleHeadVODefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `iuap-apcom-bipuser.bip_user_ref` |
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `modifier` | `iuap-apcom-bipuser.bip_user_ref` |
| `tenantid` | `` |
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

> 共 25 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | 主键 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `name_resid` | `name_resid` | `name_resid` | 名称多语资源号 |
| `rule_enum` | `rule_enum` | `rule_enum` | 条码规则 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_use` | `is_use` | `is_use` | 是否被引用 |
| `pre_flag` | `pre_flag` | `pre_flag` | 预置标志 |
| `is_public` | `is_public` | `is_public` | 面向公众 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_break` | `rule_break` | `rule_break` | 分割符选择 |
| `showType` | `showType` | `showType` | 显示方式 |
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

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyvos` | 条码规则表体 |
| `` | `` | `defines` | 条码规则自定义项 |
