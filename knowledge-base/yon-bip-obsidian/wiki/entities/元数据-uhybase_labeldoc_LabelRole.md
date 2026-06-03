---
tags: [BIP, 元数据, 数据字典, uhybase.labeldoc.LabelRole]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标签角色关系表 (`uhybase.labeldoc.LabelRole`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_labelorg` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标签角色关系表 |
| 物理表 | `mp_labelorg` |
| 数据库 schema | `uhy` |
| 所属应用 | `SDMB` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `iRoleID` | `u8c-auth.bip_sys_role_ref` |
| `ytenant_id` | `` |
| `iLabelID` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | cAppID |
| `cRoleCode` | `cRoleCode` | `cRoleCode` | 角色编码 |
| `cRoleName` | `cRoleName` | `cRoleName` | 角色名称 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLabelID` | `iLabelID` | `iLabelID` | 标签id |
| `iRoleID` | `iRoleID` | `iRoleID` | 角色id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iType` | `iType` | `iType` | 类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
