---
title: "采购发票弃审"
apiId: "bfb3e02d261b409cb16df0e9c61c3e1a"
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

# 采购发票弃审

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Invoice (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/purinvoice/batchunaudit

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 请求体 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 是 | 采购发票主表id 示例：1730690972242176 |

## 3. 请求示例

Url: /yonbip/scm/purinvoice/batchunaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
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
| data | object | 否 | 返回值 |
| count | long | 否 | 数量 示例：1 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 返回信息 |

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
				"verifystate": 0,
				"memo": "信息",
				"source": "pu_applyorder",
				"code": "FP210525000014",
				"oriTax": 0,
				"isBeginning": false,
				"invoiceVendor": 2223424306024704,
				"operator": "2344322345432343",
				"bizFlow": "初版",
				"smallTaxpayer": "343",
				"srcBill": "2343234543234543",
				"creatorId": 1730438232035584,
				"exchRate": 1,
				"natTax": 0,
				"vouchdate": "2021-05-25 00:00:00",
				"invoiceType": "0",
				"maturityDate": "2021-05-25 00:00:00",
				"totalQuantity": 7,
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"inInvoiceOrg": "1731905877594368",
				"vendor": 2223424306024704,
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"id": 2271577126998528,
				"isInvBack": false,
				"accountDate": "2021-07-22 21:02:30",
				"pubts": "2021-07-22 21:02:30",
				"auditDate": "2021-07-22 21:02:30",
				"isFlowCoreBill": "",
				"tenant": 1730438231412992,
				"srcBillNO": "234321234321",
				"createDate": "2021-05-24 00:00:00",
				"auditorId": "23455432345654",
				"creator": "YonSuite默认用户",
				"exchRateType": "23455432345654",
				"auditTime": "2021-05-24 00:00:00",
				"invVendorAccount": "23454323432123",
				"oriSum": 14,
				"org": "1731905877594368",
				"isWfControlled": false,
				"returncount": "1",
				"natSum": 0,
				"department": "1730486466924800",
				"invVendorBank": "false",
				"invVendorBankId": "110000000000234",
				"bustype": "110000000000032",
				"createTime": "2021-05-24 16:47:45",
				"purInvoices": [
					{
						"purUOM": 1730486466924800,
						"oriTax": 0,
						"inOrg": "1731905877594368",
						"firstsource": "pu_applyorder",
						"taxitems": "234432123",
						"upcode": "23432343",
						"firstupcode": "234432123",
						"source": "pu_applyorder",
						"subQty": 2,
						"costedMoney": 234,
						"natTax": 0,
						"free1": "1",
						"free2": "2",
						"unDeductTax": 1,
						"proDescFlag": "0",
						"priceUOM": 1730486466924800,
						"id": 2271577126998529,
						"mainid": 2271577126998528,
						"product": 1730488078799104,
						"accountOrg": "采购组织",
						"oriSum": 14,
						"oriUnitPrice": 0,
						"unitExchangeType": 1,
						"creditStatus": 0,
						"natSum": 0,
						"taxRate": 0,
						"unit": 1,
						"productsku": 1730488085860608,
						"qty": 7,
						"oriTaxUnitPrice": 0,
						"oriMoney": 14,
						"natTaxUnitPrice": 0,
						"invExchRate": 1,
						"discountTaxType": "2",
						"isUpdateCost": false,
						"natMoney": 0,
						"unitExchangeTypePrice": 0,
						"demandOrg": "1730488085860608",
						"priceQty": 1,
						"sourceautoid": "1730488085860608",
						"firstsourceautoid": "1730488085860602",
						"invPriceExchRate": 1,
						"makeRuleCode": "ww233",
						"isGiftProduct": false,
						"sourceid": "1730488085860613",
						"rowno": "1",
						"firstsourceid": "1730488085860613",
						"unDeductTaxRate": 1,
						"natUnitPrice": 0
					}
				],
				"oriMoney": 14,
				"natMoney": 0,
				"status": 0
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

