---
tags: [BIP, 元数据, 数据字典, earap.arPublicEvent.ARPublicGrandsonBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 日常应收计划信息 (`earap.arPublicEvent.ARPublicGrandsonBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`27906f1b-359e-44fb-932f-ce3a9b5444e0`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 日常应收计划信息 |
| 物理表 | `arap_ledger_g` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 79 个 |
| 子表 | 0 个 |
| 关联引用 | 16 个 |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `carryover_year_id` | `finbd.bd_period` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_period_id` | `finbd.bd_period` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `body_id` | `` |
| `ar_subject_id` | `fiepub.fiepub_accsubjectref` |
| `b_quick_type_id` | `finbd.bd_paymenttyperef` |
| `acc_period_id` | `finbd.bd_period` |
| `ar_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `acc_year_id` | `finbd.bd_period` |
| `event_id` | `` |

## 继承接口 (3个, 14字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`

## 字段列表（按类型分组）

> 共 79 个直连字段

### 文本字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryoverGrandson` | 结转事务孙行 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `ori_arap_event_type` | `ori_arap_event_type` | `oriArapEventType` | 源头事务类型 |
| `ori_grandson_id` | `ori_grandson_id` | `oriGrandsonId` | 源头孙表ID |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源收付事务类型 |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `src_exe_detail_id` | `src_exe_detail_id` | `srcExeDetailId` | 来源执行明细ID |
| `src_grandson_id` | `src_grandson_id` | `srcGrandson` | 来源核算ID |
| `write_off_src_data_id` | `write_off_src_data_id` | `writeOffSrcDataId` | 冲销来源数据协议标识 |

### 引用字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `ar_subject_id` | `ar_subject_id` | `arSubject` | 应收账款科目 |
| `ar_subject_vid` | `ar_subject_vid` | `arSubjectVid` | 应收账款科目版本 |
| `body_id` | `body_id` | `body` | 应收明细 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `event_id` | `event_id` | `event` | 表头事务ID |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `b_quick_type_id` | `b_quick_type_id` | `quickType` | 款项类型 |
| `settle_mode_id` | `settle_mode_id` | `settleMode` | 结算方式 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clear_time` | `clear_time` | `clearTime` | 清账时间 |
| `expire_date` | `expire_date` | `expireDate` | 到期日 |
| `local_clear_time` | `local_clear_time` | `localClearTime` | 本币清账时间 |
| `start_date` | `start_date` | `startDate` | 起算日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_deposit` | `bln_deposit` | `blnDeposit` | 是否保证金 |
| `bln_hangup` | `bln_hangup` | `blnHangUp` | 是否挂起 |
| `bln_prepare` | `bln_prepare` | `blnPrepare` | 是否预收 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount_direction` | `amount_direction` | `amountDirection` | 借贷方向 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务 |
| `balance_state` | `balance_state` | `balanceState` | 清账状态 |
| `convert_way` | `convert_way` | `convertWay` | 预收核销方法 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `local_balance_state` | `local_balance_state` | `localBalanceState` | 本币清账状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `issue_no` | `issue_no` | `issueNo` | 收款期号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 计划收款本币金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 计划收款金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 余额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |
| `ratio` | `ratio` | `ratio` | 收款比例 |
| `row_no` | `row_no` | `rowNo` | 行号 |
