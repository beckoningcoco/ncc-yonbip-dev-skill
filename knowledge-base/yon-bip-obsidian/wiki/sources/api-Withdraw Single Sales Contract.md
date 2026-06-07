---
title: "销售合同单个撤回"
apiId: "d6ccb2d754fb4bfb95243a3cc8f5c329"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Contract"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售合同单个撤回

> `ContentType	application/json` 请求方式	POST | 分类: Sales Contract (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/sact/sactunsubmit

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
| data | object | 否 | 是 | data |
| id | long | 否 | 是 | id 示例：2088849684795648 |

## 3. 请求示例

Url: /yonbip/sd/sact/sactunsubmit?access_token=访问令牌
Body: {
	"data": {
		"id": 2088849684795648
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
| code | long | 否 | 返回码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| successCountAI | long | 否 | 成功条数 示例：1 |
| failCountAI | long | 否 | 失败条数 示例：0 |
| count | long | 否 | 条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | object | 是 | 返回信息 |
| infos | object | 是 | 信息内容 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"agentId": 1839398929764608,
				"code": "SACT20210522000101",
				"receiveContacter": "客户联系人",
				"creatorId": 1838303819272448,
				"saleDepartmentId": "",
				"salesmanId": "",
				"bizFlow": "376c9725-7693-11eb-8ace-0624d60000dc",
				"cqtUnitExchangeType": "",
				"saleUnitExchangeType": "",
				"exchRate": 1,
				"totalOriReceipts": 0,
				"totalTax": 0.113208,
				"vouchdate": "2021-05-22 00:00:00",
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"receiveContacterPhone": "18766662222",
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"id": 2268579694989824,
				"payMoneyOrigTaxfree": 1.886792,
				"pubts": "2021-05-22 14:08:46",
				"isFlowCoreBill": true,
				"bussinessTelephone": "321",
				"contractStatus": NaN,
				"agreement": 1842328195141888,
				"transactionTypeId": "2019269036986624",
				"isWfControlled": true,
				"totalPriceTax": 2,
				"bussinessAddress": "231",
				"changestatus": NaN,
				"createTime": "2021-05-22 13:58:36",
				"name": "121",
				"planEffectiveDate": "2021-05-29 00:00:00",
				"salesOrgId": "1839391506075904",
				"status": NaN,
				"tenant": 1730438231412992,
				"contractCtrlType": NaN,
				"exchangeRateType": "lzsrm3iy",
				"planExpirationDate": "",
				"deliAddr": 1839398929764609,
				"createDate": "2021-05-22 00:00:00",
				"invoiceAgentId": 1839398929764608,
				"verifystate": NaN,
				"childs": [
					{
						"oriTax": 0.113208,
						"taxcCodeId": "49fc23cd681b4dc7bc12c5ea555ee181",
						"natTax": 0.113208,
						"subQty": 1,
						"invPriceExchRate": 1,
						"isBatchManage": false,
						"isExpiryDateManage": false,
						"id": 2268579695022592,
						"tenant": 1730438231412992,
						"skuId": 2159643570802944,
						"cqtUnitId": 1732091523862784,
						"saleunitId": 1732091523862784,
						"rowno": 10,
						"productId": 2159643545653504,
						"oriSum": 2,
						"sactVId": 2268579694989824,
						"oriUnitPrice": 1.886792,
						"natSum": 2,
						"taxRate": 6,
						"masterUnitId": 1732091523862784,
						"priceQty": 1,
						"qty": 1,
						"stockOrgId": 1839391506075904,
						"oriTaxUnitPrice": 2,
						"oriMoney": 1.886792,
						"finOrgId": "1839391506075904",
						"invExchRate": 1,
						"natTaxUnitPrice": 2,
						"natMoney": 1.886792,
						"natUnitPrice": 1.886792
					}
				],
				"receiveAgreement": [
					{
						"controlMode": 1,
						"periodId": 1842328195174656,
						"controlOppt": 2,
						"agreeOId": 2268579695022593,
						"receivePercent": 25,
						"controlLink": 1,
						"sactVId": 2268579694989824,
						"receiveStartBase": 1726136857301603,
						"preReceive": false,
						"recMoney": 0,
						"startBaseCode": "OrderBillDate",
						"delayMonths": 1,
						"accountDay": 30,
						"receiveName": "1",
						"sourceType": true,
						"delayDays": 1,
						"arMoney": 0.5,
						"deposit": false,
						"id": 2268579695022593,
						"preReceiveType": 0,
						"tenant": 1730438231412992,
						"order": 1
					}
				],
				"executeOrganizations": [
					{
						"sactVId": 2268579694989824,
						"id": 2268579695055361,
						"execOrgId": "1839391506075904",
						"tenant": 1730438231412992
					}
				],
				"defines": {
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
					"define30": ""
				}
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

