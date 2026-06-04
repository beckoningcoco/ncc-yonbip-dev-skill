---
tags: ["BIP", "元数据", "数据字典", "ycBase", "business.supplier.BusinessSupplierCustomMatchRule"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 自定义维度匹配规则 (`business.supplier.BusinessSupplierCustomMatchRule`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_business_rule_custom_match_rule` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `business.supplier.BusinessSupplierCustomMatchRule` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自定义维度匹配规则 |
| 物理表 | `cpu_business_rule_custom_match_rule` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:16:02.8510` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:53:06:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604171051_metadata_business-supplier.zip`
- **安装人**: mongoTools
- **安装排名**: `ac68a075-ffd8-48ab-b11a-fadf93d67fd7`

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

## 直接属性（共 15 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `billTypeId` | 业务规则单据类型 | `bill_type_id` | a202589a-7c24-4fcd-b939-619be0591489 | `quote` |  | ✓ |
| 2 | `conditionExpression` | 条件表达式 | `condition_expression` | String | `text` |  | ✓ |
| 3 | `conditionExpressionDisplay` | 条件表达式 | `condition_expression_display` | String | `text` |  | ✓ |
| 4 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 7 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 8 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 9 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 11 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 12 | `solutionId` | 业务规则方案 | `solution_id` | 6ad43578-38c9-4919-8f9f-ef1528733280 | `quote` |  | ✓ |
| 13 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 14 | `targetBillTypeId` | 目标单据类型 | `targer_bill_type_id` | a202589a-7c24-4fcd-b939-619be0591489 | `quote` |  | ✓ |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `solutionId` | 业务规则方案 | `business.supplier.BusinessSupplierSolution` | `solution_id` | supplierCustomMatchRules → solutionId | 0..n | true | None |  |
| 3 | `targetBillTypeId` | 目标单据类型 | `business.rule.BusinessRuleBillType` | `targer_bill_type_id` |  →  |  |  | None |  |
| 4 | `billTypeId` | 业务规则单据类型 | `business.rule.BusinessRuleBillType` | `bill_type_id` |  →  |  |  | None |  |

### Composition（子表）

- **solutionId**: `supplierCustomMatchRules` → `business.supplier.BusinessSupplierSolution` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
