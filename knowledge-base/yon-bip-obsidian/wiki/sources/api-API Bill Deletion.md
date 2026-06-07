---
title: "API账单删除"
apiId: "2277420676676583427"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Personal Invoices"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Personal Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# API账单删除

> `ContentType	application/json` 请求方式	POST | 分类: Personal Invoices (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/billcommon/deleteApiInvoices

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
| tallydataId | number |
| 小数位数:4,最大长度:50 | 是 | 是 | 账单id |
| creatorId | number |
| 小数位数:4,最大长度:50 | 否 | 是 | 创建者id |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/billcommon/deleteApiInvoices?access_token=访问令牌
Body: {
	"tallydataId": [
		0
	],
	"creatorId": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| id | number |
| 小数位数:8,最大长度:50 | 否 | 账单id |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": 0,
		"displayCode": ""
	}
}

## 6. 业务异常码

035-503-001872

非OPENAPI来源账单不允许删除

035-503-001871

删除API账单时，账单id或创建人id不能为空

035-503-001873

商旅订单不能删除

035-503-001874

创建者id和账单id不一致


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode

新增

异常码 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

