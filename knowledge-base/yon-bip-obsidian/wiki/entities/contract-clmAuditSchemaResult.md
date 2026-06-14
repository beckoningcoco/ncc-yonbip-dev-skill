---
tags: [BIP, metadata, CLM, contract, clmAuditSchemaResult]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同审核方案结果 (CLM.clmContract.clmAuditSchemaResult)

> Platform: BIP V5 | CLM | Table: clm_auditresult | Schema: yonbip-ec-contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同审核方案结果 |
| uri | CLM.clmContract.clmAuditSchemaResult |
| tableName | clm_auditresult |
| domain | yonbip-ec-contract |
| schema | `yonbip_clm_contract` |
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

## All Fields (20)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | auditSchemaId | 审核方案 | audit_schema_id | quote | DZHTFW.econtract.contractAuditSchema |  |  | isExtenal,nullable |
| 2 | billid | 单据id | billid | text | String |  |  | isExtenal,nullable |
| 3 | billtype | 单据类型 | billtype | text | String |  |  | isExtenal,nullable |
| 4 | bizActiveId | 业务活动 | biz_active_id | text | String |  |  | isExtenal,nullable |
| 5 | clmAuditSchemaResultDetailList | 合同审核方案结果明细 | - | - | CLM.clmContract.clmAuditSchemaResultDetail |  |  |  |
| 6 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 7 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 8 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 9 | fileHandWorkStatus | 文本手工审核状态 | file_hand_work_status | int | Integer |  |  | isExtenal,newData,nullable |
| 10 | handWorkStatus | 单据手工审核状态 | hand_work_status | int | Integer |  |  | isExtenal,nullable |
| 11 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 12 | isLatest | 是否最新版本 | is_latest | text | String |  |  | isExtenal,nullable |
| 13 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 14 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 15 | procinstId | 流程实例 id | procinst_id | text | String |  |  | isExtenal,nullable |
| 16 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 17 | status | 审核结果 | status | text | String |  |  | isExtenal,nullable |
| 18 | version | 版本号 | version | text | String |  |  | isExtenal,nullable |
| 19 | versionOid | 版本初始id | version_oid | text | String |  |  | isExtenal,nullable |
| 20 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditSchemaId | 审核方案 | audit_schema_id | DZHTFW.econtract.contractAuditSchema |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | dr | 逻辑删除 | dr | short |
| 2 | fileHandWorkStatus | 文本手工审核状态 | file_hand_work_status | int |
| 3 | handWorkStatus | 单据手工审核状态 | hand_work_status | int |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | modifyTime | 修改时间 | modify_time | dateTime |
| 3 | pubts | 时间戳 | pubts | dateTime |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | clmAuditSchemaResultDetailList | 合同审核方案结果明细 | CLM.clmContract.clmAuditSchemaResultDetail |
