---
tags: [BIP, 元数据, 数据字典, GL.newBalance.BalanceBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 余额表 (`GL.newBalance.BalanceBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_balance` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`a466ae96-8fb6-4479-8760-5fe2ca37cfa5`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 余额表 |
| 物理表 | `fi_balance` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 64 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `acc_period_id` | `finbd.bd_period` |
| `accsubject` | `fiepub.fiepub_accsubjectref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `auxiliary` | `` |
| `accbook` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `measuredoc` | `productcenter.pc_unitref` |
| `two_level_accentity_id` | `ucf-org-center.org_pure_tree_ref` |
| `ytenant_id` | `` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 继承接口 (2个, 5字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 64 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbody` | `accbody` | `accBody` | 会计主体 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 期间年 |
| `description` | `description` | `description` | 描述 |
| `flag` | `flag` | `flag` | 余额标志,00开帐年初;01开帐累计发生;03后续年份年初;02当前月份的发生;10损益结转凭证当期发生;20表结法下损益结转凭 |
| `groupid` | `groupid` | `groupId` | 分组ID |
| `id` | `id` | `id` | 主键 |
| `period` | `period` | `period` | 会计期间 |
| `periodadjust` | `periodadjust` | `periodAdjust` | 调整期间 |
| `periodunion` | `periodunion` | `periodUnion` | 全会计期间 |
| `secondorg` | `secondorg` | `secondOrg` | 二级核算单位 |
| `source_name` | `source_name` | `sourceName` | 来源系统名称 |
| `source_unique` | `source_unique` | `sourceUnique` | 来源系统id |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_id` | `acc_period_id` | `accPeriodId` | 期间 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计期间年 |
| `accbook` | `accbook` | `accbook` | 账簿 |
| `accsubject` | `accsubject` | `accsubject` | 科目OID |
| `auxiliary` | `auxiliary` | `auxiliaryId` | 辅助核算 |
| `creator` | `creator` | `creator` | 创建人 |
| `currency` | `currency` | `currency` | 原币币种 |
| `measuredoc` | `measuredoc` | `measureDoc` | 主计量单位 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `two_level_accentity_id` | `two_level_accentity_id` | `twoLevelAccentityId` | 内部核算单元 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifier` | `modifier` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `ts` | `ts` | `pubts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auxiliary_seq_no` | `auxiliary_seq_no` | `auxiliarySeqNo` | 辅助核算排序号 |
| `dr` | `dr` | `dr` | 删除标识 |

### 数值字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accumulate_creditamount` | `accumulate_creditamount` | `accumulateCreditAmount` | 累计发生贷方原币金额 |
| `accumulate_creditquantity` | `accumulate_creditquantity` | `accumulateCreditQuantity` | 累计发生贷方数量 |
| `accumulate_debitamount` | `accumulate_debitamount` | `accumulateDebitAmount` | 累计发生借方原币金额 |
| `accumulate_debitquantity` | `accumulate_debitquantity` | `accumulateDebitQuantity` | 累计发生借方数量 |
| `accumulate_global_credit_amount` | `accumulate_global_credit_amount` | `accumulateGlobalCreditAmount` | 累计发生贷方本币金额(全局) |
| `accumulate_global_debit_amount` | `accumulate_global_debit_amount` | `accumulateGlobalDebitAmount` | 累计发生借方本币金额(全局) |
| `accumulate_group_credit_amount` | `accumulate_group_credit_amount` | `accumulateGroupCreditAmount` | 累计发生贷方本币金额(集团) |
| `accumulate_group_debit_amount` | `accumulate_group_debit_amount` | `accumulateGroupDebitAmount` | 累计发生借方本币金额(集团) |
| `accumulate_localcreditamount` | `accumulate_localcreditamount` | `accumulateLocalCreditAmount` | 累计发生贷方本币金额 |
| `accumulate_localdebitamount` | `accumulate_localdebitamount` | `accumulateLocalDebitAmount` | 累计发生借方本币金额 |
| `accumulate_org_credit_amount` | `accumulate_org_credit_amount` | `accumulateOrgCreditAmount` | 累计发生贷方本币金额(组织) |
| `accumulate_org_debit_amount` | `accumulate_org_debit_amount` | `accumulateOrgDebitAmount` | 累计发生借方本币金额(组织) |
| `creditamount` | `creditamount` | `creditAmount` | 贷方原币金额 |
| `creditquantity` | `creditquantity` | `creditQuantity` | 贷方数量 |
| `debitamount` | `debitamount` | `debitAmount` | 借方原币金额 |
| `debitquantity` | `debitquantity` | `debitQuantity` | 借方数量 |
| `global_credit_amount` | `global_credit_amount` | `globalCreditAmount` | 贷方本币金额(全局) |
| `global_debit_amount` | `global_debit_amount` | `globalDebitAmount` | 借方本币金额(全局) |
| `group_credit_amount` | `group_credit_amount` | `groupCreditAmount` | 贷方本币金额(集团) |
| `group_debit_amount` | `group_debit_amount` | `groupDebitAmount` | 借方本币金额(集团) |
| `localcreditamount` | `localcreditamount` | `localCreditAmount` | 贷方本币金额 |
| `localdebitamount` | `localdebitamount` | `localDebitAmount` | 借方本币金额 |
| `opening_creditamount` | `opening_creditamount` | `openingCreditAmount` | 年初贷方原币金额 |
| `opening_creditquantity` | `opening_creditquantity` | `openingCreditQuantity` | 年初贷方数量 |
| `opening_debitamount` | `opening_debitamount` | `openingDebitAmount` | 年初借方原币金额 |
| `opening_debitquantity` | `opening_debitquantity` | `openingDebitQuantity` | 年初借方数量 |
| `opening_global_credit_amount` | `opening_global_credit_amount` | `openingGlobalCreditAmount` | 年初贷方本币金额(全局) |
| `opening_global_debit_amount` | `opening_global_debit_amount` | `openingGlobalDebitAmount` | 年初借方本币金额(全局) |
| `opening_group_credit_amount` | `opening_group_credit_amount` | `openingGroupCreditAmount` | 年初贷方本币金额(集团) |
| `opening_group_debit_amount` | `opening_group_debit_amount` | `openingGroupDebitAmount` | 年初借方本币金额(集团) |
| `opening_localcreditamount` | `opening_localcreditamount` | `openingLocalCreditAmount` | 年初贷方本币金额 |
| `opening_localdebitamount` | `opening_localdebitamount` | `openingLocalDebitAmount` | 年初借方本币金额 |
| `opening_org_credit_amount` | `opening_org_credit_amount` | `openingOrgCreditAmount` | 年初贷方本币金额(组织) |
| `opening_org_debit_amount` | `opening_org_debit_amount` | `openingOrgDebitAmount` | 年初借方本币金额(组织) |
| `org_credit_amount` | `org_credit_amount` | `orgCreditAmount` | 贷方本币金额(组织) |
| `org_debit_amount` | `org_debit_amount` | `orgDebitAmount` | 借方本币金额(组织) |
