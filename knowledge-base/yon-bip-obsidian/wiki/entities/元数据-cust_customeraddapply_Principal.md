---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.Principal]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申请单负责人类型 (`cust.customeraddapply.Principal`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_principal` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申请单负责人类型 |
| 物理表 | `cust_customeraddapply_principal` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `principal_character` | `` |
| `cprofesssalesman` | `ucf-staff-center.bd_staff_ref` |
| `imerchantid` | `` |
| `ytenant_id` | `` |
| `merchantapplyrangeid` | `` |
| `cspecialmanagementdep` | `ucf-org-center.bd_adminorgsharetreeref` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表ID |
| `dataStatus` | `dataStatus` | `dataStatus` | 数据状态 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantid` | `imerchantid` | `merchantId` | 手工码 |
| `cprofesssalesman` | `cprofesssalesman` | `professSalesman` | 负责人 |
| `cspecialmanagementdep` | `cspecialmanagementdep` | `specialManagementDep` | 负责部门 |
| `merchantapplyrangeid` | `merchantapplyrangeid` | `merchantApplyRangeId` | 使用范围主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bdefaultprincipal` | `bdefaultprincipal` | `isDefault` | 是否默认 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 负责人子表主键 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `principal_character` | `principal_character` | `principalCharacter` | 负责人信息自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
