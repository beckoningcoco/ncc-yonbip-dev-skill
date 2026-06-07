---
title: "调拨订单审核"
apiId: "59506fc08be140c49e257470b1b0dbed"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 调拨订单审核

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferapply/batchaudit

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
| data | object | 是 | 是 | 数据集 |
| id | long | 否 | 是 | 主表id 示例：1915883840213504 |
| pubts | string | 否 | 否 | 时间戳字符串 示例：2020-09-15 10:17:50 |

## 3. 请求示例

Url: /yonbip/scm/transferapply/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1915883840213504,
			"pubts": "2020-09-15 10:17:50"
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
| code | long | 否 | code 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| messages | string | 是 | 返回消息 |
| successCountAI | long | 否 | 成功次数 示例：1 |
| failCountAI | long | 否 | 失败次数 示例：0 |
| infos | object | 是 | infos |
| sucessCount | long | 否 | 成功次数 示例：1 |
| failCount | long | 否 | 失败次数 示例：0 |
| count | long | 否 | 总数 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"messages": [
			""
		],
		"successCountAI": 1,
		"failCountAI": 0,
		"infos": [
			{
				"auditTime": "2020-09-15 11:03:27",
				"qty": "11",
				"verifystate": 2,
				"transferApplys_id": "1915883840213505",
				"code": "DBDD20200914000013",
				"outorg_name": "智能公司",
				"outorg": "1855091490394368",
				"pubts": "2020-09-15 11:03:27",
				"inorg_name": "智能公司",
				"finishoutqty": "0",
				"propertiesValue": "颜色:绿色;年份:12年;",
				"isWfControlled": false,
				"tenant": 1855085258166528,
				"outwarehouse": 1875204634939648,
				"auditor": "张三",
				"status": 1,
				"id": 1915883840213504,
				"auditDate": "2020-09-15 00:00:00",
				"inorg": "1855091490394368",
				"stockUnitId": "1875215514866432",
				"auditorId": 1855085258494208,
				"headItem": {
					"define1": ""
				}
			}
		],
		"sucessCount": 1,
		"failCount": 0,
		"count": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	根据提示检查，再操作即可


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-02-26

更新

请求说明

更新

返回参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

