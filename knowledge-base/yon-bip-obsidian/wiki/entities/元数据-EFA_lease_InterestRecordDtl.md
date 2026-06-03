---
tags: [BIP, 元数据, 数据字典, EFA.lease.InterestRecordDtl]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计提利息分配 (`EFA.lease.InterestRecordDtl`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_interest_record_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`147f9678-ee99-49cf-b64d-2e44ca0df71b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计提利息分配 |
| 物理表 | `fa_interest_record_dtl` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 55 个 |
| 子表 | 0 个 |
| 关联引用 | 16 个 |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `activity` | `` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `usage_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `interest_record_id` | `` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
| `usage_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (4个, 8字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
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
| `asset_code` | `asset_code` | `assetCode` | 固定资产编码 |
| `id` | `id` | `id` | 主键 |
| `period` | `period` | `period` | 会计期间Code |
| `voucher_make_sign` | `voucher_make_sign` | `voucherMakeSign` | 凭证制单标识 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体ID |
| `activity` | `activity` | `activity` | 活动 |
| `asset_id` | `asset_id` | `assetId` | 资产卡片ID |
| `creator` | `creator` | `creator` | 创建人 |
| `interest_record_id` | `interest_record_id` | `interestRecordId` | 利息清单 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `period_id` | `period_id` | `periodId` | 会计期间ID |
| `product_id` | `product_id` | `productId` | 产品ID |
| `project_id` | `project_id` | `projectId` | 项目ID |
| `usage_cost_center_id` | `usage_cost_center_id` | `usageCostCenterId` | 使用成本中心ID |
| `usage_dept_id` | `usage_dept_id` | `usageDeptId` | 使用部门ID |
| `usage_profit_center_id` | `usage_profit_center_id` | `usageProfitCenterId` | 使用利润中心ID |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_accum_interest` | `acc_accum_interest` | `accAccumInterest` | 本币累计计提利息 |
| `acc_beginning_lease_liability` | `acc_beginning_lease_liability` | `accBeginningLeaseLiability` | 本币期初租赁负债 |
| `acc_ending_lease_liability` | `acc_ending_lease_liability` | `accEndingLeaseLiability` | 本币期末租赁负债 |
| `acc_interest` | `acc_interest` | `accInterest` | 本币计提利息 |
| `acc_lease_payments` | `acc_lease_payments` | `accLeasePayments` | 本币租赁付款额 |
| `acc_year_accum_interest` | `acc_year_accum_interest` | `accYearAccumInterest` | 本币年累计计提利息 |
| `accum_interest` | `accum_interest` | `accumInterest` | 累计计提利息 |
| `asgmt_ratio` | `asgmt_ratio` | `asgmtRatio` | 分配比例 |
| `beginning_lease_liability` | `beginning_lease_liability` | `beginningLeaseLiability` | 期初租赁负债 |
| `ending_lease_liability` | `ending_lease_liability` | `endingLeaseLiability` | 期末租赁负债 |
| `gbl_accum_interest` | `gbl_accum_interest` | `gblAccumInterest` | 全局币累计计提利息 |
| `gbl_beginning_lease_liability` | `gbl_beginning_lease_liability` | `gblBeginningLeaseLiability` | 全局币期初租赁负债 |
| `gbl_ending_lease_liability` | `gbl_ending_lease_liability` | `gblEndingLeaseLiability` | 全局币期末租赁负债 |
| `gbl_interest` | `gbl_interest` | `gblInterest` | 全局币计提利息 |
| `gbl_lease_payments` | `gbl_lease_payments` | `gblLeasePayments` | 全局币租赁付款额 |
| `gbl_year_accum_interest` | `gbl_year_accum_interest` | `gblYearAccumInterest` | 全局币年累计计提利息 |
| `grp_accum_interest` | `grp_accum_interest` | `grpAccumInterest` | 集团币累计计提利息 |
| `grp_beginning_lease_liability` | `grp_beginning_lease_liability` | `grpBeginningLeaseLiability` | 集团币期初租赁负债 |
| `grp_ending_lease_liability` | `grp_ending_lease_liability` | `grpEndingLeaseLiability` | 集团币期末租赁负债 |
| `grp_interest` | `grp_interest` | `grpInterest` | 集团币计提利息 |
| `grp_lease_payments` | `grp_lease_payments` | `grpLeasePayments` | 集团币租赁付款额 |
| `grp_year_accum_interest` | `grp_year_accum_interest` | `grpYearAccumInterest` | 集团币年累计计提利息 |
| `interest` | `interest` | `interest` | 计提利息 |
| `lease_payments` | `lease_payments` | `leasePayments` | 租赁付款额 |
| `org_accum_interest` | `org_accum_interest` | `orgAccumInterest` | 组织币累计计提利息 |
| `org_beginning_lease_liability` | `org_beginning_lease_liability` | `orgBeginningLeaseLiability` | 组织币期初租赁负债 |
| `org_ending_lease_liability` | `org_ending_lease_liability` | `orgEndingLeaseLiability` | 组织币期末租赁负债 |
| `org_interest` | `org_interest` | `orgInterest` | 组织币计提利息 |
| `org_lease_payments` | `org_lease_payments` | `orgLeasePayments` | 组织币租赁付款额 |
| `org_year_accum_interest` | `org_year_accum_interest` | `orgYearAccumInterest` | 组织币年累计计提利息 |
| `year_accum_interest` | `year_accum_interest` | `yearAccumInterest` | 年累计计提利息 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |
