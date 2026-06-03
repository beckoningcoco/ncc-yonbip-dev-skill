---
tags: [BIP, metadata, voucher, OrderExecuteView]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单执行情况统计表 (voucher.order.OrderExecuteView)

> Platform: BIP V5 | Module: voucher | Table:  | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 订单执行情况统计表 |
| uri | voucher.order.OrderExecuteView |
| tableName |  |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | voucher.order.Order |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 商家相关 (IShop) | base.itf.IShop |
| 2 | 伙伴表头接口 (ICust) | uorder.voucher.ICust |

---

## All Fields (285)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | address | 注册地址 | cAddress | text | String |  |  | nullable |
| 2 | agentId | 客户id | iAgentId | quote | aa.merchant.Merchant |  |  | data_auth,nullable,dataPowerFlag |
| 3 | agentRelationId | 客户交易关系id | iAgentRelationId | quote | aa.merchant.MerchantApplyRange |  |  | nullable |
| 4 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 5 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 6 | auditor | 审批人名称 | auditor | text | String |  |  | isGlobalization,nullable |
| 7 | auditorId | 审核人ID | iAuditorId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 8 | auxQty | 订单销售数量 | iAuxUnitQuantity | number | Decimal |  |  | nullable |
| 9 | auxQty_delivery | 发货单销售数量 | iAuxUnitQuantity_delivery | number | Decimal |  |  | nullable |
| 10 | bEffectStock | 是否影响可用量 | bEffectStock | switch | Boolean |  |  | nullable |
| 11 | bSynSettlement | 是否同步待结算 | bSynSettlement | switch | Boolean |  |  | nullable |
| 12 | bankAccount | 开户账号 | cBankAccount | text | String |  |  | nullable |
| 13 | bankCode | 开户行编码 | cBankCode | text | String |  |  | nullable |
| 14 | bankName | 开户行 | cBankName | text | String |  |  | nullable |
| 15 | barCode | 条形码 | bar_code | text | String |  |  | nullable |
| 16 | bdInvoiceTypeId | 发票类型 | bdInvoiceTypeId | quote | bd.invoice.InvoiceTypeVO |  |  | nullable |
| 17 | billBusinessType | 业务类型 | billBusinessType | short | Short |  |  | nullable |
| 18 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 19 | bizId | 商家id | iBizId | long | Long |  |  | nullable |
| 20 | bizName | 商家名称 | cBizName | text | String |  |  | nullable |
| 21 | cSettlementCode | 结算方式编码 | cSettlementCode | text | String |  |  | nullable |
| 22 | changeStatus | 变更状态 | cChangeStatus | text | String |  |  | nullable |
| 23 | changeVersion | 变更版本号 | ichangeVersion | int | Integer |  |  | nullable |
| 24 | closeDate | 关闭日期 | dClose_Date | date | Date |  |  | nullable |
| 25 | closeReason | 订单关闭原因 | closeReason | text | String |  |  | nullable |
| 26 | closeTime | 关闭时间 | dClose_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 27 | closer | 关闭人 | cCloser | text | String |  |  | isGlobalization,nullable,reportHide |
| 28 | closerId | 关闭人ID | iCloserId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 29 | code | 编码 | cOrderNo | text | String | Y |  | REF.CODE,CODE,nullable,isCode |
| 30 | confirmDate | 订单确认时间 | dConfirmDate | text | String |  |  | nullable |
| 31 | confirmPrice | 收款已确认金额 | fConfirmPrice | number | Decimal |  |  | nullable |
| 32 | confirmer | 确认人 | iConfirmerId | long | Long |  |  | nullable |
| 33 | corpContact | 销售业务员id | iCorpContactId | quote | bd.staff.Staff |  |  | data_auth,nullable,dataPowerFlag |
| 34 | corpContactUserErpCode | 业务员erp编码 | cCorpContactUserErpCode | text | String |  |  | nullable |
| 35 | corpContactUserName | 销售业务员 | cCorpContactUserName | text | String |  |  | nullable |
| 36 | couponsMoney | 优惠劵 | fCouponsMoney | number | Decimal |  |  | nullable |
| 37 | createDate | 创建日期 | dCreated | date | Date |  |  | isBusinessLog,nullable |
| 38 | createSource | API来源 | cCreateSource | short | Short |  |  | isMakeBill,nullable |
| 39 | createTime | 创建时间 | dCreatedTime | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 40 | creator | 创建人 | cCreator | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 41 | creatorId | 创建人ID | iSubmiterId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 42 | currency | 原币pk | cOriginalPk | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 43 | currentStatus | 当前状态位置 | iCurrentStatus | int | Integer |  |  | nullable |
| 44 | custId | 伙伴 | iCustomerId | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 45 | customerArea | 销售区域 | iAgentAreaId | quote | aa.salearea.SaleArea |  |  | nullable |
| 46 | customerClass | 客户分类 | iAgentCategoryId | quote | aa.custcategory.CustCategory |  |  | nullable |
| 47 | customerIndustry | 客户行业 | iAgentIndustryId | quote | aa.customertrade.CustomerTrade |  |  | nullable |
| 48 | customerLevel | 客户级别 | iAgentLevelId | quote | aa.agentlevel.AgentLevel |  |  | nullable |
| 49 | deliveryDate | 交货日期 | dDeliveryDate | text | String |  |  | nullable |
| 50 | deliveryMethod | 交付方式 | deliveryMethod | quote | usp.deliverymethod.Deliverymethod |  |  | nullable |
| 51 | deliveryStatus | 发货状态 | deliveryStatus | text | String |  |  | nullable |
| 52 | detailReceiverCustId | 收货客户(表体) | dReceiverCust | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 53 | domesticName | 本币名称 | cDomesticName | text | String |  |  | nullable |
| 54 | downPayment | 定金金额 | fDownPayment | number | Decimal |  |  | nullable |
| 55 | downPaymentRatio | 定金比例 | fDownPaymentRatio | number | Decimal |  |  | nullable |
| 56 | downSuccess | 是否下载成功 | isDownSuccess | switch | Boolean |  |  | nullable |
| 57 | downloadMsg | 下载返回消息 | cDownloadMsg | text | String |  |  | nullable |
| 58 | downloadSource | 下载去向 | cDownloadSource | short | Short |  |  | nullable |
| 59 | downloadU8 | erp是否下载 | bDownloadU8 | switch | Boolean |  |  | nullable |
| 60 | downloadU8Date | 下载时间 | cDownloadU8Date | timestamp | Timestamp |  |  | nullable |
| 61 | endAreaId | 目的地运输区域 | endAreaId | quote | base.shipregion.ShipRegion |  |  | nullable |
| 62 | erpSynFailInfo | ERP同步失败原因 | iErpSynFailInfo | text | String |  |  | nullable |
| 63 | erpSynStatus | ERP同步状态 | iErpSynStatus | text | String |  |  | nullable |
| 64 | erpSynStatusCode | ERP同步状态编码 | iErpSynStatusCode | text | String |  |  | nullable |
| 65 | erpTS | 上传订单时间戳 | cErpTS | text | String |  |  | nullable |
| 66 | exchRate | 汇率 | fExchangeRate | number | Decimal |  |  | nullable |
| 67 | exchRateDate | 汇率日期 | exchRateDate | date | Date |  |  | nullable |
| 68 | exchangeStatus | 交换状态 | exchangeStatus | short | Short |  |  | nullable |
| 69 | expiredayConfirmType | 到期日确定方式 | expiredayConfirmType | short | Short |  |  | nullable |
| 70 | fNatMoney_salereturn | 退货入库本币无税金额 | fNatMoney_salereturn | number | Decimal |  |  | nullable |
| 71 | fNatSum_salereturn | 退货入库本币含税金额 | fNatSum_salereturn | number | Decimal |  |  | nullable |
| 72 | fNatTax_salereturn | 退货入库本币税额 | fNatTax_salereturn | number | Decimal |  |  | nullable |
| 73 | fOriMoney_salereturn | 退货入库无税金额 | fOriMoney_salereturn | number | Decimal |  |  | nullable |
| 74 | fOriSum_salereturn | 退货入库含税金额 | fOriSum_salereturn | number | Decimal |  |  | nullable |
| 75 | fOriTax_salereturn | 退货入库税额 | fOriTax_salereturn | number | Decimal |  |  | nullable |
| 76 | fOrigReceiveMoney_salereturn | 退货开票核销金额 | fOrigReceiveMoney_salereturn | number | Decimal |  |  | nullable |
| 77 | fSaleReturnPrice | 退货含税金额 | fSaleReturnPrice | number | Decimal |  |  | nullable |
| 78 | failedInfo | 失败信息 | failedInfo | text | String |  |  | nullable |
| 79 | haveDelivery | 是否存在发货单 | isHaveDelivery | switch | Boolean |  |  | nullable |
| 80 | hopeReceiveDate | 期望收货日期 | dHopeReceiveDate | text | String |  |  | nullable |
| 81 | iDeleted | 是否删除 | iDeleted | short | Short |  |  | nullable |
| 82 | iProductAuxUnitId | 销售单位Id | iProductAuxUnitId | quote | pc.unit.Unit |  |  | nullable |
| 83 | iProductUnitId | 计价单位 | iProductUnitId | quote | pc.unit.Unit |  |  | nullable |
| 84 | iQuantity_salereturn | 退货入库计价数量 | iQuantity_salereturn | number | Decimal |  |  | nullable |
| 85 | id | id | id | long | Long |  |  | nullable,REF.ID |
| 86 | invExchRate | 销售换算率 | invExchRate | number | Decimal |  |  | nullable |
| 87 | invPriceExchRate | 计价换算率 | invPriceExchRate | number | Decimal |  |  | nullable |
| 88 | invoiceAddress | 营业地址 | cInvoiceAddress | text | String |  |  | nullable |
| 89 | invoiceAgentId | 开票客户id | iInvoiceAgentId | quote | aa.merchant.Merchant |  |  | nullable,reportHide |
| 90 | invoiceContent | 发票内容 | cInvoiceContent | text | String |  |  | nullable |
| 91 | invoiceMoney | 发票金额 | iInvoiceMoney | number | Decimal |  |  | nullable |
| 92 | invoiceStatus | 发票状态 | invoiceStatus | text | String |  |  | nullable |
| 93 | invoiceTelephone | 营业电话 | cInvoiceTelephone | text | String |  |  | nullable |
| 94 | invoiceTitle | 发票抬头 | cInvoiceTitle | text | String |  |  | nullable |
| 95 | invoiceTitleType | 发票抬头类型 | iInvoiceTitleType | - | aa.merchant.EnterpriseNature |  |  | nullable |
| 96 | invoiceType | 发票类型 | cInvoiceType | text | String |  |  | nullable |
| 97 | invoiceUpcType | 发票类型 | iInvoiceUpcType | short | Short |  |  | nullable |
| 98 | isAccDeliveryPlan | 按发货计划发货 | bIsAccDeliveryPlan | switch | Boolean |  |  | nullable |
| 99 | isAllowOrginReplenish | 是否允许原单补货 | isAllowOrginReplenish | switch | Boolean |  |  | nullable |
| 100 | isChangeShipmentPlan | 变更发货计划 | bIsChangeShipmentPlan | switch | Boolean |  |  | nullable |
| 101 | isDespatch | 启用发运管理 | isDespatch | switch | Boolean |  |  | nullable |
| 102 | isDownPayment | 必有定金 | isDownPayment | switch | Boolean |  |  | nullable |
| 103 | isEndTrade | 是否末级 | isEndTrade | short | Short |  |  | nullable |
| 104 | isFinishDelivery | 订单是否发完货 | bFinishDelivery | switch | Boolean |  |  | nullable |
| 105 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 106 | isLowestPrice | 是否超最低售价 | isLowestPrice | switch | Boolean |  |  | nullable |
| 107 | isSalePriceModify | 报价支持手工录入 | isSalePriceModify | switch | Boolean |  |  | nullable |
| 108 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 109 | issueStatus | 出库状态 | issueStatus | text | String |  |  | nullable |
| 110 | issuedTaxMoney | 已开税票金额 | issuedTaxMoney | number | Decimal |  |  | nullable |
| 111 | lockIn | 标记锁 | bLockIn | switch | Boolean |  |  | nullable |
| 112 | lowCodeFlowId | 低代码流程ID | lowCodeFlowId | text | String |  |  | nullable |
| 113 | mApplyRangeId | 客户应用范围id | imApplyRangeId | quote | aa.merchant.MerchantApplyRange |  |  | nullable |
| 114 | mainprojectId | 项目projectId | cProjectId | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 115 | masterUnitId | 主计价单位 | iMasterUnitId | quote | pc.unit.Unit |  |  | nullable |
| 116 | memo | 备注 | memo | text | String |  |  | nullable |
| 117 | merchantAuth | 客户权限 | iAgentId | quote | pb.dataauth.MerchantAuthDataAuth |  |  | nullable |
| 118 | modifier | 修改人 | cModifier | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 119 | modifierId | 修改人id | iModifierId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 120 | modifyDate | 修改日期 | dModifiedDate | date | Date |  |  | isBusinessLog,nullable |
| 121 | modifyInvoiceType | 发票类型可改 | bModifyInvoiceType | switch | Boolean |  |  | nullable |
| 122 | modifyTime | 修改时间 | dModifyTime | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 123 | moneyInvWriteOff | 应收冲销金额 | fMoneyInvWriteOff | number | Decimal |  |  | nullable |
| 124 | natCurrency | 本币pk | cDomesticPk | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 125 | natMoney | 订单本币无税金额 | fSalePayMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 126 | natMoney_delivery | 发货单本币无税金额 | fSalePayMoney_domestic_taxfree_delivery | number | Decimal |  |  | nullable |
| 127 | natMoney_saleinvoice | 开票本币无税金额 | fSalePayMoney_domestic_taxfree_saleinvoice | number | Decimal |  |  | nullable |
| 128 | natMoney_salereturn | 退货开票本币无税金额 | natMoney_salereturn | number | Decimal |  |  | nullable |
| 129 | natMoney_salesout | 出库单本币无税金额 | fNatMoney_salesout | number | Decimal |  |  | nullable |
| 130 | natSum | 订单本币含税金额 | fSalePayMoney_domestic | number | Decimal |  |  | nullable |
| 131 | natSum_delivery | 发货单本币含税金额 | fSalePayMoney_domestic_delivery | number | Decimal |  |  | nullable |
| 132 | natSum_saleinvoice | 开票本币含税金额 | fSalePayMoney_domestic_saleinvoice | number | Decimal |  |  | nullable |
| 133 | natSum_salereturn | 退货开票本币含税金额 | natSum_salereturn | number | Decimal |  |  | nullable |
| 134 | natSum_salesout | 出库单本币含税金额 | fNatSum_salesout | number | Decimal |  |  | nullable |
| 135 | natTax | 订单本币税额 | fNatTax | number | Decimal |  |  | nullable |
| 136 | natTax_delivery | 发货单本币税额 | fNatTax_delivery | number | Decimal |  |  | nullable |
| 137 | natTax_saleinvoice | 开票本币税额 | fNatTax_saleinvoice | number | Decimal |  |  | nullable |
| 138 | natTax_salereturn | 退货开票本币税额 | natTax_salereturn | number | Decimal |  |  | nullable |
| 139 | natTax_salesout | 出库单本币税额 | fNatTax_salesout | number | Decimal |  |  | nullable |
| 140 | naxReceiveMoney | 收款本币金额 | fNaxReceiveMoney | number | Decimal |  |  | nullable |
| 141 | nextStatus | 订单状态 | cNextStatus | text | String |  |  | nullable |
| 142 | nextStatusName | 订单状态 | cNextStatusName | text | String |  |  | nullable |
| 143 | oadayConfirmType | 出账日确定方式 | oadayConfirmType | short | Short |  |  | nullable |
| 144 | occupyInventory | 库存占用时机 | cOccupyInventory | text | String |  |  | nullable |
| 145 | opposeMemo | 驳回批注 | cOpposeMemo | text | String |  |  | nullable |
| 146 | orderCreateDate | 单据日期(订货端生成单号使用) | dOrderCreateDate | timestamp | Timestamp |  |  | nullable |
| 147 | orderDate | 订单日期 | dOrderDate | text | String |  |  | nullable |
| 148 | orderDefineCharacter | 表头自定义项特征组 | orderDefineCharacter | UserDefine | voucher.order.OrderDefineCharacter |  |  | nullable |
| 149 | orderDetailId | 订单详情 | iOrderDetailId | quote | voucher.order.OrderDetail |  |  | nullable |
| 150 | orderErp | 订单erp表 | iOrderErpId | quote | voucher.order.OrderErp |  |  | nullable |
| 151 | orderId | 订单 | iOrderId | quote | voucher.order.Order |  |  | nullable |
| 152 | orderInvoice | 发票信息 | iOrderInvoiceId | quote | voucher.order.OrderInvoice |  |  | nullable |
| 153 | orderPayMoney | 商品实付金额 | fOrderPayMoney | number | Decimal |  |  | nullable |
| 154 | orderPayType | 支付方式 | cOrderPayType | text | String |  |  | nullable |
| 155 | orderProductType | 商品售卖类型 | cOrderProductType | text | String |  |  | nullable |
| 156 | orderRealMoney | 商品应付金额 | fOrderRealMoney | number | Decimal |  |  | nullable |
| 157 | orderShippingAddress | 收货地址信息 | iOrderShippingAddressId | quote | voucher.order.OrderShippingAddress |  |  | nullable |
| 158 | oriMoney | 无税金额 | fSalePayMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 159 | oriMoney_delivery | 发货单无税金额 | fSalePayMoney_orig_taxfree_delivery | number | Decimal |  |  | nullable |
| 160 | oriMoney_saleinvoice | 开票无税金额 | fSalePayMoney_orig_taxfree_saleinvoice | number | Decimal |  |  | nullable |
| 161 | oriMoney_salereturn | 退货开票无税金额 | oriMoney_salereturn | number | Decimal |  |  | nullable |
| 162 | oriMoney_salesout | 出库单无税金额 | fOriMoney_salesout | number | Decimal |  |  | nullable |
| 163 | oriSum | 含税金额 | fSalePayMoney | number | Decimal |  |  | nullable |
| 164 | oriSum_delivery | 发货单含税金额 | fSalePayMoney_delivery | number | Decimal |  |  | nullable |
| 165 | oriSum_saleinvoice | 开票含税金额 | fSalePayMoney_saleinvoice | number | Decimal |  |  | nullable |
| 166 | oriSum_salereturn | 退货开票含税金额 | oriSum_salereturn | number | Decimal |  |  | nullable |
| 167 | oriSum_salesout | 出库单含税金额 | fOriSum_salesout | number | Decimal |  |  | nullable |
| 168 | oriTax | 税额 | fOriTax | number | Decimal |  |  | nullable |
| 169 | oriTax_delivery | 发货单税额 | fOriTax_delivery | number | Decimal |  |  | nullable |
| 170 | oriTax_saleinvoice | 开票税额 | fOriTax_saleinvoice | number | Decimal |  |  | nullable |
| 171 | oriTax_salereturn | 退货开票税额 | oriTax_salereturn | number | Decimal |  |  | nullable |
| 172 | oriTax_salesout | 出库单税额 | fOriTax_salesout | number | Decimal |  |  | nullable |
| 173 | origReceiveMoney | 核销金额 | fOrigReceiveMoney | number | Decimal |  |  | nullable |
| 174 | originalName | 原币名称 | cOriginalName | text | String |  |  | nullable |
| 175 | outSysKey | 接口标识 | cOutSysKey | text | String |  |  | nullable |
| 176 | out_sys_code | 外部来源编码 | out_sys_code | text | String |  |  | nullable |
| 177 | out_sys_id | 外部来源线索 | out_sys_id | text | String |  |  | nullable |
| 178 | out_sys_type | 外部来源类型 | out_sys_type | text | String |  |  | nullable |
| 179 | out_sys_version | 外部来源版本 | out_sys_version | text | String |  |  | nullable |
| 180 | parentOrderNo | 拆单来源订单号 | cParentOrderNo | text | String |  |  | nullable |
| 181 | particularlyMoney | 特殊优惠 | fParticularlyMoney | number | Decimal |  |  | nullable |
| 182 | payDate | 订单付款时间 | dPayDate | text | String |  |  | nullable |
| 183 | payMoney | 合计含税金额 | fPayMoney | number | Decimal |  |  | nullable |
| 184 | payStatusCode | 付款状态 | cPayStatusCode | text | String |  |  | nullable |
| 185 | points | 整单使用积分 | iPoints | int | Integer |  |  | nullable |
| 186 | pointsMoney | 整单使用积分金额 | fPointsMoney | number | Decimal |  |  | nullable |
| 187 | priceDate | 定价日期 | priceDate | timestamp | Timestamp |  |  | nullable |
| 188 | priceQty | 计价数量 | iQuantity | number | Decimal |  |  | nullable |
| 189 | priceQty_delivery | 发货单计价数量 | iQuantity_delivery | number | Decimal |  |  | nullable |
| 190 | priceQty_saleinvoice | 开票计价数量 | iQuantity_saleinvoice | number | Decimal |  |  | nullable |
| 191 | priceQty_salereturn | 退货开票计价数量 | priceQty_salereturn | number | Decimal |  |  | nullable |
| 192 | priceQty_salesout | 出库单计价数量 | iQuantity_salesout | number | Decimal |  |  | nullable |
| 193 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 194 | productAuth | 物料权限 | iProductId | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 195 | productAuxUnitName | 销售单位 | cProductAuxUnitName | text | String |  |  | nullable |
| 196 | productCode | 商品编码 | cProductCode | text | String |  |  | nullable |
| 197 | productId | 商品id | iProductId | quote | pc.product.Product |  |  | data_auth,nullable |
| 198 | productName | 商品名称 | cProductName | text | String |  |  | nullable |
| 199 | productUnitName | 计价单位 | cProductUnitName | text | String |  |  | nullable |
| 200 | projectId | 项目projectId | cProjectId | quote | bd.project.ProjectVO |  |  | data_auth,nullable |
| 201 | promotionMoney | 优惠金额 | fPromotionMoney | number | Decimal |  |  | nullable |
| 202 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 203 | pubts_view | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable |
| 204 | purchaseNo | 客户采购订单号 | cPurchaseNo | text | String |  |  | nullable |
| 205 | qty | 数量 | qty | number | Decimal |  |  | nullable |
| 206 | qtyName | 主计量 | cMasterUnitMeasure | text | String |  |  | nullable |
| 207 | qty_delivery | 发货单主数量 | qty_delivery | number | Decimal |  |  | nullable |
| 208 | qty_saleinvoice | 开票主数量 | qty_saleinvoice | number | Decimal |  |  | nullable |
| 209 | qty_salereturn | 退货开票主数量 | qty_salereturn | number | Decimal |  |  | nullable |
| 210 | qty_salesout | 出库单主数量 | qty_salesout | number | Decimal |  |  | nullable |
| 211 | qty_salesout_salereturn | 退货入库主数量 | qty_salesout_salereturn | number | Decimal |  |  | nullable |
| 212 | realMoney | 应收金额 | fRealMoney | number | Decimal |  |  | nullable |
| 213 | rebateCashMoney | 抵现返利金额 | fRebateCashMoney | number | Decimal |  |  | nullable |
| 214 | rebateMoney | 返利金额 | fRebateMoney | number | Decimal |  |  | nullable |
| 215 | receievInvoiceEmail | 收票邮箱 | receievinvoiceemail | text | String |  |  | nullable |
| 216 | receievInvoiceMobile | 收票手机号 | receievinvoicemobile | text | String |  |  | nullable |
| 217 | receiveAddress | 完整收货地址 | cReceiveAddress | text | String |  |  | nullable |
| 218 | receiveAgreementId | 收款协议id | iReceiveAgreementId | quote | bd.receivables.ReceiveAgreement |  |  | nullable |
| 219 | receiveCode | 收货地址编码 | cReceiveCode | text | String |  |  | nullable |
| 220 | receiveContacter | 客户联系人 | cReceiveContacter | text | String |  |  | nullable |
| 221 | receiveContacterId | 客户联系人id | iReceiveContacterId | quote | aa.merchant.Contacter |  |  | nullable |
| 222 | receiveContacterPhone | 客户联系电话 | cReceiveContacterPhone | text | String |  |  | nullable |
| 223 | receiveId | 客户收货地址id | iReceiveId | long | Long |  |  | nullable |
| 224 | receiveMobile | 收货人电话 | cReceiveMobile | text | String |  |  | nullable |
| 225 | receiveStore | 客户收货门店id | iReceiveStore | quote | aa.store.Store |  |  | nullable |
| 226 | receiveTelePhone | 收货人固定电话 | cReceiveTelePhone | text | String |  |  | nullable |
| 227 | receiveZipCode | 收货人邮编 | cReceiveZipCode | text | String |  |  | nullable |
| 228 | receiver | 收货人 | cReceiver | text | String |  |  | nullable |
| 229 | receiverCustId | 收货客户 | iReceiverCust | quote | aa.merchant.Merchant |  |  | data_auth,nullable,dataPowerFlag |
| 230 | reight | 运费 | fReight | number | Decimal |  |  | nullable |
| 231 | retailAgentName | 散户名称 | cRetailAgentName | text | String |  |  | nullable |
| 232 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 233 | saleAreaId | 销售区域 | iSaleAreaId | quote | aa.salearea.SaleArea |  |  | data_auth,nullable |
| 234 | saleDepartmentId | 销售部门id | iSaleDepartmentId | quote | bd.adminOrg.DeptOrgVO |  |  | data_auth,nullable,dataPowerFlag |
| 235 | salesOrgId | 销售组织 | iSalesOrgId | quote | org.func.SalesOrg |  |  | nullable,isMasterOrg |
| 236 | sendDate | 计划发货日期 | dSendDate | date | Date |  |  | nullable |
| 237 | separatePromotionType | 拆单规则标识 | cSeparatePromotionType | text | String |  |  | nullable |
| 238 | settVoucherType | 结算类型 | cSettVoucherType | text | String |  |  | nullable |
| 239 | settlement | 结算方式id | iSettlementId | quote | aa.settlemethod.SettleMethod |  |  | dataPowerFlag,data_auth,nullable |
| 240 | settlementOrgId | 财务组织id | iSettlementOrgId | quote | org.func.FinanceOrg |  |  | nullable |
| 241 | settlementVersion | 销售结算单版本 | settlementVersion | int | Integer |  |  | nullable |
| 242 | shippingChoiceId | 发运方式id | cShippingChoiceId | quote | aa.sendtrans.SendTransWay |  |  | nullable |
| 243 | shippingChoiceId_code | 发运方式编码 | cShippingChoiceCode | text | String |  |  | nullable |
| 244 | shop | 商家 | iShopID | long | Long |  | Y | nullable,reportHide |
| 245 | signConfirmStatus | 签收状态 | signConfirmStatus | text | String |  |  | nullable |
| 246 | skuCode | sku编码 | cSkuCode | text | String |  |  | nullable |
| 247 | source | 单据来源 | cSource | - | voucher.order.OrderRequestTypeEnum |  |  | nullable |
| 248 | sourceType | 来源单据类型 | cSourceType | text | String |  |  | bMakeBill,nullable |
| 249 | specDescription | 规格描述 | cSpecDescription | text | String |  |  | nullable |
| 250 | srcBill | 来源单据ID | cSrcBillId | long | Long |  |  | nullable |
| 251 | srcBillNO | 来源单据号 | cSrcBillNO | text | String |  |  | nullable |
| 252 | srcbillType | 来源单据类型 | iSrcbillType | short | Short |  |  | nullable |
| 253 | status | 单据状态 | status | short | Short |  |  | nullable |
| 254 | statusCode | 订单当前状态码 | cStatusCode | text | String |  |  | nullable |
| 255 | stockId | 仓库ID | iStockId | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 256 | subBankName | 开户支行 | cSubBankName | text | String |  |  | nullable |
| 257 | submitSource | 制单人来源 | iSubmitSource | short | Short |  |  | nullable |
| 258 | synSourceOrg | 协同来源组织 | iSynSourceOrg | quote | org.func.PurchaseOrg |  |  | nullable |
| 259 | synSourceTenant | 协同来源租户 | iSynSourceTenant | long | Long |  |  | nullable |
| 260 | tansTypeName | 交易类型名称 | tansTypeName | text | String |  |  | nullable |
| 261 | taxNum | 纳税识别号 | cTaxNum | text | String |  |  | nullable |
| 262 | taxRate | 税率 | taxRate | number | Decimal |  |  | nullable |
| 263 | taxSettingType | 计税方式 | taxSettingType | short | Short |  |  | nullable |
| 264 | telephone | 注册电话 | cTelephone | text | String |  |  | nullable |
| 265 | throwStatus | 抛单状态 | throw_status | int | Integer |  |  | nullable |
| 266 | totalMoney | 总金额 | fTotalMoney | number | Decimal |  |  | nullable |
| 267 | tplid | 模板id | tplid | long | Long |  |  | nullable |
| 268 | tradeRouteID | 贸易路径Id | tradeRouteID | quote | sccs.multitrade.TradeRoute |  |  | nullable |
| 269 | tradeRouteLineno | 站点 | tradeRouteLineno | number | Decimal |  |  | nullable |
| 270 | tradeThrowVersion | 抛单版本号 | trade_throw_version | short | Short |  |  | nullable |
| 271 | transactionTypeId | 交易类型Id | iTransactionTypeId | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 272 | transactionTypeId_name | 交易类型 | transactionTypeId_name | text | String |  |  | nullable |
| 273 | unConfirmPrice | 收款待确认金额 | fUnConfirmPrice | number | Decimal |  |  | nullable |
| 274 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 275 | userBankName | 开户名 | cUserBankName | text | String |  |  | nullable |
| 276 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 277 | version | 版本号 | version | short | Short |  |  | nullable |
| 278 | vouchdate | 单据日期 | vouchdate | date | Date | Y |  | nullable |
| 279 | wholeNatPayEMoney | 应付费用本币无税金额 | wholeNatPayEMoney | number | Decimal |  |  | nullable |
| 280 | wholeNatReceiEMoney | 应收费用本币无税金额 | wholeNatReceiEMoney | number | Decimal |  |  | nullable |
| 281 | wholeNatTaxPayEMoney | 应付费用本币含税金额 | wholeNatTaxPayEMoney | number | Decimal |  |  | nullable |
| 282 | wholeNatTaxReceiEMoney | 应收费用本币含税金额 | wholeNatTaxReceiEMoney | number | Decimal |  |  | nullable |
| 283 | wholePreGProfit | 预估毛利 | wholePreGProfit | number | Decimal |  |  | nullable |
| 284 | wholePreGProfitRate | 预估毛利率% | wholePreGProfitRate | number | Decimal |  |  | nullable |
| 285 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (49)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | agentId | 客户id | iAgentId | aa.merchant.Merchant |
| 2 | agentRelationId | 客户交易关系id | iAgentRelationId | aa.merchant.MerchantApplyRange |
| 3 | auditorId | 审核人ID | iAuditorId | base.user.User |
| 4 | bdInvoiceTypeId | 发票类型 | bdInvoiceTypeId | bd.invoice.InvoiceTypeVO |
| 5 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 6 | closerId | 关闭人ID | iCloserId | base.user.User |
| 7 | corpContact | 销售业务员id | iCorpContactId | bd.staff.Staff |
| 8 | creatorId | 创建人ID | iSubmiterId | base.user.User |
| 9 | currency | 原币pk | cOriginalPk | bd.currencytenant.CurrencyTenantVO |
| 10 | custId | 伙伴 | iCustomerId | aa.merchant.Merchant |
| 11 | customerArea | 销售区域 | iAgentAreaId | aa.salearea.SaleArea |
| 12 | customerClass | 客户分类 | iAgentCategoryId | aa.custcategory.CustCategory |
| 13 | customerIndustry | 客户行业 | iAgentIndustryId | aa.customertrade.CustomerTrade |
| 14 | customerLevel | 客户级别 | iAgentLevelId | aa.agentlevel.AgentLevel |
| 15 | deliveryMethod | 交付方式 | deliveryMethod | usp.deliverymethod.Deliverymethod |
| 16 | detailReceiverCustId | 收货客户(表体) | dReceiverCust | aa.merchant.Merchant |
| 17 | endAreaId | 目的地运输区域 | endAreaId | base.shipregion.ShipRegion |
| 18 | iProductAuxUnitId | 销售单位Id | iProductAuxUnitId | pc.unit.Unit |
| 19 | iProductUnitId | 计价单位 | iProductUnitId | pc.unit.Unit |
| 20 | invoiceAgentId | 开票客户id | iInvoiceAgentId | aa.merchant.Merchant |
| 21 | mApplyRangeId | 客户应用范围id | imApplyRangeId | aa.merchant.MerchantApplyRange |
| 22 | mainprojectId | 项目projectId | cProjectId | bd.project.ProjectVO |
| 23 | masterUnitId | 主计价单位 | iMasterUnitId | pc.unit.Unit |
| 24 | merchantAuth | 客户权限 | iAgentId | pb.dataauth.MerchantAuthDataAuth |
| 25 | modifierId | 修改人id | iModifierId | base.user.User |
| 26 | natCurrency | 本币pk | cDomesticPk | bd.currencytenant.CurrencyTenantVO |
| 27 | orderDetailId | 订单详情 | iOrderDetailId | voucher.order.OrderDetail |
| 28 | orderErp | 订单erp表 | iOrderErpId | voucher.order.OrderErp |
| 29 | orderId | 订单 | iOrderId | voucher.order.Order |
| 30 | orderInvoice | 发票信息 | iOrderInvoiceId | voucher.order.OrderInvoice |
| 31 | orderShippingAddress | 收货地址信息 | iOrderShippingAddressId | voucher.order.OrderShippingAddress |
| 32 | productAuth | 物料权限 | iProductId | pb.dataauth.ProductDataAuth |
| 33 | productId | 商品id | iProductId | pc.product.Product |
| 34 | projectId | 项目projectId | cProjectId | bd.project.ProjectVO |
| 35 | receiveAgreementId | 收款协议id | iReceiveAgreementId | bd.receivables.ReceiveAgreement |
| 36 | receiveContacterId | 客户联系人id | iReceiveContacterId | aa.merchant.Contacter |
| 37 | receiveStore | 客户收货门店id | iReceiveStore | aa.store.Store |
| 38 | receiverCustId | 收货客户 | iReceiverCust | aa.merchant.Merchant |
| 39 | saleAreaId | 销售区域 | iSaleAreaId | aa.salearea.SaleArea |
| 40 | saleDepartmentId | 销售部门id | iSaleDepartmentId | bd.adminOrg.DeptOrgVO |
| 41 | salesOrgId | 销售组织 | iSalesOrgId | org.func.SalesOrg |
| 42 | settlement | 结算方式id | iSettlementId | aa.settlemethod.SettleMethod |
| 43 | settlementOrgId | 财务组织id | iSettlementOrgId | org.func.FinanceOrg |
| 44 | shippingChoiceId | 发运方式id | cShippingChoiceId | aa.sendtrans.SendTransWay |
| 45 | stockId | 仓库ID | iStockId | aa.warehouse.Warehouse |
| 46 | synSourceOrg | 协同来源组织 | iSynSourceOrg | org.func.PurchaseOrg |
| 47 | tradeRouteID | 贸易路径Id | tradeRouteID | sccs.multitrade.TradeRoute |
| 48 | transactionTypeId | 交易类型Id | iTransactionTypeId | bd.bill.TransType |
| 49 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
