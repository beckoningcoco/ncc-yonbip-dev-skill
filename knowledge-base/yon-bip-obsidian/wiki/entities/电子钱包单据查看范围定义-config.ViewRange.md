---
tags: ["BIP", "元数据", "数据字典", "ewallet.config.ViewRange"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包单据查看范围定义 (`ewallet.config.ViewRange`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP  模块实体元数据字典。
> 物理表：`cpu_ew_view_range_def` | 所属应用：``
> 来源：元数据API `queryByUri` 返回的 `ewallet.config.ViewRange` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包单据查看范围定义 |
| 物理表 | `cpu_ew_view_range_def` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `` |
| 业务对象ID | `a3e9a1a9-c3c8-4afe-95d4-0b52903f1892` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:07.4810` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 查看范围编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:56:20:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202512051623_metadata_ewallet-config_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `3b4fd430-b6f5-45e8-9346-70bbd6831ddd`

## 业务场景

- `dataMultilanguage`

## 术语标记

`BusinessData`, `isMain`

## 约束

- **code** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |

---

## 直接属性（共 7 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 2 | `code` | 查看范围编码 | `code` | String | `text` |  | ✓ |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 4 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 5 | `name` | 查看范围名称 | `name` | String | `multiLanguage` |  | ✓ |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

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
