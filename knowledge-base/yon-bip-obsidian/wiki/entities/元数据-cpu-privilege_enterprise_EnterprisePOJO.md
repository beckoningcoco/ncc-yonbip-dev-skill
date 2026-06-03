---
tags: [BIP, 元数据, 数据字典, cpu-privilege.enterprise.EnterprisePOJO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 企业 (`cpu-privilege.enterprise.EnterprisePOJO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cpu_enterprise` | domain：`cpu-privilege-service` | 应用：`` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 企业 |
| 物理表 | `cpu_enterprise` |
| 数据库 schema | `cpu-privilege-service` |
| 所属应用 | `` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `address` | `address` | `address` | 公司地址 |
| `code` | `code` | `code` | 企业编码 |
| `login_channel` | `login_channel` | `loginChannl` | 登录途径 |
| `name` | `name` | `name` | 企业名称 |
| `supply` | `supply` | `supply` | 是否供应商 |
| `tenant_id` | `tenant_id` | `tenantid` | 租户id |
| `ycn_code` | `ycn_code` | `ycnCode` | ycn码 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | dr |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | 时间戳 |
