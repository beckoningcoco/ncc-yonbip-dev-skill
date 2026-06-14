---
tags: [BIP, 元数据, 数据字典, EAR.EAR.BadDebtCycleProvHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 事务ID (`EAR.EAR.BadDebtCycleProvHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_baddebt_provision_h` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`271ea926-60f8-4558-be23-f55d825c61f6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 事务ID |
| 物理表 | `arap_baddebt_provision_h` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 81 个 |
| 子表 | 1 个 |
| 关联引用 | 21 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `EAR.EAR.BadDebtCycleProvBody` | composition |

## 关联引用 (21个)

| 字段名 | 引用类型 |
|--------|---------|
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `gbl_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `voucher_type_id` | `fiepub.epub_vouchertype_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `acc_purpose_id` | `finbd.bd_accpurposeref` |
| `acc_period_id` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `prov_ratio_id` | `` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `acc_age_id` | `fiepub.fiepub_accountageref` |
| `acc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `prov_rule_id` | `yonbip-fi-earap.RefTable_5efbc6401` |

## 继承接口 (5个, 12字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 81 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `check_error_msg` | `check_error_msg` | `checkErrorMsg` | 会计事务校验异常信息 |
| `event_code` | `event_code` | `code` | 坏账计提会计事务记录号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局分布式事务ID |
| `entry_id` | `entry_id` | `entry` | 事项分录ID |
| `entry_code` | `entry_code` | `entryCode` | 事项分录编码 |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态编码 |
| `voucher_id` | `voucher_id` | `voucher` | 总账凭证ID |
| `voucher_code` | `voucher_code` | `voucherCode` | 总账凭证号 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_age_id` | `acc_age_id` | `accAge` | 账龄方案 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_currency_id` | `acc_currency_id` | `accCurrency` | 账簿本币 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `acc_purpose_id` | `acc_purpose_id` | `accPurpose` | 核算目的 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `gbl_currency_id` | `gbl_currency_id` | `gblCurrency` | 全局本币 |
| `grp_currency_id` | `grp_currency_id` | `grpCurrency` | 集团本币 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 组织本币 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币 |
| `prov_ratio_id` | `prov_ratio_id` | `provRatio` | 坏账计提比率 |
| `prov_rule_id` | `prov_rule_id` | `provRule` | 坏账计提规则 |
| `src_app_id` | `src_app_id` | `srcApp` | 来源应用 |
| `voucher_type_id` | `voucher_type_id` | `voucherType` | 总账凭证类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_date` | `acc_date` | `accDate` | 记账日期 |
| `prov_date` | `prov_date` | `provDate` | 计提日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_include_esti` | `bln_include_esti` | `blnIncludeEsti` | 是否包含暂估 |
| `bln_open` | `bln_open` | `blnOpen` | 是否期初 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `analysis_date` | `analysis_date` | `analysisDate` | 分析日期 |
| `frequency` | `frequency` | `frequency` | 计提频率 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 会计事务类型 |
| `post_state` | `post_state` | `postState` | 事项分录生成状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态 |
| `prov_order` | `prov_order` | `provOrder` | 计提顺序 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `send_data_version` | `send_data_version` | `sendDataVersion` | 发送会计平台数据版本 |

### 数值字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_ar_amount` | `acc_ar_amount` | `accArAmount` | 应收账款本币金额 |
| `acc_back_amount` | `acc_back_amount` | `accBackAmount` | 本期收回本币金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 期末本币余额 |
| `acc_loss_amount` | `acc_loss_amount` | `accLossAmount` | 本期损失本币金额 |
| `acc_open_balance` | `acc_open_balance` | `accOpenBalance` | 期初本币余额 |
| `acc_prov_amount` | `acc_prov_amount` | `accProvAmount` | 本期计提本币金额 |
| `gbl_ar_amount` | `gbl_ar_amount` | `gblArAmount` | 应收账款全局币金额 |
| `gbl_back_amount` | `gbl_back_amount` | `gblBackAmount` | 本期收回全局币金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 期末全局币余额 |
| `gbl_loss_amount` | `gbl_loss_amount` | `gblLossAmount` | 本期损失全局币金额 |
| `gbl_open_balance` | `gbl_open_balance` | `gblOpenBalance` | 期初全局币余额 |
| `gbl_prov_amount` | `gbl_prov_amount` | `gblProvAmount` | 本期计提全局币金额 |
| `grp_ar_amount` | `grp_ar_amount` | `grpArAmount` | 应收账款集团币金额 |
| `grp_back_amount` | `grp_back_amount` | `grpBackAmount` | 本期收回集团币金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 期末集团币余额 |
| `grp_loss_amount` | `grp_loss_amount` | `grpLossAmount` | 本期损失集团币金额 |
| `grp_open_balance` | `grp_open_balance` | `grpOpenBalance` | 期初集团币余额 |
| `grp_prov_amount` | `grp_prov_amount` | `grpProvAmount` | 本期计提集团币金额 |
| `org_ar_amount` | `org_ar_amount` | `orgArAmount` | 应收账款组织币金额 |
| `org_back_amount` | `org_back_amount` | `orgBackAmount` | 本期收回组织币金额 |
| `org_balance` | `org_balance` | `orgBalance` | 期末组织币余额 |
| `org_loss_amount` | `org_loss_amount` | `orgLossAmount` | 本期损失组织币金额 |
| `org_open_balance` | `org_open_balance` | `orgOpenBalance` | 期初组织币余额 |
| `org_prov_amount` | `org_prov_amount` | `orgProvAmount` | 本期计提组织币金额 |
| `ori_ar_amount` | `ori_ar_amount` | `oriArAmount` | 应收账款金额 |
| `ori_back_amount` | `ori_back_amount` | `oriBackAmount` | 本期收回金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 期末余额 |
| `ori_loss_amount` | `ori_loss_amount` | `oriLossAmount` | 本期损失金额 |
| `ori_open_balance` | `ori_open_balance` | `oriOpenBalance` | 期初余额 |
| `ori_prov_amount` | `ori_prov_amount` | `oriProvAmount` | 本期计提金额 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 坏账周期计提明细信息 |
