---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "suppliermgr.target.TargetClass"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 指标分类基主表 (`suppliermgr.target.TargetClass`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_target_class` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `suppliermgr.target.TargetClass` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 指标分类基主表 |
| 物理表 | `cpu_target_class` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `145d566c-2152-46b9-a16d-bffce3e19384` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:50.3110` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:46:02:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202604022027_metadata_suppliermgr-target_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `73de1351-c8b1-4cd0-b870-be7af7ed2d6b`

## 业务场景

- `FieldAuth`
- `UITemplate`
- `DataAuth`
- `imextmp`
- `billcode`

## 术语标记

`doc`, `isMain`, `MasterData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 树型结构 (`ITree`) | `base.itf.ITree` | 231 | 5 |
| 3 | 档案状态 (`Enable`) | `common.base.Enable` | 98 | 3 |
| 4 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `classes` | 指标主表 | `` | 6ce0285a-5c64-4f45-a3b1-8a01ef51a8c7 | `` |  |  |
| 2 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 3 | `disablets` | 停用时间 | `disablets` | DateTime | `timestamp` |  | ✓ |
| 4 | `enable` | 状态:1启用 0停用 | `enable` | String | `text` |  | ✓ |
| 5 | `enablets` | 启用时间 | `enablets` | DateTime | `timestamp` |  | ✓ |
| 6 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 7 | `isEnd` | 是否末级 | `isEnd` | Boolean | `switch` |  | ✓ |
| 8 | `isSys` | 是否预置 | `is_sys` | Short | `short` |  | ✓ |
| 9 | `level` | 层级 | `level` | Integer | `int` |  | ✓ |
| 10 | `name` | 分类名称 | `name` | String | `text` |  | ✓ |
| 11 | `orgId` | 组织ID | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 12 | `parent` | 上级分类 | `parent` | ad912949-efeb-43a5-9a00-1de3af2b3f0c | `quote` |  | ✓ |
| 13 | `path` | 路径 | `path` | String | `text` |  | ✓ |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 15 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | ✓ |
| 16 | `tenantId` | tenantId | `tenant_id` | String | `text` |  | ✓ |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 18 | `ytenantId` | ytenantId | `ytenant_id` | String | `text` |  | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `parent` | 上级分类 | `suppliermgr.target.TargetClass` | `parent` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `classes` | 指标主表 | `suppliermgr.target.Target` | `` | classes → parentCategoryId | 0..n | true | None |  |
| 4 | `orgId` | 组织ID | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **classes**: `classes` → `suppliermgr.target.Target` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `orgId` (组织ID) | `bd.adminOrg.BaseOrgVO` | `org_id` |
