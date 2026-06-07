---
title: "采购发票提交"
apiId: "3d64874c5fee4b30a2f6a0008c5e5286"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Invoice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购发票提交

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Invoice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purinvoice/batchsubmit

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
| id | long | 否 | 是 | 采购发票主表id 示例：2282796996055296 |

## 3. 请求示例

Url: /yonbip/scm/purinvoice/batchsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2282796996055296
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回值 |
| count | long | 否 | 数量 示例：1 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 返回数据体 |

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
				"oriTax": 0.087379,
				"isBeginning": false,
				"invoiceVendor": 2216205960679680,
				"memo": "004004004",
				"source": "ustock.st_osminrecord",
				"natTax": 0.087379,
				"srcBill": 2254278663214080,
				"contactTel": "13312345678",
				"operator": "2192006489690368",
				"smallTaxpayer": "0",
				"totalQuantity": 2,
				"natCurrency": "2155547424560384",
				"inInvoiceOrg": "2163951720681984",
				"maturityDate": "2021-08-11 00:00:00",
				"contact": "1231231",
				"invoiceType": 0,
				"otherInvoiceCode": "00420210811",
				"id": 2382996215681536,
				"tenant": 2155538208313600,
				"isWfControlled": true,
				"srcBillNO": "OSMI20210512000001",
				"natSum": 3,
				"invVendorAccount": "8888",
				"taxRate": 3,
				"exchRateType": "csrka3z7",
				"oriMoney": 2.912621,
				"status": 0,
				"returncount": 2,
				"verifystate": 0,
				"code": "000091",
				"invVendorBankId": 2257038752174336,
				"creatorId": 2192008994279680,
				"exchRate": 1,
				"vouchdate": "2021-08-11 00:00:00",
				"vendor": 2216205960679680,
				"otherInvoiceDate": "2021-08-11 00:00:00",
				"currency": "2155547424560384",
				"invVendorBank": "中国工商银行股份有限公司天津中北支行",
				"isInvBack": false,
				"department": "2163953113665792",
				"pubts": "2021-08-11 13:48:04",
				"createDate": "2021-08-11 00:00:00",
				"accountDate": "2021-08-11 00:00:00",
				"creator": "刘预发接口测试员工",
				"oriSum": 3,
				"org": "2163951720681984",
				"bustype": "2381909246759168",
				"createTime": "2021-08-11 09:49:06",
				"purInvoices": [
					{
						"purUOM": 2192249830953216,
						"oriTax": 0.087379,
						"inOrg": "2163951720681984",
						"project": "2306587387253248",
						"memo": "666",
						"firstsource": "productionorder.po_subcontract_order",
						"firstupcode": "09010222",
						"natTax": 0.087379,
						"source": "ustock.st_osminrecord",
						"subQty": 2,
						"costedMoney": 2.912621,
						"proDescFlag": "0",
						"unDeductTax": 0,
						"id": 2382996215681537,
						"mainid": 2382996215681536,
						"oriUnitPrice": 1.456311,
						"natSum": 3,
						"srcPOLineID": 2254272968511745,
						"taxRate": 3,
						"unit": 2192249830953216,
						"srcPOID": 2254272968511744,
						"productsku": 2192250219548928,
						"qty": 2,
						"oriTaxUnitPrice": 1.5,
						"oriMoney": 2.912621,
						"invExchRate": 1,
						"discountTaxType": "0",
						"unitExchangeTypePrice": 0,
						"isGiftProduct": false,
						"isUpdateCost": true,
						"natUnitPrice": 1.456311,
						"demandOrg": "2163951720681984",
						"firstsourceautoid": 2254272968511745,
						"makeRuleCode": "st_osminrecord2invoice",
						"priceUOM": 2192249830953216,
						"invPriceExchRate": 1,
						"firstsourceid": 2254272968511744,
						"sourceid": 2254278663214080,
						"rowno": 1,
						"product": 2192250208538880,
						"oriSum": 3,
						"accountOrg": "2163951720681984",
						"unitExchangeType": 0,
						"creditStatus": 0,
						"sourceautoid": 2254278663263232,
						"priceQty": 2,
						"upcode": "OSMI20210512000001",
						"srcPOCode": "09010222",
						"taxitems": "2155547427149061",
						"natTaxUnitPrice": 1.5,
						"unDeductTaxRate": 0,
						"natMoney": 2.912621
					}
				],
				"taxitems": "2155547427149061",
				"natMoney": 2.912621
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


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

