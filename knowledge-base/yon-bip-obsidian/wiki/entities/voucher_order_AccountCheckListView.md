---
tags: [BIP, metadata, voucher, AccountCheckListView]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户往来对账表 (voucher.order.AccountCheckListView)

> Platform: BIP V5 | Module: voucher | Table:  | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 客户往来对账表 |
| uri | voucher.order.AccountCheckListView |
| tableName |  |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | ? |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (118)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | accountCheck | 客户往来对账表表体 | - | - | voucher.order.AccountCheckView |  |  |  |
| 2 | agentId | 客户id | iAgentId | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 3 | agentProductCode | 客户商品编码 | cAgentProductCode | text | String |  |  | nullable |
| 4 | agentProductId | 客户商品对照ID | agentProductId | quote | sa.agent.AgentProductRelation |  |  | nullable |
| 5 | agentProductName | 客户商品名称 | cAgentProductName | text | String |  |  | nullable |
| 6 | agentSkuCode | 客户商品SKU编码 | cAgentSkuCode | text | String |  |  | nullable |
| 7 | agentSkuName | 客户商品SKU名称 | cAgentSkuName | text | String |  |  | nullable |
| 8 | billId | 单据id | billId | long | Long |  |  | nullable |
| 9 | billnum | 单据标识 | billnum | text | String |  |  | nullable |
| 10 | bodyMemo | 表体备注 | cBodyMemo | text | String |  |  | nullable |
| 11 | code | 单据号 | cCode | text | String |  |  | nullable |
| 12 | corpContact | 销售业务员 | iCorpContactId | quote | bd.staff.Staff |  |  | data_auth,nullable |
| 13 | createDate | 单据日期 | dCreateDate | date | Date |  |  | nullable |
| 14 | currency | 原币主键 | cOriginalPk | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 15 | deliveryDetailId | 销售发货行ID | deliveryDetailId | quote | voucher.delivery.DeliveryDetail |  |  | nullable |
| 16 | domainKey | 领域标识 | domainKey | text | String |  |  | nullable |
| 17 | expensePrice | 费用金额 | fExpensePrice | number | Decimal |  |  | nullable |
| 18 | headCharacter | 表头自定义项特征属性组 | headCharacter | UserDefine | voucher.order.AccountCheckHeadDefineCharacter |  |  | nullable |
| 19 | headDefine1 | 表头自定义项1 | headDefine1 | text | String |  |  | nullable |
| 20 | headDefine10 | 表头自定义项10 | headDefine10 | text | String |  |  | nullable |
| 21 | headDefine11 | 表头自定义项11 | headDefine11 | text | String |  |  | nullable |
| 22 | headDefine12 | 表头自定义项12 | headDefine12 | text | String |  |  | nullable |
| 23 | headDefine13 | 表头自定义项13 | headDefine13 | text | String |  |  | nullable |
| 24 | headDefine14 | 表头自定义项14 | headDefine14 | text | String |  |  | nullable |
| 25 | headDefine15 | 表头自定义项15 | headDefine15 | text | String |  |  | nullable |
| 26 | headDefine16 | 表头自定义项16 | headDefine16 | text | String |  |  | nullable |
| 27 | headDefine17 | 表头自定义项17 | headDefine17 | text | String |  |  | nullable |
| 28 | headDefine18 | 表头自定义项18 | headDefine18 | text | String |  |  | nullable |
| 29 | headDefine19 | 表头自定义项19 | headDefine19 | text | String |  |  | nullable |
| 30 | headDefine2 | 表头自定义项2 | headDefine2 | text | String |  |  | nullable |
| 31 | headDefine20 | 表头自定义项20 | headDefine20 | text | String |  |  | nullable |
| 32 | headDefine21 | 表头自定义项21 | headDefine21 | text | String |  |  | nullable |
| 33 | headDefine22 | 表头自定义项22 | headDefine22 | text | String |  |  | nullable |
| 34 | headDefine23 | 表头自定义项23 | headDefine23 | text | String |  |  | nullable |
| 35 | headDefine24 | 表头自定义项24 | headDefine24 | text | String |  |  | nullable |
| 36 | headDefine25 | 表头自定义项25 | headDefine25 | text | String |  |  | nullable |
| 37 | headDefine26 | 表头自定义项26 | headDefine26 | text | String |  |  | nullable |
| 38 | headDefine27 | 表头自定义项27 | headDefine27 | text | String |  |  | nullable |
| 39 | headDefine28 | 表头自定义项28 | headDefine28 | text | String |  |  | nullable |
| 40 | headDefine29 | 表头自定义项29 | headDefine29 | text | String |  |  | nullable |
| 41 | headDefine3 | 表头自定义项3 | headDefine3 | text | String |  |  | nullable |
| 42 | headDefine30 | 表头自定义项30 | headDefine30 | text | String |  |  | nullable |
| 43 | headDefine31 | 表头自定义项31 | headDefine31 | text | String |  |  | nullable |
| 44 | headDefine32 | 表头自定义项32 | headDefine32 | text | String |  |  | nullable |
| 45 | headDefine33 | 表头自定义项33 | headDefine33 | text | String |  |  | nullable |
| 46 | headDefine34 | 表头自定义项34 | headDefine34 | text | String |  |  | nullable |
| 47 | headDefine35 | 表头自定义项35 | headDefine35 | text | String |  |  | nullable |
| 48 | headDefine36 | 表头自定义项36 | headDefine36 | text | String |  |  | nullable |
| 49 | headDefine37 | 表头自定义项37 | headDefine37 | text | String |  |  | nullable |
| 50 | headDefine38 | 表头自定义项38 | headDefine38 | text | String |  |  | nullable |
| 51 | headDefine39 | 表头自定义项39 | headDefine39 | text | String |  |  | nullable |
| 52 | headDefine4 | 表头自定义项4 | headDefine4 | text | String |  |  | nullable |
| 53 | headDefine40 | 表头自定义项40 | headDefine40 | text | String |  |  | nullable |
| 54 | headDefine41 | 表头自定义项41 | headDefine41 | text | String |  |  | nullable |
| 55 | headDefine42 | 表头自定义项42 | headDefine42 | text | String |  |  | nullable |
| 56 | headDefine43 | 表头自定义项43 | headDefine43 | text | String |  |  | nullable |
| 57 | headDefine44 | 表头自定义项44 | headDefine44 | text | String |  |  | nullable |
| 58 | headDefine45 | 表头自定义项45 | headDefine45 | text | String |  |  | nullable |
| 59 | headDefine46 | 表头自定义项46 | headDefine46 | text | String |  |  | nullable |
| 60 | headDefine47 | 表头自定义项47 | headDefine47 | text | String |  |  | nullable |
| 61 | headDefine48 | 表头自定义项48 | headDefine48 | text | String |  |  | nullable |
| 62 | headDefine49 | 表头自定义项49 | headDefine49 | text | String |  |  | nullable |
| 63 | headDefine5 | 表头自定义项5 | headDefine5 | text | String |  |  | nullable |
| 64 | headDefine50 | 表头自定义项50 | headDefine50 | text | String |  |  | nullable |
| 65 | headDefine51 | 表头自定义项51 | headDefine51 | text | String |  |  | nullable |
| 66 | headDefine52 | 表头自定义项52 | headDefine52 | text | String |  |  | nullable |
| 67 | headDefine53 | 表头自定义项53 | headDefine53 | text | String |  |  | nullable |
| 68 | headDefine54 | 表头自定义项54 | headDefine54 | text | String |  |  | nullable |
| 69 | headDefine55 | 表头自定义项55 | headDefine55 | text | String |  |  | nullable |
| 70 | headDefine56 | 表头自定义项56 | headDefine56 | text | String |  |  | nullable |
| 71 | headDefine57 | 表头自定义项57 | headDefine57 | text | String |  |  | nullable |
| 72 | headDefine58 | 表头自定义项58 | headDefine58 | text | String |  |  | nullable |
| 73 | headDefine59 | 表头自定义项59 | headDefine59 | text | String |  |  | nullable |
| 74 | headDefine6 | 表头自定义项6 | headDefine6 | text | String |  |  | nullable |
| 75 | headDefine60 | 表头自定义项60 | headDefine60 | text | String |  |  | nullable |
| 76 | headDefine7 | 表头自定义项7 | headDefine7 | text | String |  |  | nullable |
| 77 | headDefine8 | 表头自定义项8 | headDefine8 | text | String |  |  | nullable |
| 78 | headDefine9 | 表头自定义项9 | headDefine9 | text | String |  |  | nullable |
| 79 | headMemo | 表头备注 | cHeadMemo | text | String |  |  | nullable |
| 80 | iCorpId | 企业id | iCorpId | long | Long |  |  | nullable |
| 81 | iProductUnitId | 计价单位 | iProductUnitId | quote | pc.unit.Unit |  |  | nullable |
| 82 | id | 行id | id | long | Long |  |  | nullable |
| 83 | invoiceNo | 发票号 | cInvoiceNo | text | String |  |  | nullable |
| 84 | invoiceVouchDate | 发票单据日期 | saleinvoice_vouchdate | date | Date |  |  | nullable |
| 85 | merchantAuth | 客户权限 | iAgentId | quote | pb.dataauth.MerchantAuthDataAuth |  |  | nullable |
| 86 | orderColumn | 排序字段(仅用于排序) | cOrderColumn | text | String |  |  | nullable |
| 87 | orderDetailId | 销售订单行ID | orderDetailId | quote | voucher.order.OrderDetail |  |  | nullable |
| 88 | originalName | 币种 | cOriginalName | text | String |  |  | nullable |
| 89 | payTotalMoney | 预付款余额 | fPayTotalMoney | number | Decimal |  |  | nullable |
| 90 | paymentPrice | 支付单金额 | fPaymentPrice | number | Decimal |  |  | nullable |
| 91 | price | 金额 | fPrice | number | Decimal |  |  | nullable |
| 92 | priceQty | 计价数量 | iQuantity | number | Decimal |  |  | nullable |
| 93 | productAuth | 物料权限 | iProductId | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 94 | productCode | 商品编码 | cProductCode | text | String |  |  | nullable |
| 95 | productId | 商品id | iProductId | quote | pc.product.Product |  |  | data_auth,nullable |
| 96 | productName | 商品名称 | cProductName | text | String |  |  | nullable |
| 97 | productUnitName | 计价单位名称 | cProductUnitName | text | String |  |  | nullable |
| 98 | projectId | 项目projectId | cProjectId | quote | bd.project.ProjectVO |  |  | data_auth,nullable |
| 99 | pubts_view | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable |
| 100 | quickType | 款项类型 | quickType | quote | bd.paymenttype.PaymentTypeVO |  |  | nullable |
| 101 | rebatePrice | 返利余额 | fRebatePrice | number | Decimal |  |  | nullable |
| 102 | rebateToCashPrice | 返利抵现金额 | fRebateToCashPrice | number | Decimal |  |  | nullable |
| 103 | receiveAbleMoney | 应收款余额 | fReceiveAbleMoney | number | Decimal |  |  | nullable |
| 104 | receiveMoney | 应收余额 | fReceiveMoney | number | Decimal |  |  | nullable |
| 105 | refundPrice | 退款金额 | fRefundPrice | number | Decimal |  |  | nullable |
| 106 | saleDepartmentId | 销售部门id | iSaleDepartmentId | quote | bd.adminOrg.DeptOrgVO |  |  | data_auth,nullable |
| 107 | saleReturnPrice | 退货金额 | fSaleReturnPrice | number | Decimal |  |  | nullable |
| 108 | saleinvoiceDetailId | 销售发票行ID | saleinvoiceDetailId | quote | voucher.invoice.SaleInvoiceDetail |  |  | nullable |
| 109 | salereturnDetailId | 销售退货行ID | salereturnDetailId | quote | voucher.salereturn.SaleReturnDetail |  |  | nullable |
| 110 | salesOrgId | 销售组织 | iSalesOrgId | quote | org.func.SalesOrg |  |  | nullable |
| 111 | salesOutsDetailId | 销售出库行ID | salesOutsDetailId | quote | st.salesout.SalesOuts |  |  | nullable |
| 112 | settlementOrgId | 财务组织id | iInvoiceOrgId | quote | org.func.FinanceOrg |  |  | nullable |
| 113 | skuCode | sku编码 | cSkuCode | text | String |  |  | nullable |
| 114 | specDescription | 规格描述 | cSpecDescription | text | String |  |  | nullable |
| 115 | transactionPrice | 含税单价 | fTransactionPrice | number | Decimal |  |  | nullable |
| 116 | transactionTypeId | 交易类型id | iTransactionTypeId | quote | bd.bill.TransType |  |  | nullable |
| 117 | vouchDate | 单据日期 | dVouchDate | date | Date |  |  | nullable |
| 118 | vouchType | 单据类型 | cVouchType | text | String |  |  | nullable |

