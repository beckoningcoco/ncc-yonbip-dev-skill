---
tags: [BIP, 元数据, 数据字典, sfa.clue.ClueDistributeRuleReceiver]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线索分配规则接收人表 (`sfa.clue.ClueDistributeRuleReceiver`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_clue_distribute_rule_receiver` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线索分配规则接收人表 |
| 物理表 | `sfa_clue_distribute_rule_receiver` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ower` | `` |
| `org` | `` |
| `ytenant_id` | `` |
| `salearea` | `` |
| `dept` | `` |
| `ruleId` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dept` | `dept` | `dept` | 接收部门 |
| `org` | `org` | `org` | 接收组织 |
| `ower` | `ower` | `ower` | 接收人 |
| `ruleId` | `ruleId` | `ruleId` | 规则ID |
| `salearea` | `salearea` | `salearea` | 接收区域 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isLastReceiver` | `isLastReceiver` | `isLastReceiver` | 是否上次分配的最后一个接收人 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
