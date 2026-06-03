---
tags: [BIP, 元数据, 数据字典, bd.bank.PresetBankVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预置银行类别 (`bd.bank.PresetBankVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_bank` | domain：`ucfbasedoc` | 应用：`DPMSETL` | 业务对象ID：`b7efc8d7-c5cb-4660-afe5-1dfb70524a85`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预置银行类别 |
| 物理表 | `bd_bank` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMSETL` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `sourceid` | `` |
| `country` | `` |
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `defineCharacter` | `` |

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bank` | `bank` | `bank` | 社会级银行类别 |
| `code` | `code` | `code` | 编码 |
| `exec_status` | `exec_status` | `execStatus` | 执行状态 |
| `id` | `id` | `id` | 主键 |
| `level` | `level` | `level` | 层级 |
| `log` | `log` | `log` | 操作日志 |
| `objid` | `objid` | `objid` | 友企连主键 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tenantid` | `tenantid` | `tenant` | 租户废弃 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country` | `country` | `country` | 国家 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `sourceid` | `sourceid` | `sourceid` | 来源主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `enable` | `enable` | `enable` | 状态 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `sourcetype` | `sourcetype` | `sourcetype` | 是否预置 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `defineCharacter` | `defineCharacter` | `defineCharacter` | 自定义项特征 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
