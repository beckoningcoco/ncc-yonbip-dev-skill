---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rvnOpenRevenue]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期初收入确认 (`RVN.RVN.rvnOpenRevenue`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rvn_revenue_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`44999035-238c-49b5-ac1f-8404e174deaa`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期初收入确认 |
| 物理表 | `rvn_revenue_h` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 76 个 |
| 子表 | 1 个 |
| 关联引用 | 22 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rvnOpenRevenueBodyList` | `RVN.RVN.rvnOpenRevenueBody` | composition |

## 关联引用 (22个)

| 字段名 | 引用类型 |
|--------|---------|
| `glb_local_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `con_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `voucher_type_id` | `fiepub.epub_vouchertype_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `account_trans_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `free_ch_id` | `` |
| `local_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `acc_purpose_id` | `finbd.bd_accpurposeref` |
| `account_entity_id` | `ucf-org-center.bd_financeorgtreeref` |
| `acc_period_id` | `finbd.bd_period` |
| `grp_local_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `` | `` |
| `bus_event_id` | `ucfbasedoc.bd_billtypetreeref` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |
| `org_local_currency_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (1个, 5字段)

- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`

## 字段列表（按类型分组）

> 共 76 个直连字段

### 文本字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `batch_no` | `batch_no` | `batchNo` | 批次号 |
| `bill_id` | `bill_id` | `billId` | 单据id |
| `bill_no` | `bill_no` | `billNo` | 单据编号 |
| `bill_row_id` | `bill_row_id` | `billRowId` | 单据行id |
| `bus_enent_code` | `bus_enent_code` | `busEventCode` | 事项分录编码 |
| `busi_id` | `busi_id` | `busiId` | 业务id |
| `check_error_msg` | `check_error_msg` | `checkErrorMsg` | 会计事务校验异常信息 |
| `code` | `code` | `code` | 编码 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `entry_id` | `entry_id` | `entry` | 事项分录 |
| `gl_voucher_id` | `gl_voucher_id` | `glVoucher` | 总账凭证 |
| `gl_voucher_no` | `gl_voucher_no` | `glVoucherNo` | 总账凭证号 |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `retailer_id` | `retailer_id` | `retailer` | 散户 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型ID |
| `src_bill_type_name` | `src_bill_type_name` | `srcBillTypeName` | 来源单据类型名称 |
| `src_trans_type_id` | `src_trans_type_id` | `srcTransType` | 来源交易类型 |
| `voucher_version` | `voucher_version` | `voucherVersion` | 凭证版本 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `acc_purpose_id` | `acc_purpose_id` | `accPurpose` | 核算目的 |
| `account_entity_id` | `account_entity_id` | `accountEntity` | 会计主体 |
| `account_trans_id` | `account_trans_id` | `accountTrans` | 会计事务ID |
| `bus_event_id` | `bus_event_id` | `busEvent` | 业务事项 |
| `con_currency_id` | `con_currency_id` | `conCurrency` | 合同币 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `glb_local_currency_id` | `glb_local_currency_id` | `glbLocalCurrency` | 全局币 |
| `grp_local_currency_id` | `grp_local_currency_id` | `grpLocalCurrency` | 集团币 |
| `local_currency_id` | `local_currency_id` | `localCurrency` | 本币 |
| `org_id` | `org_id` | `org` | 业务组织 |
| `org_local_currency_id` | `org_local_currency_id` | `orgLocalCurrency` | 组织币 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `src_app_id` | `src_app_id` | `srcApp` | 来源应用 |
| `voucher_type_id` | `voucher_type_id` | `voucherType` | 凭证类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `bus_date` | `bus_date` | `busDate` | 业务日期 |
| `post_date` | `post_date` | `postDate` | 记账日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_gen_voucher` | `bln_gen_voucher` | `blnGenVoucher` | 是否生成事项分录 |
| `bln_isadjust` | `bln_isadjust` | `blnIsadjust` | 是否调整 |
| `bln_isopen` | `bln_isopen` | `blnIsopen` | 是否期初 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_convert_param` | `acc_convert_param` | `accConvertParam` | 本币折算参数 |
| `account_trans_type` | `account_trans_type` | `accountTransType` | 会计事务 |
| `con_convert_param` | `con_convert_param` | `conConvertParam` | 合同币折算参数 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `glb_convert_param` | `glb_convert_param` | `glbConvertParam` | 全局币折算参数 |
| `grp_convert_param` | `grp_convert_param` | `grpConvertParam` | 集团币折算参数 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `org_convert_param` | `org_convert_param` | `orgConvertParam` | 组织币折算参数 |
| `post_status` | `post_status` | `postStatus` | 事项分录生成状态 |
| `trans_status` | `trans_status` | `transStatus` | 事务状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_tax_excluded_amount` | `acc_tax_excluded_amount` | `accTaxExcludedAmount` | 本币无税金额 |
| `con_tax_excluded_amount` | `con_tax_excluded_amount` | `conTaxExcludedAmount` | 合同币无税金额 |
| `glb_tax_excluded_amount` | `glb_tax_excluded_amount` | `glbTaxExcludedAmount` | 全局币无税金额 |
| `grp_tax_excluded_amount` | `grp_tax_excluded_amount` | `grpTaxExcludedAmount` | 集团币无税金额 |
| `org_tax_excluded_amount` | `org_tax_excluded_amount` | `orgTaxExcludedAmount` | 组织币无税金额 |
| `ori_tax_excluded_amount` | `ori_tax_excluded_amount` | `oriTaxExcludedAmount` | 无税金额 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rvnOpenRevenueBodyList` | 期初收入确认子表 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
