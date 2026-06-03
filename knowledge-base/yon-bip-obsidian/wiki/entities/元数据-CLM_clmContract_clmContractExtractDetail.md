---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractExtractDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同抽取明细 (`CLM.clmContract.clmContractExtractDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_extract_result_detail` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`73019316-45de-4511-a6e3-5fabc6315bbe`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同抽取明细 |
| 物理表 | `clm_contract_extract_result_detail` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `CLM` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `clmContractExtractResult_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

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

> 共 22 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_obj_uri` | `busi_obj_uri` | `busiObjUri` | 字段实体 |
| `trace_id` | `trace_id` | `traceId` | 链路 |
| `display_name` | `display_name` | `displayName` | 字段显示名字 |
| `extract_rule_id` | `extract_rule_id` | `extractRuleConfigId` | 抽取字段配置 |
| `promp_code` | `promp_code` | `prompCode` | pe模板code |
| `remark` | `remark` | `remark` | 备注 |
| `session_id` | `session_id` | `sessionId` | 异步结果 |
| `filed_map_ref` | `filed_map_ref` | `filedMapRef` | 字段映射信息 |
| `filed_data_type` | `filed_data_type` | `filedDataType` | 映射字段类型 |
| `filed_name` | `filed_name` | `filedName` | 字段名 |
| `emain_entity` | `emain_entity` | `emainEntity` | 是不是主实体 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clmContractExtractResult_id` | `clmContractExtractResult_id` | `clmContractExtractResult_id` | 外键 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status` | `status` | `status` | 抽取状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `origin_value` | `origin_value` | `originValue` | 智能抽取值 |
