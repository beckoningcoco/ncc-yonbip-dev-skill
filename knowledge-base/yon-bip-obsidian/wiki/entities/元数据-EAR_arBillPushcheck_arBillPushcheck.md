---
tags: [BIP, 元数据, 数据字典, EAR.arBillPushcheck.arBillPushcheck]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收推单校验表 (`EAR.arBillPushcheck.arBillPushcheck`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ar_bill_pushcheck` | domain：`yonbip-fi-earapbill` | 应用：`EAR` | 业务对象ID：`f7deeca4-8f7d-4fd9-8ea4-281a9717aa78`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收推单校验表 |
| 物理表 | `ar_bill_pushcheck` |
| 数据库 schema | `yonbip-fi-earapbill` |
| 所属应用 | `EAR` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_id` | `src_bill_id` | `srcBillId` | 上游单据主表ID |
| `src_line_id` | `src_line_id` | `srcLineId` | 上游单据子表ID |
| `push_type` | `push_type` | `pushType` | 推单类型 |
| `creator` | `creator` | `creator` | 创建人ID |
| `id` | `id` | `id` | 主键 |
| `modifier` | `modifier` | `modifier` | 修改人ID |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_line_totalamount` | `src_line_totalamount` | `srcLineTotalamount` | 子表总金额 |
| `src_totalamount` | `src_totalamount` | `srcTotalamount` | 主表总金额 |
| `src_lineacumulative_amount` | `src_lineacumulative_amount` | `srcLineacumulativeAmount` | 子表累计金额 |
| `src_acumulative_amount` | `src_acumulative_amount` | `srcAcumulativeAmount` | 主表累计金额 |
