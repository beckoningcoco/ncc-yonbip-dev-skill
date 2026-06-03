---
tags: [BIP, metadata, voucher, DeliveryVoucher]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发货单主表 (voucher.delivery.DeliveryVoucher)

> Platform: BIP V5 | Module: voucher | Table: deliveryvoucher | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发货单主表 |
| uri | voucher.delivery.DeliveryVoucher |
| tableName | deliveryvoucher |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderVouch |
| isBusinessObject | true |
| description | 发货单主表 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (11)

| # | Name | URI |
|---|------|-----|
| 1 | U订货租户相关 (IUordercorp) | base.itf.IUordercorp |
| 2 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 3 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 4 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 5 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 6 | 伙伴表头接口 (ICust) | uorder.voucher.ICust |
| 7 | 计税方式接口 (ITaxSettingType) | sale.aa.ITaxSettingType |
| 8 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 9 | 交换信息 (IExchangeInfo) | gscm.itf.IExchangeInfo |
| 10 | 商家相关 (IShop) | base.itf.IShop |
| 11 | 审批提交信息 (ISubmitInfo) | ucfbase.ucfbaseItf.ISubmitInfo |

---

## All Fields (171)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createSource | 数据来源 | cCreateSource | text | String |  |  | nullable |
| 2 | jobCompleteStatus | 作业完成状态 | cJobCompleteStatus | text | String |  |  | nullable |
| 3 | receievInvoiceEmail | 收票邮箱 | receievinvoiceemail | text | String |  |  | nullable |
| 4 | receievInvoiceMobile | 收票手机号 | receievinvoicemobile | text | String |  |  | nullable |
| 5 | sourceTerminal | 来源终端 | cSourceTerminal | text | String |  |  | nullable |
| 6 | invoiceUpcType | 发票类型 | iInvoiceUpcType | short | Short |  |  | nullable |
| 7 | bdInvoiceTypeId | 发票类型 | bdInvoiceTypeId | quote | bd.invoice.InvoiceTypeVO |  |  | nullable |
| 8 | custId | 伙伴 | iCustomerId | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 9 | deliveryVoucherDefineCharacter | 自定义项特征属性组 | deliveryVoucherDefineCharacter | UserDefine | voucher.delivery.DeliveryVoucherDefineCharacter |  |  | nullable |
| 10 | distributionSide | 配送方 | distributionSide | text | String |  |  | nullable |
| 11 | exchRateDate | 汇率日期 | exchRateDate | date | Date |  |  | nullable |
| 12 | receiverCustId | 收货客户 | iReceiverCust | quote | aa.merchant.Merchant |  |  | dataPowerFlag,data_auth,nullable |
| 13 | saleAreaId | 销售区域 | iSaleAreaId | quote | aa.salearea.SaleArea |  |  | data_auth,nullable |
| 14 | settlementOrgName | 财务组织 | cSettlementOrgName | text | String |  |  | nullable |
| 15 | failedInfo | 失败信息 | failedInfo | text | String |  |  | nullable |
| 16 | oneTimeOutboundClosure | 一次出库即关闭 | onetimeout_bound_closure | int | Integer |  |  | nullable |
| 17 | shop | 商家 | iShopID | long | Long |  | Y | nullable,reportHide |
| 18 | billBusinessType | 业务类型 | billBusinessType | short | Short |  |  | nullable |
| 19 | submitTime | 提交时间 | submit_time | dateTime | Timestamp |  |  | nullable |
| 20 | submitter | 提交人 | submitter | quote | base.user.BipUser |  |  | nullable |
| 21 | withdrawTime | 撤回提交时间 | withdraw_time | dateTime | Timestamp |  |  | nullable |
| 22 | withdrawpp | 撤回提交的人 | withdrawpp | quote | base.user.BipUser |  |  | nullable |
| 23 | logisticsUserId | 送货人id | cLogisticsUserId | text | String |  |  | nullable |
| 24 | wholeFavorableRate | 整单倒扣 | fWholeFavorableRate | number | Decimal |  |  | nullable |
| 25 | taxSettingType | 计税方式 | taxSettingType | short | Short |  |  | nullable |
| 26 | exchangeStatus | 交换状态 | exchangeStatus | short | Short |  |  | nullable |
| 27 | logisticsCarId | 物流车辆id | cLogisticsCarId | text | String |  |  | nullable |
| 28 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 29 | stockOrgName | 库存组织 | cStockOrgName | text | String |  |  | nullable |
| 30 | transactionTypeId_name | 交易类型 | transactionTypeId_name | text | String |  |  | nullable |
| 31 | offerSaleCost | 报价含税金额 | fOfferSaleCost | number | Decimal |  |  | nullable |
| 32 | wholeDiscountMoney | 整单扣额(含返利) | fWholeDiscountMoney | number | Decimal |  |  | nullable |
| 33 | isDespatch | 启用发运管理 | isDespatch | switch | Boolean |  |  | nullable |
| 34 | wholeDiscountRate | 整单扣率%(含返利) | fWholeDiscountRate | number | Decimal |  |  | nullable |
| 35 | stockOrgId | 库存组织 | iStockOrgId | quote | org.func.InventoryOrg |  |  | data_auth,isMasterOrg,nullable |
| 36 | logisticsOrgId | 物流组织id | logisticsOrgId | quote | org.func.LogisticsOrg |  |  | nullable |
| 37 | transactionTypeId | 交易类型 | cTransactionId | quote | bd.bill.TransType |  |  | data_auth,isTransactionType,nullable |
| 38 | systemDate | 制单系统时间 | dSystemDate | date | Date |  |  | nullable |
| 39 | vouchdate | 单据日期 | dDeliveryVoucherDate | date | Date | Y |  | nullable |
| 40 | code | 发货单编号 | cDeliveryNo | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 41 | agentId | 客户 | iAgentId | quote | aa.merchant.Merchant |  |  | dataPowerFlag,data_auth,nullable |
| 42 | retailAgentName | 散户名称 | cRetailAgentName | text | String |  |  | nullable |
| 43 | receiveContacterId | 客户联系人id | iReceiveContacterId | quote | aa.merchant.Contacter |  |  | nullable |
| 44 | receiveContacter | 客户联系人 | cReceiveContacter | text | String |  |  | nullable |
| 45 | receiveContacterPhone | 客户联系人移动电话 | cReceiveContacterPhone | text | String |  |  | nullable |
| 46 | receiveContacterTelephone | 客户联系人固定电话 | cReceiveContacterTelephone | text | String |  |  | nullable |
| 47 | reight | 运费金额 | fReight | number | Decimal |  |  | nullable |
| 48 | payMoney | 含税金额 | fPayMoney | number | Decimal |  |  | nullable |
| 49 | deliveryPayMoney | 实付金额(不含运费) | fDeliveryPayMoney | number | Decimal |  |  | nullable |
| 50 | realMoney | 应收金额 | fRealMoney | number | Decimal |  |  | nullable |
| 51 | deliveryRealMoney | 应收金额(不含运费) | fDeliveryRealMoney | number | Decimal |  |  | nullable |
| 52 | rebateToOrderMoney | 整单返利金额 | fRebateToOrderMoney | number | Decimal |  |  | nullable |
| 53 | rebateToCashMoney | 抵现返利金额 | fRebateToCashMoney | number | Decimal |  |  | nullable |
| 54 | settlementOrgId | 开票组织id | iSettlementOrgId | quote | org.func.FinanceOrg |  |  | nullable |
| 55 | statusCode | 发货状态 | cStatusCode | text | String |  |  | nullable |
| 56 | shippingMemo | 备注 | cShippingMemo | text | String |  |  | nullable |
| 57 | deliveryDepartmentId | 发货部门id-废弃 | iDeliveryDepartmentId | long | Long |  |  | nullable |
| 58 | outSysKey | 接口标识 | cOutSysKey | text | String |  |  | nullable |
| 59 | source | API来源 | cSource | text | String |  |  | nullable |
| 60 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 61 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 62 | returncount | 退回次数(审批流) | returncount | short | Short |  |  | nullable,reportHide |
| 63 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 64 | receiveDate | 收货时间 | dReceiveDate | date | Date |  |  | nullable |
| 65 | defaultReceiveDay | 自动收货天数 | iDefaultReceiveDay | int | Integer |  |  | nullable |
| 66 | unConfirmPrice | 支付未审核的金额-废弃 | fUnConfirmPrice | number | Decimal |  |  | nullable |
| 67 | confirmPrice | 已支付金额-废弃 | fConfirmPrice | number | Decimal |  |  | nullable |
| 68 | payStatusCode | 支付状态-废弃 | cPayStatusCode | text | String |  |  | nullable |
| 69 | enable | 是否有效 | bEnable | switch | Boolean |  |  | nullable |
| 70 | bizId | 供应商id | iBizId | long | Long |  |  | nullable |
| 71 | bizName | 供应商名称 | cBizName | text | String |  |  | nullable |
| 72 | agentRelationId | 客户交易关系id | iAgentRelationId | quote | aa.merchant.MerchantApplyRange |  |  | nullable |
| 73 | outSysNo | 接口外部单号 | cOutSysNo | text | String |  |  | nullable |
| 74 | uordercorp | 租户id | iCorpId | long | Long |  | Y | nullable,reportHide |
| 75 | version | 版本 | version | short | Short |  |  | nullable |
| 76 | status | 单据状态 | status | short | Short |  |  | nullable |
| 77 | creator | 制单人 | cCreator | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 78 | creatorId | 制单人id | iSubmitUserId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 79 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 80 | createTime | 创建时间 | dCreated | date | Date |  |  | isBusinessLog,nullable |
| 81 | auditorId | 审核人id | iConfirmUserId | quote | base.user.User |  |  | nullable,BUSINESSMESSAGE |
| 82 | auditor | 审核人 | auditor | text | String |  |  | isGlobalization,nullable |
| 83 | auditDate | 审批日期 | audit_date | date | Date |  |  | nullable |
| 84 | auditTime | 审核时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 85 | modifierId | 修改id | iModifierId | quote | base.user.User |  |  | isBusinessLog,nullable,BUSINESSMESSAGE |
| 86 | modifier | 修改人 | cModifier | text | String |  |  | isGlobalization,isBusinessLog,nullable |
| 87 | postDepsJob | 过账依赖作业 | postDepsJob | text | String |  |  | nullable |
| 88 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 89 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 90 | printMessage | 打印信息-废弃 | cPrintMessage | text | String |  |  | nullable |
| 91 | despatchStatus | 过账状态 | despatchStatus | text | String |  |  | nullable |
| 92 | lastPrintDate | 最近打印日期-废弃 | dLastPrintDate | date | Date |  |  | nullable |
| 93 | lastPrintUserId | 最近打印人Id-废弃 | iLastPrintUserId | long | Long |  |  | nullable |
| 94 | lastPrintUserName | 最近打印人-废弃 | cLastPrintUserName | text | String |  |  | nullable |
| 95 | despatchStatusType | 过账依赖状态类型 | despatchStatusType | text | String |  |  | nullable |
| 96 | despatchStatusValue | 过账依赖状态值 | despatchStatusValue | text | String |  |  | nullable |
| 97 | shipPointId | 发货点id | shipPointId | quote | usp.sendAndReceiveSite.SendAndReceiveSite |  |  | nullable |
| 98 | logisticWayId | 物流公司id | iLogisticWayId | quote | aa.deliverycorp.Deliverycorp |  |  | nullable |
| 99 | logisticsBillNo | 物流单号 | cLogisticsBillNo | text | String |  |  | nullable |
| 100 | logisticsCarNum | 车牌号 | cLogisticsCarNum | text | String |  |  | nullable |
| 101 | tarnsOperationRelevant | 运输作业相关性 | tarnsOperationRelevant | text | String |  |  | nullable |
| 102 | logisticsUserName | 司机姓名 | cLogisticsUserName | text | String |  |  | nullable |
| 103 | startAreaId | 始发地运输区域id | startAreaId | quote | base.shipregion.ShipRegion |  |  | nullable |
| 104 | logisticsUserPhone | 司机电话 | cLogisticsUserPhone | text | String |  |  | nullable |
| 105 | endAreaId | 目的地运输区域id | endAreaId | quote | base.shipregion.ShipRegion |  |  | nullable |
| 106 | receiver | 收货联系人 | cReceiver | text | String |  |  | nullable |
| 107 | receiveMobile | 收货联系人移动电话 | cReceiveMobile | text | String |  |  | nullable |
| 108 | planTransRouteId | 计划运输路线id | planTransRouteId | quote | usp.plantransportroute.PlanTransportRoute |  |  | nullable |
| 109 | receiveTelePhone | 收货联系人固定电话 | cReceiveTelePhone | text | String |  |  | nullable |
| 110 | receiveAddress | 收货地址 | cReceiveAddress | text | String |  |  | nullable |
| 111 | invoiceAgentId | 开票客户id | iInvoiceAgentId | quote | aa.merchant.Merchant |  |  | nullable |
| 112 | tpEndDate | 要求运输计划完成日期 | tpEndDate | date | Date |  |  | nullable |
| 113 | invoiceAgentName | 开票客户 | cInvoiceAgentName | text | String |  |  | nullable |
| 114 | pASPDate | 要求设备到达发货点日期 | pASPDate | date | Date |  |  | nullable |
| 115 | modifyInvoiceType | 发票类型可改 | bModifyInvoiceType | switch | Boolean |  |  | nullable |
| 116 | planTransSDate | 要求运输起运日期 | planTransSDate | date | Date |  |  | nullable |
| 117 | isWO | 仓储作业相关性 | is_WO | text | String |  |  | nullable |
| 118 | invoiceTitleType | 抬头类型 | iInvoiceTitleType | - | aa.merchant.EnterpriseNature |  |  | nullable |
| 119 | wopStrateDate | 要求仓储作业开始日期 | wopStrateDate | date | Date |  |  | nullable |
| 120 | invoiceTitle | 发票抬头 | cInvoiceTitle | text | String |  |  | nullable |
| 121 | wopEndDate | 要求仓储作业完成日期 | wopEndDate | date | Date |  |  | nullable |
| 122 | planReceivingDate | 计划到货日期 | planReceivingDate | date | Date |  |  | nullable |
| 123 | taxNum | 纳税识别号 | cTaxNum | text | String |  |  | nullable |
| 124 | bankName | 开户银行 | cBankName | text | String |  |  | nullable |
| 125 | subBankName | 开户支行 | cSubBankName | text | String |  |  | nullable |
| 126 | bankAccount | 银行账号 | cBankAccount | text | String |  |  | nullable |
| 127 | invoiceTelephone | 营业电话 | cInvoiceTelephone | text | String |  |  | nullable |
| 128 | invoiceAddress | 营业地址 | cInvoiceAddress | text | String |  |  | nullable |
| 129 | sourceType | 来源单据 | cSourceType | text | String |  |  | isMakeBill,nullable |
| 130 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 131 | isFlowCoreBill | 是否流程核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 132 | receiveStore | 客户收货门店Id | iReceiveStore | quote | aa.store.Store |  |  | nullable |
| 133 | receiveId | 客户收货地址Id | iReceiveId | long | Long |  |  | nullable |
| 134 | receiveZipCode | 收货人区域编码 | cReceiveZipCode | text | String |  |  | nullable |
| 135 | shippingChoiceId | 发运方式id | cShippingChoiceId | quote | aa.sendtrans.SendTransWay |  |  | nullable |
| 136 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 137 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 138 | stopper | 终止人 | stopper | text | String |  |  | nullable |
| 139 | stopperId | 终止人id | iStopperId | quote | base.user.User |  |  | nullable |
| 140 | stopTime | 终止时间 | stop_time | timestamp | Timestamp |  |  | nullable |
| 141 | stopDate | 终止日期 | stop_date | date | Date |  |  | nullable |
| 142 | id | 主表id | id | long | Long |  |  | nullable,REF.ID |
| 143 | orderId | 订单id | orderId | long | Long |  |  | nullable |
| 144 | tplid | 模板id | tplid | long | Long |  |  | nullable |
| 145 | salesOrgName | 销售组织-废弃 | cSalesOrgName | text | String |  |  | nullable |
| 146 | corpContact | 企业业务员 | iCorpContactId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 147 | corpContactUserName | 业务员姓名 | cCorpContactUserName | text | String |  |  | nullable |
| 148 | saleDepartmentId | 销售部门id | iSaleDepartmentId | quote | bd.adminOrg.DeptOrgVO |  |  | dataPowerFlag,data_auth,nullable |
| 149 | shippingChoiceCode | 未定义名称 | cShippingChoiceCode | text | String |  |  | nullable |
| 150 | deliveryPrice | 发货单金额 | iDeliveryPriceId | quote | voucher.delivery.DeliveryPrice |  |  | nullable |
| 151 | deleted | 是否删除 | iDeleted | short | Short |  |  | nullable |
| 152 | saleDepartmentName | 销售部门-废弃 | cSaleDepartmentName | text | String |  |  | nullable |
| 153 | iConfirmUserId | 审核人(冗余字段) | iConfirmUserId | long | Long |  |  | nullable |
| 154 | invoiceType | 发票类型 | cInvoiceType | text | String |  |  | nullable |
| 155 | deliveryStockId | 收货仓库id | iDeliveryStockId | long | Long |  |  | nullable |
| 156 | submitName | 提交人 | cSubmitName | text | String |  |  | nullable |
| 157 | salesOrgId | 销售组织id | iSalesOrgId | quote | org.func.SalesOrg |  |  | nullable |
| 158 | sendDate | 发货时间 | dSendDate | date | Date |  |  | nullable |
| 159 | settVoucherType | 结算类型 | cSettVoucherType | text | String |  |  | nullable |
| 160 | closerId | 关闭人ID | iCloserId | quote | base.user.User |  |  | nullable |
| 161 | invoiceContent | 发票内容 | cInvoiceContent | text | String |  |  | nullable |
| 162 | totalMoney | 总金额 | fTotalMoney | number | Decimal |  |  | nullable |
| 163 | orgId | 组织ID | iOrgId | quote | org.func.BaseOrg |  |  | nullable |
| 164 | merchantAuth | 客户权限 | iAgentId | quote | pb.dataauth.MerchantAuthDataAuth |  |  | nullable |
| 165 | corpContactUserErpCode | 业务员erp编码 | cCorpContactUserErpCode | text | String |  |  | nullable |
| 166 | orderNo | 订单号 | cOrderNo | text | String |  |  | nullable |
| 167 | shippingMemoId | 备注id | iShippingMemoId | long | Long |  |  | nullable |
| 168 | deliveryDetails | 发货单详情 | - | - | voucher.delivery.DeliveryDetail |  |  |  |
| 169 | deliveryPrices | 发货金额 | - | - | voucher.delivery.DeliveryPrice |  |  |  |
| 170 | headFreeItem | 销售发货单表头自由自定义项 | - | - | voucher.delivery.DeliveryVoucherFreeItem |  |  |  |
| 171 | headItem | 销售发货单表头自定义项 | - | - | voucher.delivery.DeliveryVoucherCustomItem |  |  |  |

