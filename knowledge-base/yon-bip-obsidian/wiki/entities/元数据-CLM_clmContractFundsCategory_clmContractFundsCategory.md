---
tags: [BIP, 元数据, 数据字典, CLM.clmContractFundsCategory.clmContractFundsCategory]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同款项类别 (`CLM.clmContractFundsCategory.clmContractFundsCategory`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_funds_category` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`a93e1e12-cae2-45b3-887b-f06363ec1458`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同款项类别 |
| 物理表 | `clm_funds_category` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `CLM` |
| 直连字段 | 19 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `clmContractFundsCategoryApplyRangeList` | `CLM.clmContractFundsCategory.clmContractFundsCategoryApplyRange` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `taxes_type_id` | `yonbip-fi-taxpubdoc.pubdoc_tax_classification_ref` |

## 继承接口 (5个, 10字段)

- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `memo` | `memo` | `memo` | 备注 |
| `name` | `name` | `name` | 名称 |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `orgId` | 业务单元 |
| `taxes_type_id` | `taxes_type_id` | `taxesTypeId` | 税收类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_default` | `is_default` | `isDefault` | 默认 |
| `enable` | `enable` | `enable` | 档案状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `doc_type` | `doc_type` | `docType` | 档案类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `clmContractFundsCategoryApplyRangeList` | 合同款项类别适用范围 |
