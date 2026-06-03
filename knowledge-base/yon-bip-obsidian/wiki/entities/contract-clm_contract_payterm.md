---
tags: [BIP, metadata, CLM, contract, clm_contract_payterm]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款协议 (CLM.clmContract.clm_contract_payterm)

> Platform: BIP V5 | CLM | Table: clm_contract_payterm | Schema: yonbip-ec-contract
> Parent: CLM.clmContract.clm_contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 付款协议 |
| uri | CLM.clmContract.clm_contract_payterm |
| tableName | clm_contract_payterm |
| domain | yonbip-ec-contract |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |
| isExtend | true |
| description | 付款协议 |

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

## All Fields (41)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | accountDays | 账期天数 | account_days | int | Integer |  |  | changeFromBusinessPage,isExtenal,nullable |
| 2 | accountUnit | 账期单位 | account_unit | singleOption | unitfyEnum.CLM.clmAccountUnit |  |  | changeFromBusinessPage,isExtenal,nullable |
| 3 | bizFlowInstanceId | 业务流实例id | bizflowinstance_id | text | String |  |  | nullable,uiHide |
| 4 | bizFlowMakeBillCode | 单据转换规则编码 | bizflow_makebillcode | text | String |  |  | nullable,uiHide |
| 5 | bizflowId | 业务流id | bizflow_id | text | String |  |  | nullable,uiHide |
| 6 | bizflowName | 流程名称 | bizflowname | text | String |  |  | nullable,uiHide |
| 7 | contractId | 合同信息 | clm_contract_id | quote | CLM.clmContract.clm_contract |  |  | isExtenal,isFk,nullable |
| 8 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 9 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 10 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 11 | expireDate | 到期日期 | expire_date | date | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 12 | feature | 自定义特征 | feature | UserDefine | CLM.clmContract.clm_contract_paytermfeatureUserDefine |  |  | changeFromBusinessPage,generateElasticEntity,isExtenal,nullable,senvitiveType |
| 13 | firstBusiObj | 来源业务对象 | firstbusiobj | text | String |  |  | nullable,uiHide |
| 14 | firstChildId | 来源单据子表id | firstchild_id | text | String |  |  | nullable,uiHide |
| 15 | firstCode | 来源单据号 | firstcode | text | String |  |  | nullable,uiHide |
| 16 | firstId | 来源单据主表id | first_id | text | String |  |  | nullable,uiHide |
| 17 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 18 | isDeposit | 是否质保金 | is_deposit | singleOption | unitfyEnum.CLM.isOnOrYes |  |  | changeFromBusinessPage,isExtenal,nullable |
| 19 | isPrePay | 是否预付款 | is_pre_pay | singleOption | unitfyEnum.CLM.isOnOrYes |  |  | changeFromBusinessPage,isExtenal,nullable |
| 20 | issueNo | 期号 | issue_no | int | Integer |  |  | changeFromBusinessPage,isExtenal,nullable |
| 21 | memo | 备注 | memo | text | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 22 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 23 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 24 | oriPayMoney | 原币实际付款金额 | ori_pay_money | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 25 | oriPlanPayMoney | 原币计划付款金额 | ori_plan_pay_money | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 26 | payCondition | 付款条件 | pay_condition | text | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 27 | payDate | 实际付款日期 | pay_date | date | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 28 | payMoney | 本币实际付款金额 | pay_money | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 29 | payRatio | 付款比例 | pay_ratio | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 30 | payStartBase | 起效日期 | pay_start_base | quote | bd.payments.PayStartBase |  |  | changeFromBusinessPage,isExtenal,nullable |
| 31 | planPayDate | 计划付款日期 | plan_pay_date | date | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 32 | planPayMoney | 本币计划付款金额 | plan_pay_money | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 33 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 34 | settleMethod | 结算方式 | settle_method | quote | aa.settlemethod.SettleMethod |  |  | changeFromBusinessPage,isExtenal,nullable |
| 35 | sourceBusiObj | 上游业务对象 | sourcebusiobj | text | String |  |  | nullable,uiHide |
| 36 | sourceChildId | 上游单据子表id | sourcechild_id | text | String |  |  | nullable,uiHide |
| 37 | sourceCode | 上游单据号 | sourcecode | text | String |  |  | nullable,uiHide |
| 38 | sourceGrandId | 来源孙表id | sourcegrand_id | text | String |  |  | nullable,uiHide |
| 39 | sourceId | 上游单据主表id | source_id | text | String |  |  | nullable,uiHide |
| 40 | type | 款项类型 | type | quote | bd.paymenttype.PaymentTypeVO |  |  | changeFromBusinessPage,isExtenal,nullable |
| 41 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | contractId | 合同信息 | clm_contract_id | CLM.clmContract.clm_contract |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | payStartBase | 起效日期 | pay_start_base | bd.payments.PayStartBase |
| 5 | settleMethod | 结算方式 | settle_method | aa.settlemethod.SettleMethod |
| 6 | type | 款项类型 | type | bd.paymenttype.PaymentTypeVO |
| 7 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (3)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | accountUnit | 账期单位 | account_unit | clmAccountUnit |
| 2 | isDeposit | 是否质保金 | is_deposit | isOnOrYes |
| 3 | isPrePay | 是否预付款 | is_pre_pay | isOnOrYes |

---

## Number Fields (8)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | accountDays | 账期天数 | account_days | int |
| 2 | dr | 逻辑删除 | dr | short |
| 3 | issueNo | 期号 | issue_no | int |
| 4 | oriPayMoney | 原币实际付款金额 | ori_pay_money | number |
| 5 | oriPlanPayMoney | 原币计划付款金额 | ori_plan_pay_money | number |
| 6 | payMoney | 本币实际付款金额 | pay_money | number |
| 7 | payRatio | 付款比例 | pay_ratio | number |
| 8 | planPayMoney | 本币计划付款金额 | plan_pay_money | number |

---

## Date Fields (6)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | expireDate | 到期日期 | expire_date | date |
| 3 | modifyTime | 修改时间 | modify_time | dateTime |
| 4 | payDate | 实际付款日期 | pay_date | date |
| 5 | planPayDate | 计划付款日期 | plan_pay_date | date |
| 6 | pubts | 时间戳 | pubts | dateTime |

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

### 是否预付款 (isPrePay) -> is_pre_pay
> Enum: unitfyEnum.CLM.isOnOrYes

| code | value | name |
|------|-------|------|
| 1 | 1 | 是 |
| 0 | 0 | 否 |
