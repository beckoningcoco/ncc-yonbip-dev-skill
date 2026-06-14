---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.purchaselist.Purchase"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购清单主表 (`bctask.purchaselist.Purchase`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_purchase` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.purchaselist.Purchase` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购清单主表 |
| 物理表 | `cpu_purchase` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 业务对象ID | `f0048bab-fcfc-4140-966c-81eadb6d3f22` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:19.0890` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 采购清单编码（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-25 00:18:16:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202509181706_metadata_bctask-purchaselist.zip`
- **安装人**: mongoTools
- **安装排名**: `72a9c72c-ac96-4197-921e-91b489a60f5e`

## 业务场景

- `UITemplate`
- `DataAuth`
- `imextmp`
- `billcode`
- `userdefine`

## 术语标记

`isMain`, `MasterData`

## 约束

- **bizUniqueIndex_transform** (transformKey): 业务唯一规则 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`
- **bizUniqueIndex** (Unique): 业务唯一规则 — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 4 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 5 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 26 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `code` | 采购清单编码 | `code` | String | `text` |  | ✓ |
| 3 | `name` | 采购清单名称 | `name` | String | `multiLanguage` |  | ✓ |
| 4 | `applicationType` | 应用类型 | `application_type` | Integer | `int` |  | ✓ |
| 5 | `type` | 采购清单类型 | `type` | Integer | `int` |  | ✓ |
| 6 | `orgGroup` | 适用组织分组 | `org_group` | eaf94f0e-f195-4ef6-908b-c219fbaf47b0 | `quote` |  | ✓ |
| 7 | `picture` | 采购清单主图 | `picture` | String | `text` |  | ✓ |
| 8 | `describe` | 采购清单描述 | `describe` | String | `text` |  | ✓ |
| 9 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 11 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 13 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 14 | `details` | 采购清单子表 | `` | a4739007-e4ff-465a-8514-359c1f5bccec | `` |  |  |
| 15 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 16 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 17 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 18 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 19 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 20 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 21 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 22 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 24 | `orgs` | 采购清单组织子表 | `` | 3a740f27-fc56-4e75-b1d4-994ce9268172 | `` |  |  |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `orgGroup` | 适用组织分组 | `bcres.orgGroup.OrgGroup` | `org_group` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 5 | `details` | 采购清单子表 | `bctask.purchaselist.PurchaseDetail` | `` | details → purchaseId | 1..n | true | None |  |
| 6 | `orgs` | 采购清单组织子表 | `bctask.purchaselist.PurchaseOrgDetail` | `` | orgs → purchaseId | 0..n | true | None |  |

### Composition（子表）

- **details**: `details` → `bctask.purchaselist.PurchaseDetail` | 1..n
- **orgs**: `orgs` → `bctask.purchaselist.PurchaseOrgDetail` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
