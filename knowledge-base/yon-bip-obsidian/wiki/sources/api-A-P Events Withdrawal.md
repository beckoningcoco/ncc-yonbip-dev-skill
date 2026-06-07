---
title: "应付事项撤回"
apiId: "3598774600a2492ea44159c14470069d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "A/P Events"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/P Events]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付事项撤回

> `ContentType	application/json` 请求方式	POST | 分类: A/P Events (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/oap/batchunsubmit

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 业务数据 |
| id | long | 否 | 是 | 单据id 示例：2292711581880832 |

## 3. 请求示例

Url: /yonbip/fi/oap/batchunsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2292711581880832
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用状态信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| successCountAI | long | 否 | 撤回成功数 示例：1 |
| failCountAI | long | 否 | 撤回失败数 示例：0 |
| count | long | 否 | 总数 示例：1 |
| sucessCount | long | 否 | 撤回成功数 示例：1 |
| failCount | long | 否 | 撤回失败数 示例：0 |
| messages | string | 是 | 调用失败时的错误信息 |
| infos | object | 是 | 单据信息 |

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
			""
		],
		"infos": [
			{
				"isWfControlled": true,
				"id": 2292711581880832,
				"verifystate": 1,
				"status": 3,
				"tenant": 2146685620752640,
				"pubts": "2021-06-08 15:38:26"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	未找到流程实例,businesskey: 'arap_oap_2292711581880832	输入有效的单据id、单据已经提交


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

