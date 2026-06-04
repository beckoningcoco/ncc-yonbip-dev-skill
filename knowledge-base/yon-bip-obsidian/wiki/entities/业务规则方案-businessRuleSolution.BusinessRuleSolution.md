---
tags: ["BIP", "元数据", "数据字典", "ycBase", "sourcing.businessRuleSolution.BusinessRuleSolution"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务规则方案 (`sourcing.businessRuleSolution.BusinessRuleSolution`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_business_rule_solution` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `sourcing.businessRuleSolution.BusinessRuleSolution` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务规则方案 |
| 物理表 | `cpu_business_rule_solution` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycBase` |
| 业务对象ID | `c4beb401-322d-4fa2-b644-81c73db6f4ac` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:57.9850` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 方案编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:06:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604101344_metadata_sourcing-businessRuleSolution_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `13ed63e1-08e7-4513-aa46-9de18a447cca`

## 业务场景

- `extdevelop`
- `dataMultilanguage`
- `UITemplate`
- `DataAuth`
- `billcode`

## 术语标记

`ConfigData`, `isBillLevelCfg`, `isMultiCodeRule`, `isUseCondition`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 4 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 5 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 26 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyScopes` | 适用单据 | `` | 3739e852-d903-4da8-8c6e-6442fe42541e | `` |  |  |
| 2 | `code` | 方案编码 | `code` | String | `text` |  | ✓ |
| 3 | `controlStrategies` | 管控策略 | `` | da7e5585-8f8c-4510-b005-9e6bcaf6995d | `` |  |  |
| 4 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 6 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 8 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 10 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 11 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 12 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 13 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 14 | `manageId` | 管理员 | `manage_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 15 | `manageOrgId` | 管理组织 | `manage_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 16 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 20 | `name` | 方案名称 | `name` | String | `multiLanguage` |  | ✓ |
| 21 | `priority` | 优先级 | `priority` | Integer | `int` |  | ✓ |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 23 | `remark` | 适用范围描述 | `remark` | String | `text` |  | ✓ |
| 24 | `sceneId` | 业务场景 | `scene_id` | 4b1140c6-235c-4322-9106-104dc247f1da | `quote` |  | ✓ |
| 25 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 8 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `controlStrategies` | 管控策略 | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | `` | controlStrategies → solutionId | 1..n | true | None |  |
| 3 | `manageId` | 管理员 | `bd.staff.Staff` | `manage_id` |  →  |  |  | Service |  |
| 4 | `sceneId` | 业务场景 | `business.rule.BusinessRuleScene` | `scene_id` |  →  |  |  | None |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 7 | `applyScopes` | 适用单据 | `sourcing.businessRuleSolution.BusinessRuleApplyScope` | `` | applyScopes → solutionId | 1..n | true | None |  |
| 8 | `manageOrgId` | 管理组织 | `org.func.BaseOrg` | `manage_org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **controlStrategies**: `controlStrategies` → `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | 1..n
- **applyScopes**: `applyScopes` → `sourcing.businessRuleSolution.BusinessRuleApplyScope` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `manageId` (管理员) | `bd.staff.Staff` | `manage_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `manageOrgId` (管理组织) | `org.func.BaseOrg` | `manage_org_id` |
