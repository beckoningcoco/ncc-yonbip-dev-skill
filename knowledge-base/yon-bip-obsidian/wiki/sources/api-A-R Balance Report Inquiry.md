---
title: "应收余额表查询"
apiId: "558d2336ecda4d57885c9c77feb97db1"
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

# 应收余额表查询

> `ContentType	application/json` 请求方式	POST | 分类: Accounts Receivable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/ar/report/balance

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
| groups | object | 是 | 是 | 分组 |
| name | string | 否 | 是 | 分组字段名称，accentity：会计主体；currency：币种；customer：客户等 示例：accentity |
| params | object | 否 | 是 | 请求参数 |
| bz | object | 否 | 是 | 业务参数 |
| fields | object | 是 | 是 | 显示字段 |
| name | string | 否 | 是 | 表头字段名称，accentity：会计主体；customer：客户；currency：币种；begin_amount_total：期初余额-原币；begin_local_amount_total：期初余额-本币；debit_amount_total：本期借方-原币；debit_local_amount_total：本期借方-本币；credit_amount_total：本期贷方-原币；credit_local_amount_total：本期贷方-本币；end_amount_total：期末余额-原币；end_local_amount_total：期末余额-本币等 示例：accentity |
| conditions | object | 是 | 否 | 查询条件 |
| op | string | 否 | 否 | 查询组合，and：和；or：或 示例：and |
| items | object | 是 | 否 | 查询项目 |

## 3. 请求示例

Url: /yonbip/fi/ar/report/balance?access_token=访问令牌
Body: {
	"groups": [
		{
			"name": "accentity"
		}
	],
	"params": {
		"bz": {
			"querytype": "2",
			"periodStart": "$$$",
			"periodEnd": "$$$",
			"startDate": "$$$",
			"endDate": "$$$",
			"audit": "false",
			"hasPreOarFlag": "$$$",
			"hasReceivable": ""
		}
	},
	"fields": [
		{
			"name": "accentity"
		}
	],
	"conditions": [
		{
			"op": "and",
			"items": [
				{
					"op": "eq",
					"name": "accentity",
					"v1": [
						""
					]
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回状态码 示例：200 |
| data | object | 否 | 业务数据 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| result | object | 是 | 返回数据, 与请求参数中的 fields 匹配 |
| pageIndex | long | 否 | 当前页 示例：0 |
| pageSize | long | 否 | 每页显示多少条 示例：1 |
| recordCount | long | 否 | 数据总数 示例：1 |
| pageCount | long | 否 | 总页数 示例：1 |
| needconvert | boolean | 否 | 需要转换 示例：false |
| dynamic_condition | object | 否 | 动态列条件_余额跳转明细用 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"result": [
			{
				"accentity": "2186405809951744",
				"customer": 2104386483245312,
				"currency": "2102728191758848",
				"dynamic_column": {
					"currency": "2102728191758848",
					"accentity": "2186405809951744",
					"customer": 2104386483245312
				},
				"tenantcenterid": "zp4hcm6g",
				"begin_amount_total": 48.9,
				"begin_local_amount_total": 48.9,
				"debit_amount_total": 6816,
				"debit_local_amount_total": 6816,
				"credit_amount_total": 5975,
				"credit_local_amount_total": 5975,
				"end_amount_total": 889.9,
				"end_local_amount_total": 889.9,
				"basecurrency": "2102728191758848"
			}
		],
		"pageIndex": 0,
		"pageSize": 1,
		"recordCount": 1,
		"pageCount": 1,
		"needconvert": false,
		"dynamic_condition": {
			"op": "and",
			"items": [
				{
					"name": "customer.id",
					"op": "in",
					"v1": [
						"2104386483245312"
					]
				}
			]
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	查询成功	应收余额表无错误码，只会出现时data为空


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

