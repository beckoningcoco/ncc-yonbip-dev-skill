---
tags: [BIP, 元数据, 数据字典, bf.bizflow.BusinessFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务流 (`bf.bizflow.BusinessFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`business_flow` | domain：`iuap-yonbuilder-businesssflow` | 应用：`APPBZP` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务流 |
| 物理表 | `business_flow` |
| domain/服务域 | `iuap-yonbuilder-businesssflow` |
| schema | `iuap_apcom_businesssflow` |
| 所属应用 | `APPBZP` |
| 直连字段 | 5 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 5 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 流程主键 |
| `tenant_id` | `tenant_id` | `tenantId` | 租户 |
| `version` | `version` | `version` | 版本 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 流程名称 |
