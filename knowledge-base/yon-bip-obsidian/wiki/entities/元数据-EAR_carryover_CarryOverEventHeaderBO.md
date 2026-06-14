---
tags: [BIP, 元数据, 数据字典, EAR.carryover.CarryOverEventHeaderBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结转事务基本信息 (`EAR.carryover.CarryOverEventHeaderBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_h` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`dd62a7df-1cf7-48e7-8e86-7607cd341487`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 结转事务基本信息 |
| 物理表 | `arap_ledger_h` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 127 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `EAR.carryover.CarryOverEventBodyBO` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (4个, 11字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
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

## 字段列表（按类型分组）

> 共 127 个直连字段

### 文本字段 (84个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `biz_bill_type_id` | `biz_bill_type_id` | `bizBillType` | 业务单据类型 |
| `biz_bill_trade_type_id` | `biz_bill_trade_type_id` | `bizBillTradeType` | 业务单据交易类型 |
| `biz_bill_id` | `biz_bill_id` | `bizBillId` | 业务单据ID |
| `biz_bill_code` | `biz_bill_code` | `bizBillCode` | 业务单据编号 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务类型 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务类型 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `transfer_object_type` | `transfer_object_type` | `transferObjectType` | 债权债务转移对象类型 |
| `retailer_name` | `retailer_name` | `retailer` | 散户 |
| `employee_id` | `employee_id` | `employee` | 员工 |
| `funder_id` | `funder_id` | `funder` | 资金业务对象 |
| `partner_id` | `partner_id` | `partner` | 业务伙伴 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `ori2_currency_id` | `ori2_currency_id` | `ori2Currency` | 贷方原币 |
| `acc_currency_id` | `acc_currency_id` | `accCurrency` | 本币 |
| `acc_convert_param` | `acc_convert_param` | `accConvertParam` | 本币折算参数 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `post_state` | `post_state` | `postState` | 事项分录生成状态 |
| `entry_code` | `entry_code` | `entryCode` | 事项分录编号 |
| `entry_id` | `entry_id` | `entryId` | 事项分录ID |
| `voucher_code` | `voucher_code` | `voucherCode` | 凭证编号 |
| `voucher_id` | `voucher_id` | `voucherId` | 凭证ID |
| `voucher_type_id` | `voucher_type_id` | `voucherTypeId` | 凭证类型ID |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |
| `local_balance_state` | `local_balance_state` | `localBalanceState` | 本币清账标识 |
| `balance_state` | `balance_state` | `balanceState` | 清账标识 |
| `bln_effect` | `bln_effect` | `blnEffect` | 是否生效 |
| `settle_state` | `settle_state` | `settleState` | 结算状态 |
| `makeup_flag` | `makeup_flag` | `makeUpFlag` | 补差计算标识 |
| `backwash_flag` | `backwash_flag` | `backWashFlag` | 暂估回冲计算标识 |
| `mid_currency_id` | `mid_currency_id` | `midCurrency` | 核销中间币 |
| `verify_type` | `verify_type` | `verifyType` | 核销类型 |
| `batch_no` | `batch_no` | `batchNo` | 核销(损益) |
| `verify_way` | `verify_way` | `verifyWay` | 核销方式 |
| `clue_no` | `clue_no` | `clueNo` | 线索号 |
| `verify_curr_rule` | `verify_curr_rule` | `verifyCurrRule` | 币种核销规则 |
| `carryover_event_id` | `carryover_event_id` | `carryOverEvent` | 结转事务 |
| `transfer_in_id` | `transfer_in_id` | `transferInId` | 债权债务转入对象ID |
| `transfer_in_name` | `transfer_in_name` | `transferInName` | 债权债务转入对象名称 |
| `carryover_period_code` | `carryover_period_code` | `carryOverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryOverYearCode` | 结转年度编码 |
| `prov_ratio_id` | `prov_ratio_id` | `provRatioId` | 坏账计提比率ID |
| `prov_rule_id` | `prov_rule_id` | `provRuleId` | 坏账计提规则ID |
| `src_system` | `src_system` | `srcSystem` | 来源系统 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillType` | 来源单据类型 |
| `src_app_id` | `src_app_id` | `srcApp` | 来源应用 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源事务类型 |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `src_bill_code` | `src_bill_code` | `srcBillCode` | 来源单据编号 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_trade_type_id` | `src_trade_type_id` | `srcTradeType` | 来源交易类型 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 组织币 |
| `org_convert_param` | `org_convert_param` | `orgConvertParam` | 组织币折算参数 |
| `grp_currency_id` | `grp_currency_id` | `grpCurrency` | 集团本币 |
| `grp_convert_param` | `grp_convert_param` | `grpConvertParam` | 集团币折算参数 |
| `gbl_currency_id` | `gbl_currency_id` | `gblCurrency` | 全局本币 |
| `gbl_convert_param` | `gbl_convert_param` | `gblConvertParam` | 全局币折算参数 |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizflowMakeBillCode` | 单据转换规则编码 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizflowInstanceId` | 业务流实例ID |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局分布式事务ID |
| `eeac_fi_event_busi_id` | `eeac_fi_event_busi_id` | `eeacFiEventBusiId` | 业务ID |
| `opp_bill_id` | `opp_bill_id` | `oppBillId` | 对应单据ID |
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |
| `event_code` | `event_code` | `code` | 事务编号 |
| `org_id` | `org_id` | `org` | 业务组织 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流ID |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `first_id` | `first_id` | `firstId` | 来源单据主表ID |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表ID |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表ID |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表ID |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 上游孙表 |
| `status` | `status` | `status` | 事务状态 |
| `auditnote` | `auditnote` | `auditNote` | 当前审批人 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `auditor` | `auditor` | `auditor` | 终审审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_date` | `acc_date` | `accDate` | 记账日期 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 单据日期 |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_version` | `busi_version` | `busiVersion` | 业务时间戳 |
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryOver` | 是否结转 |
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 是否冲销单 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_purpose` | `acc_purpose` | `accPurpose` | 核算目的 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `supplier_id` | `supplier_id` | `supplier` | 供应商 |
| `carryover_period_id` | `carryover_period_id` | `carryOverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryOverYear` | 结转年度 |
| `writeback_event_version` | `writeback_event_version` | `writebackEventVersion` | 回写分录版本 |
| `send_data_version` | `send_data_version` | `sendDataVersion` | 发送分录版本 |

### 数值字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori2_amount` | `ori2_amount` | `ori2Amount` | 贷方金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 余额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |
| `ori_refund_amount` | `ori_refund_amount` | `oriRefundAmount` | 已退款金额 |
| `acc2_amount` | `acc2_amount` | `acc2Amount` | 贷方本币金额 |
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `org2_amount` | `org2_amount` | `org2Amount` | 贷方组织币金额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp2_amount` | `grp2_amount` | `grp2Amount` | 贷方集团币金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl2_amount` | `gbl2_amount` | `gbl2Amount` | 贷方全局币金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 结转事务明细信息 |
