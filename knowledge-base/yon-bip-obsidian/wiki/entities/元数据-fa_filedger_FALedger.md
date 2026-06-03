---
tags: [BIP, 元数据, 数据字典, fa.filedger.FALedger]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产明细账 (`fa.filedger.FALedger`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_ledger_h` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`6ba5b0da-49c5-4bf0-873f-bb5fab0277cf`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产明细账 |
| 物理表 | `fa_ledger_h` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 64 个 |
| 子表 | 6 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ledgerSubjectBodies` | `fa.filedger.FALedgerSubject` | composition |
| `ledgerCalcBodies` | `fa.filedger.FALedgerCalc` | composition |
| `FALedgerSourceList` | `fa.filedger.FALedgerSource` | composition |
| `ledgerAsgmtBodies` | `fa.filedger.FALedgerAsgmt` | composition |
| `ledgerBaseBodies` | `fa.filedger.FALedgerBase` | composition |
| `FALedgerLeaseList` | `fa.filedger.FALedgerLease` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `src_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `fi_event_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `period_id` | `finbd.bd_period` |
| `` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ori_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `ori_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `fi_busi_event_id` | `yonbip-fi-eeac.RefTable_02c132dc2` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 64 个直连字段

### 文本字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `account_failure_reason` | `account_failure_reason` | `accountFailureReason` | 建账失败原因 |
| `account_status` | `account_status` | `accountStatus` | 建账状态 |
| `asset_code` | `asset_code` | `assetCode` | 固定资产卡片编码 |
| `blue_id` | `blue_id` | `blueId` | 蓝单id |
| `busi_date` | `busi_date` | `busiDate` | 业务日期 |
| `business_source` | `business_source` | `businessSource` | 业务来源 |
| `code` | `code` | `code` | 编码 |
| `depr_voucher_make_sign` | `depr_voucher_make_sign` | `deprVoucherMakeSign` | 折旧凭证制单标识 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | dtc全局事务ID |
| `fi_event_code` | `fi_event_code` | `eventCode` | 会计事务编码 |
| `event_voucher_record_id` | `event_voucher_record_id` | `eventVoucherRecordId` | 事项分录ID |
| `event_voucher_record_no` | `event_voucher_record_no` | `eventVoucherRecordNo` | 事项分录号 |
| `event_voucher_record_status` | `event_voucher_record_status` | `eventVoucherRecordStatus` | 事项分录状态 |
| `gl_voucher_id` | `gl_voucher_id` | `glVoucherId` | 总账凭证ID |
| `gl_voucher_no` | `gl_voucher_no` | `glVoucherNo` | 总账凭证号 |
| `gl_voucher_status` | `gl_voucher_status` | `glVoucherStatus` | 总账凭证状态 |
| `id` | `id` | `id` | 主键 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillno` | 源头单据号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriItemId` | 源头单据行ID |
| `period_code` | `period_code` | `period` | 会计期间编码 |
| `post_group_id` | `post_group_id` | `postGroupId` | 过账组id |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态码 |
| `red_id` | `red_id` | `redId` | 红单id |
| `remarks` | `remarks` | `remarks` | 备注 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillno` | 来源单据号 |
| `src_item_id` | `src_item_id` | `srcItemId` | 来源单据行ID |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `fi_event_id` | `fi_event_id` | `eventId` | 会计事务 |
| `fi_busi_event_id` | `fi_busi_event_id` | `fiBusiEventId` | 业务事项ID |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBilltypeId` | 源头单据类型 |
| `ori_trade_type_id` | `ori_trade_type_id` | `oriTradetypeId` | 源头交易类型 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBilltypeId` | 来源单据类型 |
| `src_trade_type_id` | `src_trade_type_id` | `srcTradetypeId` | 来源交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_depr` | `bln_depr` | `blnDepr` | 折旧标识 |
| `bln_fi` | `bln_fi` | `blnFi` | 核算标识 |
| `dtc_add_on_confirm` | `dtc_add_on_confirm` | `dtcAddOnConfirm` | dtc新增事务确认状态 |
| `dtc_delete_on_cancel` | `dtc_delete_on_cancel` | `dtcDeleteOnCancel` | dtc删除事务取消状态 |
| `dtc_delete_on_confirm` | `dtc_delete_on_confirm` | `dtcDeleteOnConfirm` | dtc删除事务确认状态 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式锁状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `accpurpose_id` | `accpurpose_id` | `accpurposeId` | 核算目的 |
| `send_data_version` | `send_data_version` | `sendDataVersion` | 会计事务数据版本号 |
| `writeback_event_version` | `writeback_event_version` | `writebackEventVersion` | 过账状态回写版本号 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FALedgerLeaseList` | 流水账使用权信息 |
| `` | `` | `FALedgerSourceList` | 流水账来源信息 |
| `` | `` | `ledgerAsgmtBodies` | 流水账分配信息 |
| `` | `` | `ledgerBaseBodies` | 流水账基本信息 |
| `` | `` | `ledgerCalcBodies` | 流水账核算信息 |
| `` | `` | `ledgerSubjectBodies` | 流水账科目分配信息 |
