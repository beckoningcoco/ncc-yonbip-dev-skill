---
title: "销售退货列表查询"
apiId: "20b6f58c0d1a453da57147db60adeacd"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Return"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Return]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售退货列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sales Return (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/sd/vouchersalereturn/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 15:31:12 |
| open_vouchdate_end | string | 否 | 否 | 单据截止时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-15 15:31:12 |
| open_createTime_begin | string | 否 | 否 | 制单开始时间 示例：2024-05-14 15:29:02 |
| code | string | 否 | 否 | 单据编号 示例：XSTH-20240514000001 |
| pageIndex | int | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 示例：10 默认值：10 |
| salesOrgId_name | string | 否 | 否 | 销售组织id 示例：33422212343434 |
| saleReturnStatus | string | 否 | 否 | 单据状态, SUBMITSALERETURN:开立、CONFIRMSALERETURNORDER:已确认、SALERETURNING:退货中、ENDSALERETURN:已审核、OPPOSESALERETURN:已驳回、APPROVING:审核中 示例：SUBMITSALERETURN |
| returnStatus | string | 否 | 否 | 退货状态，SUBMITSALERETURN:待退货审核、CONFIRMSALERETURNORDER:待退货、SALERETURNING:退货中、ENDSALERETURN:已完成、OPPOSESALERETURN:已驳回、 示例：CONFIRMSALERETURNORDER |
| saleReturnSourceType | string | 否 | 否 | 退货类型, NONE:无来源、DELIVERYEND:销售出库单、ORDER:销售订单 示例：NONE |
| orderNo | string | 否 | 否 | 订单编号 示例：XSDD-202400000001 |
| agentId_name | string | 否 | 否 | 客户名称 示例：张三 |
| open_createTime_end | string | 否 | 否 | 制单结束时间 示例：2024-05-20 15:31:12 |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| op | string | 否 | 否 | 比较符(eq:等于;neq:不等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：eq |
| value1 | string | 否 | 否 | 查询条件值1 示例：1997524418372829189 |
| field | string | 否 | 否 | 查询条件字段名 示例：id |
| value2 | string | 否 | 否 | 查询条件值2 |
| logicOp | string | 否 | 否 | 分级逻辑符(and,or) |

## 3. 请求示例

Url: /yonbip/sd/vouchersalereturn/list?access_token=访问令牌
Body: {
	"open_vouchdate_begin": "2024-05-13 15:31:12",
	"open_vouchdate_end": "2024-05-15 15:31:12",
	"open_createTime_begin": "2024-05-14 15:29:02",
	"code": "XSTH-20240514000001",
	"pageIndex": 1,
	"pageSize": 10,
	"salesOrgId_name": "33422212343434",
	"saleReturnStatus": "SUBMITSALERETURN",
	"returnStatus": "CONFIRMSALERETURNORDER",
	"saleReturnSourceType": "NONE",
	"orderNo": "XSDD-202400000001",
	"agentId_name": "张三",
	"open_createTime_end": "2024-05-20 15:31:12",
	"isSum": false,
	"simpleVOs": [
		{
			"op": "eq",
			"value1": "1997524418372829189",
			"field": "id",
			"value2": "",
			"logicOp": ""
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
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| sumRecordList | object | 是 | 汇总结果对象 |
| pageIndex | int | 否 | 当前页码 |
| pageSize | int | 否 | 分页大小 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页 |
| endPageIndex | int | 否 | 结束页 |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳 |
| recordList | object | 是 | 返回结果对象 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"sumRecordList": [
			{
				"oriMoney": 37171,
				"qty": 728,
				"totalMoney": 37988,
				"natMoney": 37171,
				"natSum": 37588,
				"oriSum": 37588,
				"payMoneyDomestic": 6420,
				"natTax": 417,
				"totalMoneyOrigTaxfree": 6365,
				"payMoneyDomesticTaxfree": NaN,
				"payMoneyOrigTaxfree": 37571,
				"totalMoneyDomesticTaxfree": 6365,
				"priceQty": 728,
				"subQty": 728,
				"oriTax": 417,
				"totalMoneyDomestic": 6420
			}
		],
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"salesOrgId": "",
				"code": "",
				"orderNo": "",
				"vouchdate": "",
				"agentId": "",
				"saleDepartmentId": "",
				"salesOrgId_name": "",
				"corpContact": "",
				"saleReturnStatus": "",
				"agentId_name": "",
				"refundStatus": "",
				"saleDepartmentId_name": "",
				"payMoney": 0,
				"creatorId": "",
				"corpContactUserName": "",
				"id": "",
				"currencyCode": "",
				"pubts": "",
				"pubuts": "",
				"currencyName": "",
				"logisticWayId": "",
				"isWfControlled": "",
				"verifystate": "",
				"status": "",
				"returnStatus": "",
				"saleOutStatus": "",
				"saleOutClose": true,
				"deliverTime": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"exchangeRateType": {
					"name": ""
				},
				"saleReturnDetailId": "",
				"orderDetailId": "",
				"exchRate": 0,
				"orderDetailIdKey": "",
				"natCurrencyCode": "",
				"sourceautoid": "",
				"productId": "",
				"shippingChoiceId": "",
				"natCurrencyName": "",
				"skuId": "",
				"saleReturnSourceType": "",
				"projectId": "",
				"lineno": "",
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"bizFlow_version": "",
				"salePrice": 0,
				"creator": "",
				"taxId": "",
				"createTime": "",
				"stockId": "",
				"saleReturnDetails_stockOrgId": 0,
				"saleReturnDepartmentId": "",
				"totalOutStockOriTaxMoney": 0,
				"totalOutStockOriMoney": 0,
				"totalOutStockOriTax": 0,
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"expireDateNo": 0,
				"expireDateUnit": "",
				"iProductAuxUnitId": "",
				"iProductUnitId": "",
				"masterUnitId": "",
				"purUOM_Precision": 0,
				"priceUOM_Precision": 0,
				"unit_Precision": 0,
				"bizId": "",
				"shippingChoiceId_name": "",
				"bizName": "",
				"orderProductType": "",
				"groupId": "",
				"bizProductId": "",
				"enable": "",
				"createdDate": "",
				"upcode": "",
				"productCode": "",
				"productName": "",
				"skuCode": "",
				"skuName": "",
				"specDescription": "",
				"productAuxUnitName": "",
				"invExchRate": 0,
				"subQty": 0,
				"productUnitName": "",
				"invPriceExchRate": 0,
				"priceQty": 0,
				"qtyName": 0,
				"qty": 0,
				"stockName": "",
				"batchNo": "",
				"productDate": "",
				"invalidDate": "",
				"projectId_code": "",
				"projectId_name": "",
				"shippingChoiceId_code": "",
				"stockOrgId_name": "",
				"oriTaxUnitPrice": 0,
				"oriUnitPrice": 0,
				"oriSum": 0,
				"oriMoney": 0,
				"taxItems": "",
				"taxCode": "",
				"taxRate": 0,
				"oriTax": 0,
				"natTaxUnitPrice": 0,
				"natUnitPrice": 0,
				"natSum": 0,
				"natMoney": 0,
				"natTax": 0,
				"totalOutStockQuantity": 0,
				"totalOutStockSubQty": 0,
				"invoiceQty": 0,
				"invoiceOriSum": 0,
				"bmake_voucher_saleinvoice": "",
				"bizFlow": "",
				"isFlowCoreBill": "",
				"transactionTypeId_name": "",
				"auditDate": "",
				"retailAgentName": "",
				"settlementOrgId_name": "",
				"taxInclusive": "",
				"saleReturnMemo": {
					"remark": ""
				},
				"bizFlow_name": "",
				"modifier": "",
				"modifyTime": "",
				"auditor": "",
				"auditTime": "",
				"logisticWayId_name": "",
				"logisticsBillNo": "",
				"logisticsUserName": "",
				"logisticsUserPhone": "",
				"logisticsCarNum": "",
				"receiver": "",
				"receiveMobile": "",
				"receiveTelePhone": "",
				"receiveAddress": "",
				"receiveZipCode": "",
				"invoiceAgentId_name": "",
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
				"totalMoneyOrigTaxfree": 0,
				"payMoneyOrigTaxfree": 0,
				"totalMoneyDomestic": 0,
				"payMoneyDomestic": 0,
				"totalMoneyDomesticTaxfree": 0,
				"payMoneyDomesticTaxfree": 0,
				"modelDescription": "",
				"model": "",
				"saleReturnDetails": {
					"retNotNeedInvoiceQty": 0
				},
				"tradeRouteID": "",
				"tradeRouteID_code": "",
				"tradeRouteID_name": "",
				"checkByRevenueManagement": "",
				"isEndTrade": 0,
				"tradeRouteLineno": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


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

