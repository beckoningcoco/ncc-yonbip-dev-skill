---
tags: [BIP, metadata, CLM, contract, clmEventRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 大事记信息 (CLM.clmContract.clmEventRecord)

> Platform: BIP V5 | CLM | Table: clm_event_record | Schema: yonbip-ec-contract
> Parent: CLM.clmContract.clm_contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 大事记信息 |
| uri | CLM.clmContract.clmEventRecord |
| tableName | clm_event_record |
| domain | yonbip-ec-contract |
| schema | `yonbip_clm_contract` |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |
| isExtend | true |
| description | 业务流多来源 |

## Key/Code/Name

| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除 (LogicDelete) | iuap.busiObj.LogicDelete |
| 2 | 统一租户接口 (IYTenant) | iuap.busiObj.IYTenant |
| 3 | 业务流多来源 (BusinessFlowSourcesItf) | iuap.busiObj.BusinessFlowSourcesItf |
| 4 | 业务流基础 (BusinessFlowItf) | iuap.busiObj.BusinessFlowItf |
| 5 | 审计信息 (IAuditInfo) | iuap.busiObj.IAuditInfo |

---

## All Fields (26)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bizFlowInstanceId | 业务流实例id | bizflowinstance_id | text | String |  |  | nullable,uiHide |
| 2 | bizFlowMakeBillCode | 单据转换规则编码 | bizflow_makebillcode | text | String |  |  | nullable,uiHide |
| 3 | bizflowId | 业务流id | bizflow_id | text | String |  |  | nullable,uiHide |
| 4 | bizflowName | 流程名称 | bizflowname | text | String |  |  | nullable,uiHide |
| 5 | clm_contract_id | 合同信息 | clm_contract_id | quote | CLM.clmContract.clm_contract |  |  | isExtenal,isFk,nullable |
| 6 | code | 编码 | code | text | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 7 | content | 内容 | name | text | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 8 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 9 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 10 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 11 | feature | 自定义特征 | feature | UserDefine | CLM.clmContract.clmEventRecordfeatureUserDefine |  |  | changeFromBusinessPage,generateElasticEntity,isExtenal,nullable,senvitiveType |
| 12 | firstBusiObj | 来源业务对象 | firstbusiobj | text | String |  |  | nullable,uiHide |
| 13 | firstChildId | 来源单据子表id | firstchild_id | text | String |  |  | nullable,uiHide |
| 14 | firstCode | 来源单据号 | firstcode | text | String |  |  | nullable,uiHide |
| 15 | firstId | 来源单据主表id | first_id | text | String |  |  | nullable,uiHide |
| 16 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 17 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 18 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 19 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 20 | remark | 备注 | remark | text | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 21 | sourceBusiObj | 上游业务对象 | sourcebusiobj | text | String |  |  | nullable,uiHide |
| 22 | sourceChildId | 上游单据子表id | sourcechild_id | text | String |  |  | nullable,uiHide |
| 23 | sourceCode | 上游单据号 | sourcecode | text | String |  |  | nullable,uiHide |
| 24 | sourceGrandId | 来源孙表id | sourcegrand_id | text | String |  |  | nullable,uiHide |
| 25 | sourceId | 上游单据主表id | source_id | text | String |  |  | nullable,uiHide |
| 26 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | clm_contract_id | 合同信息 | clm_contract_id | CLM.clmContract.clm_contract |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (1)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | dr | 逻辑删除 | dr | short |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | modifyTime | 修改时间 | modify_time | dateTime |
| 3 | pubts | 时间戳 | pubts | dateTime |
