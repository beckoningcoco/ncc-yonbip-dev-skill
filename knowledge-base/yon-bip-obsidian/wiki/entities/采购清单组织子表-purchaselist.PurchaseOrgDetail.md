---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.purchaselist.PurchaseOrgDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购清单组织子表 (`bctask.purchaselist.PurchaseOrgDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_purchase_org` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.purchaselist.PurchaseOrgDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购清单组织子表 |
| 物理表 | `cpu_purchase_org` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:15:55.8550` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 子表id |

## 部署信息

- **部署时间**: 2025-10-25 00:18:16:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202509181706_metadata_bctask-purchaselist.zip`
- **安装人**: mongoTools
- **安装排名**: `72a9c72c-ac96-4197-921e-91b489a60f5e`

## 术语标记

`MasterData`

## 约束

- **bizUniqueIndex_transform** (transformKey): 业务唯一规则 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`
- **bizUniqueIndex** (Unique): 业务唯一规则 — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 6 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `purchaseId` | 采购清单id | `purchase_id` | 811b01f2-10e0-40dc-938e-b6367e3728a8 | `quote` |  | ✓ |
| 2 | `id` | 子表id | `id` | Long | `long` |  | ✓ |
| 3 | `orgId` | 适用组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `purchaseId` | 采购清单id | `bctask.purchaselist.Purchase` | `purchase_id` | orgs → purchaseId | 0..n | true | None |  |
| 3 | `orgId` | 适用组织id | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **purchaseId**: `orgs` → `bctask.purchaselist.Purchase` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `orgId` (适用组织id) | `org.func.BaseOrg` | `org_id` |
