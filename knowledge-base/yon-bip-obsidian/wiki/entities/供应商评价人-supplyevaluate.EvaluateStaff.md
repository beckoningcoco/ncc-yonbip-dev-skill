---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplyevaluate.EvaluateStaff"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商评价人 (`cpu-supplymgr.supplyevaluate.EvaluateStaff`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_evaluate_person` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplyevaluate.EvaluateStaff` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商评价人 |
| 物理表 | `cpu_evaluate_person` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `3a004a2d-a2bc-4847-95e7-6eea07914032` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:45.3080` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:46:02:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202604022026_metadata_cpu-supplymgr-supplyevaluate_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `1d3608a6-636b-468b-9005-31d28a10052b`

## 业务场景

- `DataAuth`

## 术语标记

`BusinessData`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 16 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `orgId` | 评价组织id | `org_id` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |  | ✓ |
| 2 | `userName` | 关联用户id | `user_name` | String | `text` |  | ✓ |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 4 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 5 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 6 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 7 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 8 | `enable` | 启用状态 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 9 | `evaGroupId` | 评价组id | `eva_group_id` | b04119ff-753c-4e07-b18b-f92bd12d949e | `quote` |  | ✓ |
| 10 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 11 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 13 | `createTime` | 创建时间 | `createtime` | DateTime | `dateTime` |  | ✓ |
| 14 | `staffId` | 员工id | `psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 15 | `userId` | 用户id | `user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 16 | `deptId` | 部门id | `dept_id` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |  | ✓ |

---

## 关联属性（共 8 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `evaGroupId` | 评价组id | `cpu-supplymgr.supplyevaluate.EvaluateGroup` | `eva_group_id` | evaluateStaffList → evaGroupId | 0..n | true | None |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `deptId` | 部门id | `org.func.AdminOrg` | `dept_id` |  →  |  |  | Service |  |
| 6 | `userId` | 用户id | `base.user.BipUser` | `user_id` |  →  |  |  | Service |  |
| 7 | `orgId` | 评价组织id | `org.func.AdminOrg` | `org_id` |  →  |  |  | Service |  |
| 8 | `staffId` | 员工id | `bd.staff.Staff` | `psn_id` |  →  |  |  | Service |  |

### Composition（子表）

- **evaGroupId**: `evaluateStaffList` → `cpu-supplymgr.supplyevaluate.EvaluateGroup` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `deptId` (部门id) | `org.func.AdminOrg` | `dept_id` |
| `userId` (用户id) | `base.user.BipUser` | `user_id` |
| `orgId` (评价组织id) | `org.func.AdminOrg` | `org_id` |
| `staffId` (员工id) | `bd.staff.Staff` | `psn_id` |
