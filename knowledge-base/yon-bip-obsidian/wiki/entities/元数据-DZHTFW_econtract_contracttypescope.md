---
tags: [BIP, 元数据, 数据字典, DZHTFW.econtract.contracttypescope]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同类型适用组织 (`DZHTFW.econtract.contracttypescope`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contracttype_scope` | domain：`iuap-apcom-contract` | 应用：`DZHTFW` | 业务对象ID：`f82bdbf7-cf87-4c16-b8dd-192d992a2949`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同类型适用组织 |
| 物理表 | `clm_contracttype_scope` |
| 数据库 schema | `iuap-apcom-contract` |
| 所属应用 | `DZHTFW` |
| 直连字段 | 13 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `contracttypescope_deptIdsList` | `DZHTFW.econtract.contracttypescope_deptIds` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `contractType_id` | `iuap-apcom-contract.contractTypeTreeRef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `dept_ids` | `` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |

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

> 共 13 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contractType_id` | `contractType_id` | `contractType_id` | 合同类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 组织 |
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
| `adaptalldepts` | `adaptalldepts` | `adaptalldepts` | 适配所有部门 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `contracttypescope_deptIdsList` | 合同类型适用部门 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dept_ids` | `dept_ids` | `deptIds` | 部门 |
