---
title: "付款申请工作台详情查询"
apiId: "ace948bc9fb84f4e939cbbec0077c2bb"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Payment Application Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Application Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款申请工作台详情查询

>  请求方式	GET | Payment Application Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/payapplybill/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	付款申请单ID

## 3. 请求示例

Url: /yonbip/fi/payapplybill/detail?access_token=访问令牌&id=

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
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
accentity	string	否	会计主体id
accentity_name	string	否	会计主体名称
busiaccbook	string	否	业务账簿id
busiaccbook_name	string	否	业务账簿名称
billtype	string	否	单据类型
tradetype	string	否	交易类型id
tradetype_name	string	否	交易类型名称
code	string	否	单据编号
vouchdate	string	否	单据日期
remark	string	否	备注
settlemode	long	否	结算方式id
settlemode_name	string	否	结算方式名称
settlemode_serviceAttr	int	否	结算方式属性（0：银行业务，1：现金业务）
org	string	否	付款申请组织id
org_name	string	否	付款申请组织名称
dept	string	否	部门id
dept_name	string	否	部门名称
operator	string	否	业务员id
operator_name	string	否	业务员名称
project	string	否	项目id
project_name	string	否	项目名称
expenseitem	string	否	费用项目id
expenseitem_name	string	否	费用项目名称
paymentMode	string	否	付款方式(注:填对应数值就可以； 1：现金，2：银行汇率)
proposePaymentDate	string	否	付款日期
distanceProposePaymentDateDays	int	否	距付款日天数
caobject	string	否	付款对象(1：客户，2：供应商，3：员工，4：其他)
supplier	string	否	收款供应商id
supplier_name	string	否	收款供应商名称
supplierbankaccount	string	否	收款供应商账户id
supplierbankaccount_bank	string	否	收款供应商银行类别
supplierbankaccount_accountname	string	否	收款供应商账户
customer	string	否	收款客户ID
customer_name	string	否	收款客户名称
customerbankaccount	string	否	收款客户账户ID
customerbankaccount_bankAccountName	string	否	收款客户账户
employee	string	否	收款员工ID
employee_name	string	否	收款员工名称
staffBankAccount	string	否	收款员工账户ID
staffBankAccount_account	string	否	收款员工账户
retailer	string	否	收款单位名称
retailerAccountName	string	否	收款账户名称
retailerAccountNo	string	否	收款账号
retailerLineNumber	string	否	收款账户联行号
retailerAccountType	string	否	收款类型
retailerBankType	string	否	收款账户银行类别ID
retailerBankType_name	string	否	收款账户银行类别名称
currency	string	否	付款币种id
currency_moneyDigit	string	否	币种金额精度
currency_priceDigit	string	否	币种单价精度
currency_name	string	否	付款币种名称
natCurrency	string	否	本币币种id
natCurrency_priceDigit	string	否	本币币种单价精度
natCurrency_moneyDigit	string	否	本币币种金额精度
natCurrency_name	string	否	本币币种名称
paymentApplyAmountSum	int	否	付款申请金额合计
paymentPreemptAmountSum	int	否	累计占用金额
paidAmountSum	int	否	已付款金额合计
unpaidAmountSum	int	否	未付款金额合计
sourceSystem	string	否	来源系统
srcitem	string	否	来源事项
payBillStatus	string	否	申请单状态(1：开立，2：待审核，3：已审核，4：待付款，5：部分付款，6：付款完成，7：手动关闭)
approvalStatus	string	否	申请审批状态(1：无，2：待审批，3：已审批)
status	string	否	审核状态(1：开立，2：已审核，3：已关闭，4：审核中，5：锁定)
verifystate	string	否	审批状态(1：未提交，2：已提交，3：已审批)
isWfControlled	string	否	是否审批流控制（true：否，false：是）
creator	string	否	创建人
createTime	string	否	创建时间
modifier	string	否	修改人
modifyTime	string	否	修改时间
auditor	string	否	审批人
auditTime	string	否	审批时间
id	string	否	付款申请主表ID
pubts	string	否	时间戳
headItem	object	否	付款申请主表自定义项
cmp_payapplicationbill_b	object	是	付款申请工作台子表[cmp.payapplicationbill.PayApplicationBill_b]

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"accentity": "",
		"accentity_name": "",
		"busiaccbook": "",
		"busiaccbook_name": "",
		"billtype": "",
		"tradetype": "",
		"tradetype_name": "",
		"code": "",
		"vouchdate": "",
		"remark": "",
		"settlemode": 0,
		"settlemode_name": "",
		"settlemode_serviceAttr": 0,
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
		"distanceProposePaymentDateDays": 0,
		"caobject": "",
		"supplier": "",
		"supplier_name": "",
		"supplierbankaccount": "",
		"supplierbankaccount_bank": "",
		"supplierbankaccount_accountname": "",
		"customer": "",
		"customer_name": "",
		"customerbankaccount": "",
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
		"payBillStatus": "",
		"approvalStatus": "",
		"status": "",
		"verifystate": "",
		"isWfControlled": "",
		"creator": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"auditor": "",
		"auditTime": "",
		"id": "",
		"pubts": "",
		"headItem": {
			"id": "",
			"define1": ""
		},
		"cmp_payapplicationbill_b": [
			{
				"id": "",
				"pubts": "",
				"mainid": "",
				"rowno": 0,
				"quickType": "",
				"quickType_code": "",
				"quickType_name": "",
				"srcbillno": "",
				"srcbillitemno": "",
				"srcbillitemid": "",
				"srcbillitemmainid": "",
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
				"material": "",
				"material_name": "",
				"issue": "",
				"contractNo": "",
				"invoiceNo": "",
				"orderNo": "",
				"remark": "",
				"productsku": "",
				"paymentApplyAmount": 0,
				"productsku_cCode": "",
				"paymentPreemptAmount": 0,
				"productsku_skuName": "",
				"paidAmount": 0,
				"unpaidAmount": 0,
				"bodyItem": {
					"id": "",
					"define1": ""
				},
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"makeRuleCode": "",
				"topsrcbillitemid": "",
				"topsrcbillitemmainid": "",
				"srcinvoicebillitemid": ""
			}
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

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

