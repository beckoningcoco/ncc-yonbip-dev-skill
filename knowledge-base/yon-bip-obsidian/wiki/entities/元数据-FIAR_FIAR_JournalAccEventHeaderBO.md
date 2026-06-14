---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.JournalAccEventHeaderBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 流水账事务基本信息 (`FIAR.FIAR.JournalAccEventHeaderBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_h` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`8da54fe3-2f7d-49f3-817f-41202416baa7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流水账事务基本信息 |
| 物理表 | `arap_ledger_h` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 100 个 |
| 子表 | 1 个 |
| 关联引用 | 31 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `FIAR.FIAR.JournalAccEventBodyBO` | composition |

## 关联引用 (31个)

| 字段名 | 引用类型 |
|--------|---------|
| `funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `gbl_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `modifier` | `bpd-check-ld.RefTable_04814db086` |
| `biz_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `employee_id` | `iuap-ptc-yoncmm.sattUuser` |
| `acc_year_id` | `finbd.bd_period` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `acc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `prov_rule_id` | `yonbip-fi-earap.RefTable_5efbc6401` |
| `creator` | `bpd-check-ld.RefTable_04814db086` |
| `` | `` |
| `src_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `carryover_year_id` | `` |
| `carryover_period_id` | `` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `acc_purpose` | `finbd.bd_accpurposeref` |
| `acc_period_id` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `partner_id` | `productcenter.base_businesspartnerref` |
| `prov_ratio_id` | `` |
| `biz_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (7个, 26字段)

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
- **收付结转主表** (`FIAP.FIAP.IEARAPCarryover`)
  - `bln_carryover` → `bln_carryover`
  - `carryover_event_id` → `carryover_event_id`
  - `carryover_period_id` → `carryover_period_id`
  - `carryover_period_code` → `carryover_period_code`
  - `carryover_year_id` → `carryover_year_id`
  - `carryover_year_code` → `carryover_year_code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 100 个直连字段

### 文本字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_date` | `acc_date` | `accDate` | 记账日期 |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度 |
| `biz_bill_code` | `biz_bill_code` | `bizBillCode` | 业务单据编号 |
| `biz_bill_id` | `biz_bill_id` | `bizBillId` | 业务单据ID |
| `check_error_msg` | `check_error_msg` | `checkErrorMsg` | 会计事务校验异常信息 |
| `event_code` | `event_code` | `code` | 会计事务记录号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `opp_bill_id` | `opp_bill_id` | `oppBillId` | 对应单据ID |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `retailer_name` | `retailer_name` | `retailer` | 散户 |
| `src_bill_code` | `src_bill_code` | `srcBillCode` | 来源单据编号 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 来源单据日期 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `transfer_params` | `transfer_params` | `transferParams` | 转移参数 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
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

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_currency_id` | `acc_currency_id` | `accCurrency` | 账簿本币 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_purpose` | `acc_purpose` | `accPurpose` | 核算目的 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `biz_bill_type_id` | `biz_bill_type_id` | `bizBillType` | 业务单据类型ID |
| `biz_bill_trade_type_id` | `biz_bill_trade_type_id` | `bizTradeType` | 业务单据交易类型ID |
| `creator` | `creator` | `creator` | 创建人 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `employee_id` | `employee_id` | `employee` | 员工 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `funder_id` | `funder_id` | `funder` | 资金业务伙伴 |
| `gbl_currency_id` | `gbl_currency_id` | `gblCurrency` | 全局本币 |
| `grp_currency_id` | `grp_currency_id` | `grpCurrency` | 集团本币 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `org` | 业务组织 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 组织本币 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币 |
| `partner_id` | `partner_id` | `partner` | 业务伙伴 |
| `prov_ratio_id` | `prov_ratio_id` | `provRatio` | 坏账计提比率ID |
| `prov_rule_id` | `prov_rule_id` | `provRule` | 坏账计提规则ID |
| `src_app_id` | `src_app_id` | `srcApp` | 来源应用 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillType` | 来源单据类型 |
| `src_trade_type_id` | `src_trade_type_id` | `srcTradeType` | 来源单据交易类型 |
| `supplier_id` | `supplier_id` | `supplier` | 供应商(系统) |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clear_time` | `clear_time` | `clearTime` | 清账时间 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 是否冲销 |

### 枚举字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_convert_param` | `acc_convert_param` | `accConvertParam` | 本币折算参数 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务 |
| `bln_effect` | `bln_effect` | `blnEffect` | 生效状态 |
| `gbl_convert_param` | `gbl_convert_param` | `gblConvertParam` | 全局币折算参数 |
| `grp_convert_param` | `grp_convert_param` | `grpConvertParam` | 集团币折算参数 |
| `local_balance_state` | `local_balance_state` | `localBalanceState` | 本币清账状态 |
| `org_convert_param` | `org_convert_param` | `orgConvertParam` | 组织币折算参数 |
| `post_state` | `post_state` | `postState` | 事项分录生成状态 |
| `settle_state` | `settle_state` | `settleState` | 结算状态 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源收付会计事务 |
| `status` | `status` | `status` | 事务状态 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `send_data_version` | `send_data_version` | `sendDataVersion` | 发送会计平台数据版本 |

### 数值字段 (11个)

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

### multipleOption (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balance_state` | `balance_state` | `balanceState` | 清账状态 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `src_system` | `src_system` | `srcSystem` | 来源系统 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 流水账事务明细信息 |
