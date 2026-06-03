---
tags: [BIP, metadata, voucher, SalePriceSettlement]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售价格结算单 (voucher.salePriceSettlement.SalePriceSettlement)

> Platform: BIP V5 | Module: voucher | Table: voucher_salepricesettlement | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 销售价格结算单 |
| uri | voucher.salePriceSettlement.SalePriceSettlement |
| tableName | voucher_salepricesettlement |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (10)

| # | Name | URI |
|---|------|-----|
| 1 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 2 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 3 | 审计信息 (IAuditInfo) | base.itf.IAuditInfo |
| 4 | 审批信息 (IApprovalInfo) | base.itf.IApprovalInfo |
| 5 | 审批提交信息 (ISubmitInfo) | ucfbase.ucfbaseItf.ISubmitInfo |
| 6 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 7 | 商家相关 (IShop) | base.itf.IShop |
| 8 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 9 | 计税方式接口 (ITaxSettingType) | sale.aa.ITaxSettingType |
| 10 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |

---

## All Fields (71)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | orgId | 开票组织 | orgid | quote | org.func.FinanceOrg |  |  | isMasterOrg,nullable |
| 2 | transTypeId | 交易类型 | transtypeid | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 3 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | nullable |
| 4 | code | 单据编码 | code | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 5 | merchantId | 客户 | merchantid | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 6 | agentContacts | 客户联系人 | agentcontacts | text | String |  |  | nullable |
| 7 | agentContactsTel | 客户联系人电话 | agentcontactstel | text | String |  |  | nullable |
| 8 | saleAreaId | 销售区域 | saleareaid | quote | aa.salearea.SaleArea |  |  | data_auth,nullable |
| 9 | retailAgentName | 散户名称 | retailagentname | text | String |  |  | nullable |
| 10 | currency | 币种 | currency | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 11 | natCurrency | 本币 | natcurrency | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 12 | exchangeRateType | 汇率类型id | exchangeratetypeid | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 13 | exchRate | 汇率 | exchangerate | number | Decimal |  |  | nullable |
| 14 | exchRateOps | 汇率折算方式 | exchrateops | - | unitfyEnum.GZTBDM.ExchangeRateMethod |  |  | nullable |
| 15 | exchRateDate | 汇率日期 | exchratedate | date | Date |  |  | nullable |
| 16 | barCode | 单据条码 | barcode | text | String |  |  | nullable |
| 17 | status | 单据状态 | status | short | Short |  |  | nullable |
| 18 | memo | 备注 | memo | text | String |  |  | nullable |
| 19 | salePriceSettlementDefineCharacter | 自定义项特征属性组 | salepricesettlementdefinecharacter | UserDefine | voucher.salePriceSettlement.SalePriceSettlementDefineCharacter |  |  | nullable |
| 20 | oriSum | 含税金额合计 | orisum | number | Decimal |  |  | nullable |
| 21 | oriMoney | 无税金额合计 | orimoney | number | Decimal |  |  | nullable |
| 22 | oriTax | 税额合计 | oritax | number | Decimal |  |  | nullable |
| 23 | natSum | 本币含税金额合计 | natsum | number | Decimal |  |  | nullable |
| 24 | natMoney | 本币无税金额合计 | natmoney | number | Decimal |  |  | nullable |
| 25 | natTax | 本币税额合计 | nattax | number | Decimal |  |  | nullable |
| 26 | quoteOriSum | 报价含税金额合计 | quoteorisum | number | Decimal |  |  | nullable |
| 27 | invoiceOriSum | 已开票含税金额 | invoiceorisum | number | Decimal |  |  | nullable |
| 28 | invAgentId | 开票客户 | invagentid | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 29 | modifyInvoiceType | 发票类型可改 | modifyinvoicetype | int | Integer |  |  | nullable |
| 30 | bdInvoiceTypeId | 发票类型 | bdinvoicetypeid | quote | bd.invoice.InvoiceTypeVO |  |  | nullable |
| 31 | invoiceTitleType | 抬头类型 | invoicetitletype | - | aa.merchant.EnterpriseNature |  |  | nullable |
| 32 | invoiceTitle | 发票抬头 | invoicetitle | text | String |  |  | nullable |
| 33 | invAgentTaxNo | 纳税识别号 | invagenttaxno | text | String |  |  | nullable |
| 34 | invAgentBank | 开户银行 | invagentbank | text | String |  |  | nullable |
| 35 | invAgentSubBank | 开户支行 | invagentsubbank | text | String |  |  | nullable |
| 36 | invAgentBankNo | 银行账号 | invagentbankno | text | String |  |  | nullable |
| 37 | invAgentTel | 营业电话 | invagenttel | text | String |  |  | nullable |
| 38 | invAgentAdress | 营业地址 | invoiceaddress | text | String |  |  | nullable |
| 39 | receievInvoiceMobile | 收票手机号 | receievinvoicemobile | text | String |  |  | nullable |
| 40 | receievInvoiceEmail | 收票邮箱 | receievinvoiceemail | text | String |  |  | nullable |
| 41 | source | 来源单据 | csource | text | String |  |  | nullable |
| 42 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 43 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 44 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 45 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 46 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 47 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 48 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 49 | creator | 创建人名称 | creator | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 50 | modifier | 修改人名称 | modifier | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 51 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 52 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 53 | auditor | 审批人名称 | auditor | text | String |  |  | isGlobalization,nullable |
| 54 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 55 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 56 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 57 | submitTime | 提交时间 | submit_time | dateTime | Timestamp |  |  | nullable |
| 58 | submitter | 提交人 | submitter | quote | base.user.BipUser |  |  | nullable |
| 59 | withdrawTime | 撤回提交时间 | withdraw_time | dateTime | Timestamp |  |  | nullable |
| 60 | withdrawpp | 撤回提交的人 | withdrawpp | quote | base.user.BipUser |  |  | nullable |
| 61 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 62 | shop | 商家 | iShopID | long | Long |  | Y | nullable,reportHide |
| 63 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 64 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 65 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 66 | taxSettingType | 计税方式 | taxSettingType | short | Short |  |  | nullable |
| 67 | tplid | 模板id | tplid | long | Long |  |  | nullable |
| 68 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 69 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 70 | id | 主键 | id | long | Long |  |  | nullable,REF.ID |
| 71 | salePriceSettlementDetails | 销售价格结算单明细 | - | - | voucher.salePriceSettlement.SalePriceSettlementDetail |  |  |  |

