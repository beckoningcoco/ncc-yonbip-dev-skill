---
title: "销售订单撤回"
apiId: "ee7e1e5378714d0096ef017a5b90a152"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Order"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单撤回

> `ContentType	application/json` 请求方式	POST | 分类: Sales Order (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherorder/batchunsubmit

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
| data | object | 是 | 是 | 销售订单[voucher.order.Order] |
| id | long | 否 | 是 | 订单主键id 示例：1958317327470848 |

## 3. 请求示例

Url: /yonbip/sd/voucherorder/batchunsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1958317327470848
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
| message | string | 否 | 调用信息 示例：操作成功 |
| data | object | 否 | 调用的返回数据 |
| count | long | 否 | 返回数据总数 示例：1 |
| sucessCount | long | 否 | 返回成功数 示例：1 |
| failCount | long | 否 | 返回失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 单据信息 |
| failInfos | string | 是 | 失败单据信息 |

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
				"returncount": 0,
				"verifystate": 0,
				"agentId": 2352188003832064,
				"code": "UO-164820211018000003",
				"transactionTypeId": "2350786624983808",
				"isWfControlled": "",
				"bizFlow": "2d54b723-e941-11eb-a68a-0624d60000dc",
				"id": 2479299821097216,
				"isFlowCoreBill": true,
				"status": 0,
				"salesOrgId": "2352090091131648",
				"nextStatus": "CONFIRMORDER",
				"nextStatusName": "开立",
				"currentStatus": 0,
				"statusCode": "CONFIRMBACK",
				"pubts": "2021-11-10 18:09:39"
			}
		],
		"failInfos": [
			""
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

