---
tags: [BIP, metadata, voucher, OrderChange]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售变更单 (voucher.orderchange.OrderChange)

> Platform: BIP V5 | Module: voucher | Table: orderschange | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 销售变更单 |
| uri | voucher.orderchange.OrderChange |
| tableName | orderschange |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | voucher.order.Order |
| isBusinessObject | true |
| description | 销售变更单 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (204)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 单据编号 | cOrderNo | text | String | Y |  | REF.CODE,CODE,nullable,isCode |
| 2 | transactionTypeId_name | 交易类型 | transactionTypeId_name | text | String |  |  | nullable |
| 3 | transactionTypeId | 交易类型id | iTransactionTypeId | quote | bd.bill.TransType |  |  | data_auth,isTransactionType,nullable |
| 4 | vouchdate | 单据日期 | vouchdate | date | Date | Y |  | nullable |
| 5 | salesOrgId | 销售组织 | iSalesOrgId | quote | org.func.SalesOrg |  |  | data_auth,isMasterOrg,nullable |
| 6 | agentId | 客户 | iAgentId | quote | aa.merchant.Merchant |  |  | data_auth,nullable,dataPowerFlag |
| 7 | receiveContacter | 客户联系人 | cReceiveContacter | text | String |  |  | nullable |
| 8 | receiveContacterPhone | 客户联系电话 | cReceiveContacterPhone | text | String |  |  | nullable |
| 9 | retailAgentName | 散户名称 | cRetailAgentName | text | String |  |  | nullable |
| 10 | saleDepartmentId | 销售部门id | iSaleDepartmentId | quote | bd.adminOrg.DeptOrgVO |  |  | dataPowerFlag,data_auth,nullable |
| 11 | corpContactUserName | 销售业务员 | cCorpContactUserName | text | String |  |  | nullable |
| 12 | corpContact | 销售业务员id | iCorpContactId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 13 | saleAreaId | 销售区域 | iSaleAreaId | quote | aa.salearea.SaleArea |  |  | data_auth,nullable |
| 14 | sendDate | 计划发货日期 | dSendDate | date | Date |  |  | nullable |
| 15 | hopeReceiveDate | 期望收货日期 | dHopeReceiveDate | text | String |  |  | nullable |
| 16 | custId | 伙伴 | iCustomerId | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 17 | receiverCustId | 收货客户 | iReceiverCust | quote | aa.merchant.Merchant |  |  | dataPowerFlag,data_auth,nullable |
| 18 | receiver | 收货人 | cReceiver | text | String |  |  | nullable |
| 19 | receiveId | 收货人id | iReceiveId | long | Long |  |  | nullable |
| 20 | tradeThrowVersion | 抛单版本号 | trade_throw_version | short | Short |  |  | nullable |
| 21 | wholePreGProfitRate | 预估毛利率% | wholePreGProfitRate | number | Decimal |  |  | nullable |
| 22 | out_sys_code | 外部来源编码 | out_sys_code | text | String |  |  | nullable |
| 23 | receievInvoiceEmail | 收票邮箱 | receievinvoiceemail | text | String |  |  | nullable |
| 24 | tradeRouteLineno | 站点 | tradeRouteLineno | number | Decimal |  |  | nullable |
| 25 | isEndTrade | 是否末级 | isEndTrade | short | Short |  |  | nullable |
| 26 | out_sys_id | 外部来源线索 | out_sys_id | text | String |  |  | nullable |
| 27 | wholeNatReceiEMoney | 应收费用本币无税金额 | wholeNatReceiEMoney | number | Decimal |  |  | nullable |
| 28 | settlementVersion | 销售结算单版本 | settlementVersion | int | Integer |  |  | nullable |
| 29 | receievInvoiceMobile | 收票手机号 | receievinvoicemobile | text | String |  |  | nullable |
| 30 | wholeNatTaxReceiEMoney | 应收费用本币含税金额 | wholeNatTaxReceiEMoney | number | Decimal |  |  | nullable |
| 31 | out_sys_type | 外部来源类型 | out_sys_type | text | String |  |  | nullable |
| 32 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide,notGenerate |
| 33 | downPayment | 定金金额 | fDownPayment | number | Decimal |  |  | nullable |
| 34 | bSynSettlement | 是否同步待结算 | bSynSettlement | switch | Boolean |  |  | nullable |
| 35 | wholeNatPayEMoney | 应付费用本币无税金额 | wholeNatPayEMoney | number | Decimal |  |  | nullable |
| 36 | wholePreGProfit | 预估毛利 | wholePreGProfit | number | Decimal |  |  | nullable |
| 37 | isDownPayment | 必有定金 | isDownPayment | switch | Boolean |  |  | nullable |
| 38 | taxSettingType | 计税方式 | taxSettingType | short | Short |  |  | nullable |
| 39 | out_sys_version | 外部来源版本 | out_sys_version | text | String |  |  | nullable |
| 40 | wholeNatTaxPayEMoney | 应付费用本币含税金额 | wholeNatTaxPayEMoney | number | Decimal |  |  | nullable |
| 41 | downPaymentRatio | 定金比例 | fDownPaymentRatio | number | Decimal |  |  | nullable |
| 42 | closeReason | 订单关闭原因 | closeReason | text | String |  |  | nullable |
| 43 | billBusinessType | 业务类型 | billBusinessType | short | Short |  |  | nullable |
| 44 | tradeRouteID | 贸易路径Id | tradeRouteID | quote | sccs.multitrade.TradeRoute |  |  | nullable |
| 45 | receiveContacterId | 客户联系人id | iReceiveContacterId | quote | aa.merchant.Contacter |  |  | nullable |
| 46 | changeStatus | 变更状态 | cChangeStatus | text | String |  |  | nullable |
| 47 | priceDate | 定价日期 | priceDate | timestamp | Timestamp |  |  | nullable |
| 48 | receiveCode | 收货地址编码 | cReceiveCode | text | String |  |  | nullable |
| 49 | receiveMobile | 收货电话 | cReceiveMobile | text | String |  |  | nullable |
| 50 | receiveAddress | 收货地址 | cReceiveAddress | text | String |  |  | nullable |
| 51 | receiveZipCode | 收货人邮编 | cReceiveZipCode | text | String |  |  | nullable |
| 52 | receiveTelePhone | 收货人固定电话 | cReceiveTelePhone | text | String |  |  | nullable |
| 53 | orderShippingAddress | 收货地址信息 | iOrderShippingAddressId | quote | voucher.order.OrderShippingAddress |  |  | nullable |
| 54 | receiveStore | 客户收货门店Id | iReceiveStore | quote | aa.store.Store |  |  | nullable |
| 55 | mainprojectId | 项目projectId | cProjectId | quote | bd.project.ProjectVO |  |  | data_auth,nullable,dataPowerFlag |
| 56 | confirmPrice | 收款已确认金额 | fConfirmPrice | number | Decimal |  |  | nullable |
| 57 | payStatusCode | 付款状态 | cPayStatusCode | text | String |  |  | nullable |
| 58 | unConfirmPrice | 收款待确认金额 | fUnConfirmPrice | number | Decimal |  |  | nullable |
| 59 | deliveryMethod | 交付方式 | deliveryMethod | quote | usp.deliverymethod.Deliverymethod |  |  | nullable |
| 60 | orderPayType | 支付方式 | cOrderPayType | text | String |  |  | nullable |
| 61 | cSettlementCode | 结算方式编码 | cSettlementCode | text | String |  |  | nullable |
| 62 | settlement | 结算方式id | iSettlementId | quote | aa.settlemethod.SettleMethod |  |  | dataPowerFlag,data_auth,nullable |
| 63 | settVoucherType | 结算类型 | cSettVoucherType | text | String |  |  | nullable |
| 64 | settlementOrgId | 开票组织id | iSettlementOrgId | quote | org.func.FinanceOrg |  |  | nullable |
| 65 | invoiceAgentId | 开票客户id | iInvoiceAgentId | quote | aa.merchant.Merchant |  |  | nullable,reportHide |
| 66 | purchaseNo | 客户采购订单号 | cPurchaseNo | text | String |  |  | nullable |
| 67 | receiveAgreementId | 收款协议id | iReceiveAgreementId | quote | bd.receivables.ReceiveAgreement |  |  | nullable |
| 68 | exchRateDate | 汇率日期 | exchRateDate | date | Date |  |  | nullable |
| 69 | invoiceType | 发票类型 | cInvoiceType | text | String |  |  | nullable |
| 70 | invoiceUpcType | 发票类型 | iInvoiceUpcType | short | Short |  |  | nullable |
| 71 | bdInvoiceTypeId | 发票类型id | bdInvoiceTypeId | quote | bd.invoice.InvoiceTypeVO |  |  | nullable |
| 72 | orderInvoice | 发票信息 | iOrderInvoiceId | quote | voucher.order.OrderInvoice |  |  | nullable |
| 73 | address | 注册地址 | cAddress | text | String |  |  | nullable |
| 74 | telephone | 注册电话 | cTelephone | text | String |  |  | nullable |
| 75 | userBankName | 开户名 | cUserBankName | text | String |  |  | nullable |
| 76 | bankCode | 开户行编码 | cBankCode | text | String |  |  | nullable |
| 77 | modifyInvoiceType | 发票类型可改 | bModifyInvoiceType | switch | Boolean |  |  | nullable |
| 78 | invoiceTitleType | 抬头类型 | iInvoiceTitleType | - | aa.merchant.EnterpriseNature |  |  | nullable |
| 79 | invoiceTitle | 发票抬头 | cInvoiceTitle | text | String |  |  | nullable |
| 80 | taxNum | 纳税识别号 | cTaxNum | text | String |  |  | nullable |
| 81 | bankName | 开户银行 | cBankName | text | String |  |  | nullable |
| 82 | subBankName | 开户支行 | cSubBankName | text | String |  |  | nullable |
| 83 | bankAccount | 银行账号 | cBankAccount | text | String |  |  | nullable |
| 84 | invoiceTelephone | 营业电话 | cInvoiceTelephone | text | String |  |  | nullable |
| 85 | invoiceAddress | 营业地址 | cInvoiceAddress | text | String |  |  | nullable |
| 86 | endAreaId | 目的地运输区域 | endAreaId | quote | base.shipregion.ShipRegion |  |  | nullable |
| 87 | isAccDeliveryPlan | 按发货计划发货 | bIsAccDeliveryPlan | switch | Boolean |  |  | nullable |
| 88 | isDespatch | 启用发运管理 | isDespatch | switch | Boolean |  |  | nullable |
| 89 | shippingChoiceId_code | 发运方式编码 | cShippingChoiceCode | text | String |  |  | nullable |
| 90 | deliveryDate | 交货日期 | dDeliveryDate | text | String |  |  | nullable |
| 91 | moneyInvWriteOff | 应收冲销金额 | fMoneyInvWriteOff | number | Decimal |  |  | nullable |
| 92 | isVersions | 是否最新版本 | bIsVersions | switch | Boolean |  |  | nullable |
| 93 | orderDefineCharacter | 表头自定义项特征组 | orderDefineCharacter | UserDefine | voucher.orderchange.OrderDefineCharacter |  |  | nullable |
| 94 | changeVersion | 变更单版本号 | ichangeVersion | int | Integer |  |  | nullable |
| 95 | version | 版本号 | version | short | Short |  |  | nullable |
| 96 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 97 | status | 单据状态 | status | short | Short |  |  | nullable |
| 98 | reasonMemo | 变更原因 | cReasonMemo | text | String |  |  | nullable |
| 99 | orderDate | 订单变更日期 | dOrderDate | text | String |  |  | nullable |
| 100 | confirmDate | 订单变更确认时间 | dConfirmDate | text | String |  |  | nullable |
| 101 | payDate | 订单变更付款时间 | dPayDate | text | String |  |  | nullable |
| 102 | statusCode | 订单变更当前状态码 | cStatusCode | text | String |  |  | nullable |
| 103 | nextStatus | 订单状态编码 | cNextStatus | text | String |  |  | nullable |
| 104 | nextStatusName | 订单状态 | cNextStatusName | text | String |  |  | nullable |
| 105 | originalOrderId | 原单id | iOriginalOrderId | quote | voucher.order.Order |  |  | nullable |
| 106 | corpContactUserErpCode | 业务员erp编码 | cCorpContactUserErpCode | text | String |  |  | nullable |
| 107 | parentOrderNo | 拆单来源订单变更号 | cParentOrderNo | text | String |  |  | nullable |
| 108 | createSource | 来源系统 | cCreateSource | short | Short |  |  | isMakeBill,nullable |
| 109 | opposeMemo | 驳回批注 | cOpposeMemo | text | String |  |  | nullable |
| 110 | currentStatus | 当前状态位置 | iCurrentStatus | int | Integer |  |  | nullable |
| 111 | separatePromotionType | 拆单规则标识 | cSeparatePromotionType | text | String |  |  | nullable |
| 112 | points | 积分 | iPoints | int | Integer |  |  | nullable |
| 113 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 114 | orderErp | 订单变更erp | iOrderErpId | quote | voucher.order.OrderErp |  |  | nullable |
| 115 | invoiceMoney | 发票金额 | iInvoiceMoney | number | Decimal |  |  | nullable |
| 116 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 117 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 118 | shippingChoiceId | 发运方式id | cShippingChoiceId | quote | aa.sendtrans.SendTransWay |  |  | nullable |
| 119 | totalMoney | 总金额 | fTotalMoney | number | Decimal |  |  | nullable |
| 120 | payMoney | 合计含税金额 | fPayMoney | number | Decimal |  |  | nullable |
| 121 | orderPayMoney | 商品实付金额 | fOrderPayMoney | number | Decimal |  |  | nullable |
| 122 | promotionMoney | 总优惠金额 | fPromotionMoney | number | Decimal |  |  | nullable |
| 123 | rebateMoney | 折扣返利金额 | fRebateMoney | number | Decimal |  |  | nullable |
| 124 | rebateCashMoney | 抵现返利金额 | fRebateCashMoney | number | Decimal |  |  | nullable |
| 125 | pointsMoney | 积分抵扣金额 | fPointsMoney | number | Decimal |  |  | nullable |
| 126 | realMoney | 应收金额 | fRealMoney | number | Decimal |  |  | nullable |
| 127 | orderRealMoney | 商品应付金额 | fOrderRealMoney | number | Decimal |  |  | nullable |
| 128 | particularlyMoney | 特殊优惠 | fParticularlyMoney | number | Decimal |  |  | nullable |
| 129 | bizId | 商家id | iBizId | long | Long |  |  | nullable |
| 130 | bizName | 商家名称 | cBizName | text | String |  |  | nullable |
| 131 | agentRelationId | 客户交易关系id | iAgentRelationId | quote | aa.merchant.MerchantApplyRange |  |  | nullable |
| 132 | shop | 商家 | iShopID | long | Long |  | Y | nullable,reportHide |
| 133 | id | 主体id | id | long | Long |  |  | nullable,REF.ID |
| 134 | uordercorp | 租户id | iCorpId | long | Long |  | Y | nullable,reportHide |
| 135 | creator | 创建人 | cCreator | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 136 | creatorId | 创建人id | iSubmiterId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 137 | createTime | 创建时间 | dCreatedTime | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 138 | createDate | 创建日期 | dCreated | date | Date |  |  | isBusinessLog,nullable |
| 139 | auditor | 审批人 | auditor | text | String |  |  | isGlobalization,nullable |
| 140 | auditorId | 审核人ID | iAuditorId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 141 | auditTime | 审批时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 142 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 143 | closer | 关闭人 | cCloser | text | String |  |  | isGlobalization,nullable,reportHide |
| 144 | closerId | 关闭人ID | iCloserId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 145 | closeTime | 关闭时间 | dClose_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 146 | closeDate | 关闭日期 | dClose_Date | date | Date |  |  | nullable |
| 147 | modifier | 修改人 | cModifier | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 148 | modifierId | 修改人id | iModifierId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 149 | modifyDate | 修改日期 | dModifiedDate | date | Date |  |  | isBusinessLog,nullable |
| 150 | modifyTime | 修改时间 | dModifyTime | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 151 | lockIn | 标记锁 | bLockIn | switch | Boolean |  |  | nullable |
| 152 | submitSource | 制单人类型 | iSubmitSource | short | Short |  |  | nullable |
| 153 | confirmer | 确认人 | iConfirmerId | long | Long |  |  | nullable |
| 154 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 155 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 156 | source | 单据来源 | cSource | - | voucher.order.OrderRequestTypeEnum |  |  | nullable |
| 157 | sourceType | 来源单据类型 | cSourceType | text | String |  |  | bMakeBill,nullable |
| 158 | srcBill | 来源单据ID | cSrcBillId | long | Long |  |  | nullable |
| 159 | srcBillNO | 来源单据号 | cSrcBillNO | text | String |  |  | nullable |
| 160 | srcbillType | 来源单据类型 | iSrcbillType | short | Short |  |  | nullable |
| 161 | synSourceTenant | 协同来源租户 | iSynSourceTenant | long | Long |  |  | nullable |
| 162 | synSourceOrg | 协同来源组织id | iSynSourceOrg | quote | org.func.PurchaseOrg |  |  | nullable |
| 163 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 164 | memo | 备注 | memo | text | String |  |  | nullable |
| 165 | tplid | 模板id | tplid | long | Long |  |  | nullable |
| 166 | barCode | 条形码 | bar_code | text | String |  |  | nullable |
| 167 | merchantAuth | 客户权限 | iAgentId | quote | pb.dataauth.MerchantAuthDataAuth |  |  | nullable |
| 168 | erpSynStatusCode | ERP同步状态编码 | iErpSynStatusCode | text | String |  |  | nullable |
| 169 | erpSynStatus | ERP同步状态 | iErpSynStatus | text | String |  |  | nullable |
| 170 | erpSynFailInfo | ERP同步失败原因 | iErpSynFailInfo | text | String |  |  | nullable |
| 171 | exchangeStatus | 交换状态 | exchangeStatus | short | Short |  |  | nullable |
| 172 | failedInfo | 失败信息 | failedInfo | text | String |  |  | nullable |
| 173 | orderPubts | 销售订单主表时间戳 | orderPubts | timestamp | Timestamp |  |  | nullable |
| 174 | expiredayConfirmType | 到期日确定方式 | expiredayConfirmType | short | Short |  |  | nullable |
| 175 | isLowestPrice | 是否超最低售价 | isLowestPrice | switch | Boolean |  |  | nullable |
| 176 | isSalePriceModify | 报价支持手工录入 | isSalePriceModify | switch | Boolean |  |  | nullable |
| 177 | oadayConfirmType | 出账日确定方式 | oadayConfirmType | short | Short |  |  | nullable |
| 178 | isChangeShipmentPlan | 变更发货计划 | bIsChangeShipmentPlan | switch | Boolean |  |  | nullable |
| 179 | isAllowOrginReplenish | 是否允许原单补货 | isAllowOrginReplenish | switch | Boolean |  |  | nullable |
| 180 | bEffectStock | 影响可用量参数 | bEffectStock | switch | Boolean |  |  | nullable |
| 181 | isFinishDelivery | 订单是否发完货 | bFinishDelivery | switch | Boolean |  |  | nullable |
| 182 | orderCreateDate | 单据日期(订货端) | dOrderCreateDate | timestamp | Timestamp |  |  | nullable |
| 183 | invoiceContent | 发票内容 | cInvoiceContent | text | String |  |  | nullable |
| 184 | couponsMoney | 优惠劵 | fCouponsMoney | number | Decimal |  |  | nullable |
| 185 | lowCodeFlowId | 低代码流程ID | lowCodeFlowId | text | String |  |  | nullable |
| 186 | outSysKey | 接口标识 | cOutSysKey | text | String |  |  | nullable |
| 187 | downloadU8 | erp是否下载 | bDownloadU8 | switch | Boolean |  |  | nullable |
| 188 | downloadU8Date | 下载时间 | cDownloadU8Date | timestamp | Timestamp |  |  | nullable |
| 189 | erpTS | 上传订单变更时间戳 | cErpTS | text | String |  |  | nullable |
| 190 | downloadSource | 下载去向 | cDownloadSource | short | Short |  |  | nullable |
| 191 | downloadMsg | 下载返回消息 | cDownloadMsg | text | String |  |  | nullable |
| 192 | downSuccess | 是否下载成功 | isDownSuccess | switch | Boolean |  |  | nullable |
| 193 | iDeleted | 是否删除 | iDeleted | short | Short |  |  | nullable |
| 194 | haveDelivery | 是否存在发货单 | isHaveDelivery | switch | Boolean |  |  | nullable |
| 195 | occupyInventory | 库存占用时机 | cOccupyInventory | text | String |  |  | nullable |
| 196 | reight | 运费 | fReight | number | Decimal |  |  | nullable |
| 197 | headFreeItem | 变更单表头自由自定义项 | - | - | voucher.orderchange.OrderChangeFreeDefine |  |  |  |
| 198 | headItem | 变更单表头自定义项 | - | - | voucher.orderchange.OrderChangeDefine |  |  |  |
| 199 | orderChangePaymentExeDetail | 收款执行明细变更单 | - | - | voucher.orderchange.OrderChangePaymentExeDetail |  |  |  |
| 200 | orderChangePaymentSchedules | 收款计划表变更单 | - | - | voucher.orderchange.OrderChangePaymentSchedules |  |  |  |
| 201 | orderDetailGroups | 订单变更分组 | - | - | voucher.orderchange.OrderChangeDetailGroup |  |  |  |
| 202 | orderDetails | 变更单商品表 | - | - | voucher.orderchange.OrderChangeDetail |  |  |  |
| 203 | orderPrices | 变更单金额 | - | - | voucher.orderchange.OrderChangePrice |  |  |  |
| 204 | throwStatus | 抛单状态 | throw_status | int | Integer |  |  | nullable |

