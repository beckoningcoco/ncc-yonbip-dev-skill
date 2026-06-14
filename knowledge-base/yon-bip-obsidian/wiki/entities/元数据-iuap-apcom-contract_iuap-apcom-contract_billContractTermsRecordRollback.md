---
tags: [BIP, 元数据, 数据字典, iuap-apcom-contract.iuap-apcom-contract.billContractTermsRecordRollback]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同条款单据关系记录备份表 (`iuap-apcom-contract.iuap-apcom-contract.billContractTermsRecordRollback`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bill_contract_terms_record_rollback` | domain：`iuap-apcom-contract` | 应用：`iuap-apcom-contract` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同条款单据关系记录备份表 |
| 物理表 | `bill_contract_terms_record_rollback` |
| domain/服务域 | `iuap-apcom-contract` |
| schema | `iuap_apcom_contract` |
| 所属应用 | `iuap-apcom-contract` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `tenant_id` | `` |
| `contract_term_id` | `` |
| `ytenant_id` | `` |
| `contract_file_key` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_id` | `bill_id` | `billId` | 单据id |
| `bill_num` | `bill_num` | `billNum` | 单据编码 |
| `contract_term_name` | `contract_term_name` | `contractTermName` | 合同条款名称 |
| `contract_term_num` | `contract_term_num` | `contractTermNum` | 合同条款编码 |
| `contract_term_version_id` | `contract_term_version_id` | `contractTermVersionId` | 合同条款版本id |
| `id` | `id` | `id` | 主键id |
| `version_no` | `version_no` | `versionNo` | 版本编码 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_file_key` | `contract_file_key` | `contractFileKey` | 合同文件key |
| `contract_term_id` | `contract_term_id` | `contractTermId` | 合同条款id |
| `tenant_id` | `tenant_id` | `tenantId` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 时间戳 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除标记 |
| `mark` | `mark` | `mark` | 标识0动态1静态 |
| `order_num` | `order_num` | `orderNum` | 条款顺序 |

### multiLineText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_term_content` | `contract_term_content` | `contractTermContent` | 合同条款内容 |
