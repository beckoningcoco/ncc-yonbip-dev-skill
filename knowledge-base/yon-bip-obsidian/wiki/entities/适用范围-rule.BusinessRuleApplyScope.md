---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "business.rule.BusinessRuleApplyScope"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 适用范围 (`business.rule.BusinessRuleApplyScope`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_business_rule_apply_scope` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `business.rule.BusinessRuleApplyScope` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用范围 |
| 物理表 | `cpu_business_rule_apply_scope` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:25:01.1390` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-10-24 23:29:16:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202508291632_metadata_business-rule_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `e6d841aa-d170-4662-a497-6a8bbe526d0d`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 17 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyBillTypeId` | 业务规则单据类型 | `apply_bill_type_id` | a202589a-7c24-4fcd-b939-619be0591489 | `quote` |  | ✓ |
| 2 | `applyScopeConditionExpression` | 条件表达式 | `condition_expression` | String | `text` |  | ✓ |
| 3 | `applyScopeConditionExpressionDisplay` | 条件表达式 | `condition_expression_display` | String | `text` |  | ✓ |
| 4 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 7 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 8 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 9 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 10 | `opportunityId` | 业务规则查询时机 | `opportunity_id` | 3e1ba26c-fe22-416c-bf01-217275c41825 | `quote` |  | ✓ |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 12 | `remark` | 适用范围描述 | `remark` | String | `text` |  | ✓ |
| 13 | `scopeOrgs` | 供货目录管控设置适用组织 | `` | b9652a21-22f8-41ef-a54d-a969779937ad | `` |  |  |
| 14 | `scopeTranstypes` | 适用范围交易类型 | `` | bbddfda9-857c-4810-8522-a6db063b49dd | `` |  |  |
| 15 | `solutionId` | 业务规则方案 | `solution_id` | 28b93821-f31e-44f5-b226-f2fbc4acda2d | `quote` |  | ✓ |
| 16 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `opportunityId` | 业务规则查询时机 | `business.rule.BusinessRuleOpportunity` | `opportunity_id` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `scopeTranstypes` | 适用范围交易类型 | `business.rule.BusinessRuleApplyScopeTranstype` | `` | scopeTranstypes → applyScopeId | 0..n | true | None |  |
| 4 | `applyBillTypeId` | 业务规则单据类型 | `business.rule.BusinessRuleBillType` | `apply_bill_type_id` |  →  |  |  | None |  |
| 5 | `scopeOrgs` | 供货目录管控设置适用组织 | `business.rule.BusinessRuleApplyScopeOrg` | `` | scopeOrgs → applyScopeId | 0..n | true | None |  |
| 6 | `solutionId` | 业务规则方案 | `business.rule.BusinessRuleSolution` | `solution_id` | applyScopes → solutionId | 1..n | true | None |  |

### Composition（子表）

- **scopeTranstypes**: `scopeTranstypes` → `business.rule.BusinessRuleApplyScopeTranstype` | 0..n
- **scopeOrgs**: `scopeOrgs` → `business.rule.BusinessRuleApplyScopeOrg` | 0..n
- **solutionId**: `applyScopes` → `business.rule.BusinessRuleSolution` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
