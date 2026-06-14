---
tags: [BIP, 元数据, 数据字典, EFA.lease.FaStLeaseLiability]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计提短期租赁负债 (`EFA.lease.FaStLeaseLiability`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_st_lease_liability` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`d7635db3-f8d9-47c1-9c5f-2ef5b51638b7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计提短期租赁负债 |
| 物理表 | `fa_st_lease_liability` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 20 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FaStLeaseLiabilityDetailList` | `EFA.lease.FaStLeaseLiabilityDetail` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

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

> 共 20 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begining_date` | `begining_date` | `beginingDate` | 计提开始日期 |
| `busi_post_failure_reason` | `busi_post_failure_reason` | `busiPostFailureReason` | 过账失败原因 |
| `ending_date` | `ending_date` | `endingDate` | 计提结束日期 |
| `id` | `id` | `id` | 主键 |
| `period_code` | `period_code` | `periodCode` | 会计期间 |
| `voucher_date` | `voucher_date` | `voucherDate` | 凭证日期 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbookId` | 账簿 |
| `accentity_id` | `accentity_id` | `accentityId` | 会计主体 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `period_id` | `period_id` | `periodId` | 会计期间ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_status` | `busi_post_status` | `busiPostStatus` | 过账状态 |
| `verifystate` | `verifystate` | `verifystate` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_version` | `busi_post_version` | `busiPostVersion` | 业务过账版本 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FaStLeaseLiabilityDetailList` | 计提短期租赁负债明细 |
