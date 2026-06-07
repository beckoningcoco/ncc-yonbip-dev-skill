---
title: "销售退货驳回"
apiId: "acd3ad0a203143f3b77025b56d045afb"
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

# 销售退货驳回

> `ContentType	application/json` 请求方式	POST | 分类: Sales Return (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/vouchersalereturn/oppose

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
| data | object | 否 | 是 | 销售退货单 |
| id | long | 是 | 是 | 退货单主表id 示例：[2088849684795648] |

## 3. 请求示例

Url: /yonbip/sd/vouchersalereturn/oppose?access_token=访问令牌
Body: {
	"data": {
		"id": [
			2088849684795648
		]
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
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| count | long | 否 | 数据总条数 示例：1 |
| sucessCount | long | 否 | 成功数据条数 示例：1 |
| failCount | long | 否 | 失败数据条数 示例：0 |
| messages | string | 是 | 失败返回信息 |
| infos | object | 是 | 信息 |
| failInfos | string | 是 | 失败信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"natCurrencyCode": "CNY",
				"saleReturnReason": "原因修改50792315",
				"source": "voucher_saleoutlist_pull",
				"realMoney": 60000,
				"payMoneyDomestic": 60000,
				"natCurrency": "2155547424560384",
				"invoiceTitleType": 0,
				"bizId": 2155538208313600,
				"modifyInvoiceType": true,
				"id": 2514945428427520,
				"payMoneyOrigTaxfree": 60000,
				"natCurrencyName": "人民币",
				"refundUnConfirmMoney": 0,
				"orderNo": "QbOJ-000000000-20211112-000025",
				"receiver": "111",
				"receiveAddress": "211",
				"isWfControlled": false,
				"totalMoney": 60000,
				"agentRelationId": 2514915518845184,
				"saleReturnStatus": "SUBMITSALERETURN",
				"invoiceAgentId": 2514915506458880,
				"barCode": "voucher_salereturn|2514945428427520",
				"rebateToOrderMoney": 0,
				"rebateToCashMoneyDomesticTaxfree": 0,
				"payMoneyDomesticTaxfree": 60000,
				"rebateToOrderMoneyOrigTaxfree": 0,
				"settlementOrgId": "2163951720681984",
				"totalNatTax": 0,
				"status": 0,
				"agentId": 2514915506458880,
				"code": "S0T5-0000000000-20211112-000007",
				"rebateToCashMoneyDomestic": 0,
				"rebateToOrderMoneyDomesticTaxfree": 0,
				"shop": -1,
				"invoiceMoney": 0,
				"creatorId": 2514915563720960,
				"refundStatus": "NONE",
				"exchRate": 1,
				"rebateToCashMoney": 0,
				"vouchdate": "2021-11-12 00:00:00",
				"taxInclusive": true,
				"refundConfirmMoney": 0,
				"payMoney": 60000,
				"currencyName": "人民币",
				"isDeleted": 0,
				"totalMoneyDomesticTaxfree": 60000,
				"currency": "2155547424560384",
				"saleReturnDetails": [
					{
						"qtyName": "袋",
						"returnQuantity": 60,
						"auxUnitQuantity": 10,
						"oriTax": 0,
						"orderId": 2514942955770624,
						"saleReturnNo": "S0T5-0000000000-20211112-000007",
						"groupId": 0,
						"realMoney": 60000,
						"natTax": 0,
						"source": "ustock.st_salesout",
						"subQty": 10,
						"productName": "lxq物料",
						"taxItems": "9%",
						"enable": true,
						"isExpiryDateManage": false,
						"originalOrderSupplyAgain": false,
						"bizId": 2155538208313600,
						"id": 2514945428427521,
						"skuId": 2312588956487936,
						"isSkuReserve": false,
						"orderNo": "QbOJ-000000000-20211112-000025",
						"productId": 2312588947624192,
						"oriUnitPrice": 1000,
						"natSum": 60000,
						"saleReturnId": 2514945428427520,
						"taxCode": "VAT9",
						"isScrap": false,
						"rebateMoney": 0,
						"taxRate": 9,
						"masterUnitId": 2312582309908736,
						"productAuxUnitName": "箱",
						"taxId": "2155547427149058",
						"qty": 60,
						"oriTaxUnitPrice": 1000,
						"settlementOrgId": "2163951720681984",
						"oriMoney": 60000,
						"invExchRate": 1,
						"isUpdateCost": false,
						"natUnitPrice": 1000,
						"iProductAuxUnitId": 2263072523178240,
						"makeRuleCode": "salesoutTosalereturn",
						"isreserve": false,
						"isDeleted": 0,
						"invPriceExchRate": 6,
						"isBatchManage": false,
						"retNotNeedInvoiceQty": 0,
						"totalOutStockPriceQty": 0,
						"pubts": "2021-11-12 14:54:48",
						"sourceid": 2514943514546688,
						"uordercorp": 2155538208313600,
						"oriSum": 60000,
						"salePrice": 1000,
						"rebateFlag": false,
						"conversionRate": 1,
						"cashRebateMoney": 0,
						"orderDetailId": 2514942955770625,
						"orderRebateMoney": 0,
						"sourceautoid": 2514943514546689,
						"productCode": "0001000018",
						"isAllowOrginReplenish": false,
						"priceQty": 60,
						"productUnitName": "袋",
						"upcode": "XSCK20211112000013",
						"stockId": 2381826272055552,
						"stockOrgId": "2163951720681984",
						"iProductUnitId": 2312582309908736,
						"natTaxUnitPrice": 1000,
						"orderProductType": "SALE",
						"natMoney": 60000,
						"salesOrgId": "2163951720681984"
					}
				],
				"saleReturnSourceType": "DELIVERYEND",
				"pubts": "2021-11-12 14:55:28",
				"refundAmount": 0,
				"receiveMobile": "11",
				"createDate": "2021-11-12 14:54:47",
				"rebateToOrderMoneyDomestic": 0,
				"creator": "梁秀琴",
				"rebateToCashMoneyOrigTaxfree": 0,
				"uordercorp": 2155538208313600,
				"transactionTypeId": "2155547426656517",
				"totalMoneyDomestic": 60000,
				"exchangeRateType": "csrka3z7",
				"createSource": 2,
				"createTime": "2021-11-12 14:54:47",
				"totalMoneyOrigTaxfree": 60000,
				"currencyCode": "CNY",
				"invoiceUpcType": 0,
				"totalOriTax": 0,
				"salesOrgId": "2163951720681984",
				"headItem": {
					"saleReturnId": 2514945428427520,
					"define5": "222",
					"define4": "2321",
					"saleReturnNo": "S0T5-0000000000-20211112-000007",
					"id": 2514945428427520,
					"pubts": "2021-11-12 14:54:48",
					"uordercorp": 2155538208313600
				}
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	没有查询到对应的单据，请检查相关数据！	检查数据合法性


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

