---
title: "付款工作台单据审核"
apiId: "c0286de3645c4459bf56af304fe7bee3"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款工作台单据审核

> `ContentType	application/json` 请求方式	POST | 分类: Payment Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/cmppaymentlist/batchaudit

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
| rows | object | 是 | 否 | 业务数据 |
| pubts | string | 否 | 是 | 时间戳 示例：2020-10-20 11:22:44 |
| id | long | 否 | 是 | 单据id 示例：1930625070685696 |

## 3. 请求示例

Url: /yonbip/fi/cmppaymentlist/batchaudit?access_token=访问令牌
Body: {
	"rows": [
		{
			"pubts": "2020-10-20 11:22:44",
			"id": 1930625070685696
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| msgs | object | 是 | 消息集合 |
| sucessCount | int | 否 | 成功数量 |
| failCount | int | 否 | 失败数量 |
| count | int | 否 | 数量 |
| messages | object | 是 | 返回信息集合 |
| message | string | 否 | 返回信息 |
| rows | object | 是 | recordList |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"msgs": [
			{}
		],
		"sucessCount": 0,
		"failCount": 0,
		"count": 0,
		"messages": [
			{}
		],
		"message": "",
		"rows": [
			{
				"auditstatus": "",
				"id": "",
				"pubts": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	单据不存在	填入有意义的id号


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

