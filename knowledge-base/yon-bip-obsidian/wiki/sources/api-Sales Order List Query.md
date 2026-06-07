---
title: "销售订单列表查询"
apiId: "12406993fdf24559969621f65e25b53f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Order"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sales Order (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherorder/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 示例：10 默认值：10 |
| code | string | 否 | 否 | 单据编号 示例：UO-20220513000001 |
| nextStatusName | string | 否 | 否 | 订单状态, CONFIRMORDER:开立、DELIVERY_PART:部分发货、DELIVERY_TAKE_PART:部分发货待收货、DELIVERGOODS:待发货、TAKEDELIVERY:待收货、ENDORDER:已完成、OPPOSE:已取消、APPROVING:审批中、 示例：CONFIRMORDER |
| open_orderDate_begin | string | 否 | 否 | 制单日期开始时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00 |
| open_orderDate_end | string | 否 | 否 | 制单结束时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00 |
| open_hopeReceiveDate_begin | string | 否 | 否 | 期望收货开始时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00 |
| open_hopeReceiveDate_end | string | 否 | 否 | 期望收货截止,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 单据截止时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00 |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 查询条件 |
| op | string | 否 | 否 | 比较符(eq:等于;neq:不等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：eq |
| value1 | string | 否 | 否 | 查询条件值1 示例：UO-20220513000001 |
| field | string | 否 | 否 | 查询条件字段名 示例：code |
| logicOp | string | 否 | 否 | 分级逻辑符(and,or) |
| value2 | string | 否 | 否 | 查询条件值2 |
| queryOrders | object | 是 | 否 | 排序字段 |
| field | string | 否 | 否 | 排序条件字段:必须传实体上有的字段;主表字段查询时字段名(例: id);子表字段查询是子表对象.字段名(例：orderDetails.id);参照类型只能传id(例:按物料查询只能传物料id,不能传物料code)????示例：id 示例：vouchdate |
| order | string | 否 | 否 | 顺序:正序(asc);倒序(desc) 示例：asc 示例：asc |

## 3. 请求示例

Url: /yonbip/sd/voucherorder/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "UO-20220513000001",
	"nextStatusName": "CONFIRMORDER",
	"open_orderDate_begin": "2022-05-13 00:00:00",
	"open_orderDate_end": "2022-05-13 00:00:00",
	"open_hopeReceiveDate_begin": "2022-05-13 00:00:00",
	"open_hopeReceiveDate_end": "2022-05-13 00:00:00",
	"open_vouchdate_begin": "2022-05-13 00:00:00",
	"open_vouchdate_end": "2022-05-13 00:00:00",
	"isSum": false,
	"simpleVOs": [
		{
			"op": "eq",
			"value1": "UO-20220513000001",
			"field": "code",
			"logicOp": "",
			"value2": ""
		}
	],
	"queryOrders": [
		{
			"field": "vouchdate",
			"order": "asc"
		}
	]
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 页号 示例：1 |
| pageSize | int | 否 | 每页记录数 示例：1 |
| recordCount | int | 否 | 总共记录数 示例：276 |
| recordList | object | 是 | 记录列表 |
| sumRecordList | object | 是 | 合计 |
| pageCount | long | 否 | 总共记录数 |
| beginPageIndex | long | 否 | 页码列表的开始索引 |
| endPageIndex | long | 否 | 页码列表的结束索引 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 276,
		"recordList": [
			{
				"code": "",
				"vouchdate": "",
				"id": 0,
				"parentOrderNo": "",
				"salesOrgId": "",
				"salesOrgId_name": "",
				"saleDepartmentId": "",
				"transactionTypeId": "",
				"transactionTypeId_name": "",
				"agentId": 0,
				"agentId_name": "",
				"receiveContacter": "",
				"receiveContacterPhone": "",
				"receievInvoiceMobile": "",
				"receievInvoiceEmail": "",
				"purchaseNo": "",
				"corpContact": "",
				"corpContactUserName": "",
				"settlementOrgId_name": "",
				"corpContactUserErpCode": "",
				"orderPrices": {
					"currency": "",
					"currency_priceDigit": 0,
					"currency_moneyDigit": 0,
					"originalName": "",
					"natCurrency": "",
					"natCurrency_priceDigit": 0,
					"natCurrency_moneyDigit": 0,
					"domesticCode": "",
					"domesticName": "",
					"exchRate": 0,
					"exchangeRateType_name": "",
					"exchangeRateType": "",
					"ctTplId": "",
					"ctTplCode": "",
					"ctTplName": "",
					"signFileId": "",
					"signStatus": ""
				},
				"payMoney": 0,
				"orderPayMoney": 0,
				"realMoney": 0,
				"orderRealMoney": 0,
				"statusCode": "",
				"nextStatus": "",
				"currentStatus": 0,
				"payStatusCode": "",
				"settlementOrgId": "",
				"lockIn": true,
				"confirmDate": "",
				"payDate": "",
				"orderPayType": "",
				"settlement": "",
				"shippingChoiceId": "",
				"sendDate": "",
				"hopeReceiveDate": "",
				"opposeMemo": "",
				"haveDelivery": true,
				"occupyInventory": "",
				"separatePromotionType": "",
				"reight": 0,
				"synSourceOrg": "",
				"synSourceTenant": "",
				"synSourceOrg_name": "",
				"totalMoney": 0,
				"tagName": "",
				"rebateCashMoney": 0,
				"particularlyMoney": 0,
				"promotionMoney": 0,
				"unConfirmPrice": 0,
				"confirmPrice": 0,
				"bizId": "",
				"bizName": "",
				"agentRelationId": 0,
				"points": "",
				"pubts": "",
				"pubuts": "",
				"orderInvoice": "",
				"orderShippingAddress": "",
				"orderErp": "",
				"deliveryDate": "",
				"isWfControlled": true,
				"verifystate": 0,
				"status": 0,
				"headItem": {
					"id": "",
					"define1": ""
				},
				"isFinishDelivery": true,
				"productId_pbatchName": 0,
				"idKey": "",
				"productId": 0,
				"priceMark": true,
				"isBatchManage": true,
				"isExpiryDateManage": true,
				"expireDateNo": "",
				"expireDateUnit": "",
				"skuId": 0,
				"erpCode": "",
				"orderProductType": "",
				"productCode": "",
				"productName": "",
				"skuCode": "",
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
				"variantconfigctsId": 5235234243,
				"orderDetailPrices": {
					"saleCost_orig_taxfree": 0,
					"oriUnitPrice": 0,
					"oriMoney": 0,
					"oriTax": 0,
					"natSum": 0,
					"natTaxUnitPrice": 0,
					"natMoney": 0,
					"natUnitPrice": 0,
					"natTax": 0,
					"orderDetailId": 0,
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
					"id": 0,
					"prepayInvRvnRecogBkgMeth": "2",
					"checkByRevenueManagement": "",
					"revPerformObligation": "",
					"serviceStartDate": "",
					"serviceEndDate": "",
					"optionalQuotationId": 4323234234,
					"optionalQuotationId_code": "A123123",
					"variantconfigctsCode": "B234234",
					"variantconfigctsVersion": "1.0",
					"calBase": "0",
					"returnOriSum": 0,
					"returnPriceQty": 0,
					"returnPreSendOriSum": 0,
					"totalReturnStockQty": 0,
					"totalReturnStockPriceQty": 0,
					"totalReturnStockOriSum": 0,
					"totalReturnInvoiceQty": 0,
					"totalReturnInvoicePriceQty": 0,
					"totalReturnInvoiceOriSum": 0,
					"financeReferenced": 0
				},
				"stockName": "",
				"stockOrgId_name": "",
				"consignTime": "",
				"projectId_name": "",
				"projectId_code": "",
				"noTaxSalePrice": 0,
				"salePrice": 0,
				"taxId": "",
				"costCurrencyName": "",
				"costAmt": 0,
				"costPrice": 0,
				"noTaxSaleCost": 0,
				"saleCost": 0,
				"stockId": "",
				"oriTaxUnitPrice": 0,
				"lineno": 0,
				"orderDetails_stockOrgId": "",
				"oriSum": 0,
				"taxRate": 0,
				"taxItems": "",
				"taxCode": "",
				"rebateMoney": 0,
				"pointsMoney": 0,
				"shoppingCartId": "",
				"groupId": 0,
				"rebateReturnProductId": "",
				"mutualActivities": "",
				"activities": "",
				"sendPayMoney": 0,
				"invoiceQty": 0,
				"invoiceOriSum": 0,
				"bizProductId": 0,
				"takeQuantity": 0,
				"bizSkuId": "",
				"takeSalePayMoney": 0,
				"orderDetailPrice": 0,
				"sendQty": 0,
				"closedSumMoney": 0,
				"closedRowCount": 0,
				"iDeleted": true,
				"iOrgId": "",
				"memo": "",
				"createDate": "",
				"creatorId": 0,
				"auditorId": "",
				"auditDate": "",
				"closerId": "",
				"closeDate": "",
				"modifierId": "",
				"modifyDate": "",
				"cCreator": "",
				"iProductAuxUnitId": 0,
				"iProductUnitId": 0,
				"masterUnitId": 0,
				"purUOM_Precision": 0,
				"priceUOM_Precision": 0,
				"unit_Precision": 0,
				"cBizName": "",
				"orderDetailId": 0,
				"orderId": 0,
				"bodyItem": {
					"id": 0,
					"define1": "",
					"define60": ""
				},
				"creator": "",
				"createTime": "",
				"auditor": "",
				"auditTime": "",
				"closeTime": "",
				"closer": "",
				"modifier": "",
				"modifyTime": "",
				"bmake_st_salesout": "",
				"bmake_voucher_delivery": "",
				"bizFlow": 0,
				"bmake_voucher_saleinvoice": "",
				"isFlowCoreBill": true,
				"bizFlow_version": "",
				"batchNo": "",
				"productDate": "",
				"invalidDate": "",
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
				"entireDeliveryStatus": 0,
				"entireIssueStatus": 0,
				"entireInvoiceStatus": 0,
				"entireSignConfirmStatus": 0,
				"deliveryStatus": 0,
				"issueStatus": 0,
				"invoiceStatus": 0,
				"signConfirmStatus": 0,
				"returnPreSendQty": 0,
				"reSendPriceQty": 0
			}
		],
		"sumRecordList": [
			{
				"noTaxSaleCost": 0,
				"orderRealMoney": 0,
				"realMoney": 0,
				"orderPurchaseQty": 0,
				"sendQty": 0,
				"subQty": 0,
				"collectMoney": 0,
				"sendPriceQty": 0,
				"coordinationQuantity": 0,
				"totalOutStockOriTaxMoney": 0,
				"prodCost": 0,
				"totalOutStockOriMoney": 0,
				"totalOutStockPriceQty": 0,
				"orderPayMoney": 0,
				"payMoneyOrigTaxfree": 0,
				"auditCount": 0,
				"oriSum": 0,
				"returnQty": 0,
				"totalOutStockQuantity": 0,
				"saleCost": 0,
				"cashRebateMoney": 0,
				"rebateMoney": 0,
				"orderRebateMoney": 0,
				"orderDetails_rebateMoney": 0,
				"priceQty": 0,
				"qty": 0,
				"sendPayMoney": 0,
				"cusDiscountMoney": 0,
				"invoiceQty": 0,
				"returnPreSendQty": 0,
				"totalOutStockSubQty": 0,
				"orderDetailPrices": {
					"oriTax": 0,
					"natTax": 0,
					"natSum": 0,
					"natMoney": 0,
					"oriMoney": 0,
					"lineDiscountMoney": 0,
					"totalOutStockConfirmQuantity": 0,
					"totalOutStockConfirmSubQty": 0,
					"taxCode_taxCode": "",
					"oriWithholdingTax": "",
					"natWithholdingTax": ""
				},
				"orderPrices": {
					"totalNatTax": 0
				},
				"advRecInvMoney": 0,
				"advRecInvQty": 0,
				"natAdvRecInvMoney": 0,
				"advRecInvTaxMoney": 0,
				"natAdvRecInvTaxMoney": 0,
				"offsetAdvRecInvMoney": 0,
				"offsetAdvRecInvQty": 0,
				"offsetNatAdvRecInvMoney": 0,
				"offsetAdvRecInvTaxMoney": 0,
				"offsetNatAdvRecInvTaxMoney": 0
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-03

新增

返回参数 taxCode_taxCode

新增

返回参数 oriWithholdingTax

新增

返回参数 natWithholdingTax

销售订单列表查询字段补充税码，代扣税税额，本币代扣税税额字段

2	2025-09-11

更新

请求说明

更新

请求参数 field

新增

返回参数 (12)

更新

返回参数 (10)

返参增加英文信息：退货补发数量,退货补发计价数量,退货金额,退货计价数量,退货补发含税金额,累计退货入库数量,累计退货入库计价数量,累计退货入库含税金额,累计退货开票数量,累计退货开票计价数量,累计退货开票含税金额


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

