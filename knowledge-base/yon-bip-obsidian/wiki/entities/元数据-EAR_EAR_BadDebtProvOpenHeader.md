---
tags: [BIP, 元数据, 数据字典, EAR.EAR.BadDebtProvOpenHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 坏账期初设置基本信息 (`EAR.EAR.BadDebtProvOpenHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_baddebt_provision_h` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`5ad2994a-06ef-427c-a6eb-27dd2a35e072`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 坏账期初设置基本信息 |
| 物理表 | `arap_baddebt_provision_h` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 57 个 |
| 子表 | 2 个 |
| 关联引用 | 26 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `EAR.EAR.BadDebtProvOpenBody` | composition |
| `bodyItemSpecificList` | `EAR.EAR.BadDebtProvOpenSpecificBody` | composition |

## 关联引用 (26个)

| 字段名 | 引用类型 |
|--------|---------|
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `loss_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `gbl_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `loss_subject_id` | `fiepub.fiepub_accsubjectref` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `prepare_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `acc_age_id` | `fiepub.fiepub_accountageref` |
| `acc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `prov_rule_id` | `yonbip-fi-earap.RefTable_5efbc6401` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `voucher_type_id` | `fiepub.epub_vouchertype_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `prepare_subject_id` | `fiepub.fiepub_accsubjectref` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `acc_purpose_id` | `finbd.bd_accpurposeref` |
| `acc_period_id` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `prov_ratio_id` | `` |

## 继承接口 (6个, 15字段)

- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
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

> 共 57 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `check_error_msg` | `check_error_msg` | `checkErrorMsg` | 会计事务校验异常信息 |
| `event_code` | `event_code` | `code` | 编码 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局分布式事务ID |
| `entry_id` | `entry_id` | `entry` | 事项分录ID |
| `entry_code` | `entry_code` | `entryCode` | 事项分录编码 |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态编码 |
| `voucher_id` | `voucher_id` | `voucher` | 总账凭证ID |
| `voucher_code` | `voucher_code` | `voucherCode` | 总账凭证号 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (24个)

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
| `loss_subject_id` | `loss_subject_id` | `lossSubject` | 减值损失科目 |
| `loss_subject_vid` | `loss_subject_vid` | `lossSubjectVid` | 减值损失科目版本 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 组织本币 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币 |
| `prepare_subject_id` | `prepare_subject_id` | `prepareSubject` | 坏账准备科目 |
| `prepare_subject_vid` | `prepare_subject_vid` | `prepareSubjectVid` | 坏账准备科目版本 |
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

### 日期时间 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_include_esti` | `bln_include_esti` | `blnIncludeEsti` | 是否包含暂估 |
| `bln_open` | `bln_open` | `blnOpen` | 是否期初 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `frequency` | `frequency` | `frequency` | 计提频率 |
| `analysis_date` | `analysis_date` | `analysisDate` | 分析日期 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 会计事务类型 |
| `post_state` | `post_state` | `postState` | 事项分录生成状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |
| `enable` | `enable` | `enable` | 档案状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItemSpecificList` | 坏账期初设置个别计提明细信息 |
| `` | `` | `bodyItem` | 坏账期初设置明细信息 |
