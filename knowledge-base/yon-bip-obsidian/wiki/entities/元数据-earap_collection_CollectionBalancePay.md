---
tags: [BIP, 元数据, 数据字典, earap.collection.CollectionBalancePay]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 余额支付 (`earap.collection.CollectionBalancePay`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ar_collection_balance_pay` | domain：`yonbip-fi-earapbill` | 应用：`EAR` | 业务对象ID：`52b0c71c-1f91-4103-8ee9-86e82959f797`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 余额支付 |
| 物理表 | `ar_collection_balance_pay` |
| domain/服务域 | `yonbip-fi-earapbill` |
| schema | `fiearapbill` |
| 所属应用 | `EAR` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `customer` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `action_type` | `action_type` | `actionType` | 动作 |
| `agreement_id` | `agreement_id` | `agreement` | 收款协议ID |
| `collection_id` | `collection_id` | `collectionId` | 收款ID |
| `collection_no` | `collection_no` | `collectionNo` | 收款编号 |
| `collection_row_id` | `collection_row_id` | `collectionRowId` | 收款明细ID |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局分布式事务ID |
| `id` | `id` | `id` | 主键 |
| `pay_no` | `pay_no` | `payNo` | 支付单号 |
| `pay_type` | `pay_type` | `payType` | 支付类型 |
| `sale_order_id` | `sale_order_id` | `saleOrderId` | 销售订单ID |
| `sale_order_no` | `sale_order_no` | `saleOrderNo` | 销售订单号 |
| `src_clue_no` | `src_clue_no` | `srcClueNo` | 余额支付线索号 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `customer` | `customer` | `customer` | 客户 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pay_date` | `pay_date` | `payDate` | 核销时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态 |
| `issue_no` | `issue_no` | `issueNo` | 期号 |
| `source_type` | `source_type` | `sourceType` | 来源类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount` | `amount` | `amount` | 支付金额 |
