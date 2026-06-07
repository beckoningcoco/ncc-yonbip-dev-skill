---
title: "交易池数据批改接口"
apiId: "2269261535879626758"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Revenue Middle Platform"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Revenue Middle Platform]
platform_version: "BIP"
source_type: community-api-docs
---

# 交易池数据批改接口

> `ContentType	application/json` 请求方式	POST | 分类: Revenue Middle Platform (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/revPool/batchUpdate

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billtype | string | 否 | 是 | 单据类型 示例：yonbip-fi-revenue.rev_order_pool.rev_online_order |
| ids | string | 是 | 是 | 单据主键，支持单条或批量ID 示例：[1001,1002] |
| fieldName | string | 否 | 是 | 数据库字段名或业务字段标识 示例：trans_rec_status |
| fieldValue | string | 否 | 是 | 字段值，需与字段类型匹配，如交易对账状态，无需对账传13，未对账传11，不传默认为未对账 示例：13 |

## 3. 请求示例

Url: /yonbip/EFI/revenue/revPool/batchUpdate?access_token=访问令牌
Body: {
	"billtype": "yonbip-fi-revenue.rev_order_pool.rev_online_order",
	"ids": [
		1001,
		1002
	],
	"fieldName": "trans_rec_status",
	"fieldValue": "13"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 成功标识 |
| message | string | 否 | 返回描述 |
| data | object | 否 | 返回体 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 数量，小数位数:0,最大长度:10 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数，小数位数:0,最大长度:10 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数，小数位数:0,最大长度:10 |
| messages | object | 否 | 返回消息 |
| id | string | 否 | 单据主键 |
| message | string | 否 | 错误描述 |
| info | object | 是 | 成功数据 |
| data | object | 否 | 成功数据体 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {},
	"count": 0,
	"sucessCount": 0,
	"failCount": 0,
	"messages": {
		"id": "",
		"message": ""
	},
	"info": [
		{
			"data": {
				"id": "",
				"message": ""
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

