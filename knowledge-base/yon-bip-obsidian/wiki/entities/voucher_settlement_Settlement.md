---
tags: [BIP, metadata, voucher, Settlement]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售结算单 (voucher.settlement.Settlement)

> Platform: BIP V5 | Module: voucher | Table: voucher_settlement | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 销售结算单 |
| uri | voucher.settlement.Settlement |
| tableName | voucher_settlement |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderVouch |
| isBusinessObject | true |
| description | 销售结算单 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (9)

| # | Name | URI |
|---|------|-----|
| 1 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 2 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 3 | 商家相关 (IShop) | base.itf.IShop |
| 4 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 5 | 过账信息 (IPostAccountInfo) | gscm.itf.IPostAccountInfo |
| 6 | 伙伴表头接口 (ICust) | uorder.voucher.ICust |
| 7 | 会计事务过账信息-应收 (FiEventAccInfoAr) | gscm.interf.FiEventAccInfoAr |
| 8 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 9 | 计税方式接口 (ITaxSettingType) | sale.aa.ITaxSettingType |

---

## All Fields (93)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | lockIn | 标记锁 | bLockIn | switch | Boolean |  |  | nullable |
| 2 | sourceid | 来源单据id | sourceid | long | Long |  |  | nullable |
| 3 | agentCode | 客户编码 | cAgentCode | text | String |  |  | nullable |
| 4 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 5 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 6 | auditor | 审批人名称 | auditor | text | String |  |  | isGlobalization,nullable |
| 7 | auditorId | 审核人ID | iAuditorId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 8 | bRetailAgent | 是否散户 | bRetailAgent | switch | Boolean |  |  | nullable |
| 9 | createTime | 创建时间 | dCreatedTime | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 10 | creator | 创建人 | cCreator | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 11 | creatorId | 创建人ID | iCreatorId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 12 | fiEventAccountingDateAr | 会计事务记账日期_应收 | fiEventAccountingDateAr | text | String |  |  | nullable |
| 13 | fiEventCodeAr | 会计事务类型编码_应收 | fiEventCodeAr | text | String |  |  | nullable |
| 14 | fiEventDataIdAr | 会计事务数据ID_应收 | fiEventDataIdAr | text | String |  |  | nullable |
| 15 | fiEventIdAr | 会计事务类型ID_应收 | fiEventIdAr | text | String |  |  | nullable |
| 16 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 17 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 18 | modifier | 修改人 | cModifier | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 19 | modifierId | 修改人id | iModifierId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 20 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 21 | modifyTime | 修改时间 | dModifyTime | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 22 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number | Decimal |  |  |  |
| 23 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number | Decimal |  |  |  |
| 24 | postAccountVersion | 过账版本 | postAccountVersion | long | Long |  |  | nullable |
| 25 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 26 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 27 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 28 | shop | 商家id | iShopID | long | Long |  | Y | nullable,reportHide |
| 29 | sourceTransTypeId | 来源单据交易类型 | sourceTransTypeId | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 30 | taxRate | 税率 | taxRate | number | Decimal |  |  |  |
| 31 | tplid | 模板id | tplid | long | Long |  |  | nullable |
| 32 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 33 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 34 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 35 | orgId | 开票组织id | iOrgid | quote | org.func.FinanceOrg |  |  | isMasterOrg,nullable |
| 36 | invoiceTransactionType | 发票交易类型id | invoiceTransactionType | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 37 | vouchdate | 单据日期 | vouchdate | date | Date | Y |  | nullable |
| 38 | code | 单据编号 | code | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 39 | agentId | 客户id | iAgentId | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 40 | agentContacts | 客户联系人 | cAgentContacts | text | String |  |  | nullable |
| 41 | agentContactsTel | 客户联系人电话 | cAgentContactsTel | text | String |  |  | nullable |
| 42 | saleAreaId | 销售区域id | iSaleAreaId | quote | aa.salearea.SaleArea |  |  | data_auth,nullable |
| 43 | retailAgentName | 散户名称 | cRetailAgentName | text | String |  |  | nullable |
| 44 | receiverCustId | 收货客户id | iReceiverCust | quote | aa.merchant.Merchant |  |  | data_auth,nullable,dataPowerFlag |
| 45 | currency | 币种id | cCurrencyId | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 46 | natCurrency | 本币id | natCurrencyId | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 47 | exchangeRateType | 汇率类型id | cExchangeRateTypeId | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 48 | exchRate | 汇率 | iExchangeRate | number | Decimal |  |  | nullable |
| 49 | exchRateDate | 汇率日期 | exchRateDate | date | Date |  |  | nullable |
| 50 | source | 来源单据类型 | source | text | String |  |  | nullable |
| 51 | upcode | 来源单据编号 | upcode | text | String |  |  | nullable |
| 52 | barCode | 单据条码 | barCode | text | String |  |  | nullable |
| 53 | status | 单据状态 | status | short | Short |  |  | nullable |
| 54 | postAccountStatus | 过账状态 | postAccountStatus | short | Short |  |  | nullable |
| 55 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 56 | bdInvoiceTypeId | 发票类型id | bdInvoiceTypeId | quote | bd.invoice.InvoiceTypeVO |  |  | nullable |
| 57 | custId | 伙伴id | iCustomerId | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 58 | agentRelationId | 客户交易关系id | iAgentRelationId | quote | aa.merchant.MerchantApplyRange |  |  | nullable |
| 59 | settlementDefineCharacter | 自定义项特征组 | settlementDefineCharacter | UserDefine | voucher.settlement.SettlementDefineCharacter |  |  | nullable |
| 60 | bizFlow | 流程 | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 61 | stockAccount | 发出商品标识 | iStockAccount | text | String |  |  | nullable |
| 62 | oriSum | 含税金额合计 | oriSum | number | Decimal |  |  | nullable |
| 63 | oriMoney | 无税金额合计 | oriMoney | number | Decimal |  |  | nullable |
| 64 | natMoney | 本币无税金额合计 | iNatMoney | number | Decimal |  |  | nullable |
| 65 | oriTax | 税额合计 | oriTax | number | Decimal |  |  | nullable |
| 66 | natSum | 本币含税金额合计 | iNatTaxMoney | number | Decimal |  |  | nullable |
| 67 | natTax | 本币税额合计 | iNatTax | number | Decimal |  |  | nullable |
| 68 | invAgentId | 开票客户id | iInvAgentId | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 69 | modifyInvoiceType | 发票类型可改 | bModifyInvoiceType | switch | Boolean |  |  | nullable |
| 70 | invoiceType | 发票类型 | iInvoiceType | - | aa.merchant.InvoiceType |  |  | nullable |
| 71 | invoiceTitleType | 发票抬头类型 | iInvoiceTitleType | - | aa.merchant.EnterpriseNature |  |  | nullable |
| 72 | invoiceTitle | 发票抬头 | cInvoiceTitle | text | String |  |  | nullable |
| 73 | invAgentTaxNo | 纳税识别号 | cTaxNum | text | String |  |  | nullable |
| 74 | invAgentBank | 开户银行 | cBankName | text | String |  |  | nullable |
| 75 | invAgentSubBank | 开户支行 | cSubBankName | text | String |  |  | nullable |
| 76 | invAgentBankNo | 银行账号 | cBankAccount | text | String |  |  | nullable |
| 77 | invAgentTel | 营业电话 | cInvoiceTelephone | text | String |  |  | nullable |
| 78 | invAgentAdress | 营业地址 | cInvoiceAddress | text | String |  |  | nullable |
| 79 | receievInvoiceMobile | 收票手机号 | receievInvoiceMobile | text | String |  |  | nullable |
| 80 | receievInvoiceEmail | 收票邮箱 | receievInvoiceEmail | text | String |  |  | nullable |
| 81 | settlementVersion | 结算单版本 | settlementVersion | int | Integer |  |  | nullable |
| 82 | agentName | 客户名称 | cAgentName | text | String |  |  | nullable |
| 83 | closer | 关闭人 | closer | text | String |  |  | nullable |
| 84 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 85 | exchRateOps | 汇率折算方式 | exchRateOps | singleOption | unitfyEnum.GZTBDM.ExchangeRateMethod |  |  | nullable |
| 86 | headFreeItem | 销售结算表头自由自定义项 | - | - | voucher.settlement.SettlementFreeItem |  |  |  |
| 87 | headItem | 销售结算表头自定义项 | - | - | voucher.settlement.SettlementCustomItem |  |  |  |
| 88 | invAgentName | 开票客户名称 | cInvAgentName | text | String |  |  | nullable |
| 89 | orgName | 开票组织名称 | cOrgName | text | String |  |  | nullable |
| 90 | settlementDetails | 销售结算单子表 | - | - | voucher.settlement.SettlementDetail |  |  |  |
| 91 | srcVouchDate | 来源单据日期 | srcVouchDate | date | Date |  |  | nullable |
| 92 | taxSettingType | 计税方式 | taxSettingType | short | Short |  |  | nullable |
| 93 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (18)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditorId | 审核人ID | iAuditorId | base.user.User |
| 2 | creatorId | 创建人ID | iCreatorId | base.user.User |
| 3 | modifierId | 修改人id | iModifierId | base.user.User |
| 4 | sourceTransTypeId | 来源单据交易类型 | sourceTransTypeId | bd.bill.TransType |
| 5 | orgId | 开票组织id | iOrgid | org.func.FinanceOrg |
| 6 | invoiceTransactionType | 发票交易类型id | invoiceTransactionType | bd.bill.TransType |
| 7 | agentId | 客户id | iAgentId | aa.merchant.Merchant |
| 8 | saleAreaId | 销售区域id | iSaleAreaId | aa.salearea.SaleArea |
| 9 | receiverCustId | 收货客户id | iReceiverCust | aa.merchant.Merchant |
| 10 | currency | 币种id | cCurrencyId | bd.currencytenant.CurrencyTenantVO |
| 11 | natCurrency | 本币id | natCurrencyId | bd.currencytenant.CurrencyTenantVO |
| 12 | exchangeRateType | 汇率类型id | cExchangeRateTypeId | bd.exchangeRate.ExchangeRateTypeVO |
| 13 | bdInvoiceTypeId | 发票类型id | bdInvoiceTypeId | bd.invoice.InvoiceTypeVO |
| 14 | custId | 伙伴id | iCustomerId | aa.merchant.Merchant |
| 15 | agentRelationId | 客户交易关系id | iAgentRelationId | aa.merchant.MerchantApplyRange |
| 16 | bizFlow | 流程 | bizFlowId | bf.bizflow.BusinessFlow |
| 17 | invAgentId | 开票客户id | iInvAgentId | aa.merchant.Merchant |
| 18 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | exchRateOps | 汇率折算方式 | exchRateOps | ExchangeRateMethod |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | settlementDetails | 销售结算单子表 | voucher.settlement.SettlementDetail |
| 2 | headFreeItem | 销售结算表头自由自定义项 | voucher.settlement.SettlementFreeItem |
| 3 | headItem | 销售结算表头自定义项 | voucher.settlement.SettlementCustomItem |

---

## Enum Value Details

### 汇率折算方式 (exchRateOps) -> exchRateOps
> Enum: unitfyEnum.GZTBDM.ExchangeRateMethod

| code | value | name |
|------|-------|------|
| 1 | 1 | * |
| 2 | 2 | / |
