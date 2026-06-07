---
title: "收款工作台单据保存"
apiId: "800c3643774745458e5297877d804e04"
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

# 收款工作台单据保存

>  请求方式	POST | Collection Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/cmpreceivebill/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	收款单信息
id	string	否	否	收款单ID 新增时无需填写，修改时必填
code	string	否	否	单据编号,自动编码时不必填，手动编码时必填 示例：CMR00210506000001
accentity	string	否	是	会计主体ID，或会计主体code
accentity_code	string	否	否	会计主体编码
accentity_name	string	否	否	会计主体名称
vouchdate	string	否	是	单据日期 示例：2021-05-06
customer	string	否	否	客户ID，或客户code；收付款对象类型为客户时必填
customer_code	string	否	否	客户编码
customer_name	string	否	否	客户名称
customer_retailInvestors	boolean	否	否	客户是否散户
customerbankaccount	string	否	否	付款银行账户id
customerbankaccount_bankAccountName	string	否	否	付款银行账户
settlemode_code	string	否	否	结算方式编码
settlemode	string	否	是	结算方式id，或结算方式code
settlemode_name	string	否	否	结算方式名称
retailer	string	否	否	散户
retailerLineNumber	string	否	否	散户账户联行号
retailerBankType	string	否	否	散户账户银行类别
retailerAccountType	string	否	否	散户收款类型 1-对私 2-对公 3-银行内部户
retailerAccountNo	string	否	否	散户账号
retailerAccountName	string	否	否	散户账户名称
enterprisebankaccount_code	string	否	否	收款银行账户编码
enterprisebankaccount	string	否	否	收款银行账户id，或收款银行账户code;结算方式的业务属性为银行业务时必填
enterprisebankaccount_name	string	否	否	收款银行账户名称
cashaccount_code	string	否	否	收款现金账户编码
cashaccount	string	否	否	收款现金账户id，收款现金账户code;结算方式的业务属性为现金业务时必填
cashaccount_name	string	否	否	收款现金账户名称
tradetype	string	否	是	交易类型id，或交易类型code
tradetype_name	string	否	否	交易类型名称
tradetype_code	string	否	否	交易类型编码
currency	string	否	是	币种ID，或币种code
currency_name	string	否	否	币种名称
currency_priceDigit	string	否	否	币种单价精度
currency_moneyDigit	string	否	否	币种金额精度
natCurrency	string	否	否	本币币种ID，或本币币种code
natCurrency_name	string	否	否	本币币种名称
natCurrency_priceDigit	string	否	否	本币币种单价精度
exchangeRateType_digit	string	否	否	汇率精度
exchangeRateType_name	string	否	否	汇率类型名称
exchangeRateType	string	否	是	汇率类型id，或汇率类型code
exchangeRateType_code	string	否	否	汇率类型编码
natCurrency_moneyDigit	string	否	否	本币币种金额精度
exchRate	int	否	是	汇率
oriSum	double	否	是	收款金额（根据币种金额精度保留小数点位数，不足补零）
natSum	double	否	是	本币金额（根据本币币种金额精度保留小数点位数，不足补零）
balance	double	否	否	余额（根据币种金额精度保留小数点位数）
org	string	否	否	业务组织ID，或业务组织code
org_code	string	否	否	业务组织编码
bookAmount	int	否	否	预占用金额（根据币种金额精度保留小数点位数，不足补零）
org_name	string	否	否	销售组织名称
dept	string	否	否	部门ID,或者部门编码
dept_code	string	否	否	部门编码
dept_name	string	否	否	部门名称
operator	string	否	否	业务员ID，或业务员code
operator_code	string	否	否	业务员编码
operator_name	string	否	否	业务员名称
orderno	string	否	否	订单编号
customerbankname	string	否	否	付款银行名称
invoiceno	string	否	否	票据号
project	string	否	否	项目ID
project_code	string	否	否	项目编码
project_name	string	否	否	项目名称
expenseitem	string	否	否	费用项目
expenseitem_code	string	否	否	费用项目编码
expenseitem_name	string	否	否	费用项目名称
description	string	否	否	备注
auditstatus	int	否	否	审批状态，由系统业务自动生成，接口无需传值。
writeoffstatus	int	否	否	核销状态，由系统业务自动生成，接口无需传值。
voucherstatus	int	否	否	凭证状态，由系统业务自动生成，接口无需传值。
localbalance	double	否	否	本币余额
srcitem	int	否	否	事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、
srcbillid	string	否	是	来源单据号或来源单据ID，用于幂等性校验，字段需唯一。 示例：2158317620252928
busiaccbook_name	string	否	否	业务账簿名称
accpurpose	string	否	否	核算目的id
accpurpose_name	string	否	否	核算目的名称
store	string	否	否	门店id
store_name	string	否	否	门店名称
basebilltype_name	string	否	否	事项类型名称
billtype	string	否	否	收付事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
supplierbankaccount	string	否	否	供应商银行账户ID，或供应商银行账户account
supplierbankaccount_account	string	否	否	供应商银行账户
supplierbankname	string	否	否	收款银行名称
signer	string	否	否	签字人id
signer_name	string	否	否	签字人名称
signdate	string	否	否	签字日期 示例：2021-05-06 14：14：14
employee	string	否	否	员工ID，或员工编码；收付款对象类型为员工时，员工不能为空
employee_name	string	否	否	员工名称
staffBankAccount	string	否	否	员工账户id，或员工账户account
staffBankAccount_account	string	否	否	员工账户
caobject	int	否	是	收付款对象类型, 4:其他、1:客户、2:供应商、3:人员、
supplier	string	否	否	供应商ID或供应商编码；收付款对象类型为供应商时，供应商不能为空
supplier_code	string	否	否	供应商编码
supplier_name	string	否	否	供应商名称
redflag	boolean	否	否	是否红冲, true:是、false:否、
creator	string	否	否	创建人
initflag	boolean	否	否	期初标志, true:是、false:否、 示例：true
createTime	string	否	否	创建时间 示例：2020-07-24 20:42:58
createDate	string	否	否	创建日期 示例：2020-07-24
modifier	string	否	否	修改人
modifyTime	string	否	否	修改时间 示例：2020-07-24 20:43:32
modifyDate	string	否	否	修改日期 示例：2020-07-24
auditor	string	否	否	审批人
auditTime	string	否	否	审批时间 示例：2020-07-24 20:42:58
auditDate	string	否	否	审批日期 示例：2020-07-24
pubts	string	否	否	时间戳,格式为:yyyy-MM-dd HH:mm:ss
status	int	否	否	单据状态，由系统业务自动生成，接口无需传值。
_status	string	否	是	操作标识, Insert:新增、Update:更新
period	string	否	否	会计期间
busiaccbook	string	否	否	业务账簿
creatorId	int	否	否	创建人ID
taxCategory	string	否	否	税种ID，或税种code
taxCategory_code	string	否	否	税种编码
taxCategory_name	string	否	否	税种名称
headItem!*	string	否	否	表头固定自定义项，headItem!为固定值，*需要传的自定义项字段，例如headItem!define1 示例："headItem!define8": "111"
ReceiveBill_b	object	是	是	收款明细