---

## Reference Fields (34)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | bdInvoiceTypeId | 发票类型 | bdInvoiceTypeId | bd.invoice.InvoiceTypeVO |
| 2 | custId | 伙伴 | iCustomerId | aa.merchant.Merchant |
| 3 | receiverCustId | 收货客户 | iReceiverCust | aa.merchant.Merchant |
| 4 | saleAreaId | 销售区域 | iSaleAreaId | aa.salearea.SaleArea |
| 5 | submitter | 提交人 | submitter | base.user.BipUser |
| 6 | withdrawpp | 撤回提交的人 | withdrawpp | base.user.BipUser |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 8 | stockOrgId | 库存组织 | iStockOrgId | org.func.InventoryOrg |
| 9 | logisticsOrgId | 物流组织id | logisticsOrgId | org.func.LogisticsOrg |
| 10 | transactionTypeId | 交易类型 | cTransactionId | bd.bill.TransType |
| 11 | agentId | 客户 | iAgentId | aa.merchant.Merchant |
| 12 | receiveContacterId | 客户联系人id | iReceiveContacterId | aa.merchant.Contacter |
| 13 | settlementOrgId | 开票组织id | iSettlementOrgId | org.func.FinanceOrg |
| 14 | agentRelationId | 客户交易关系id | iAgentRelationId | aa.merchant.MerchantApplyRange |
| 15 | creatorId | 制单人id | iSubmitUserId | base.user.User |
| 16 | auditorId | 审核人id | iConfirmUserId | base.user.User |
| 17 | modifierId | 修改id | iModifierId | base.user.User |
| 18 | shipPointId | 发货点id | shipPointId | usp.sendAndReceiveSite.SendAndReceiveSite |
| 19 | logisticWayId | 物流公司id | iLogisticWayId | aa.deliverycorp.Deliverycorp |
| 20 | startAreaId | 始发地运输区域id | startAreaId | base.shipregion.ShipRegion |
| 21 | endAreaId | 目的地运输区域id | endAreaId | base.shipregion.ShipRegion |
| 22 | planTransRouteId | 计划运输路线id | planTransRouteId | usp.plantransportroute.PlanTransportRoute |
| 23 | invoiceAgentId | 开票客户id | iInvoiceAgentId | aa.merchant.Merchant |
| 24 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 25 | receiveStore | 客户收货门店Id | iReceiveStore | aa.store.Store |
| 26 | shippingChoiceId | 发运方式id | cShippingChoiceId | aa.sendtrans.SendTransWay |
| 27 | stopperId | 终止人id | iStopperId | base.user.User |
| 28 | corpContact | 企业业务员 | iCorpContactId | bd.staff.Staff |
| 29 | saleDepartmentId | 销售部门id | iSaleDepartmentId | bd.adminOrg.DeptOrgVO |
| 30 | deliveryPrice | 发货单金额 | iDeliveryPriceId | voucher.delivery.DeliveryPrice |
| 31 | salesOrgId | 销售组织id | iSalesOrgId | org.func.SalesOrg |
| 32 | closerId | 关闭人ID | iCloserId | base.user.User |
| 33 | orgId | 组织ID | iOrgId | org.func.BaseOrg |
| 34 | merchantAuth | 客户权限 | iAgentId | pb.dataauth.MerchantAuthDataAuth |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | headFreeItem | 销售发货单表头自由自定义项 | voucher.delivery.DeliveryVoucherFreeItem |
| 2 | deliveryDetails | 发货单详情 | voucher.delivery.DeliveryDetail |
| 3 | headItem | 销售发货单表头自定义项 | voucher.delivery.DeliveryVoucherCustomItem |
| 4 | deliveryPrices | 发货金额 | voucher.delivery.DeliveryPrice |
