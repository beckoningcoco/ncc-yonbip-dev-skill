---
tags: [BIP, 元数据, 数据字典, iuap-apcom-contract.iuap-apcom-contract.billContractTermsContentRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 单据条款内容表 (`iuap-apcom-contract.iuap-apcom-contract.billContractTermsContentRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bill_contract_terms_content_record` | domain：`iuap-apcom-contract` | 应用：`iuap-apcom-contract` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单据条款内容表 |
| 物理表 | `bill_contract_terms_content_record` |
| domain/服务域 | `iuap-apcom-contract` |
| schema | `iuap_apcom_contract` |
| 所属应用 | `iuap-apcom-contract` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `bill_contract_terms_record_id` | `` |
| `contract_file_key` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_id` | `bill_id` | `billId` | 单据id |
| `bill_num` | `bill_num` | `billNum` | 单据编码 |
| `contract_term_id` | `contract_term_id` | `contractTermId` | 合同条款id |
| `id` | `id` | `id` | 主键id |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_contract_terms_record_id` | `bill_contract_terms_record_id` | `billContractTermsRecordId` | 单据条款绑定关系id |
| `contract_file_key` | `contract_file_key` | `contractFileKey` | 合同文件key |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 时间戳 |

### multiLineText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_term_content` | `contract_term_content` | `contractTermContent` | 合同条款内容 |
