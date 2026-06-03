---
tags: [BIP, 元数据, 数据字典, sact.contract.SignSubject]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同签署主体 (`sact.contract.SignSubject`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sact_signsubject` | domain：`sact` | 应用：`SACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同签署主体 |
| 物理表 | `sact_signsubject` |
| 数据库 schema | `sact` |
| 所属应用 | `SACT` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `signAgentId` | `productcenter.aa_merchantagentRef` |
| `ytenant_id` | `` |
| `sact_vid` | `` |
| `signOrgId` | `ucf-org-center.org_pure_tree_ref` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `address` | `address` | `address` | 地址 |
| `bankAccount` | `bankAccount` | `bankAccount` | 银行账号 |
| `bankOfDeposit` | `bankOfDeposit` | `bankOfDeposit` | 开户银行 |
| `facsimile` | `facsimile` | `facsimile` | 传真 |
| `memo` | `memo` | `memo` | 备注 |
| `postalCode` | `postalCode` | `postalCode` | 邮编 |
| `telephone` | `telephone` | `telephone` | 电话 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `signAgentId` | `signAgentId` | `merchantAuth` | 客户权限 |
| `sact_vid` | `sact_vid` | `sactVId` | 合同版本 |
| `signAgentId` | `signAgentId` | `signAgentId` | 签署客户 |
| `signOrgId` | `signOrgId` | `signOrgId` | 签署组织 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDefault` | `isDefault` | `isDefault` | 是否默认生成 |
| `isOriginator` | `isOriginator` | `isOriginator` | 是否发起方 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `signSubjectType` | `signSubjectType` | `signSubjectType` | 签署主体来源 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 合同签署主体子表ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `signOrder` | `signOrder` | `signOrder` | 签署顺序 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
