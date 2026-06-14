---
tags: [BIP, 元数据, 数据字典, marketing.cpq.OptionalQuotationVoucherGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置报价清单关联单据本币分组报价信息 (`marketing.cpq.OptionalQuotationVoucherGroup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`optionalquotationvouchergroup` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置报价清单关联单据本币分组报价信息 |
| 物理表 | `optionalquotationvouchergroup` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `optional_quotation_id` | `` |
| `ytenant_id` | `` |
| `voucher_id` | `` |
| `detail_group_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detail_group_id` | `detail_group_id` | `detailGroupId` | 配置报价清单详情分组 |
| `optional_quotation_id` | `optional_quotation_id` | `optionalQuotationId` | 配置报价清单 |
| `voucher_id` | `voucher_id` | `voucherId` | 配置报价清单关联单据 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nat_money` | `nat_money` | `natMoney` | 本币未税成交金额 |
| `nat_sum` | `nat_sum` | `natSum` | 本币含税成交金额 |
| `ori_money` | `ori_money` | `oriMoney` | 未税成交金额 |
| `ori_sum` | `ori_sum` | `oriSum` | 含税成交金额 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
