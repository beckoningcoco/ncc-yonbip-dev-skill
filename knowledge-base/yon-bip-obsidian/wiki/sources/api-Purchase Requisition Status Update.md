---
title: "请购单状态回写"
apiId: "afb9f091694a4c4d8d5921053a2ab6b8"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Requisition"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 请购单状态回写

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Requisition (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/uretail/applyorder/save

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
| billnum | string | 否 | 否 | 单据标识 示例：pu_applyorder |
| data | object | 是 | 否 | 数据节点 |
| _status | string | 否 | 否 | 实体状态 示例：Update |
| applyOrders | object | 是 | 否 | 请购单实体 |
| bizstatus | string | 否 | 否 | 业务状态 示例：2 |
| id | long | 否 | 否 | 头id 示例：2015035918323968 |
| id__pk | string | 否 | 否 | 错误标识pk 示例：10011310000000000U3M |
| isNC | boolean | 否 | 否 | 来源NC标识 示例：true |
| key | string | 否 | 否 | 错误key 示例：id__pk |

## 3. 请求示例

Url: /yonbip/sd/uretail/applyorder/save?access_token=访问令牌
Body: {
	"billnum": "pu_applyorder",
	"data": [
		{
			"_status": "Update",
			"applyOrders": [
				{
					"_status": "Update",
					"approveNum": 1,
					"id": 2015035918323969,
					"supplyCount": 1
				}
			],
			"bizstatus": "2",
			"id": 2015035918323968,
			"id__pk": "10011310000000000U3M",
			"isNC": true
		}
	],
	"key": "id__pk"
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
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 状态消息 示例：操作成功 |
| data | object | 否 | 数据集合 |
| count | long | 否 | 总数量 示例：1 |
| sucessCount | long | 否 | 成功数量 示例：1 |
| failCount | long | 否 | 失败数量 示例：0 |
| messages | object | 是 | 错误消息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{
				"message": "org.springframework.jdbc.BadSqlGrammarException",
				"key": "1001A110000000000870"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

message	失败原因

code	999


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-19

更新

请求说明

更新

请求参数 (13)

更新

返回参数 data

更新

返回参数 messages


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

