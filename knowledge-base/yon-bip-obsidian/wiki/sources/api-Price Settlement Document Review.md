---
title: "价格结算单审核"
apiId: "1892969461089042434"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Settlement Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 价格结算单审核

> `ContentType	application/json` 请求方式	POST | 分类: Price Settlement Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/pricesettlement/batchaudit

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
| data | object | 是 | 是 | 请求体 |
| id | long | 否 | 是 | 价格结算单主表id 示例：1730690972242176 |

## 3. 请求示例

Url: /yonbip/scm/pricesettlement/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1730690972242176
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
| code | long | 否 | 编码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | object | 否 | data |
| count | long | 否 | 数量 示例：1 |
| sucessCount | long | 否 | 成功数量 示例：1 |
| failCount | long | 否 | 失败数量 示例：0 |
| messages | string | 是 | messages |
| infos | object | 是 | infos |
| failInfos | string | 是 | failInfos |
| traceId | string | 否 | traceId 示例：4dd9679eb3e62f0a |

## 5. 正确返回示例

{
	"code": 200,
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
				"returncount": 0,
				"verifystate": 2,
				"code": "FKJDFKJD231213231213000002",
				"pocode": "000800ef",
				"product_cCode": "0004000058",
				"invoiceVendor": "1860919152418488323",
				"priceUOM_Code": "HUR",
				"vouchdate": "2023-12-13 00:00:00",
				"postAccountStatus": 0,
				"isExeDetailedReconciliation": false,
				"priceSettlementsCharacteristics": {
					"ytenant": "0000LJWID23ACHFLLQ0000",
					"id": "1883490330818904067",
					"pubts": "2023-11-13 09:45:51"
				},
				"purOrg": "1860916017091837959",
				"priceUOM": "1767570031094267904",
				"inInvoiceOrg": "1860916017091837959",
				"invoiceVendor_name": "eflong调出",
				"product_cName": "eflong",
				"settleOriTaxUnitPrice": "2.03",
				"postAccountVersion": 6,
				"id": "1883490330818904064",
				"settleOriUnitPrice": "2",
				"product": "1860922820295917569",
				"oriSum": "4.06",
				"inInvoiceOrg_name": "eflong调出",
				"isWfControlled": false,
				"priceSettlements_id": "1883490330818904065",
				"sourceOrderlineno": "10",
				"filelist": "1883490330818904064",
				"oriUnitPrice": "2",
				"bustype": "1767570022504857986",
				"benchmarkPrice": "2.03",
				"inOrg_name": "eflong调出",
				"isContract": false,
				"iInOrg": "1860916017091837959",
				"priceQty": "2",
				"priceUOM_Name": "小时",
				"oriTaxUnitPrice": "2.03",
				"oriMoney": "4",
				"paymentProcess": 0,
				"priceSettlementQty": "2",
				"purOrg_name": "eflong调出",
				"status": 1,
				"auditor": "昵称-达利园集团",
				"auditorId": "1768160795264811013",
				"auditTime": "2023-12-26 14:11:42",
				"auditDate": "2023-12-26 00:00:00",
				"tenant": 3371369601374432,
				"ytenant": "0000LJWID23ACHFLLQ0000",
				"pubts": "2023-12-26 14:11:42",
				"inOrg": "1860916017091837959",
				"creatorId": "1845342731948261386",
				"bizFlow": "088be7b1-7573-459b-83cc-3913999a348c",
				"exchRate": 1,
				"natCurrency": "1767570031095316512",
				"vendor": "1860919152418488323",
				"creationWay": 1,
				"exchRateDate": "2023-12-13 00:00:00",
				"currency": "1767570031095316512",
				"isFlowCoreBill": false,
				"isUpdateEstimation": true,
				"createDate": "2023-12-13 00:00:00",
				"creator": "马兴华",
				"createTime": "2023-12-13 19:32:13",
				"exchRateType": "0000LJWID23ACHFLLQ0000",
				"priceSettlements": [
					{
						"oriTax": 0.06,
						"pocode": "000800ef",
						"firstsource": "st_purchaseorder",
						"firstupcode": "000800ef",
						"natTax": 0.06,
						"source": "ustock.st_purinrecord",
						"subQty": 2,
						"priceSettlementsCharacteristics": {
							"ytenant": "0000LJWID23ACHFLLQ0000",
							"id": "1883490330818904067",
							"pubts": "2023-11-13 09:45:51"
						},
						"id": "1883490330818904065",
						"mainid": "1883490330818904064",
						"oriUnitPrice": 2,
						"natSum": 4.06,
						"warehouse": "1768166249863839747",
						"benchmarkPrice": 2.03,
						"taxRate": 1.5,
						"unit": "1767570031094267904",
						"productsku": "1860922837475786759",
						"qty": 2,
						"podetailid": "1861040906130423816",
						"oriTaxUnitPrice": 2.03,
						"productPuType": "0",
						"oriMoney": 4,
						"invExchRate": 1,
						"discountTaxType": "0",
						"unitExchangeTypePrice": 0,
						"natUnitPrice": 2,
						"stockUnitId": "1767570031094267904",
						"warehouseSubQty": 2,
						"firstsourceautoid": "1861040906130423816",
						"makeRuleCode": "purinrecordToPriceSettlement",
						"receiptDocEntryAndMgmt": "invoicing_confirm_AP",
						"priceUOM": "1767570031094267904",
						"invPriceExchRate": 1,
						"settleOriTaxUnitPrice": 2.03,
						"firstsourceid": "1861040906130423815",
						"settleOriSum": 4.06,
						"pubts": "2023-12-13 19:32:14",
						"settleOriUnitPrice": 2,
						"sourceid": "1861041567555387393",
						"rowno": 0,
						"product": "1860922820295917569",
						"sourceUpLineno": 10,
						"oriSum": 4.06,
						"ytenant": "0000LJWID23ACHFLLQ0000",
						"sourceOrderlineno": 10,
						"settleOriMoney": 4,
						"unitExchangeType": 0,
						"poid": "1861040906130423815",
						"sourceautoid": "1861041567555387394",
						"lineno": 10,
						"priceQty": 2,
						"settlementTax": 0.06,
						"upcode": "CGRK-20231113-01470",
						"settlementQty": 2,
						"taxitems": "10003",
						"natTaxUnitPrice": 2.03,
						"priceMark": 0,
						"priceSettlementQty": 2,
						"natMoney": 4,
						"upLineno": 10,
						"priceSettlementSun": [
							{
								"unNatWarehouseDeductTax": 0,
								"oriTax": 0.06,
								"pocode": "000800ef",
								"firstsource": "st_purchaseorder",
								"iNatMWarehouseUnitPrice": 2,
								"firstupcode": "000800ef",
								"warehouseOriMoney": 4,
								"natTax": 0.06,
								"source": "ustock.st_purinrecord",
								"subQty": 2,
								"coReconciliation": false,
								"warehouseInvExchRate": 1,
								"natCurrency": "1767570031095316512",
								"iNatWarehouseCostMoney": 4,
								"unDeductTax": 0,
								"costMoney": 4,
								"id": "1883490330818904066",
								"mainid": "1883490330818904065",
								"ustockPubts": "2023-11-13 13:35:54",
								"iNatMWarehouseSum": 4.06,
								"oriUnitPrice": 2,
								"oriCostUnitPrice": 2,
								"natSum": 4.06,
								"warehouse": "1768166249863839747",
								"iOriWarehouseCostMoney": 4,
								"taxRate": 1.5,
								"unit": "1767570031094267904",
								"productsku": "1860922837475786759",
								"hasPaymentSchedules": true,
								"warehouseOriUnitPrice": 2,
								"iNatMWarehouseMoney": 4,
								"qty": 2,
								"podetailid": "1861040906130423816",
								"oriTaxUnitPrice": 2.03,
								"oriWarehouseDeductTax": 0,
								"oriMoney": 4,
								"invExchRate": 1,
								"discountTaxType": "0",
								"unitExchangeTypePrice": 0,
								"stockUnitId": "1767570031094267904",
								"natUnitPrice": 2,
								"isGiftProduct": false,
								"warehouseSubQty": 2,
								"reserveid": 0,
								"firstsourceautoid": "1861040906130423816",
								"makeRuleCode": "purinrecordToPriceSettlement",
								"warehouseOriTax": 0.06,
								"iNatWarehouseTax": 0.06,
								"exchRate": 1,
								"iOriWarehouseCostUnitPrice": 2,
								"receiptDocEntryAndMgmt": "invoicing_confirm_AP",
								"priceUOM": "1767570031094267904",
								"invPriceExchRate": 1,
								"firstsourceid": "1861040906130423815",
								"currency": "1767570031095316512",
								"iNatMWarehouseTaxUnitPrice": 2.03,
								"warehouseTaxRate": 1.5,
								"pubts": "2023-12-13 19:32:14",
								"isUpdateEstimation": true,
								"sourceid": "1861041567555387393",
								"rowno": 10,
								"product": "1860922820295917569",
								"sourceUpLineno": 10,
								"warehouseOriTaxUnitPrice": 2.03,
								"iNatWarehouseCostUnitPrice": 2,
								"oriSum": 4.06,
								"purInRecord": "1861041567555387394",
								"ytenant": "0000LJWID23ACHFLLQ0000",
								"sourceOrderlineno": 10,
								"warehouseOriSum": 4.06,
								"unitExchangeType": 0,
								"warehouseTaxItems": "10003",
								"poid": "1861040906130423815",
								"bustype": "1767570022504857637",
								"sourceautoid": "1861041567555387394",
								"priceQty": 2,
								"oriCostMoney": 4,
								"reconciliationStatus": "not_reconciled",
								"costUnitPrice": 2,
								"upcode": "CGRK-20231113-01470",
								"settlementQty": 2,
								"warehousePriceQty": 2,
								"unNatDeductTax": 0,
								"taxitems": "10003",
								"natTaxUnitPrice": 2.03,
								"wareUnDeductTaxRate": 0,
								"priceSettlementQty": 2,
								"priceMark": 0,
								"upLineno": 10,
								"natMoney": 4
							}
						]
					}
				],
				"voucherType": "1481798575251259398"
			}
		],
		"failInfos": [
			""
		]
	},
	"traceId": "4dd9679eb3e62f0a"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

