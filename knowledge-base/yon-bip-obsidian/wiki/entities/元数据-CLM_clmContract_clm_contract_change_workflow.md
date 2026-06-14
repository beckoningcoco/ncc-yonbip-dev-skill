---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clm_contract_change_workflow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同变更审批任务 (`CLM.clmContract.clm_contract_change_workflow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_change_workflow` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`18dc7fea-15f6-41e0-9ab9-b14c3e510b5f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同变更审批任务 |
| 物理表 | `clm_contract_change_workflow` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `CLM` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `clmContractChange_id` | `yonbip-ec-contract.ClmContractChangeRef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `stepid` | `transtype.bd_businessstep_ref` |
| `auditor` | `u8c-auth.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (5个, 23字段)

- **业务活动YPD** (`iuap.busiObj.IYpdBpmStep`)
  - `flag` → `flag`
  - `processinstid` → `processinstid`
  - `stepid` → `stepid`
  - `stepcode_lastmodify` → `stepcode_lastmodify`
  - `stepparam` → `stepparam`
  - `taskid` → `taskid`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **审批任务YPD** (`iuap.busiObj.IYpdBpmApprovalTask`)
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
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approval_activity_id` | `approval_activity_id` | `approvalActivityId` | 流程环节ID |
| `approval_activity_name` | `approval_activity_name` | `approvalActivityName` | 流程环节名称 |
| `approval_activity_resid` | `approval_activity_resid` | `approvalActivityResid` | 环节名称资源编码 |
| `approval_comment` | `approval_comment` | `approvalComment` | 审批意见 |
| `approval_instid` | `approval_instid` | `approvalInstId` | 流程实例ID |
| `approval_result` | `approval_result` | `approvalResult` | 审批结果 |
| `approval_sign` | `approval_sign` | `approvalSign` | 签名 |
| `flag` | `flag` | `flag` | 状态标志位 |
| `id` | `id` | `id` | 主键 |
| `processinstid` | `processinstid` | `processinstId` | 流程实例 |
| `stepparam` | `stepparam` | `stepparam` | 业务阶段参数 |
| `taskid` | `taskid` | `taskId` | 任务ID |
| `task_status` | `task_status` | `taskStatus` | 活动标记 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditor` | `auditor` | `auditor` | 审批人 |
| `clmContractChange_id` | `clmContractChange_id` | `clmContractChange_id` | 合同变更 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `stepid` | `stepid` | `stepId` | 业务阶段ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approval_time` | `approval_time` | `approvalTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stepcode_lastmodify` | `stepcode_lastmodify` | `stepLastModify` | 业务阶段编码最后修改时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
