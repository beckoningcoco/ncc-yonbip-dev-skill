---
title: "采购发票审核"
apiId: "a4854d45c2a04b71905facbd8cab4e4f"
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

# 采购发票审核

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Invoice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purinvoice/batchaudit

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
| pursettle_asyncKey | string | 否 | 否 | 异步参数 示例：1730690972242176 |
| id | long | 否 | 是 | 采购发票主表id 示例：1730690972242176 |

## 3. 请求示例

Url: /yonbip/scm/purinvoice/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"pursettle_asyncKey": "1730690972242176",
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 数量 示例：1 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 返回体 |

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
				"oriTax": 3.12,
				"isBeginning": false,
				"invoiceVendor": 2361775086571776,
				"memo": "20210810",
				"source": "ustock.st_purinrecord",
				"natTax": 3.12,
				"srcBill": 2381970815422976,
				"operator": "2192006489690368",
				"smallTaxpayer": "0",
				"totalQuantity": 1,
				"natCurrency": "2155547424560384",
				"inInvoiceOrg": "2163951720681984",
				"maturityDate": "2021-08-1100:00:00",
				"invoiceType": 0,
				"id": 2383267817067008,
				"tenant": 2155538208313600,
				"isWfControlled": false,
				"srcBillNO": "CGRK000020210810000000",
				"natSum": 27.12,
				"invVendorAccount": "1234567890",
				"auditorId": 2155538209116416,
				"auditTime": "2021-08-1114:26:15",
				"exchRateType": "csrka3z7",
				"oriMoney": 24,
				"status": 1,
				"returncount": 0,
				"verifystate": 2,
				"code": "000093",
				"invVendorBankId": 2361775086604545,
				"creatorId": 2192008994279680,
				"bizFlow": "0180327b-9756-11eb-930b-00163e0abb70",
				"exchRate": 1,
				"vouchdate": "2021-08-1100:00:00",
				"vendor": 2361775086571776,
				"currency": "2155547424560384",
				"invVendorBank": "中国建设银行总行(不受理个人业务)",
				"isInvBack": false,
				"department": "2163953113665792",
				"pubts": "2021-08-1114:26:15",
				"isFlowCoreBill": false,
				"createDate": "2021-08-1100:00:00",
				"auditDate": "2021-08-1100:00:00",
				"accountDate": "2021-08-1100:00:00",
				"creator": "刘预发接口测试员工",
				"oriSum": 27.12,
				"org": "2163951720681984",
				"auditor": "YonSuite默认用户",
				"bustype": "2155547426590996",
				"createTime": "2021-08-1114:25:23",
				"purInvoices": [
					{
						"purUOM": 2263072642208000,
						"oriTax": 3.12,
						"inOrg": "2163951720681984",
						"firstsource": "ustock.st_purinrecord",
						"firstupcode": "CGRK000020210810000000",
						"natTax": 3.12,
						"source": "ustock.st_purinrecord",
						"subQty": 0.03,
						"costedMoney": 24,
						"proDescFlag": "0",
						"free2": "3G",
						"free1": "黄",
						"unDeductTax": 0,
						"id": 2383267817067009,
						"mainid": 2383267817067008,
						"oriUnitPrice": 300,
						"natSum": 27.12,
						"taxRate": 13,
						"unit": 2263330539655424,
						"productsku": 2282818041532673,
						"qty": 1,
						"oriTaxUnitPrice": 339,
						"oriMoney": 24,
						"invExchRate": 36,
						"discountTaxType": "0",
						"unitExchangeTypePrice": 0,
						"isGiftProduct": false,
						"isUpdateCost": true,
						"natUnitPrice": 300,
						"demandOrg": "2163951720681984",
						"firstsourceautoid": 2381970815422977,
						"makeRuleCode": "st_purinrecord",
						"priceUOM": 2263072523178240,
						"invPriceExchRate": 12,
						"firstsourceid": 2381970815422976,
						"sourceid": 2381970815422976,
						"rowno": 1,
						"product": 2282818041532672,
						"oriSum": 27.12,
						"accountOrg": "2163951720681984",
						"unitExchangeType": 0,
						"creditStatus": 0,
						"sourceautoid": 2381970815422977,
						"priceQty": 0.08,
						"upcode": "CGRK000020210810000000",
						"taxitems": "2155547427149056",
						"natTaxUnitPrice": 339,
						"unDeductTaxRate": 0,
						"natMoney": 24
					}
				],
				"natMoney": 24
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

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

