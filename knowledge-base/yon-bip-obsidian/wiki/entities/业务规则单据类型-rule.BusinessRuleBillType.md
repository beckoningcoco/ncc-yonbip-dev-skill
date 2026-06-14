---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "business.rule.BusinessRuleBillType"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务规则单据类型 (`business.rule.BusinessRuleBillType`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_business_rule_bill_type` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `business.rule.BusinessRuleBillType` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务规则单据类型 |
| 物理表 | `cpu_business_rule_bill_type` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `a931cba0-1e32-48d6-b842-f400bda8707b` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:29:35.5100` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `billnum` | `billnum` | String | 单据号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:38:04:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202511251647_metadata_business-rule_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `73e06e01-4ef1-4e77-8b3b-3b3b05ebaee6`

## 业务场景

- `dataMultilanguage`

## 术语标记

`ConfigData`

## 约束

- **BusinessRuleBillTypeBillnum** (transformKey): BusinessRuleBillTypeBillnum — 唯一字段: `['billnum']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `attributes` | 业务规则单据属性 | `` | 9bd8cb8b-e866-4a86-b9b6-190604dfe044 | `` |  |  |
| 2 | `billName` | 单据名称 | `bill_name` | String | `multiLanguage` |  | ✓ |
| 3 | `billnum` | 单据号 | `billnum` | String | `text` |  | ✓ |
| 4 | `businessObj` | 业务对象 | `business_obj` | String | `text` |  | ✓ |
| 5 | `dataRule` | 数据规则 | `data_rule` | String | `text` |  | ✓ |
| 6 | `domain` | 服务域 | `domain` | String | `text` |  | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `entityType` | 单据类型 | `entity_type` | Short | `short` |  | ✓ |
| 9 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 10 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 11 | `mainEntity` | 主实体 | `main_entity` | String | `text` |  | ✓ |
| 12 | `microServiceCode` | 微服务编码 | `micro_service_code` | String | `text` |  | ✓ |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 14 | `semanticCode` | 语义模型编码 | `semantic_code` | String | `text` |  | ✓ |
| 15 | `semanticId` | 语义模型标识 | `semantic_id` | String | `text` |  | ✓ |
| 16 | `serviceCode` | 服务编码 | `service_code` | String | `text` |  | ✓ |
| 17 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `attributes` | 业务规则单据属性 | `business.rule.BusinessRuleBillAttribute` | `` | attributes → billTypeId | 1..n | true | None |  |

### Composition（子表）

- **attributes**: `attributes` → `business.rule.BusinessRuleBillAttribute` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
