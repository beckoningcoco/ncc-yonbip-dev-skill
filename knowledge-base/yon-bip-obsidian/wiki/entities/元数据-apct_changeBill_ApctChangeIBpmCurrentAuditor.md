---
tags: [BIP, 元数据, 数据字典, apct.changeBill.ApctChangeIBpmCurrentAuditor]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 变更单审批当前审批人 (`apct.changeBill.ApctChangeIBpmCurrentAuditor`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_change_ibpmcurrentauditor` | domain：`apct` | 应用：`APCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 变更单审批当前审批人 |
| 物理表 | `apct_apct_change_ibpmcurrentauditor` |
| 数据库 schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `auditor` | `u8c-auth.bip_user_ref` |
| `change_id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 13字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **审批任务** (`ucfbase.ucfbaseItf.IBpmApprovalTask`)
  - `approval_activity_id` → `approval_activity_id`
  - `approval_activity_name` → `approval_activity_name`
  - `approval_activity_resid` → `approval_activity_resid`
  - `approval_comment` → `approval_comment`
  - `approval_instid` → `approval_instid`
  - `approval_result` → `approval_result`
  - `approval_sign` → `approval_sign`
  - `approval_time` → `approval_time`
  - `auditor` → `auditor`
  - `taskid` → `taskid`
  - `task_status` → `task_status`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taskid` | `taskid` | `taskId` | 审批任务ID |
| `approval_activity_name` | `approval_activity_name` | `approvalActivityName` | 流程环节名称 |
| `approval_activity_resid` | `approval_activity_resid` | `approvalActivityResid` | 环节名称资源编码 |
| `approval_activity_id` | `approval_activity_id` | `approvalActivityId` | 流程环节ID |
| `approval_comment` | `approval_comment` | `approvalComment` | 审批意见 |
| `approval_sign` | `approval_sign` | `approvalSign` | 签名 |
| `approval_result` | `approval_result` | `approvalResult` | 审批结果 |
| `approval_instid` | `approval_instid` | `approvalInstId` | 流程实例ID |
| `task_status` | `task_status` | `taskStatus` | 活动标记 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_id` | `change_id` | `changeId` | 变更单 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `auditor` | `auditor` | `auditor` | 审批人 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approval_time` | `approval_time` | `approvalTime` | 审批时间 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
