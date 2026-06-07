---
title: "销售发货来源生单保存"
apiId: "63bc13f357ad4396a9643f496d7e57a7"
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

# 销售发货来源生单保存

> `ContentType	application/json` 请求方式	POST | 分类: Sales Shipping Document (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherdelivery/saveFromSaleOrder

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 发货单[voucher.delivery.DeliveryVoucher] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| vouchdate | string | 否 | 否 | 单据日期 示例：2022-03-04 00:00:00 |
| transactionTypeId | string | 否 | 是 | 交易类型，传Id或code 示例：2350786624721665 |
| code | string | 否 | 否 | 单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：FH8496210424000001 |
| shippingMemo | string | 否 | 否 | 备注 示例：备注信息 |
| deliveryDetails | object | 是 | 是 | 发货单子表数据 |
| _status | string | 否 | 是 | 操作标识, Insert:新增 示例：Insert |

## 3. 请求示例

Url: /yonbip/sd/voucherdelivery/saveFromSaleOrder?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"vouchdate": "2022-03-04 00:00:00",
		"transactionTypeId": "2350786624721665",
		"code": "FH8496210424000001",
		"shippingMemo": "备注信息",
		"deliveryDetails": [
			{
				"qty": 3,
				"subQty": 3,
				"stockId": "2097145068851456",
				"batchNo": "3344",
				"skuId": "2352233163706624",
				"sourceid": 2669303750956032,
				"sourceautoid": 2669303750956033,
				"inventoryowner": 0,
				"_status": "Insert"
			}
		],
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用成功时的信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| unConfirmPrice | number |
| 小数位数:8,最大长度:28 | 否 | 付未审核的金额 示例：0 |
| iConfirmUserId | long | 否 | 审核人id 示例：0 |
| deliveryPayMoney | number |
| 小数位数:8,最大长度:28 | 否 | 实付金额(不含运费) 示例：1100 |
| orderId | long | 否 | 订单id 示例：2681692509147648 |
| payStatusCode | string | 否 | 支付状态，NOTPAYMENT：未付款；PARTPAYMENT：部分付款；CONFIRMPAYMENT：部分付款待确认；CONFIRMPAYMENT_ALL：付款待确认；FINISHPAYMENT：付款完成 示例：NOTPAYMENT |
| realMoney | number |
| 小数位数:8,最大长度:28 | 否 | 应付金额 示例：1100 |
| source | long | 否 | 来源单据类型,0:销售订单 示例：0 |
| settVoucherType | string | 否 | 结算类型 示例：ORDER |
| reight | number |
| 小数位数:8,最大长度:28 | 否 | 运费 示例：0 |
| enable | boolean | 否 | 是否有效 示例：true |
| invoiceTitleType | long | 否 | 抬头类型 示例：0 |
| bizId | long | 否 | 供应商id 示例：2350784812781824 |
| modifyInvoiceType | boolean | 否 | 发票类型可改 示例：true |
| deliveryRealMoney | number |
| 小数位数:8,最大长度:28 | 否 | 应收金额(不含运费) 示例：1100 |
| id | long | 否 | 主表id 示例：2681693097809152 |
| invoiceTitle | string | 否 | 发票抬头 示例：无 |
| salesOrgName | string | 否 | 销售组织 示例：万国手表 - 勿动 |
| orderNo | string | 否 | 来源订单号 示例：UO-164820220310000002 |
| receiver | string | 否 | 收货人 示例：gyt |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| receiveAddress | string | 否 | 收货地址 示例：北京市海淀区 |
| totalMoney | number |
| 小数位数:8,最大长度:28 | 否 | 总金额 示例：0 |
| agentRelationId | long | 否 | 客户交易关系id 示例：2352188005716224 |
| invoiceAgentId | long | 否 | 开票客户id 示例：2352188003832064 |
| version | long | 否 | 版本 示例：0 |
| barCode | string | 否 | 单据条码 示例：voucher_delivery|2681693097809152 |
| wholeDiscountRate | number |
| 小数位数:8,最大长度:28 | 否 | 整单扣率%(含返利) 示例：100 |
| rebateToOrderMoney | number |
| 小数位数:8,最大长度:28 | 否 | 整单折扣返利金额 示例：0 |
| auditorId | long | 否 | 审核人id 示例：0 |
| shippingMemo | string | 否 | 备注 示例：官方旗舰店001 |
| sourceType | string | 否 | 来源单据 示例：voucher_order |
| systemDate | string | 否 | 系统时间 示例：2022-03-10 09:59:17 |
| statusCode | string | 否 | 单据状态，DELIVERUNAUDITED：发货待审；DELIVERING：发货已审；OUTSTOCKED：出库完成；DELIVERED：已收货；OUTSTOCKEDROLLBACK：出库回退；APPROVING：审批中；PARTOUTSTOCKED：部分出库 示例：DELIVERUNAUDITED |
| status | long | 否 | 单据状态，0：发货待审；1：发货已审；2：出库完成；3：已收货；4：出库回退；5：审批中；6：部分出库 示例：0 |
| agentId | long | 否 | 客户 示例：2352188003832064 |
| code | string | 否 | 销售发货单据编号 示例：TI1648220310000002 |
| defaultReceiveDay | long | 否 | 自动收货天数 示例：0 |
| shippingMemoId | long | 否 | 商品备注id 示例：0 |
| confirmPrice | number |
| 小数位数:8,最大长度:28 | 否 | 确认金额 示例：0 |
| creatorId | long | 否 | 制单人Id 示例：2352080682045696 |
| bizFlow | string | 否 | 业务流Id 示例：2ccbea49-e941-11eb-a68a-0624d60000dc |
| rebateToCashMoney | number |
| 小数位数:8,最大长度:28 | 否 | 抵现返利金额 示例：0 |
| shippingChoiceCode | string | 否 | 发运方式编码 |
| vouchdate | string | 否 | 单据日期 示例：2022-03-10 00:00:00 |
| offerSaleCost | number |
| 小数位数:8,最大长度:28 | 否 | 整单报价含税金额 示例：0 |
| payMoney | number |
| 小数位数:8,最大长度:28 | 否 | 实付金额(含运费) 示例：1100 |
| stockOrgName | string | 否 | 库存组织 示例：万国手表 - 勿动 |
| pubts | string | 否 | 时间戳 示例：2022-03-10 09:59:20 |
| isFlowCoreBill | boolean | 否 | 是否流程核心单据 示例：false |
| wholeDiscountMoney | number |
| 小数位数:8,最大长度:28 | 否 | 整单扣额 示例：0 |
| createDate | string | 否 | 创建日期 示例：2022-03-10 09:59:19 |
| creator | string | 否 | 制单人 示例：郭雨婷 |
| uordercorp | long | 否 | 租户id 示例：2350784812781824 |
| logisticWayId | long | 否 | 物流公司id 示例：0 |
| receiveId | long | 否 | 客户收货地址Id 示例：2535972394898432 |
| deleted | long | 否 | 是否删除 示例：0 |
| createTime | string | 否 | 创建时间 示例：2022-03-10 09:59:19 |
| stockOrgId | string | 否 | 库存组织 示例：2352090091131648 |
| invoiceAgentName | string | 否 | 开票客户 示例：官方旗舰店001 |
| invoiceUpcType | long | 否 | 发票类型 示例：0 |
| salesOrgId | string | 否 | 销售组织id 示例：2352090091131648 |
| deliveryDetails | object | 是 | 发货单详情 |
| deliveryPrices | object | 是 | 发货单价格 |
| headItem!id | long | 否 | 表头自定义项Id 示例：2681693097809152 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"unConfirmPrice": 0,
		"iConfirmUserId": 0,
		"deliveryPayMoney": 1100,
		"orderId": 2681692509147648,
		"payStatusCode": "NOTPAYMENT",
		"realMoney": 1100,
		"source": 0,
		"settVoucherType": "ORDER",
		"reight": 0,
		"enable": true,
		"invoiceTitleType": 0,
		"bizId": 2350784812781824,
		"modifyInvoiceType": true,
		"deliveryRealMoney": 1100,
		"id": 2681693097809152,
		"invoiceTitle": "无",
		"salesOrgName": "万国手表 - 勿动",
		"orderNo": "UO-164820220310000002",
		"receiver": "gyt",
		"isWfControlled": false,
		"receiveAddress": "北京市海淀区",
		"totalMoney": 0,
		"agentRelationId": 2352188005716224,
		"invoiceAgentId": 2352188003832064,
		"version": 0,
		"barCode": "voucher_delivery|2681693097809152",
		"wholeDiscountRate": 100,
		"rebateToOrderMoney": 0,
		"auditorId": 0,
		"shippingMemo": "官方旗舰店001",
		"sourceType": "voucher_order",
		"systemDate": "2022-03-10 09:59:17",
		"statusCode": "DELIVERUNAUDITED",
		"status": 0,
		"agentId": 2352188003832064,
		"code": "TI1648220310000002",
		"defaultReceiveDay": 0,
		"shippingMemoId": 0,
		"confirmPrice": 0,
		"creatorId": 2352080682045696,
		"bizFlow": "2ccbea49-e941-11eb-a68a-0624d60000dc",
		"rebateToCashMoney": 0,
		"shippingChoiceCode": "",
		"vouchdate": "2022-03-10 00:00:00",
		"offerSaleCost": 0,
		"payMoney": 1100,
		"stockOrgName": "万国手表 - 勿动",
		"pubts": "2022-03-10 09:59:20",
		"isFlowCoreBill": false,
		"wholeDiscountMoney": 0,
		"createDate": "2022-03-10 09:59:19",
		"creator": "郭雨婷",
		"uordercorp": 2350784812781824,
		"logisticWayId": 0,
		"receiveId": 2535972394898432,
		"deleted": 0,
		"createTime": "2022-03-10 09:59:19",
		"stockOrgId": "2352090091131648",
		"invoiceAgentName": "官方旗舰店001",
		"invoiceUpcType": 0,
		"salesOrgId": "2352090091131648",
		"deliveryDetails": [
			{
				"discountRate": 100,
				"qtyName": "个",
				"sendDate": "2022-03-10 00:00:00",
				"orderId": 2681692509147648,
				"firstsource": "udinghuo.voucher_order",
				"saleReturnQty": 0,
				"detailStockOrgName": "万国手表 - 勿动",
				"productName": "鳄鱼皮表带",
				"deliveryId": 2681693097809152,
				"totalOutStockOriTax": 0,
				"isExpiryDateManage": false,
				"enable": true,
				"orderDetailIdKey": "2681692263208192",
				"id": 2681693097809153,
				"receivedBilling": false,
				"isSkuReserve": false,
				"productId": 2352231937577216,
				"stopPriceQty": 0,
				"totalSaleInvoiceQuantity": 0,
				"masterUnitId": 2352222317908224,
				"invExchRate": 1,
				"productAuxUnitId": 2352222317908224,
				"skuCode": "000002",
				"unitExchangeTypePrice": 0,
				"makeRuleCode": "order_delivery",
				"detailSettlementOrgId": "2352090091131648",
				"lineSaleCost": 0,
				"stockName": "万国发货仓001",
				"isDeleted": 0,
				"invPriceExchRate": 1,
				"isBatchManage": true,
				"totalOutStockOriMoney": 0,
				"pubts": "2022-03-10 09:59:19",
				"sourceid": 2681692509147648,
				"tailDifferenceMoney": 0,
				"saleReturnMoney": 0,
				"uordercorp": 2350784812781824,
				"oriSum": 1100,
				"salePrice": 0,
				"stopSubQty": 0,
				"rebateFlag": false,
				"cashRebateMoney": 0,
				"orderDetailId": 2681692509147649,
				"detailStockOrgId": "2352090091131648",
				"productCode": "000002",
				"priceQty": 100,
				"productUnitName": "个",
				"stockId": 2352186059608320,
				"orderProductType": "SALE",
				"totalSaleInvoiceOriTax": 0,
				"totalSaleInvoiceOriMoney": 0,
				"auxUnitQuantity": 100,
				"invoiceOriSum": 0,
				"groupId": 0,
				"transactionPrice": 11,
				"firstupcode": "UO-164820220310000002",
				"source": "voucher_order",
				"realMoney": 1100,
				"subQty": 100,
				"taxItems": "免税",
				"lineDiscountMoney": 0,
				"sourceOriPrice": 11,
				"detailSalesOrgName": "万国手表 - 勿动",
				"detailSettlementOrgName": "万国手表 - 勿动",
				"skuId": 2352231945523456,
				"orderNo": "UO-164820220310000002",
				"totalOutStockQuantity": 0,
				"sendQuantity": 100,
				"taxCode": "VAT FREE",
				"inventoryowner": 0,
				"isScrap": false,
				"rebateMoney": 0,
				"taxRate": 0,
				"oriTaxUnitOffer": 0,
				"productAuxUnitName": "个",
				"taxId": "2350786632569856",
				"qty": 100,
				"receivedQuantity": 0,
				"oriTaxUnitPrice": 11,
				"invoiceQty": 0,
				"isUpdateCost": false,
				"detailSalesOrgId": "2352090091131648",
				"totalVarianceQty": 0,
				"isreserve": false,
				"productUnitId": 2352222317908224,
				"firstsourceautoid": 2681692509147649,
				"totalOutStockOriTaxMoney": 0,
				"lineNatDiscountMoney": 0,
				"firstsourceid": 2681692509147648,
				"totalOutStockPriceQty": 0,
				"unitExchangeType": 0,
				"saleCost": 1100,
				"conversionRate": 0,
				"orderRebateMoney": 0,
				"sourceautoid": 2681692509147649,
				"totalSaleInvoiceOriTaxMoney": 0,
				"upcode": "UO-164820220310000002",
				"stopMoney": 0,
				"stopQty": 0,
				"totalOutStockSubQty": 0,
				"checkByRevenueManagement": true,
				"priceMark": true
			}
		],
		"deliveryPrices": [
			{
				"uordercorp": 2350784812781824,
				"domesticCode": "CNY",
				"payNatTax": "0",
				"exchRate": "1",
				"originalName": "人民币",
				"exchangeRateType": "0000KRABKGCA59AUY10000",
				"deliveryId": "2681693097809152",
				"taxInclusive": "true",
				"natCurrency": "2350786628080640",
				"isDeleted": 0,
				"payOriTax": 0,
				"domesticName": "人民币",
				"originalCode": "CNY",
				"currency": "2350786628080640",
				"id": 21512,
				"pubts": "2022-03-10 09:59:19"
			}
		],
		"headItem!id": 2681693097809152
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

请求说明

删除

返回参数 salePayMoney

2	2025-06-06

新增

请求参数 shippingMemo

新增

请求参数 inventoryowner

新增

返回参数 inventoryowner


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

