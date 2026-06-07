---
title: "付款申请工作台列表查询"
apiId: "97151c5c5add4bb1af2c92ec13a5d302"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Application Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Application Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款申请工作台列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Payment Application Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/payapplybill

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
| accentity | string | 否 | 否 | 会计主体id |
| accentity_code | string | 否 | 否 | 会计主体编码 |
| org | string | 否 | 否 | 业务组织id |
| org_code | string | 否 | 否 | 业务组织编码 |
| supplier | string | 否 | 否 | 供应商id |
| supplier_code | string | 否 | 否 | 供应商编码 |
| dept | string | 否 | 否 | 部门id |
| dept_code | string | 否 | 否 | 部门编码 |
| project | string | 否 | 否 | 项目id |
| project_code | string | 否 | 否 | 项目编码 |
| customer | string | 否 | 否 | 客户id |
| customer_code | string | 否 | 否 | 客户编码 |
| approvalStatus | string | 否 | 否 | 申请审批状态（2：待审批，3：已审批） |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始日期,格式为:yyyy-MM-dd HH:mm:ss |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束日期,格式为:yyyy-MM-dd HH:mm:ss |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 属性名(条件) ，1：code(单据编号)，2：headItem.define1(单据头自定义项1)，3.pubts(时间戳) |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) |
| value1 | string | 否 | 否 | 值1 |
| value2 | string | 否 | 否 | 值2 |

## 3. 请求示例

Url: /yonbip/fi/payapplybill?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"accentity": "",
	"accentity_code": "",
	"org": "",
	"org_code": "",
	"supplier": "",
	"supplier_code": "",
	"dept": "",
	"dept_code": "",
	"project": "",
	"project_code": "",
	"customer": "",
	"customer_code": "",
	"approvalStatus": "",
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
		}
	]
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
| pageIndex | int | 否 | 页号 |
| pageSize | int | 否 | 每页数量 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页号 |
| endPageIndex | int | 否 | 终止页号 |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳 |
| recordList | object | 是 | 记录集合 |

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
		"recordList": [
			{
				"code": "",
				"accentity": "",
				"accentity_name": "",
				"busiaccbook": "",
				"busiaccbook_name": "",
				"billtype": "",
				"tradetype": "",
				"tradetype_name": "",
				"vouchdate": "",
				"settlemode": 0,
				"settlemode_name": "",
				"settlemode_serviceAttr": 0,
				"payBillStatus": "",
				"approvalStatus": "",
				"remark": "",
				"org": "",
				"org_name": "",
				"dept": "",
				"dept_name": "",
				"operator": "",
				"operator_name": "",
				"project": "",
				"project_name": "",
				"expenseitem": "",
				"expenseitem_name": "",
				"paymentMode": "",
				"proposePaymentDate": "",
				"distanceProposePaymentDateDays": "",
				"caobject": "",
				"supplier": "",
				"supplier_name": "",
				"supplierbankaccount": "",
				"supplierbankaccount_bank": "",
				"supplierbankaccount_accountname": "",
				"customer": "",
				"customer_name": "",
				"customerbankaccount": "",
				"customerbankaccount_bank": "",
				"customerbankaccount_bankAccountName": "",
				"employee": "",
				"employee_name": "",
				"staffBankAccount": "",
				"staffBankAccount_account": "",
				"retailer": "",
				"retailerAccountName": "",
				"retailerAccountNo": "",
				"retailerLineNumber": "",
				"retailerAccountType": "",
				"retailerBankType": "",
				"retailerBankType_name": "",
				"currency": "",
				"currency_moneyDigit": "",
				"currency_priceDigit": "",
				"currency_name": "",
				"natCurrency": "",
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"natCurrency_name": "",
				"paymentApplyAmountSum": 0,
				"paymentPreemptAmountSum": 0,
				"paidAmountSum": 0,
				"unpaidAmountSum": 0,
				"sourceSystem": "",
				"srcitem": "",
				"status": "",
				"creator": "",
				"createTime": "",
				"createDate": "",
				"modifier": "",
				"modifyTime": "",
				"modifyDate": "",
				"verifystate": "",
				"isWfControlled": "",
				"auditor": "",
				"auditTime": "",
				"id": "",
				"pubts": "",
				"rowno": 0,
				"quickType": "",
				"quickType_code": "",
				"quickType_name": "",
				"srcbillno": "",
				"srcbillitemno": "",
				"invoiceNo": "",
				"srcbillitemid": "",
				"productsku": "",
				"srcbillitemmainid": "",
				"productsku_cCode": "",
				"productsku_skuName": "",
				"material": "",
				"material_name": "",
				"issue": "",
				"contractNo": "",
				"orderNo": "",
				"paymentApplyAmount": 0,
				"paymentPreemptAmount": 0,
				"paidAmount": 0,
				"unpaidAmount": 0,
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"makeRuleCode": "",
				"topsrcbillitemid": "",
				"topsrcbillitemmainid": "",
				"srcinvoicebillitemid": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": ""
				},
				"payApplicationBill_b": {
					"bodyItem": {
						"id": "",
						"define1": "",
						"define2": "",
						"define3": "",
						"define4": "",
						"define5": ""
					}
				}
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

