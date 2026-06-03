---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractExtractRuleDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同抽取规则明细 (`CLM.clmContract.clmContractExtractRuleDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_extract_rule_detail` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`d5fb1d0d-b9b1-4de8-8a64-8d089174494a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同抽取规则明细 |
| 物理表 | `clm_contract_extract_rule_detail` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `CLM` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `clm_contract_extract_rule_id` | `yonbip-ec-contract.clmContractExtractRuleTable` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `extract_field_config_id` | `yonbip-ec-contract.clmContractExtractFieldConfigRef` |
| `ytenant_id` | `` |

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

> 共 17 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `extract_field` | `extract_field` | `extractField` | 抽取字段 |
| `extract_field_name` | `extract_field_name` | `extractFieldName` | 抽取字段名称 |
| `id` | `id` | `id` | 主键 |
| `target_field` | `target_field` | `targetField` | 目标字段 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clm_contract_extract_rule_id` | `clm_contract_extract_rule_id` | `clmContractExtractRuleId` | 合同抽取规则 |
| `creator` | `creator` | `creator` | 创建人 |
| `extract_field_config_id` | `extract_field_config_id` | `extractFieldConfigId` | 合同抽取字段配置 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable_state` | `enable_state` | `enableState` | 启用状态 |
| `extract_group` | `extract_group` | `extractGroup` | 抽取分组 |
| `extract_type` | `extract_type` | `extractType` | 抽取类型 |
| `mapped_type` | `mapped_type` | `mappedType` | 映射类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
