---
tags: [BIP, 元数据, 数据字典, cust.milestoneplan.MilestonePlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 经营里程碑计划单 (`cust.milestoneplan.MilestonePlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_milestoneplan` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 经营里程碑计划单 |
| 物理表 | `cust_milestoneplan` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CUST` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `ower` | `` |
| `parent` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `custoperatetarget` | `` |
| `tenant_id` | `` |
| `customer` | `` |
| `custoperateplan` | `` |

## 继承接口 (4个, 15字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `description` | `description` | `description` | 描述 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `name` | `name` | `name` | 名称 |
| `path` | `path` | `path` | 路径 |
| `progress` | `progress` | `progress` | 进度说明 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `customer` | `customer` | `customer` | 客户名称 |
| `custoperateplan` | `custoperateplan` | `custoperateplan` | 经营规划 |
| `custoperatetarget` | `custoperatetarget` | `custoperatetarget` | 经营目标 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ower` | `ower` | `ower` | 负责人 |
| `parent` | `parent` | `parent` | 关联上级计划 |
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
| `` | `isEnd` | `isEnd` | 是否末级 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `completionstatus` | `completionstatus` | `completionstatus` | 完成状态 |
| `plantype` | `plantype` | `plantype` | 计划类型 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `associatedtask` | `associatedtask` | `associatedtask` | 关联任务 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `end_date` | `end_date` | `endDate` | 截至日期 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `start_date` | `start_date` | `startDate` | 开始日期 |
