---
title: "销售订单详情查询"
apiId: "b37abde0809f4192945236a10c0ad86b"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Sales Order"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单详情查询

> `ContentType` 请求方式	GET | 分类: Sales Order (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/sd/voucherorder/detail

请求方式	GET

ContentType

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID     示例: 1836969996587264 |

## 3. 请求示例

Url: /yonbip/sd/voucherorder/detail?access_token=访问令牌&id=1836969996587264

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| receiveTelePhone | string | 否 | 收货人固定电话 |
| receiveZipCode | string | 否 | 收货人邮编 |
| cSettlementCode | string | 否 | 结算方式编码 |
| salesOrgId | string | 否 | 销售组织id |
| salesOrgId_name | string | 否 | 销售组织名称 |
| transactionTypeId | string | 否 | 交易类型id |
| transactionTypeId_name | string | 否 | 交易类型名称 |
| vouchdate | string | 否 | 单据日期 |
| auditDate | string | 否 | 审批日期 |
| code | string | 否 | 单据编号 |
| agentId_name | string | 否 | 客户名称 |
| retailAgentName | string | 否 | 散户名称 |
| retailInvestors | string | 否 | 是否散户, true:是、false:否、 |
| receiveContacter | string | 否 | 客户联系人 |
| receiveContacterPhone | string | 否 | 客户联系电话 |
| receievInvoiceMobile | string | 否 | 收票手机号 |
| receievInvoiceEmail | string | 否 | 收票邮箱 |
| purchaseNo | string | 否 | 客户采购订单号 |
| saleDepartmentId | string | 否 | 销售部门id |
| saleDepartmentId_name | string | 否 | 销售部门名称 |
| corpContact | string | 否 | 销售业务员id |
| corpContactUserName | string | 否 | 销售业务员 |
| corpContactUserErpCode | string | 否 | 业务员erp编码 |
| settlementOrgId | string | 否 | 开票组织id |
| sendDate | string | 否 | 计划发货日期 |
| hopeReceiveDate | string | 否 | 希望到货日期 |
| settlementOrgId_name | string | 否 | 开票组织名称 |
| id | string | 否 | 主体id |
| parentOrderNo | string | 否 | 拆单来源订单号 |
| agentId | string | 否 | 客户id |
| source | string | 否 | 单据来源, 0:PC端、1:移动端、3:导入、4:ERP、 |
| submitSource | string | 否 | 制单人类型 |
| confirmer | string | 否 | 确认人 |
| orderDate | string | 否 | 订单日期 |
| confirmDate | string | 否 | 订单确认时间 |
| payDate | string | 否 | 订单付款时间 |
| settVoucherType | string | 否 | 结算类型 |
| opposeMemo | string | 否 | 驳回批注 |
| statusCode | string | 否 | 订单当前状态码 |
| nextStatusName | string | 否 | 订单状态 |
| currentStatus | string | 否 | 当前状态位置 |
| haveDelivery | string | 否 | 是否存在发货单, true:是、false:否、 |
| separatePromotionType | string | 否 | 拆单规则标识 |
| bizId | string | 否 | 商家id |
| bizName | string | 否 | 商家名称 |
| agentRelationId | string | 否 | 客户交易关系id |
| points | string | 否 | 积分 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| orderInvoice | string | 否 | 发票信息 |
| orderShippingAddress | string | 否 | 收货地址信息 |
| orderErp | string | 否 | 订单erp |
| deliveryDate | string | 否 | 交货日期 |
| outSysKey | string | 否 | 接口标识 |
| invoiceMoney | string | 否 | 发票金额 |
| downloadU8 | string | 否 | erp是否下载 |
| downloadU8Date | string | 否 | 下载时间 |
| erpTS | string | 否 | 上传订单时间戳 |
| downloadSource | string | 否 | 下载去向 |
| downloadMsg | string | 否 | 下载返回消息 |
| downSuccess | string | 否 | 是否下载成功 |
| iDeleted | string | 否 | 是否删除，0：未删除，1：逻辑删除 |
| version | string | 否 | 版本号 |
| isWfControlled | string | 否 | 是否审批流控制 |
| verifystate | string | 否 | 审批状态 |
| status | string | 否 | 单据状态, 0:开立、3:审核中、1:已审核、2:已关闭、 |
| returncount | string | 否 | 退回次数 |
| orderPrices | object | 否 | 订单价格 |
| receiveAgreementId | number |
| 小数位数:0,最大长度:28 | 否 | 收款协议id |
| receiveAgreementId_name | string | 否 | 收款协议名称 |
| headItem | object | 否 | 表头自定义项 |
| changeVersion | string | 否 | 变更版本号 |
| receiveId | string | 否 | 收货人id |
| receiver | string | 否 | 收货人 |
| receiveMobile | string | 否 | 收货电话 |
| receiveAddress | string | 否 | 收货地址 |
| orderPayType | string | 否 | 支付方式, FIRSTPAY:款到发货、FIRSTDELIVER:其他、 |
| settlement_name | string | 否 | 结算方式名称 |
| settlement | string | 否 | 结算方式id |
| shippingChoiceId_name | string | 否 | 发运方式名称 |
| shippingChoiceId | string | 否 | 发运方式id |
| creditBalance | number |
| 小数位数:8,最大长度:28 | 否 | 客户信用余额 |
| pushProApplyOrder | string | 否 | 是否可下推生产和请购 |
| showVoucherBtn | string | 否 | 是否显示下游按钮 |
| showUnAudit | string | 否 | 是否显示弃审按钮 |
| finishDelivery | string | 否 | 是否完全发货 |
| flowPushVoucher | string | 否 | 是否走业务流 |
| shippingChoiceId_code | string | 否 | 发运方式编码 |
| address | string | 否 | 注册地址 |
| occupyInventory | string | 否 | 库存占用时机, SUBMIT:提交、CONFIRM:确认、 |
| telephone | string | 否 | 注册电话 |
| userBankName | string | 否 | 开户名 |
| bankCode | string | 否 | 开户行编码 |
| invoiceAgentId | string | 否 | 开票客户id |
| invoiceAgentId_name | string | 否 | 开票客户名称 |
| modifyInvoiceType | string | 否 | 发票类型可改, true:是、false:否、 |
| invoiceUpcType | string | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票） |
| invoiceTitleType | string | 否 | 抬头类型, 0:企业、1:个人、2:非营利组织、 |
| invoiceTitle | string | 否 | 发票抬头 |
| taxNum | string | 否 | 纳税识别号 |
| bankName | string | 否 | 开户银行 |
| subBankName | string | 否 | 开户支行 |
| bankAccount | string | 否 | 银行账号 |
| invoiceTelephone | string | 否 | 营业电话 |
| invoiceAddress | string | 否 | 营业地址 |
| totalMoney | number |
| 小数位数:8,最大长度:28 | 否 | 总金额 |
| promotionMoney | number |
| 小数位数:8,最大长度:28 | 否 | 总优惠金额 |
| rebateMoney | number |
| 小数位数:8,最大长度:28 | 否 | 折扣返利金额 |
| rebateCashMoney | number |
| 小数位数:8,最大长度:28 | 否 | 抵现返利金额 |
| pointsMoney | number |
| 小数位数:8,最大长度:28 | 否 | 积分抵扣金额 |
| reight | number |
| 小数位数:8,最大长度:28 | 否 | 运费 |
| payMoney | number |
| 小数位数:8,最大长度:28 | 否 | 合计含税金额 |
| nextStatus | string | 否 | 订单状态, CONFIRMORDER:开立、DELIVERY_PART:部分发货、DELIVERY_TAKE_PART:部分发货待收货、DELIVERGOODS:待发货、TAKEDELIVERY:待收货、ENDORDER:已完成、OPPOSE:已取消、APPROVING:审批中、 |
| orderPayMoney | number |
| 小数位数:8,最大长度:28 | 否 | 商品实付金额 |
| realMoney | number |
| 小数位数:8,最大长度:28 | 否 | 应收金额 |
| orderRealMoney | number |
| 小数位数:8,最大长度:28 | 否 | 商品应付金额 |
| particularlyMoney | number |
| 小数位数:8,最大长度:28 | 否 | 特殊优惠 |
| unConfirmPrice | number |
| 小数位数:8,最大长度:28 | 否 | 收款待确认金额 |
| confirmPrice | number |
| 小数位数:8,最大长度:28 | 否 | 收款已确认金额 |
| payStatusCode | string | 否 | 支付状态, NOTPAYMENT:未付款、PARTPAYMENT:部分付款、CONFIRMPAYMENT:部分付款待确认、CONFIRMPAYMENT_ALL:付款待确认、FINISHPAYMENT:付款完成、 |
| createSource | string | 否 | API来源, 1:销售、2:U订货门户、4:采购、3:其他外部系统、 |
| lockIn | boolean | 否 | 标记锁 |
| stockCheck | number |
| 小数位数:0,最大长度:28 | 否 | 库存查拣 |
| collectMoney | number |
| 小数位数:8,最大长度:28 | 否 | 累计收款金额 |
| synSourceOrg | string | 否 | 协同来源组织id |
| synSourceTenant | string | 否 | 协同来源租户 |
| bEffectStock | string | 否 | 影响可用量参数 |
| synSourceOrg_name | string | 否 | 协同来源组织名称 |
| pubuts | string | 否 | 时间戳 |
| creator | string | 否 | 制单人 |
| receiveCode | string | 否 | 收货地址编码 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| creatorId | string | 否 | 创建人 |
| auditorId | string | 否 | 审核人ID |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间 |
| closerId | string | 否 | 关闭人ID |
| closeTime | string | 否 | 关闭时间 |
| closeDate | string | 否 | 关闭日期 |
| closer | string | 否 | 关闭人 |
| modifierId | string | 否 | 修改人id |
| modifyDate | string | 否 | 修改日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| uordercorp | number |
| 小数位数:0,最大长度:28 | 否 | 租户id |
| bmake_st_salesout | string | 否 | 流程出库 |
| bmake_voucher_delivery | string | 否 | 流程发货 |
| bmake_voucher_saleinvoice | string | 否 | 流程开票 |
| bizFlow_name | string | 否 | 流程名称, CONFIRMORDER:开立、DELIVERY_PART:部分发货、DELIVERY_TAKE_PART:部分发货待收货、DELIVERGOODS:待发货、TAKEDELIVERY:待收货、ENDORDER:已完成、OPPOSE:已取消、APPROVING:审批中、 |
| bizFlow | string | 否 | 流程ID, CONFIRMORDER:开立、DELIVERY_PART:部分发货、DELIVERY_TAKE_PART:部分发货待收货、DELIVERGOODS:待发货、TAKEDELIVERY:待收货、ENDORDER:已完成、OPPOSE:已取消、APPROVING:审批中、id |
| bizFlow_version | string | 否 | 版本信息, CONFIRMORDER:开立、DELIVERY_PART:部分发货、DELIVERY_TAKE_PART:部分发货待收货、DELIVERGOODS:待发货、TAKEDELIVERY:待收货、ENDORDER:已完成、OPPOSE:已取消、APPROVING:审批中、 |
| isFlowCoreBill | string | 否 | 是否流程核心单据, CONFIRMORDER:开立、DELIVERY_PART:部分发货、DELIVERY_TAKE_PART:部分发货待收货、DELIVERGOODS:待发货、TAKEDELIVERY:待收货、ENDORDER:已完成、OPPOSE:已取消、APPROVING:审批中、 |
| isLowestPrice | boolean | 否 | 是否超最低售价, true:是 ; false 否 |
| paymentExeDetail | object | 是 | 订单收款执行明细[voucher.order.PaymentExeDetail] |
| tradeRouteID | string | 否 | 贸易路径ID |
| tradeRouteID_code | string | 否 | 贸易路径编码 |
| tradeRouteID_name | string | 否 | 贸易路径 |
| isEndTrade | number |
| 小数位数:0,最大长度:28 | 否 | 是否末级站点 |
| tradeRouteLineno | string | 否 | 站点 |
| entireDeliveryStatus | number |
| 小数位数:0,最大长度:6 | 否 | 发货状态，0：未发货，1：部分发货，2：发货完成 示例：0 |
| entireIssueStatus | number |
| 小数位数:0,最大长度:6 | 否 | 出库状态，0：未出库，1：部分出库，2：出库完成 示例：0 |
| entireInvoiceStatus | number |
| 小数位数:0,最大长度:6 | 否 | 发票状态，0：未开票，1：部分开票，2：开票完成 示例：0 |
| entireSignConfirmStatus | number |
| 小数位数:0,最大长度:6 | 否 | 签收状态，0：未签收，1：部分签收，2：签收完成 示例：0 |
| orderDetails | object | 是 | 销售订单子表[voucher.order.OrderDetail] |
| signSubjects | object | 否 | 合同签署主体[voucher.order.SignSubject] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"receiveTelePhone": "",
		"receiveZipCode": "",
		"cSettlementCode": "",
		"salesOrgId": "",
		"salesOrgId_name": "",
		"transactionTypeId": "",
		"transactionTypeId_name": "",
		"vouchdate": "",
		"auditDate": "",
		"code": "",
		"agentId_name": "",
		"retailAgentName": "",
		"retailInvestors": "",
		"receiveContacter": "",
		"receiveContacterPhone": "",
		"receievInvoiceMobile": "",
		"receievInvoiceEmail": "",
		"purchaseNo": "",
		"saleDepartmentId": "",
		"saleDepartmentId_name": "",
		"corpContact": "",
		"corpContactUserName": "",
		"corpContactUserErpCode": "",
		"settlementOrgId": "",
		"sendDate": "",
		"hopeReceiveDate": "",
		"settlementOrgId_name": "",
		"id": "",
		"parentOrderNo": "",
		"agentId": "",
		"source": "",
		"submitSource": "",
		"confirmer": "",
		"orderDate": "",
		"confirmDate": "",
		"payDate": "",
		"settVoucherType": "",
		"opposeMemo": "",
		"statusCode": "",
		"nextStatusName": "",
		"currentStatus": "",
		"haveDelivery": "",
		"separatePromotionType": "",
		"bizId": "",
		"bizName": "",
		"agentRelationId": "",
		"points": "",
		"pubts": "",
		"orderInvoice": "",
		"orderShippingAddress": "",
		"orderErp": "",
		"deliveryDate": "",
		"outSysKey": "",
		"invoiceMoney": "",
		"downloadU8": "",
		"downloadU8Date": "",
		"erpTS": "",
		"downloadSource": "",
		"downloadMsg": "",
		"downSuccess": "",
		"iDeleted": "",
		"version": "",
		"isWfControlled": "",
		"verifystate": "",
		"status": "",
		"returncount": "",
		"orderPrices": {
			"currency": "",
			"agentTaxItem": "",
			"currency_priceDigit": "",
			"currency_moneyDigit": "",
			"originalCode": "",
			"originalName": "",
			"exchRate": 0,
			"exchangeRateType": "",
			"exchangeRateType_name": "",
			"natCurrency": "",
			"natCurrency_priceDigit": "",
			"natCurrency_moneyDigit": "",
			"domesticCode": "",
			"domesticName": "",
			"taxInclusive": "",
			"totalMoneyOrigTaxfree": 0,
			"rebateMoneyOrigTaxfree": 0,
			"rebateCashMoneyOrigTaxfree": 0,
			"payMoneyOrigTaxfree": 0,
			"orderPayMoneyOrigTaxfree": 0,
			"realMoneyOrigTaxfree": 0,
			"orderRealMoneyOrigTaxfree": 0,
			"reightMoneyOrigTaxfree": 0,
			"particularlyMoneyOrigTaxfree": 0,
			"promotionMoneyOrigTaxfree": 0,
			"pointsMoneyOrigTaxfree": 0,
			"totalMoneyDomestic": 0,
			"rebateMoneyDomestic": 0,
			"rebateCashMoneyDomestic": 0,
			"payMoneyDomestic": 0,
			"orderPayMoneyDomestic": 0,
			"realMoneyDomestic": 0,
			"orderRealMoneyDomestic": 0,
			"reightMoneyDomestic": 0,
			"particularlyMoneyDomestic": 0,
			"promotionMoneyDomestic": 0,
			"pointsMoneyDomestic": 0,
			"totalMoneyDomesticTaxfree": 0,
			"rebateMoneyDomesticTaxfree": 0,
			"rebateCashMoneyDomesticTaxfree": 0,
			"payMoneyDomesticTaxfree": 0,
			"orderPayMoneyDomesticTaxfree": 0,
			"realMoneyDomesticTaxfree": 0,
			"orderRealMoneyDomesticTaxfree": 0,
			"id": 0,
			"orderId": 0,
			"totalOriTax": 0,
			"totalNatTax": 0,
			"sendSumMoney": 0,
			"invoiceOriSum": 0,
			"outBoundSumMoney": 0,
			"wholeDiscountRate": 0,
			"wholeFavorableRate": 0,
			"ctTplId": "",
			"ctTplCode": "",
			"ctTplName": "",
			"signFileId": "",
			"signStatus": ""
		},
		"receiveAgreementId": 0,
		"receiveAgreementId_name": "",
		"headItem": {
			"orderId": 0,
			"define1": "",
			"define60": ""
		},
		"changeVersion": "",
		"receiveId": "",
		"receiver": "",
		"receiveMobile": "",
		"receiveAddress": "",
		"orderPayType": "",
		"settlement_name": "",
		"settlement": "",
		"shippingChoiceId_name": "",
		"shippingChoiceId": "",
		"creditBalance": 0,
		"pushProApplyOrder": "",
		"showVoucherBtn": "",
		"showUnAudit": "",
		"finishDelivery": "",
		"flowPushVoucher": "",
		"shippingChoiceId_code": "",
		"address": "",
		"occupyInventory": "",
		"telephone": "",
		"userBankName": "",
		"bankCode": "",
		"invoiceAgentId": "",
		"invoiceAgentId_name": "",
		"modifyInvoiceType": "",
		"invoiceUpcType": "",
		"invoiceTitleType": "",
		"invoiceTitle": "",
		"taxNum": "",
		"bankName": "",
		"subBankName": "",
		"bankAccount": "",
		"invoiceTelephone": "",
		"invoiceAddress": "",
		"totalMoney": 0,
		"promotionMoney": 0,
		"rebateMoney": 0,
		"rebateCashMoney": 0,
		"pointsMoney": 0,
		"reight": 0,
		"payMoney": 0,
		"nextStatus": "",
		"orderPayMoney": 0,
		"realMoney": 0,
		"orderRealMoney": 0,
		"particularlyMoney": 0,
		"unConfirmPrice": 0,
		"confirmPrice": 0,
		"payStatusCode": "",
		"createSource": "",
		"lockIn": true,
		"stockCheck": 0,
		"collectMoney": 0,
		"synSourceOrg": "",
		"synSourceTenant": "",
		"bEffectStock": "",
		"synSourceOrg_name": "",
		"pubuts": "",
		"creator": "",
		"receiveCode": "",
		"createTime": "",
		"createDate": "",
		"creatorId": "",
		"auditorId": "",
		"auditor": "",
		"auditTime": "",
		"closerId": "",
		"closeTime": "",
		"closeDate": "",
		"closer": "",
		"modifierId": "",
		"modifyDate": "",
		"modifier": "",
		"modifyTime": "",
		"uordercorp": 0,
		"bmake_st_salesout": "",
		"bmake_voucher_delivery": "",
		"bmake_voucher_saleinvoice": "",
		"bizFlow_name": "",
		"bizFlow": "",
		"bizFlow_version": "",
		"isFlowCoreBill": "",
		"isLowestPrice": true,
		"paymentExeDetail": [
			{
				"actualPayMoney": 0,
				"expiringDateTime": "",
				"fixAccoutDateTime": "",
				"startDateTime": "",
				"paidMoney": 0,
				"vouchcode": "",
				"vouchtype": "",
				"payMoney": 0,
				"payRatio": 0,
				"period": "",
				"number": "",
				"startName": "",
				"startDate": "",
				"vouchid": "",
				"vouchsubid": "",
				"paySum": 0,
				"writeBackSum": "",
				"isAdvancePay": "",
				"rowno": "",
				"mainid": "",
				"id": "",
				"pubts": ""
			}
		],
		"tradeRouteID": "",
		"tradeRouteID_code": "",
		"tradeRouteID_name": "",
		"isEndTrade": 0,
		"tradeRouteLineno": "",
		"entireDeliveryStatus": 0,
		"entireIssueStatus": 0,
		"entireInvoiceStatus": 0,
		"entireSignConfirmStatus": 0,
		"orderDetails": [
			{
				"productId_pbatchName": "",
				"code": "",
				"idKey": "",
				"productId": "",
				"productId_priceListFlag": "",
				"skuId": "",
				"erpCode": "",
				"outSysKey": "",
				"productCode": "",
				"productName": "",
				"skuCode": "",
				"skuName": "",
				"orderProductType": "",
				"model": "",
				"modelDescription": "",
				"specDescription": "",
				"projectId": "",
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"productAuxUnitName": "",
				"invExchRate": 0,
				"subQty": 0,
				"productUnitName": "",
				"invPriceExchRate": 0,
				"priceQty": 0,
				"qtyName": "",
				"qty": 0,
				"stockId": "",
				"stockName": "",
				"stockOrgId_name": "",
				"consignTime": "",
				"stockOrgId": 0,
				"settlementOrgId": "",
				"deliveryDays": 0,
				"projectId_name": "",
				"projectId_code": "",
				"settlementOrgId_name": "",
				"priceMark": true,
				"noTaxSalePrice": 0,
				"salePrice": 0,
				"noTaxSaleCost": 0,
				"costCurrencyName": "",
				"costAmt": 0,
				"costPrice": 0,
				"saleCost": 0,
				"orderDetailPrices": {
					"saleCost_orig_taxfree": 0,
					"oriUnitPrice": 0,
					"oriMoney": 0,
					"lowestPrice": 0,
					"oriTax": 0,
					"natSum": 0,
					"natMoney": 0,
					"natTaxUnitPrice": 0,
					"natTax": 0,
					"natUnitPrice": 0,
					"orderDetailId": "",
					"code": "",
					"salePrice_orig_taxfree": 0,
					"rebateMoneyOrigTaxfree": 0,
					"particularlyMoneyOrigTaxfree": 0,
					"promotionMoneyOrigTaxfree": 0,
					"pointsMoneyOrigTaxfree": 0,
					"saleCost_domestic": 0,
					"salePrice_domestic": 0,
					"rebateMoneyDomestic": 0,
					"particularlyMoneyDomestic": 0,
					"promotionMoneyDomestic": 0,
					"pointsMoneyDomestic": 0,
					"saleCost_domestic_taxfree": 0,
					"salePrice_domestic_taxfree": 0,
					"rebateMoneyDomesticTaxfree": 0,
					"particularlyMoneyDomesticTaxfree": 0,
					"promotionMoneyDomesticTaxfree": 0,
					"pointsMoneyDomesticTaxfree": 0,
					"id": "",
					"isDeleted": "",
					"discountRate": 0,
					"favorableRate": 0,
					"lineDiscountMoney": 0,
					"prepayInvRvnRecogBkgMeth": "2",
					"checkByRevenueManagement": "",
					"revPerformObligation": "",
					"serviceStartDate": "",
					"serviceEndDate": "",
					"optionalQuotationId": 1232334323423,
					"optionalQuotationId_code": "A1231",
					"variantconfigctsCode": "B12312",
					"variantconfigctsVersion": "1.0",
					"calBase": "0",
					"totalOutStockConfirmQuantity": 0,
					"totalOutStockConfirmSubQty": 0,
					"returnOriSum": 0,
					"returnPriceQty": 0,
					"returnPreSendOriSum": 0,
					"totalReturnStockQty": 0,
					"totalReturnStockPriceQty": 0,
					"totalReturnStockOriSum": 0,
					"totalReturnInvoiceQty": 0,
					"totalReturnInvoicePriceQty": 0,
					"totalReturnInvoiceOriSum": 0,
					"financeReferenced": 0,
					"taxCodeId": "",
					"taxCode_taxCode": "",
					"oriWithholdingTax": "",
					"natWithholdingTax": "",
					"invExchRateNum": 0,
					"invExchRateDen": 0,
					"invPriceExchRateNum": 0,
					"invPriceExchRateDen": 0
				},
				"oriTaxUnitPrice": 0,
				"oriSum": 0,
				"taxRate": "",
				"taxId": "",
				"taxItems": "",
				"taxCode": "",
				"transactionTypeId": "",
				"orderProductApportionName": "",
				"rebateMoney": 0,
				"marketPricie": 0,
				"particularlyMoney": 0,
				"promotionMoney": 0,
				"pointsMoney": 0,
				"ordRealMoney": "",
				"createDate": "",
				"shoppingCartId": "",
				"groupId": "",
				"rebateReturnProductId": "",
				"mutualActivities": "",
				"activities": "",
				"bizId": "",
				"salesOrgId": "",
				"saleDepartmentId": "",
				"bizProductId": "",
				"bizSkuId": "",
				"orderDetailPrice": 0,
				"iDeleted": "",
				"iOrgId": "",
				"dCreatedTime": "",
				"dModifyTime": "",
				"cCreator": "",
				"cModifier": "",
				"iProductAuxUnitId": "",
				"iProductUnitId": "",
				"masterUnitId": "",
				"purUOM_Precision": "",
				"priceUOM_Precision": "",
				"unit_Precision": "",
				"cBizName": "",
				"id": "",
				"orderId": "",
				"bodyItem": {
					"orderDetailId": 0,
					"define1": "",
					"define60": ""
				},
				"pubts": "",
				"source": "",
				"upcode": "",
				"sourceid": "",
				"sourceautoid": "",
				"makeRuleCode": "",
				"hopeReceiveDate": "",
				"sendPayMoney": 0,
				"sendQty": 0,
				"auditCount": 0,
				"takeQuantity": 0,
				"takeSalePayMoney": 0,
				"orderOutPut": 0,
				"orderPurchaseQty": 0,
				"orderPurchaseCoQty": 0,
				"totalOutStockQuantity": 0,
				"totalOutStockOriTaxMoney": 0,
				"totalOutStockSubQty": 0,
				"totalOutStockOriMoney": 0,
				"invoiceOriSum": 0,
				"invoiceQty": 0,
				"coordinationQuantity": 0,
				"closedSumMoney": 0,
				"closedRowCount": 0,
				"memo": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"bmake_st_salesout": "",
				"bmake_voucher_delivery": "",
				"bmake_voucher_saleinvoice": "",
				"batchNo": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"productDate": "",
				"invalidDate": "",
				"agentSkuCode": "",
				"agentSkuName": "",
				"isAdvRecInv": true,
				"advRecInvMoney": 0,
				"advRecInvQty": 0,
				"natAdvRecInvMoney": 0,
				"advRecInvTaxMoney": 0,
				"natAdvRecInvTaxMoney": 0,
				"offsetAdvRecInvMoney": 0,
				"offsetAdvRecInvQty": 0,
				"offsetNatAdvRecInvMoney": 0,
				"offsetAdvRecInvTaxMoney": 0,
				"offsetNatAdvRecInvTaxMoney": 0,
				"cusDiscountRate": 0,
				"cusFavorableRate": 0,
				"tradeRouteID": "",
				"tradeRouteID_code": "",
				"tradeRouteID_name": "",
				"isEndTrade": 0,
				"tradeRouteLineno": "",
				"collaborationPocode": "",
				"collaborationPodetailid": "",
				"collaborationPoid": "",
				"collaborationPorowno": "",
				"collaborationSource": "",
				"deliveryStatus": 0,
				"issueStatus": 0,
				"invoiceStatus": 0,
				"signConfirmStatus": 0,
				"variantconfigctsId": 32423423,
				"agentProductCode": "",
				"agentProductName": "",
				"returnPreSendQty": 0,
				"reSendPriceQty": 0
			}
		],
		"signSubjects": {
			"id": "",
			"mainid": "",
			"signOrder": "",
			"signSubjectType": "",
			"signOrgId": "",
			"signAgentId": "",
			"address": "",
			"postalCode": "",
			"telephone": "",
			"facsimile": "",
			"bankOfDeposit": "",
			"bankAccount": "",
			"memo": "",
			"isDefault": "",
			"pubts": "",
			"isOriginator": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	未获取到当前订单商品信息	请检查传入参数正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

返回参数 exchangeRateType

2	2026-02-03

新增

返回参数 (4)

更新

返回参数 (475)

3	2025-10-24

新增

返回参数 (4)

销售订单列表查询增加返回税码id，税码，代扣税税额，本币代扣税税额字段

4	2025-09-11

更新

请求说明

新增

返回参数 (14)

更新

返回参数 (12)

返参增加英文信息：退货补发数量,退货补发计价数量,退货金额,退货计价数量,退货补发含税金额,累计退货入库数量,累计退货入库计价数量,累计退货入库含税金额,累计退货开票数量,累计退货开票计价数量,累计退货开票含税金额


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

