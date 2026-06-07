---
title: "利率查询查询接口"
apiId: "1597665394057805829"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inquire Interest Rate"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inquire Interest Rate]
platform_version: "BIP"
source_type: community-api-docs
---

# 利率查询查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Inquire Interest Rate (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/tmsp/api/interestrate/query

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
| interestrateType | string | 否 | 是 | 利率种类，枚举值 {LPR,Shibor,Libor,Hibor,TAIFX,SOFR,Euribor,Sonia,Tonar,Sibor,Tibor,SONET,SARON,ESTR,EONIA,BBSW,CORRA,BKBM,SORA,定期:regularbasis,活期:currentperiod,邮政储金利率:PostalSavingsRates,通知:notice,贷款基准:LoanBase,其他:OTHER} 示例：LPR |
| currency | string | 否 | 否 | 币种id 示例：1524777565678469141 |
| currencyCode | string | 否 | 否 | 币种编码 示例：001 |
| currencyName | string | 否 | 否 | 币种名称 示例：人民币 |
| termUnit | string | 否 | 否 | 期限单位，枚举值 {"tomorrow":"隔夜","day":"日","week":"周","month":"月","season":"季","year":"年"} 示例：day |
| termNumber | int | 否 | 否 | 期限数值(当期限单位为隔夜时,无需填写) 示例：1 |
| amountRange | string | 否 | 否 | 金额区间，枚举值 {"1":"未达500元万","2":"500万元(含)以上"} 示例：1 |
| fixed_mobile | string | 否 | 否 | 固定/浮动，枚举值 {"1":"固定","2":"浮动"} 示例：1 |
| bankType | string | 否 | 否 | 银行类别id 示例：1528613203378962434 |
| bankTypeCode | string | 否 | 否 | 银行类别编码 示例：102 |
| bankTypeName | string | 否 | 否 | 银行类别名称 示例：中国商业银行 |
| dateStar | Date | 否 | 是 | 开始日期 示例：2022-12-08 |
| dateEnd | Date | 否 | 是 | 结束日期 示例：2022-12-09 |

## 3. 请求示例

Url: /yonbip/ctm/tmsp/api/interestrate/query?access_token=访问令牌
Body: {
	"interestrateType": "LPR",
	"currency": "1524777565678469141",
	"currencyCode": "001",
	"currencyName": "人民币",
	"termUnit": "day",
	"termNumber": 1,
	"amountRange": "1",
	"fixed_mobile": "1",
	"bankType": "1528613203378962434",
	"bankTypeCode": "102",
	"bankTypeName": "中国商业银行",
	"dateStar": "2022-12-08",
	"dateEnd": "2022-12-09"
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
				"amountRange": "1",
				"bankType": "2414407005556992",
				"bankTypeName": "中国工商银行",
				"currency": "2281153755730176",
				"currencyName": "人民币",
				"date": "2022-12-15 00:00:00",
				"fixed_mobile": "1",
				"interest": 1.3,
				"interestrateType": "LPR",
				"riseandfall": 833.33,
				"termValue": "1日",
				"termUnit": "day",
				"termNumber": 1,
				"id": "1607320952981422082",
				"code": "000088"
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

1	2025-02-27

更新

请求参数 interestrateType


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

