---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.applyset.AdmittanceAttribute"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 准入属性 (`cpu-supplymgr.applyset.AdmittanceAttribute`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_admittance_attribute` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.applyset.AdmittanceAttribute` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 准入属性 |
| 物理表 | `cpu_admittance_attribute` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `9d3ad7d8-78f0-4f9b-b221-98d047d3f5b1` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:46.7520` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 变更申请单主键 |
| 编码 | `code` | `code` | String | 单据编码（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-24 23:19:49:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202509231925_metadata_cpu-supplymgr-applyset_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `e6100c75-f04c-4bc5-b04e-0ac306a948c4`

## 业务场景

- `billcode`

## 术语标记

`ConfigData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 8 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | 变更申请单主键 | `id` | Long | `long` |  | ✓ |
| 2 | `useVariety` | 启用品类属性 | `use_variety` | Boolean | `switch` |  | ✓ |
| 3 | `classType` | 主供分类类型 | `class_type` | String | `text` |  | ✓ |
| 4 | `admittancesets` | 准入设置 | `` | d66c2bff-f84a-45fb-bc7b-c3aaa8228b4c | `` |  |  |
| 5 | `code` | 单据编码 | `code` | String | `text` |  | ✓ |
| 6 | `openBusinessOwner` | 启用业务负责人模式 | `open_business_owner` | Boolean | `switch` |  | ✓ |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `admittancesets` | 准入设置 | `cpu-supplymgr.applyset.AdmittanceSet` | `` | admittancesets → admittanceAttributeId | 0..n | true | None |  |

### Composition（子表）

- **admittancesets**: `admittancesets` → `cpu-supplymgr.applyset.AdmittanceSet` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
