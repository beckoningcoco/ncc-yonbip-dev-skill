---
tags: [BIP, 元数据, 数据字典, sact.contract.ShareMerchant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同共享客户 (`sact.contract.ShareMerchant`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sact_sharemerchant` | domain：`sact` | 应用：`SACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同共享客户 |
| 物理表 | `sact_sharemerchant` |
| domain/服务域 | `sact` |
| schema | `scmmp` |
| 所属应用 | `SACT` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `shareAgentId` | `productcenter.merchantRef` |
| `ytenant_id` | `` |
| `sact_vid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `shareAgentId` | `shareAgentId` | `merchantAuth` | 客户权限 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `sact_vid` | `sact_vid` | `sactVId` | 合同共享客户子表外键 |
| `shareAgentId` | `shareAgentId` | `shareAgentId` | 客户ID |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 合同共享客户子表 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
