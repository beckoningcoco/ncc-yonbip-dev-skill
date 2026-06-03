---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractExtractRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同抽取规则 (`CLM.clmContract.clmContractExtractRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_extract_rule` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`d5fb1d0d-b9b1-4de8-8a64-8d089174494a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同抽取规则 |
| 物理表 | `clm_contract_extract_rule` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `CLM` |
| 直连字段 | 23 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `clmContractExtractRuleConfigList` | `CLM.clmContract.clmContractExtractRuleConfig` | composition |
| `clmContractExtractRuleDetailList` | `CLM.clmContract.clmContractExtractRuleDetail` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `billtype_id` | `ucfbasedoc.bd_billtypetreeref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `contract_type` | `iuap-apcom-contract.contractTypeTreeRef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |

## 继承接口 (4个, 9字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `model_code` | `model_code` | `modelCode` | 大模型编码 |
| `chat_type` | `chat_type` | `chatType` | 大模型类型 |
| `busi_obj_code` | `busi_obj_code` | `busiObjCode` | 主业务对象编码 |
| `code` | `code` | `code` | 抽取规则编码 |
| `description` | `description` | `description` | 说明 |
| `name` | `name` | `name` | 抽取规则名称 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtype_id` | `billtype_id` | `billtypeId` | 单据类型 |
| `bustype` | `bustype` | `bustype` | 交易类型(系统) |
| `contract_type` | `contract_type` | `contractType` | 合同类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_preset` | `is_preset` | `isPreset` | 是否预置 |
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `clmContractExtractRuleDetailList` | 合同抽取规则明细 |
| `` | `` | `clmContractExtractRuleConfigList` | 抽取规则配置 |
