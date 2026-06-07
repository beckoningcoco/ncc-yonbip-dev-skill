---
title: "付款保存"
apiId: "0856db4bdcf1459b9724bf0b3bfde311"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Document"
domain: "FI"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 付款保存

>  请求方式	POST | Payment Document (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/payment/save
请求方式	POST
ContentType	application/json
应用场景	开放API
API类别	详情查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	付款单数据
id	string	否	否	付款单ID 新增时无需填写，修改时必填
supplier_retailInvestors	boolean	否	否	供应商是否散户
code	string	否	否	单据编号
accpurpose	string	否	否	核算目的
vouchdate	string	否	是	单据日期，格式为:yyyy-MM-dd HH:mm:ss
accentity_code	string	否	是	会计主体编码
exchangeRateType_code	string	否	是	汇率类型档案编码
accentity_name	string	否	否	会计主体名称
srcflag	string	否	否	来源单据 ，接口不支持关联来源单据，不建议传值。
oriSum	double	否	否	付款金额
natSum	double	否	否	本币金额
balance	double	否	否	余额
supplier_code	string	否	是	供应商编码
supplier_name	string	否	否	供应商名称
supplierbankname	string	否	否	收款银行名称
supplierbankname_account	string	否	否	收款银行账号
supplierbankaccount_accountname	string	否	否	收款银行账户
period_code	string	否	否	会计期间
settlemode_code	string	否	否	结算方式编码
settlemode_name	string	否	否	结算方式名称
currency	string	否	是	币种id
currency_name	string	否	否	币种名称
currency_priceDigit	string	否	是	币种单价精度
currency_moneyDigit	string	否	是	币种金额精度
natCurrency_name	string	否	否	本币币种名称
natCurrency_priceDigit	string	否	是	本币币种单价精度
natCurrency_moneyDigit	string	否	是	本币币种金额精度
exchRate	int	否	是	汇率
operator_code	string	否	否	业务员编码
operator_name	string	否	否	业务员名称
dept_code	string	否	否	部门编码
exchangeRateType_digit	string	否	是	汇率类型金额精度
exchangeRateType_name	string	否	否	汇率类型名称
exchangeRateType	string	否	否	汇率类型id
dept_name	string	否	否	部门名称
project	string	否	否	项目id
project_code	string	否	否	项目编码
project_name	string	否	否	项目名称
enterprisebankaccount	string	否	否	付款银行账户id
enterprisebankaccount_code	string	否	否	付款银行账号编码
enterprisebankaccount_name	string	否	否	付款银行账户名称
description	string	否	否	备注
noteno	string	否	否	票据号
tradetype	string	否	否	交易类型id
tradetype_name	string	否	否	交易类型名称
tradetype_code	string	否	是	交易编码
srcitem	string	否	否	事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、
org_code	string	否	否	采购组织编码
org	string	否	否	采购组织id
org_name	string	否	否	采购组织名称
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
cashaccount	string	否	否	付款现金账户id
cashaccount_code	string	否	否	付款现金账号编码
cashaccount_name	string	否	否	付款现金账户名称
store	string	否	否	门店id
store_name	string	否	否	门店名称
retailer	string	否	否	散户
orderno	string	否	否	订单编号
caobject	string	否	否	收付款对象类型, 2:供应商
basebilltype	string	否	否	事项类型id
basebilltype_name	string	否	否	事项类型名称
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
redflag	boolean	否	否	是否红冲, true:是、false:否、
initflag	boolean	否	否	期初标志, true:是、false:否、
isWfControlled	boolean	否	否	审批流标志, true:是、false:否、
returncount	int	否	否	返回次数
pubts	string	否	否	时间戳,格式为:yyyy-MM-dd HH:mm:ss
creator	string	否	否	创建人
createTime	string	否	否	创建时间
createDate	string	否	否	创建日期
modifier	string	否	否	修改人
modifyTime	string	否	否	修改时间
modifyDate	string	否	否	修改日期
auditor	string	否	否	审批人
auditTime	string	否	否	审批时间
auditDate	string	否	否	审批日期
srcbillid	string	否	否	来源单据id ，接口不支持关联来源单据，不建议传值。
_status	string	否	是	操作标识, Insert:新增、Update:更新
PayBillb	object	是	是	付款单明细

## 3. 请求示例

Url: /yonbip/fi/payment/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"supplier_retailInvestors": true,
			"code": "",
			"accpurpose": "",
			"vouchdate": "",
			"accentity_code": "",
			"exchangeRateType_code": "",
			"accentity_name": "",
			"srcflag": "",
			"oriSum": 0,
			"natSum": 0,
			"balance": 0,
			"supplier_code": "",
			"supplier_name": "",
			"supplierbankname": "",
			"supplierbankname_account": "",
			"supplierbankaccount_accountname": "",
			"period_code": "",
			"settlemode_code": "",
			"settlemode_name": "",
			"currency": "",
			"currency_name": "",
			"currency_priceDigit": "",
			"currency_moneyDigit": "",
			"natCurrency_name": "",
			"natCurrency_priceDigit": "",
			"natCurrency_moneyDigit": "",
			"exchRate": 0,
			"operator_code": "",
			"operator_name": "",
			"dept_code": "",
			"exchangeRateType_digit": "",
			"exchangeRateType_name": "",
			"exchangeRateType": "",
			"dept_name": "",
			"project": "",
			"project_code": "",
			"project_name": "",
			"enterprisebankaccount": "",
			"enterprisebankaccount_code": "",
			"enterprisebankaccount_name": "",
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
			"cashaccount": "",
			"cashaccount_code": "",
			"cashaccount_name": "",
			"store": "",
			"store_name": "",
			"retailer": "",
			"orderno": "",
			"caobject": "",
			"basebilltype": "",
			"basebilltype_name": "",
			"redflag": true,
			"initflag": true,
			"isWfControlled": true,
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
			"srcbillid": "",
			"_status": "",
			"PayBillb": [
				{
					"id": "",
					"mainid": "",
					"expenseitem": "",
					"expenseitem_code": "",
					"expenseitem_name": "",
					"quickType_name": "",
					"quickType": "",
					"quickType_code": "",
					"oriSum": 0,
					"natSum": 0,
					"customer_name": "",
					"supplier_name": "",
					"employee_name": "",
					"dept_code": "",
					"dept_name": "",
					"operator_code": "",
					"operator_name": "",
					"project_name": "",
					"project_code": "",
					"orderno": "",
					"description": "",
					"delegation": "",
					"delegation_name": "",
					"srcbillno": "",
					"srcbillitemno": "",
					"topsrcbillno": "",
					"topsrcbillitemno": "",
					"pubts": "",
					"issue": "",
					"_status": ""
				}
			]
		}
	]
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
cmpflag	boolean	否	是否传现金标志
localbalance	double	否	本币余额
basebilltypecode	string	否	事项类型编码
signature	string	否	流程防串改加签
tenant	string	否	租户
creatorId	string	否	创建者ID
id	string	否	付款单ID
supplier_retailInvestors	string	否	供应商是否散户
busiaccbook	string	否	业务账簿
accpurpose	string	否	核算目的
vouchdate	string	否	单据日期
code	string	否	单据编号
accentity_code	string	否	会计主体编码
accentity	string	否	会计主体ID
exchangeRateType_code	string	否	汇率类型档案编码
accentity_name	string	否	会计主体名称
srcflag	string	否	来源单据
oriSum	double	否	付款金额
natSum	double	否	本币金额
balance	double	否	余额
supplier_code	string	否	供应商编码
supplier	string	否	供应商ID
supplier_name	string	否	供应商名称
supplierbankname	string	否	收款银行名称
supplierbankaccount	string	否	收款银行账户ID
supplierbankaccount_accountname	string	否	收款银行账户
period	string	否	会计期间ID
period_code	string	否	会计期间
settlemode_code	string	否	结算方式编码
settlemode	string	否	结算方式ID
settlemode_name	string	否	结算方式名称
currency	string	否	币种id
currency_name	string	否	币种名称
currency_priceDigit	string	否	币种单价精度
currency_moneyDigit	string	否	币种金额精度
natCurrency	string	否	本币币种id
natCurrency_name	string	否	本币币种名称
natCurrency_priceDigit	string	否	本币币种单价精度
natCurrency_moneyDigit	string	否	本币币种金额精度
exchRate	int	否	汇率
operator_code	string	否	业务员编码
operator	string	否	业务员ID
operator_name	string	否	业务员名称
dept_code	string	否	部门编码
exchangeRateType_digit	string	否	汇率类型金额精度
exchangeRateType_name	string	否	汇率类型名称
exchangeRateType	string	否	汇率类型id
dept	string	否	部门ID
dept_name	string	否	部门名称
project	string	否	项目ID
project_code	string	否	项目编码
project_name	string	否	项目名称
enterprisebankaccount	string	否	付款银行账户ID
enterprisebankaccount_code	string	否	付款银行账号编码
enterprisebankaccount_name	string	否	付款银行账户名称
auditstatus	string	否	审批状态, 1:已审批、2:未审批、
status	string	否	单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、
writeoffstatus	string	否	核销状态, 1:已核销、2:未核销、3:部分核销、
voucherstatus	string	否	凭证状态, 3:已接收未生成、4:不生成、1:已生成、2:未生成、
description	string	否	备注
noteno	string	否	票据号
tradetype	string	否	交易类型ID
tradetype_name	string	否	交易类型名称
tradetype_code	string	否	交易编码
srcitem	string	否	事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、
org_code	string	否	采购组织编码
org	string	否	采购组织id
org_name	string	否	采购组织名称
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
cashaccount	string	否	付款现金账户ID
cashaccount_code	string	否	付款现金账号编码
cashaccount_name	string	否	付款现金账户名称
store	string	否	门店ID
store_name	string	否	门店名称
retailer	string	否	散户
orderno	string	否	订单编号
caobject	string	否	收付款对象类型, 4:其他、1:客户、2:供应商、3:人员、
basebilltype	string	否	事项类型id
basebilltype_name	string	否	事项类型名称
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
paystatus	string	否	支付状态, 5:支付中、6:支付不明、7:线下支付成功、0:待支付、1:预下单成功、2:预下单失败、3:支付成功、4:支付失败、
settlestatus	string	否	结算状态, 1:未结算、2:已结算、
redflag	string	否	是否红冲, true:是、false:否、
initflag	string	否	期初标志, true:是、false:否、
isWfControlled	string	否	审批流标志, true:是、false:否、
verifystate	int	否	审批流状态,0:未审批、2：已审批
returncount	int	否	返回次数
pubts	string	否	时间戳,格式为:yyyy-MM-dd HH:mm:ss
creator	string	否	创建人
createTime	string	否	创建时间
createDate	string	否	创建日期
modifier	string	否	修改人
modifyTime	string	否	修改时间
modifyDate	string	否	修改日期
auditor	string	否	审批人
auditTime	string	否	审批时间
auditDate	string	否	审批日期
srcbillid	string	否	来源单据id
PayBillb	object	是	付款单明细

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"cmpflag": true,
		"localbalance": 0,
		"basebilltypecode": "",
		"signature": "",
		"tenant": "",
		"creatorId": "",
		"id": "",
		"supplier_retailInvestors": "",
		"busiaccbook": "",
		"accpurpose": "",
		"vouchdate": "",
		"code": "",
		"accentity_code": "",
		"accentity": "",
		"exchangeRateType_code": "",
		"accentity_name": "",
		"srcflag": "",
		"oriSum": 0,
		"natSum": 0,
		"balance": 0,
		"supplier_code": "",
		"supplier": "",
		"supplier_name": "",
		"supplierbankname": "",
		"supplierbankaccount": "",
		"supplierbankaccount_accountname": "",
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
		"exchRate": 0,
		"operator_code": "",
		"operator": "",
		"operator_name": "",
		"dept_code": "",
		"exchangeRateType_digit": "",
		"exchangeRateType_name": "",
		"exchangeRateType": "",
		"dept": "",
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
		"cashaccount": "",
		"cashaccount_code": "",
		"cashaccount_name": "",
		"store": "",
		"store_name": "",
		"retailer": "",
		"orderno": "",
		"caobject": "",
		"basebilltype": "",
		"basebilltype_name": "",
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
		"srcbillid": "",
		"PayBillb": [
			{
				"mainid": "",
				"expenseitem": "",
				"expenseitem_code": "",
				"expenseitem_name": "",
				"quickType": "",
				"oriSum": 0,
				"natSum": 0,
				"customer": "",
				"customer_name": "",
				"supplier": "",
				"supplier_code": "",
				"supplier_name": "",
				"employee": "",
				"employee_name": "",
				"dept": "",
				"dept_code": "",
				"dept_name": "",
				"operator": "",
				"operator_code": "",
				"operator_name": "",
				"project": "",
				"project_name": "",
				"project_code": "",
				"orderno": "",
				"description": "",
				"delegation": "",
				"delegation_name": "",
				"srcbillno": "",
				"srcbillitemno": "",
				"topsrcbillno": "",
				"topsrcbillitemno": "",
				"id": "",
				"pubts": "",
				"issue": ""
			}
		]
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	精度校验:精度位数不能为空！	请求参数添加exchangeRateType_digit字段

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
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

