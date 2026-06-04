---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "business.rule.BusinessRuleSolution"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供货目录管控设置 (`business.rule.BusinessRuleSolution`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_business_rule_solution` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `business.rule.BusinessRuleSolution` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供货目录管控设置 |
| 物理表 | `cpu_business_rule_solution` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `23ee04af-1f28-4f3f-b858-0d3d12b6eb9b` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:54.6610` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:52:52:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202601121812_metadata_business-rule_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `fa124592-4825-4b89-a7d3-2b67e9e8fc3d`

## 业务场景

- `FieldAuth`
- `dataMultilanguage`
- `UITemplate`
- `DataAuth`
- `billcode`
- `userdefine`

## 术语标记

`ConfigData`, `data_auth`, `isUseCondition`

## 约束

- **code_UK** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 直接属性（共 28 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyScopes` | 适用范围 | `` | e8109659-f431-4876-a67f-62cdd35d19bb | `` |  |  |
| 2 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 3 | `controlStrategies` | 管控策略 | `` | e3d989ed-05c8-413d-b71a-49427505ebdb | `` |  |  |
| 4 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 6 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 8 | `customMatchRules` | 自定义维度匹配规则 | `` | cdb0e27b-443e-4dc7-b511-03d75de96c98 | `` |  |  |
| 9 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 11 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 12 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 13 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 14 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 15 | `manageId` | 管理员 | `manage_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 16 | `manageOrgId` | 管理组织 | `manage_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 17 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 21 | `name` | 名称 | `name` | String | `multiLanguage` |  | ✓ |
| 22 | `priority` | 优先级 | `priority` | Integer | `int` |  | ✓ |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 24 | `remark` | 适用范围描述 | `remark` | String | `text` |  | ✓ |
| 25 | `sceneId` | 业务场景 | `scene_id` | 4b1140c6-235c-4322-9106-104dc247f1da | `quote` |  | ✓ |
| 26 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 27 | `universalMatchRules` | 通用维度匹配规则 | `` | 97860e11-2866-4ed2-94d8-cb0b10c6396c | `` |  |  |
| 28 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 10 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `customMatchRules` | 自定义维度匹配规则 | `business.rule.BusinessRuleCustomMatchRule` | `` | customMatchRules → solutionId | 0..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `controlStrategies` | 管控策略 | `business.rule.BusinessRuleControlStrategy` | `` | controlStrategies → solutionId | 0..n | true | None |  |
| 4 | `universalMatchRules` | 通用维度匹配规则 | `business.rule.BusinessRuleUniversalMatchRule` | `` | universalMatchRules → solutionId | 1..n | true | None |  |
| 5 | `manageId` | 管理员 | `bd.staff.Staff` | `manage_id` |  →  |  |  | Service |  |
| 6 | `sceneId` | 业务场景 | `business.rule.BusinessRuleScene` | `scene_id` |  →  |  |  | None |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 9 | `applyScopes` | 适用范围 | `business.rule.BusinessRuleApplyScope` | `` | applyScopes → solutionId | 1..n | true | None |  |
| 10 | `manageOrgId` | 管理组织 | `org.func.BaseOrg` | `manage_org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **customMatchRules**: `customMatchRules` → `business.rule.BusinessRuleCustomMatchRule` | 0..n
- **controlStrategies**: `controlStrategies` → `business.rule.BusinessRuleControlStrategy` | 0..n
- **universalMatchRules**: `universalMatchRules` → `business.rule.BusinessRuleUniversalMatchRule` | 1..n
- **applyScopes**: `applyScopes` → `business.rule.BusinessRuleApplyScope` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `manageId` (管理员) | `bd.staff.Staff` | `manage_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `manageOrgId` (管理组织) | `org.func.BaseOrg` | `manage_org_id` |
