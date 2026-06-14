---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.basedoc.CustomerDocDefVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 自定义档案定义 (`bctask.basedoc.CustomerDocDefVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_user_def_doc_type` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.basedoc.CustomerDocDefVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自定义档案定义 |
| 物理表 | `cpu_user_def_doc_type` |
| domain/服务域 | `cpu-pubapp` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 业务对象ID | `30530c5e-99bd-4a77-b97c-8c51db2128aa` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:14.9360` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:30:37:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202512291413_metadata_bctask-basedoc_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `3ec108ad-382f-4520-86ae-0a16e15a2bbd`

## 业务场景

- `dataMultilanguage`

## 术语标记

`doc`, `MasterData`

## 约束

- **code,enterpriseId,dr_transform** (transformKey): 编码 — 唯一字段: `['code', 'dr']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 12 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `code` | 编码 | `user_def_doc_type_code` | String | `text` |  | ✓ |
| 3 | `name` | 名称 | `user_def_doc_type_name` | String | `multiLanguage` |  | ✓ |
| 4 | `classify` | 是否分级 | `classify` | Boolean | `switch` |  | ✓ |
| 5 | `description` | 说明 | `memo` | String | `multiLanguage` |  | ✓ |
| 6 | `enable` | 状态 | `enable_status` | Boolean | `switch` |  | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 9 | `isSys` | 系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 10 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 11 | `enterpriseId` | 所属租户 | `enterprise_id` | Long | `long` |  | ✓ |
| 12 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |

---

## 关联属性（共 1 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
