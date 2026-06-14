---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctRelateVoucher]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 下游关联单据 (`apct.contract.ApctRelateVoucher`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_relate_voucher` | domain：`apct` | 应用：`APCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 下游关联单据 |
| 物理表 | `apct_apct_relate_voucher` |
| domain/服务域 | `apct` |
| schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 44 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `ct_id` | `` |
| `out_project` | `` |
| `ytenant_id` | `` |
| `margin_id` | `` |
| `` | `` |
| `out_busimemo` | `` |
| `bustype` | `` |
| `out_bustype` | `` |
| `plan_id` | `` |
| `currency_id` | `` |
| `tenant_id` | `` |
| `out_material` | `` |

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

> 共 44 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_num` | `bill_num` | `billNum` | 单据编码 |
| `bill_status` | `bill_status` | `billStatus` | 单据状态 |
| `bill_type` | `bill_type` | `billType` | 单据类型 |
| `plan_code` | `plan_code` | `planCode` | 计划编码 |
| `out_bill_type` | `out_bill_type` | `outbillType` | 外部单据类型 |
| `outbill_no` | `outbill_no` | `outbillNo` | 外部单据编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `ct_code` | `ct_code` | `ctCode` | 合同号 |
| `domain` | `domain` | `domain` | 所属领域 |
| `location` | `location` | `location` | 单据归属表体位置 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `settle_status` | `settle_status` | `settleStatus` | 结算状态 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `out_bustype` | `out_bustype` | `outbustype` | 外部交易类型 |
| `out_project` | `out_project` | `outProject` | 外部项目 |
| `out_busimemo` | `out_busimemo` | `outBusimemo` | 外部费用项目 |
| `out_material` | `out_material` | `outMaterial` | 外部物料 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `ct_id` | `ct_id` | `ctId` | 合同 |
| `currency_id` | `currency_id` | `currencyId` | 币种 |
| `margin_id` | `margin_id` | `marginId` | 履约保证金 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `plan_id` | `plan_id` | `planId` | 付款计划 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `outbill_date` | `outbill_date` | `outbillDate` | 外部单据日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `out_bill_status` | `out_bill_status` | `outbillStatus` | 外部单据状态 |
| `out_settle_status` | `out_settle_status` | `outsettleStatus` | 外部结算状态 |
| `contract_direction` | `contract_direction` | `contractDirection` | 收支方向 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `outbillrow_id` | `outbillrow_id` | `outbillRowId` | 外部单据行 |
| `id` | `id` | `id` | ID |
| `outbill_id` | `outbill_id` | `outbillId` | 外部单据id |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `out_original_amt` | `out_original_amt` | `outoriginalAmt` | 外部原币金额 |
| `local_amt` | `local_amt` | `localAmt` | 本币金额 |
| `nsummny` | `nsummny` | `nsummny` | 价税合计 |
| `original_amt` | `original_amt` | `originalAmt` | 原币金额 |
| `before_update_amt` | `before_update_amt` | `beforeUpdateAmt` | 更新前原币金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
