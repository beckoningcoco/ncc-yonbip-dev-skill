---
tags: ["BIP", "元数据", "数据字典", "__PCS_workbench_group__", "cpu-basedoc.userdef.UserDefineVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 自定义项 (`cpu-basedoc.userdef.UserDefineVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP __PCS_workbench_group__ 模块实体元数据字典。
> 物理表：`cpu_user_def_doc` | 所属应用：`__PCS_workbench_group__`
> 来源：元数据API `queryByUri` 返回的 `cpu-basedoc.userdef.UserDefineVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自定义项 |
| 物理表 | `cpu_user_def_doc` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `__PCS_workbench_group__` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:10.8050` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2024-09-27 23:07:52:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202408061554_metadata_cpu-basedoc-userdef.zip`
- **安装人**: mongoTools
- **安装排名**: `9286cd73-b0fb-4131-8380-26564a919dbf`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口(扩展) (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

---

## 直接属性（共 8 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 自定义项编码 | `doc_code` | String | `text` |  | ✓ |
| 2 | `dr` | dr | `dr` | Integer | `int` |  | ✓ |
| 3 | `enterpriseId` | 企业id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 4 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 5 | `name` | 自定义项名称 | `doc_name` | String | `text` |  | ✓ |
| 6 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 7 | `typeid` | 自定义项类型 | `type_id` | Long | `long` |  | ✓ |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `enterpriseId` | 企业id | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `enterpriseId` (企业id) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
