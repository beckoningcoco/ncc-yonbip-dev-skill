---
tags: [BIP, 元数据, 数据字典, tlm.zerointerestyieldcurve.ZeroInterestYieldCurve]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 零息收益率曲线 (`tlm.zerointerestyieldcurve.ZeroInterestYieldCurve`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_zerointerestyieldcurve` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`161d9491-03e9-4a49-84cf-e2b58690f72d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 零息收益率曲线 |
| 物理表 | `tlm_zerointerestyieldcurve` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 16 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ZeroInterestYieldCurveDate` | `tlm.zerointerestyieldcurve.ZeroInterestYieldCurveDate` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `characterDef` | `` |
| `currency` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_day_convention` | `business_day_convention` | `businessDayConvention` | 节假日调整 |
| `calendar` | `calendar` | `calendar` | 工作日日历 |
| `compound_frequency` | `compound_frequency` | `compoundFrequency` | 复合频率 |
| `curve_name` | `curve_name` | `curveName` | 曲线名称 |
| `day_count_convention` | `day_count_convention` | `dayCountConvention` | 天数计算规则 |
| `id` | `id` | `id` | ID |
| `interpolation_method` | `interpolation_method` | `interpolationMethod` | 插值方法 |
| `is_default_curve` | `is_default_curve` | `isDefaultCurve` | 默认 |
| `valuation_type` | `valuation_type` | `valuationType` | 估值类型 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currency` | `currency` | `currency` | 币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nearest_quote_date` | `nearest_quote_date` | `nearestQuoteDate` | 最近报价日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ZeroInterestYieldCurveDate` | 零息收益率曲线日期 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `characterDef` | `characterDef` | `characterDef` | 零息收益率曲线特征 |