## 3. 请求示例

Url: /yonbip/fi/cmpreceivebill/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"code": "CMR00210506000001",
			"accentity": "",
			"accentity_code": "",
			"accentity_name": "",
			"vouchdate": "2021-05-06",
			"customer": "",
			"customer_code": "",
			"customer_name": "",
			"customer_retailInvestors": true,
			"customerbankaccount": "",
			"customerbankaccount_bankAccountName": "",
			"settlemode_code": "",
			"settlemode": "",
			"settlemode_name": "",
			"retailer": "",
			"retailerLineNumber": "",
			"retailerBankType": "",
			"retailerAccountType": "",
			"retailerAccountNo": "",
			"retailerAccountName": "",
			"enterprisebankaccount_code": "",
			"enterprisebankaccount": "",
			"enterprisebankaccount_name": "",
			"cashaccount_code": "",
			"cashaccount": "",
			"cashaccount_name": "",
			"tradetype": "",
			"tradetype_name": "",
			"tradetype_code": "",
			"currency": "",
			"currency_name": "",
			"currency_priceDigit": "",
			"currency_moneyDigit": "",
			"natCurrency": "",
			"natCurrency_name": "",
			"natCurrency_priceDigit": "",
			"exchangeRateType_digit": "",
			"exchangeRateType_name": "",
			"exchangeRateType": "",
			"exchangeRateType_code": "",
			"natCurrency_moneyDigit": "",
			"exchRate": 0,
			"oriSum": 0,
			"natSum": 0,
			"balance": 0,
			"org": "",
			"org_code": "",
			"bookAmount": 0,
			"org_name": "",
			"dept": "",
			"dept_code": "",
			"dept_name": "",
			"operator": "",
			"operator_code": "",
			"operator_name": "",
			"orderno": "",
			"customerbankname": "",
			"invoiceno": "",
			"project": "",
			"project_code": "",
			"project_name": "",
			"expenseitem": "",
			"expenseitem_code": "",
			"expenseitem_name": "",
			"description": "",
			"auditstatus": 0,
			"writeoffstatus": 0,
			"voucherstatus": 0,
			"localbalance": 0,
			"srcitem": 0,
			"srcbillid": "2158317620252928",
			"busiaccbook_name": "",
			"accpurpose": "",
			"accpurpose_name": "",
			"store": "",
			"store_name": "",
			"basebilltype_name": "",
			"billtype": "",
			"supplierbankaccount": "",
			"supplierbankaccount_account": "",
			"supplierbankname": "",
			"signer": "",
			"signer_name": "",
			"signdate": "2021-05-06 14：14：14",
			"employee": "",
			"employee_name": "",
			"staffBankAccount": "",
			"staffBankAccount_account": "",
			"caobject": 0,
			"supplier": "",
			"supplier_code": "",
			"supplier_name": "",
			"redflag": true,
			"creator": "",
			"initflag": true,
			"createTime": "2020-07-24 20:42:58",
			"createDate": "2020-07-24",
			"modifier": "",
			"modifyTime": "2020-07-24 20:43:32",
			"modifyDate": "2020-07-24",
			"auditor": "",
			"auditTime": "2020-07-24 20:42:58",
			"auditDate": "2020-07-24",
			"pubts": "",
			"status": 0,
			"_status": "",
			"period": "",
			"busiaccbook": "",
			"creatorId": 0,
			"taxCategory": "",
			"taxCategory_code": "",
			"taxCategory_name": "",
			"headItem!*": "\"headItem!define8\": \"111\"",
			"ReceiveBill_b": [
				{
					"id": "",
					"mainid": "",
					"quickType": "",
					"quickType_name": "",
					"quickType_code": "",
					"oriSum": 0,
					"natSum": 0,
					"balance": 0,
					"localbalance": 0,
					"bookAmount": 0,
					"supplier": "",
					"supplier_code": "",
					"supplier_name": "",
					"customer": "",
					"customer_code": "",
					"customer_name": "",
					"dept": "",
					"dept_code": "",
					"org_code": "",
					"org": "",
					"org_name": "",
					"dept_name": "",
					"operator": "",
					"operator_code": "",
					"operator_name": "",
					"project": "",
					"project_code": "",
					"project_name": "",
					"orderno": "",
					"description": "",
					"srcbilltype": "",
					"srcbillno": "",
					"srcbillitemno": "",
					"srcbillitemid": "",
					"topsrcbillno": "",
					"topsrcbillitemno": "",
					"pubts": "",
					"hangflag": "",
					"subject": "",
					"delegation": "",
					"expenseitem": "",
					"expenseitem_code": "",
					"expenseitem_name": "",
					"bodyItem!*": "",
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
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回收款单数据
id	string	否	收款单ID
accentity	string	否	会计主体id
accentity_code	string	否	会计主体编码
accentity_name	string	否	会计主体名称
vouchdate	string	否	单据日期
code	string	否	单据编号
customer	string	否	客户id
customer_code	string	否	客户编码
customer_name	string	否	客户名称
customer_retailInvestors	string	否	客户是否散户
customerbankaccount	string	否	付款银行账户id
customerbankaccount_bankAccountName	string	否	付款银行账户
settlemode_code	string	否	结算方式编码
settlemode	string	否	结算方式id
settlemode_name	string	否	结算方式名称
period	string	否	会计期间id
period_code	string	否	会计期间
retailer	string	否	散户
retailerBankType	string	否	散户账户银行类别
retailerLineNumber	string	否	散户账户联行号
retailerAccountType	string	否	散户收款类型
retailerAccountNo	string	否	散户账号
retailerAccountName	string	否	散户账户名称
enterprisebankaccount_code	string	否	收款银行账户编码
enterprisebankaccount	string	否	收款银行账户id
enterprisebankaccount_name	string	否	收款银行账户名称
cashaccount_code	string	否	收款现金账户编码
cashaccount	string	否	收款现金账户id
cashaccount_name	string	否	收款现金账户名称
tradetype	string	否	交易类型id
tradetype_name	string	否	交易类型名称
tradetype_code	string	否	交易类型编码
currency	string	否	币种id
currency_name	string	否	币种名称
currency_priceDigit	string	否	币种单价精度
currency_moneyDigit	string	否	币种金额精度
natCurrency	string	否	本币币种id
natCurrency_name	string	否	本币币种名称
natCurrency_priceDigit	string	否	本币币种单价精度
exchangeRateType_digit	string	否	汇率精度
exchangeRateType_name	string	否	汇率类型名称
exchangeRateType	string	否	汇率类型id
exchangeRateType_code	string	否	汇率类型编码
natCurrency_moneyDigit	string	否	本币币种金额精度
exchRate	long	否	汇率 示例：0
oriSum	long	否	收款金额 示例：0
natSum	long	否	本币金额 示例：0
balance	long	否	余额 示例：0
org_code	string	否	销售组织编码
org	string	否	销售组织id
bookAmount	long	否	预占用金额 示例：0
org_name	string	否	销售组织名称
dept_code	string	否	部门编码
dept	string	否	部门id
dept_name	string	否	部门名称
operator_code	string	否	业务员编码
operator	string	否	业务员id
operator_name	string	否	业务员名称
orderno	string	否	订单编号
customerbankname	string	否	付款银行名称
invoiceno	string	否	票据号
project_code	string	否	项目编码
project	string	否	项目id
project_name	string	否	项目名称
description	string	否	备注
auditstatus	string	否	审批状态, 1:已审批、2:未审批、
writeoffstatus	string	否	核销状态, 1:已核销、2:未核销、3:部分核销、
voucherstatus	string	否	凭证状态, 3:已接收未生成、4:不生成、1:已生成、2:未生成、
localbalance	long	否	本币余额 示例：0
srcitem	string	否	事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、
srcbillid	string	否	来源单据id
busiaccbook	string	否	业务账簿id
busiaccbook_name	string	否	业务账簿名称
accpurpose	string	否	核算目的id
accpurpose_name	string	否	核算目的名称
store	string	否	门店id
store_name	string	否	门店名称
basebilltype	string	否	事项类型id
basebilltype_name	string	否	事项类型名称
billtype	string	否	收付事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
supplierbankname	string	否	收款银行名称
signer	string	否	签字人ID
signer_name	string	否	签字人名称
signdate	string	否	签字日期
caobject	string	否	收付款对象类型, 4:其他、1:客户、2:供应商、3:人员、
srcflag	string	否	来源标识
supplier	string	否	供应商id
supplier_name	string	否	供应商名称
srctypeflag	string	否	来源类型标识
employee	string	否	员工id
employee_name	string	否	员工名称
redflag	string	否	是否红冲, true:是、false:否、
creator	string	否	创建人
initflag	string	否	期初标志, true:是、false:否、
createTime	string	否	创建时间
createDate	string	否	创建日期
modifier	string	否	修改人
modifyTime	string	否	修改时间
modifyDate	string	否	修改日期
auditor	string	否	审批人
auditTime	string	否	审批时间
auditDate	string	否	审批日期
pubts	string	否	时间戳,格式为:yyyy-MM-dd HH:mm:ss
status	string	否	单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、
tenant	string	否	租户ID
settlestatus	string	否	结算状态，1：未结算，2：已结算
yTenantId	string	否	租户别名
ReceiveBill_b	object	是	收款单明细

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": "",
		"accentity": "",
		"accentity_code": "",
		"accentity_name": "",
		"vouchdate": "",
		"code": "",
		"customer": "",
		"customer_code": "",
		"customer_name": "",
		"customer_retailInvestors": "",
		"customerbankaccount": "",
		"customerbankaccount_bankAccountName": "",
		"settlemode_code": "",
		"settlemode": "",
		"settlemode_name": "",
		"period": "",
		"period_code": "",
		"retailer": "",
		"retailerBankType": "",
		"retailerLineNumber": "",
		"retailerAccountType": "",
		"retailerAccountNo": "",
		"retailerAccountName": "",
		"enterprisebankaccount_code": "",
		"enterprisebankaccount": "",
		"enterprisebankaccount_name": "",
		"cashaccount_code": "",
		"cashaccount": "",
		"cashaccount_name": "",
		"tradetype": "",
		"tradetype_name": "",
		"tradetype_code": "",
		"currency": "",
		"currency_name": "",
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"natCurrency": "",
		"natCurrency_name": "",
		"natCurrency_priceDigit": "",
		"exchangeRateType_digit": "",
		"exchangeRateType_name": "",
		"exchangeRateType": "",
		"exchangeRateType_code": "",
		"natCurrency_moneyDigit": "",
		"exchRate": 0,
		"oriSum": 0,
		"natSum": 0,
		"balance": 0,
		"org_code": "",
		"org": "",
		"bookAmount": 0,
		"org_name": "",
		"dept_code": "",
		"dept": "",
		"dept_name": "",
		"operator_code": "",
		"operator": "",
		"operator_name": "",
		"orderno": "",
		"customerbankname": "",
		"invoiceno": "",
		"project_code": "",
		"project": "",
		"project_name": "",
		"description": "",
		"auditstatus": "",
		"writeoffstatus": "",
		"voucherstatus": "",
		"localbalance": 0,
		"srcitem": "",
		"srcbillid": "",
		"busiaccbook": "",
		"busiaccbook_name": "",
		"accpurpose": "",
		"accpurpose_name": "",
		"store": "",
		"store_name": "",
		"basebilltype": "",
		"basebilltype_name": "",
		"billtype": "",
		"supplierbankname": "",
		"signer": "",
		"signer_name": "",
		"signdate": "",
		"caobject": "",
		"srcflag": "",
		"supplier": "",
		"supplier_name": "",
		"srctypeflag": "",
		"employee": "",
		"employee_name": "",
		"redflag": "",
		"creator": "",
		"initflag": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"pubts": "",
		"status": "",
		"tenant": "",
		"settlestatus": "",
		"yTenantId": "",
		"ReceiveBill_b": [
			{
				"mainid": "",
				"quickType": "",
				"oriSum": 0,
				"natSum": 0,
				"balance": 0,
				"localbalance": 0,
				"bookAmount": 0,
				"customer": "",
				"customer_code": "",
				"customer_name": "",
				"dept": "",
				"dept_code": "",
				"org_code": "",
				"org": "",
				"org_name": "",
				"dept_name": "",
				"operator": "",
				"operator_code": "",
				"operator_name": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"orderno": "",
				"description": "",
				"srcbilltype": "",
				"srcbillno": "",
				"srcbillitemno": "",
				"srcbillitemid": "",
				"topsrcbillno": "",
				"topsrcbillitemno": "",
				"id": "",
				"pubts": "",
				"hangflag": "",
				"subject": "",
				"delegation": "",
				"expenseitem": "",
				"expenseitem_code": "",
				"expenseitem_name": ""
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
999	银行账户和现金账户不能同时有值。	银行账户和现金账户只能录入一个

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

