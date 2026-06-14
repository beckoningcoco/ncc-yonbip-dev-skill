---
tags: [BIP, 元数据, 数据字典, tlm.investmentquota.ExecutionRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 额度执行记录 (`tlm.investmentquota.ExecutionRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_execution_record` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`e6f87802-b76f-4fed-bfeb-fb2d253ccf6d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 额度执行记录 |
| 物理表 | `tlm_execution_record` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `subid` | `` |
| `ytenant_id` | `` |
| `mainid` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `executioncurrency` | `` |
| `financial_product` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `recordcode` | `recordcode` | `recordcode` | 执行单号 |
| `businesstype` | `businesstype` | `businesstype` | 业务单据类型 |
| `businesscode` | `businesscode` | `businesscode` | 业务单据编号 |
| `businessid` | `businessid` | `businessid` | 业务单据ID |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 主表id |
| `subid` | `subid` | `subid` | 子表id |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品 |
| `executioncurrency` | `executioncurrency` | `executioncurrency` | 执行币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `executiontime` | `executiontime` | `executiontime` | 执行时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `occupationtype` | `occupationtype` | `occupationtype` | 占用/释放标志 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |
| `id` | `id` | `id` | 主键 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `executionamount` | `executionamount` | `executionamount` | 执行金额 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
