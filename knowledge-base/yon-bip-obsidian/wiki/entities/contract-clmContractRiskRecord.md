---
tags: [BIP, metadata, CLM, contract, clmContractRiskRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同风险记录 (CLM.clmContract.clmContractRiskRecord)

> Platform: BIP V5 | CLM | Table: clm_contract_risk_record | Schema: yonbip-ec-contract
> Parent: CLM.clmContract.clm_contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同风险记录 |
| uri | CLM.clmContract.clmContractRiskRecord |
| tableName | clm_contract_risk_record |
| domain | yonbip-ec-contract |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |

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

## All Fields (14)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | clm_contract_id | 合同信息 | clm_contract_id | quote | CLM.clmContract.clm_contract |  |  | isExtenal,isFk,nullable,skipReferenceCheck |
| 2 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 3 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 4 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 5 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 6 | memo | 备注 | memo | text | String |  |  | isExtenal,nullable |
| 7 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 8 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 9 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 10 | riskNum | 风险条数 | risk_num | int | Integer |  |  | isExtenal,newData,nullable |
| 11 | sourceId | 风险来源id | source_id | text | String |  |  | isExtenal,nullable |
| 12 | sourceName | 风险名称 | source_name | text | String |  |  | isExtenal,nullable |
| 13 | sourceType | 风险来源类型 | source_type | int | Integer |  |  | isExtenal,nullable |
| 14 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | clm_contract_id | 合同信息 | clm_contract_id | CLM.clmContract.clm_contract |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | dr | 逻辑删除 | dr | short |
| 2 | riskNum | 风险条数 | risk_num | int |
| 3 | sourceType | 风险来源类型 | source_type | int |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | modifyTime | 修改时间 | modify_time | dateTime |
| 3 | pubts | 时间戳 | pubts | dateTime |
