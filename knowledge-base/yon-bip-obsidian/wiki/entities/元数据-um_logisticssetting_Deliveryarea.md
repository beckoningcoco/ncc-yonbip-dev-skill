---
tags: [BIP, 元数据, 数据字典, um.logisticssetting.Deliveryarea]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物流设置 (`um.logisticssetting.Deliveryarea`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`deliveryarea` | domain：`umall` | 应用：`SDMA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物流设置 |
| 物理表 | `deliveryarea` |
| 数据库 schema | `umall` |
| 所属应用 | `SDMA` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `dlytypeId` | `` |

## 继承接口 (2个, 2字段)

- **商城租户相关** (`base.itf.IMallcorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cRegion` | `cRegion` | `cRegion` | 地区 |
| `cCountry` | `cCountry` | `cCountry` | 国家 |
| `cProvince` | `cProvince` | `cProvince` | 省份 |
| `cCity` | `cCity` | `cCity` | 城市 |
| `cArea` | `cArea` | `cArea` | 区域 |
| `cStreet` | `cStreet` | `cStreet` | 街道 |
| `cZipCode` | `cZipCode` | `cZipCode` | 邮编 |
| `cAddress` | `cAddress` | `cAddress` | 详细地址 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dlytypeId` | `dlytypeId` | `dlytypeId` |  |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `iDeleted` | 删除标记 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `mallcorp` | 租户 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `areafirstprice` | `areafirstprice` | `areafirstprice` | 统一计价 |
| `areacontinueprice` | `areacontinueprice` | `areacontinueprice` | 续重费用 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
