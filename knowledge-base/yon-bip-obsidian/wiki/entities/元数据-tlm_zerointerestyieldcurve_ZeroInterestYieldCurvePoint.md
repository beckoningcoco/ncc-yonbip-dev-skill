---
tags: [BIP, 元数据, 数据字典, tlm.zerointerestyieldcurve.ZeroInterestYieldCurvePoint]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 零息收益率曲线支撑点 (`tlm.zerointerestyieldcurve.ZeroInterestYieldCurvePoint`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_zerointerestyieldcurvepoint` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 零息收益率曲线支撑点 |
| 物理表 | `tlm_zerointerestyieldcurvepoint` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `characterDef` | `` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 代码 |
| `description` | `description` | `description` | 描述 |
| `id` | `id` | `id` | ID |
| `tensor` | `tensor` | `tensor` | 期限 |
| `tensor_interval` | `tensor_interval` | `tensorInterval` | 期限单位 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 零息收益率曲线日期id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reference_date` | `reference_date` | `referenceDate` | 参考日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tensor_value` | `tensor_value` | `tensorValue` | 期限数值 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bid_price` | `bid_price` | `bidPrice` | 买入价 |
| `middle_price` | `middle_price` | `middlePrice` | 中间价 |
| `offer_price` | `offer_price` | `offerPrice` | 卖出价 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `characterDef` | `characterDef` | `characterDef` | 零息收益率曲线支撑点特征 |
