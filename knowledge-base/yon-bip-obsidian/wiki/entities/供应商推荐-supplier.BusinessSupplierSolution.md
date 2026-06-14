---
tags: ["BIP", "元数据", "数据字典", "ycBase", "business.supplier.BusinessSupplierSolution"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商推荐 (`business.supplier.BusinessSupplierSolution`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_business_rule_solution` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `business.supplier.BusinessSupplierSolution` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商推荐 |
| 物理表 | `cpu_business_rule_solution` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycBase` |
| 业务对象ID | `90fb3f73-1471-4c8b-8f30-d9931f8e5f77` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:33.1170` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:08:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604271541_metadata_business-supplier_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `4c5b9a6d-a1fb-47d7-a631-7f11760d0d21`

## 业务场景

- `extdevelop`
- `dataMultilanguage`
- `UITemplate`
- `DataAuth`
- `transtype`
- `report`
- `billcode`
- `prewarning`

## 术语标记

`ConfigData`, `data_auth`

## 约束

- **code** (transformKey): 编码 — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 2 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 直接属性（共 25 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `solutionExt` | 供应商推荐扩展 | `` | a29e3c68-bab3-4977-9ce9-da30ae1a1d50 | `` |  |  |
| 2 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 3 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 4 | `manageId` | 管理员 | `manage_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 5 | `name` | 名称 | `name` | String | `multiLanguage` |  | ✓ |
| 6 | `priority` | 优先级 | `priority` | Integer | `int` |  | ✓ |
| 7 | `remark` | 适用范围描述 | `remark` | String | `text` |  | ✓ |
| 8 | `sceneId` | 业务场景 | `scene_id` | 4b1140c6-235c-4322-9106-104dc247f1da | `quote` |  | ✓ |
| 9 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 10 | `manageOrgId` | 管理组织 | `manage_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 13 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 14 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 15 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 16 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 17 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 20 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 22 | `supplierCustomMatchRules` | 自定义维度匹配规则 | `` | fb3a21e3-1142-47cc-a63b-fd686b12beb0 | `` |  |  |
| 23 | `supplierUniversalMatchRules` | 通用维度匹配规则 | `` | 474c166f-9cb3-4305-9e7e-131d5f9f010f | `` |  |  |
| 24 | `supplierTargetScopes` | 目标范围 | `` | 819efd6b-63dc-4825-9377-066fb4e79aa9 | `` |  |  |
| 25 | `supplierApplyScopes` | 适用范围 | `` | 119f3640-2665-4ef3-8715-b2cc46ac9ae0 | `` |  |  |

---

## 关联属性（共 11 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `solutionExt` | 供应商推荐扩展 | `business.supplier.BusinessSupplierSolutionExt` | `` | solutionExt → id | 1 | true | None |  |
| 3 | `supplierCustomMatchRules` | 自定义维度匹配规则 | `business.supplier.BusinessSupplierCustomMatchRule` | `` | supplierCustomMatchRules → solutionId | 0..n | true | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `supplierTargetScopes` | 目标范围 | `business.supplier.BusinessSupplierTargetScope` | `` | supplierTargetScopes → solutionId | 1..n | true | None |  |
| 6 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 7 | `manageId` | 管理员 | `bd.staff.Staff` | `manage_id` |  →  |  |  | Service |  |
| 8 | `sceneId` | 业务场景 | `business.rule.BusinessRuleScene` | `scene_id` |  →  |  |  | None |  |
| 9 | `manageOrgId` | 管理组织 | `org.func.BaseOrg` | `manage_org_id` |  →  |  |  | Service |  |
| 10 | `supplierUniversalMatchRules` | 通用维度匹配规则 | `business.supplier.BusinessSupplierUniversalMatchRule` | `` | supplierUniversalMatchRules → solutionId | 1..n | true | None |  |
| 11 | `supplierApplyScopes` | 适用范围 | `business.supplier.BusinessSupplierApplyScope` | `` | supplierApplyScopes → solutionId | 1..n | true | None |  |

### Composition（子表）

- **solutionExt**: `solutionExt` → `business.supplier.BusinessSupplierSolutionExt` | 1
- **supplierCustomMatchRules**: `supplierCustomMatchRules` → `business.supplier.BusinessSupplierCustomMatchRule` | 0..n
- **supplierTargetScopes**: `supplierTargetScopes` → `business.supplier.BusinessSupplierTargetScope` | 1..n
- **supplierUniversalMatchRules**: `supplierUniversalMatchRules` → `business.supplier.BusinessSupplierUniversalMatchRule` | 1..n
- **supplierApplyScopes**: `supplierApplyScopes` → `business.supplier.BusinessSupplierApplyScope` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `manageId` (管理员) | `bd.staff.Staff` | `manage_id` |
| `manageOrgId` (管理组织) | `org.func.BaseOrg` | `manage_org_id` |
