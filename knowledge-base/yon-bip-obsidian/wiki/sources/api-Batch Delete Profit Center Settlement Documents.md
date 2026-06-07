---
title: "利润中心结算单批量删除"
apiId: "2070678689367457793"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Profit Center Settlement Document"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Profit Center Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 利润中心结算单批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Profit Center Settlement Document (CO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CO/fieis/settlement/cancel

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
| isReverse | boolean | 否 | 否 | 是否冲销单据，true:冲销，false：不冲销，删除单据。不填，不冲销删除单据。 示例：true |
| srcIdList | string | 是 | 否 | 来源单据id 示例：["1585723013972623361","1585723013972623362"] |

## 3. 请求示例

Url: /yonbip/CO/fieis/settlement/cancel?access_token=访问令牌
Body: {
	"isReverse": true,
	"srcIdList": [
		"1585723013972623361",
		"1585723013972623362"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应消息 示例：success |
| data | string | 是 | 删除或者冲销单据信息 示例：{ "2226126208586743808": ["PCEIS20241122000067","PCEIS20241122000068"] } |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": [
		{
			"2226126208586743808": [
				"PCEIS20241122000067",
				"PCEIS20241122000068"
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	错误消息	删除失败,没有符合条件的单据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

新增

请求参数 isReverse

更新

返回参数 data

新增

错误码 999


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

