---
tags: [BIP, metadata, CLM, contract, clmAuditSchemaResultDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同审核方案结果明细 (CLM.clmContract.clmAuditSchemaResultDetail)

> Platform: BIP V5 | CLM | Table: clm_auditresult_detail | Schema: yonbip-ec-contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同审核方案结果明细 |
| uri | CLM.clmContract.clmAuditSchemaResultDetail |
| tableName | clm_auditresult_detail |
| domain | yonbip-ec-contract |
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

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | auditClassId | 审核分类 | audit_class_id | quote | DZHTFW.econtract.contractAuditClass |  |  | isExtenal,nullable |
| 2 | auditItemId | 审核项 | audit_item_id | quote | DZHTFW.econtract.contractAuditItem |  |  | isExtenal,nullable |
| 3 | auditSchemaId | 审核方案 | audit_schema_id | quote | DZHTFW.econtract.contractAuditSchema |  |  | isExtenal,nullable |
| 4 | auditresultId | 合同审核方案结果 | auditresult_id | quote | CLM.clmContract.clmAuditSchemaResult |  |  | isExtenal,isFk,nullable |
| 5 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 6 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 7 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 8 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 9 | itemRemark | 审核项说明 | item_remark | text | String |  |  | isExtenal,newData,nullable |
| 10 | itemResult | 审核结果 | item_result | text | String |  |  | isExtenal,nullable |
| 11 | itemResultTips | 审核结果说明 | item_result_tips | text | String |  |  | isExtenal,nullable |
| 12 | manualResult | 人工处理意见 | manual_result | text | String |  |  | isExtenal,nullable |
| 13 | manualTime | 人工处理时间 | manual_time | dateTime | Date |  |  | isExtenal,nullable |
| 14 | manualUserid | 人工处理人 | manual_userid | text | String |  |  | isExtenal,nullable |
| 15 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 16 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 17 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 18 | ruleResult | 规则解析结果 | rule_result | bigText | String |  |  | isExtenal,nullable |
| 19 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditClassId | 审核分类 | audit_class_id | DZHTFW.econtract.contractAuditClass |
| 2 | auditItemId | 审核项 | audit_item_id | DZHTFW.econtract.contractAuditItem |
| 3 | auditSchemaId | 审核方案 | audit_schema_id | DZHTFW.econtract.contractAuditSchema |
| 4 | auditresultId | 合同审核方案结果 | auditresult_id | CLM.clmContract.clmAuditSchemaResult |
| 5 | creator | 创建人 | creator | base.user.BipUser |
| 6 | modifier | 修改人 | modifier | base.user.BipUser |
| 7 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |
