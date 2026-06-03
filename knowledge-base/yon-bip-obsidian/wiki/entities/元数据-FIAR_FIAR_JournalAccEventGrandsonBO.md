---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.JournalAccEventGrandsonBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 流水账事务计划信息 (`FIAR.FIAR.JournalAccEventGrandsonBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`8da54fe3-2f7d-49f3-817f-41202416baa7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流水账事务计划信息 |
| 物理表 | `arap_ledger_g` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 94 个 |
| 子表 | 0 个 |
| 关联引用 | 30 个 |

## 关联引用 (30个)

| 字段名 | 引用类型 |
|--------|---------|
| `b_ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `b_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `body_id` | `` |
| `h_employee_id` | `ucf-staff-center.bd_staff_all_ref` |
| `h_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `b_quick_type_id` | `finbd.bd_paymenttyperef` |
| `ar_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `acc_year_id` | `finbd.bd_period` |
| `h_supplier_id` | `yssupplier.aa_vendor` |
| `event_id` | `` |
| `src_body_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `b_cost_center_id` | `finbd.bd_costcenterref` |
| `carryover_year_id` | `` |
| `ap_subject_id` | `fiepub.fiepub_accsubjectref` |
| `carryover_period_id` | `` |
| `ap_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `b_staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `ar_subject_id` | `fiepub.fiepub_accsubjectref` |
| `src_grandson_id` | `` |
| `h_partner_id` | `productcenter.base_businesspartnerref` |
| `acc_period_id` | `finbd.bd_period` |
| `b_material_id` | `productcenter.pc_nomalproductref` |
| `src_event_id` | `` |
| `ori_grandson_id` | `` |
| `h_customer_id` | `productcenter.aa_merchant_master` |

## 继承接口 (6个, 27字段)

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
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **收付结转孙表** (`FIAP.FIAP.IEARAPCarryoverGrandson`)
  - `bln_carryover` → `bln_carryover`
  - `carryover_body_id` → `carryover_body_id`
  - `carryover_event_id` → `carryover_event_id`
  - `carryover_grandson_id` → `carryover_grandson_id`
  - `carryover_period_id` → `carryover_period_id`
  - `carryover_period_code` → `carryover_period_code`
  - `carryover_year_id` → `carryover_year_id`
  - `carryover_year_code` → `carryover_year_code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 94 个直连字段

### 文本字段 (35个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿ID |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务类型 |
| `clear_time` | `clear_time` | `clearTime` | 清账时间 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局分布式事务ID |
| `expire_date` | `expire_date` | `expireDate` | 到期日 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `gain_loss_subject_id` | `gain_loss_subject_id` | `gainLossSubject` | 减值损失科目 |
| `gain_loss_subject_vid` | `gain_loss_subject_vid` | `gainLossSubjectVid` | 减值损失科目版本 |
| `h_remarks` | `h_remarks` | `hRemarks` | 表头备注 |
| `local_clear_time` | `local_clear_time` | `localClearTime` | 本币清账时间 |
| `ori_arap_event_type` | `ori_arap_event_type` | `oriArapEventType` | 源头事务类型 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源事务类型 |
| `src_exe_detail_id` | `src_exe_detail_id` | `srcExeDetailId` | 来源单据执行明细id(确认应收应付用) |
| `start_date` | `start_date` | `startDate` | 起算日期 |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryoverGrandson` | 结转事务孙行 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
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

### 引用字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `ap_subject_id` | `ap_subject_id` | `apSubject` | 应付账款科目 |
| `ap_subject_vid` | `ap_subject_vid` | `apSubjectVid` | 应付账款科目版本 |
| `ar_subject_id` | `ar_subject_id` | `arSubject` | 应收账款科目 |
| `ar_subject_vid` | `ar_subject_vid` | `arSubjectVid` | 应收账款科目版本 |
| `body_id` | `body_id` | `body` | 流水明细ID |
| `b_cost_center_id` | `b_cost_center_id` | `costCenter` | 成本中心 |
| `h_customer_id` | `h_customer_id` | `customer` | 客户 |
| `h_employee_id` | `h_employee_id` | `employee` | 员工 |
| `event_id` | `event_id` | `event` | 事务ID |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `h_partner_id` | `h_partner_id` | `hPartner` | 业务伙伴 |
| `b_material_id` | `b_material_id` | `material` | 物料 |
| `h_org_id` | `h_org_id` | `orgId` | 业务组织ID |
| `b_ori_currency_id` | `b_ori_currency_id` | `oriCurrency` | 原币 |
| `ori_grandson_id` | `ori_grandson_id` | `oriGrandsonId` | 源头核算BO |
| `b_procenter_id` | `b_procenter_id` | `proCenter` | 利润中心 |
| `b_quick_type_id` | `b_quick_type_id` | `quickType` | 款项类型 |
| `settle_mode_id` | `settle_mode_id` | `settleMode` | 结算方式 |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细行ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `src_grandson_id` | `src_grandson_id` | `srcGrandson` | 来源核算行ID |
| `b_staff_id` | `b_staff_id` | `staff` | 业务员 |
| `h_supplier_id` | `h_supplier_id` | `supplier` | 供应商 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_deposit` | `bln_deposit` | `blnDeposit` | 是否质保金 |
| `bln_hangup` | `bln_hangup` | `blnHangUp` | 是否挂起 |
| `bln_prepare` | `bln_prepare` | `blnPrepare` | 是否预收(付) |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount_direction` | `amount_direction` | `amountDirection` | 金额方向 |
| `balance_state` | `balance_state` | `balanceState` | 清账状态 |
| `convert_way` | `convert_way` | `convertWay` | 预收(付)核销方法 |
| `digest` | `digest` | `digest` | 摘要 |
| `local_balance_state` | `local_balance_state` | `localBalanceState` | 本币清账状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务冻结状态 |
| `issue_no` | `issue_no` | `issueNo` | 期号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 余额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |
| `ratio` | `ratio` | `ratio` | 收(付)款比例 |
| `row_no` | `row_no` | `rowNo` | 行号 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `h_object_type` | `h_object_type` | `objectType` | 往来对象类型 |
