---
tags: ["BIP", "元数据", "数据字典", "bcres.orgGroup.OrgGroup"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 组织分组 (`bcres.orgGroup.OrgGroup`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP  模块实体元数据字典。
> 物理表：`cpu_org_group` | 所属应用：``
> 来源：元数据API `queryByUri` 返回的 `bcres.orgGroup.OrgGroup` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 组织分组 |
| 物理表 | `cpu_org_group` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `` |
| 业务对象ID | `a14c5403-b2da-4583-b385-1a35d3d75f61` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:07.7100` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 组织分组编码（必填，isCode）|

## 部署信息

- **部署时间**: 2025-01-17 23:07:01:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202411131427_metadata_bcres-orgGroup_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `f9c395bd-4126-4acb-807a-f62348c93dd0`

## 业务场景

- `billcode`

## 术语标记

`BusinessData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 直接属性（共 10 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `groupName` | 组织分组 | `group_name` | String | `text` |  | ✓ |
| 3 | `code` | 组织分组编码 | `code` | String | `text` |  | ✓ |
| 4 | `orgIds` | 组织id | `org_ids` | String | `text` |  | ✓ |
| 5 | `orgNames` | 对应组织 | `org_names` | String | `text` |  | ✓ |
| 6 | `innercode` | 内部编码 | `innercode` | String | `text` |  | ✓ |
| 7 | `createTime` | 创建时间 | `create_time` | Date | `date` |  | ✓ |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 1 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
