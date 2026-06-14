---
tags: [BIP, 元数据, 数据字典, DZHTFW.econtract.contractTypeGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同类型分组 (`DZHTFW.econtract.contractTypeGroup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_group` | domain：`iuap-apcom-contract` | 应用：`DZHTFW` | 业务对象ID：`5ab77f01-0d42-4be4-92f9-887dc9ea5e1d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同类型分组 |
| 物理表 | `clm_contract_group` |
| domain/服务域 | `iuap-apcom-contract` |
| schema | `iuap_apcom_contract` |
| 所属应用 | `DZHTFW` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `iuap-apcom-contract.contractTypeGroupRef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (4个, 12字段)

- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
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

> 共 18 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable_state` | `enable_state` | `enableState` | 是否启用 |
| `memo` | `memo` | `memo` | 备注 |
| `outer_sys_id` | `outer_sys_id` | `outerSysId` | 外部系统来源ID |
| `id` | `id` | `id` | 主键 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ifend` | `ifend` | `isEnd` | 是否末级 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `remark` | `remark` | `remark` | 说明 |
