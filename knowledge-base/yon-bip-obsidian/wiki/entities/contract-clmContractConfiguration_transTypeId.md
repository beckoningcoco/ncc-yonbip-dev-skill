---
tags: [BIP, metadata, CLM, contract, clmContractConfiguration_transTypeId]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同配置交易类型 (CLM.clmContract.clmContractConfiguration_transTypeId)

> Platform: BIP V5 | CLM | Table: clmcontractconfiguration_transtypeid | Schema: yonbip-ec-contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同配置交易类型 |
| uri | CLM.clmContract.clmContractConfiguration_transTypeId |
| tableName | clmcontractconfiguration_transtypeid |
| domain | yonbip-ec-contract |
| schema | `yonbip_clm_contract` |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |

## Key
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

## All Fields (10)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 2 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 3 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 4 | fkid | 外键 | fkid | quote | CLM.clmContract.clmContractConfiguration |  |  | isExtenal,isFk,nullable |
| 5 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 6 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 7 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 8 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 9 | transTypeId | 交易类型Id | mainid | quote | bd.bill.TransType |  |  | isExtenal,nullable |
| 10 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | fkid | 外键 | fkid | CLM.clmContract.clmContractConfiguration |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | transTypeId | 交易类型Id | mainid | bd.bill.TransType |
| 5 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |
