---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rclFinanceIncomeAllocation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融资收益分摊 (`RVN.RVN.rclFinanceIncomeAllocation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_finance_income_allocation` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`6280abd8-2dde-4781-b77a-0346edb31386`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融资收益分摊 |
| 物理表 | `rcl_finance_income_allocation` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 41 个 |
| 子表 | 3 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `RclInterestAllocationList` | `RVN.RVN.RclInterestAllocation` | composition |
| `rclReceiptPlanDiscountList` | `RVN.RVN.rclReceiptPlanDiscount` | composition |
| `rclAllocationChangeHistoryList` | `RVN.RVN.rclAllocationChangeHistory` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `src_app` | `fiepub.fiepub_sourceapplicationref` |
| `accentity` | `ucf-org-center.bd_financeorgtreeref` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `src_bustype` | `ucfbasedoc.bd_billtyperef` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `` | `` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `customer` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (6个, 13字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`

## 字段列表（按类型分组）

> 共 41 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_code` | `contract_code` | `contractCode` | 履约义务单据号 |
| `contract_id` | `contract_id` | `contractId` | 履约义务id |
| `contract_name` | `contract_name` | `contractName` | 履约义务名称 |
| `link_version` | `link_version` | `linkVersion` | 联查版本 |
| `original_version_id` | `original_version_id` | `originalVersionId` | 原始版本id |
| `previous_version_id` | `previous_version_id` | `previousVersionId` | 上一版本id |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_code` | `src_code` | `srcCode` | 来源单据号 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `bill_type` | `bill_type` | `billType` | 单据类型 |
| `customer` | `customer` | `customer` | 客户 |
| `src_app` | `src_app` | `srcApp` | 来源应用 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_bustype` | `src_bustype` | `srcBustype` | 来源交易类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_latest` | `bln_latest` | `blnLatest` | 是否最新版本 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_method` | `change_method` | `changeMethod` | 变更方式 |
| `create_type` | `create_type` | `createType` | 生成方式 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version_no` | `version_no` | `versionNo` | 版本号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_verison_no` | `contract_verison_no` | `contractVersionNo` | 履约义务版本号 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `RclInterestAllocationList` | 利息分摊 |
| `` | `` | `rclAllocationChangeHistoryList` | 分摊表变更历史 |
| `` | `` | `rclReceiptPlanDiscountList` | 收款计划折现 |
