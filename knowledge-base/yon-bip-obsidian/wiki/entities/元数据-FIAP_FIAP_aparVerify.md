---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.aparVerify]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付应收核销 (`FIAP.FIAP.aparVerify`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_h` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`c479c989-2152-4ed8-89ab-74eb56aa46cd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付应收核销 |
| 物理表 | `arap_ledger_h` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAP` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `src_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `employee_id` | `ucf-staff-center.bd_staff_all_ref` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (4个, 7字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_date` | `acc_date` | `accDate` | 记账日期 |
| `src_bill_date` | `src_bill_date` | `busDate` | 核销日期 |
| `event_code` | `event_code` | `code` | 会计事务记录号 |
| `src_bill_code` | `src_bill_code` | `srcBillCode` | 单据编号 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `employee_id` | `employee_id` | `employee` | 员工 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillType` | 业务事项 |
| `src_trade_type_id` | `src_trade_type_id` | `srcTradeType` | 交易类型 |
| `supplier_id` | `supplier_id` | `supplier` | 供应商 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arap_event_type` | `arap_event_type` | `arapEventType` | 会计事务 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `verify_curr_rule` | `verify_curr_rule` | `verifyCurrRule` | 币种核销规则 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_amount` | `ori_amount` | `oriAmount` | 原币金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 原币可用余额 |
