---
tags: [BIP, metadata, voucher, SaleReturn]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 退货单 (voucher.salereturn.SaleReturn)

> Platform: BIP V5 | Module: voucher | Table: salereturn | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 退货单 |
| uri | voucher.salereturn.SaleReturn |
| tableName | salereturn |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderVouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (15)

| # | Name | URI |
|---|------|-----|
| 1 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 2 | 逻辑删除相关 (Deletable) | base.itf.Deletable |
| 3 | 币种信息 (ICurrency) | voucher.base.ICurrency |
| 4 | 应付金额 (IRealMoney) | uorder.voucher.IRealMoney |
| 5 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 6 | 商家相关 (IShop) | base.itf.IShop |
| 7 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 8 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 9 | 客户Id (IAgentId) | uorder.voucher.IAgentId |
| 10 | 交换信息 (IExchangeInfo) | gscm.itf.IExchangeInfo |
| 11 | 计税方式接口 (ITaxSettingType) | sale.aa.ITaxSettingType |
| 12 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 13 | 审批提交信息 (ISubmitInfo) | ucfbase.ucfbaseItf.ISubmitInfo |
| 14 | 贸易路径Id接口 (ITradeRouteID) | sccs.multitrade.ITradeRouteID |
| 15 | 汇率信息 (IExchangeRate) | voucher.base.IExchangeRate |

---

