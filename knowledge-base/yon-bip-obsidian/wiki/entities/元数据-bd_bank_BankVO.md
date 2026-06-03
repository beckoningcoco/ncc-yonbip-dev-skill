---
tags: [BIP, 元数据, 数据字典, bd.bank.BankVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 银行类别 (`bd.bank.BankVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_bank` | domain：`ucfbasedoc` | 应用：`DPMSETL` | 业务对象ID：`b7efc8d7-c5cb-4660-afe5-1dfb70524a85`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 银行类别 |
| 物理表 | `bd_bank` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMSETL` |
| 直连字段 | 26 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `bd.bank.BankVODefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `sourceid` | `` |
| `country` | `ucfbasedoc.bd_countryref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `defineCharacter` | `` |
| `` | `` |

## 继承接口 (6个, 10字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `log` | `log` | `log` | 操作日志 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `level` | `level` | `level` | 层级 |
| `bank` | `bank` | `bank` | 银行 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |
| `exec_status` | `exec_status` | `execStatus` | 执行状态 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country` | `country` | `country` | 国家 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `sourceid` | `sourceid` | `sourceid` | 来源主键 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `sourcetype` | `sourcetype` | `sourcetype` | 是否系统预置 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `dr` | `dr` | `dr` | 删除状态 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `defineCharacter` | `defineCharacter` | `defineCharacter` | 自定义项特征 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 银行类别扩展表(自定义项扩展表) |
