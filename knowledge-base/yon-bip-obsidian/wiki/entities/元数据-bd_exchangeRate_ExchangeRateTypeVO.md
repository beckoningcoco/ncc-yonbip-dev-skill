---
tags: [BIP, 元数据, 数据字典, bd.exchangeRate.ExchangeRateTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 汇率类型 (`bd.exchangeRate.ExchangeRateTypeVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_exchangerate_type` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：`acbae55b-e6ce-4a0e-86bf-6455b915e3a3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇率类型 |
| 物理表 | `bd_exchangerate_type` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 28 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `exchangeRateTypeConfigDefineVO` | `bd.exchangeRate.ExchangeRateTypeConfigDefineVO` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `` | `` |

## 继承接口 (4个, 6字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `description` | `description` | `description` | 描述 |
| `sync_origin_bank` | `sync_origin_bank` | `syncOriginBank` | 请选择同步源 |
| `sync_rule` | `sync_rule` | `syncRule` | 同步规则 |
| `tipsName` | `tipsName` | `tipsName` | 提示隐藏字段 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `log` | `log` | `log` | 操作日志 |
| `sourceid` | `sourceid` | `sourceid` | 来源 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `digit` | `digit` | `digit` | 精度 |
| `isMapHistoryDate` | `isMapHistoryDate` | `isMapHistoryDate` | 是否向历史日期匹配 |
| `isSupportRevCalculate` | `isSupportRevCalculate` | `isSupportRevCalculate` | 是否支持反向折算 |
| `enable` | `enable` | `enable` | 启用状态 |
| `auto_update` | `auto_update` | `autoUpdate` | 是否自动更新 |
| `sync_origin_exchangerate` | `sync_origin_exchangerate` | `syncOriginExchangeRate` | 同步牌价 |
| `sync_scope` | `sync_scope` | `syncScope` | 请选择同步范围 |
| `isDefault` | `isDefault` | `isDefault` | 是否默认 |
| `dr` | `dr` | `dr` | 删除状态 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `exchangeRateTypeConfigDefineVO` | 汇率类型同步配置自定义表 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 配置基本表的ts |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
