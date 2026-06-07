---
title: "付款单审核"
apiId: "80878a330fe44e3bb59358c9f434b312"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Document"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款单审核

> `ContentType	application/json` 请求方式	POST | 分类: Payment Document (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/paymentlist/batchaudit

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 业务数据 |
| id | long | 否 | 是 | 单据id 示例：2253371082396160 |
| pubts | string | 否 | 否 | 时间戳, 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-10-20 11:22:44 |

## 3. 请求示例

Url: /yonbip/fi/paymentlist/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2253371082396160,
			"pubts": "2020-10-20 11:22:44"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用状态信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
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
				"id": 2253371082396160,
				"auditstatus": 1,
				"localbalance": 8,
				"verifystate": 2,
				"auditor": "YonSuite默认用户",
				"auditorId": 1746053385097472,
				"auditTime": "2021-05-14 15:52:44",
				"auditDate": "2021-05-14 00:00:00",
				"status": 1,
				"tenant": 1746053384048896,
				"pubts": "2021-05-14 15:52:44"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	单据不存在 id:22533710823961600	输入租户下有意义的单据id


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

