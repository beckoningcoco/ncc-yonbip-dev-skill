---
tags: [BIP, 元数据, 数据字典, bd.staff.PsnlCatgCountry]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工类别国家/地区 (`bd.staff.PsnlCatgCountry`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_psnl_catg_country` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工类别国家/地区 |
| 物理表 | `bd_psnl_catg_country` |
| 数据库 schema | `ucf-staff-center` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `` |
| `ytenant_id` | `` |
| `psnl_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `name` | `name` | `name` | 名称 |
| `tenant_id` | `tenant_id` | `tenant` | 租户id |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `psnl_id` | `psnl_id` | `psnlId` | 员工类别主键 |
| `country` | `country` | `country` | 国家/地区 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
