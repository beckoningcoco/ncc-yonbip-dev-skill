---
title: "销售发票批量弃审"
apiId: "397116a0e0774701a4dbb8cdc8966682"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Invoice"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售发票批量弃审

> `ContentType	application/json` 请求方式	POST | 分类: Sales Invoice (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/vouchersaleinvoice/unaudit

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
| data | object | 否 | 是 | 请求数据 |
| id | long | 是 | 否 | 发票id(可做独立条件) 示例：[2155419223904768] |
| orgId | string | 否 | 否 | 开票组织id(code与orgId可组合弃审) 示例：2013831551734016 |
| code | string | 是 | 否 | 发票编号(code与orgId可组合弃审) 示例：["SACT20210303000017"] |

## 3. 请求示例

Url: /yonbip/sd/vouchersaleinvoice/unaudit?access_token=访问令牌
Body: {
	"data": {
		"id": [
			2155419223904768
		],
		"orgId": "2013831551734016",
		"code": [
			"SACT20210303000017"
		]
	}
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
| code | long | 否 | 请求返回码 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| count | long | 否 | 数据总条数 示例：1 |
| sucessCount | long | 否 | 成功数据条数 示例：1 |
| failCount | long | 否 | 失败数据条数 示例：0 |
| messages | string | 是 | 调用接口失败返回信息 示例：[""] |
| infos | object | 是 | 调用接口成功返回数据信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"transactionTypeId_name": "销售出库",
				"invoiceAsynTaxMark": true,
				"verifystate": 2,
				"einvoiceNo": "4",
				"invDirection": 2,
				"code": "TI5648210712000002",
				"oriTax": 0.115,
				"bizFlow": "9f2fa360-d0f1-11eb-a68a-0624d60000dc",
				"exchRate": 1,
				"natTax": 0.115,
				"source": "st_salesout",
				"currency_code": "CNY",
				"orgId": "2282501235675648",
				"blueInvId": 3,
				"issuedTaxMoney": 1,
				"vouchdate": "2021-07-12 00:00:00",
				"natCurrency_name": "人民币",
				"natCurrency": "2281153755730176",
				"businessState": 2,
				"bizFlow_version": "V3.0",
				"invoiceType": 0,
				"id": 2340787535827456,
				"pubts": "2021-07-15 15:05:34",
				"isFlowCoreBill": false,
				"auditDate": "2021-07-15 00:00:00",
				"invAgentSubBank": "中国工商银行股份有限公司濮阳兴工支行",
				"uordercorp": 2281151360143616,
				"oriSum": 1,
				"transactionTypeId": "110000000000028",
				"isWfControlled": false,
				"auditor": "lcy",
				"natSum": 1,
				"exchangeRateType": "0000KPC165PABLPTS60000",
				"invAgentBank": "中国工商银行",
				"blueEinvoiceNo": "1",
				"auditTime": "2021-07-15 15:05:34",
				"invAgentName": "lcy客户0531",
				"oriMoney": 0.885,
				"natCurrency_code": "CNY",
				"natMoney": 0.885,
				"status": 1
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	"Index: 0, Size: 0"


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

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

