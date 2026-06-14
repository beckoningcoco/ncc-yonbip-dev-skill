---
tags: [BIP, 元数据, 数据字典, RVN.RVN.RclFinalAdjustHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期末调整主表 (`RVN.RVN.RclFinalAdjustHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_finaladjust_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`2d24c180-52f9-46ef-bc38-d854e7b23760`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期末调整主表 |
| 物理表 | `rcl_finaladjust_h` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 49 个 |
| 子表 | 1 个 |
| 关联引用 | 17 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rclFinalAdjustBodyList` | `RVN.RVN.RclFinalAdjustBody` | composition |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `finbd.bd_period_treetableref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `src_trans_type` | `ucfbasedoc.bd_billtyperef` |
| `` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `revenue_contract_bill_id` | `yonbip-fi-ercl.RefTable_da1e623072` |
| `accentity` | `ucf-org-center.bd_financeorgtreeref` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `src_bill_system` | `fiepub.fiepub_sourceapplicationref` |
| `acc_Book_id` | `fiepub.fiepub_accountbooktreeref` |
| `acc_currency` | `ucfbasedoc.bd_currencytenantref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `customer` | `productcenter.aa_merchant_master` |

## 继承接口 (8个, 26字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`

## 字段列表（按类型分组）

> 共 49 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batch_number` | `batch_number` | `batchNumber` | 批次号 |
| `period_code` | `period_code` | `periodCode` | 会计期间编码 |
| `revenue_contract_bill_code` | `revenue_contract_bill_code` | `revenueContractBillCode` | 履约义务单据号 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `code` | `code` | `code` | 编码 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_currency` | `acc_currency` | `accCurrency` | 本位币 |
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `acc_Book_id` | `acc_Book_id` | `accBook` | 账簿 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `customer` | `customer` | `customer` | 客户 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `revenue_contract_bill_id` | `revenue_contract_bill_id` | `revenueContractBillId` | 履约义务id |
| `src_bill_system` | `src_bill_system` | `srcBillSystem` | 来源应用 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_trans_type` | `src_trans_type` | `srcTransType` | 来源交易类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `post_date` | `post_date` | `postDate` | 记账日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_type` | `business_type` | `businessType` | 业务类型 |
| `post_status` | `post_status` | `postStatus` | 过账状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rclFinalAdjustBodyList` | 期末调整子表 |
