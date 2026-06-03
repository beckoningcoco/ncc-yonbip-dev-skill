---
tags: [BIP, metadata, hrxc, WaPaymentSubject]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 支付主体 (hrxc.waPaymentSubject.WaPaymentSubject)

> Platform: BIP V5 | Table: wa_payment_subject | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 支付主体 |
| uri | hrxc.waPaymentSubject.WaPaymentSubject |
| tableName | wa_payment_subject |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |

---

## All Fields (21)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | orgId | 所属组织主键 | org_id | quote | org.func.BaseOrg |  |  | nullable |
| 2 | code | 支付主体编码 | code | text | String |  |  | isCode,nullable |
| 3 | name | 支付主体名称 | name | multiLanguage | String |  |  | isName,nullable |
| 4 | bankId | 报盘银行ID | bank_id | quote | bd.bank.BankVO |  |  | nullable |
| 5 | bankAccountId | 报盘银行账户ID | bank_account_id | quote | bd.enterprise.OrgFinBankacctVO |  |  | nullable |
| 6 | singleAmountToplimit | 单人单笔支付金额上限 | single_amount_toplimit | number | Decimal |  |  | nullable |
| 7 | amountToplimit | 单笔报盘金额上限 | amount_toplimit | number | Decimal |  |  | nullable |
| 8 | dataToplimit | 单笔报盘数量上限 | data_toplimit | int | Integer |  |  | nullable |
| 9 | memo | 备注 | memo | text | String |  |  | nullable |
| 10 | id | id | id | text | String |  |  | nullable,uiHide,REF.ID |
| 11 | dr | 逻辑删除标识 | dr | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 12 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 13 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 14 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 15 | creationTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable |
| 16 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 17 | modifiedTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable |
| 18 | yTenantId | 友户通租户主键 | ytenant_id | quote | yht.tenant.YhtTenant |  |  | nullable |
| 19 | tenant | 租户主键(旧) | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 20 | extension | 支付主体特征 | extension | UserDefine | hrxc.waPaymentSubject.WaPaymentSubjectCharacteristics |  |  | nullable |
| 21 | waPaymentSubjectOrgs | 支付主体适用组织 | - | - | hrxc.waPaymentSubject.WaPaymentSubjectOrg |  |  |  |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 所属组织主键 | org_id | org.func.BaseOrg |
| 2 | bankId | 报盘银行ID | bank_id | bd.bank.BankVO |
| 3 | bankAccountId | 报盘银行账户ID | bank_account_id | bd.enterprise.OrgFinBankacctVO |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | creator | base.user.BipUser |
| 6 | modifier | 修改人 | modifier | base.user.BipUser |
| 7 | yTenantId | 友户通租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 8 | tenant | 租户主键(旧) | tenantid | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | waPaymentSubjectOrgs | 支付主体适用组织 | hrxc.waPaymentSubject.WaPaymentSubjectOrg |
