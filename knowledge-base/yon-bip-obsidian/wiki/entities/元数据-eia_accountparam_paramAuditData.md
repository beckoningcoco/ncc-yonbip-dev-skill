---
tags: [BIP, 元数据, 数据字典, eia.accountparam.paramAuditData]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 参数数据审计表 (`eia.accountparam.paramAuditData`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`param_audit_data` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`cea17e61-e57b-4d5e-b936-933d3fb06130`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 参数数据审计表 |
| 物理表 | `param_audit_data` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `org_param_2` | `fiepub.fiepub_accountbookref` |
| `org_param_1` | `finbd.bd_allaccbodyref_all` |
| `ytenant_id` | `` |
| `parent_id` | `` |

## 继承接口 (3个, 6字段)

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

> 共 14 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `param_name` | `param_name` | `paramName` | 参数名 |
| `param_group` | `param_group` | `paramGroup` | 参数所属的类别，用于区分同一个库中多个参数表情况 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parentId` | 参数主表的引用ID |
| `org_param_1` | `org_param_1` | `orgParam1` | 组织参数，例如会计主体ID |
| `org_param_2` | `org_param_2` | `orgParam2` | 组织参数，例如账簿ID |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `control_type` | `control_type` | `controlType` | 管控下级类型，0不管控或未开启管控下级，1开启管控下级 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
