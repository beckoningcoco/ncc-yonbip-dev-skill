---
title: "销售报价单批量行打开"
apiId: "1536593922636644356"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Quotation"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Quotation]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售报价单批量行打开

> `ContentType	application/json` 请求方式	POST | 分类: Sales Quotation (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/quote/salesquotation/lineopen

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
| data | object | 是 | 否 | 请求数据 |
| id | long | 否 | 是 | 销售报价单id 示例：2360382974350336 |
| childs | object | 是 | 是 | 销售报价单子表明细 |

## 3. 请求示例

Url: /yonbip/sd/quote/salesquotation/lineopen?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2360382974350336,
			"childs": [
				{
					"id": 2360382974350337
				}
			]
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
| message | string | 否 | 调用成功时返回的信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| count | int | 否 | 返回数据条数 示例：2 |
| sucessCount | int | 否 | 成功数据条数 示例：1 |
| failCount | int | 否 | 失败数据条数 示例：1 |
| messages | string | 是 | 返回信息 示例：当前单据非关闭态，不能打开！ |
| infos | object | 是 | 调用成功返回的数据 |
| failInfos | object | 是 | 调用失败返回的数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			"当前单据非关闭态，不能打开！"
		],
		"infos": [
			{
				"id": 1550247271569293300,
				"childs": [
					{
						"id": 1550247271569293300,
						"tenant": 2745874565323104,
						"ytenant": "0000L2D4NFP1DIZVGY0000"
					}
				],
				"status": 1,
				"pubts": "2022-09-20 20:45:26"
			}
		],
		"failInfos": [
			{
				"id": 1550282086574194700,
				"message": "当前单据非关闭态，不能打开！"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


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

