---
title: "客户退款单审核"
apiId: "605a52d8c3234487bc9da286d4229e6a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts Receivable"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户退款单审核

> `ContentType	application/json` 请求方式	POST | 分类: Accounts Receivable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/paybilllist/batchaudit

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 业务数据 |
| id | long | 否 | 是 | 单据id 示例：2247140225716736 |
| pubts | string | 否 | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2020-10-20 11:22:44 |

## 3. 请求示例

Url: /yonbip/fi/paybilllist/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2247140225716736,
			"pubts": "2020-10-20 11:22:44"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回状态信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| successCountAI | long | 否 | 审核成功数 示例：1 |
| failCountAI | long | 否 | 审核失败数 示例：0 |
| count | long | 否 | 总数 示例：1 |
| sucessCount | long | 否 | 审核成功数 示例：1 |
| failCount | long | 否 | 审核失败数 示例：0 |
| messages | string | 是 | 调用失败时的错误信息 |
| infos | object | 是 | 单据信息 |

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
				"id": 2247140225716736,
				"auditstatus": 1,
				"localbalance": 1,
				"verifystate": 2,
				"auditor": "YonSuite默认用户",
				"auditorId": 1746053385097472,
				"auditTime": "2021-05-14 14:01:39",
				"auditDate": "2021-05-14 00:00:00",
				"status": 1,
				"tenant": 1746053384048896,
				"returncount": 0,
				"code": "CREFar210507000002",
				"signature": "fQQxJEXAI6qXH5Z6aXM43Sg43Bg==",
				"creatorId": 1746235204587776,
				"exchRate": 1,
				"caobject": 1,
				"accentity": "2082884093088768",
				"operator": "2016864759779584",
				"settlestatus": 1,
				"cmpflag": false,
				"vouchdate": "2021-05-07 00:00:00",
				"basebilltypecode": "arap_payment",
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"billtype": 9,
				"balance": 1,
				"lossearnflag": false,
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"pubts": "2021-05-14 14:01:39",
				"createDate": "2021-05-07 00:00:00",
				"busiaccbook": 2087537187050240,
				"period": 1748916978569472,
				"creator": "陈执行",
				"oriSum": 1,
				"bookAmount": 0,
				"isWfControlled": false,
				"basebilltype": "FICA2",
				"dept": "2016858650382592",
				"natSum": 1,
				"redflag": false,
				"srcitem": 6,
				"voucherstatus": 2,
				"exchangeRateType": "ev3qqwud",
				"tradetype": "1153091135960120",
				"initflag": false,
				"writeoffstatus": 2,
				"createTime": "2021-05-07 10:29:20",
				"paystatus": 0,
				"customer": 2116894291808512,
				"PayBillb": [
					{
						"id": 2247140225733120,
						"quickTypeCode": "2",
						"oriSum": 1,
						"bookAmount": 0,
						"localbalance": 1,
						"dept": "2016858650382592",
						"natSum": 1,
						"operator": "2016864759779584",
						"quickType": 1845421988916477,
						"balance": 1,
						"mainid": 2247140225716736,
						"pubts": "2021-05-07 10:29:21",
						"customer": 2116894291808512
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	单据不存在 id:22471402257167360	在对应的租户下，输入有意义的单据id


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

