---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.MerchantQualificationDocument]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户资质文件管理 (`cust.customeraddapply.MerchantQualificationDocument`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_qualification_document` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户资质文件管理 |
| 物理表 | `cust_customeraddapply_qualification_document` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CUST` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `merchant_id` | `` |
| `ytenant_id` | `` |
| `license_name` | `yssupplier.aa_qualify` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表ID |
| `dataStatus` | `dataStatus` | `dataStatus` | 数据状态 |
| `attachment` | `attachment` | `attachment` | 附件 |
| `license_number` | `license_number` | `licenseNumber` | 证照号码 |
| `long_term_effective` | `long_term_effective` | `longTermEffective` | 长期有效 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `document_uploader` | `document_uploader` | `documentUploader` | 证件上传人员 |
| `information_modifier` | `information_modifier` | `informationModifier` | 信息修改人员 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_id` | `merchant_id` | `merchantId` | 资质文件管理客户id |
| `license_name` | `license_name` | `licenseName` | 证照名称id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `validity_start_date` | `validity_start_date` | `validityStartDate` | 有效期开始日期 |
| `due_date` | `due_date` | `dueDate` | 到期日 |
| `document_uploader_time` | `document_uploader_time` | `documentUploaderTime` | 证件上传时间 |
| `information_modify_time` | `information_modify_time` | `informationModifyTime` | 信息修改时间 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 资质文件管理id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
