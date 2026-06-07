---
title: "查询付款单状态"
apiId: "5aae1d1977f24efdbe3a05d81ef19ab0"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Payment Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询付款单状态

> `ContentType	application/json` 请求方式	GET | 分类: Payment Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/cmppayment/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 付款单ID |

## 3. 请求示例

Url: /yonbip/fi/cmppayment/detail?access_token=访问令牌&id=

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
| accentity | string | 否 | 会计主体IDid |
| accentity_name | string | 否 | 会计主体名称 |
| natCurrency | string | 否 | 本币币种id |
| natCurrency_name | string | 否 | 本币币种名称 |
| natCurrency_priceDigit | string | 否 | 本币币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 本币币种金额精度 |
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| tradetype | string | 否 | 交易类型IDid |
| tradetype_name | string | 否 | 交易类型名称 |
| tradetype_code | string | 否 | 交易编码 |
| settlemode | string | 否 | 结算方式IDid |
| exchangeRateType_digit | string | 否 | 汇率精度 |
| exchangeRateType | string | 否 | 汇率类型id |
| settlemode_serviceAttr | string | 否 | 结算方式业务属性 |
| settlemode_name | string | 否 | 结算方式名称 |
| exchangeRateType_name | string | 否 | 汇率类型名称 |
| currency | string | 否 | 币种id |
| currency_name | string | 否 | 币种名称 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| enterprisebankaccount | string | 否 | 付款银行账户IDid |
| enterprisebankaccount_bank | string | 否 | 付款银行类别 |
| enterprisebankaccount_name | string | 否 | 付款银行账户名称 |
| cashaccount | string | 否 | 付款现金账户IDid |
| cashaccount_name | string | 否 | 付款现金账户名称 |
| org | string | 否 | 业务组织id |
| org_name | string | 否 | 业务组织名称 |
| caobject | string | 否 | 付款对象, 4:其他、1:客户、2:供应商、3:人员、 |
| supplier | string | 否 | 收款供应商IDid |
| supplier_name | string | 否 | 收款供应商名称 |
| supplierbankaccount | string | 否 | 收款供应商账户ID |
| supplierbankaccount_bank | string | 否 | 收款供应商银行类别 |
| supplierbankaccount_accountname | string | 否 | 收款供应商账户 |
| customer | string | 否 | 收款客户IDid |
| customer_name | string | 否 | 收款客户名称 |
| customerbankaccount | string | 否 | 收款客户账户ID |
| customerbankaccount_bank | string | 否 | 收款客户银行类别 |
| customerbankaccount_bankAccountName | string | 否 | 收款客户账户 |
| employee | string | 否 | 收款员工IDid |
| employee_name | string | 否 | 收款员工名称 |
| staffBankAccount | string | 否 | 收款员工账户ID |
| staffBankAccount_account | string | 否 | 收款员工账户 |
| retailer | string | 否 | 收款单位名称 |
| retailerAccountName | string | 否 | 收款账户名称 |
| retailerAccountNo | string | 否 | 收款账号 |
| retailerLineNumber | string | 否 | 收款账户联行号 |
| retailerAccountType | string | 否 | 收款类型, 1:对私、2:对公、3:银行内部户、 |
| retailerBankType | string | 否 | 收款账户银行类别IDid |
| retailerBankType_name | string | 否 | 收款账户银行类别名称 |
| dept | string | 否 | 部门IDid |
| dept_name | string | 否 | 部门名称 |
| staffBankAccount_bank | string | 否 | 收款员工银行类别 |
| project | string | 否 | 项目IDid |
| project_name | string | 否 | 项目名称 |
| expenseitem | string | 否 | 费用项目IDid |
| expenseitem_name | string | 否 | 费用项目名称 |
| oriSum | int | 否 | 付款金额 |
| exchRate | int | 否 | 汇率 |
| natSum | int | 否 | 本币金额 |
| description | string | 否 | 备注 |
| paystatus | string | 否 | 支付状态, 5:支付中、6:支付不明、7:线下支付成功、0:待支付、1:预下单成功、2:预下单失败、3:支付成功、4:支付失败、 |
| auditstatus | string | 否 | 审批状态, 1:已审批、2:未审批、 |
| settlestatus | string | 否 | 结算状态, 1:未结算、2:已结算、 |
| voucherstatus | string | 否 | 凭证状态, 3:已接收未生成、4:不生成、1:已生成、2:未生成、 |
| srcitem | string | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、 |
| cmpflag | string | 否 | 现金管理标志, true:是、false:否、 |
| porderid | string | 否 | 预下单编码 |
| batno | string | 否 | 批量支付编号 |
| transeqno | string | 否 | 交易流水号 |
| srcbillid | string | 否 | 来源单据id |
| billtype | string | 否 | 单据类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| id | string | 否 | ID |
| pubts | string | 否 | 时间戳 |
| headItem | object | 否 | headItem |
| ecsuiteperson | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间 |
| cmp_payment_b | object | 是 | 付款工作台子表[arap.paybill.PayBillb] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"accentity": "",
		"accentity_name": "",
		"natCurrency": "",
		"natCurrency_name": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"code": "",
		"vouchdate": "",
		"tradetype": "",
		"tradetype_name": "",
		"tradetype_code": "",
		"settlemode": "",
		"exchangeRateType_digit": "",
		"exchangeRateType": "",
		"settlemode_serviceAttr": "",
		"settlemode_name": "",
		"exchangeRateType_name": "",
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
		"dept": "",
		"dept_name": "",
		"staffBankAccount_bank": "",
		"project": "",
		"project_name": "",
		"expenseitem": "",
		"expenseitem_name": "",
		"oriSum": 0,
		"exchRate": 0,
		"natSum": 0,
		"description": "",
		"paystatus": "",
		"auditstatus": "",
		"settlestatus": "",
		"voucherstatus": "",
		"srcitem": "",
		"cmpflag": "",
		"porderid": "",
		"batno": "",
		"transeqno": "",
		"srcbillid": "",
		"billtype": "",
		"id": "",
		"pubts": "",
		"headItem": {
			"id": "",
			"define1": "",
			"define2": "",
			"define3": "",
			"define4": "",
			"define5": "",
			"define6": "",
			"define7": "",
			"define8": "",
			"define9": "",
			"define10": "",
			"define11": "",
			"define12": "",
			"define13": "",
			"define14": "",
			"define15": "",
			"define16": "",
			"define17": "",
			"define18": "",
			"define19": "",
			"define20": "",
			"define21": "",
			"define22": "",
			"define23": "",
			"define24": "",
			"define25": "",
			"define26": "",
			"define27": "",
			"define28": "",
			"define29": "",
			"define30": "",
			"define31": "",
			"define32": "",
			"define33": "",
			"define34": "",
			"define35": "",
			"define36": "",
			"define37": "",
			"define38": "",
			"define39": "",
			"define40": "",
			"define41": "",
			"define42": "",
			"define43": "",
			"define44": "",
			"define45": "",
			"define46": "",
			"define47": "",
			"define48": "",
			"define49": "",
			"define50": "",
			"define51": "",
			"define52": "",
			"define53": "",
			"define54": "",
			"define55": "",
			"define56": "",
			"define57": "",
			"define58": "",
			"define59": "",
			"define60": ""
		},
		"ecsuiteperson": "",
		"ecsuiteuser": "",
		"creator": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"auditor": "",
		"auditTime": "",
		"cmp_payment_b": [
			{
				"quickType": "",
				"quickType_code": "",
				"quickType_name": "",
				"oriSum": 0,
				"natSum": 0,
				"customer": "",
				"customer_name": "",
				"supplier": "",
				"supplier_name": "",
				"employee": "",
				"employee_name": "",
				"dept": "",
				"dept_name": "",
				"project": "",
				"project_name": "",
				"expenseitem": "",
				"expenseitem_name": "",
				"operator": "",
				"id": "",
				"operator_name": "",
				"pubts": "",
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
					"define8": "",
					"define9": "",
					"define10": "",
					"define11": "",
					"define12": "",
					"define13": "",
					"define14": "",
					"define15": "",
					"define16": "",
					"define17": "",
					"define18": "",
					"define19": "",
					"define20": "",
					"define21": "",
					"define22": "",
					"define23": "",
					"define24": "",
					"define25": "",
					"define26": "",
					"define27": "",
					"define28": "",
					"define29": "",
					"define30": "",
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": ""
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

