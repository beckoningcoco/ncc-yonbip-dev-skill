---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.applyset.AuditAuthorityCase"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 审核权限方案 (`cpu-supplymgr.applyset.AuditAuthorityCase`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_audit_authority_case` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.applyset.AuditAuthorityCase` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 审核权限方案 |
| 物理表 | `cpu_audit_authority_case` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `d77471dd-de7b-46b9-a671-70e241097e14` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:42.4430` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `case_code` | `case_code` | String | 方案编码（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-24 23:19:42:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202509111135_metadata_cpu-supplymgr-applyset.zip`
- **安装人**: mongoTools
- **安装排名**: `62b2efba-3a0b-470d-b099-3d430cb2297a`

## 业务场景

- `billcode`

## 术语标记

`ConfigData`, `isMain`

## 约束

- **id_trans_rule** (transformKey): 主键翻译规则 — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 3 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 4 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `approvers` | 审核权限方案的审核人 | `` | ddf460b2-6df3-4b0f-8b23-275fa5b5586b | `` |  |  |
| 2 | `classType` | 主供分类类型 | `class_type` | String | `text` |  | ✓ |
| 3 | `code` | 方案编码 | `case_code` | String | `text` |  | ✓ |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 5 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 6 | `deptId` | 部门id | `dept_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 7 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 8 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 9 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 10 | `id` | id | `id` | Long | `long` |  | ✓ |
| 11 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 13 | `name` | 方案名称 | `case_name` | String | `text` |  | ✓ |
| 14 | `operatorName` | 操作人 | `operator_name` | String | `text` |  | ✓ |
| 15 | `organizationId` | 组织id | `organization_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 16 | `orgs` | 审核权限方案的适用组织范围 | `` | 31c370ce-8ba9-4e33-bb4f-ad77665164ab | `` |  |  |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `organizationId` | 组织id | `bd.adminOrg.BaseOrgVO` | `organization_id` |  →  |  |  | Service |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `deptId` | 部门id | `bd.adminOrg.BaseOrgVO` | `dept_id` |  →  |  |  | Service |  |
| 6 | `approvers` | 审核权限方案的审核人 | `cpu-supplymgr.applyset.AuditAuthorityCaseApprover` | `` | approvers → caseId | 0..n | true | None |  |
| 7 | `orgs` | 审核权限方案的适用组织范围 | `cpu-supplymgr.applyset.AuditAuthorityCaseOrganization` | `` | orgs → caseId | 0..n | true | None |  |

### Composition（子表）

- **approvers**: `approvers` → `cpu-supplymgr.applyset.AuditAuthorityCaseApprover` | 0..n
- **orgs**: `orgs` → `cpu-supplymgr.applyset.AuditAuthorityCaseOrganization` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `organizationId` (组织id) | `bd.adminOrg.BaseOrgVO` | `organization_id` |
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `deptId` (部门id) | `bd.adminOrg.BaseOrgVO` | `dept_id` |
