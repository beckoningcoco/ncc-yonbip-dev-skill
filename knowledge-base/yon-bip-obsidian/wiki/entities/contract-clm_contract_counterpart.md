---
tags: [BIP, metadata, CLM, contract, clm_contract_counterpart]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同相对方 (CLM.clmContract.clm_contract_counterpart)

> Platform: BIP V5 | CLM | Table: clm_contract_counterpart | Schema: yonbip-ec-contract
> Parent: CLM.clmContract.clm_contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同相对方 |
| uri | CLM.clmContract.clm_contract_counterpart |
| tableName | clm_contract_counterpart |
| domain | yonbip-ec-contract |
| schema | `yonbip_clm_contract` |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |
| isExtend | true |
| description | 合同相对方信息 |

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

## All Fields (32)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | clmCounterpartId | 相对方档案 | clm_counterpart_id | quote | DZHTFW.econtract.counterpart |  |  |  |
| 2 | contractId | 合同信息 | clm_contract_id | quote | CLM.clmContract.clm_contract |  |  | isFk |
| 3 | customerId | 客户 | customer_id | quote | aa.merchant.Merchant |  |  |  |
| 4 | feature | 合同信息相对方特征 | feature | UserDefine | CLM.clmContract.clm_contract_counterpartfeatureUserDefine |  |  |  |
| 5 | merchantType | 客商类型 | merchant_type | singleOption | unitfyEnum.CLM.merchantType |  |  |  |
| 6 | participant | 参与方 | participant | singleOption | unitfyEnum.CLM.participant |  |  |  |
| 7 | signSort | 签署顺序 | sign_sort | number | Decimal |  |  |  |
| 8 | supplierId | 供应商 | supplier_id | quote | aa.vendor.Vendor |  |  |  |
| 9 | tbFilterType | 表过滤类型 | tb_filter_type | int | Integer |  |  |  |
| 10 | isMainCounterpart | 是否主相对方 | is_main_counterpart | singleOption | unitfyEnum.CLM.isOnOrYes |  |  |  |
| 11 | bizFlowInstanceId | 业务流实例id | bizflowinstance_id | text | String |  |  | nullable,uiHide |
| 12 | bizFlowMakeBillCode | 单据转换规则编码 | bizflow_makebillcode | text | String |  |  | nullable,uiHide |
| 13 | bizflowId | 业务流id | bizflow_id | text | String |  |  | nullable,uiHide |
| 14 | bizflowName | 流程名称 | bizflowname | text | String |  |  | nullable,uiHide |
| 15 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 16 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 17 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 18 | firstBusiObj | 来源业务对象 | firstbusiobj | text | String |  |  | nullable,uiHide |
| 19 | firstChildId | 来源单据子表id | firstchild_id | text | String |  |  | nullable,uiHide |
| 20 | firstCode | 来源单据号 | firstcode | text | String |  |  | nullable,uiHide |
| 21 | firstId | 来源单据主表id | first_id | text | String |  |  | nullable,uiHide |
| 22 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 23 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 24 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 25 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 26 | signAreaMappingTag | 签署区映射标志 | sign_area_mapping_tag | text | String |  |  |  |
| 27 | sourceBusiObj | 上游业务对象 | sourcebusiobj | text | String |  |  | nullable,uiHide |
| 28 | sourceChildId | 上游单据子表id | sourcechild_id | text | String |  |  | nullable,uiHide |
| 29 | sourceCode | 上游单据号 | sourcecode | text | String |  |  | nullable,uiHide |
| 30 | sourceGrandId | 来源孙表id | sourcegrand_id | text | String |  |  | nullable,uiHide |
| 31 | sourceId | 上游单据主表id | source_id | text | String |  |  | nullable,uiHide |
| 32 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | clmCounterpartId | 相对方档案 | clm_counterpart_id | DZHTFW.econtract.counterpart |
| 2 | contractId | 合同信息 | clm_contract_id | CLM.clmContract.clm_contract |
| 3 | customerId | 客户 | customer_id | aa.merchant.Merchant |
| 4 | supplierId | 供应商 | supplier_id | aa.vendor.Vendor |
| 5 | creator | 创建人 | creator | base.user.BipUser |
| 6 | modifier | 修改人 | modifier | base.user.BipUser |
| 7 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (3)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | merchantType | 客商类型 | merchant_type | merchantType |
| 2 | participant | 参与方 | participant | participant |
| 3 | isMainCounterpart | 是否主相对方 | is_main_counterpart | isOnOrYes |

---

## Number Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | signSort | 签署顺序 | sign_sort | number |
| 2 | tbFilterType | 表过滤类型 | tb_filter_type | int |
| 3 | dr | 逻辑删除 | dr | short |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | modifyTime | 修改时间 | modify_time | dateTime |
| 3 | pubts | 时间戳 | pubts | dateTime |

---

## Enum Value Details

### 客商类型 (merchantType) -> merchant_type
> Enum: unitfyEnum.CLM.merchantType

| code | value | name |
|------|-------|------|
| 1 | 1 | 客户 |
| 2 | 2 | 供应商 |

### 参与方 (participant) -> participant
> Enum: unitfyEnum.CLM.participant

| code | value | name |
|------|-------|------|
| 1 | 1 | 甲方 |
| 2 | 2 | 乙方 |
| 3 | 3 | 丙方 |
| 4 | 4 | 丁方 |
| 5 | 5 | 戊方 |
| 6 | 6 | 己方 |
| 7 | 7 | 庚方 |
| 8 | 8 | 辛方 |
| 9 | 9 | 壬方 |
| 10 | 10 | 癸方 |

### 是否主相对方 (isMainCounterpart) -> is_main_counterpart
> Enum: unitfyEnum.CLM.isOnOrYes

| code | value | name |
|------|-------|------|
| 1 | 1 | 是 |
| 0 | 0 | 否 |
