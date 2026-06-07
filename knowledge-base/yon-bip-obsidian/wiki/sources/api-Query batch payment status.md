---
title: "查询批量付款状态"
apiId: "822dc98c2b02464fa002374d2fa9bdda"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询批量付款状态

> `ContentType	application/json` 请求方式	POST | 分类: Payment Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/bill/status

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
| ids | string | 是 | 否 | 用友系统付款工作台单据主键 |
| srcbillids | string | 是 | 否 | 来源单据主键，生成付款单srcbillid字段，ids为空时，取该字段值 |

## 3. 请求示例

Url: /yonbip/fi/bill/status?access_token=访问令牌
Body: {
	"ids": [
		""
	],
	"srcbillids": [
		""
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
| code | long | 否 | 返回码，请求成功时返回200 示例：200 |
| message | string | 否 | 返回消息，请求失败时返回错误原因 示例：操作成功 |
| data | object | 是 | 返回结果数据 |
| srcbillid | string | 否 | 来源单据主键 示例：BXD2022010100021 |
| paystatus | string | 否 | 支付状态, 5:支付中、6:支付不明、7:线下支付成功、0:待支付、1:预下单成功、2:预下单失败、3:支付成功、4:支付失败 示例：4 |
| paytime | string | 否 | 支付成功时间 示例：2020-11-30 13:42:04 |
| id | string | 否 | 付款工作台单据主键 示例：2023547697992448 |
| url | string | 否 | 电子回单下载url地址 示例：https://open-api-daily.yyuap.com/yonbip/fi/electron/detail?bankseq=TC000340000202011301341449880049&paybankid=8028437a246742b5920de6b301502a41&recbankid=8028437a246742b5920de6b301502a41 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"srcbillid": "BXD2022010100021",
			"paystatus": "4",
			"paytime": "2020-11-30 13:42:04",
			"id": "2023547697992448",
			"url": "https://open-api-daily.yyuap.com/yonbip/fi/electron/detail?bankseq=TC000340000202011301341449880049&paybankid=8028437a246742b5920de6b301502a41&recbankid=8028437a246742b5920de6b301502a41"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

404	Not Found	请检查网络，请求服务地址是否正确

999	操作失败	请检查入参数据格式是否正确

200	操作成功	请求成功后返回


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

