---
tags: [BIP, metadata, CLM, contract, clm_contract_recterm]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款协议 (CLM.clmContract.clm_contract_recterm)

> Platform: BIP V5 | CLM | Table: clm_contract_recterm | Schema: yonbip-ec-contract
> Parent: CLM.clmContract.clm_contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 收款协议 |
| uri | CLM.clmContract.clm_contract_recterm |
| tableName | clm_contract_recterm |
| domain | yonbip-ec-contract |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |
| isExtend | true |
| description | 收款协议 |

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

## All Fields (42)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | accountDays | 账期天数 | account_days | int | Integer |  |  | changeFromBusinessPage,isExtenal,nullable |
| 2 | accountUnit | 账期单位 | account_unit | singleOption | unitfyEnum.CLM.clmAccountUnit |  |  | changeFromBusinessPage,isExtenal,nullable |
| 3 | bizFlowInstanceId | 业务流实例id | bizflowinstance_id | text | String |  |  | nullable,uiHide |
| 4 | bizFlowMakeBillCode | 单据转换规则编码 | bizflow_makebillcode | text | String |  |  | nullable,uiHide |
| 5 | bizflowId | 业务流id | bizflow_id | text | String |  |  | nullable,uiHide |
| 6 | bizflowName | 流程名称 | bizflowname | text | String |  |  | nullable,uiHide |
| 7 | condition | 收款条件 | condition | text | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 8 | content | 款项内容 | content | text | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 9 | contractId | 合同信息 | clm_contract_id | quote | CLM.clmContract.clm_contract |  |  | isExtenal,isFk,nullable |
| 10 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 11 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 12 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 13 | expireDate | 到期日期 | expire_date | date | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 14 | feature | 自定义特征 | feature | UserDefine | CLM.clmContract.clm_contract_rectermfeatureUserDefine |  |  | changeFromBusinessPage,generateElasticEntity,isExtenal,nullable,senvitiveType |
| 15 | firstBusiObj | 来源业务对象 | firstbusiobj | text | String |  |  | nullable,uiHide |
| 16 | firstChildId | 来源单据子表id | firstchild_id | text | String |  |  | nullable,uiHide |
| 17 | firstCode | 来源单据号 | firstcode | text | String |  |  | nullable,uiHide |
| 18 | firstId | 来源单据主表id | first_id | text | String |  |  | nullable,uiHide |
| 19 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 20 | isDeposit | 是否质保金 | is_deposit | singleOption | unitfyEnum.CLM.isOnOrYes |  |  | changeFromBusinessPage,isExtenal,nullable |
| 21 | isPreReceive | 是否预收款 | is_pre_receive | singleOption | unitfyEnum.CLM.isOnOrYes |  |  | changeFromBusinessPage,isExtenal,nullable |
| 22 | issueNo | 期号 | issue_no | int | Integer |  |  | changeFromBusinessPage,isExtenal,nullable |
| 23 | memo | 备注 | memo | text | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 24 | mny | 本币实际收款金额 | mny | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 25 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 26 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 27 | oriMny | 原币实际收款金额 | ori_mny | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 28 | oriPlanPaymentMny | 原币计划收款金额 | ori_plan_payment_mny | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 29 | paymentScale | 收款比例 | payment_scale | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 30 | planPaymentDate | 预计收款日期 | plan_payment_date | dateTime | Date |  |  | changeFromBusinessPage,isExtenal,nullable |
| 31 | planPaymentMny | 本币计划收款金额 | plan_payment_mny | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 32 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 33 | receiveStartBase | 起效日期 | receive_start_base | quote | bd.receivables.ReceiveStartBase |  |  | changeFromBusinessPage,isExtenal,nullable |
| 34 | settleMethod | 结算方式 | settle_method | quote | aa.settlemethod.SettleMethod |  |  | changeFromBusinessPage,isExtenal,nullable |
| 35 | sourceBusiObj | 上游业务对象 | sourcebusiobj | text | String |  |  | nullable,uiHide |
| 36 | sourceChildId | 上游单据子表id | sourcechild_id | text | String |  |  | nullable,uiHide |
| 37 | sourceCode | 上游单据号 | sourcecode | text | String |  |  | nullable,uiHide |
| 38 | sourceGrandId | 来源孙表id | sourcegrand_id | text | String |  |  | nullable,uiHide |
| 39 | sourceId | 上游单据主表id | source_id | text | String |  |  | nullable,uiHide |
| 40 | type | 款项类型 | type | quote | bd.paymenttype.PaymentTypeVO |  |  | changeFromBusinessPage,isExtenal,newData,nullable |
| 41 | upToDate | 实际收款时间 | up_to_date | dateTime | Date |  |  | changeFromBusinessPage,isExtenal,nullable |
| 42 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | contractId | 合同信息 | clm_contract_id | CLM.clmContract.clm_contract |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | receiveStartBase | 起效日期 | receive_start_base | bd.receivables.ReceiveStartBase |
| 5 | settleMethod | 结算方式 | settle_method | aa.settlemethod.SettleMethod |
| 6 | type | 款项类型 | type | bd.paymenttype.PaymentTypeVO |
| 7 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (3)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | accountUnit | 账期单位 | account_unit | clmAccountUnit |
| 2 | isDeposit | 是否质保金 | is_deposit | isOnOrYes |
| 3 | isPreReceive | 是否预收款 | is_pre_receive | isOnOrYes |

---

## Number Fields (8)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | accountDays | 账期天数 | account_days | int |
| 2 | dr | 逻辑删除 | dr | short |
| 3 | issueNo | 期号 | issue_no | int |
| 4 | mny | 本币实际收款金额 | mny | number |
| 5 | oriMny | 原币实际收款金额 | ori_mny | number |
| 6 | oriPlanPaymentMny | 原币计划收款金额 | ori_plan_payment_mny | number |
| 7 | paymentScale | 收款比例 | payment_scale | number |
| 8 | planPaymentMny | 本币计划收款金额 | plan_payment_mny | number |

---

## Date Fields (6)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | expireDate | 到期日期 | expire_date | date |
| 3 | modifyTime | 修改时间 | modify_time | dateTime |
| 4 | planPaymentDate | 预计收款日期 | plan_payment_date | dateTime |
| 5 | pubts | 时间戳 | pubts | dateTime |
| 6 | upToDate | 实际收款时间 | up_to_date | dateTime |

---

## Enum Value Details

### 账期单位 (accountUnit) -> account_unit
> Enum: unitfyEnum.CLM.clmAccountUnit

| code | value | name |
|------|-------|------|
| 0 | 0 | 天 |
| 1 | 1 | 月 |

### 是否质保金 (isDeposit) -> is_deposit
> Enum: unitfyEnum.CLM.isOnOrYes

| code | value | name |
|------|-------|------|
| 1 | 1 | 是 |
| 0 | 0 | 否 |

### 是否预收款 (isPreReceive) -> is_pre_receive
> Enum: unitfyEnum.CLM.isOnOrYes

| code | value | name |
|------|-------|------|
| 1 | 1 | 是 |
| 0 | 0 | 否 |
