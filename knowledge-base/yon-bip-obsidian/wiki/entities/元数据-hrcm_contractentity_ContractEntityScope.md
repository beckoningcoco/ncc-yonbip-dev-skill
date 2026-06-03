---
tags: [BIP, 元数据, 数据字典, hrcm.contractentity.ContractEntityScope]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 适用范围 (`hrcm.contractentity.ContractEntityScope`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cs_corp_scope_orgdept` | domain：`hrcloud-contract` | 应用：`HRCM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用范围 |
| 物理表 | `cs_corp_scope_orgdept` |
| 数据库 schema | `hrcloud-contract` |
| 所属应用 | `HRCM` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `contractentity_id` | `hrcloud-contract.hrcm_contractentity_ref` |
| `orgdept_id` | `ucf-org-center.org_admin_dept_tree_ref` |

## 继承接口 (3个, 3字段)

- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgdept_name` | `orgdept_name` | `orgdeptName` | 组织部门名称 |
| `id` | `id` | `id` | ID |
| `tenantid` | `tenantid` | `tenant` | 租户ID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgdept_id` | `orgdept_id` | `orgdeptId` | 组织部门ID |
| `contractentity_id` | `contractentity_id` | `contractentityId` | 合同主体手工码 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `ts` | `ts` | `pubts` | 时间戳 |
