---
tags: [BIP, 元数据, 数据字典, org.func.AdminOrgExt]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行政组织扩展信息 (`org.func.AdminOrgExt`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_admin_ext` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 行政组织扩展信息 |
| 物理表 | `org_admin_ext` |
| 数据库 schema | `ucf-org-center` |
| 所属应用 | `GZTORG` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `unit_level` | `ucf-staff-center.bd_unit_level_ref` |
| `listing_type` | `` |
| `id` | `` |
| `manage_position_id` | `ucf-staff-center.bd_duty_timeline_ref` |
| `org_rank` | `ucf-staff-center.bd_org_rank_ref` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approval_code` | `approval_code` | `approvalCode` | 批文编码 |
| `approval_org` | `approval_org` | `approvalOrg` | 批文单位 |
| `attachment` | `attachment` | `attachment` | 附件 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `listing_type` | `listing_type` | `listingType` | 上市类型 |
| `unit_level` | `unit_level` | `unitLevel` | 单位级别 |
| `manage_position_id` | `manage_position_id` | `managepositionid` | 负责岗 |
| `org_rank` | `org_rank` | `orgRank` | 组织层级 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `authorized_strength` | `authorized_strength` | `authorizedStrength` | 编制 |
