---
title: "科目余额查询"
apiId: "4f5b45e50c3144d18fb5c35758b40797"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "General Ledger"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Ledger]
platform_version: "BIP"
source_type: community-api-docs
---

# 科目余额查询

> `ContentType	application/json` 请求方式	POST | 分类: General Ledger (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/ficloud/api/querySubjectBalance

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
| org | string | 否 | 是 | 会计主体ID |
| accbook | string | 否 | 否 | 账簿ID |
| codes | string | 是 | 否 | 科目编码数组 |
| period1 | string | 否 | 是 | 起始期间 |
| period2 | string | 否 | 是 | 结束期间 |
| currency | string | 否 | 否 | 币种id |
| tally | int | 否 | 否 | 是否包含记账凭证,1:包含,0:不包含 默认值：0 |
| tempvoucher | int | 否 | 否 | 是否包含临时凭证,1:包含,0:不包含 默认值：0 |

## 3. 请求示例

Url: /yonbip/fi/ficloud/api/querySubjectBalance?access_token=访问令牌
Body: {
	"org": "",
	"accbook": "",
	"codes": [
		""
	],
	"period1": "",
	"period2": "",
	"currency": "",
	"tally": 0,
	"tempvoucher": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 返回编码 示例：1 |
| message | string | 否 | 返回信息 示例：查询成功！ |
| data | object | 是 | 返回数据 |
| orgcredit3 | string | 否 | 期末余额贷方(原币) 示例：3.96 |
| orgcredit4 | string | 否 | 本年累计贷方(原币) 示例：3.96 |
| orgcredit1 | string | 否 | 期初余额贷方(原币) |
| orgcredit2 | string | 否 | 本期发生贷方(原币) 示例：3.96 |
| quantitydebit2 | string | 否 | 期初余额贷方数量 |
| quantitydebit1 | string | 否 | 期初余额借方数量 |
| quantitydebit4 | string | 否 | 本期发生贷方数量 |
| currency_name | string | 否 | 币种名称 示例：人民币 |
| quantitydebit3 | string | 否 | 本期发生借方数量 |
| quantitydebit6 | string | 否 | 本年累计贷方数量 |
| quantitydebit5 | string | 否 | 本年累计借方数量 |
| accsubject_name | string | 否 | 科目名称 示例：应交税费 |
| quantitydebit8 | string | 否 | 期末余额贷方数量 示例：3.96 |
| quantitydebit7 | string | 否 | 期末余额借方数量 |
| oridebit1 | string | 否 | 期初余额借方(原币) |
| localdebit4 | string | 否 | 本年累计借方(本币) |
| oridebit4 | string | 否 | 本年累计借方(原币) |
| localdebit3 | string | 否 | 期末余额借方(本币) |
| localdebit2 | string | 否 | 本期发生借方(本币) |
| oridebit2 | string | 否 | 本期发生借方(原币) |
| localdebit1 | string | 否 | 期初余额借方(本币) |
| oridebit3 | string | 否 | 期末余额借方(原币) |
| accsubject_code | string | 否 | 科目编码 示例：2221 |
| localcredebit4 | string | 否 | 本年累计贷方(本币) 示例：3.96 |
| localcredebit3 | string | 否 | 期末余额贷方(本币) |
| localcredebit2 | string | 否 | 本期发生贷方(本币) 示例：3.96 |
| localcredebit1 | string | 否 | 期初余额贷方(本币) |
| currency_id | string | 否 | 币种ID 示例：G001ZM0000DEFAULTCURRENCT00000000001 |

## 5. 正确返回示例

{
	"code": 1,
	"message": "查询成功！",
	"data": [
		{
			"orgcredit3": "3.96",
			"orgcredit4": "3.96",
			"orgcredit1": "",
			"orgcredit2": "3.96",
			"quantitydebit2": "",
			"quantitydebit1": "",
			"quantitydebit4": "",
			"currency_name": "人民币",
			"quantitydebit3": "",
			"quantitydebit6": "",
			"quantitydebit5": "",
			"accsubject_name": "应交税费",
			"quantitydebit8": "3.96",
			"quantitydebit7": "",
			"oridebit1": "",
			"localdebit4": "",
			"oridebit4": "",
			"localdebit3": "",
			"localdebit2": "",
			"oridebit2": "",
			"localdebit1": "",
			"oridebit3": "",
			"accsubject_code": "2221",
			"localcredebit4": "3.96",
			"localcredebit3": "",
			"localcredebit2": "3.96",
			"localcredebit1": "",
			"currency_id": "G001ZM0000DEFAULTCURRENCT00000000001"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

code	0	输入正确参数(会计主体ID)


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

返回参数 (6)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

