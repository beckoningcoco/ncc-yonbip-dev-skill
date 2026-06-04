---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "business.rule.BusinessRuleMatchMapping"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务规则维度映射 (`business.rule.BusinessRuleMatchMapping`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_business_rule_match_mapping` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `business.rule.BusinessRuleMatchMapping` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务规则维度映射 |
| 物理表 | `cpu_business_rule_match_mapping` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `9b3c00c7-0fc1-4283-b861-93d2e88d9043` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:51.4560` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 映射编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:38:04:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202511251647_metadata_business-rule_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `73e06e01-4ef1-4e77-8b3b-3b3b05ebaee6`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 11 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 映射编码 | `code` | String | `text` |  | ✓ |
| 2 | `details` | 业务规则维度映射明细 | `` | daf76de0-d9c4-4ea4-8055-9e7e720022ef | `` |  |  |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 4 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 5 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 6 | `name` | 映射名称 | `name` | String | `text` |  | ✓ |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 8 | `sourceBillTypeId` | 来源业务单据 | `source_bill_type_id` | a202589a-7c24-4fcd-b939-619be0591489 | `quote` |  | ✓ |
| 9 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 10 | `targetBillTypeId` | 目标业务单据 | `target_bill_type_id` | a202589a-7c24-4fcd-b939-619be0591489 | `quote` |  | ✓ |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `sourceBillTypeId` | 来源业务单据 | `business.rule.BusinessRuleBillType` | `source_bill_type_id` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `details` | 业务规则维度映射明细 | `business.rule.BusinessRuleMatchMappingDetail` | `` | details → matchMappingId | 1..n | true | None |  |
| 4 | `targetBillTypeId` | 目标业务单据 | `business.rule.BusinessRuleBillType` | `target_bill_type_id` |  →  |  |  | None |  |

### Composition（子表）

- **details**: `details` → `business.rule.BusinessRuleMatchMappingDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