---

## Reference Fields (16)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 开票组织 | orgid | org.func.FinanceOrg |
| 2 | transTypeId | 交易类型 | transtypeid | bd.bill.TransType |
| 3 | merchantId | 客户 | merchantid | aa.merchant.Merchant |
| 4 | saleAreaId | 销售区域 | saleareaid | aa.salearea.SaleArea |
| 5 | currency | 币种 | currency | bd.currencytenant.CurrencyTenantVO |
| 6 | natCurrency | 本币 | natcurrency | bd.currencytenant.CurrencyTenantVO |
| 7 | exchangeRateType | 汇率类型id | exchangeratetypeid | bd.exchangeRate.ExchangeRateTypeVO |
| 8 | invAgentId | 开票客户 | invagentid | aa.merchant.Merchant |
| 9 | bdInvoiceTypeId | 发票类型 | bdinvoicetypeid | bd.invoice.InvoiceTypeVO |
| 10 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 11 | creatorId | 创建人 | creatorId | base.user.User |
| 12 | modifierId | 修改人 | modifierId | base.user.User |
| 13 | auditorId | 审批人 | auditorId | base.user.User |
| 14 | submitter | 提交人 | submitter | base.user.BipUser |
| 15 | withdrawpp | 撤回提交的人 | withdrawpp | base.user.BipUser |
| 16 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | salePriceSettlementDetails | 销售价格结算单明细 | voucher.salePriceSettlement.SalePriceSettlementDetail |
