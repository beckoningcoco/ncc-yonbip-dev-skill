---
tags: [BIP, 元数据, 数据字典, aa.store.RelatedPerson]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 相关人员 (`aa.store.RelatedPerson`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_relatedperson` | domain：`yxybase` | 应用：`Marketingpublic` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 相关人员 |
| 物理表 | `mp_relatedperson` |
| 数据库 schema | `yxybase` |
| 所属应用 | `Marketingpublic` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `partner_person` | `ucf-staff-center.bd_outerstaff_info` |
| `ytenant_id` | `` |
| `person` | `ucf-staff-center.bd_staff_ref` |
| `iStoreId` | `` |
| `partner_dept` | `` |
| `cust` | `productcenter.aa_merchantoutref` |
| `saleorg` | `ucf-org-center.bd_salesorg` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dept` | `dept` | `dept` | 部门 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStoreId` | `iStoreId` | `store` | 主表ID |
| `saleorg` | `saleorg` | `saleOrg` | 销售组织id |
| `person` | `person` | `person` | 人员id |
| `cust` | `cust` | `cust` | 伙伴主键 |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员主键 |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ower` | `ower` | `ower` | 负责人 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 相关人员id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 相关人员时间戳 |
