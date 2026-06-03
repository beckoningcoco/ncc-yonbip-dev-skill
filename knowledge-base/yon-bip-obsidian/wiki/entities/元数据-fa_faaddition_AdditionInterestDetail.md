---
tags: [BIP, 元数据, 数据字典, fa.faaddition.AdditionInterestDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 新增单利息明细 (`fa.faaddition.AdditionInterestDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_interest_detail` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`26f6782d-c405-466f-8424-c393cad9c921`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 新增单利息明细 |
| 物理表 | `fa_interest_detail` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `src_bill_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `end_date` | `end_date` | `endDate` | 止算日期 |
| `id` | `id` | `id` | 主键 |
| `period_code` | `period_code` | `period` | 期间编码 |
| `start_date` | `start_date` | `startDate` | 起算日期 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_id` | `src_bill_id` | `additionBillId` | 新增单基本信息 |
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_modified` | `bln_modified` | `blnModified` | 修改标识 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accum_int_accrued` | `accum_int_accrued` | `accumIntAccrued` | 累计计提利息 |
| `beginning_lease_liability` | `beginning_lease_liability` | `beginningLeaseLiability` | 期初租赁负债 |
| `beginning_uncon_finance_cost` | `beginning_uncon_finance_cost` | `beginningUnconFinanceCost` | 期初未确认融资费用 |
| `ending_lease_liability` | `ending_lease_liability` | `endingLeaseLiability` | 期未租赁负债 |
| `ending_uncon_finance_cost` | `ending_uncon_finance_cost` | `endingUnconFinanceCost` | 期末未确认融资费用 |
| `interest` | `interest` | `interest` | 计提利息 |
| `lease_payment` | `lease_payment` | `leasePayment` | 租赁负债-支付 |
