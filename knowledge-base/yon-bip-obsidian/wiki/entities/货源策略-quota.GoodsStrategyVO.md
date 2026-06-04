---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.quota.GoodsStrategyVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 货源策略 (`cpubase.quota.GoodsStrategyVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_gdstrgy` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.quota.GoodsStrategyVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 货源策略 |
| 物理表 | `cpu_gdstrgy` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `fda5c330-9b43-4e42-b7fc-0b5cc1fa0990` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:27.1020` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主表id |
| 编码 | `code` | `code` | String | 方案编码（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-24 23:29:26:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509142206_metadata_cpubase-quota_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `f957aa6c-d8c2-4efd-a8bb-5c93bccd0c45`

## 业务场景

- `UITemplate`
- `billcode`
- `userdefine`
- `api`
- `bpm`

## 术语标记

`isAssigned`, `isExtend`, `ConfigData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 5 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 6 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |

---

## 直接属性（共 26 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `name` | 方案名称 | `name` | String | `multiLanguage` |  | ✓ |
| 2 | `code` | 方案编码 | `code` | String | `text` |  | ✓ |
| 3 | `creatorName` | 创建人 | `creatorName` | String | `text` |  | ✓ |
| 4 | `isMaterialClass` | 是否物料分类 | `is_material_class` | Integer | `int` |  | ✓ |
| 5 | `businessType` | 业务类型 | `business_type` | String | `text` |  | ✓ |
| 6 | `modifierName` | 修改人 | `modifierName` | String | `text` |  | ✓ |
| 7 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 9 | `materialId` | materialId | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 11 | `materialClassId` | materialClassId | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 12 | `strategy` | 方案策略 | `strategy` | Integer | `int` |  | ✓ |
| 13 | `id` | 主表id | `id` | Long | `long` |  | ✓ |
| 14 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | ✓ |
| 15 | `enable` | 启用状态 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 16 | `GoodsStrategyChdId` | 物料自由项特征组 | `chd_id` | a385e0b6-0170-4460-8afd-d1af7f743213 | `UserDefine` |  | ✓ |
| 17 | `GoodsStrategyChmId` | 策略自定义项 | `chm_id` | a90836e3-0e87-4d61-96bd-3aaf3ccd8538 | `FreeCT` |  | ✓ |
| 18 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 19 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 20 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 21 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 22 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 23 | `path` | path | `path` | String | `text` |  | ✓ |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 25 | `strategyOrgs` | 货源策略适用范围 | `` | da3c9591-47a1-48c2-954e-2460dc4baa57 | `` |  |  |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 9 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `strategyOrgs` | 货源策略适用范围 | `cpubase.quota.GoodsStrategyOrgVO` | `` | strategyOrgs → strategyId2 | 1..n | true | None |  |
| 3 | `materialClassId` | materialClassId | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 4 | `GoodsStrategyChmId` | 策略自定义项 | `cpubase.quota.GoodsStrategyChm` | `chm_id` |  →  |  |  | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 7 | `materialId` | materialId | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 8 | `orgId` | 组织id | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |
| 9 | `GoodsStrategyChdId` | 物料自由项特征组 | `cpubase.quota.GoodsStrategyChd` | `chd_id` |  →  |  |  | None |  |

### Composition（子表）

- **strategyOrgs**: `strategyOrgs` → `cpubase.quota.GoodsStrategyOrgVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `materialClassId` (materialClassId) | `pc.cls.ManagementClass` | `material_class_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `materialId` (materialId) | `pc.product.Product` | `material_id` |
| `orgId` (组织id) | `org.func.BaseOrg` | `org_id` |
