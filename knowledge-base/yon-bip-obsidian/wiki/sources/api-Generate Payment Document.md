---
title: "生成付款单"
apiId: "e857b201dc324297865f349b695f8b60"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 生成付款单

> `ContentType	application/json` 请求方式	POST | 分类: Payment Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/cmppayment/save

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
| data | object | 否 | 是 | 付款工作台主表[arap.paybill.PayBill] |
| id | string | 否 | 否 | ID 新增时无需填写，修改时必填 |
| code | string | 否 | 否 | 单据编号,当为手动编码时该字段必填 |
| vouchdate | string | 否 | 是 | 单据日期(YYYY-MM-dd或YYYY-MM-dd HH:mm:ss) 示例：2021-10-19或2021-10-19 15:23:56 |
| accentity | string | 否 | 是 | 会计主体ID |
| accentity_code | string | 否 | 否 | 会计主体id，或会计主体code |
| accentity_name | string | 否 | 否 | 会计主体名称【注：仅供文档阅读使用，保存单据时不必填写】 |
| settlemode | string | 否 | 是 | 结算方式ID |
| settlemode_code | string | 否 | 否 | 结算方式ID，或结算方式编码 |
| settlemode_name | string | 否 | 否 | 结算方式名称 |
| settlemode_serviceAttr | string | 否 | 否 | 结算方式业务属性 |
| exchangeRateType | string | 否 | 是 | 汇率类型id |
| exchangeRateType_code | string | 否 | 否 | 汇率类型id，或汇率类型编码 |
| exchangeRateType_name | string | 否 | 否 | 汇率类型名称 |
| exchangeRateType_digit | string | 否 | 否 | 汇率精度 |
| natCurrency | string | 否 | 否 | 本币币种id |
| natCurrency_name | string | 否 | 否 | 本币币种名称 |
| natCurrency_priceDigit | string | 否 | 否 | 本币币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 否 | 本币币种金额精度 |
| currency | string | 否 | 是 | 币种名称，币种id，或币种编码 |
| currency_name | string | 否 | 否 | 币种名称，币种id，或币种编码 |
| currency_priceDigit | string | 否 | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 否 | 币种金额精度 |
| tradetype | string | 否 | 是 | 交易类型ID |
| tradetype_code | string | 否 | 否 | 交易类型ID，或交易类型编码 |
| tradetype_name | string | 否 | 否 | 交易类型名称 |
| enterprisebankaccount | string | 否 | 否 | 付款银行账户ID |
| enterprisebankaccount_account | string | 否 | 否 | 付款银行账户ID，或付款银行账号，或付款银行账户编码 |
| enterprisebankaccount_bank | string | 否 | 否 | 付款银行类别 |
| enterprisebankaccount_name | string | 否 | 否 | 付款银行账户名称 |
| cashaccount | string | 否 | 否 | 付款现金账户ID |
| cashaccount_code | string | 否 | 否 | 付款现金账户ID，或付款现金账户编码 |
| cashaccount_name | string | 否 | 否 | 付款现金账户名称 |
| org | string | 否 | 否 | 业务组织id |
| org_code | string | 否 | 否 | 业务组织id，或业务组织编码 |
| org_name | string | 否 | 否 | 业务组织名称 |
| caobject | int | 否 | 是 | 付款对象, 4:其他、1:客户、2:供应商、3:人员、 |
| supplier | string | 否 | 否 | 收款供应商ID |
| supplier_name | string | 否 | 否 | 收款供应商名称 |
| supplier_code | string | 否 | 否 | 收款供应商ID，或收款供应商编码（付款对象为2时必输） |
| supplierbankaccount | string | 否 | 否 | 收款供应商账户ID |
| supplierbankaccount_bank | string | 否 | 否 | 收款供应商银行类别 |
| supplierbankaccount_accountname | string | 否 | 否 | 收款供应商账户 |
| supplierbankaccount_account | string | 否 | 否 | 收款供应商账户ID，或收款供应商账号 |
| customer | string | 否 | 否 | 收款客户ID |
| customer_code | string | 否 | 否 | 收款客户ID，或收款客户编码（付款对象为1时必输） |
| customer_name | string | 否 | 否 | 收款客户名称 |
| customerbankaccount | string | 否 | 否 | 收款客户账户ID |
| customerbankaccount_bank | string | 否 | 否 | 收款客户银行类别 |
| customerbankaccount_bankAccount | string | 否 | 否 | 收款客户账户ID，或收款客户账号 |
| customerbankaccount_bankAccountName | string | 否 | 否 | 收款客户账户 |
| employee | string | 否 | 否 | 收款员工ID |
| employee_name | string | 否 | 否 | 收款员工名称 |
| employee_code | string | 否 | 否 | 收款员工ID，或收款员工编码（付款对象为3时必输） |
| staffBankAccount | string | 否 | 否 | 收款员工账户ID |
| staffBankAccount_account | string | 否 | 否 | 收款员工账户ID，或收款员工账号 |
| staffBankAccount_bank | string | 否 | 否 | 收款员工银行类别 |
| retailer | string | 否 | 否 | 收款单位名称，付款对象为4时录入 |
| retailerAccountName | string | 否 | 否 | 收款账户名称，付款对象为4时录入 |
| retailerAccountNo | string | 否 | 否 | 收款账号，付款对象为4时录入 |
| retailerLineNumber | string | 否 | 否 | 收款账户联行号，付款对象为4时录入 |
| retailerAccountType | string | 否 | 否 | 收款类型, 1:对私、2:对公、3:银行内部户，付款对象为4时录入 |
| retailerBankType | string | 否 | 否 | 收款账户银行类别ID |
| retailerBankType_code | string | 否 | 否 | 收款账户银行类别ID，或收款账户银行类别编码，付款对象为4时录入 |
| retailerBankType_name | string | 否 | 否 | 收款账户银行类别名称 |
| retailerBankName | string | 否 | 否 | 收款账户开户行 |
| dept | string | 否 | 否 | 部门ID |
| dept_code | string | 否 | 否 | 部门ID，或部门编码 |
| dept_name | string | 否 | 否 | 部门名称 |
| project | string | 否 | 否 | 项目ID |
| project_code | string | 否 | 否 | 项目ID，或项目编码 |
| project_name | string | 否 | 否 | 项目名称 |
| expenseitem | string | 否 | 否 | 费用项目ID |
| expenseitem_name | string | 否 | 否 | 费用项目ID，费用项目名称，或费用项目编码 |
| oriSum | double | 否 | 是 | 付款金额 |
| exchRate | double | 否 | 是 | 汇率 |
| natSum | double | 否 | 是 | 本币金额 |
| description | string | 否 | 否 | 备注 |
| paystatus | string | 否 | 否 | 支付状态，由系统业务自动生成，接口无需传值。 |
| auditstatus | string | 否 | 否 | 审批状态，由系统业务自动生成，接口无需传值。 |
| settlestatus | string | 否 | 否 | 结算状态，由系统业务自动生成，接口无需传值。 |
| voucherstatus | string | 否 | 否 | 凭证状态，由系统业务自动生成，接口无需传值。 |
| srcitem | string | 否 | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、 |
| cmpflag | string | 否 | 否 | 现金管理标志, true:是、false:否、 |
| porderid | string | 否 | 否 | 预下单编码 |
| batno | string | 否 | 否 | 批量支付编号 |
| transeqno | string | 否 | 否 | 交易流水号 |
| srcbillid | string | 否 | 否 | 来源单据号或来源单据ID，用于幂等性校验，字段需唯一。 示例：2166661237641472 |
| billtype | string | 否 | 否 | 单据类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| ecsuiteperson | string | 否 | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 否 | 气泡联系人 |
| creator | string | 否 | 否 | 创建人 |
| createTime | string | 否 | 否 | 创建时间 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| headItem | object | 否 | 否 | 表头固定自定义项（1-60） |
| defines | object | 否 | 否 | 表头自由自定义项（1-60） |
| PayBillb | object | 是 | 是 | 付款单明细 |

