---
tags: [BIP, 元数据, 数据字典, crmc.visitexecuterule.VisitExecuteActionItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 拜访执行规则行动事项 (`crmc.visitexecuterule.VisitExecuteActionItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_visit_execute_action_item` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 拜访执行规则行动事项 |
| 物理表 | `crmc_visit_execute_action_item` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 16 个 |
| 子表 | 6 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `itemTerminalLevelList` | `crmc.visitexecuterule.VisitExecuteItemTerminalLevel` | composition |
| `itemTerminalClassList` | `crmc.visitexecuterule.VisitExecuteItemTerminalClass` | composition |
| `itemActionTypeList` | `crmc.visitexecuterule.VisitExecuteItemActionType` | composition |
| `itemCustomerClassList` | `crmc.visitexecuterule.VisitExecuteItemCustomerClass` | composition |
| `itemLabelList` | `crmc.visitexecuterule.VisitExecuteItemLabel` | composition |
| `itemCustomerLevelList` | `crmc.visitexecuterule.VisitExecuteItemCustomerLevel` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `execute_rule_id` | `` |
| `` | `` |
| `business_object` | `transtype.bd_billtypetreeref` |
| `ytenant_id` | `` |
| `matter_type` | `transtype.bd_billtyperef` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_object` | `business_object` | `businessObject` | 业务对象ID |
| `matter_type` | `matter_type` | `matterType` | 事项类型ID |
| `execute_rule_id` | `execute_rule_id` | `executeRuleId` | 执行规则ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_required` | `is_required` | `isRequired` | 是否必填 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `display_order` | `display_order` | `displayOrder` | 显示顺序 |
| `action_complete_status` | `action_complete_status` | `actionCompleteStatus` | 事项完成状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `display_name` | `display_name` | `displayName` | 显示名称 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `itemActionTypeList` | 执行规则行动事项行动分类 |
| `` | `` | `itemCustomerClassList` | 执行规则行动事项客户分类 |
| `` | `` | `itemCustomerLevelList` | 执行规则行动事项客户等级 |
| `` | `` | `itemLabelList` | 执行规则行动事项标签 |
| `` | `` | `itemTerminalClassList` | 执行规则行动事项终端分类 |
| `` | `` | `itemTerminalLevelList` | 执行规则行动事项终端等级 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
