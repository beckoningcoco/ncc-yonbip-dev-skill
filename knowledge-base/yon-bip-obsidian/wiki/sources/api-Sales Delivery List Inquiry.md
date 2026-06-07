---
title: "销售发货列表查询"
apiId: "7270cd10d9114a4b9dbe926ded54b57c"
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

# 销售发货列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sales Shipping Document (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherdelivery/list

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
| isDefault | boolean | 否 | 否 | 是否默认查询方案 示例：true 默认值：true |
| pageIndex | long | 否 | 是 | 页号 示例：1 |
| pageSize | long | 否 | 是 | 每页行数 示例：10 |
| open_createTime_begin | string | 否 | 否 | 创建开始时间 示例：2024-05-19 10:08:52 |
| open_createTime_end | string | 否 | 否 | 创建结束时间 示例：2024-05-21 10:08:52 |
| open_vouchdate_begin | string | 否 | 否 | 发货开始时间 示例：2024-05-19 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 发货结束时间 示例：2024-05-21 00:00:00 |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 过滤条件 |
| op | string | 否 | 否 | 比较符(eq:等于;neq:不等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：eq |
| value1 | string | 否 | 否 | 值1(条件) 示例：324444562 |
| field | string | 否 | 否 | 属性名(条件) 示例：id |
| value2 | string | 否 | 否 | 值2(条件) |
| logicOp | string | 否 | 否 | 逻辑符(分级) |
| queryOrders | object | 是 | 否 | 排序字段 |
| field | string | 否 | 否 | 排序条件字段:必须传实体上有的字段;主表字段查询时字段名(例: id);子表字段查询是子表对象.字段名(例：deliveryDetails.id);参照类型只能传id(例:按物料查询只能传物料id,不能传物料code) 示例：id 示例：vouchdate 示例：id |
| order | string | 否 | 否 | 顺序:正序(asc);倒序(desc) 示例：asc 示例：asc 示例：desc |

## 3. 请求示例

Url: /yonbip/sd/voucherdelivery/list?access_token=访问令牌
Body: {
	"isDefault": true,
	"pageIndex": 1,
	"pageSize": 10,
	"open_createTime_begin": "2024-05-19 10:08:52",
	"open_createTime_end": "2024-05-21 10:08:52",
	"open_vouchdate_begin": "2024-05-19 00:00:00",
	"open_vouchdate_end": "2024-05-21 00:00:00",
	"isSum": false,
	"simpleVOs": [
		{
			"op": "eq",
			"value1": "324444562",
			"field": "id",
			"value2": "",
			"logicOp": ""
		}
	],
	"queryOrders": [
		{
			"field": "id",
			"order": "desc"
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
| pageIndex | int | 否 | 页号 |
| pageSize | int | 否 | 每页记录数 |
| pageCount | int | 否 | 总共记录数 |
| beginPageIndex | int | 否 | 页码列表的开始索引 |
| endPageIndex | int | 否 | 页码列表的结束索引 |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳 |
| recordList | object | 是 | 记录列表 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"code": "",
				"orderNoHead": "",
				"vouchdate": "",
				"stockOrgName": "",
				"stockOrgId": "",
				"statusCode": "",
				"product_defaultAlbumId": "",
				"agentRelationId_agentCategoryId_name": "",
				"deliveryPrices": {
					"currency": "",
					"natCurrency": "",
					"originalCode": "",
					"originalName": "",
					"exchangeRateType": "",
					"totalOutStockRebateMoney": 0,
					"domesticCode": "",
					"domesticName": "",
					"exchangeRateType_name": "",
					"exchRate": 0,
					"currency_priceDigit": "",
					"currency_moneyDigit": "",
					"natCurrency_priceDigit": "",
					"natCurrency_moneyDigit": "",
					"taxInclusive": ""
				},
				"agentId_name": "",
				"agentId": "",
				"settVoucherType": "",
				"payMoney": 0,
				"deliveryType": "",
				"logisticWayId": "",
				"id": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": ""
				},
				"isWfControlled": "",
				"verifystate": "",
				"status": "",
				"logisticWayId_name": "",
				"logisticsBillNo": "",
				"logisticsCarNum": "",
				"logisticsUserName": "",
				"logisticsUserPhone": "",
				"createTime": "",
				"deliveryId": "",
				"orderId": "",
				"orderDetailId": "",
				"orderDetailIdKey": "",
				"payStatusCode": "",
				"erpCode": "",
				"bizFlow_version": "",
				"printCount": "",
				"productAuxUnitId": "",
				"productUnitId": "",
				"masterUnitId": "",
				"purUOM_Precision": 0,
				"priceUOM_Precision": 0,
				"unit_Precision": 0,
				"idKey": "",
				"groupId": "",
				"skuId": "",
				"productId": "",
				"deliveredQuantity": "",
				"outSysKey": "",
				"created": "",
				"stockId": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"expireDateNo": 0,
				"expireDateUnit": "",
				"batchId": "",
				"enable": "",
				"bizProductId": "",
				"deliveryDetailId": "",
				"pubts": "",
				"corpContact": "",
				"deliveryDetails_detailStockOrgId": "",
				"deliveryDetails_detailSettlementOrgId": "",
				"deliveryDetails_detailSalesOrgId": "",
				"deliveryDetails_detailSaleDepartmentId": "",
				"taxId": "",
				"deliveryDetails_projectId": "",
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"orderNo": "",
				"agentProductId": "",
				"agentProductCode": "",
				"agentProductName": "",
				"agentSkuCode": "",
				"agentSkuName": "",
				"productCode": "",
				"totalOutStockOriTaxMoney": 0,
				"productName": "",
				"totalOutStockOriMoney": 0,
				"totalOutStockOriTax": 0,
				"skuCode": "",
				"skuName": "",
				"totalSaleInvoiceOriMoney": 0,
				"specDescription": "",
				"totalSaleInvoiceOriTax": 0,
				"orderProductType": "",
				"productAuxUnitName": "",
				"invExchRate": 0,
				"subQty": 0,
				"deliveryDetailPrices": {
					"deliveryDetailId": "",
					"oriUnitPrice": 0,
					"oriMoney": 0,
					"oriTax": 0,
					"natTaxUnitPrice": 0,
					"natUnitPrice": 0,
					"natSum": 0,
					"natMoney": 0,
					"natTax": 0
				},
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
					"define8": "",
					"define9": "",
					"define10": "",
					"define11": "",
					"define12": "",
					"define13": "",
					"define14": "",
					"define15": "",
					"define16": "",
					"define17": "",
					"define18": "",
					"define19": "",
					"define20": "",
					"define21": "",
					"define22": "",
					"define23": "",
					"define24": "",
					"define25": "",
					"define26": "",
					"define27": "",
					"define28": "",
					"define29": "",
					"define30": "",
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": ""
				},
				"productUnitName": "",
				"invPriceExchRate": 0,
				"priceQty": 0,
				"qtyName": "",
				"qty": 0,
				"stockName": "",
				"sendDate": "",
				"batchNo": "",
				"productDate": "",
				"invalidDate": "",
				"projectCode": "",
				"projectName": "",
				"detailStockOrgName": "",
				"detailSettlementOrgName": "",
				"detailSalesOrgName": "",
				"detailSaleDepartmentName": "",
				"corpContactUserName": "",
				"corpContactUserErpCode": "",
				"oriTaxUnitPrice": 0,
				"oriSum": 0,
				"taxItems": "",
				"taxCode": "",
				"taxRate": 0,
				"totalOutStockQuantity": 0,
				"totalOutStockSubQty": 0,
				"invoiceQty": 0,
				"invoiceOriSum": 0,
				"remark": "",
				"current_auditor": "",
				"deliveryDetails": {
					"stopper": "",
					"stopTime": "",
					"stopQty": 0,
					"stopPriceQty": 0,
					"stopMoney": 0
				},
				"stopper": "",
				"stopTime": "",
				"totalOutStockPriceQty": 0,
				"define1": "",
				"define2": "",
				"define3": "",
				"define4": "",
				"define5": "",
				"define6": "",
				"define7": "",
				"define8": "",
				"define9": "",
				"define10": "",
				"define11": "",
				"define12": "",
				"define13": "",
				"define14": "",
				"define15": "",
				"define16": "",
				"define17": "",
				"define18": "",
				"define19": "",
				"define20": "",
				"define21": "",
				"define22": "",
				"define23": "",
				"define24": "",
				"define25": "",
				"define26": "",
				"define27": "",
				"define28": "",
				"define29": "",
				"define30": "",
				"bmake_voucher_saleinvoice": "",
				"bmake_st_salesout": "",
				"bizFlow": "",
				"isFlowCoreBill": "",
				"barCode": "",
				"transactionTypeId_name": "",
				"auditDate": "",
				"retailInvestors": "",
				"retailAgentName": "",
				"receiveContacter": "",
				"receiveContacterPhone": "",
				"settlementOrgName": "",
				"shippingChoiceCode": "",
				"bizFlow_name": "",
				"receiveDate": "",
				"receiver": "",
				"receiveMobile": "",
				"receiveTelePhone": "",
				"receiveAddress": "",
				"receievInvoiceMobile": "",
				"receievInvoiceEmail": "",
				"creator": "",
				"createDate": "",
				"auditor": "",
				"auditTime": "",
				"modifier": "",
				"modifyDate": "",
				"modifyTime": "",
				"realMoney": 0,
				"invoiceAgentName": "",
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
				"modelDescription": "",
				"model": "",
				"transactionTypeId": "",
				"headFreeItem": {
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
					"define8": "",
					"define9": "",
					"define10": "",
					"define11": "",
					"define12": "",
					"define13": "",
					"define14": "",
					"define15": "",
					"define16": "",
					"define17": "",
					"define18": "",
					"define19": "",
					"define20": "",
					"define21": "",
					"define22": "",
					"define23": "",
					"define24": "",
					"define25": "",
					"define26": "",
					"define27": "",
					"define28": "",
					"define29": "",
					"define30": "",
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": "",
					"id": ""
				},
				"bodyFreeItem": {
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
					"define8": "",
					"define9": "",
					"define10": "",
					"define11": "",
					"define12": "",
					"define13": "",
					"define14": "",
					"define15": "",
					"define16": "",
					"define17": "",
					"define18": "",
					"define19": "",
					"define20": "",
					"define21": "",
					"define22": "",
					"define23": "",
					"define24": "",
					"define25": "",
					"define26": "",
					"define27": "",
					"define28": "",
					"define29": "",
					"define30": "",
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": "",
					"id": ""
				},
				"creditBalance": 0,
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
				"emergePassStatus": "0：开立；1：审核中；2：已审核",
				"emergePassApplyQty": 0,
				"emergePassClearanceQty": 0,
				"activity": "",
				"activityCode": "",
				"activityName": "",
				"inventoryowner": 123,
				"ownertype": NaN
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

请求说明

新增

返回参数 deliveryType

更新

返回参数 (442)

2	2025-05-20

新增

返回参数 inventoryowner

新增

返回参数 ownertype

OpenAPI查询接口支持查询货主、货权归属


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

