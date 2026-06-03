---
tags: [BIP, 元数据, 数据字典, fa.fieventfaadd.FAAddFIEventBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产新增 (`fa.fieventfaadd.FAAddFIEventBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_ledger_h` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`2d7ac6c6-fb0a-40f2-a698-265f837e1637`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产新增 |
| 物理表 | `fa_ledger_h` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 46 个 |
| 子表 | 3 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `eventAssetSubjectAssignInfoBodies` | `fa.fieventfaadd.FIEventAssetSubjectAssignInfo` | composition |
| `eventAssetSourceInfoBodies` | `fa.fieventfaadd.FIEventAssetSourceInfo` | composition |
| `eventAssetBasicInfoBodies` | `fa.fieventfaadd.FIEventAssetBasicInfo` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `src_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `fi_event_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ori_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `` | `` |
| `ori_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 46 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fi_event_code` | `fi_event_code` | `eventCode` | 会计事务编码 |
| `busi_date` | `busi_date` | `busiDate` | 业务日期 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `period_code` | `period_code` | `period` | 会计期间编码 |
| `account_status` | `account_status` | `accountStatus` | 建账状态 |
| `asset_code` | `asset_code` | `assetCode` | 固定资产卡片编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_item_id` | `src_item_id` | `srcItemId` | 来源单据行ID |
| `business_source` | `business_source` | `businessSource` | 业务来源 |
| `src_bill_no` | `src_bill_no` | `srcBillno` | 来源单据号 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillno` | 源头单据号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriItemId` | 源头单据行ID |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | dtc全局事务ID |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | id |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态码 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `fi_event_id` | `fi_event_id` | `eventId` | 会计事务 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBilltypeId` | 来源单据类型 |
| `src_trade_type_id` | `src_trade_type_id` | `srcTradetypeId` | 来源交易类型 |
| `ori_trade_type_id` | `ori_trade_type_id` | `oriTradetypeId` | 源头交易类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBilltypeId` | 源头单据类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_depr` | `bln_depr` | `blnDepr` | 折旧标识 |
| `bln_fi` | `bln_fi` | `blnFi` | 核算标识 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式锁状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accpurpose_id` | `accpurpose_id` | `accpurposeId` | 核算目的 |
| `send_data_version` | `send_data_version` | `sendDataVersion` | 会计事务数据版本号 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `writeback_event_version` | `writeback_event_version` | `writebackEventVersion` | 过账状态回写版本号 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `eventAssetBasicInfoBodies` | 卡片基本信息 |
| `` | `` | `eventAssetSourceInfoBodies` | 卡片来源信息 |
| `` | `` | `eventAssetSubjectAssignInfoBodies` | 科目分配信息 |
