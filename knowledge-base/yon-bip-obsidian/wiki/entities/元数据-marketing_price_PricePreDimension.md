---
tags: [BIP, 元数据, 数据字典, marketing.price.PricePreDimension]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 系统预设维度表 (`marketing.price.PricePreDimension`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_price_pre_dimension` | domain：`marketingbill` | 应用：`B2Bpricing` | 业务对象ID：`951fe094-bbd3-49ce-a411-e25142fe4375`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 系统预设维度表 |
| 物理表 | `udh_price_pre_dimension` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `B2Bpricing` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cControlRef` | `cControlRef` | `controlRef` | 参照名称 |
| `cControlType` | `cControlType` | `controlType` | 控件类型 |
| `dimension_type` | `dimension_type` | `dimensionType` | 维度类型 |
| `cDomain` | `cDomain` | `domain` | 域名 |
| `entityName` | `entityName` | `entityName` | 实体名称 |
| `evaluation_type` | `evaluation_type` | `evaluationType` | 取值方式 |
| `field_description_resid` | `field_description_resid` | `fieldDescriptionResid` | 多语资源码 |
| `filed_name` | `filed_name` | `fieldName` | 字段名称 |
| `field_type` | `field_type` | `fieldType` | 字段类型 |
| `cRefRule` | `cRefRule` | `refRule` | 查询参数 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iSystem` | `iSystem` | `iSystem` | 系统预设 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `scope` | `scope` | `scope` | 适用范围 |
| `version` | `version` | `version` | 版本号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `tenant` | `tenant` | `uordercorp` | 租户ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `createtime` | `createtime` | `createtime` | 创建时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `field_description` | `field_description` | `fieldDescription` | 字段描述 |
