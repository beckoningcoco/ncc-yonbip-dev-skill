---
title: "会计期间查询"
apiId: "8416b0a2847949f69b6b298a1f3b4a96"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fiscal Period"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fiscal Period]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计期间查询

> `ContentType	application/json` 请求方式	POST | 分类: Fiscal Period (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/bd/period/getPeriodByMixCondition

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
| id | string | 否 | 否 | 期间id 示例：2214887225364736 |
| date | string | 否 | 否 | 单据日期 示例：2020-02-02 |
| code | string | 否 | 否 | 期间编码 示例：2020-02 |
| schemaId | string | 否 | 否 | 期间方案id；期间方案编码、期间方案id参数至少得传一个 示例：2197875181588736 |
| schemaCode | string | 否 | 否 | 期间方案code；期间方案编码、期间方案id参数至少得传一个 |

## 3. 请求示例

Url: /yonbip/fi/bd/period/getPeriodByMixCondition?access_token=访问令牌
Body: {
	"id": "2214887225364736",
	"date": "2020-02-02",
	"code": "2020-02",
	"schemaId": "2197875181588736",
	"schemaCode": ""
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
| code | long | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据包 |
| begindate | string | 否 | 期间开始日期 示例：2020-02-01 00:00:00 |
| code | string | 否 | 期间编码 示例：2020-02 |
| enddate | string | 否 | 期间结束日期 示例：2020-02-29 00:00:00 |
| accperiodyear2 | string | 否 | 期间年code 示例：2020 |
| periodyear | long | 否 | 期间年id 示例：2214887225250048 |
| accperiodscheme | long | 否 | 期间方案id 示例：2197875181588736 |
| name | string | 否 | 期间名称 示例：2020-02 |
| periodtree | long | 否 | 期间树id 示例：2214887225250048 |
| id | long | 否 | 期间id 示例：2214887225364736 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"begindate": "2020-02-01 00:00:00",
		"code": "2020-02",
		"enddate": "2020-02-29 00:00:00",
		"accperiodyear2": "2020",
		"periodyear": 2214887225250048,
		"accperiodscheme": 2197875181588736,
		"name": "2020-02",
		"periodtree": 2214887225250048,
		"id": 2214887225364736
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	请求错误	根据报错信息调整入参,比如:date参数不正确，格式为yyyy-MM-dd;期间方案编码、期间方案id参数至少得传一个;


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