---

## Reference Fields (33)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | transactionTypeId | 交易类型id | iTransactionTypeId | bd.bill.TransType |
| 2 | salesOrgId | 销售组织 | iSalesOrgId | org.func.SalesOrg |
| 3 | agentId | 客户 | iAgentId | aa.merchant.Merchant |
| 4 | saleDepartmentId | 销售部门id | iSaleDepartmentId | bd.adminOrg.DeptOrgVO |
| 5 | corpContact | 销售业务员id | iCorpContactId | bd.staff.Staff |
| 6 | saleAreaId | 销售区域 | iSaleAreaId | aa.salearea.SaleArea |
| 7 | custId | 伙伴 | iCustomerId | aa.merchant.Merchant |
| 8 | receiverCustId | 收货客户 | iReceiverCust | aa.merchant.Merchant |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 10 | tradeRouteID | 贸易路径Id | tradeRouteID | sccs.multitrade.TradeRoute |
| 11 | receiveContacterId | 客户联系人id | iReceiveContacterId | aa.merchant.Contacter |
| 12 | orderShippingAddress | 收货地址信息 | iOrderShippingAddressId | voucher.order.OrderShippingAddress |
| 13 | receiveStore | 客户收货门店Id | iReceiveStore | aa.store.Store |
| 14 | mainprojectId | 项目projectId | cProjectId | bd.project.ProjectVO |
| 15 | deliveryMethod | 交付方式 | deliveryMethod | usp.deliverymethod.Deliverymethod |
| 16 | settlement | 结算方式id | iSettlementId | aa.settlemethod.SettleMethod |
| 17 | settlementOrgId | 开票组织id | iSettlementOrgId | org.func.FinanceOrg |
| 18 | invoiceAgentId | 开票客户id | iInvoiceAgentId | aa.merchant.Merchant |
| 19 | receiveAgreementId | 收款协议id | iReceiveAgreementId | bd.receivables.ReceiveAgreement |
| 20 | bdInvoiceTypeId | 发票类型id | bdInvoiceTypeId | bd.invoice.InvoiceTypeVO |
| 21 | orderInvoice | 发票信息 | iOrderInvoiceId | voucher.order.OrderInvoice |
| 22 | endAreaId | 目的地运输区域 | endAreaId | base.shipregion.ShipRegion |
| 23 | originalOrderId | 原单id | iOriginalOrderId | voucher.order.Order |
| 24 | orderErp | 订单变更erp | iOrderErpId | voucher.order.OrderErp |
| 25 | shippingChoiceId | 发运方式id | cShippingChoiceId | aa.sendtrans.SendTransWay |
| 26 | agentRelationId | 客户交易关系id | iAgentRelationId | aa.merchant.MerchantApplyRange |
| 27 | creatorId | 创建人id | iSubmiterId | base.user.User |
| 28 | auditorId | 审核人ID | iAuditorId | base.user.User |
| 29 | closerId | 关闭人ID | iCloserId | base.user.User |
| 30 | modifierId | 修改人id | iModifierId | base.user.User |
| 31 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 32 | synSourceOrg | 协同来源组织id | iSynSourceOrg | org.func.PurchaseOrg |
| 33 | merchantAuth | 客户权限 | iAgentId | pb.dataauth.MerchantAuthDataAuth |

---

## Child Tables (7)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | orderDetails | 变更单商品表 | voucher.orderchange.OrderChangeDetail |
| 2 | orderChangePaymentExeDetail | 收款执行明细变更单 | voucher.orderchange.OrderChangePaymentExeDetail |
| 3 | headFreeItem | 变更单表头自由自定义项 | voucher.orderchange.OrderChangeFreeDefine |
| 4 | orderPrices | 变更单金额 | voucher.orderchange.OrderChangePrice |
| 5 | orderDetailGroups | 订单变更分组 | voucher.orderchange.OrderChangeDetailGroup |
| 6 | headItem | 变更单表头自定义项 | voucher.orderchange.OrderChangeDefine |
| 7 | orderChangePaymentSchedules | 收款计划表变更单 | voucher.orderchange.OrderChangePaymentSchedules |
