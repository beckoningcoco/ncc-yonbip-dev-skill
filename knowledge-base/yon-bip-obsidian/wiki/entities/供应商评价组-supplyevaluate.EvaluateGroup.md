---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplyevaluate.EvaluateGroup"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商评价组 (`cpu-supplymgr.supplyevaluate.EvaluateGroup`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_evaluate_group` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplyevaluate.EvaluateGroup` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商评价组 |
| 物理表 | `cpu_evaluate_group` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `1483fb40-7e97-4d37-a8ba-7e2dfad5afbe` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:23.8130` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 评价组编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:46:02:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202604022026_metadata_cpu-supplymgr-supplyevaluate_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `1d3608a6-636b-468b-9005-31d28a10052b`

## 业务场景

- `billcode`

## 术语标记

`BusinessData`, `data_auth`, `isMain`, `tree_tag`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 3 | 树型结构 (`ITree`) | `ucfbase.ucfbaseItf.ITree` | 339 | 6 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 6 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 直接属性（共 21 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 评价组编码 | `code` | String | `text` |  | ✓ |
| 2 | `createTime` | 创建时间 | `createtime` | DateTime | `dateTime` |  | ✓ |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 4 | `description` | 备注 | `description` | String | `text` |  | ✓ |
| 5 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 7 | `enable` | 状态(停启用) | `enable_status` | String | `text` |  | ✓ |
| 8 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 9 | `evaluateStaffList` | 供应商评价人 | `` | 793ac3b7-643c-4d2f-ac87-5286fd74279e | `` |  |  |
| 10 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 11 | `isEnd` | 是否末级 | `isEnd` | Boolean | `switch` |  | ✓ |
| 12 | `level` | 层级 | `level` | Integer | `int` |  | ✓ |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 15 | `name` | 评价组名称 | `name` | String | `multiLanguage` |  | ✓ |
| 16 | `orgId` | 所属组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 17 | `parent` | 上级评价组id | `parent_id` | b04119ff-753c-4e07-b18b-f92bd12d949e | `quote` |  | ✓ |
| 18 | `path` | 路径 | `path` | String | `text` |  | ✓ |
| 19 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 20 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | ✓ |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `parent` | 上级评价组id | `cpu-supplymgr.supplyevaluate.EvaluateGroup` | `parent_id` |  →  |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `evaluateStaffList` | 供应商评价人 | `cpu-supplymgr.supplyevaluate.EvaluateStaff` | `` | evaluateStaffList → evaGroupId | 0..n | true | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 6 | `orgId` | 所属组织id | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **evaluateStaffList**: `evaluateStaffList` → `cpu-supplymgr.supplyevaluate.EvaluateStaff` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `orgId` (所属组织id) | `org.func.BaseOrg` | `org_id` |
