---
title: "账户余额批量新增"
apiId: "1791414521275875336"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Real-Time Historical Balance"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Real-Time Historical Balance]
platform_version: "BIP"
source_type: community-api-docs
---

# 账户余额批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Account Real-Time Historical Balance (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/cmp/bankaccount/balance/batchSave

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
| accentity_code | string | 否 | 否 | 账户使用组织编码 示例：110 |
| accentity_name | string | 否 | 否 | 账户使用组织名称,与账户使用组织编码不允许同时为空；如均有值，以编码为准 示例：收入中台演示销售组织1 |
| balancedate | Date | 否 | 是 | 余额日期，YYYY-MM-DD 示例：2023-06-07 |
| acctbal | BigDecimal | 否 | 是 | 账户余额 示例：246 |
| avlbal | BigDecimal | 否 | 是 | 可用余额 示例：123 |
| frzbal | BigDecimal | 否 | 否 | 冻结金额，如为空则默认为0 示例：123 |
| enterpriseBankAccount_name | string | 否 | 是 | 银行账户名称 示例：结算中心来源补录账户 |
| enterpriseBankAccount_code | string | 否 | 是 | 银行账户编码 示例：123456789 |
| currency_code | string | 否 | 否 | 币种编码 |
| currency_name | string | 否 | 否 | 币种名称，与币种编码不允许同时为空；如均有值，以编码为准 示例：人民币2 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankaccount/balance/batchSave?access_token=访问令牌
Body: [{
	"accentity_code": "110",
	"accentity_name": "收入中台演示销售组织1",
	"balancedate": "2023-06-07",
	"acctbal": 246,
	"avlbal": 123,
	"frzbal": 123,
	"enterpriseBankAccount_name": "结算中心来源补录账户",
	"enterpriseBankAccount_code": "123456789",
	"currency_code": "",
	"currency_name": "人民币2"
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
| code | string | 否 | 成功状态码 示例：200 |
| data | object | 否 | 返回数据 |
| faildnum | long | 否 | 失败条数 示例：1 |
| successnum | long | 否 | 成功条数 示例：1 |
| success | object | 是 | 新增成功详细数据 |
| falid | object | 是 | 新增失败详细数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"faildnum": 1,
		"successnum": 1,
		"success": [
			{
				"enterpriseBankAccount_code": "622680099008",
				"enterpriseBankAccount_name": "账户1",
				"balancedate": "2023-08-15",
				"currency": "CNY",
				"id": "1801650519348346881",
				"accentity": "zzdy169535367"
			}
		],
		"falid": [
			{
				"msg": "账户使用组织不存在！",
				"enterpriseBankAccount_code": "622680099008",
				"enterpriseBankAccount_name": "账户1",
				"balancedate": "2023-08-16",
				"currency": "CNY",
				"accentity": "zzdy1695353671"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403000	接口请求异常！异常详细信息：XXXXX	根据错误提示修改请求参数或者选择正确的业务单据


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

