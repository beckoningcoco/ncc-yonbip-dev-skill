---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "suppliermgr.template.TemplateClass"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 模版分类主表 (`suppliermgr.template.TemplateClass`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_target_template_class` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `suppliermgr.template.TemplateClass` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 模版分类主表 |
| 物理表 | `cpu_target_template_class` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `f61160d9-74f1-4235-908e-9657559bdeec` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:57.3690` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 分类编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:46:02:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202604171116_metadata_suppliermgr-template.zip`
- **安装人**: mongoTools
- **安装排名**: `93e9ed03-29c3-4116-b344-b490cc083d53`

## 业务场景

- `extdevelop`
- `FieldAuth`
- `dataMultilanguage`
- `UITemplate`
- `DataAuth`
- `billcode`

## 术语标记

`isMain`, `MasterData`

## 约束

- **code** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 档案状态 (`Enable`) | `common.base.Enable` | 98 | 3 |
| 2 | 审计信息 (`AuditInfo`) | `common.base.AuditInfo` | 179 | 4 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 直接属性（共 16 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `businessTypeId` | 业务类型 | `business_type_id` | 13ce1d98-af37-49c9-afba-bfb377aa5cd5 | `quote` |  | ✓ |
| 2 | `code` | 分类编码 | `code` | String | `text` |  | ✓ |
| 3 | `creationtime` | 创建时间 | `creationtime` | DateTime | `timestamp` |  | ✓ |
| 4 | `creator` | 创建人 | `creator` | ec9cb2fe-b176-4a1d-8db8-ac8188b468a9 | `quote` |  | ✓ |
| 5 | `disablets` | 停用时间 | `disablets` | DateTime | `timestamp` |  | ✓ |
| 6 | `enable` | 启用状态 | `enable` | enable | `` |  | ✓ |
| 7 | `enablets` | 启用时间 | `enablets` | DateTime | `timestamp` |  | ✓ |
| 8 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 9 | `isSys` | 是否预置 | `is_sys` | Short | `short` |  | ✓ |
| 10 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |  | ✓ |
| 11 | `modifier` | 修改人 | `modifier` | ec9cb2fe-b176-4a1d-8db8-ac8188b468a9 | `quote` |  | ✓ |
| 12 | `name` | 分类名称 | `name` | String | `multiLanguage` |  | ✓ |
| 13 | `orgId` | 组织ID | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 15 | `sequence` | 排序号 | `sequence` | Integer | `int` |  | ✓ |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `basedoc.yht.PubUserTenant` | `creator` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `modifier` | 修改人 | `basedoc.yht.PubUserTenant` | `modifier` |  →  |  |  | Service |  |
| 4 | `orgId` | 组织ID | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |
| 5 | `businessTypeId` | 业务类型 | `suppliermgr.template.ApplicableOrg` | `business_type_id` |  →  |  |  | None |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `basedoc.yht.PubUserTenant` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `basedoc.yht.PubUserTenant` | `modifier` |
| `orgId` (组织ID) | `bd.adminOrg.BaseOrgVO` | `org_id` |
