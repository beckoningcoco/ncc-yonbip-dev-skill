---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctMargin]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 履约保证金 (`apct.contract.ApctMargin`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_margin` | domain：`apct` | 应用：`APCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 履约保证金 |
| 物理表 | `apct_apct_margin` |
| domain/服务域 | `apct` |
| schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 26 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ct_id` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `apctApctMarginDcs` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 11字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 履约保证金编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `receipt_num` | `receipt_num` | `receiptNum` | 收款单号 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `ct_id` | `ct_id` | `ctId` | 合同主表id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `acct_date` | `acct_date` | `acctDate` | 到账日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 履约保证金id |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acct_amt_bak` | `acct_amt_bak` | `acctAmtBak` | 收款金额备份 |
| `unappr_refund_amt_bak` | `unappr_refund_amt_bak` | `unapprRefundAmtBak` | 未审批原币退款金额备份 |
| `appr_refund_amt_bak` | `appr_refund_amt_bak` | `apprRefundAmtBak` | 已审批原币退款金额备份 |
| `refunded_amt_bak` | `refunded_amt_bak` | `refundedAmtBak` | 原币已退款金额备份 |
| `acct_amt` | `acct_amt` | `acctAmt` | 收款金额 |
| `unappr_refund_amt` | `unappr_refund_amt` | `unapprRefundAmt` | 未审批原币退款金额 |
| `appr_refund_amt` | `appr_refund_amt` | `apprRefundAmt` | 已审批原币退款金额 |
| `refunded_amt` | `refunded_amt` | `refundedAmt` | 原币已退款金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 履约保证金时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apctApctMarginDcs` | `apctApctMarginDcs` | `apctApctMarginDcs` | 履约保证金自定义项 |
