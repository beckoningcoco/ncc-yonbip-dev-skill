---
tags: [BIP, 元数据, 数据字典, EAR.EAR.BadDebtProvOpenBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 坏账期初设置明细信息 (`EAR.EAR.BadDebtProvOpenBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_baddebt_provision_b` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`5ad2994a-06ef-427c-a6eb-27dd2a35e072`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 坏账期初设置明细信息 |
| 物理表 | `arap_baddebt_provision_b` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 55 个 |
| 子表 | 0 个 |
| 关联引用 | 19 个 |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `loss_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `grp_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `acc_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `prov_ratio_row_id` | `yonbip-fi-earap.RefTable_697e153746` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `prepare_subject_id` | `fiepub.fiepub_accsubjectref` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `gbl_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `header_id` | `` |
| `acc_period_id` | `finbd.bd_period` |
| `loss_subject_id` | `fiepub.fiepub_accsubjectref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `prepare_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |

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

> 共 55 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局分布式事务ID |
| `id` | `id` | `id` | 主键 |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_exchange_rate_type_id` | `acc_exchange_rate_type_id` | `accExchangeRateType` | 汇率类型 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `gbl_exchange_rate_type_id` | `gbl_exchange_rate_type_id` | `gblExchangeRateType` | 全局币汇率类型 |
| `grp_exchange_rate_type_id` | `grp_exchange_rate_type_id` | `grpExchangeRateType` | 集团币汇率类型 |
| `header_id` | `header_id` | `headerId` | 坏账期初设置 |
| `loss_subject_id` | `loss_subject_id` | `lossSubject` | 减值损失科目 |
| `loss_subject_vid` | `loss_subject_vid` | `lossSubjectVid` | 减值损失科目版本 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_exchange_rate_type_id` | `org_exchange_rate_type_id` | `orgExchangeRateType` | 组织币汇率类型 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `prepare_subject_id` | `prepare_subject_id` | `prepareSubject` | 坏账准备科目 |
| `prepare_subject_vid` | `prepare_subject_vid` | `prepareSubjectVid` | 坏账准备科目版本 |
| `prov_ratio_row_id` | `prov_ratio_row_id` | `provRatioRow` | 坏账计提比率明细 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate_ops` | `acc_exchange_rate_ops` | `accExchangeRateOps` | 本币汇率折算方式 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 会计事务类型 |
| `digest` | `digest` | `digest` | 摘要 |
| `gbl_exchange_rate_ops` | `gbl_exchange_rate_ops` | `gblExchangeRateOps` | 全局币汇率折算方式 |
| `grp_exchange_rate_ops` | `grp_exchange_rate_ops` | `grpExchangeRateOps` | 集团币汇率折算方式 |
| `org_exchange_rate_ops` | `org_exchange_rate_ops` | `orgExchangeRateOps` | 组织币汇率折算方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_back_amount` | `acc_back_amount` | `accBackAmount` | 本期收回本币金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 期末本币余额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `acc_loss_amount` | `acc_loss_amount` | `accLossAmount` | 本期损失本币金额 |
| `gbl_back_amount` | `gbl_back_amount` | `gblBackAmount` | 本期收回全局币金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 期末全局币余额 |
| `gbl_exchange_rate` | `gbl_exchange_rate` | `gblExchangeRate` | 全局币汇率 |
| `gbl_loss_amount` | `gbl_loss_amount` | `gblLossAmount` | 本期损失全局币金额 |
| `grp_back_amount` | `grp_back_amount` | `grpBackAmount` | 本期收回集团币金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 期末集团币余额 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团币汇率 |
| `grp_loss_amount` | `grp_loss_amount` | `grpLossAmount` | 本期损失集团币金额 |
| `org_back_amount` | `org_back_amount` | `orgBackAmount` | 本期收回组织币金额 |
| `org_balance` | `org_balance` | `orgBalance` | 期末组织币余额 |
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织币汇率 |
| `org_loss_amount` | `org_loss_amount` | `orgLossAmount` | 本期损失组织币金额 |
| `ori_back_amount` | `ori_back_amount` | `oriBackAmount` | 本期收回金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 期末余额 |
| `ori_loss_amount` | `ori_loss_amount` | `oriLossAmount` | 本期损失金额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