## All Fields (169)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bdInvoiceTypeId | 发票类型 | bdInvoiceTypeId | quote | bd.invoice.InvoiceTypeVO |  |  | nullable |
| 2 | custId | 伙伴 | iCustomerId | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 3 | deliverier | 发货人 | cDeliverier | text | String |  |  | nullable |
| 4 | deliverierId | 发货人 | iDeliverier | quote | aa.merchant.AddressInfo |  |  | nullable |
| 5 | deliveryAddress | 退货地址 | iDeliveryAddress | text | String |  |  | nullable |
| 6 | deliveryCustId | 退货客户 | iDeliveryCust | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 7 | deliveryMobile | 发货人电话 | iDeliveryMobile | text | String |  |  | nullable |
| 8 | deliveryTelePhone | 发货人固定电话 | iDeliveryTelePhone | text | String |  |  | nullable |
| 9 | exchRateDate | 汇率日期 | exchRateDate | date | Date |  |  | nullable |
| 10 | isDespatch | 启用发运管理 | isDespatch | switch | Boolean |  |  | nullable |
| 11 | saleAreaId | 销售区域 | iSaleAreaId | quote | aa.salearea.SaleArea |  |  | data_auth,nullable |
| 12 | salereturnDefineCharacter | 自定义项特征属性组 | salereturnDefineCharacter | UserDefine | voucher.salereturn.SaleReturnDefineCharacter |  |  | nullable |
| 13 | shippingChoiceId | 发运方式id | cShippingChoiceId | quote | aa.sendtrans.SendTransWay |  |  | nullable |
| 14 | startAreaId | 始发地运输区域 | startAreaId | quote | base.shipregion.ShipRegion |  |  | nullable |
| 15 | returnStatus | 退货状态 | cReturnStatus | text | String |  |  | nullable |
| 16 | confirmUser | 确认人 | cConfirmUser | text | String |  |  | nullable |
| 17 | exchRateOps | 汇率折算方式 | exchRateOps | singleOption | unitfyEnum.GZTBDM.ExchangeRateMethod |  |  | nullable |
| 18 | coDirectShipmentReturn | 直运退货协同 | codirectshipmentreturn | text | String |  |  | nullable |
| 19 | isEndTrade | 是否末级 | isEndTrade | short | Short |  |  | nullable |
| 20 | tradeRouteID | 贸易路径Id | tradeRouteID | quote | sccs.multitrade.TradeRoute |  |  | nullable |
| 21 | tradeRouteLineno | 站点 | tradeRouteLineno | number | Decimal |  |  | nullable |
| 22 | throwStatus | 抛单状态 | throw_status | int | Integer |  |  | nullable |
| 23 | submitTime | 提交时间 | submit_time | dateTime | Timestamp |  |  | nullable |
| 24 | submitter | 提交人 | submitter | quote | base.user.BipUser |  |  | nullable |
| 25 | withdrawTime | 撤回提交时间 | withdraw_time | dateTime | Timestamp |  |  | nullable |
| 26 | withdrawpp | 撤回提交的人 | withdrawpp | quote | base.user.BipUser |  |  | nullable |
| 27 | bSynSettlement | 是否同步待结算 | bSynSettlement | switch | Boolean |  |  | nullable |
| 28 | corpContactUserName | 业务员姓名 | cCorpContactUserName | text | String |  |  | nullable |
| 29 | receievInvoiceEmail | 收票邮箱 | receievinvoiceemail | text | String |  |  | nullable |
| 30 | wholeFavorableRate | 整单倒扣 | fWholeFavorableRate | number | Decimal |  |  | nullable |
| 31 | taxSettingType | 计税方式 | taxSettingType | short | Short |  |  | nullable |
| 32 | settlementVersion | 销售结算单版本 | settlementVersion | int | Integer |  |  | nullable |
| 33 | transactionTypeId_name | 交易类型 | transactionTypeId_name | text | String |  |  | nullable |
| 34 | billBusinessType | 业务类型 | billBusinessType | short | Short |  |  | nullable |
| 35 | receievInvoiceMobile | 收票手机号 | receievinvoicemobile | text | String |  |  | nullable |
| 36 | deliverTime | 出库时点 | cDeliverTime | text | String |  |  | nullable |
| 37 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 38 | salesOrgId | 销售组织 | iSalesOrgId | quote | org.func.SalesOrg |  |  | data_auth,isMasterOrg,nullable |
| 39 | transactionTypeId | 交易类型 | iTransactionTypeId | quote | bd.bill.TransType |  |  | data_auth,isTransactionType,nullable |
| 40 | vouchdate | 单据日期 | vouchdate | date | Date | Y |  | nullable |
| 41 | code | 单据编号 | cSaleReturnNo | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 42 | orderNo | 订单号 | cOrderNo | text | String |  |  | nullable |
| 43 | agentId | 客户 | iAgentId | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 44 | retailAgentName | 散户名称 | cRetailAgentName | text | String |  |  | nullable |
| 45 | saleDepartmentId | 销售部门id | iSaleDepartmentId | quote | bd.adminOrg.DeptOrgVO |  |  | data_auth,nullable |
| 46 | corpContact | 销售业务员 | iCorpContactId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 47 | settlementOrgId | 财务组织id | iSettlementOrgId | quote | org.func.FinanceOrg |  |  | nullable |
| 48 | currency | 原币pk | iCurrencyID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 49 | currencyCode | 原币简称 | currencyCode | text | String |  |  | nullable |
| 50 | currencyName | 币种 | currencyName | text | String |  |  | nullable |
| 51 | exchRate | 汇率 | exchRate | number | Decimal |  |  | nullable |
| 52 | natCurrency | 本币pk | iNatCurrencyID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 53 | natCurrencyCode | 本币简称 | natCurrencyCode | text | String |  |  | nullable |
| 54 | natCurrencyName | 本币 | natCurrencyName | text | String |  |  | nullable |
| 55 | taxInclusive | 单价含税 | bTaxInclusive | switch | Boolean |  |  | nullable |
| 56 | saleReturnStatus | 单据状态 | cSaleReturnStatus | text | String |  |  | nullable |
| 57 | saleReturnSourceType | 退货类型 | cSaleReturnSourceType | text | String |  |  | nullable |
| 58 | bizId | 供应商id | iBizId | long | Long |  |  | nullable |
| 59 | bizName | 供应商名称 | cBizName | text | String |  |  | nullable |
| 60 | agentRelationId | 客户交易关系id | iAgentRelationId | quote | aa.merchant.MerchantApplyRange |  |  | nullable |
| 61 | refundStatus | 退货单退款状态 | cRefundStatus | text | String |  |  | nullable |
| 62 | opposeMemo | 批注 | cOpposeMemo | text | String |  |  | nullable |
| 63 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 64 | creatorId | 制单人 | iSubmitUserId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 65 | creator | 制单人 | cCreator | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 66 | createTime | 创建时间 | dCreatedTime | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 67 | modifierId | 修改人id | iModifierId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 68 | modifier | 修改人 | cModifier | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 69 | modifyTime | 修改时间 | dModifyTime | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 70 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 71 | confirmUserId | 审核人id | iConfirmUserId | long | Long |  |  | nullable |
| 72 | auditor | 审核人 | auditor | text | String |  |  | isGlobalization,nullable |
| 73 | auditTime | 审核时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 74 | source | API来源 | cSource | text | String |  |  | isMakeBill,nullable |
| 75 | refundAmount | 退款金额 | fRefundAmount | number | Decimal |  |  | nullable |
| 76 | isWfControlled | 是否受审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 77 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 78 | status | 单据状态 | status | short | Short |  |  | nullable |
| 79 | logisticWayId | 物流公司id | iLogisticWayId | quote | aa.deliverycorp.Deliverycorp |  |  | nullable |
| 80 | logisticsBillNo | 物流单号 | cLogisticsBillNo | text | String |  |  | nullable |
| 81 | logisticsUserName | 司机姓名 | cLogisticsUserName | text | String |  |  | nullable |
| 82 | logisticsUserPhone | 司机电话 | cLogisticsUserPhone | text | String |  |  | nullable |
| 83 | logisticsCarNum | 车牌号 | cLogisticsCarNum | text | String |  |  | nullable |
| 84 | receiver | 收货人 | cReceiver | text | String |  |  | nullable |
| 85 | receiveMobile | 收货人移动电话 | cReceiveMobile | text | String |  |  | nullable |
| 86 | receiveTelePhone | 收货人固定电话 | cReceiveTelePhone | text | String |  |  | nullable |
| 87 | receiveAddress | 收货地址 | cReceiveAddress | text | String |  |  | nullable |
| 88 | receiveZipCode | 收货人邮编 | cReceiveZipCode | text | String |  |  | nullable |
| 89 | invoiceAgentId | 开票客户id | iInvoiceAgentId | quote | aa.merchant.Merchant |  |  | nullable |
| 90 | modifyInvoiceType | 发票类型是否可改 | bModifyInvoiceType | switch | Boolean |  |  | nullable |
| 91 | invoiceUpcType | 发票类型 | iInvoiceUpcType | short | Short |  |  | nullable |
| 92 | invoiceTitleType | 抬头类型 | iInvoiceTitleType | - | aa.merchant.EnterpriseNature |  |  | nullable |
| 93 | invoiceTitle | 发票抬头 | cInvoiceTitle | text | String |  |  | nullable |
| 94 | taxNum | 纳税识别号 | cTaxNum | text | String |  |  | nullable |
| 95 | bankName | 开户银行 | cBankName | text | String |  |  | nullable |
| 96 | subBankName | 开户支行 | cSubBankName | text | String |  |  | nullable |
| 97 | bankAccount | 账号 | cBankAccount | text | String |  |  | nullable |
| 98 | invoiceTelephone | 营业电话 | cInvoiceTelephone | text | String |  |  | nullable |
| 99 | invoiceAddress | 营业地址 | cInvoiceAddress | text | String |  |  | nullable |
| 100 | totalMoney | 总金额 | fTotalMoney | number | Decimal |  |  | nullable |
| 101 | rebateToOrderMoney | 整单返利金额 | fRebateToOrderMoney | number | Decimal |  |  | nullable |
| 102 | rebateToCashMoney | 抵现返利金额 | fRebateToCashMoney | number | Decimal |  |  | nullable |
| 103 | payMoney | 退货金额 | fPayMoney | number | Decimal |  |  | nullable |
| 104 | totalMoneyOrigTaxfree | 无税总金额 | fTotalMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 105 | rebateToOrderMoneyOrigTaxfree | 无税整单返利金额 | fRebateToOrderMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 106 | rebateToCashMoneyOrigTaxfree | 无税抵现返利金额 | fRebateToCashMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 107 | payMoneyOrigTaxfree | 无税退货金额 | fPayMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 108 | totalMoneyDomestic | 本币总金额 | fTotalMoney_domestic | number | Decimal |  |  | nullable |
| 109 | rebateToOrderMoneyDomestic | 本币含税整单返利金额 | fRebateToOrderMoney_domestic | number | Decimal |  |  | nullable |
| 110 | rebateToCashMoneyDomestic | 本币含税抵现返利金额 | fRebateToCashMoney_domestic | number | Decimal |  |  | nullable |
| 111 | payMoneyDomestic | 本币退货金额 | fPayMoney_domestic | number | Decimal |  |  | nullable |
| 112 | totalMoneyDomesticTaxfree | 本币无税总金额 | fTotalMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 113 | rebateToOrderMoneyDomesticTaxfree | 本币无税整单返利金额 | fRebateToOrderMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 114 | rebateToCashMoneyDomesticTaxfree | 本币无税抵现返利金额 | fRebateToCashMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 115 | payMoneyDomesticTaxfree | 本币无税退货金额 | fPayMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 116 | totalOriTax | 税额 | fTotalOriTax | number | Decimal |  |  | nullable |
| 117 | totalNatTax | 本币税额 | fTotalNatTax | number | Decimal |  |  | nullable |
| 118 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 119 | exchangeRateType | 汇率类型Id | cExchangeRateTypeId | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 120 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 121 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 122 | returnStore | 客户退货门店Id | iReturnStore | quote | aa.store.Store |  |  | nullable |
| 123 | receiveId | 客户发货地址Id | iReceiveId | long | Long |  |  | nullable |
| 124 | realMoney | 应付金额 | fRealMoney | number | Decimal |  |  | nullable |
| 125 | stockAccount | 发出商品 | iStockAccount | text | String |  |  | nullable |
| 126 | offerSaleCost | 报价含税金额 | fOfferSaleCost | number | Decimal |  |  | nullable |
| 127 | wholeDiscountRate | 整单扣率% | fWholeDiscountRate | number | Decimal |  |  | nullable |
| 128 | wholeDiscountMoney | 整单扣额 | fWholeDiscountMoney | number | Decimal |  |  | nullable |
| 129 | exchangeStatus | 交换状态 | exchangeStatus | short | Short |  |  | nullable |
| 130 | failedInfo | 交换失败原因 | failedInfo | text | String |  |  | nullable |
| 131 | originalOrderSupplyAgain | 是否原单补货 | originalOrderSupplyAgain | switch | Boolean |  |  | nullable |
| 132 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 133 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 134 | isDeleted | 是否删除 | iDeleted | short | Short |  | Y | nullable |
| 135 | id | id | id | long | Long |  |  | nullable,REF.ID |
| 136 | reasonId | 退货原因ID | iReasonId | quote | aa.reason.Reason |  |  | nullable |
| 137 | saleReturnReason | 退货原因 | cSaleReturnReason | text | String |  |  | nullable |
| 138 | erpSynStatus | ERP同步状态 | iErpSynStatus | text | String |  |  | nullable |
| 139 | erpSynFailInfo | ERP同步失败原因 | iErpSynFailInfo | text | String |  |  | nullable |
| 140 | erpSynStatusCode | ERP同步状态编码 | iErpSynStatusCode | text | String |  |  | nullable |
| 141 | refundConfirmMoney | 退款已确认金额 | fRefundConfirmMoney | number | Decimal |  |  | nullable |
| 142 | refundUnConfirmMoney | 退款待确认金额 | fRefundUnConfirmMoney | number | Decimal |  |  | nullable |
| 143 | saleOrgCode | saleOrgCode | saleOrgCode | text | String |  |  | nullable |
| 144 | tplid | 模板id | tplid | long | Long |  |  | nullable |
| 145 | reasonMark | 退货原因-废弃 | reasonMark | text | String |  |  | nullable |
| 146 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 147 | invoiceType | 发票类型 | cInvoiceType | text | String |  |  | nullable |
| 148 | shop | 商家 | iShopID | long | Long |  | Y | nullable,reportHide |
| 149 | saleReturnCreateDate | 创建日期 | create_date | date | Date |  |  | nullable |
| 150 | saleReturnMemoId | 退货原因_id | iSaleReturnMemoId | long | Long |  |  | nullable |
| 151 | confirmDate | 确认时间 | dConfirmDate | timestamp | Timestamp |  |  | nullable |
| 152 | contactOutSysKey | 专管业务员 | contactOutSysKey | text | String |  |  | nullable |
| 153 | auditorId | 审核人ID | auditorId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 154 | invoiceMoney | 发票金额 | iInvoiceMoney | number | Decimal |  |  | nullable |
| 155 | openAuxUnit | 是否开启辅助计量单位 | openAuxUnit | switch | Boolean |  |  | nullable |
| 156 | statusName | 状态名称 | statusName | text | String |  |  | nullable |
| 157 | createDate | 创建日期 | dCreatedDate | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 158 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 159 | merchantAuth | 客户权限 | iAgentId | quote | pb.dataauth.MerchantAuthDataAuth |  |  | nullable |
| 160 | createSource | API来源 | cCreateSource | short | Short |  |  | nullable |
| 161 | orderTime | 订货时间 | orderTime | date | Date |  |  | nullable |
| 162 | headFreeItem | 退货单表头自由自定义项 | - | - | voucher.salereturn.SaleReturnFreeDefine |  |  |  |
| 163 | headItem | 退货单表头自定义项 | - | - | voucher.salereturn.SaleReturnDefine |  |  |  |
| 164 | iBpmCurrentAuditor | 当前审批人 | - | - | voucher.salereturn.IBpmCurrentAuditor |  |  |  |
| 165 | iBpmStep | 当前业务阶段 | - | - | voucher.salereturn.IBpmStep |  |  |  |
| 166 | saleReturnAttachments | 退货附件 | - | - | voucher.salereturn.SaleReturnAttachment |  |  |  |
| 167 | saleReturnDetails | 退货单详情 | - | - | voucher.salereturn.SaleReturnDetail |  |  |  |
| 168 | saleReturnMemo | 订单备注 | - | - | voucher.salereturn.VoucherMemo |  |  |  |
| 169 | saleReturnPrices | 退货单单价 | - | - | voucher.salereturn.SaleReturnPrice |  |  |  |