---

## Reference Fields (19)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | agentId | 客户id | iAgentId | aa.merchant.Merchant |
| 2 | agentProductId | 客户商品对照ID | agentProductId | sa.agent.AgentProductRelation |
| 3 | corpContact | 销售业务员 | iCorpContactId | bd.staff.Staff |
| 4 | currency | 原币主键 | cOriginalPk | bd.currencytenant.CurrencyTenantVO |
| 5 | deliveryDetailId | 销售发货行ID | deliveryDetailId | voucher.delivery.DeliveryDetail |
| 6 | iProductUnitId | 计价单位 | iProductUnitId | pc.unit.Unit |
| 7 | merchantAuth | 客户权限 | iAgentId | pb.dataauth.MerchantAuthDataAuth |
| 8 | orderDetailId | 销售订单行ID | orderDetailId | voucher.order.OrderDetail |
| 9 | productAuth | 物料权限 | iProductId | pb.dataauth.ProductDataAuth |
| 10 | productId | 商品id | iProductId | pc.product.Product |
| 11 | projectId | 项目projectId | cProjectId | bd.project.ProjectVO |
| 12 | quickType | 款项类型 | quickType | bd.paymenttype.PaymentTypeVO |
| 13 | saleDepartmentId | 销售部门id | iSaleDepartmentId | bd.adminOrg.DeptOrgVO |
| 14 | saleinvoiceDetailId | 销售发票行ID | saleinvoiceDetailId | voucher.invoice.SaleInvoiceDetail |
| 15 | salereturnDetailId | 销售退货行ID | salereturnDetailId | voucher.salereturn.SaleReturnDetail |
| 16 | salesOrgId | 销售组织 | iSalesOrgId | org.func.SalesOrg |
| 17 | salesOutsDetailId | 销售出库行ID | salesOutsDetailId | st.salesout.SalesOuts |
| 18 | settlementOrgId | 财务组织id | iInvoiceOrgId | org.func.FinanceOrg |
| 19 | transactionTypeId | 交易类型id | iTransactionTypeId | bd.bill.TransType |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | accountCheck | 客户往来对账表表体 | voucher.order.AccountCheckView |
