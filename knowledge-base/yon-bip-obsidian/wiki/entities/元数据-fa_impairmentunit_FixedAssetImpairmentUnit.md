---
tags: [BIP, 元数据, 数据字典, fa.impairmentunit.FixedAssetImpairmentUnit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产减值单元 (`fa.impairmentunit.FixedAssetImpairmentUnit`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_impairment_unit` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`fe909ba4-1307-43dd-bd1b-351de1d70acc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产减值单元 |
| 物理表 | `fa_impairment_unit` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 21 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |

## 继承接口 (7个, 18字段)

- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 减值单元编码 |
| `name` | `name` | String | 减值单元名称 |
| `obj_id` | `obj_id` | String | 来源数据ID |
| `auditnote` | `auditnote` | String | 审批批语 |
| `procinst_id` | `procinst_id` | String | 流程实例ID |
| `id` | `id` | String | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accentity_id` | `accentity_id` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 会计主体 |
| `auditor` | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 审批人 |
| `bustype` | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 交易类型 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `audit_time` | `audit_time` | DateTime | 审批日期 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `disablets` | `disablets` | DateTime | 停用时间 |
| `enablets` | `enablets` | DateTime | 启用时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `verifystate` | `verifystate` | sys_verifystate | 单据状态 |
| `enable` | `enable` | sys_intboolean | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |
