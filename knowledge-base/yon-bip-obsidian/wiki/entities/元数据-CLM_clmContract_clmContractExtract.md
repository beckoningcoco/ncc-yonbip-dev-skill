---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractExtract]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同抽取 (`CLM.clmContract.clmContractExtract`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_extract_result` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`73019316-45de-4511-a6e3-5fabc6315bbe`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同抽取 |
| 物理表 | `clm_contract_extract_result` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `CLM` |
| 直连字段 | 29 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `clmContractExtractDetailList` | `CLM.clmContract.clmContractExtractDetail` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `contract_type` | `iuap-apcom-contract.contractTypeTreeRef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `extract_rule_id` | `yonbip-ec-contract.clmContractExtractRuleTable` |
| `ytenant_id` | `` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `` | `` |
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

> 共 29 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `convert_task_id` | `convert_task_id` | `convertTaskId` | 文件格式转换任务ID |
| `bill_id` | `bill_id` | `billId` | 单据主键 |
| `business_file_id` | `business_file_id` | `businessFileId` | 文件业务主键 |
| `file_id` | `file_id` | `fileId` | 文件主键 |
| `remark` | `remark` | `remark` | 抽取结果信息备注 |
| `session_id` | `session_id` | `sessionId` | 异步任务主键 |
| `trace_id` | `trace_id` | `traceId` | 链路日志主键 |
| `usue_state` | `usue_state` | `usueState` | 使用状态 |
| `org_id` | `org_id` | `orgId` | 组织 |
| `org_name` | `org_name` | `orgName` | 组织名字 |
| `file_name` | `file_name` | `fileName` | 文件名字 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_type` | `contract_type` | `contractType` | 合同类型 |
| `extract_rule_id` | `extract_rule_id` | `extractRuleId` | 合同抽取规则 |
| `billtype_id` | `billtype_id` | `billTypeId` | 单据类型主键 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_channel` | `create_channel` | `createChannel` | 生成通道 |
| `extract_status` | `extract_status` | `extractStatus` |  抽取进度状态 |
| `file_type` | `file_type` | `fileType` | 文档类型 |
| `file_parse_state` | `file_parse_state` | `fileParseState` | 文件解析进度 |
| `result` | `result` | `result` | 抽取结果 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `clmContractExtractDetailList` | 合同抽取明细 |
