---
tags: [BIP, 元数据, 数据字典, aa.merchant.Principal]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 负责人 (`aa.merchant.Principal`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`principal` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 负责人 |
| 物理表 | `principal` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `principal_character` | `` |
| `cprofesssalesman` | `ucf-staff-center.bd_staff_ref` |
| `imerchantid` | `` |
| `ytenant_id` | `` |
| `merchantapplyrangeid` | `` |
| `cspecialmanagementdep` | `ucf-org-center.admin_dept_tree_ref` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantid` | `imerchantid` | `merchantId` | 客户 |
| `merchantapplyrangeid` | `merchantapplyrangeid` | `merchantApplyRangeId` | 客户适用范围 |
| `cprofesssalesman` | `cprofesssalesman` | `professSalesman` | 专管业务员 |
| `cspecialmanagementdep` | `cspecialmanagementdep` | `specialManagementDep` | 专管部门 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bdefaultprincipal` | `bdefaultprincipal` | `isDefault` | 是否默认负责人 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `principal_character` | `principal_character` | `principalCharacter` | 客户负责人自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
