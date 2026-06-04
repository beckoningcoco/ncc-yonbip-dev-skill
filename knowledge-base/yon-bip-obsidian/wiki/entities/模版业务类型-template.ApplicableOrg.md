---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "suppliermgr.template.ApplicableOrg"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 模版业务类型 (`suppliermgr.template.ApplicableOrg`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_template_business_type` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `suppliermgr.template.ApplicableOrg` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 模版业务类型 |
| 物理表 | `cpu_template_business_type` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `1246f7cc-9e38-4290-bca9-b304d4fc3b90` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:52.7470` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:46:02:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202604171116_metadata_suppliermgr-template.zip`
- **安装人**: mongoTools
- **安装排名**: `93e9ed03-29c3-4116-b344-b490cc083d53`

## 业务场景

- `dataMultilanguage`

## 术语标记

`MasterData`

## 约束

- **applicableOrgCode** (transformKey): 业务类型编码 — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 档案状态 (`Enable`) | `common.base.Enable` | 98 | 3 |
| 2 | 审计信息 (`AuditInfo`) | `common.base.AuditInfo` | 179 | 4 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 15 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 分类编码 | `code` | String | `text` |  | ✓ |
| 2 | `creationtime` | 创建时间 | `creationtime` | DateTime | `timestamp` |  | ✓ |
| 3 | `creator` | 创建人 | `creator` | ec9cb2fe-b176-4a1d-8db8-ac8188b468a9 | `quote` |  | ✓ |
| 4 | `disablets` | 停用时间 | `disablets` | DateTime | `timestamp` |  | ✓ |
| 5 | `enable` | 启用状态 | `enable` | enable | `` |  | ✓ |
| 6 | `enablets` | 启用时间 | `enablets` | DateTime | `timestamp` |  | ✓ |
| 7 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 8 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |  | ✓ |
| 9 | `modifier` | 修改人 | `modifier` | ec9cb2fe-b176-4a1d-8db8-ac8188b468a9 | `quote` |  | ✓ |
| 10 | `name` | 分类名称 | `name` | String | `multiLanguage` |  | ✓ |
| 11 | `nameResid` | 分类名称多语ID | `name_resid` | String | `text` |  | ✓ |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 13 | `tenant` | 租户 | `tenant_id` | String | `text` |  | ✓ |
| 14 | `tmpJson` | json | `tmpJson` | String | `text` |  | ✓ |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `basedoc.yht.PubUserTenant` | `creator` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `modifier` | 修改人 | `basedoc.yht.PubUserTenant` | `modifier` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `basedoc.yht.PubUserTenant` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `basedoc.yht.PubUserTenant` | `modifier` |
