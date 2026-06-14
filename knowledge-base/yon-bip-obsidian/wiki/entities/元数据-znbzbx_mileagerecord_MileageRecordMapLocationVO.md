---
tags: [BIP, 元数据, 数据字典, znbzbx.mileagerecord.MileageRecordMapLocationVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 里程记录-地图地点 (`znbzbx.mileagerecord.MileageRecordMapLocationVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_mileagerecord_maplocation` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`0cf72d7d-a4b4-4479-9a5e-e4bb8f99d363`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 里程记录-地图地点 |
| 物理表 | `znbz_mileagerecord_maplocation` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vcity` | `vcity` | `vcity` | 城市 |
| `vcountry` | `vcountry` | `vcountry` | 国家 |
| `vdistrict` | `vdistrict` | `vdistrict` | 区县 |
| `vlocation` | `vlocation` | `vlocation` | 地点坐标 |
| `vlocationcode` | `vlocationcode` | `vlocationcode` | 地点编码 |
| `vlongname` | `vlongname` | `vlongname` | 长名称 |
| `vnumber` | `vnumber` | `vnumber` | 门牌号 |
| `vpoicode` | `vpoicode` | `vpoicode` | POI分类编码 |
| `vprovince` | `vprovince` | `vprovince` | 省份 |
| `vshortname` | `vshortname` | `vshortname` | 短名称 |
| `vstreet` | `vstreet` | `vstreet` | 街道 |
| `vtownship` | `vtownship` | `vtownship` | 乡镇 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ilocationtype` | `ilocationtype` | `ilocationtype` | 地点类型 |
| `imapprovider` | `imapprovider` | `imapprovider` | 地图供给方 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
