---
tags: [BIP, 元数据, 数据字典, sact.contract.IBpmCurrentAuditor]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 当前审批人 (`sact.contract.IBpmCurrentAuditor`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sact_ibpmapprovaltask` | domain：`sact` | 应用：`SACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 当前审批人 |
| 物理表 | `sact_ibpmapprovaltask` |
| 数据库 schema | `sact` |
| 所属应用 | `SACT` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `auditor` | `u8c-auth.bip_user_ref` |
| `sact_vid` | `` |

## 继承接口 (2个, 12字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
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

> 共 15 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approval_activity_id` | `approval_activity_id` | `approvalActivityId` | 流程环节ID |
| `approval_activity_name` | `approval_activity_name` | `approvalActivityName` | 流程环节名称 |
| `approval_activity_resid` | `approval_activity_resid` | `approvalActivityResid` | 环节名称资源编码 |
| `approval_comment` | `approval_comment` | `approvalComment` | 审批意见 |
| `approval_instid` | `approval_instid` | `approvalInstId` | 流程实例ID |
| `approval_result` | `approval_result` | `approvalResult` | 审批结果 |
| `approval_sign` | `approval_sign` | `approvalSign` | 签名 |
| `taskid` | `taskid` | `taskId` | 审批任务ID |
| `task_status` | `task_status` | `taskStatus` | 活动标记 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditor` | `auditor` | `auditor` | 审批人 |
| `sact_vid` | `sact_vid` | `sactVId` | 合同版本 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approval_time` | `approval_time` | `approvalTime` | 审批时间 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
