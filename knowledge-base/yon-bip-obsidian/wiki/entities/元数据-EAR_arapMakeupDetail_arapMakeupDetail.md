---
tags: [BIP, 元数据, 数据字典, EAR.arapMakeupDetail.arapMakeupDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 确认补差明细 (`EAR.arapMakeupDetail.arapMakeupDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_makeup_detail` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`0dd94620-cf81-4395-9c7d-409ef753bd7f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 确认补差明细 |
| 物理表 | `arap_makeup_detail` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 28 个 |
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

> 共 28 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finance_org_id` | `finance_org_id` | `financeOrgId` | 会计主体ID |
| `event_id` | `event_id` | `eventId` | 事务BO(补差事务) |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 应收应付会计事务类型(补差事务) |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号(发票) |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID(发票) |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型(发票) |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID(发票) |
| `src_event_id` | `src_event_id` | `srcEventId` | 来源事务ID(确认事务) |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源事务类型(确认事务) |
| `src_body_id` | `src_body_id` | `srcBodyId` | 来源明细BO(确认事务) |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局分布式事务ID |
| `creator` | `creator` | `creator` | 创建人ID |
| `id` | `id` | `id` | ID(默认补差事务body_id) |
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

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态(0解冻; 1冻结) |
| `dr` | `dr` | `dr` | 逻辑删除标记(0-有效,1-删除) |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `unit_id` | `unit_id` | `unitId` | 单位 |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity` | `quantity` | `quantity` | 数量 |
| `acc_invoice_tax_amount` | `acc_invoice_tax_amount` | `accInvoiceTaxAmount` | 开票本币税额(减补差额) |
| `acc_invoice_tax_exc_amount` | `acc_invoice_tax_exc_amount` | `accInvoiceTaxExcAmount` | 开票本币无税金额(减补差额) |
| `acc_invoice_tax_inc_amount` | `acc_invoice_tax_inc_amount` | `accInvoiceTaxIncAmount` | 开票本币含税金额(减补差额) |
| `ori_invoice_tax_amount` | `ori_invoice_tax_amount` | `oriInvoiceTaxAmount` | 开票税额(减补差额) |
| `ori_invoice_tax_exc_amount` | `ori_invoice_tax_exc_amount` | `oriInvoiceTaxExcAmount` | 开票无税金额(减补差额) |
| `ori_invoice_tax_inc_amount` | `ori_invoice_tax_inc_amount` | `oriInvoiceTaxIncAmount` | 开票含税金额(减补差额) |
