---
tags: [BIP, 元数据, 数据字典, hrxc.mddGroupDoc.WaGroupDocAuth]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资组授权 (`hrxc.mddGroupDoc.WaGroupDocAuth`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`wa_group_doc_auth` | domain：`yonbip-hr-paybiz` | 应用：`HRXZHS_MDD` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 薪资组授权 |
| 物理表 | `wa_group_doc_auth` |
| 数据库 schema | `yonbip-hr-paybiz` |
| 所属应用 | `HRXZHS_MDD` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `CREATOR` | `` |
| `ytenant_id` | `` |
| `AUTH_ORG_ID` | `ucf-org-center.member_org_tree_ref` |
| `MODIFIER` | `` |
| `TENANTID` | `` |
| `PK_WA_GROUP_ID` | `` |

## 继承接口 (3个, 3字段)

- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `AUTH_ORG_NAME` | `AUTH_ORG_NAME` | `authOrgName` | 授权组织 |
| `ID` | `ID` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `MODIFIER` | `MODIFIER` | `modifier` | 主键 |
| `PK_WA_GROUP_ID` | `PK_WA_GROUP_ID` | `pkWaGroupId` | 薪资组主键 |
| `AUTH_ORG_ID` | `AUTH_ORG_ID` | `authOrgId` | 授权组织主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户主键 |
| `CREATOR` | `CREATOR` | `creator` | 创建人 |
| `TENANTID` | `TENANTID` | `tenant` | 租户主键(旧) |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `DR` | `DR` | `dr` | 逻辑删除标识 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `PUBTS` | `PUBTS` | `pubts` | 时间戳 |
| `CREATIONTIME` | `CREATIONTIME` | `creationtime` | 创建时间 |
| `MODIFIEDTIME` | `MODIFIEDTIME` | `modifiedtime` | 修改时间 |
