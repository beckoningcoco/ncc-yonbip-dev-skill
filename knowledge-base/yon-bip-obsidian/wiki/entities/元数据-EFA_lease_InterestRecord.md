---
tags: [BIP, 元数据, 数据字典, EFA.lease.InterestRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 利息清单 (`EFA.lease.InterestRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_interest_record` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`147f9678-ee99-49cf-b64d-2e44ca0df71b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 利息清单 |
| 物理表 | `fa_interest_record` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 75 个 |
| 子表 | 1 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `EFA.lease.InterestRecordDtl` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `acc_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `mgmt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `mgmt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `grp_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `category_id` | `` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `gbl_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `asset_category_id` | `` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `mgmt_cost_center_id` | `finbd.bd_costcenterref` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 75 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_cal_id` | `asset_cal_id` | `assetCalId` | 卡片核算id |
| `asset_code` | `asset_code` | `assetCode` | 固定资产编码 |
| `contract_id` | `contract_id` | `contractId` | 卡片租赁合同ID |
| `contract_name` | `contract_name` | `contractName` | 卡片租赁合同名称 |
| `contract_no` | `contract_no` | `contractNo` | 卡片租赁合同编码 |
| `period_code` | `period_code` | `period` | 会计期间编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_currtype_id` | `acc_currtype_id` | `accCurrtypeId` | 本币币种ID |
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片ID |
| `category_id` | `category_id` | `categoryParentId` | 固定资产类别一级节点ID |
| `gbl_currtype_id` | `gbl_currtype_id` | `gblCurrtypeId` | 全局币币种ID |
| `grp_currtype_id` | `grp_currtype_id` | `grpCurrtypeId` | 集团币币种ID |
| `mgmt_cost_center_id` | `mgmt_cost_center_id` | `mgmtCostCenterId` | 管理成本中心 |
| `mgmt_dept_id` | `mgmt_dept_id` | `mgmtDeptId` | 管理部门 |
| `mgmt_profit_center_id` | `mgmt_profit_center_id` | `mgmtProfitCenterId` | 管理利润中心 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种ID |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtypeId` | 原币币种ID |
| `period_id` | `period_id` | `periodId` | 会计期间ID |
| `usage_state_id` | `usage_state_id` | `usageStateId` | 使用状态 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_rate_ops` | `acc_rate_ops` | `accRateOps` | 本币汇率折算方式 |
| `gbl_rate_ops` | `gbl_rate_ops` | `gblRateOps` | 全局币汇率折算方式 |
| `grp_rate_ops` | `grp_rate_ops` | `grpRateOps` | 集团币汇率折算方式 |
| `org_rate_ops` | `org_rate_ops` | `orgRateOps` | 组织币汇率折算方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `max_version` | `max_version` | `maxVersion` | 当期最大版本号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_year_id` | `period_year_id` | `periodYearId` | 年度期间ID |

### 数值字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_accum_interest` | `acc_accum_interest` | `accAccumInterest` | 本币累计计提利息 |
| `acc_beginning_lease_liability` | `acc_beginning_lease_liability` | `accBeginningLeaseLiability` | 本币期初租赁负债 |
| `acc_ending_lease_liability` | `acc_ending_lease_liability` | `accEndingLeaseLiability` | 本币期末租赁负债 |
| `acc_interest` | `acc_interest` | `accInterest` | 账簿本币计提利息 |
| `acc_lease_payments` | `acc_lease_payments` | `accLeasePayments` | 本币租赁付款金额 |
| `acc_rate` | `acc_rate` | `accRate` | 本币汇率 |
| `acc_year_accum_interest` | `acc_year_accum_interest` | `accYearAccumInterest` | 本币年累计计提利息 |
| `accum_interest` | `accum_interest` | `accumInterest` | 原币累计计提利息 |
| `beginning_lease_liability` | `beginning_lease_liability` | `beginningLeaseLiability` | 期初租赁负债 |
| `ending_lease_liability` | `ending_lease_liability` | `endingLeaseLiability` | 期末租赁负债 |
| `gbl_accum_interest` | `gbl_accum_interest` | `gblAccumInterest` | 全局币累计计提利息 |
| `gbl_beginning_lease_liability` | `gbl_beginning_lease_liability` | `gblBeginningLeaseLiability` | 全局币期初租赁负债 |
| `gbl_ending_lease_liability` | `gbl_ending_lease_liability` | `gblEndingLeaseLiability` | 全局币期末租赁负债 |
| `gbl_interest` | `gbl_interest` | `gblInterest` | 全局币计提利息 |
| `gbl_lease_payments` | `gbl_lease_payments` | `gblLeasePayments` | 全局币租赁付款金额 |
| `gbl_rate` | `gbl_rate` | `gblRate` | 全局币汇率 |
| `gbl_year_accum_interest` | `gbl_year_accum_interest` | `gblYearAccumInterest` | 全局币年累计计提利息 |
| `grp_accum_interest` | `grp_accum_interest` | `grpAccumInterest` | 集团币累计计提利息 |
| `grp_beginning_lease_liability` | `grp_beginning_lease_liability` | `grpBeginningLeaseLiability` | 集团币期初租赁负债 |
| `grp_ending_lease_liability` | `grp_ending_lease_liability` | `grpEndingLeaseLiability` | 集团币期末租赁负债 |
| `grp_interest` | `grp_interest` | `grpInterest` | 集团币计提利息 |
| `grp_lease_payments` | `grp_lease_payments` | `grpLeasePayments` | 集团币租赁付款金额 |
| `grp_rate` | `grp_rate` | `grpRate` | 集团币利率 |
| `grp_year_accum_interest` | `grp_year_accum_interest` | `grpYearAccumInterest` | 集团币年累计计提利息 |
| `interest` | `interest` | `interest` | 原币计提利息 |
| `lease_payments` | `lease_payments` | `leasePayments` | 租赁付款金额 |
| `max_version_acc_interest` | `max_version_acc_interest` | `maxVersionAccInterest` | 最大版本本币计提利息 |
| `max_version_gbl_interest` | `max_version_gbl_interest` | `maxVersionGblInterest` | 最大版本全局币计提利息 |
| `max_version_grp_interest` | `max_version_grp_interest` | `maxVersionGrpInterest` | 最大版本集团币计提利息 |
| `max_version_interest` | `max_version_interest` | `maxVersionInterest` | 最大版本原币计提利息 |
| `max_version_org_interest` | `max_version_org_interest` | `maxVersionOrgInterest` | 最大版本组织币计提利息 |
| `org_accum_interest` | `org_accum_interest` | `orgAccumInterest` | 组织币累计计提利息 |
| `org_beginning_lease_liability` | `org_beginning_lease_liability` | `orgBeginningLeaseLiability` | 组织币期初租赁负债 |
| `org_ending_lease_liability` | `org_ending_lease_liability` | `orgEndingLeaseLiability` | 组织币期末租赁负债 |
| `org_interest` | `org_interest` | `orgInterest` | 组织币计提利息 |
| `org_lease_payments` | `org_lease_payments` | `orgLeasePayments` | 组织币租赁付款金额 |
| `org_rate` | `org_rate` | `orgRate` | 组织币汇率 |
| `org_year_accum_interest` | `org_year_accum_interest` | `orgYearAccumInterest` | 组织币年累计计提利息 |
| `year_accum_interest` | `year_accum_interest` | `yearAccumInterest` | 年累计计提利息 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 计提利息分配 |
