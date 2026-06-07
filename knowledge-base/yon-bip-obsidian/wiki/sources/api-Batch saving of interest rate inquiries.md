---
title: "利率查询批量保存"
apiId: "1598985383536754695"
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

# 利率查询批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Inquire Interest Rate (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/tmsp/api/interestrate/batchsave

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
| currency | string | 否 | 否 | 币种id，优先级：币种名称>币种id>币种编码，currency/currencyCode/currencyName，三选一必填 示例：1585897604592435200 |
| currencyCode | string | 否 | 否 | 币种编码，优先级：币种名称>币种id>币种编码，currency/currencyCode/currencyName，三选一必填 示例：001 |
| currencyName | string | 否 | 否 | 币种名称，优先级：币种名称>币种id>币种编码，currency/currencyCode/currencyName，三选一必填 示例：人民币 |
| termUnit | string | 否 | 是 | 期限单位，枚举值 {"tomorrow":"隔夜","day":"日","week":"周","month":"月","season":"季","year":"年"} 示例：day |
| termNumber | int | 否 | 是 | 期限数值(当期限单位为隔夜时,无需填写) 示例：1 |
| amountRange | string | 否 | 否 | 金额区间 枚举值 {"1":"未达500元万","2":"500万元(含)以上"} 示例：1 |
| fixed_mobile | string | 否 | 否 | 固定/浮动，枚举值 {"1":"固定","2":"浮动"} 示例：1 |
| bankType | string | 否 | 否 | 银行类别id，默认优先级：银行类别名称>银行类别id>银行类别编码 示例：1528613203378962434 |
| bankTypeCode | string | 否 | 否 | 银行类别编码，默认优先级：银行类别名称>银行类别id>银行类别编码 示例：001 |
| bankTypeName | string | 否 | 否 | 银行类别名称，默认优先级：银行类别名称>银行类别id>银行类别编码 示例：中国工商银行 |
| date | Date | 否 | 是 | 日期 示例：2022-11-30 |
| interest | BigDecimal | 否 | 是 | 利率 示例：1.226 |

## 3. 请求示例

Url: /yonbip/ctm/tmsp/api/interestrate/batchsave?access_token=访问令牌
Body: [{
	"interestrateType": "LPR",
	"currency": "1585897604592435200",
	"currencyCode": "001",
	"currencyName": "人民币",
	"termUnit": "day",
	"termNumber": 1,
	"amountRange": "1",
	"fixed_mobile": "1",
	"bankType": "1528613203378962434",
	"bankTypeCode": "001",
	"bankTypeName": "中国工商银行",
	"date": "2022-11-30",
	"interest": 1.226
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 接口返回码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| msgs | string | 是 | 返回错误信息集合 |
| successCount | long | 否 | 保存成功条数 示例：1 |
| failCount | long | 否 | 保存失败条数 示例：0 |
| totalCount | long | 否 | 总条数 示例：1 |
| successRecords | object | 是 | 成功的数据记录 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"msgs": [
			""
		],
		"successCount": 1,
		"failCount": 0,
		"totalCount": 1,
		"successRecords": [
			{
				"interestrateType": "LPR",
				"currency": "2163654411440900",
				"termValue": "1日",
				"termUnit": "day",
				"termNumber": 1,
				"amountRange": "1",
				"fixed_mobile": "1",
				"bankType": "2176562948068864",
				"date": "2022-11-30",
				"interest": 1.226,
				"riseandfall": 816.1,
				"ytenantId": "jrig9o3z",
				"id": "1565783104509444107",
				"code": "000012"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1000001	传入参数为空

1000002	批量导入数量超过200限制

1000003	利率批量保存接口正常处理中,请稍后再试


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-02-27

更新

请求参数 interestrateType

更新

请求参数 termUnit


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

