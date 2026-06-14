---
tags: ["BIP", "元数据", "数据字典", "ycBase", "workhandover.workhandover.ObjectRelation"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 移交业务父子关系 (`workhandover.workhandover.ObjectRelation`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_workhandover_object_relation` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `workhandover.workhandover.ObjectRelation` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 移交业务父子关系 |
| 物理表 | `cpu_workhandover_object_relation` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycBase` |
| 业务对象ID | `3a69d219-542e-4dcd-b3aa-6eeca0619c80` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:51.6140` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2024-11-22 23:13:08:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202410161826_metadata_workhandover-workhandover.zip`
- **安装人**: mongoTools
- **安装排名**: `6e34c0f7-11ef-4390-8e67-e74066c634f8`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 9 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `childCode` | 子业务对象名称 | `child_code` | String | `text` |  | ✓ |
| 2 | `childName` | 子业务对象名称 | `child_name` | String | `text` |  | ✓ |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 4 | `foreignKeyAttr` | 外键属性编码 | `foreign_key_attr` | String | `text` |  | ✓ |
| 5 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 6 | `parentCode` | 父业务对象编码 | `parent_code` | String | `text` |  | ✓ |
| 7 | `parentName` | 父业务对象名称 | `parent_name` | String | `text` |  | ✓ |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

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
