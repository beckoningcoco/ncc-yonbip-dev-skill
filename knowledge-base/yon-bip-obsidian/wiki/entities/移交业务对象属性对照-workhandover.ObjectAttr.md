---
tags: ["BIP", "元数据", "数据字典", "ycBase", "workhandover.workhandover.ObjectAttr"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 移交业务对象属性对照 (`workhandover.workhandover.ObjectAttr`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_workhandover_object_attr` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `workhandover.workhandover.ObjectAttr` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 移交业务对象属性对照 |
| 物理表 | `cpu_workhandover_object_attr` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycBase` |
| 业务对象ID | `f5b37676-8428-45f6-bc9c-284abb378e16` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:52.9910` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:38:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512041721_metadata_workhandover-workhandover_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `cedcd135-6523-499e-93ec-902404f0a847`

## 业务场景

- `dataMultilanguage`

## 术语标记

`BusinessData`

## 约束

- **code_UK** (transformKey): objectCode_attrCode — 唯一字段: `['attrCode', 'objectCode']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 10 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `attrCode` | 业务对象属性编码 | `attr_code` | String | `text` |  | ✓ |
| 2 | `attrName` | 业务对象属性名称 | `attr_name` | String | `text` |  | ✓ |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 4 | `handoverRole` | 移交角色 | `handover_role` | String | `text` |  | ✓ |
| 5 | `handoverRoleName` | 移交角色名称 | `handover_role_name` | String | `multiLanguage` |  | ✓ |
| 6 | `headAttrCode` | 移交单属性编码 | `head_attr_code` | String | `text` |  | ✓ |
| 7 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 8 | `objectCode` | 业务对象编码 | `object_code` | String | `text` |  | ✓ |
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
