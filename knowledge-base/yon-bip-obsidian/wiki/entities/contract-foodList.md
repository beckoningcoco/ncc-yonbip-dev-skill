---
tags: [BIP, metadata, CLM, contract, foodList]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 餐食 (CLM.clmContract.foodList)

> Platform: BIP V5 | CLM | Table: iuap_extend_i92076_foodlist | Schema: yonbip-ec-contract
> Parent: CLM.clmContract.clm_contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 餐食 |
| uri | CLM.clmContract.foodList |
| tableName | iuap_extend_i92076_foodlist |
| domain | yonbip-ec-contract |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |

## Key/Code/Name

| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | iuap.busiObj.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | iuap.busiObj.IYTenant |

---

## All Fields (10)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | foodname | 餐食名称 | string_0 | text | String |  |  |  |
| 2 | jcname | 机场 | string_1 | text | String |  |  |  |
| 3 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 4 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 5 | foreignerKey | 外键 | foreign_key_varchar | quote | CLM.clmContract.clm_contract | Y |  | isFk |
| 6 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 7 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 8 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 9 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 10 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | foreignerKey | 外键 | foreign_key_varchar | CLM.clmContract.clm_contract |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | modifyTime | 修改时间 | modify_time | dateTime |
| 3 | pubts | 时间戳 | pubts | dateTime |
