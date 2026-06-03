---
tags: [BIP, 元数据, 数据字典, EFA.fabalance.FaBalanceTemporaryBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产余额中间表 (`EFA.fabalance.FaBalanceTemporaryBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_balance_temporary` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`4085e19b-60c2-4a6d-980b-ba7ca21e4ab3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产余额中间表 |
| 物理表 | `fa_balance_temporary` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 69 个 |
| 子表 | 0 个 |
| 关联引用 | 20 个 |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `usage_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `mgt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `grp_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
| `add_way_id` | `yonbip-fi-efa.at_addwayref` |
| `usage_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `gbl_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorymainref` |
| `mgt_cost_center_id` | `finbd.bd_costcenterref` |
| `impairment_unit_id` | `yonbip-fi-efa.fa_impairmentunit_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 69 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `header_id` | `header_id` | `headerId` | 会计事物id |
| `period_code` | `period_code` | `period` | 会计期间code |
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `event_code` | `event_code` | `eventCode` | 事件类型 |
| `batch_id` | `batch_id` | `batchId` | 汇总批次id |
| `gather_sign` | `gather_sign` | `gatherSign` | 汇总标识 |
| `gather_sign_no_period` | `gather_sign_no_period` | `gatherSignNoPeriod` | 汇总标识不带期间 |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifier` | `modifier` | `modifier` | 修改人 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体ID |
| `usage_cost_center_id` | `usage_cost_center_id` | `usageCostCenterId` | 使用成本中心 |
| `add_way_id` | `add_way_id` | `addWayId` | 固定资产增加方式 |
| `period_id` | `period_id` | `periodId` | 会计期间id |
| `creator` | `creator` | `creator` | 创建人 |
| `product_id` | `product_id` | `productId` | 产品 |
| `usage_dept_id` | `usage_dept_id` | `usageDeptId` | 使用部门 |
| `mgt_profit_center_id` | `mgt_profit_center_id` | `mgmtProfitCenterId` | 管理利润中心 |
| `mgt_dept_id` | `mgt_dept_id` | `mgmtDeptId` | 管理部门 |
| `usage_profit_center_id` | `usage_profit_center_id` | `usageProfitCenterId` | 使用利润中心 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | `mgmtCostCenterId` | 管理成本中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 账簿币种 |
| `gbl_currtype_id` | `gbl_currtype_id` | `gblCurrtypeId` | 全局币币种 |
| `grp_currtype_id` | `grp_currtype_id` | `grpCurrtypeId` | 集团币币种 |
| `impairment_unit_id` | `impairment_unit_id` | `impairmentUnitId` | 减值单元 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |
| `create_time` | `create_time` | `createTime` | 创建时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_lease` | `bln_lease` | `blnLease` | 使用权资产标识 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `loan_ori_value` | `loan_ori_value` | `loanOriValue` | 贷方原值 |
| `borrow_accum_depr_amount` | `borrow_accum_depr_amount` | `borrowAccumDeprAmount` | 借方累计折旧 |
| `borrow_impairment_amount` | `borrow_impairment_amount` | `borrowImpairmentAmount` | 借方减值准备 |
| `loan_accum_depr_amount` | `loan_accum_depr_amount` | `loanAccumDeprAmount` | 贷方累计折旧 |
| `borrow_ori_value` | `borrow_ori_value` | `borrowOriValue` | 借方原值 |
| `loan_impairment_amount` | `loan_impairment_amount` | `loanImpairmentAmount` | 贷方减值准备 |
| `gbl_borrow_accum_depr_amount` | `gbl_borrow_accum_depr_amount` | `gblBorrowAccumDeprAmount` | 全局币借方累计折旧发生额 |
| `gbl_borrow_impairment_amount` | `gbl_borrow_impairment_amount` | `gblBorrowImpairmentAmount` | 全局币借方减值准备发生额 |
| `gbl_borrow_ori_value` | `gbl_borrow_ori_value` | `gblBorrowOriValue` | 全局币借方原值发生额 |
| `gbl_init_accum_depr_amount` | `gbl_init_accum_depr_amount` | `gblInitAccumDeprAmount` | 全局币期初累计折旧 |
| `gbl_init_impairment_amount` | `gbl_init_impairment_amount` | `gblInitImpairmentAmount` | 全局币期初减值准备 |
| `gbl_init_ori_value` | `gbl_init_ori_value` | `gblInitOriValue` | 全局币期初原值 |
| `gbl_loan_accum_depr_amount` | `gbl_loan_accum_depr_amount` | `gblLoanAccumDeprAmount` | 全局币贷方累计折旧发生额 |
| `gbl_loan_impairment_amount` | `gbl_loan_impairment_amount` | `gblLoanImpairmentAmount` | 全局币贷方减值准备发生额 |
| `gbl_loan_ori_value` | `gbl_loan_ori_value` | `gblLoanOriValue` | 全局币贷方原值发生额 |
| `grp_borrow_accum_depr_amount` | `grp_borrow_accum_depr_amount` | `grpBorrowAccumDeprAmount` | 集团币借方累计折旧发生额 |
| `grp_borrow_impairment_amount` | `grp_borrow_impairment_amount` | `grpBorrowImpairmentAmount` | 集团币借方减值准备发生额 |
| `grp_borrow_ori_value` | `grp_borrow_ori_value` | `grpBorrowOriValue` | 集团币借方原值发生额 |
| `grp_init_accum_depr_amount` | `grp_init_accum_depr_amount` | `grpInitAccumDeprAmount` | 集团币期初累计折旧 |
| `grp_init_impairment_amount` | `grp_init_impairment_amount` | `grpInitImpairmentAmount` | 集团币期初减值准备 |
| `grp_init_ori_value` | `grp_init_ori_value` | `grpInitOriValue` | 集团币期初原值 |
| `grp_loan_accum_depr_amount` | `grp_loan_accum_depr_amount` | `grpLoanAccumDeprAmount` | 集团币贷方累计折旧发生额 |
| `grp_loan_impairment_amount` | `grp_loan_impairment_amount` | `grpLoanImpairmentAmount` | 集团币贷方减值准备发生额 |
| `grp_loan_ori_value` | `grp_loan_ori_value` | `grpLoanOriValue` | 集团币贷方原值发生额 |
| `init_accum_depr_amount` | `init_accum_depr_amount` | `initAccumDeprAmount` | 期初累计折旧 |
| `init_impairment_amount` | `init_impairment_amount` | `initImpairmentAmount` | 期初减值准备 |
| `init_ori_value` | `init_ori_value` | `initOriValue` | 期初原值 |
| `org_borrow_accum_depr_amount` | `org_borrow_accum_depr_amount` | `orgBorrowAccumDeprAmount` | 组织币借方累计折旧发生额 |
| `org_borrow_impairment_amount` | `org_borrow_impairment_amount` | `orgBorrowImpairmentAmount` | 组织币借方减值准备发生额 |
| `org_borrow_ori_value` | `org_borrow_ori_value` | `orgBorrowOriValue` | 组织币借方原值发生额 |
| `org_init_accum_depr_amount` | `org_init_accum_depr_amount` | `orgInitAccumDeprAmount` | 组织币期初累计折旧 |
| `org_init_impairment_amount` | `org_init_impairment_amount` | `orgInitImpairmentAmount` | 组织币期初减值准备 |
| `org_init_ori_value` | `org_init_ori_value` | `orgInitOriValue` | 组织币期初原值 |
| `org_loan_accum_depr_amount` | `org_loan_accum_depr_amount` | `orgLoanAccumDeprAmount` | 组织币贷方累计折旧发生额 |
| `org_loan_impairment_amount` | `org_loan_impairment_amount` | `orgLoanImpairmentAmount` | 组织币贷方减值准备发生额 |
| `org_loan_ori_value` | `org_loan_ori_value` | `orgLoanOriValue` | 组织币贷方原值发生额 |
