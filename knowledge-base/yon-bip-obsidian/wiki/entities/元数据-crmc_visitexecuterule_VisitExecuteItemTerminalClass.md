---
tags: [BIP, 元数据, 数据字典, crmc.visitexecuterule.VisitExecuteItemTerminalClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 执行规则行动事项终端分类 (`crmc.visitexecuterule.VisitExecuteItemTerminalClass`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_visit_execute_action_item_condition` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 执行规则行动事项终端分类 |
| 物理表 | `crmc_visit_execute_action_item_condition` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CRMC` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `execute_action_item_id` | `` |
| `condition_id` | `yxybase.aa_storecategory` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 6 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_action_item_id` | `execute_action_item_id` | `executeActionItemId` | executeActionItemId |
| `condition_id` | `condition_id` | `conditionId` | conditionId |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `condition_type` | `condition_type` | `conditionType` | conditionType |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
