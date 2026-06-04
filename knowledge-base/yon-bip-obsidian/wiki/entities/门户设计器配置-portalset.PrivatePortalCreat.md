---
tags: ["BIP", "元数据", "数据字典", "ycBase", "portal.portalset.PrivatePortalCreat"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 门户设计器配置 (`portal.portalset.PrivatePortalCreat`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_private_portal_creat` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `portal.portalset.PrivatePortalCreat` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 门户设计器配置 |
| 物理表 | `cpu_private_portal_creat` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 业务对象ID | `f5280fb0-8813-431e-96c0-31bca5ae7c5d` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:29.9380` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:41:10:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202603201616_metadata_portal-portalset_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `3a0a00f7-5664-4a77-8b35-ad12f3d89bd7`

## 业务场景

- `dataMultilanguage`

## 术语标记

`ConfigData`

## 约束

- **UK_code_project** (transformKey): 主键 — 唯一字段: `['createtime', 'portalCode', 'portalUrl', 'project', 'dr', 'isEnable']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 22 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `adverMultilingual` | 广告页是否启用多语 | `adver_multilingual` | Short | `short` |  | ✓ |
| 2 | `common_config` | 门户配置 | `common_config` | String | `text` |  | ✓ |
| 3 | `creatId` | 创建人 | `creat_id` | String | `text` |  | ✓ |
| 4 | `creatWay` | 创建方式 | `creat_way` | Short | `short` |  | ✓ |
| 5 | `createtime` | 创建时间 | `createtime` | DateTime | `timestamp` |  | ✓ |
| 6 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `enterpriseName` | 企业名称 | `enterprise_name` | String | `text` |  | ✓ |
| 9 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 10 | `isEnable` | 是否可用 | `is_enable` | Short | `short` |  | ✓ |
| 11 | `isMultilingual` | 是否启动多语 | `is_multilingual` | Short | `short` |  | ✓ |
| 12 | `isTest` | 是否为测试环境 | `is_test` | Short | `short` |  | ✓ |
| 13 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |  | ✓ |
| 14 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 15 | `portalCode` | 私有门户编码 | `portal_code` | String | `text` |  | ✓ |
| 16 | `portalUrl` | 私有门户地址 | `portal_url` | String | `text` |  | ✓ |
| 17 | `privatePageList` | 门户设计器配置页面 | `` | b1ed3ae1-ad47-4139-b19b-e8b0b6548e27 | `` |  |  |
| 18 | `project` | 门户类型 | `project` | Short | `short` |  | ✓ |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 20 | `tenantId` | 租户 | `tenant_id` | String | `text` |  | ✓ |
| 21 | `updateId` | 修改人 | `update_id` | String | `text` |  | ✓ |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `privatePageList` | 门户设计器配置页面 | `portal.portalset.PrivatePage` | `` | privatePageList → refId | 0..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Composition（子表）

- **privatePageList**: `privatePageList` → `portal.portalset.PrivatePage` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
