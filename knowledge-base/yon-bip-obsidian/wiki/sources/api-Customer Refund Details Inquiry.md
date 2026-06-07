---
title: "客户退款详情查询"
apiId: "d14e640147734466920677e3012dee47"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Accounts Receivable"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户退款详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Accounts Receivable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/paybill/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 客户退款单ID |

## 3. 请求示例

Url: /yonbip/fi/paybill/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回客户退款单数据 |
| id | string | 否 | 客户退款单id |
| customer_retailInvestors | string | 否 | 客户是否散户 |
| busiaccbook | string | 否 | 业务账簿 |
| accpurpose | string | 否 | 核算目的 |
| exchangeRateType_code | string | 否 | 汇率类型档案编码 |
| vouchdate | string | 否 | 单据日期 |
| code | string | 否 | 单据编号 |
| accentity | string | 否 | 会计主体id |
| accentity_code | string | 否 | 会计主体编码 |
| accentity_name | string | 否 | 会计主体名称 |
| oriSum | double | 否 | 付款金额 |
| natSum | double | 否 | 本币金额 |
| balance | double | 否 | 余额 |
| customer | string | 否 | 客户id |
| customer_code | string | 否 | 客户编码 |
| customer_name | string | 否 | 客户名称 |
| customerbankname | string | 否 | 收款银行名称 |
| customerbankaccount | string | 否 | 收款银行账户id |
| customerbankaccount_bankAccountName | string | 否 | 收款银行账户 |
| period | string | 否 | 会计期间id |
| period_code | string | 否 | 会计期间 |
| settlemode_code | string | 否 | 结算方式编码 |
| settlemode | string | 否 | 结算方式id |
| settlemode_name | string | 否 | 结算方式名称 |
| currency | string | 否 | 币种id |
| currency_name | string | 否 | 币种名称 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| natCurrency | string | 否 | 本币币种id |
| natCurrency_name | string | 否 | 本币币种名称 |
| natCurrency_priceDigit | string | 否 | 本币币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 本币币种金额精度 |
| exchangeRateType_digit | string | 否 | 汇率类型金额精度 |
| exchangeRateType_name | string | 否 | 汇率类型名称 |
| exchangeRateType | string | 否 | 汇率类型id |
| exchRate | int | 否 | 汇率 |
| operator | string | 否 | 业务员id |
| operator_code | string | 否 | 业务员编码 |
| operator_name | string | 否 | 业务员名称 |
| dept | string | 否 | 部门id |
| dept_code | string | 否 | 部门编码 |
| dept_name | string | 否 | 部门名称 |
| project | string | 否 | 项目id |
| project_code | string | 否 | 项目编码 |
| project_name | string | 否 | 项目名称 |
| enterprisebankaccount | string | 否 | 付款银行账户id |
| enterprisebankaccount_code | string | 否 | 付款银行账号编码 |
| enterprisebankaccount_name | string | 否 | 付款银行账户名称 |
| auditstatus | string | 否 | 审批状态, 1:已审批、2:未审批、 |
| status | string | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 |
| writeoffstatus | string | 否 | 核销状态, 1:已核销、2:未核销、3:部分核销、 |
| voucherstatus | string | 否 | 凭证状态, 3:已接收未生成、4:不生成、1:已生成、2:未生成、 |
| description | string | 否 | 备注 |
| noteno | string | 否 | 票据号 |
| tradetype | string | 否 | 交易类型id |
| tradetype_name | string | 否 | 交易类型名称 |
| tradetype_code | string | 否 | 交易编码 |
| srcitem | string | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、 |
| org_code | string | 否 | 销售组织编码 |
| org | string | 否 | 销售组织id |
| org_name | string | 否 | 销售组织名称 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| basebilltype_name | string | 否 | 事项类型名称 |
| cashaccount | string | 否 | 付款现金账户id |
| cashaccount_code | string | 否 | 付款现金账号编码 |
| cashaccount_name | string | 否 | 付款现金账户名称 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| retailer | string | 否 | 散户 |
| orderno | string | 否 | 订单编号 |
| caobject | string | 否 | 收付款对象类型, 4:其他、1:客户、2:供应商、3:人员、 |
| basebilltype | string | 否 | 事项类型id |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| paystatus | string | 否 | 支付状态, 5:支付中、6:支付不明、7:线下支付成功、0:待支付、1:预下单成功、2:预下单失败、3:支付成功、4:支付失败、 |
| settlestatus | string | 否 | 结算状态, 1:未结算、2:已结算、 |
| redflag | string | 否 | 是否红冲, true:是、false:否、 |
| initflag | string | 否 | 期初标志, true:是、false:否、 |
| isWfControlled | string | 否 | 审批流标志, true:是、false:否、 |
| verifystate | int | 否 | 审批流状态 |
| returncount | int | 否 | 返回次数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间,格式为:yyyy-MM-dd HH:mm:ss |
| createDate | string | 否 | 创建日期,格式为:yyyy-MM-dd HH:mm:ss |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间,格式为:yyyy-MM-dd HH:mm:ss |
| modifyDate | string | 否 | 修改日期,格式为:yyyy-MM-dd HH:mm:ss |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间,格式为:yyyy-MM-dd HH:mm:ss |
| auditDate | string | 否 | 审批日期,格式为:yyyy-MM-dd HH:mm:ss |
| PayBillb | object | 是 | 客户退款单明细 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": "",
		"customer_retailInvestors": "",
		"busiaccbook": "",
		"accpurpose": "",
		"exchangeRateType_code": "",
		"vouchdate": "",
		"code": "",
		"accentity": "",
		"accentity_code": "",
		"accentity_name": "",
		"oriSum": 0,
		"natSum": 0,
		"balance": 0,
		"customer": "",
		"customer_code": "",
		"customer_name": "",
		"customerbankname": "",
		"customerbankaccount": "",
		"customerbankaccount_bankAccountName": "",
		"period": "",
		"period_code": "",
		"settlemode_code": "",
		"settlemode": "",
		"settlemode_name": "",
		"currency": "",
		"currency_name": "",
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"natCurrency": "",
		"natCurrency_name": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"exchangeRateType_digit": "",
		"exchangeRateType_name": "",
		"exchangeRateType": "",
		"exchRate": 0,
		"operator": "",
		"operator_code": "",
		"operator_name": "",
		"dept": "",
		"dept_code": "",
		"dept_name": "",
		"project": "",
		"project_code": "",
		"project_name": "",
		"enterprisebankaccount": "",
		"enterprisebankaccount_code": "",
		"enterprisebankaccount_name": "",
		"auditstatus": "",
		"status": "",
		"writeoffstatus": "",
		"voucherstatus": "",
		"description": "",
		"noteno": "",
		"tradetype": "",
		"tradetype_name": "",
		"tradetype_code": "",
		"srcitem": "",
		"org_code": "",
		"org": "",
		"org_name": "",
		"billtype": "",
		"basebilltype_name": "",
		"cashaccount": "",
		"cashaccount_code": "",
		"cashaccount_name": "",
		"store": "",
		"store_name": "",
		"retailer": "",
		"orderno": "",
		"caobject": "",
		"basebilltype": "",
		"paystatus": "",
		"settlestatus": "",
		"redflag": "",
		"initflag": "",
		"isWfControlled": "",
		"verifystate": 0,
		"returncount": 0,
		"pubts": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"PayBillb": [
			{
				"mainid": "",
				"expenseitem": "",
				"expenseitem_code": "",
				"expenseitem_name": "",
				"quickType": "",
				"oriSum": 0,
				"natSum": 0,
				"customer_code": "",
				"customer": "",
				"customer_name": "",
				"org_code": "",
				"org": "",
				"supplier": "",
				"org_name": "",
				"supplier_name": "",
				"employee": "",
				"employee_name": "",
				"dept_code": "",
				"dept": "",
				"dept_name": "",
				"operator_code": "",
				"operator": "",
				"operator_name": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"orderno": "",
				"description": "",
				"delegation": "",
				"delegation_name": "",
				"srcbillno": "",
				"srcbillitemno": "",
				"topsrcbillno": "",
				"topsrcbillitemno": "",
				"id": "",
				"pubts": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	该单据已经被删除或者没有权限	由客户退款列表页面查询退款单ID进行查询


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

