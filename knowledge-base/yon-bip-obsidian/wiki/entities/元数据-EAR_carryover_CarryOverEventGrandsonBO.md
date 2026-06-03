---
tags: [BIP, 元数据, 数据字典, EAR.carryover.CarryOverEventGrandsonBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结转事务计划信息 (`EAR.carryover.CarryOverEventGrandsonBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`dd62a7df-1cf7-48e7-8e86-7607cd341487`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 结转事务计划信息 |
| 物理表 | `arap_ledger_g` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 139 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `body_id` | `` |

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

> 共 139 个直连字段

### 文本字段 (82个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `h_biz_bill_type_id` | `h_biz_bill_type_id` | `hBizBillTypeId` | 业务单据类型 |
| `h_biz_bill_trade_type_id` | `h_biz_bill_trade_type_id` | `hBizBillTradeTypeId` | 业务单据交易类型 |
| `h_biz_bill_id` | `h_biz_bill_id` | `hBizBillId` | 业务单据ID |
| `h_biz_bill_code` | `h_biz_bill_code` | `hBizBillCode` | 业务单据编号 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务类型 |
| `event_id` | `event_id` | `event` | 结转事务基本信息 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务类型 |
| `h_event_code` | `h_event_code` | `hEventCode` | 事务编号 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `h_object_type` | `h_object_type` | `hObjectType` | 往来对象类型 |
| `h_org_id` | `h_org_id` | `hOrg` | 业务组织 |
| `b_staff_id` | `b_staff_id` | `bStaff` | 业务员 |
| `h_employee_id` | `h_employee_id` | `hEmployee` | 员工 |
| `h_funder_id` | `h_funder_id` | `hFunder` | 资金业务对象 |
| `h_partner_id` | `h_partner_id` | `hPartner` | 业务伙伴 |
| `b_order_no` | `b_order_no` | `bOrderNo` | 订单编号 |
| `b_opp_procenter_id` | `b_opp_procenter_id` | `bOppProcenter` | 对方利润中心 |
| `b_contract_no` | `b_contract_no` | `bContractNo` | 合同编号 |
| `b_dept_id` | `b_dept_id` | `bDept` | 部门 |
| `b_procenter_id` | `b_procenter_id` | `bProcenter` | 利润中心 |
| `b_project_id` | `b_project_id` | `bProject` | 项目 |
| `b_ori_currency_id` | `b_ori_currency_id` | `bOriCurrency` | 原币 |
| `acc_gain_loss_flag` | `acc_gain_loss_flag` | `accGainLossFlag` | 本币损益标识 |
| `h_acc_currency_id` | `h_acc_currency_id` | `hAccCurrency` | 本币 |
| `b_invoice_no` | `b_invoice_no` | `bInvoiceNo` | 发票编号 |
| `ap_subject_id` | `ap_subject_id` | `apSubject` | 应付账款科目 |
| `ap_subject_vid` | `ap_subject_vid` | `apSubjectVid` | 应付账款科目版本 |
| `ar_subject_id` | `ar_subject_id` | `arSubject` | 应收账款科目 |
| `ar_subject_vid` | `ar_subject_vid` | `arSubjectVid` | 应收账款科目版本 |
| `gain_loss_subject_id` | `gain_loss_subject_id` | `gainLossSubject` | 汇兑损益科目 |
| `gain_loss_subject_vid` | `gain_loss_subject_vid` | `gainLossSubjectVid` | 汇兑损益科目版本 |
| `h_remarks` | `h_remarks` | `hRemarks` | 备注 |
| `b_remarks` | `b_remarks` | `bRemarks` | 明细信息备注 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |
| `local_balance_state` | `local_balance_state` | `localBalanceState` | 本币清账标识 |
| `balance_state` | `balance_state` | `balanceState` | 清账标识 |
| `h_bln_effect` | `h_bln_effect` | `hBlnEffect` | 是否生效 |
| `convert_way` | `convert_way` | `convertWay` | 预收(付)核销方法 |
| `clue_no` | `clue_no` | `clueNo` | 线索号 |
| `carryover_event_id` | `carryover_event_id` | `carryOverEventId` | 结转事务ID |
| `carryover_period_code` | `carryover_period_code` | `carryOverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryOverYearCode` | 结转年度编码 |
| `carryover_body_id` | `carryover_body_id` | `carryOverBodyId` | 结转事务行ID |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryOverGrandsonId` | 结转事务孙ID |
| `h_src_app_id` | `h_src_app_id` | `hSrcApp` | 来源应用ID |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源事务类型 |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务 |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细 |
| `src_exe_detail_id` | `src_exe_detail_id` | `srcExeDetailId` | 来源单据执行明细ID |
| `src_grandson_id` | `src_grandson_id` | `srcGrandson` | 来源计划行 |
| `ori_grandson_id` | `ori_grandson_id` | `oriGrandsonId` | 源头计划行ID |
| `ori_arap_event_type` | `ori_arap_event_type` | `oriArapEventType` | 源头事务类型 |
| `org_gain_loss_flag` | `org_gain_loss_flag` | `orgGainLossFlag` | 组织币损益标识 |
| `h_org_currency_id` | `h_org_currency_id` | `hOrgCurrency` | 组织本币 |
| `grp_gain_loss_flag` | `grp_gain_loss_flag` | `grpGainLossFlag` | 集团币损益标识 |
| `h_grp_currency_id` | `h_grp_currency_id` | `hGrpCurrency` | 集团本币 |
| `gbl_gain_loss_flag` | `gbl_gain_loss_flag` | `gblGainLossFlag` | 全局币损益标识 |
| `h_gbl_currency_id` | `h_gbl_currency_id` | `hGblCurrency` | 全局本币 |
| `b_wbs` | `b_wbs` | `bWbs` | WBS |
| `amount_direction` | `amount_direction` | `amountDirection` | 借贷方向 |
| `b_free_ch_id` | `b_free_ch_id` | `bFreeChId` | 子表自定义特征 |
| `check_no` | `check_no` | `checkNo` | 勾对号 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizflowMakeBillCode` | 单据转换规则编码 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizflowInstanceId` | 业务流实例ID |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局分布式事务ID |
| `h_free_ch_id` | `h_free_ch_id` | `hFreeChId` | 主表自定义特征 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流ID |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表ID |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表ID |
| `id` | `id` | `id` | 主键 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表ID |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 上游单据孙表ID |
| `source_id` | `source_id` | `sourceId` | 上游单据主表ID |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `body_id` | `body_id` | `body` | 结转事务明细信息 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `h_src_bill_date` | `h_src_bill_date` | `hSrcBillDate` | 单据日期 |
| `h_acc_date` | `h_acc_date` | `hAccDate` | 记账日期 |
| `clear_time` | `clear_time` | `clearTime` | 清账时间 |
| `local_clear_time` | `local_clear_time` | `localClearTime` | 本币清账时间 |
| `start_date` | `start_date` | `startDate` | 起算日 |
| `expire_date` | `expire_date` | `expireDate` | 到期日 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_hangup` | `bln_hangup` | `blnHangUp` | 是否挂起 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_deposit` | `bln_deposit` | `blnDeposit` | 是否保证金 |
| `bln_carryover` | `bln_carryover` | `blnCarryOver` | 是否结转 |
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 是否冲销单 |
| `bln_prepare` | `bln_prepare` | `blnPrepare` | 是否预收(付) |
| `issue_no` | `issue_no` | `issueNo` | 协议期号 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `h_customer_id` | `h_customer_id` | `hCustomer` | 客户 |
| `h_supplier_id` | `h_supplier_id` | `hSupplier` | 供应商 |
| `b_material_id` | `b_material_id` | `bMaterial` | 物料 |
| `b_quick_type_id` | `b_quick_type_id` | `bQuickType` | 款项类型 |
| `b_cost_center_id` | `b_cost_center_id` | `bCostCenter` | 成本中心 |
| `b_expense_item_id` | `b_expense_item_id` | `bExpenseItem` | 费用项目 |
| `settle_mode_id` | `settle_mode_id` | `settleMode` | 结算方式 |
| `carryover_period_id` | `carryover_period_id` | `carryOverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryOverYear` | 结转年度 |
| `b_activity` | `b_activity` | `bActivity` | 活动 |

### 数值字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_balance` | `ori_balance` | `oriBalance` | 余额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `mid_amount` | `mid_amount` | `midAmount` | 核销中间币金额 |
| `mid_exchange_rate` | `mid_exchange_rate` | `midExchangeRate` | 核销中间币汇率 |
| `ori_carryover_amount` | `ori_carryover_amount` | `oriCarryOverAmount` | 结转金额 |
| `acc_carryover_amount` | `acc_carryover_amount` | `accCarryOverAmount` | 本币结转金额 |
| `gbl_carryover_amount` | `gbl_carryover_amount` | `gblCarryOverAmount` | 全局币结转金额 |
| `grp_carryover_amount` | `grp_carryover_amount` | `grpCarryOverAmount` | 集团币结转金额 |
| `org_carryover_amount` | `org_carryover_amount` | `orgCarryOverAmount` | 组织币结转金额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织币汇率 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团币汇率 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl_exchange_rate` | `gbl_exchange_rate` | `gblExchangeRate` | 全局币汇率 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `ratio` | `ratio` | `ratio` | 收(付)款比例 |
