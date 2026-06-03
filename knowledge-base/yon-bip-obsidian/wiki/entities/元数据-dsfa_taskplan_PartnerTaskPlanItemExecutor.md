---
tags: [BIP, 元数据, 数据字典, dsfa.taskplan.PartnerTaskPlanItemExecutor]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任务计划明细伙伴执行人 (`dsfa.taskplan.PartnerTaskPlanItemExecutor`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`dsfa_taskplan_item_executor` | domain：`yycrm` | 应用：`DSFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务计划明细伙伴执行人 |
| 物理表 | `dsfa_taskplan_item_executor` |
| 数据库 schema | `yycrm` |
| 所属应用 | `DSFA` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `plan_item_id` | `` |
| `ytenant_id` | `` |
| `executor` | `` |
| `partner_executor` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `executor` | `executor` | `executor` | 任务执行人 |
| `partner_executor` | `partner_executor` | `partnerExecutor` | 伙伴执行人 |
| `plan_item_id` | `plan_item_id` | `planItemId` | 明细ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
