---
tags: [BIP, 元数据, 数据字典, uhybase.labeldoc.LabelExclusion]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标签互斥关系 (`uhybase.labeldoc.LabelExclusion`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_labelexclusion` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`3bc33232-cc74-40b2-8e30-f5175c181679`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标签互斥关系 |
| 物理表 | `mp_labelexclusion` |
| 数据库 schema | `uhy` |
| 所属应用 | `SDMB` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `` |
| `ytenant_id` | `` |
| `iLabelID` | `` |
| `iExclusionLabelID` | `mm_labeldocref` |

## 继承接口 (3个, 3字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **创建时间** (`uhy.itf.CreateTime`)
  - `dCreateTime` → `dCreateTime`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iExclusionLabelID` | `iExclusionLabelID` | `iExclusionLabelID` | 互斥标签ID |
| `cAppID` | `cAppID` | `cAppID` | 会籍 |
| `iLabelID` | `iLabelID` | `iLabelID` | 标签id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
