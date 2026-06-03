---
tags: [BIP, 元数据, 数据字典, sfa.clue.SeasDistributeRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公海池分配规则表 (`sfa.clue.SeasDistributeRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_seas_distribute_rule` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`0196a345-643d-4414-aca6-2b74829de742`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公海池分配规则表 |
| 物理表 | `sfa_seas_distribute_rule` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 24 个 |
| 子表 | 3 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `clueDistributeRuleReceiver` | `sfa.clue.ClueDistributeRuleReceiver` | composition |
| `seasDistributeConditionList` | `sfa.clue.ClueHighSeasCondition` | composition |
| `clueDistributeRuleOrg` | `sfa.clue.ClueRuleOrg` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `seas_id` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 4字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `staff_id_str` | `staff_id_str` | `staffIdStr` | 接收人ID |
| `seas_name` | `seas_name` | `seasName` | 公海名称 |
| `last_staff_id` | `last_staff_id` | `lastStaffId` | 上次分配到的最后一个接收人 |
| `name` | `name` | `name` | 规则名称 |
| `role_id` | `role_id` | `roleId` | 负责人角色ID |
| `role_name` | `role_name` | `roleName` | 负责人角色名称 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `seas_id` | `seas_id` | `seasId` | 公海ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `distribute_remind` | `distribute_remind` | `distributeRemind` | 分配提醒 |
| `hold_prin_to_partic` | `hold_prin_to_partic` | `holdPrinToPartic` | 保留负责人为参与人 0--未保留 1--保留 默认保留 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_type` | `rule_type` | `ruleType` | 分配规则类型 |
| `data_range` | `data_range` | `dataRange` | 数据范围 |
| `distribute_type` | `distribute_type` | `distributeType` | 分配方式 |
| `rule_priority` | `rule_priority` | `rulePriority` | 优先级 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clueStatus` | `clueStatus` | `clueStatus` | 线索状态 0-待分配|1-跟进中 |
| `receiveObjectType` | `receiveObjectType` | `receiveObjectType` | 接收对象类型：0-销售组织|1-人员|2-部门|3-销售区域 默认为1 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `clueDistributeRuleOrg` | 线索规则适用组织 |
| `` | `` | `clueDistributeRuleReceiver` | 线索分配规则接收人表 |
| `` | `` | `seasDistributeConditionList` | 线索公海条件设定 |
