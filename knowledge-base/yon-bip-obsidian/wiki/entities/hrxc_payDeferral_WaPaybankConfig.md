---
tags: [BIP, metadata, hrxc, WaPaybankConfig]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资发放设置 (hrxc.payDeferral.WaPaybankConfig)

> Platform: BIP V5 | Table: wa_paybank_config | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资发放设置 |
| uri | hrxc.payDeferral.WaPaybankConfig |
| tableName | wa_paybank_config |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (29)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bankName | 收款银行名称 | bank_name | text | String |  |  | nullable |
| 2 | bankNumber | 开户行主键 | bank_number | quote | bd.bank.BankDotVO |  |  | nullable |
| 3 | currencyType | 收款币别 | currency_type | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 4 | devliveryBank | 付款银行 | devlivery_bank | quote | bd.bank.BankVO |  |  | nullable |
| 5 | groupId | 分组主键 | group_id | quote | hrxc.payDeferral.WaPaybankConfigGroup |  |  | nullable |
| 6 | lastFlag | 最新标识 | lastflag | int | Integer |  |  | nullable |
| 7 | payRatio | 发放比例 | pay_ratio | int | Integer |  |  | nullable |
| 8 | payType | 支付方式 | pay_type | text | String |  |  | nullable |
| 9 | staffId | 员工主键 | staff_id | quote | hred.staff.Staff |  |  | nullable |
| 10 | accountId | 员工信息-银行账户主键 | account_id | quote | hred.staff.StaffBankAcct |  |  | nullable |
| 11 | payAmount | 支付金额 | pay_amount | number | Decimal |  |  | nullable |
| 12 | deliveryWay | 发放方式 | delivery_way | int | Integer |  |  | nullable |
| 13 | memo | 备注 | memo | text | String |  |  | nullable |
| 14 | pkPaymentSubject | 支付主体主键 | pk_payment_subject | quote | hrxc.waPaymentSubject.WaPaymentSubject |  |  | nullable |
| 15 | accountName | 账户名 | account_name | text | String |  |  | nullable |
| 16 | account | 银行卡号 | account | text | String |  |  | nullable |
| 17 | showOrder | 展示顺序 | show_order | short | Short |  |  | nullable |
| 18 | staffJobCode | 任职编码 | staffjob_code | text | String |  |  | nullable |
| 19 | effectiveTime | 生效时间 | effective_time | timestamp | Timestamp |  |  | nullable |
| 20 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 21 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 22 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 23 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 24 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 25 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 26 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 27 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 28 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 29 | extension | 薪资支付明细特征组实体 | extension | UserDefine | hrxc.payDeferral.waPaybankConfigCharacteristics |  |  | nullable |

---

## Reference Fields (10)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | bankNumber | 开户行主键 | bank_number | bd.bank.BankDotVO |
| 2 | currencyType | 收款币别 | currency_type | bd.currencytenant.CurrencyTenantVO |
| 3 | devliveryBank | 付款银行 | devlivery_bank | bd.bank.BankVO |
| 4 | groupId | 分组主键 | group_id | hrxc.payDeferral.WaPaybankConfigGroup |
| 5 | staffId | 员工主键 | staff_id | hred.staff.Staff |
| 6 | accountId | 员工信息-银行账户主键 | account_id | hred.staff.StaffBankAcct |
| 7 | pkPaymentSubject | 支付主体主键 | pk_payment_subject | hrxc.waPaymentSubject.WaPaymentSubject |
| 8 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 9 | creator | 创建人 | CREATOR | base.user.BipUser |
| 10 | modifier | 修改人 | MODIFIER | base.user.BipUser |
