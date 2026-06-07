---
title: "资产减值准备列表查询"
apiId: "c6bb21cd306c4b94a035787216774eff"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Change Request"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产减值准备列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Change Request (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/impairmentofassets/list

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
| pageIndex | int | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | int | 否 | 否 | 每页行数 示例：10 默认值：10 |
| accentity | string | 否 | 否 | 会计主体 示例：2148237326782720 |
| code | string | 否 | 否 | 资产变动编码 |
| vouchdate | DateTime | 否 | 否 | 单据日期 |
| auditTime | DateTime | 否 | 否 | 审核日期 |

## 3. 请求示例

Url: /yonbip/fi/impairmentofassets/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"accentity": "2148237326782720",
	"code": "",
	"vouchdate": "",
	"auditTime": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回固定资产减值准备数据 |
| pageIndex | long | 否 | 页号 示例：1 |
| pageSize | long | 否 | 每页行数 示例：10 |
| recordCount | long | 否 | 总数 示例：0 |
| recordList | object | 是 | 列表数据 |
| sumRecordList | object | 是 | 资产减值准备卡片列表 |
| pageCount | long | 否 | 总页数 示例：0 |
| beginPageIndex | long | 否 | 开始页码（第一页） 示例：1 |
| endPageIndex | long | 否 | 结束页码（有多少页） 示例：0 |
| pubts | string | 否 | 时间戳 示例：2021-03-02 17:41:20 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 0,
		"recordList": [
			{
				"returncount": 0,
				"verifystate": 0,
				"currency_moneyDigit": 2,
				"period": 2145519937425664,
				"creator": "17835411342",
				"currency_priceDigit": 2,
				"code": "DIV000001",
				"currency_name": "人民币",
				"isWfControlled": false,
				"period_name": "2021-02",
				"accentity_name": "固定资产",
				"accentity": "2148237326782720",
				"totalaccrued": 1,
				"voucherstatus": "2",
				"vouchdate": "2021-02-02 00:00:00",
				"tradetype": "2145521022243076",
				"createTime": "2021-03-02 17:39:57",
				"totalbookvalue": 9983.17,
				"currency": "2145519866484224",
				"id": 2154135492579584,
				"pubts": "2021-03-02 17:39:58",
				"status": 0
			}
		],
		"sumRecordList": [
			{
				"currency_moneyDigit": 2,
				"currency_priceDigit": 2,
				"currency": "2145519866484224"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pubts": "2021-03-02 17:41:20"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	操作成功	查询时无错误码，只会查出来的data为空。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

返回参数 (37)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