---

## Reference Fields (30)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | bdInvoiceTypeId | 发票类型 | bdInvoiceTypeId | bd.invoice.InvoiceTypeVO |
| 2 | custId | 伙伴 | iCustomerId | aa.merchant.Merchant |
| 3 | deliverierId | 发货人 | iDeliverier | aa.merchant.AddressInfo |
| 4 | deliveryCustId | 退货客户 | iDeliveryCust | aa.merchant.Merchant |
| 5 | saleAreaId | 销售区域 | iSaleAreaId | aa.salearea.SaleArea |
| 6 | shippingChoiceId | 发运方式id | cShippingChoiceId | aa.sendtrans.SendTransWay |
| 7 | startAreaId | 始发地运输区域 | startAreaId | base.shipregion.ShipRegion |
| 8 | tradeRouteID | 贸易路径Id | tradeRouteID | sccs.multitrade.TradeRoute |
| 9 | submitter | 提交人 | submitter | base.user.BipUser |
| 10 | withdrawpp | 撤回提交的人 | withdrawpp | base.user.BipUser |
| 11 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 12 | salesOrgId | 销售组织 | iSalesOrgId | org.func.SalesOrg |
| 13 | transactionTypeId | 交易类型 | iTransactionTypeId | bd.bill.TransType |
| 14 | agentId | 客户 | iAgentId | aa.merchant.Merchant |
| 15 | saleDepartmentId | 销售部门id | iSaleDepartmentId | bd.adminOrg.DeptOrgVO |
| 16 | corpContact | 销售业务员 | iCorpContactId | bd.staff.Staff |
| 17 | settlementOrgId | 财务组织id | iSettlementOrgId | org.func.FinanceOrg |
| 18 | currency | 原币pk | iCurrencyID | bd.currencytenant.CurrencyTenantVO |
| 19 | natCurrency | 本币pk | iNatCurrencyID | bd.currencytenant.CurrencyTenantVO |
| 20 | agentRelationId | 客户交易关系id | iAgentRelationId | aa.merchant.MerchantApplyRange |
| 21 | creatorId | 制单人 | iSubmitUserId | base.user.User |
| 22 | modifierId | 修改人id | iModifierId | base.user.User |
| 23 | logisticWayId | 物流公司id | iLogisticWayId | aa.deliverycorp.Deliverycorp |
| 24 | invoiceAgentId | 开票客户id | iInvoiceAgentId | aa.merchant.Merchant |
| 25 | exchangeRateType | 汇率类型Id | cExchangeRateTypeId | bd.exchangeRate.ExchangeRateTypeVO |
| 26 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 27 | returnStore | 客户退货门店Id | iReturnStore | aa.store.Store |
| 28 | reasonId | 退货原因ID | iReasonId | aa.reason.Reason |
| 29 | auditorId | 审核人ID | auditorId | base.user.User |
| 30 | merchantAuth | 客户权限 | iAgentId | pb.dataauth.MerchantAuthDataAuth |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | exchRateOps | 汇率折算方式 | exchRateOps | ExchangeRateMethod |

---

## Child Tables (8)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | saleReturnMemo | 订单备注 | voucher.salereturn.VoucherMemo |
| 2 | headFreeItem | 退货单表头自由自定义项 | voucher.salereturn.SaleReturnFreeDefine |
| 3 | saleReturnDetails | 退货单详情 | voucher.salereturn.SaleReturnDetail |
| 4 | headItem | 退货单表头自定义项 | voucher.salereturn.SaleReturnDefine |
| 5 | saleReturnPrices | 退货单单价 | voucher.salereturn.SaleReturnPrice |
| 6 | saleReturnAttachments | 退货附件 | voucher.salereturn.SaleReturnAttachment |
| 7 | iBpmCurrentAuditor | 当前审批人 | voucher.salereturn.IBpmCurrentAuditor |
| 8 | iBpmStep | 当前业务阶段 | voucher.salereturn.IBpmStep |

---

## Enum Value Details

### 汇率折算方式 (exchRateOps) -> exchRateOps
> Enum: unitfyEnum.GZTBDM.ExchangeRateMethod

| code | value | name |
|------|-------|------|
| 1 | 1 | * |
| 2 | 2 | / |
