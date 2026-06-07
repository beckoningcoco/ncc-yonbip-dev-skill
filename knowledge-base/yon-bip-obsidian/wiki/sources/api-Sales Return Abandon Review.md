---
title: "销售退货弃审"
apiId: "8787be7177bc49c59c9751d3c8978b8f"
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

# 销售退货弃审

> `ContentType	application/json` 请求方式	POST | 分类: Sales Return (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/vouchersalereturn/unaudit

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
| data | object | 否 | 是 | 退货单数据集 |
| id | long | 是 | 否 | 退货单ID，退货单ID和退货单据编号不能同时为空，ID和单据编号同时存在以ID为准，示例：2155419223904768 示例：[2155419223904768] |
| code | string | 是 | 否 | 单据编号，退货单ID和退货单据编号不能同时为空，ID和单据编号同时存在以ID为准，示例：S0T5-0000000000-20210707-000002 示例：["SACT20210303000017"] |

## 3. 请求示例

Url: /yonbip/sd/vouchersalereturn/unaudit?access_token=访问令牌
Body: {
	"data": {
		"id": [
			2155419223904768
		],
		"code": [
			"SACT20210303000017"
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
| code | string | 否 | 请求返回码 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时返回的数据 |
| successCountAI | long | 否 | 成功数据条数 示例：1 |
| failCountAI | long | 否 | 失败数据条数 示例：0 |
| count | long | 否 | 数据总条数 示例：1 |
| sucessCount | long | 否 | 成功数据条数 示例：1 |
| failCount | long | 否 | 失败数据条数 示例：0 |
| messages | string | 是 | 调用接口失败返回的信息 |
| infos | object | 是 | 调用接口成功返回数据信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"natCurrencyCode": "CNY",
				"receiveZipCode": "7777777777",
				"invoiceAddress": "66667777",
				"source": "voucher_saleoutlist_pull",
				"realMoney": 88,
				"payMoneyDomestic": 88,
				"logisticsUserPhone": "333333",
				"natCurrency": "2155547424560384",
				"invoiceTitleType": 0,
				"bizId": 2155538208313600,
				"modifyInvoiceType": true,
				"id": 2382132207571200,
				"payMoneyOrigTaxfree": 85.436893,
				"invoiceTitle": "中央大客户工信部",
				"natCurrencyName": "人民币",
				"refundUnConfirmMoney": 0,
				"bankAccount": "888888888888888",
				"corpContact": "2163960865427712",
				"receiver": "5555",
				"receiveAddress": "666666",
				"isWfControlled": false,
				"totalMoney": 88,
				"agentRelationId": 2251598196248832,
				"saleReturnStatus": "SALERETURNING",
				"invoiceAgentId": 2216247878177024,
				"corpContactUserName": "倪帅臣",
				"barCode": "voucher_salereturn|2382132207571200",
				"rebateToOrderMoney": 0,
				"rebateToCashMoneyDomesticTaxfree": 0,
				"payMoneyDomesticTaxfree": 85.44,
				"saleDepartmentId": "2163953113665792",
				"rebateToOrderMoneyOrigTaxfree": 0,
				"settlementOrgId": "2163951720681984",
				"totalNatTax": 2.56,
				"status": 0,
				"subBankName": "中国工商银行股份有限公司天津中北支行",
				"verifystate": 0,
				"agentId": 2251598175195392,
				"code": "S0T5-0000000000-20210810-000003",
				"logisticsCarNum": "444444",
				"logisticsUserName": "22222",
				"rebateToCashMoneyDomestic": 0,
				"rebateToOrderMoneyDomesticTaxfree": 0,
				"shop": -1,
				"invoiceMoney": 0,
				"creatorId": 2192008994279680,
				"refundStatus": "NONE",
				"bankName": "中国工商银行",
				"exchRate": 1,
				"rebateToCashMoney": 0,
				"vouchdate": "2021-08-10 00:00:00",
				"taxInclusive": true,
				"refundConfirmMoney": 0,
				"payMoney": 88,
				"currencyName": "人民币",
				"isDeleted": 0,
				"totalMoneyDomesticTaxfree": 85.44,
				"invoiceTelephone": "88887777",
				"currency": "2155547424560384",
				"saleReturnDetails": [
					{
						"qtyName": "袋",
						"returnQuantity": 4,
						"auxUnitQuantity": 0.67,
						"oriTax": 2.563107,
						"orderId": 2332054302069248,
						"saleReturnNo": "S0T5-0000000000-20210810-000003",
						"groupId": 0,
						"firstsource": "udinghuo.voucher_order",
						"firstupcode": "QbOJ-000000000-20210706-000000",
						"realMoney": 88,
						"natTax": 2.563107,
						"source": "ustock.st_salesout",
						"subQty": 0.67,
						"productName": "lxq物料",
						"taxItems": "3%",
						"sourceOriPrice": 21.36,
						"enable": true,
						"isExpiryDateManage": false,
						"originalOrderSupplyAgain": false,
						"bizId": 2155538208313600,
						"id": 2382132207571201,
						"skuId": 2312588956487936,
						"isSkuReserve": false,
						"orderNo": "QbOJ-000000000-20210706-000000",
						"productId": 2312588947624192,
						"totalOutStockQuantity": 4,
						"oriUnitPrice": 21.359223,
						"natSum": 88,
						"saleReturnId": 2382132207571200,
						"taxCode": "VAT3",
						"isScrap": false,
						"rebateMoney": 0,
						"taxRate": 3,
						"masterUnitId": 2312582309908736,
						"idKey": "2382126353223936",
						"productAuxUnitName": "箱",
						"taxId": "2155547427149061",
						"qty": 4,
						"oriTaxUnitPrice": 22,
						"settlementOrgId": "2163951720681984",
						"oriMoney": 85.436893,
						"invExchRate": 6,
						"isUpdateCost": true,
						"natUnitPrice": 21.359223,
						"iProductAuxUnitId": 2263072523178240,
						"firstsourceautoid": 2332054302069249,
						"makeRuleCode": "salesoutTosalereturn",
						"isreserve": false,
						"totalOutStockOriTaxMoney": -88,
						"isDeleted": 0,
						"invPriceExchRate": 1,
						"totalOutStockOriMoney": -85.436893,
						"isBatchManage": false,
						"firstsourceid": 2332054302069248,
						"totalOutStockPriceQty": 4,
						"sourceid": 2332068536865536,
						"rowno": 10,
						"uordercorp": 2155538208313600,
						"oriSum": 88,
						"salePrice": 22,
						"rebateFlag": false,
						"unitExchangeType": 1,
						"conversionRate": 1,
						"cashRebateMoney": 0,
						"orderDetailId": 2332054302069249,
						"orderRebateMoney": 0,
						"sourceautoid": 2332068536865537,
						"productCode": "0001000018",
						"isAllowOrginReplenish": true,
						"priceQty": 4,
						"productUnitName": "袋",
						"upcode": "XSCK20210706000001",
						"stockId": 2192242573644032,
						"stockOrgId": "2163951720681984",
						"iProductUnitId": 2312582309908736,
						"totalOutStockSubQty": 0.67,
						"natTaxUnitPrice": 22,
						"orderProductType": "SALE",
						"natMoney": 85.436893,
						"salesOrgId": "2163951720681984"
					}
				],
				"taxNum": "SH999000999",
				"saleReturnMemoId": 2382132207571200,
				"saleReturnSourceType": "DELIVERYEND",
				"pubts": "2021-08-10 19:14:19",
				"isFlowCoreBill": true,
				"refundAmount": 0,
				"receiveMobile": "18655454434",
				"createDate": "2021-08-10 19:10:12",
				"rebateToOrderMoneyDomestic": 0,
				"creator": "刘预发接口测试员工",
				"rebateToCashMoneyOrigTaxfree": 0,
				"uordercorp": 2155538208313600,
				"logisticsBillNo": "111",
				"transactionTypeId": "2155547426656517",
				"totalMoneyDomestic": 88,
				"logisticWayId": 2154744480764413,
				"receiveId": 2251598175211778,
				"exchangeRateType": "csrka3z7",
				"createTime": "2021-08-10 19:10:12",
				"totalMoneyOrigTaxfree": 85.44,
				"currencyCode": "CNY",
				"invoiceUpcType": 2,
				"totalOriTax": 2.563107,
				"salesOrgId": "2163951720681984",
				"headItem": {
					"saleReturnId": 2382132207571200,
					"saleReturnNo": "S0T5-0000000000-20210810-000003",
					"define2": "鹅鹅鹅鹅鹅鹅饿鹅鹅鹅饿",
					"define1": "得得得",
					"id": 2381203338957570,
					"uordercorp": 2155538208313600
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	"Index: 0, Size: 0"


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

请求说明

2	2025-02-18

更新

请求说明

更新

返回参数 (54)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

