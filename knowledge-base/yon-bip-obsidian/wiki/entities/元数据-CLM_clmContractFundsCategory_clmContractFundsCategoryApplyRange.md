---
tags: [BIP, 元数据, 数据字典, CLM.clmContractFundsCategory.clmContractFundsCategoryApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同款项类别适用范围 (`CLM.clmContractFundsCategory.clmContractFundsCategoryApplyRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_funds_category_apply_range` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`a93e1e12-cae2-45b3-887b-f06363ec1458`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同款项类别适用范围 |
| 物理表 | `clm_funds_category_apply_range` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `CLM` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `clm_contract_funds_category_id` | `yonbip-ec-contract.clmFundsCategoryRef` |
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

> 共 12 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clm_contract_funds_category_id` | `clm_contract_funds_category_id` | `clmContractFundsCategoryId` | 合同款项类别 |
| `creator` | `creator` | `creator` | 创建人 |
| `expense_item_id` | `expense_item_id` | `expenseItemId` | 费用项目 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 组织 |
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
| `is_default` | `is_default` | `isDefault` | 是否默认 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
