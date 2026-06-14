---
tags: [BIP, 元数据, 数据字典, iuap-apcom-contract.iuap-apcom-contract.billContractTermVariable]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 单据条款变量表 (`iuap-apcom-contract.iuap-apcom-contract.billContractTermVariable`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bill_contract_term_variable` | domain：`iuap-apcom-contract` | 应用：`iuap-apcom-contract` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单据条款变量表 |
| 物理表 | `bill_contract_term_variable` |
| domain/服务域 | `iuap-apcom-contract` |
| schema | `iuap_apcom_contract` |
| 所属应用 | `iuap-apcom-contract` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `bill_contract_term_id` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_term_value` | `contract_term_value` | `contractTermValue` | 条款变量值 |
| `contract_term_variable` | `contract_term_variable` | `contractTermVariable` | 合同条款变量名称 |
| `id` | `id` | `id` | 主键id |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_contract_term_id` | `bill_contract_term_id` | `billContractTermId` | 单据条款记录ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除标记 |
| `term_required` | `term_required` | `termRequired` | termRequired |
