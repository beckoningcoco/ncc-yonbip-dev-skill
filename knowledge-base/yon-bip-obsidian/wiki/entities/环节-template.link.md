---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "suppliermgr.template.link"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 环节 (`suppliermgr.template.link`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_target_template_link` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `suppliermgr.template.link` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 环节 |
| 物理表 | `cpu_target_template_link` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:31:03.9890` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:46:02:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202604171116_metadata_suppliermgr-template.zip`
- **安装人**: mongoTools
- **安装排名**: `93e9ed03-29c3-4116-b344-b490cc083d53`

## 术语标记

`MasterData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 档案状态 (`Enable`) | `common.base.Enable` | 98 | 3 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 12 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `cutHighMarkCount` | 汇总规则-最高分 | `cutHighMarkCount` | Integer | `int` |  | ✓ |
| 2 | `cutLowMarkCount` | 汇总规则-最低分 | `cutLowMarkCount` | Integer | `int` |  | ✓ |
| 3 | `disablets` | 停用时间 | `disablets` | DateTime | `timestamp` |  | ✓ |
| 4 | `enable` | 启用状态 | `enable` | enable | `` |  | ✓ |
| 5 | `enablets` | 启用时间 | `enablets` | DateTime | `timestamp` |  | ✓ |
| 6 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 7 | `passRule` | 通过规则 | `pass_rule` | Integer | `int` |  | ✓ |
| 8 | `proportion` | 比例 | `proportion` | Integer | `int` |  | ✓ |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 10 | `sumRule` | 汇总规则 | `sum_rule` | Integer | `int` |  | ✓ |
| 11 | `templateId` | 模版ID | `template_id` | 0f1b9f8e-a486-4e1c-a5ee-b4aa7534106f | `quote` |  | ✓ |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `templateId` | 模版ID | `suppliermgr.template.Template` | `template_id` | links → templateId | 0..n | true | None |  |

### Composition（子表）

- **templateId**: `links` → `suppliermgr.template.Template` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
