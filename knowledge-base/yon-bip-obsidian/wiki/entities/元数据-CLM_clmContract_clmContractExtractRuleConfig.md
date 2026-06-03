---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractExtractRuleConfig]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 抽取规则配置 (`CLM.clmContract.clmContractExtractRuleConfig`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_extract_rule_config` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`d5fb1d0d-b9b1-4de8-8a64-8d089174494a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 抽取规则配置 |
| 物理表 | `clm_contract_extract_rule_config` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `CLM` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `clmContractExtractRule_id` | `yonbip-ec-contract.clmContractExtractRuleTable` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `billtype_id` | `ucfbasedoc.bd_billtypetreeref` |

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

> 共 25 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attribute_uri` | `attribute_uri` | `attributeUri` | 字段uri |
| `busi_obj_uri` | `busi_obj_uri` | `busiObjUri` | 业务对象uri |
| `display_name` | `display_name` | `displayName` | 映射显示字段名 |
| `e_main_entity` | `e_main_entity` | `emainEntity` | 是不是主实体 |
| `entity_name` | `entity_name` | `entityName` | 实体名字 |
| `entit_uri` | `entit_uri` | `entityUri` | 实体uri |
| `extract_field_desc` | `extract_field_desc` | `extractFieldDesc` | 抽取字段描述 |
| `extract_field_name` | `extract_field_name` | `extractFieldName` | 抽取字段名 |
| `extract_info` | `extract_info` | `extractInfo` | 大模型信息 |
| `filed_map_ref` | `filed_map_ref` | `filedMapRef` | 映射字段映射值 |
| `filed_name` | `filed_name` | `filedName` | 映射字段名 |
| `filed_res_id` | `filed_res_id` | `filedResId` | 字段多语资源 |
| `prompt_code` | `prompt_code` | `promptCode` | 映射的大模型pe编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtype_id` | `billtype_id` | `billTypeId` | 单据类型 |
| `clmContractExtractRule_id` | `clmContractExtractRule_id` | `clmContractExtractRule_id` | 合同抽取规则 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable_state` | `enable_state` | `enableState` | 启用状态 |
| `filed_type` | `filed_type` | `filedDataType` | 合同抽取字段映射数据类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
