---
tags: [BIP, 元数据, 数据字典, iuap-apcom-contract.iuap-apcom-contract.contractTermsVariable]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 条款变量 (`iuap-apcom-contract.iuap-apcom-contract.contractTermsVariable`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`contract_terms_variable` | domain：`iuap-apcom-contract` | 应用：`iuap-apcom-contract` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 条款变量 |
| 物理表 | `contract_terms_variable` |
| 数据库 schema | `iuap-apcom-contract` |
| 所属应用 | `iuap-apcom-contract` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `contract_terms_id` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `value` | `value` | `value` | 变量值 |
| `variable` | `variable` | `variable` | 变量 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_terms_id` | `contract_terms_id` | `contractTermsId` | 合同条款id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_required` | `term_required` | `termRequired` | 是否必填 |
