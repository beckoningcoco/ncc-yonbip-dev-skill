---
tags: [BIP, 元数据, 数据字典, act.tasktranstype.TaskSettingMatter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任务类型设置关联事项 (`act.tasktranstype.TaskSettingMatter`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_actiontypesetting_actmatt` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务类型设置关联事项 |
| 物理表 | `act_actiontypesetting_actmatt` |
| 数据库 schema | `yycrm` |
| 所属应用 | `ACT` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `actionTypeSetting_id` | `` |
| `businessobject` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `taskTypeSetting_id` | `` |
| `matter_type` | `` |
| `tenant_id` | `` |
| `bustype` | `` |

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actionTypeSetting_id` | `actionTypeSetting_id` | `actionTypeSettingId` | 行动类型设置ID |
| `businessobject` | `businessobject` | `businessObject` | 业务对象 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `matter_type` | `matter_type` | `matterType` | 事项类型 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `taskTypeSetting_id` | `taskTypeSetting_id` | `taskTypeSettingId` | 任务类型设置ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isrequired` | `isrequired` | `isRequired` | 是否必填 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `action_complate_status` | `action_complate_status` | `actionComplateStatus` | 事项完成状态 |
| `displayorder` | `displayorder` | `displayOrder` | 显示顺序 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `displayname` | `displayname` | `displayName` | 显示名称 |
