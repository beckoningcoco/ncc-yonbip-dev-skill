---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rvnRevenueBill]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收入确认单 (`RVN.RVN.rvnRevenueBill`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rvn_revenuebill_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`25063173-63c6-4559-acc7-1a47b0509bc2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收入确认单 |
| 物理表 | `rvn_revenuebill_h` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 71 个 |
| 子表 | 2 个 |
| 关联引用 | 23 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `costLossDetailList` | `RVN.RVN.costLossDetail` | composition |
| `rvnRevenueBillBodyList` | `RVN.RVN.rvnRevenueBillBody` | composition |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `glb_local_currency` | `ucfbasedoc.bd_currencytenantref` |
| `` | `` |
| `ori_currency` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `con_currency` | `ucfbasedoc.bd_currencytenantref` |
| `revenue_confirm_period` | `finbd.bd_period` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `local_currency` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `account_entity_id` | `ucf-org-center.bd_financeorgtreeref` |
| `src_bill_system` | `fiepub.fiepub_sourceapplicationref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `grp_local_currency` | `ucfbasedoc.bd_currencytenantref` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `trans_type` | `ucfbasedoc.bd_billtyperef` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `customer` | `productcenter.aa_invoicemerchantref` |
| `org_local_currency` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (8个, 26字段)

- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 71 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_no` | `bill_no` | `billNo` | 单据编号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务id |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `ext_src_billcode` | `ext_src_billcode` | `extSrcBillcode` | 来源单据编码(外) |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据编号 |
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

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `local_currency` | `local_currency` | `localCurrency` | 本币 |
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `account_entity_id` | `account_entity_id` | `accountEntity` | 会计主体 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `con_currency` | `con_currency` | `conCurrency` | 合同币 |
| `customer` | `customer` | `customer` | 客户 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `glb_local_currency` | `glb_local_currency` | `glbLocalCurrency` | 全局币 |
| `grp_local_currency` | `grp_local_currency` | `grpLocalCurrency` | 集团币 |
| `org_local_currency` | `org_local_currency` | `orgLocalCurrency` | 组织币 |
| `ori_currency` | `ori_currency` | `oriCurrency` | 币种 |
| `revenue_confirm_period` | `revenue_confirm_period` | `revenueConfirmPeriod` | 收入确认期间 |
| `src_bill_system` | `src_bill_system` | `srcBillSystem` | 来源应用 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `trans_type` | `trans_type` | `transType` | 交易类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

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
| `is_charge_off` | `is_charge_off` | `isChargeOff` | 是否预提回冲单 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_convert_param` | `acc_convert_param` | `accConvertParam` | 本币折算参数 |
| `adjust_type` | `adjust_type` | `adjustType` | 调整类型 |
| `con_convert_param` | `con_convert_param` | `conConvertParam` | 合同币折算参数 |
| `glb_convert_param` | `glb_convert_param` | `glbConvertParam` | 全局币折算参数 |
| `grp_convert_param` | `grp_convert_param` | `grpConvertParam` | 集团币折算参数 |
| `org_convert_param` | `org_convert_param` | `orgConvertParam` | 组织币折算参数 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `event_data_version` | `event_data_version` | `eventDataVersion` | 事件数据版本 |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `con_tax_excluded_amount` | `con_tax_excluded_amount` | `conTaxExcludedAmount` | 合同币无税金额 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `glb_tax_excluded_amount` | `glb_tax_excluded_amount` | `glbTaxExcludedAmount` | 全局币无税金额 |
| `grp_tax_excluded_amount` | `grp_tax_excluded_amount` | `grpTaxExcludedAmount` | 集团币无税金额 |
| `local_tax_excluded_amount` | `local_tax_excluded_amount` | `localTaxExcludedAmount` | 本币无税金额 |
| `org_tax_excluded_amount` | `org_tax_excluded_amount` | `orgTaxExcludedAmount` | 组织币无税金额 |
| `ori_tax_excluded_amount` | `ori_tax_excluded_amount` | `oriTaxExcludedAmount` | 无税金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rvnRevenueBillBodyList` | 收入确认单子表 |
| `` | `` | `costLossDetailList` | 成本及损失明细 |
