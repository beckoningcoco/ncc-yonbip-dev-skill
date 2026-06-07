---
title: "客户退款单列表查询"
apiId: "90b770bab320491a9f38a8da86db3ef5"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts Receivable"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户退款单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Accounts Receivable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/paybill/list/v2

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
| pageIndex | string | 否 | 是 | 页数 |
| pageSize | string | 否 | 是 | 显示条数 |
| auditstatus | string | 否 | 否 | 审批状态, 1:已审批、2:未审批、不输入时为查询全部 |
| accentity | string | 否 | 否 | 会计主体id |
| accentity_code | string | 否 | 否 | 会计主体编码 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss |
| code | string | 否 | 否 | 单据编号 |
| tradetype | string | 否 | 否 | 交易类型id |
| tradetype_code | string | 否 | 否 | 交易类型编码 |
| customer | string | 否 | 否 | 客户id |
| customer_code | string | 否 | 否 | 客户编码 |
| org | string | 否 | 否 | 销售组织id |
| org_code | string | 否 | 否 | 销售组织编码 |
| dept | string | 否 | 否 | 部门id |
| dept_code | string | 否 | 否 | 部门编码 |
| operator | string | 否 | 否 | 业务员id |
| operator_code | string | 否 | 否 | 业务员编码 |
| orderno | string | 否 | 否 | 订单编号 |
| writeoffstatus | string | 否 | 否 | 核销状态, 1:已核销、2:未核销、3:部分核销 |
| voucherstatus | string | 否 | 否 | 凭证状态, 1:已生成、2:未生成、3:已接收未生成、4:不生成 |
| srcitem | string | 否 | 否 | 事项来源, 1:销售管理、2:B2C订单中心、3:在线商城、4:零售、5:库存、6:应收应付、7:采购管理、8:现金管理、9:导入、10:费用管理、11:总账、12:内部交易、20:第三方 |
| currency | string | 否 | 否 | 币种id |
| currency_code | string | 否 | 否 | 币种简称 |
| period | string | 否 | 否 | 会计期间id |
| period_code | string | 否 | 否 | 会计期间编码 |
| settlemode | string | 否 | 否 | 结算方式id |
| settlemode_code | string | 否 | 否 | 结算方式编码 |
| project | string | 否 | 否 | 项目id |
| project_code | string | 否 | 否 | 项目编码 |
| enterprisebankaccount | string | 否 | 否 | 付款银行账号id |
| customerbankaccount | string | 否 | 否 | 收款银行账号id |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false查询表头+表体 默认值：false |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间, 格式为:yyyy-MM-dd HH:mm:ss |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间, 格式为:yyyy-MM-dd HH:mm:ss |
| cashaccount | string | 否 | 否 | 付款现金账户id |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或) |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/fi/paybill/list/v2?access_token=访问令牌
Body: {
	"pageIndex": "",
	"pageSize": "",
	"auditstatus": "",
	"accentity": "",
	"accentity_code": "",
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"code": "",
	"tradetype": "",
	"tradetype_code": "",
	"customer": "",
	"customer_code": "",
	"org": "",
	"org_code": "",
	"dept": "",
	"dept_code": "",
	"operator": "",
	"operator_code": "",
	"orderno": "",
	"writeoffstatus": "",
	"voucherstatus": "",
	"srcitem": "",
	"currency": "",
	"currency_code": "",
	"period": "",
	"period_code": "",
	"settlemode": "",
	"settlemode_code": "",
	"project": "",
	"project_code": "",
	"enterprisebankaccount": "",
	"customerbankaccount": "",
	"isSum": true,
	"open_pubts_begin": "",
	"open_pubts_end": "",
	"cashaccount": "",
	"simpleVOs": [
		{
			"logicOp": "",
			"conditions": [
				{
					"field": "",
					"op": "",
					"value1": "",
					"value2": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| pageIndex | int | 否 | 页号 |
| pageSize | int | 否 | 每页行数 |
| recordCount | int | 否 | 查询结果总条数 |
| pageCount | int | 否 | 每页总数 |
| beginPageIndex | int | 否 | 起始页 |
| endPageIndex | int | 否 | 尾页 |
| pubts | string | 否 | 操作时间, 格式为:yyyy-MM-dd HH:mm:ss |
| sumRecordList | object | 否 | 合计 |
| recordList | object | 是 | 返回数据 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"pubts": "",
		"sumRecordList": {
			"currency_moneyDigit": "",
			"currency_priceDigit": "",
			"currency": "",
			"natSum": 0,
			"localbalance": 0
		},
		"recordList": [
			{
				"vouchdate": "",
				"code": "",
				"accentity": "",
				"accentity_name": "",
				"period": "",
				"period_code": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"customer": "",
				"customer_name": "",
				"currency": "",
				"currency_name": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"natCurrency_priceDigit": "",
				"exchangeRateType_digit": "",
				"exchangeRateType_name": "",
				"exchangeRateType": "",
				"natCurrency_moneyDigit": "",
				"exchRate": 0,
				"oriSum": 0,
				"natSum": 0,
				"balance": 0,
				"localbalance": 0,
				"enterprisebankaccount": "",
				"enterprisebankaccount_name": "",
				"customerbankname": "",
				"customerbankaccount": "",
				"customerbankaccount_bankAccountName": "",
				"dept": "",
				"dept_name": "",
				"operator": "",
				"operator_name": "",
				"project": "",
				"project_name": "",
				"employee": "",
				"employee_name": "",
				"srcitem": "",
				"tradetype": "",
				"tradetype_name": "",
				"org": "",
				"org_name": "",
				"writeoffstatus": "",
				"voucherstatus": "",
				"status": "",
				"isWfControlled": "",
				"verifystate": 0,
				"auditstatus": "",
				"description": "",
				"id": "",
				"accountdate": "",
				"tplid": "",
				"pubts": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define2": ""
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

请求参数 (6)

更新

返回参数 (74)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

