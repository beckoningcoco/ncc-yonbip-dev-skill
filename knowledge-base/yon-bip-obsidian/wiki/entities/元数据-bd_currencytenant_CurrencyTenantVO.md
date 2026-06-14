---
tags: [BIP, 元数据, 数据字典, bd.currencytenant.CurrencyTenantVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 币种 (`bd.currencytenant.CurrencyTenantVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_currency_tenant` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：`04b40801-8ada-4508-aa9f-874b4ab61fd2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 币种 |
| 物理表 | `bd_currency_tenant` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 28 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |

## 继承接口 (5个, 9字段)

- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `currtypesign` | `currtypesign` | `currTypeSign` | 币种符号 |
| `isdefault` | `isdefault` | `isDefault` | 是否默认 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `name_resid` | `name_resid` | `name_resid` | 多语资源 |
| `cloudid` | `cloudid` | `cloudid` | 云端主键 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `log` | `log` | `log` | 操作日志 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |
| `exec_status` | `exec_status` | `execStatus` | 执行状态 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pricedigit` | `pricedigit` | `priceDigit` | 单价精度 |
| `pricerount` | `pricerount` | `priceRount` | 单价舍入规则 |
| `moneydigit` | `moneydigit` | `moneyDigit` | 金额精度 |
| `moneyrount` | `moneyrount` | `moneyRount` | 金额舍入规则 |
| `enable` | `enable` | `enable` | 启用状态 |
| `ordergrade` | `ordergrade` | `orderGrade` | 排序 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `dr` | `dr` | `dr` | 删除状态 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
