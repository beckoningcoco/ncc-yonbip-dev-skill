---
title: "固定资产使用状态查询"
apiId: "19be24936c0e4286879857baeb9c718a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "FA Status"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, FA Status]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产使用状态查询

> `ContentType	application/json` 请求方式	POST | 分类: FA Status (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/usagestate/refc

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
| pageIndex | string | 否 | 是 | 页号 示例：1 |
| pageSize | string | 否 | 否 | 每页行数 示例：20 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或)，当使用conditions查询条件时，必填 示例：and |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/fi/usagestate/refc?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "20",
	"simpleVOs": [
		{
			"logicOp": "and",
			"conditions": [
				{
					"field": "code",
					"op": "eq",
					"value1": "01",
					"value2": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页行数 示例：10 |
| recordCount | long | 否 | 总页数 示例：7 |
| recordList | object | 是 | 返回记录列表 |
| pageCount | long | 否 | 总数 示例：1 |
| beginPageIndex | long | 否 | 开始页码（第一页） 示例：1 |
| endPageIndex | long | 否 | 结束页码（有多少页） 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 7,
		"recordList": [
			{
				"code": "06",
				"isDepreciation": false,
				"id": 2476952383377677,
				"pubts": "2021-12-20 19:29:45",
				"presedate": "true",
				"name": ""
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

