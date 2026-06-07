---
title: "销售发货单审核后改小数量"
apiId: "1816530107067006979"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Shipping Document"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Shipping Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售发货单审核后改小数量

>  请求方式	POST | Sales Shipping Document (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/reduceDeliveryQty
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	请求数据
id	string	否	是	发货单主表id 示例：1809215940860051465
lines	object	是	是	发货单子表数据

## 3. 请求示例

Url: /yonbip/sd/api/reduceDeliveryQty?access_token=访问令牌
Body: {
	"data": {
		"id": "1809215940860051465",
		"lines": [
			{
				"id": "1809215940860051468",
				"qty": 2,
				"subQty": 2
			}
		]
	}
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	long	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
unConfirmPrice	number
小数位数:8,最大长度:28	否	支付未审核的金额 示例：0
orderId	long	否	订单id 示例：2226413931925760
deliveryPayMoney	number
小数位数:8,最大长度:28	否	实付金额(不含运费) 示例：630
receiveContacter	string	否	单据联系人 示例：123
modifier	string	否	修改人 示例：李志强
modifierId	long	否	修改人id 示例：2086023348195584
payStatusCode	string	否	支付状态 示例：NOTPAYMENT
source	long	否	来源单据类型 示例：0
realMoney	number
小数位数:8,最大长度:28	否	应付金额 示例：630
settVoucherType	string	否	结算类型 示例：ORDER
modifyTime	string	否	修改时间 示例：2021-04-29 15:24:01
reight	number
小数位数:8,最大长度:28	否	运费 示例：0
enable	boolean	否	是否有效 示例：true
invoiceTitleType	long	否	抬头类型 示例：0
bizId	long	否	供应商id 示例：2084396506534144
deliveryDetails	object	是	发货单详情
receiveContacterPhone	string	否	单据联系人移动电话 示例：13935357890
modifyInvoiceType	boolean	否	发票类型可改 示例：true
deliveryRealMoney	number
小数位数:8,最大长度:28	否	应收金额(不含运费) 示例：630
id	long	否	id 示例：2229146542002432
invoiceTitle	string	否	发票抬头 示例：2324214214
salesOrgName	string	否	销售组织 示例：华新丽华股份有限公司
orderNo	string	否	来源订单号 示例：DD849620210422000017
receiver	string	否	收货人 示例：123
modifyDate	string	否	修改日期 示例：2021-04-29 15:24:01
receiveAddress	string	否	收货地址 示例：中国 453325 北京 北京市 东城区 234324 2342342 34535 456436
isWfControlled	boolean	否	是否审批流控制 示例：false
totalMoney	number
小数位数:8,最大长度:28	否	总金额 示例：630
agentRelationId	long	否	客户交易关系id 示例：2090062341902596
invoiceAgentId	long	否	开票客户id 示例：2090062336397568
version	long	否	版本 示例：0
srcBillType	string	否	来源类型 示例：voucher_order
barCode	string	否	单据条码 示例：voucher_delivery|2229146542002432
rebateToOrderMoney	number
小数位数:8,最大长度:28	否	整单折扣返利金额 示例：0
auditorId	long	否	审核人id 示例：0
sourceType	string	否	来源单据 示例：voucher_order
systemDate	string	否	系统时间 示例：2021-04-29 15:24:01
settlementOrgId	string	否	财务组织id 示例：2090056456458496
statusCode	string	否	单据状态 示例：DELIVERUNAUDITED
status	long	否	单据状态 示例：0
returncount	long	否	退回次数 示例：0
verifystate	long	否	审批状态 示例：0
agentId	long	否	客户 示例：2090062336397568
code	string	否	销售发货编号 示例：FH8496210424000001
defaultReceiveDay	long	否	自动收货天数 示例：0
confirmPrice	number
小数位数:8,最大长度:28	否	已支付金额 示例：0
creatorId	long	否	制单人 示例：2084396507386112
bizFlow	string	否	流程ID 示例：f9d40fac-6066-11eb-8ace-0624d60000dc
rebateToCashMoney	long	否	抵现返利金额 示例：0
vouchdate	string	否	单据日期 示例：2021-04-24 00:00:00
payMoney	number
小数位数:8,最大长度:28	否	实付金额(含运费) 示例：630
stockOrgName	string	否	库存组织 示例：华新丽华股份有限公司
pubts	string	否	时间戳 示例：2021-04-29 15:24:01
isFlowCoreBill	boolean	否	是否流程核心单据 示例：false
receiveMobile	string	否	收票手机号 示例：18800010001
createDate	string	否	创建日期 示例：2021-04-24 17:25:08
creator	string	否	制单人 示例：YonSuite默认用户
uordercorp	long	否	租户id 示例：2084396506534144
transactionTypeId	string	否	交易类型 示例：2084400041873680
logisticWayId	long	否	物流公司id 示例：0
receiveId	long	否	客户收货地址Id 示例：2090062336397569
deleted	long	否	是否删除 示例：0
settlementOrgName	string	否	财务组织 示例：华新丽华股份有限公司
createTime	string	否	创建时间 示例：2021-04-24 17:25:08
stockOrgId	string	否	库存组织 示例：2090056456458496
invoiceAgentName	string	否	开票客户 示例：促销客户01
bdInvoiceTypeId	string	否	发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税专用发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票, 31:电子发票（增值税专用发票）,32:电子发票（普通发票） 示例：0
invoiceUpcType	long	否	发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票） 示例：0
salesOrgId	string	否	销售组织id 示例：2090056456458496

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"unConfirmPrice": 0,
		"orderId": 2226413931925760,
		"deliveryPayMoney": 630,
		"receiveContacter": "123",
		"modifier": "李志强",
		"modifierId": 2086023348195584,
		"payStatusCode": "NOTPAYMENT",
		"source": 0,
		"realMoney": 630,
		"settVoucherType": "ORDER",
		"modifyTime": "2021-04-29 15:24:01",
		"reight": 0,
		"enable": true,
		"invoiceTitleType": 0,
		"bizId": 2084396506534144,
		"deliveryDetails": [
			{
				"qtyName": "千克",
				"auxUnitQuantity": 14,
				"invoiceOriSum": 0,
				"costCenter": "",
				"providerProfitCenter": "",
				"consumerProfitCenter": "",
				"orderId": 2226413931925760,
				"sendDate": "2021-04-30 00:00:00",
				"groupId": 0,
				"transactionPrice": 45,
				"saleReturnQty": 0,
				"firstsource": "udinghuo.voucher_order",
				"firstupcode": "DD849620210422000017",
				"source": "voucher_order",
				"realMoney": 630,
				"detailStockOrgName": "华新丽华股份有限公司",
				"subQty": 14,
				"productName": "存量01",
				"taxItems": "13%",
				"deliveryId": 2229146542002432,
				"sourceOriPrice": 45,
				"totalOutStockOriTax": 0,
				"enable": true,
				"isExpiryDateManage": false,
				"detailSalesOrgName": "华新丽华股份有限公司",
				"orderDetailIdKey": "2226413931925761",
				"id": 2229146542002433,
				"detailSettlementOrgName": "华新丽华股份有限公司",
				"skuId": 2175279324958976,
				"isSkuReserve": false,
				"orderNo": "DD849620210422000017",
				"productId": 2175279311835392,
				"stopPriceQty": 0,
				"totalOutStockQuantity": 0,
				"sendQuantity": 14,
				"totalSaleInvoiceQuantity": 0,
				"salePayMoney": 630,
				"taxCode": "VAT13",
				"rebateMoney": 0,
				"taxRate": 13,
				"masterUnitId": 2084757161480448,
				"productAuxUnitName": "千克",
				"taxId": "2087164809795328",
				"receivedQuantity": 0,
				"qty": 14,
				"oriTaxUnitPrice": 45,
				"productAuxUnitId": 2084757161480448,
				"invExchRate": 1,
				"invoiceQty": 0,
				"skuCode": "000089",
				"unitExchangeTypePrice": 0,
				"detailSalesOrgId": "2090056456458496",
				"firstsourceautoid": 2226413931925761,
				"makeRuleCode": "order_delivery",
				"detailSettlementOrgId": "2090056456458496",
				"isreserve": false,
				"productUnitId": 2084757161480448,
				"totalOutStockOriTaxMoney": 0,
				"stockName": "AA",
				"isDeleted": false,
				"invPriceExchRate": 1,
				"totalOutStockOriMoney": 0,
				"isBatchManage": false,
				"firstsourceid": 2226413931925760,
				"totalOutStockPriceQty": 0,
				"pubts": "2021-04-29 15:24:01",
				"sourceid": 2226413931925760,
				"saleReturnMoney": 0,
				"tailDifferenceMoney": 0,
				"uordercorp": 2084396506534144,
				"oriSum": 630,
				"salePrice": 0,
				"stopSubQty": 0,
				"rebateFlag": false,
				"unitExchangeType": 0,
				"saleCost": 630,
				"conversionRate": 0,
				"cashRebateMoney": 0,
				"orderDetailId": 2226413931925761,
				"orderRebateMoney": 0,
				"detailStockOrgId": "2090056456458496",
				"totalSaleInvoiceOriTaxMoney": 0,
				"sourceautoid": 2226413931925761,
				"productCode": "000089",
				"priceQty": 14,
				"productUnitName": "千克",
				"upcode": "DD849620210422000017",
				"stopMoney": 0,
				"stockId": 2097145068851456,
				"stopQty": 0,
				"totalOutStockSubQty": 0,
				"orderProductType": "SALE",
				"totalSaleInvoiceOriTax": 0,
				"totalSaleInvoiceOriMoney": 0
			}
		],
		"receiveContacterPhone": "13935357890",
		"modifyInvoiceType": true,
		"deliveryRealMoney": 630,
		"id": 2229146542002432,
		"invoiceTitle": "2324214214",
		"salesOrgName": "华新丽华股份有限公司",
		"orderNo": "DD849620210422000017",
		"receiver": "123",
		"modifyDate": "2021-04-29 15:24:01",
		"receiveAddress": "中国 453325 北京 北京市 东城区 234324 2342342 34535 456436",
		"isWfControlled": false,
		"totalMoney": 630,
		"agentRelationId": 2090062341902596,
		"invoiceAgentId": 2090062336397568,
		"version": 0,
		"srcBillType": "voucher_order",
		"barCode": "voucher_delivery|2229146542002432",
		"rebateToOrderMoney": 0,
		"auditorId": 0,
		"sourceType": "voucher_order",
		"systemDate": "2021-04-29 15:24:01",
		"settlementOrgId": "2090056456458496",
		"statusCode": "DELIVERUNAUDITED",
		"status": 0,
		"returncount": 0,
		"verifystate": 0,
		"agentId": 2090062336397568,
		"code": "FH8496210424000001",
		"defaultReceiveDay": 0,
		"confirmPrice": 0,
		"creatorId": 2084396507386112,
		"bizFlow": "f9d40fac-6066-11eb-8ace-0624d60000dc",
		"rebateToCashMoney": 0,
		"vouchdate": "2021-04-24 00:00:00",
		"payMoney": 630,
		"stockOrgName": "华新丽华股份有限公司",
		"pubts": "2021-04-29 15:24:01",
		"isFlowCoreBill": false,
		"receiveMobile": "18800010001",
		"createDate": "2021-04-24 17:25:08",
		"creator": "YonSuite默认用户",
		"uordercorp": 2084396506534144,
		"transactionTypeId": "2084400041873680",
		"logisticWayId": 0,
		"receiveId": 2090062336397569,
		"deleted": 0,
		"settlementOrgName": "华新丽华股份有限公司",
		"createTime": "2021-04-24 17:25:08",
		"stockOrgId": "2090056456458496",
		"invoiceAgentName": "促销客户01",
		"bdInvoiceTypeId": "0",
		"invoiceUpcType": 0,
		"salesOrgId": "2090056456458496"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	id:111,对应的发货单不存在，请检查数据	错误的返回信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

