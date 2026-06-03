---
tags: [BIP, 元数据, 数据字典, bd.accbooktype.AccBookType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务账簿主表 (`bd.accbooktype.AccBookType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_accbooktype` | domain：`finbd` | 应用：`GL` | 业务对象ID：`667471b2-6665-4dbb-bf63-ce8854b211f1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务账簿主表 |
| 物理表 | `bd_accbooktype` |
| 数据库 schema | `finbd` |
| 所属应用 | `GL` |
| 直连字段 | 26 个 |
| 子表 | 2 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bookTypebody` | `bd.accbooktype.BookTypebody` | composition |
| `bdModularEnabletimeVO` | `bd.accbooktype.BdModularEnabletimeVO` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `ratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `controlscope` | `bd_controlscoperef` |
| `carrydown_ratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `owerorg` | `bd_allaccbodyref` |
| `accperiodscheme` | `bd_accperiodscheme` |
| `currency` | `bd_currencytenantreflist` |
| `` | `` |
| `tenant_id` | `` |
| `accpurposes` | `bd_accpurposeref` |

## 继承接口 (2个, 3字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 账簿编码 |
| `description` | `description` | `description` | 描述 |
| `exchangeratescheme` | `exchangeratescheme` | `exchangeratescheme` | 默认汇率方案 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `owerorg` | `owerorg` | `owerorg` | 会计主体 |
| `accpurposes` | `accpurposes` | `accpurposes` | 核算目的id |
| `controlscope` | `controlscope` | `controlscope` | 管控范围 |
| `currency` | `currency` | `currency` | 本位币id |
| `ratetype` | `ratetype` | `ratetype` | 汇率类型 |
| `carrydown_ratetype` | `carrydown_ratetype` | `carrydown_ratetype` | 汇兑损益结转汇率类型 |
| `accperiodscheme` | `accperiodscheme` | `accperiodscheme` | 会计期间方案id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createdate` | 创建时间 |
| `modify_date` | `modify_date` | `modifydate` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `costelementtable` | `costelementtable` | `costelementtable` | 要素表 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 账簿名称 |
| `shortname` | `shortname` | `shortname` | 简称 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `booktype` | `booktype` | `booktype` | 账簿类型 |
| `systemgene` | `systemgene` | `systemgene` | 是否系统生成 |
| `` | `` | `bdModularEnabletimeVO` | 模块启用时间 |
| `` | `` | `bookTypebody` | 会计主体列表 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 最新修改时间 |
