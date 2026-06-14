---
tags: [BIP, 元数据, 数据字典, earap.arRefund.mdsc_summary_task]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 汇总任务 (`earap.arRefund.mdsc_summary_task`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mdsc_summary_task` | domain：`yonbip-fi-earapbill` | 应用：`EAR` | 业务对象ID：`ebe098b3-4615-4701-812e-30501206e1de`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇总任务 |
| 物理表 | `mdsc_summary_task` |
| domain/服务域 | `yonbip-fi-earapbill` |
| schema | `fiearapbill` |
| 所属应用 | `EAR` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fail_reason` | `fail_reason` | `failReason` | 失败原因 |
| `id` | `id` | `id` | 主键 |
| `scheme_id` | `scheme_id` | `schemeId` | 汇总方案id |
| `task_group_code` | `task_group_code` | `taskGroupCode` | 分组任务编码 |
| `task_info` | `task_info` | `taskInfo` | 任务json信息 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `task_create_time` | `task_create_time` | `taskCreateTime` | 任务创建时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_status` | `execute_status` | `executeStatus` | 执行状态  1任务执行中 2任务执行成功 3任务执行失败 |
