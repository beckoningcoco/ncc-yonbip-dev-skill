---
title: "融资合同查询"
apiId: "1665239016465235969"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Contract"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 融资合同查询

> `ContentType	application/json` 请求方式	POST | 分类: Financial Contract (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/financingRegister/open/query

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
| pageIndex | int | 否 | 是 | 当前页 默认值：1 |
| pageSize | int | 否 | 是 | 页条数 默认值：10 |
| accentity | string | 否 | 是 | 会计主体 |
| accentityCode | string | 否 | 否 | 会计主体编码 |
| protocolNumber | string | 否 | 否 | 协议号名称 |
| financialProduct | long | 否 | 否 | 金融产品 |
| financialProductCode | string | 否 | 否 | 金融产品编码 |
| termType | string | 是 | 否 | 融资期限分类 0：短期，1：中期，2：长期 |
| financingOrgType | string | 是 | 否 | 融资机构类型 TBOT0004：非银类金融机构，TBOT0005：银行，TBOT0006：结算中心，TBOT0007：会计主体，TBOT0009：财务公司，supplier：供应商，bank_consortium：银团，other：其他，capital_business：资金业务对象 ，customer：客户 |
| financingOrgForBank | string | 否 | 否 | 融资机构 |
| financingOrgForBankCode | string | 否 | 否 | 融资机构编码 |
| protocolCurrency | string | 否 | 否 | 协议币种 |
| protocolCurrencyCode | string | 否 | 否 | 协议币种编码 |
| protocolAmount | BigDecimal | 否 | 否 | 协议金额 |

## 3. 请求示例

Url: /yonbip/ctm/financingRegister/open/query?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"accentity": "",
	"accentityCode": "",
	"protocolNumber": "",
	"financialProduct": 0,
	"financialProductCode": "",
	"termType": [
		""
	],
	"financingOrgType": [
		""
	],
	"financingOrgForBank": "",
	"financingOrgForBankCode": "",
	"protocolCurrency": "",
	"protocolCurrencyCode": "",
	"protocolAmount": 0
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
| code | string | 否 | 状态码 |
| message | string | 否 | 消息提示 |
| data | object | 否 | 数据 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 页条数 示例：10 |
| recordCount | long | 否 | 总条数 示例：12 |
| data | object | 是 | 数据 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 12,
		"data": [
			{
				"accentity": "1232",
				"accentityName": "",
				"protocolNumber": "",
				"financialProduct": 12,
				"financialProductCode": "",
				"financialProductName": "",
				"financingOrgType": "",
				"financingOrgTypeName": "",
				"financingOrgForBank": "",
				"financingOrgForBankName": "",
				"protocolCurrency": "",
				"protocolCurrencyName": "",
				"protocolAmount": 12,
				"protocolBalance": 12.66,
				"beginDate": "2021-02-01",
				"term": "1年",
				"termNumber": "1",
				"termUnit": "day",
				"expireDate": "2024-02-01",
				"exhibitionPeriodEndDate": "2024-02-01",
				"termType": "1",
				"termTypeName": "中期",
				"signDate": "2024-02-01",
				"protocolRate": 12.22,
				"protocolStatus": "1",
				"protocolStatusName": ""
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

1	2025-07-28

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

