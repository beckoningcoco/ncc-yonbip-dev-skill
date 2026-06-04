---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "business.rule.BusinessRuleControlMethod"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务规则管控方式 (`business.rule.BusinessRuleControlMethod`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_business_rule_control_method` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `business.rule.BusinessRuleControlMethod` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务规则管控方式 |
| 物理表 | `cpu_business_rule_control_method` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `b2c11897-eac9-45fe-9d30-bec072305762` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:19:10.7550` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:38:00:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202510311116_metadata_business-rule_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `fce17182-60a6-487c-adb5-ab8287684713`

## 术语标记

`ConfigData`

## 约束

- **BusinessRuleControlMethodCode** (transformKey): BusinessRuleControlMethodCode — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 9 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 2 | `controlMethodApplyBillTypes` | 业务规则管控方式适用单据 | `` | c6a599c9-89a9-4fa6-85b7-521f0e5a6130 | `` |  |  |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 4 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 5 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 6 | `name` | 名称 | `name` | String | `text` |  | ✓ |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 8 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `controlMethodApplyBillTypes` | 业务规则管控方式适用单据 | `business.rule.BusinessRuleControlMethodApplyBillType` | `` | controlMethodApplyBillTypes → controlMethodId | 0..n | true | None |  |

### Composition（子表）

- **controlMethodApplyBillTypes**: `controlMethodApplyBillTypes` → `business.rule.BusinessRuleControlMethodApplyBillType` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
