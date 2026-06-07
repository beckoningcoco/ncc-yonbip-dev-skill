---
title: "签收确认单个审核"
apiId: "91cdcb5dc11b4e64a1238aee237d28bc"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sign-in Confirmation Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sign-in Confirmation Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 签收确认单个审核

> `ContentType	application/json` 请求方式	POST | 分类: Sign-in Confirmation Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/signconfirmation/batchaudit

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
| data | object | 是 | 是 | data |
| id | long | 否 | 是 | 签收确认主键 示例：2224754591355136 |

## 3. 请求示例

Url: /yonbip/scm/signconfirmation/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2224754591355136
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息描述 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 返回数据 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 错误信息 |
| infos | object | 是 | 成功数据信息 |
| failInfos | object | 是 | 失败数据信息 |

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
				"headItem": {
					"define1": "1",
					"id": 2741832389038592
				},
				"cReceiver": "王",
				"contactName": "刘",
				"cReceiveZipCode": "120104000000",
				"corpContact": "2265901211635968",
				"contactid": 2296977581920512,
				"cReceiveMobile": "186111",
				"department": "2163953113665792",
				"receiveContacterPhone": "186777",
				"memo": "n",
				"cReceiveAddress": "北京市海淀区",
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"srcBill": "2739725314396416",
				"shop": "-1",
				"invoiceOrg": "1620041647149568",
				"verifystate": 2,
				"code": "QSQR202201260166",
				"creatorId": "2580154781125888",
				"exchRate": 1,
				"salesOrg": "2356392404080640",
				"vouchdate": "2022-01-26 00:00:00",
				"natCurrency": "2351874939032064",
				"id": 2620863802495232,
				"pubts": "2022-02-24 10:44:38",
				"tenant": 2351873187860736,
				"createDate": "2022-02-22 00:00:00",
				"creator": "WLS",
				"org": "2356392404080640",
				"auditTime": "2022-04-21 21:36:30",
				"auditor": "刘",
				"auditorId": "2155538209116416",
				"auditDate": "2022-04-21 21:36:08",
				"isWfControlled": false,
				"warehouse": 2355235696709888,
				"bustype": "2592843724003328",
				"receiveId": 0,
				"barCode": "usp_signconfirmation|2740018952589568",
				"srcBillNO": "kgnz-20220420-00004",
				"isFlowCoreBill": false,
				"createTime": "2022-02-22 17:03:02",
				"exchRateType": "0000KRBF48WG59AUYJ0000",
				"cust": 2366361808376064,
				"status": 1,
				"details": [
					{
						"bodyItem": {
							"define1": "1",
							"id": 2741832389038593
						},
						"sactCode": "SACT20220420000452",
						"goodsposition": "2318145801933056",
						"natMoney": 1000,
						"taxUnitPriceTag": true,
						"outBillRow": "10",
						"orderDetailId": 2739723727622657,
						"unitExchangeType": 0,
						"priceUOM": 1618887778881792,
						"natUnitPrice": 0.99,
						"outcode": "kgnz-20220420-00004",
						"taxId": "8cad5fd7cc5647678dd71ede5c86e833",
						"variancePriceQty": 0,
						"firstSrcBillRow": "10",
						"varianceQty": 1,
						"varianceSubQty": "1",
						"orderId": 2739723727622656,
						"receivedSubQty": 1,
						"oriTax": 0,
						"receiveableQty": 1,
						"firstsourceautoid": 2613743915176449,
						"makeRuleCode": "saleOutToSignconfirmation",
						"firstsource": "udinghuo.voucher_order",
						"firstupcode": "UO-064020220121000001",
						"natTax": 0,
						"source": "ustock.st_salesout",
						"subQty": 1,
						"invPriceExchRate": 1,
						"firstsourceid": 2613743915176448,
						"receivedBilling": false,
						"id": 2659460414050561,
						"mainid": 2659460414050560,
						"tenant": 2351873187860736,
						"sourceid": 2613745385575168,
						"product": 2582629761602816,
						"oriSum": 0.3333,
						"oriUnitPrice": 0.3333,
						"natSum": 0.33,
						"unit": 2352410771869952,
						"sourceautoid": 2613745385575170,
						"productsku": 2582629761602817,
						"receivedQty": 1,
						"priceQty": 1,
						"sourceType": "st_salesout",
						"upcode": "XSCK20220121000001",
						"qty": 1,
						"srcBillRow": "2",
						"orderCode": "UO-064020220121000001",
						"oriTaxUnitPrice": 0.3333,
						"oriMoney": 0.33,
						"invExchRate": 1,
						"natTaxUnitPrice": 0.333,
						"orderProductType": "SALE",
						"stockUnitId": 2352410771869952,
						"taxRate": 1.5,
						"rejectQty": 8,
						"rejectSubQty": 10,
						"lossQty": 5,
						"lossSubQty": 5,
						"approvedLossQty": 8,
						"approvedLossSubQty": 8
					}
				]
			}
		],
		"failInfos": [
			{}
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

1	2026-05-14

更新

请求参数 data

skill增加用户级权限


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

