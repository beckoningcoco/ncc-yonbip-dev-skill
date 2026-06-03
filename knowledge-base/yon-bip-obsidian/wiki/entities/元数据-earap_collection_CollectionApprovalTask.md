---
tags: [BIP, 元数据, 数据字典, earap.collection.CollectionApprovalTask]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款单审批任务信息 (`earap.collection.CollectionApprovalTask`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ar_collection_b_approvaltask` | domain：`yonbip-fi-earapbill` | 应用：`EAR` | 业务对象ID：`032d3a15-07c4-4713-83ec-173cac7a6449`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款单审批任务信息 |
| 物理表 | `ar_collection_b_approvaltask` |
| 数据库 schema | `yonbip-fi-earapbill` |
| 所属应用 | `EAR` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `u8c-auth.bip_user_ref` |
| `ytenant_id` | `` |
| `header_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approval_activity_id` | `approval_activity_id` | `approvalActivityId` | 流程环节ID |
| `approval_activity_name` | `approval_activity_name` | `approvalActivityName` | 流程环节名称 |
| `approval_activity_resid` | `approval_activity_resid` | `approvalActivityResid` | 环节名称资源编码 |
| `approval_comment` | `approval_comment` | `approvalComment` | 审批意见 |
| `approval_instid` | `approval_instid` | `approvalInstId` | 流程实例ID |
| `approval_result` | `approval_result` | `approvalResult` | 审批结果 |
| `approval_sign` | `approval_sign` | `approvalSign` | 签名 |
| `id` | `id` | `id` | 主键 |
| `taskid` | `taskid` | `taskId` | 审批任务ID |
| `task_status` | `task_status` | `taskStatus` | 活动标记 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `header_id` | `header_id` | `headerId` | 收款单基本信息 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approval_time` | `approval_time` | `approvalTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
