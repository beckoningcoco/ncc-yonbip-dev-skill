---
tags: [BIP, metadata, CLM, contract, clm_contract_status_flow]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同状态流水 (CLM.clmContract.clm_contract_status_flow)

> Platform: BIP V5 | CLM | Table: clm_contract_status_flow | Schema: yonbip-ec-contract
> Parent: CLM.clmContract.clm_contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同状态流水 |
| uri | CLM.clmContract.clm_contract_status_flow |
| tableName | clm_contract_status_flow |
| domain | yonbip-ec-contract |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |
| description | 合同状态流水 |

## Key/Code/Name

| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除 (LogicDelete) | iuap.busiObj.LogicDelete |
| 2 | 统一租户接口 (IYTenant) | iuap.busiObj.IYTenant |
| 3 | 审计信息 (IAuditInfo) | iuap.busiObj.IAuditInfo |

---

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | cause | 原因 | cause | text | String |  |  | isExtenal,nullable |
| 2 | contractId | 合同信息 | clm_contract_id | quote | CLM.clmContract.clm_contract |  |  | isExtenal,isFk,nullable,skipReferenceCheck |
| 3 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 4 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 5 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 6 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 7 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 8 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 9 | operateTime | 操作时间 | operate_date | dateTime | Date |  |  | isExtenal,nullable |
| 10 | operation | 操作 | operation | singleOption | unitfyEnum.CLM.contractStateEvent |  |  | isExtenal,nullable |
| 11 | operator | 操作人 | operator | quote | base.user.BipUser |  |  | isExtenal,nullable |
| 12 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 13 | signProcessOrder | 签署流程顺序 | sign_process_order | int | Integer |  |  | isExtenal,nullable |
| 14 | signProcessStatus | 签署流程状态 | sign_process_status | singleOption | unitfyEnum.CLM.signProcessStatus |  |  | isExtenal,nullable |
| 15 | status | 合同状态 | status | singleOption | unitfyEnum.CLM.contractStatus |  |  | isExtenal,nullable |
| 16 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | contractId | 合同信息 | clm_contract_id | CLM.clmContract.clm_contract |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | operator | 操作人 | operator | base.user.BipUser |
| 5 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (3)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | operation | 操作 | operation | contractStateEvent |
| 2 | signProcessStatus | 签署流程状态 | sign_process_status | signProcessStatus |
| 3 | status | 合同状态 | status | contractStatus |

---

## Number Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | dr | 逻辑删除 | dr | short |
| 2 | signProcessOrder | 签署流程顺序 | sign_process_order | int |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | modifyTime | 修改时间 | modify_time | dateTime |
| 3 | operateTime | 操作时间 | operate_date | dateTime |
| 4 | pubts | 时间戳 | pubts | dateTime |

---

## Enum Value Details

### 操作 (operation) -> operation
> Enum: unitfyEnum.CLM.contractStateEvent

| code | value | name |
|------|-------|------|
| 17 | 17 | 作废 |
| 18 | 18 | 发起回传确认 |
| 19 | 19 | 回传确认通过 |
| 20 | 20 | 回传确认不通过 |
| 21 | 21 | 撤回回传确认 |
| 22 | 22 | 取消回传确认 |
| 1 | 1 | 暂存 |
| 2 | 2 | 保存 |
| 3 | 3 | 提交 |
| 4 | 4 | 审批通过 |
| 5 | 5 | 审批终止 |
| 6 | 6 | 线下回传 |
| 7 | 7 | 发起签署 |
| 8 | 8 | 签署 |
| 9 | 9 | 签署完成 |
| 10 | 10 | 拒签 |
| 11 | 11 | 生效 |
| 12 | 12 | 取消生效 |
| 13 | 13 | 冻结 |
| 14 | 14 | 取消冻结 |
| 15 | 15 | 办结 |
| 16 | 16 | 终止 |
| 23 | 23 |  归档 |
| 24 | 24 | 撤回签署 |
| 25 | 25 | 期初确认 |
| 26 | 26 | 取消期初确认 |
| 27 | 27 | 撤回回传 |

### 签署流程状态 (signProcessStatus) -> sign_process_status
> Enum: unitfyEnum.CLM.signProcessStatus

| code | value | name |
|------|-------|------|
| 0 | 0 | 未签署 |
| 1 | 1 | 签署中 |
| 2 | 2 | 已完成 |
| 7 | 7 | 已拒签 |

### 合同状态 (status) -> status
> Enum: unitfyEnum.CLM.contractStatus

| code | value | name |
|------|-------|------|
| 1 | 1 | 开立 |
| 10 | 10 | 办结 |
| 11 | 11 | 终止 |
| 12 | 12 | 审批终止 |
| 13 | 13 | 作废 |
| 2 | 2 | 审批中 |
| 3 | 3 | 已审批 |
| 4 | 4 | 签署中 |
| 5 | 5 | 已拒签 |
| 6 | 6 | 签署完成 |
| 7 | 7 | 已回传 |
| 8 | 8 | 生效 |
| 9 | 9 | 冻结 |
| 14 | 14 | 归档中 |
