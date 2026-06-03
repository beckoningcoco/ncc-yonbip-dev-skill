---
tags: [BIP, metadata, hrxc, WaPaymentBill]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资代发单 (hrxc.waPaymentBill.WaPaymentBill)

> Platform: BIP V5 | Table: wa_payment_bill | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资代发单 |
| uri | hrxc.waPaymentBill.WaPaymentBill |
| tableName | wa_payment_bill |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 5 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (44)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 编码 | code | text | String |  |  | isCode,nullable |
| 2 | name | 名称 | name | text | String |  |  | nullable |
| 3 | countryId | 国家地区 | country_id | quote | bd.country.CountryVO |  |  | nullable |
| 4 | currencyId | 币种 | currency_id | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 5 | approvalFlag | 审批设置标识 | approval_flag | int | Integer |  |  | nullable |
| 6 | waItemId | 代发薪资项目 | wa_item_id | quote | hrxc.publicItem.WaItem |  |  | nullable |
| 7 | waPaymentDate | 代发业务日期 | wa_payment_date | date | Date |  |  | nullable |
| 8 | executionTime | 代发执行时间 | execution_time | timestamp | Timestamp |  |  | nullable |
| 9 | memo | 备注 | MEMO | text | String |  |  | nullable |
| 10 | attachment | 附件 | attachment | text | String |  |  | nullable |
| 11 | busiorgId | 所属组织主键 | busiorg_id | quote | org.func.BaseOrg |  |  | isMasterOrg,nullable |
| 12 | busiorgVid | 所属组织v主键 | busiorg_vid | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,nullable |
| 13 | splittingType | 拆分类型 | splitting_type | int | Integer |  |  | nullable |
| 14 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 15 | returncount | 发放单退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 16 | paymentStatus | 支付状态 | payment_status | int | Integer |  |  | nullable |
| 17 | billStatus | 单据状态 | bill_status | int | Integer |  |  | nullable |
| 18 | num | 代发明细数量 | num | int | Integer |  |  | nullable |
| 19 | successNum | 成功数量 | success_num | int | Integer |  |  | nullable |
| 20 | failNum | 失败数量 | fail_num | int | Integer |  |  | nullable |
| 21 | processingNum | 处理中数量 | processing_num | int | Integer |  |  | nullable |
| 22 | extension | 薪资代发单特征组 | extension | UserDefine | hrxc.waPaymentBill.WaPaymentBillCharacteristics |  |  | nullable |
| 23 | totalAmount | 总金额 | total_amount | number | Decimal |  |  | nullable |
| 24 | purpose | 用途 | purpose | text | String |  |  | nullable |
| 25 | lastVersion | 最新版本号 | last_version | int | Integer |  |  | nullable |
| 26 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 27 | billTypeId | 单据类型 | bill_type_id | quote | bd.bill.BillTypeVO |  |  | nullable |
| 28 | billTypeCode | 单据类型编码 | bill_type_code | text | String |  |  | nullable |
| 29 | transiTypeId | 交易类型 | transi_type_id | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 30 | transiTypeCode | 交易类型编码 | transi_type_code | text | String |  |  | nullable |
| 31 | billState | 审批状态 | bill_state | int | Integer |  |  | nullable |
| 32 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 33 | id | 主键 | id | long | Long |  |  | nullable,uiHide,REF.ID |
| 34 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 35 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 36 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 37 | creator | 创建人 | CREATOR | text | String |  |  | nullable |
| 38 | creationTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 39 | modifier | 修改人 | MODIFIER | text | String |  |  | nullable |
| 40 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 41 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 42 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 43 | dataSources | 薪资代发单数据源 | - | - | hrxc.waPaymentBill.WaPaymentBillDataSource |  |  |  |
| 44 | vouchers | 薪资代发单拆分子单据 | - | - | hrxc.waPaymentBill.WaPaymentVoucher |  |  |  |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | countryId | 国家地区 | country_id | bd.country.CountryVO |
| 2 | currencyId | 币种 | currency_id | bd.currencytenant.CurrencyTenantVO |
| 3 | waItemId | 代发薪资项目 | wa_item_id | hrxc.publicItem.WaItem |
| 4 | busiorgId | 所属组织主键 | busiorg_id | org.func.BaseOrg |
| 5 | busiorgVid | 所属组织v主键 | busiorg_vid | org.func.BaseOrgTimeline |
| 6 | billTypeId | 单据类型 | bill_type_id | bd.bill.BillTypeVO |
| 7 | transiTypeId | 交易类型 | transi_type_id | bd.bill.TransType |
| 8 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | vouchers | 薪资代发单拆分子单据 | hrxc.waPaymentBill.WaPaymentVoucher |
| 2 | dataSources | 薪资代发单数据源 | hrxc.waPaymentBill.WaPaymentBillDataSource |
