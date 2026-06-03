---
tags: [BIP, metadata, CLM, contract, clmContractConfiguration]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同配置 (CLM.clmContract.clmContractConfiguration)

> Platform: BIP V5 | CLM | Table: clm_contract_configuration | Schema: yonbip-ec-contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同配置 |
| uri | CLM.clmContract.clmContractConfiguration |
| tableName | clm_contract_configuration |
| domain | yonbip-ec-contract |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |
| isExtend | true |

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

## All Fields (20)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | ballowEffectBeforeReturn | 是否允许先生效后回传 | ballow_effect_before_return | switch | Boolean |  |  |  |
| 2 | billTypeId | 单据类型 | bill_type_id | quote | bd.bill.BillTypeVO |  |  | isExtenal,nullable |
| 3 | contractStatusChange | 合同状态调整需要申请审批设置 | contract_status_change | multipleOption | unitfyEnum.CLM.ClmContractStatusChangeEnum |  |  | isExtenal,nullable |
| 4 | contractType | 合同类型 | contract_type | quote | DZHTFW.econtract.contractType |  |  | isExtenal,nullable |
| 5 | contractitemBshowSetting | 合同子表显隐设置 | contractitem_bshow_setting | multipleOption | unitfyEnum.CLM.contractItemBshowSetting |  |  | isExtenal,nullable |
| 6 | eallowNoFile | 是否允许起草无文件合同 | eallow_no_file | singleOption | unitfyEnum.CLM.isOnOrYes |  |  | isExtenal,nullable |
| 7 | eautoFinalizeState | 是否开启自动定稿 | eauto_finalize_state | singleOption | unitfyEnum.CLM.isOnOrYes |  |  | isExtenal,nullable |
| 8 | returnConfirmState | 线下签署是否启用回传确认 | return_confirm_state | singleOption | unitfyEnum.CLM.isOnOrYes |  |  | isExtenal,nullable |
| 9 | sealApplicationState | 线下签署时是否启用用印申请 | seal_application_state | singleOption | unitfyEnum.CLM.isOnOrYes |  |  | isExtenal,nullable |
| 10 | signatureState | 是否启用合同签章 | signature_state | singleOption | unitfyEnum.CLM.isOnOrYes |  |  | isExtenal,nullable |
| 11 | transTypeId | 交易类型Id | trans_type_id | quoteList | bd.bill.TransType |  |  | isExtenal,nullable |
| 12 | clmContractConfiguration_transTypeIdList | 合同配置交易类型 | - | - | CLM.clmContract.clmContractConfiguration_transTypeId |  |  |  |
| 13 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 14 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 15 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 16 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 17 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 18 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 19 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 20 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | billTypeId | 单据类型 | bill_type_id | bd.bill.BillTypeVO |
| 2 | contractType | 合同类型 | contract_type | DZHTFW.econtract.contractType |
| 3 | creator | 创建人 | creator | base.user.BipUser |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (5)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | eallowNoFile | 是否允许起草无文件合同 | eallow_no_file | isOnOrYes |
| 2 | eautoFinalizeState | 是否开启自动定稿 | eauto_finalize_state | isOnOrYes |
| 3 | returnConfirmState | 线下签署是否启用回传确认 | return_confirm_state | isOnOrYes |
| 4 | sealApplicationState | 线下签署时是否启用用印申请 | seal_application_state | isOnOrYes |
| 5 | signatureState | 是否启用合同签章 | signature_state | isOnOrYes |

---

## Number Fields (1)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | dr | 逻辑删除 | dr | short |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | pubts | 时间戳 | pubts | dateTime |
| 2 | createTime | 创建时间 | create_time | dateTime |
| 3 | modifyTime | 修改时间 | modify_time | dateTime |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | clmContractConfiguration_transTypeIdList | 合同配置交易类型 | CLM.clmContract.clmContractConfiguration_transTypeId |

---

## Enum Value Details

### 是否允许起草无文件合同 (eallowNoFile) -> eallow_no_file
> Enum: unitfyEnum.CLM.isOnOrYes

| code | value | name |
|------|-------|------|
| 1 | 1 | 是 |
| 0 | 0 | 否 |

### 是否开启自动定稿 (eautoFinalizeState) -> eauto_finalize_state
> Enum: unitfyEnum.CLM.isOnOrYes

| code | value | name |
|------|-------|------|
| 1 | 1 | 是 |
| 0 | 0 | 否 |

### 线下签署是否启用回传确认 (returnConfirmState) -> return_confirm_state
> Enum: unitfyEnum.CLM.isOnOrYes

| code | value | name |
|------|-------|------|
| 1 | 1 | 是 |
| 0 | 0 | 否 |

### 线下签署时是否启用用印申请 (sealApplicationState) -> seal_application_state
> Enum: unitfyEnum.CLM.isOnOrYes

| code | value | name |
|------|-------|------|
| 1 | 1 | 是 |
| 0 | 0 | 否 |

### 是否启用合同签章 (signatureState) -> signature_state
> Enum: unitfyEnum.CLM.isOnOrYes

| code | value | name |
|------|-------|------|
| 1 | 1 | 是 |
| 0 | 0 | 否 |
