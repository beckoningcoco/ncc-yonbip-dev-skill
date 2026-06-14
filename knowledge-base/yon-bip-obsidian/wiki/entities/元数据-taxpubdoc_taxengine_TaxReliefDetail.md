---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxengine.TaxReliefDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 减免明细 (`taxpubdoc.taxengine.TaxReliefDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_relief_code_b` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`c7691de1-4a3f-4ef5-84f7-11395f77e702`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 减免明细 |
| 物理表 | `tax_relief_code_b` |
| domain/服务域 | `yonbip-fi-taxpubdoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 12 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `TaxReliefVariableList` | `taxpubdoc.taxengine.TaxReliefVariable` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `calculation_component_id` | `yonbip-fi-taxpubdoc.RefTable_9ec104ed1` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `tax_relief_id` | `yonbip-fi-taxpubdoc.RefTable_d3df771b94` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calculation_component_id` | `calculation_component_id` | `calculationComponentId` | 计税组件 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tax_relief_id` | `tax_relief_id` | `taxReliefId` | 减免税税码 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `relief_type` | `relief_type` | `reliefType` | 减免类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `TaxReliefVariableList` | 减免计税组件变量 |
