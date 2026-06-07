---
title: "请购单删除"
apiId: "e9d26fced0794701a7f19268a2b1d42f"
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

# 请购单删除

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Requisition (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/applyorder/delete

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
| data | object | 是 | 否 | data |
| id | long | 否 | 是 | 请购单id 示例：2143815495864576 |
| pubts | string | 否 | 否 | 请购单时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-02-23 10:41:54 |

## 3. 请求示例

Url: /yonbip/scm/applyorder/delete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2143815495864576,
			"pubts": "2021-02-23 10:41:54"
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据包 |
| successCountAI | long | 否 | 成功次数 示例：1 |
| failCountAI | long | 否 | 失败次数 示例：0 |
| count | long | 否 | 次数 示例：1 |
| sucessCount | long | 否 | 成功次数 示例：1 |
| failCount | long | 否 | 失败次数 示例：0 |
| messages | string | 是 | 返回信息 示例：["操作成功"] |
| infos | string | 是 | 信息 示例：["操作成功"] |

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
			"操作成功"
		],
		"infos": [
			"操作成功"
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

"failCountAI": 1	"网络上有其他人操作或者已经关闭、审核,删除失败！"


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

