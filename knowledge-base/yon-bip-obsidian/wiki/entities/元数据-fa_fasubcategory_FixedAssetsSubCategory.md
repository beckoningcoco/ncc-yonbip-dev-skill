---
tags: [BIP, 元数据, 数据字典, fa.fasubcategory.FixedAssetsSubCategory]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产子类别 (`fa.fasubcategory.FixedAssetsSubCategory`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_category_sub` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`69fcd5e2-abc9-4798-b697-d5dbab012162`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产子类别 |
| 物理表 | `fa_category_sub` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 21 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `versions` | `fa.fasubcategory.FixedAssetsSubCategoryVersion` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `current_version_id` | `` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |

## 继承接口 (6个, 13字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `description` | `description` | String | 描述 |
| `id` | `id` | String | id |
| `ytenant_id` | `ytenant_id` | String | 租户 |
| `auditnote` | `auditnote` | String | 审批批语 |
| `code` | `code` | String | 编码 |
| `procinst_id` | `procinst_id` | String | 流程实例ID |

### 引用字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `current_version_id` | `current_version_id` | f233497c-828b-4a9b-a0dd-6d02fea74dc8 | 当前版本id |
| `auditor` | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 审批人名称 |
| `bustype` | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 交易类型 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人名称 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人名称 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `audit_time` | `audit_time` | DateTime | 审批时间 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bln_enable` | `bln_enable` | Boolean | 启用 |
| `bln_traceable` | `bln_traceable` | Boolean | 实物追踪 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `verifystate` | `verifystate` | sys_verifystate | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |

### other (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | f233497c-828b-4a9b-a0dd-6d02fea74dc8 | 固定资产子类别版本 |