## 3. 请求示例

Url: /yonbip/fi/cmppayment/save?access_token=访问令牌
Body: {
	"data": {
		"id": "",
		"code": "",
		"vouchdate": "2021-10-19或2021-10-19 15:23:56",
		"accentity": "",
		"accentity_code": "",
		"accentity_name": "",
		"settlemode": "",
		"settlemode_code": "",
		"settlemode_name": "",
		"settlemode_serviceAttr": "",
		"exchangeRateType": "",
		"exchangeRateType_code": "",
		"exchangeRateType_name": "",
		"exchangeRateType_digit": "",
		"natCurrency": "",
		"natCurrency_name": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"currency": "",
		"currency_name": "",
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"tradetype": "",
		"tradetype_code": "",
		"tradetype_name": "",
		"enterprisebankaccount": "",
		"enterprisebankaccount_account": "",
		"enterprisebankaccount_bank": "",
		"enterprisebankaccount_name": "",
		"cashaccount": "",
		"cashaccount_code": "",
		"cashaccount_name": "",
		"org": "",
		"org_code": "",
		"org_name": "",
		"caobject": 0,
		"supplier": "",
		"supplier_name": "",
		"supplier_code": "",
		"supplierbankaccount": "",
		"supplierbankaccount_bank": "",
		"supplierbankaccount_accountname": "",
		"supplierbankaccount_account": "",
		"customer": "",
		"customer_code": "",
		"customer_name": "",
		"customerbankaccount": "",
		"customerbankaccount_bank": "",
		"customerbankaccount_bankAccount": "",
		"customerbankaccount_bankAccountName": "",
		"employee": "",
		"employee_name": "",
		"employee_code": "",
		"staffBankAccount": "",
		"staffBankAccount_account": "",
		"staffBankAccount_bank": "",
		"retailer": "",
		"retailerAccountName": "",
		"retailerAccountNo": "",
		"retailerLineNumber": "",
		"retailerAccountType": "",
		"retailerBankType": "",
		"retailerBankType_code": "",
		"retailerBankType_name": "",
		"retailerBankName": "",
		"dept": "",
		"dept_code": "",
		"dept_name": "",
		"project": "",
		"project_code": "",
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
		"srcbillid": "2166661237641472",
		"billtype": "",
		"pubts": "",
		"ecsuiteperson": "",
		"ecsuiteuser": "",
		"creator": "",
		"createTime": "",
		"_status": "",
		"headItem": {
			"id": "",
			"define1": "表头固定自定义项1",
			"define2": "1891079656820992"
		},
		"defines": {
			"id": "",
			"define1": "表头自由自定义项1",
			"define2": "1891079656820993"
		},
		"PayBillb": [
			{
				"quickType": "",
				"quickType_name": "",
				"quickType_code": "",
				"id": "",
				"oriSum": 0,
				"natSum": 0,
				"customer": "",
				"customer_name": "",
				"supplier": "",
				"supplier_name": "",
				"employee": "",
				"employee_name": "",
				"employee_code": "",
				"dept": "",
				"dept_code": "",
				"dept_name": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"expenseitem": "",
				"expenseitem_name": "",
				"expenseitem_code": "",
				"operator": "",
				"operator_code": "",
				"operator_name": "",
				"pubts": "",
				"bodyItem": {
					"id": "",
					"define1": "表体固定自定义项1",
					"define2": "2411545234969601"
				},
				"defines": {
					"id": "",
					"define1": "表体自由自定义项1",
					"define2": "2411545234969603"
				},
				"_status": ""
			}
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| creatorId | string | 否 | 创建人ID |
| status | string | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 |
| createDate | string | 否 | 创建日期 |
| period | string | 否 | 会计期间id |
| accentity | string | 否 | 会计主体ID |
| accentity_name | string | 否 | 会计主体名称 |
| natCurrency | string | 否 | 本币币种id |
| natCurrency_name | string | 否 | 本币币种名称 |
| natCurrency_priceDigit | string | 否 | 本币币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 本币币种金额精度 |
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| tradetype | string | 否 | 交易类型ID |
| tradetype_name | string | 否 | 交易类型名称 |
| tradetype_code | string | 否 | 交易类型编码 |
| settlemode | string | 否 | 结算方式ID |
| exchangeRateType_digit | string | 否 | 汇率精度 |
| exchangeRateType | string | 否 | 汇率类型id |
| settlemode_serviceAttr | string | 否 | 结算方式业务属性 |
| settlemode_name | string | 否 | 结算方式名称 |
| exchangeRateType_name | string | 否 | 汇率类型名称 |
| currency | string | 否 | 币种id |
| currency_name | string | 否 | 币种名称 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| enterprisebankaccount | string | 否 | 付款银行账户ID |
| enterprisebankaccount_bank | string | 否 | 付款银行类别 |
| enterprisebankaccount_name | string | 否 | 付款银行账户名称 |
| cashaccount | string | 否 | 付款现金账户ID |
| cashaccount_name | string | 否 | 付款现金账户名称 |
| org | string | 否 | 业务组织id |
| org_name | string | 否 | 业务组织名称 |
| caobject | string | 否 | 付款对象, 4:其他、1:客户、2:供应商、3:人员、 |
| supplier | string | 否 | 收款供应商ID |
| supplier_name | string | 否 | 收款供应商名称 |
| supplierbankaccount | string | 否 | 收款供应商账户ID |
| supplierbankaccount_bank | string | 否 | 收款供应商银行类别 |
| supplierbankaccount_accountname | string | 否 | 收款供应商账户 |
| customer | string | 否 | 收款客户ID |
| customer_name | string | 否 | 收款客户名称 |
| customerbankaccount | string | 否 | 收款客户账户ID |
| customerbankaccount_bank | string | 否 | 收款客户银行类别 |
| customerbankaccount_bankAccountName | string | 否 | 收款客户账户 |
| employee | string | 否 | 收款员工ID |
| employee_name | string | 否 | 收款员工名称 |
| staffBankAccount | string | 否 | 收款员工账户ID |
| staffBankAccount_account | string | 否 | 收款员工账户 |
| retailer | string | 否 | 收款单位名称 |
| retailerAccountName | string | 否 | 收款账户名称 |
| retailerAccountNo | string | 否 | 收款账号 |
| retailerLineNumber | string | 否 | 收款账户联行号 |
| retailerAccountType | string | 否 | 收款类型, 1:对私、2:对公、3:银行内部户、 |
| retailerBankType | string | 否 | 收款账户银行类别ID |
| retailerBankType_name | string | 否 | 收款账户银行类别名称 |
| dept | string | 否 | 部门ID |
| dept_name | string | 否 | 部门名称 |
| staffBankAccount_bank | string | 否 | 收款员工银行类别 |
| project | string | 否 | 项目ID |
| project_name | string | 否 | 项目名称 |
| expenseitem | string | 否 | 费用项目ID |
| expenseitem_name | string | 否 | 费用项目名称 |
| oriSum | double | 否 | 付款金额 |
| exchRate | double | 否 | 汇率 |
| natSum | double | 否 | 本币金额 |
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
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| ecsuiteperson | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间 |
| PayBillb | object | 是 | 付款单明细 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"creatorId": "",
		"status": "",
		"createDate": "",
		"period": "",
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
		"ecsuiteperson": "",
		"ecsuiteuser": "",
		"creator": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"auditor": "",
		"auditTime": "",
		"PayBillb": [
			{
				"quickType": "",
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
				"pubts": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	精度校验:精度位数不能为空！	请求参数添加exchangeRateType_digit字段


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

