---
tags: [BIP, metadata, CLM, contract, clmContractWorkflow]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同审批审批任务 (CLM.clmContract.clmContractWorkflow)

> Platform: BIP V5 | CLM | Table: clm_contract_workflow | Schema: yonbip-ec-contract
> Parent: CLM.clmContract.clm_contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同审批审批任务 |
| uri | CLM.clmContract.clmContractWorkflow |
| tableName | clm_contract_workflow |
| domain | yonbip-ec-contract |
| schema | `yonbip_clm_contract` |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |
| isExtend | true |
| description | 合同审批审批任务 |

## Key/Code/Name

| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 业务活动YPD (IYpdBpmStep) | iuap.busiObj.IYpdBpmStep |
| 2 | 逻辑删除 (LogicDelete) | iuap.busiObj.LogicDelete |
| 3 | 审批任务YPD (IYpdBpmApprovalTask) | iuap.busiObj.IYpdBpmApprovalTask |
| 4 | 统一租户接口 (IYTenant) | iuap.busiObj.IYTenant |
| 5 | 审计信息 (IAuditInfo) | iuap.busiObj.IAuditInfo |

---

## All Fields (25)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | approvalActivityId | 流程环节ID | approval_activity_id | text | String |  |  | nullable,uiHide |
| 2 | approvalActivityName | 流程环节名称 | approval_activity_name | text | String |  |  | nullable |
| 3 | approvalActivityResid | 环节名称资源编码 | approval_activity_resid | text | String |  |  | nullable,uiHide |
| 4 | approvalComment | 审批意见 | approval_comment | text | String |  |  | nullable |
| 5 | approvalInstId | 流程实例ID | approval_instid | text | String |  |  | nullable,uiHide |
| 6 | approvalResult | 审批结果 | approval_result | text | String |  |  | nullable |
| 7 | approvalSign | 签名 | approval_sign | text | String |  |  | nullable |
| 8 | approvalTime | 审批时间 | approval_time | dateTime | Timestamp |  |  | nullable |
| 9 | auditor | 审批人 | auditor | quote | base.user.BipUser |  |  | nullable |
| 10 | clm_contract_id | 合同登记 | clm_contract_id | quote | CLM.clmContract.clm_contract |  |  | isExtenal,isFk,nullable |
| 11 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 12 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 13 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 14 | flag | 状态标志位 | flag | text | String |  |  | nullable,uiHide |
| 15 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 16 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 17 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 18 | processinstId | 流程实例 | processinstid | text | String |  |  | nullable,uiHide |
| 19 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 20 | stepId | 业务阶段ID | stepid | quote | bd.businessstep.BusinessStep |  |  | nullable,ReferenceOnly,uiHide |
| 21 | stepLastModify | 业务阶段编码最后修改时间 | stepcode_lastmodify | dateTime | Timestamp |  |  | nullable,uiHide |
| 22 | stepparam | 业务阶段参数 | stepparam | text | String |  |  | nullable,uiHide |
| 23 | taskId | 任务ID | taskid | text | String | Y |  | nullable,uiHide |
| 24 | taskStatus | 活动标记 | task_status | text | String |  |  | nullable,uiHide |
| 25 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditor | 审批人 | auditor | base.user.BipUser |
| 2 | clm_contract_id | 合同登记 | clm_contract_id | CLM.clmContract.clm_contract |
| 3 | creator | 创建人 | creator | base.user.BipUser |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | stepId | 业务阶段ID | stepid | bd.businessstep.BusinessStep |
| 6 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (1)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | dr | 逻辑删除 | dr | short |

---

## Date Fields (5)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | approvalTime | 审批时间 | approval_time | dateTime |
| 2 | createTime | 创建时间 | create_time | dateTime |
| 3 | modifyTime | 修改时间 | modify_time | dateTime |
| 4 | pubts | 时间戳 | pubts | dateTime |
| 5 | stepLastModify | 业务阶段编码最后修改时间 | stepcode_lastmodify | dateTime |
