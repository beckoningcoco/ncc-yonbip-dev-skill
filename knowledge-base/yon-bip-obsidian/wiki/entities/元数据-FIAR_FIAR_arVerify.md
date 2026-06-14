---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.arVerify]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收核销查询基本信息 (`FIAR.FIAR.arVerify`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_h` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`df67a357-bdba-43e7-99e3-074a9c204c6a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收核销查询基本信息 |
| 物理表 | `arap_ledger_h` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 104 个 |
| 子表 | 1 个 |
| 关联引用 | 34 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `FIAR.FIAR.arVerifytBody` | composition |

## 关联引用 (34个)

| 字段名 | 引用类型 |
|--------|---------|
| `funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `gbl_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `modifier` | `bpd-check-ld.RefTable_04814db086` |
| `biz_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `employee_id` | `iuap-ptc-yoncmm.sattUuser` |
| `grp_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `acc_year_id` | `finbd.bd_period` |
| `acc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
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

## 继承接口 (2个, 2字段)

- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 104 个直连字段

### 文本字段 (35个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_date` | `acc_date` | `accDate` | 记账日期 |
| `bln_effect` | `bln_effect` | `blnEffect` | 生效状态 |
| `event_code` | `event_code` | `code` | 会计事务记录号 |
| `src_bill_code` | `src_bill_code` | `srcBillCode` | 单据编号 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 单据日期 |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度 |
| `biz_bill_code` | `biz_bill_code` | `bizBillCode` | 业务单据编号 |
| `biz_bill_id` | `biz_bill_id` | `bizBillId` | 业务单据ID |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `check_error_msg` | `check_error_msg` | `checkErrorMsg` | 会计事务校验异常信息 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `opp_bill_id` | `opp_bill_id` | `oppBillId` | 对应单据ID |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `retailer_name` | `retailer_name` | `retailer` | 散户 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `transfer_params` | `transfer_params` | `transferParams` | 转移参数 |

### 引用字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_currency_id` | `acc_currency_id` | `accCurrency` | 账簿本币 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `employee_id` | `employee_id` | `employee` | 员工 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `gbl_currency_id` | `gbl_currency_id` | `gblCurrencyId` | 全局本币 |
| `grp_currency_id` | `grp_currency_id` | `grpCurrencyId` | 集团本币 |
| `org_currency_id` | `org_currency_id` | `orgCurrencyId` | 组织本币 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillType` | 业务事项 |
| `src_trade_type_id` | `src_trade_type_id` | `srcTradeType` | 交易类型 |
| `supplier_id` | `supplier_id` | `supplier` | 供应商 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_purpose` | `acc_purpose` | `accPurpose` | 核算目的 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `biz_bill_type_id` | `biz_bill_type_id` | `bizBillType` | 业务单据类型ID |
| `biz_bill_trade_type_id` | `biz_bill_trade_type_id` | `bizTradeType` | 业务单据交易类型ID |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `funder_id` | `funder_id` | `funder` | 资金业务伙伴 |
| `gbl_currency_id` | `gbl_currency_id` | `gblCurrency` | 全局本币 |
| `grp_currency_id` | `grp_currency_id` | `grpCurrency` | 集团本币 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `org` | 业务组织 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 组织本币 |
| `partner_id` | `partner_id` | `partner` | 业务伙伴 |
| `prov_ratio_id` | `prov_ratio_id` | `provRatio` | 坏账计提比率ID |
| `prov_rule_id` | `prov_rule_id` | `provRule` | 坏账计提规则ID |
| `src_app_id` | `src_app_id` | `srcApp` | 来源应用 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clear_time` | `clear_time` | `clearTime` | 清账时间 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 是否冲销 |

### 枚举字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_convert_param` | `acc_convert_param` | `accConvertParam` | 本币折算参数 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 会计事务 |
| `gbl_convert_param` | `gbl_convert_param` | `gblConvertParam` | 全局币折算参数 |
| `grp_convert_param` | `grp_convert_param` | `grpConvertParam` | 集团币折算参数 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `org_convert_param` | `org_convert_param` | `orgConvertParam` | 组织币折算参数 |
| `verify_curr_rule` | `verify_curr_rule` | `verifyCurrRule` | 币种核销规则 |
| `local_balance_state` | `local_balance_state` | `localBalanceState` | 本币清账状态 |
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
| `acc_balance` | `acc_balance` | `accBalance` | 本币可用余额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 原币可用余额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |

### multipleOption (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balance_state` | `balance_state` | `balanceState` | 清账状态 |
| `src_system` | `src_system` | `srcSystem` | 来源系统 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 应收核销查询分组信息 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |
