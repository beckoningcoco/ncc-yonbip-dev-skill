---
tags: [BIP, metadata, CLM, contract, clmContractBpmStep]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同审批业务阶段 (CLM.clmContract.clmContractBpmStep)

> Platform: BIP V5 | CLM | Table: clm_contract_bpm_step | Schema: yonbip-ec-contract
> Parent: CLM.clmContract.clm_contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同审批业务阶段 |
| uri | CLM.clmContract.clmContractBpmStep |
| tableName | clm_contract_bpm_step |
| domain | yonbip-ec-contract |
| schema | `yonbip_clm_contract` |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |
| isExtend | true |
| description | 合同审批业务阶段 |

## Key/Code/Name

| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除 (LogicDelete) | iuap.busiObj.LogicDelete |
| 2 | 统一租户接口 (IYTenant) | iuap.busiObj.IYTenant |
| 3 | 业务活动YPD (IYpdBpmStep) | iuap.busiObj.IYpdBpmStep |
| 4 | 审计信息 (IAuditInfo) | iuap.busiObj.IAuditInfo |

---

## All Fields (15)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | clm_contract_id | 合同登记 | clm_contract_id | quote | CLM.clmContract.clm_contract |  |  | isExtenal,isFk,nullable |
| 2 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 3 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 4 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 5 | flag | 状态标志位 | flag | text | String |  |  | nullable,uiHide |
| 6 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 7 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 8 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 9 | processinstId | 流程实例 | processinstid | text | String |  |  | nullable,uiHide |
| 10 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 11 | stepId | 业务阶段ID | stepid | quote | bd.businessstep.BusinessStep |  |  | nullable,ReferenceOnly,uiHide |
| 12 | stepLastModify | 业务阶段编码最后修改时间 | stepcode_lastmodify | dateTime | Timestamp |  |  | nullable,uiHide |
| 13 | stepparam | 业务阶段参数 | stepparam | text | String |  |  | nullable,uiHide |
| 14 | taskId | 任务ID | taskid | text | String |  |  | nullable,uiHide |
| 15 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | clm_contract_id | 合同登记 | clm_contract_id | CLM.clmContract.clm_contract |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | stepId | 业务阶段ID | stepid | bd.businessstep.BusinessStep |
| 5 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (1)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | dr | 逻辑删除 | dr | short |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | modifyTime | 修改时间 | modify_time | dateTime |
| 3 | pubts | 时间戳 | pubts | dateTime |
| 4 | stepLastModify | 业务阶段编码最后修改时间 | stepcode_lastmodify | dateTime |
