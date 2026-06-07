---
title: "现金流量列表查询"
apiId: "dbe25d8055484d5e8a53be6abbad1639"
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

# 现金流量列表查询

> `ContentType	application/json` 请求方式	POST | 分类: General Ledger (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/cashflow/list

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
| accbook | string | 否 | 否 | 账簿 示例：1793C5D9-364F-4A01-9769-6145CACF7E97 |
| begin | long | 否 | 否 | 开始数 示例：0 |
| groupnum | long | 否 | 否 | 每次查询多少条 示例：50 |
| conditions | object | 是 | 否 | 查询条件 |
| field | string | 否 | 否 | 查询列 示例：period |
| value | string | 否 | 否 | 值 示例：2020-01--2020-12 |
| operator | string | 否 | 否 | 操作符 示例：= |

## 3. 请求示例

Url: /yonbip/fi/cashflow/list?access_token=访问令牌
Body: {
	"accbook": "1793C5D9-364F-4A01-9769-6145CACF7E97",
	"begin": 0,
	"groupnum": 50,
	"conditions": [
		{
			"field": "period",
			"value": "2020-01--2020-12",
			"operator": "="
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 响应状态码 示例：1 |
| data | object | 是 | 响应数据 |
| header | object | 否 | 响应数据header部分 |
| voucherType | string | 否 | 凭证类型 |
| body | object | 是 | 响应数据body部分 |
| success | boolean | 否 | 响应成功 示例：true |
| totalPage | long | 否 | 数据总条数 示例：1 |
| message | string | 否 | 响应信息说明 示例：操作成功. |

## 5. 正确返回示例

{
	"code": 1,
	"data": [
		{
			"header": {
				"id": "D9C75935-C5F9-4250-A2F5-11586B24BBD4",
				"tenantid": "租户id",
				"srctplid": "",
				"accbody": "",
				"maketime": "2020-10-10",
				"billcode": 68,
				"maker": {
					"id": "12345-56548-44wws",
					"code": "YHT-7308811-73084141597217092828",
					"name": "李晓岩"
				},
				"signer": "",
				"auditor": "",
				"tallyman": "",
				"period": "2020-10",
				"srcsystem": "总账管理",
				"srcsystemid": "",
				"accbook": "",
				"desbilltype": "",
				"modify_rule": "",
				"cfstatus": "analyzed",
				"def2": "~",
				"displaybillcode": "记-68",
				"deptcode": "",
				"description": "",
				"displayname": "记-68",
				"voucherstatus": "",
				"dr": "",
				"processingState": "",
				"secondorg": "",
				"totaldebit_org": 0,
				"totalcredit_org": 0
			},
			"voucherType": "",
			"body": [
				{
					"id": "45d4a545-4545dasdas",
					"tenantid": "租户id",
					"srctplid": "",
					"recordnumber": 1,
					"accsubject": {
						"id": "科目id",
						"code": "1001",
						"name": "现金",
						"leaf": true,
						"numcheck": false,
						"measuredoc": {
							"id": "",
							"code": "",
							"name": ""
						},
						"currency": {
							"id": "",
							"code": "",
							"name": ""
						}
					},
					"accsubject2": "",
					"currency": {
						"id": "币种主键id",
						"code": "币种code",
						"name": "币种name"
					},
					"currency_org": {
						"id": "",
						"code": "",
						"name": ""
					},
					"debit_original": 0,
					"credit_original": 0,
					"debit_org": 0,
					"credit_org": 0,
					"quantity": 0,
					"price": 0,
					"rate_org": 0,
					"ratetype": "汇率类型",
					"description": "",
					"auxiliary": "辅助核算",
					"clientauxiliary": "client辅助核算",
					"voucherid": "凭证id",
					"modify_rule": ""
				}
			]
		}
	],
	"success": true,
	"totalPage": 1,
	"message": "操作成功."
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

返回参数 (10)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

