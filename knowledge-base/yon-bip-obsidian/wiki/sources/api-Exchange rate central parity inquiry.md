---
title: "汇率中间价查询"
apiId: "1853550070860873728"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Middle Rate of Exchange Rate"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Middle Rate of Exchange Rate]
platform_version: "BIP"
source_type: community-api-docs
---

# 汇率中间价查询

> `ContentType	application/json` 请求方式	POST | 分类: Middle Rate of Exchange Rate (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/tmsp/api/exchangerate/query

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
| startDate | Date | 否 | 是 | 开始日期 示例：2023-11-03 |
| endDate | Date | 否 | 是 | 截止日期 示例：2023-11-04 |
| baseCurrencyName | string | 否 | 否 | 基准货币-币种名称 示例：人民币 |
| baseCurrencyCode | string | 否 | 否 | 基准货币-币种简称 示例：CNY |
| targetCurrencyName | string | 否 | 否 | 目标货币-币种名称 示例：美元 |
| targetCurrencyCode | string | 否 | 否 | 目标货币-币种简称 示例：USD |
| quotationUnit | string | 否 | 否 | 报价单位 示例：北京分公司 |

## 3. 请求示例

Url: /yonbip/ctm/tmsp/api/exchangerate/query?access_token=访问令牌
Body: {
	"startDate": "2023-11-03",
	"endDate": "2023-11-04",
	"baseCurrencyName": "人民币",
	"baseCurrencyCode": "CNY",
	"targetCurrencyName": "美元",
	"targetCurrencyCode": "USD",
	"quotationUnit": "北京分公司"
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
| message | string | 否 | 返回消息 示例：操作成功 |
| code | string | 否 | 接口返回码 示例：200 |
| data | object | 否 | 数据 |
| queryCount | long | 否 | 查询结果条数 示例：1 |
| queryResult | object | 是 | 查询结果 |

## 5. 正确返回示例

{
	"message": "操作成功",
	"code": "200",
	"data": {
		"queryCount": 1,
		"queryResult": [
			{
				"id": "1607320952981422082",
				"code": "000088",
				"bizDate": "2023-10-11",
				"baseCurrencyName": "人民币",
				"baseCurrencyCode": "CNY",
				"targetCurrencyName": "美元",
				"targetCurrencyCode": "USD",
				"quotationUnit": "北京分公司",
				"middlePrice": 6.781721,
				"currencyPair": "北京分公司-USD/CNY"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

