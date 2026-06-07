---
title: "应付明细账查询"
apiId: "b127c16af9b94fcd816f30d259d42c30"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts Payable"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts Payable]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付明细账查询

> `ContentType	application/json` 请求方式	POST | 分类: Accounts Payable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/ap/report/ledger

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
| groups | object | 是 | 否 | 分组 |
| name | string | 否 | 否 | 分组字段名称，accentity：会计主体；currency：币种；supplier：供应商；basebilltype：事项类型；tradetype：交易类型；billdate：单据日期；billno：单据编号；accountdate：立账日期；orderno：订单编号等 示例：accentity |
| params | object | 否 | 否 | 请求参数 |
| ctx | object | 否 | 否 | 上下文环境参数 |
| bz | object | 否 | 否 | 业务参数 |
| fields | object | 是 | 否 | 显示字段 |
| name | string | 否 | 否 | 表头字段名称，accentity：会计主体；currency：币种；supplier：供应商；basebilltype：事项类型；tradetype：交易类型；billdate：单据日期；billno：单据编号；accountdate：立账日期；orderno：订单编号；description：摘要；de_amount：本期借方-原币；de_local_amount：本期借方-本币；cr_amount：本期贷方-原币；cr_local_amount：本期贷方-本币；end_amount_total：期末余额-原币；end_local_amount_total：期末余额-本币等 示例：accentity |
| alias | string | 否 | 否 | 别名 示例：accentity_NONE_ |
| aggr | string | 否 | 否 | 聚合类型，avg：求平均；max：最大值；min：最小值；sum：求和；count：计数，count_distinct：去重计数 示例：sum |
| conditions | object | 是 | 否 | 查询 |
| op | string | 否 | 否 | 查询组合，and：和；or：或 示例：and |
| queryLevel | boolean | 否 | 否 | 关联，false：否；true：是 示例：false |
| items | object | 是 | 否 | 查询项目 |
| pager | object | 否 | 否 | 分页参数 |
| pageSize | int | 否 | 否 | 每页条数：10, 20, 30, 50, 80, 100, 200, 500, 1000 |
| pageIndex | int | 否 | 否 | 页号，从0开始 |
| to | int | 否 | 否 | 必填（不填返回0条），等于(pageIndex + 1) * pageSize，用于截取本页最后的数据行 |

## 3. 请求示例

Url: /yonbip/fi/ap/report/ledger?access_token=访问令牌
Body: {
	"groups": [
		{
			"name": "accentity"
		}
	],
	"params": {
		"ctx": {
			"serviceCode": "marap_ap_ledger0001"
		},
		"bz": {
			"hasUnAuditFlag": "false",
			"serviceCode": "marap_ap_ledger0001",
			"querytype": "",
			"endDate": "2020-11-09",
			"arapType": "ap",
			"hasDetail": "1",
			"startDate": "2018-10-10",
			"periodStart": "",
			"periodEnd": "",
			"hasPreOarFlag": "",
			"hasPayable": ""
		}
	},
	"fields": [
		{
			"name": "accentity",
			"alias": "accentity_NONE_",
			"aggr": "sum"
		}
	],
	"conditions": [
		{
			"op": "and",
			"queryLevel": false,
			"items": [
				{
					"op": "eq",
					"name": "accentity",
					"v1": [
						"1746236822491392",
						"1822758621565184"
					],
					"queryLevel": false
				}
			]
		}
	],
	"pager": {
		"pageSize": 0,
		"pageIndex": 0,
		"to": 0
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回状态码 示例：200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| data | object | 否 | 业务数据 |
| result | object | 是 | 返回数据, 与请求参数中的 fields 匹配 |
| pageIndex | long | 否 | 当前页 示例：0 |
| recordCount | long | 否 | 数据总数 示例：34 |
| pageCount | long | 否 | 总页数 示例：2 |
| pageSize | long | 否 | 每页显示多少条 示例：20 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"result": [
			{
				"accentity": "1746236822491392",
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"billno": "PAYar201102000023",
				"accountdate": "2020-11-02",
				"description": "期初",
				"de_amount": 0,
				"de_local_amount": 0,
				"cr_amount": 0,
				"cr_local_amount": 0,
				"description_order": 1,
				"end_amount": 112596.173,
				"end_local_amount": 112596.173,
				"basecurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"orderno": "CGDD220114000002",
				"basebilltype": "15",
				"tradetype": "2102729381974272",
				"moneytype": 0,
				"supplier": "2141203112579328",
				"billdate": "2022-01-14"
			}
		],
		"pageIndex": 0,
		"recordCount": 34,
		"pageCount": 2,
		"pageSize": 20
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	查询成功	应付明细账无错误码，只会出现时data为空


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

