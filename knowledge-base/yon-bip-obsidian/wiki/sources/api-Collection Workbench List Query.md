---
title: "收款工作台列表查询"
apiId: "2198605286610042885"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款工作台列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Collection Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/cmpreceivebilllist

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
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| code | string | 否 | 否 | 单据编号 |
| accentity | string | 是 | 否 | 会计主体ID |
| caobject | string | 是 | 否 | 收款对象, 4:其他、1:客户、2:供应商、3:人员、 |
| customer | string | 是 | 否 | 客户ID |
| supplier | string | 是 | 否 | 供应商ID |
| tradetype | string | 是 | 否 | 交易类型ID |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始日期,格式为:yyyy-MM-dd HH:mm:ss |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束日期,格式为:yyyy-MM-dd HH:mm:ss |
| simpleVOs | object | 否 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 属性名(条件) ，1：defines.define4(表头自由自定义项4) ，2：pubts(时间戳) |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) |
| value1 | string | 否 | 否 | 值1 |
| value2 | string | 否 | 否 | 值2 |

## 3. 请求示例

Url: /yonbip/ctm/cmpreceivebilllist?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"code": "",
	"accentity": [
		""
	],
	"caobject": [
		""
	],
	"customer": [
		""
	],
	"supplier": [
		""
	],
	"tradetype": [
		""
	],
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"simpleVOs": {
		"field": "",
		"op": "",
		"value1": "",
		"value2": ""
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页数 |
| pageSize | int | 否 | 每页行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| sumRecordList | object | 否 | 合计 |
| recordList | object | 是 | 付款单列表 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"sumRecordList": {
			"orisum": 0,
			"natSum": 0
		},
		"recordList": [
			{
				"code": "",
				"accentity": "",
				"accentity_name": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"vouchdate": "",
				"tradetype": "",
				"tradetype_code": "",
				"tradetype_name": "",
				"billtype": "",
				"srcitem": "",
				"topsrcbillno": "",
				"exchangeRateType": "",
				"exchangeRateType_name": "",
				"settlemode": "",
				"settlemode_name": "",
				"paystatus": "",
				"settlestatus": "",
				"currency": "",
				"currency_name": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"enterprisebankaccount": "",
				"enterprisebankaccount_bank": "",
				"enterprisebankaccount_name": "",
				"cashaccount": "",
				"cashaccount_name": "",
				"org": "",
				"org_name": "",
				"caobject": "",
				"supplier": "",
				"supplier_name": "",
				"supplierbankaccount_accountname": "",
				"supplierbankaccount": "",
				"supplierbankaccount_bank": "",
				"supplierbankaccount_account": "",
				"customer": "",
				"customer_name": "",
				"customerbankaccount": "",
				"customerbankaccount_bankAccountName": "",
				"dept": "",
				"dept_name": "",
				"employee": "",
				"employee_name": "",
				"staffBankAccount": "",
				"staffBankAccount_account": "",
				"retailerAccountName": "",
				"customerbankaccount_bankAccount": "",
				"staffBankAccount_bank": "",
				"retailer": "",
				"oriSum": 0,
				"exchRate": 0,
				"natSum": 0,
				"project": "",
				"project_name": "",
				"expenseitem": "",
				"expenseitem_name": "",
				"operator": "",
				"operator_name": "",
				"description": "",
				"auditstatus": "",
				"voucherstatus": "",
				"taxCategory": "",
				"taxCategory_name": "",
				"taxRate": "",
				"includeTaxSum": "",
				"unTaxSum": "",
				"taxSum": "",
				"printCount": "",
				"associationStatus": "",
				"bankReconciliationId": "",
				"billClaimId": "",
				"verifystate": "",
				"period": "",
				"period_code": "",
				"id": "",
				"creator": "",
				"createDate": "",
				"createTime": "",
				"modifier": "",
				"modifyDate": "",
				"modifyTime": "",
				"auditor": "",
				"auditDate": "",
				"auditTime": "",
				"settledate": "",
				"dzdate": "",
				"receiveBillCharacterDef": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	操作成功	查询时不会出现错误信息，只是查出来的data为空。


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

