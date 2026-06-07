---
title: "混合云BIP供应链采购发票同步ERP采购发票"
apiId: "1759436677292490759"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# 混合云BIP供应链采购发票同步ERP采购发票

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/connectorInvoices
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
purchaseOrg	string	header	否	路由
Body参数
名称	类型	数组	必填	描述
needBusinessData	boolean	否	否	是否需要业务数据
needRetObj	boolean	否	否	是否需要retObj
id	string	否	否	发票id
modifierId_yth	string	否	否	变更人userid
auditorId_yth	string	否	否	审核人userid
closerId_yth	string	否	否	关闭人userid
creatorId_yth	string	否	否	创建人userid
currency_priceDigit	float	否	否	币种单价精度
inInvoiceOrg	string	否	是	收票组织id
org	string	否	是	采购组织id
inInvoiceOrg_name	string	否	否	收票组织
exchRateType_name	string	否	否	汇率类型
department_name	string	否	否	采购部门name
code	string	否	否	采购发票code
vouchdate	string	否	是	单据日期
invoiceVendor_name	string	否	否	供货供应商vendor
natCurrency_name	string	否	否	本币name
memo	string	否	否	备注
bustype	string	否	是	交易类型id
invoiceType	int	否	否	发票类型
bdInvoiceTypeCode	int	否	否	发票类型档案
vendor	string	否	是	供货供应商id
retailInvestors	boolean	否	否	是否散户
contact	string	否	否	供方联系人
contactTel	string	否	否	供方联系人手机
invoiceVendor	string	否	是	开票供应商id
bustype_name	string	否	否	交易类型name
modifier	string	否	否	修改人
modifierId	string	否	否	修改人id
modifyDate	string	否	否	修改日期
currency	string	否	是	币种id
department	string	否	否	采购部门
currency_code	string	否	否	币种简称
exchRateType	string	否	是	汇率类型id
exchRateType_Digit	float	否	否	汇率类型精度
exchRate	float	否	是	汇率
natCurrency	string	否	是	本币id
natCurrency_code	string	否	否	本币简称
status	float	否	否	单据状态
taxRate	float	否	否	税率
accountDate	string	否	否	立账日
maturityDate	string	否	否	到期日
isInvBack	boolean	否	否	红字发票
isBeginning	boolean	否	是	期初发票
invVendorAccount	string	否	否	开票供应商银行账号
invVendorBank	string	否	否	开票供应商银行名称
totalQuantity	float	否	否	整单数量
modifyTime	string	否	否	修改时间
oriSum	float	否	否	含税金额
oriMoney	float	否	否	无税金额
oriTax	float	否	否	税额
masterOrgKeyField	string	否	否	主组织
natSum	float	否	否	本币含税金额
natCurrency_priceDigit	float	否	否	本币单价精度
currency_moneyDigit	float	否	否	币种金额精度
natCurrency_moneyDigit	float	否	否	本币金额精度
natMoney	float	否	否	本币无税金额
natTax	float	否	否	本币税额
creator	string	否	否	创建人
currency_name	string	否	否	币种
createTime	string	否	否	创建时间
createDate	string	否	否	创建日期
creatorId	int	否	否	创建者id
srcBill	int	否	否	来源单据ID
srcBillNO	string	否	否	来源单据号
source	string	否	否	来源单据类型
smallTaxpayer	int	否	否	小规模纳税人
isWfControlled	boolean	否	否	是否审批流控制
vendor_name	string	否	否	供货供应商
pubts	string	否	否	时间戳
isFlowCoreBill	boolean	否	否	是否流程核心单据
org_name	string	否	否	采购组织
bizFlow	string	否	否	流程ID
bizFlow_name	string	否	否	流程名称
bizFlow_version	string	否	否	版本信息
returncount	int	否	否	退回次数
purInvoices	object	是	是	发票子表
id	string	否	否	发票子表id
yuncaiOrderId	string	否	否	云采发票主键
yuncaiOrderBId	string	否	否	云采发票行主键
yuncaiOrderCode	string	否	否	云采发票编码
taxitems	string	否	否	税目id
_status	string	否	是	Insert
erpPurinrecordsId	string	否	否	erp入库单子表ID
erpPurinrecordId	string	否	否	erp入库单主表ID
purUOM_Precision	float	否	否	采购单位精度
source	string	否	否	来源单据类型
makeRuleCode	string	否	否	生单规则编号
productsku_cName	string	否	否	物料skuname
unit_Name	string	否	否	主计量名称
upcode	string	否	否	来源单据号
priceUOM_Name	string	否	否	计价单位名称
sourceautoid	int	否	否	来源单据子表id
sourceid	float	否	否	来源单据id
mainid	float	否	否	发票主表id
virtualProductAttribute	float	否	否	虚拟物料类型
taxRate	float	否	否	税率
purUOM_Name	string	否	否	采购单位名称
expenseSource	string	否	否	费用来源单据类型
expenseSrcBillNO	string	否	否	费用来源单据号
expenseSourceid	int	否	否	费用来源单据ID
expenseUpLineno	string	否	否	费用来源单据行号
expenseUpLineid	int	否	否	费用来源单据行ID
isUpdateCost	boolean	否	否	影响成本
product	string	否	是	物料id
product_cCode	string	否	否	物料编码
priceUOM_Precision	float	否	否	计价单位精度描述
project_code	string	否	否	项目名称
productsku	string	否	否	物料sku
productsku_cCode	string	否	否	物料skucode
rowno	float	否	否	行号
unit	string	否	是	主计量id
oriUnitPrice	float	否	是	无税单价
oriTaxUnitPrice	float	否	是	含税单价
oriMoney	float	否	是	无税金额
oriSum	float	否	是	含税金额
sourceProDescFlag	string	否	否	来源描述物料标识
memo	string	否	否	备注
oriTax	float	否	否	税额
taxitems_code	string	否	是	税目税率id
natUnitPrice	float	否	是	本币无税单价
natTaxUnitPrice	float	否	是	本币含税单价
natMoney	float	否	是	本币无税金额
natSum	float	否	是	本币含税金额
natTax	float	否	是	本币税额
qty	float	否	是	数量
unit_Precision	float	否	否	主计量精度
subQty	float	否	是	采购数量
invExchRate	float	否	是	采购换算率
purUOM	string	否	是	采购单位id
purUOM_Code	string	否	否	采购单位编码
priceQty	float	否	是	计价数量
invPriceExchRate	float	否	是	计价换算率
priceUOM	string	否	是	计价单位id
priceUOM_Code	string	否	否	计价单位编码
product_cName	string	否	否	物料名称
receiptDocEntryAndMgmt	string	否	否	立账方式
unit_Code	string	否	否	主计量编码
srcPOID	float	否	否	来源订单id
accountOrg_name	string	否	否	会计主体
srcPOLineID	float	否	否	来源订单行id
srcPOCode	string	否	否	来源订单号
inOrg	string	否	是	收货组织id
accountOrg	string	否	是	会计主体id
unitExchangeType	float	否	是	采购单位转换率的换算方式
unitExchangeTypePrice	float	否	是	计价单位转换率的换算方式
isGiftProduct	boolean	否	否	是否是赠品
firstsourceid	float	否	否	源头单据主表id
maxLimitPrice	float	否	否	最高限价
firstsourceautoid	float	否	否	源头单据子表id
firstsource	string	否	否	源头单据类型
firstupcode	string	否	否	源头单据号
realProductAttribute	string	否	否	物料属性
realProductAttributeType	string	否	否	实物商品属性
discountTaxType	String	否	否	扣税类别
costedMoney	float	否	是	计成本金额
demandOrg	string	否	是	需求组织id
expenseItemId	string	否	否	费用项目id
pubts	string	否	否	时间戳
isBatchManage	boolean	否	否	是否批次管理
priceHaveTax	int	否	否	价格标识
unDeductTax	float	否	否	不可抵扣税额
proDescFlag	string	否	否	描述物料标识
creditStatus	float	否	否	凭证状态
demandOrg_name	string	否	否	需求组织
unDeductTaxRate	float	否	否	不可抵扣税率
inOrg_name	string	否	否	收货组织name
expenseItemId_code	string	否	否	费用项目编码
paymentSchedules	object	是	否	付款计划子表
fixAccoutDateTime	string	否	否	出账日
amount	string	否	否	应付金额
accountType	string	否	否	账期类型
payRatio	string	否	否	付款比例
isAdvancePay	string	否	否	预付款
delayMonth	string	否	否	起算日延迟月
fixAccoutDayOne	string	否	否	固定出账日1
number	string	否	否	期号
payNatMoney	string	否	否	本币应付金额
accountUnit	string	否	否	账期单位
accountDay	string	否	否	账期
startDate_name	string	否	否	起算时点
startDateTime	string	否	否	起算日
sourceType	string	否	否	起算时点是否预制
expiringDateTime	string	否	否	到期日
fixExpireDayOne	string	否	否	固定到期日1
name	string	否	否	付款名称
id	string	否	否	子表id
delayDay	string	否	否	起算日延迟日
mainid	string	否	否	主表id
pubts	string	否	否	时间戳
startDate	string	否	否	起算时点id
_status	string	否	是	Insert
vendorTaxReceipt	object	是	否	供应商税票子表
taxInvoiceCode	string	否	否	发票号码
taxInvoiceDate	string	否	否	开票日期
invoiceCode	string	否	否	发票代码
invoiceAmount	float	否	否	发票金额
invoiceTitle	string	否	否	发票抬头
invoiceCheckCode	string	否	否	发票校验码
sellName	string	否	否	销售方名称
priceTaxTotal	float	否	否	价税合计
resubmitCheckKey	string	否	是	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
erpbiztype	string	否	是	外部单据来源类型

## 3. 请求示例

Url: /yonbip/cpu/connectorInvoices?access_token=访问令牌
Header: 
	purchaseOrg : ""
Body: [{
	"needBusinessData": true,
	"needRetObj": true,
	"id": "",
	"modifierId_yth": "",
	"auditorId_yth": "",
	"closerId_yth": "",
	"creatorId_yth": "",
	"currency_priceDigit": 0,
	"inInvoiceOrg": "",
	"org": "",
	"inInvoiceOrg_name": "",
	"exchRateType_name": "",
	"department_name": "",
	"code": "",
	"vouchdate": "",
	"invoiceVendor_name": "",
	"natCurrency_name": "",
	"memo": "",
	"bustype": "",
	"invoiceType": 0,
	"bdInvoiceTypeCode": 0,
	"vendor": "",
	"retailInvestors": true,
	"contact": "",
	"contactTel": "",
	"invoiceVendor": "",
	"bustype_name": "",
	"modifier": "",
	"modifierId": "",
	"modifyDate": "",
	"currency": "",
	"department": "",
	"currency_code": "",
	"exchRateType": "",
	"exchRateType_Digit": 0,
	"exchRate": 0,
	"natCurrency": "",
	"natCurrency_code": "",
	"status": 0,
	"taxRate": 0,
	"accountDate": "",
	"maturityDate": "",
	"isInvBack": true,
	"isBeginning": true,
	"invVendorAccount": "",
	"invVendorBank": "",
	"totalQuantity": 0,
	"modifyTime": "",
	"oriSum": 0,
	"oriMoney": 0,
	"oriTax": 0,
	"masterOrgKeyField": "",
	"natSum": 0,
	"natCurrency_priceDigit": 0,
	"currency_moneyDigit": 0,
	"natCurrency_moneyDigit": 0,
	"natMoney": 0,
	"natTax": 0,
	"creator": "",
	"currency_name": "",
	"createTime": "",
	"createDate": "",
	"creatorId": 0,
	"srcBill": 0,
	"srcBillNO": "",
	"source": "",
	"smallTaxpayer": 0,
	"isWfControlled": true,
	"vendor_name": "",
	"pubts": "",
	"isFlowCoreBill": true,
	"org_name": "",
	"bizFlow": "",
	"bizFlow_name": "",
	"bizFlow_version": "",
	"returncount": 0,
	"purInvoices": [
		{
			"id": "",
			"yuncaiOrderId": "",
			"yuncaiOrderBId": "",
			"yuncaiOrderCode": "",
			"taxitems": "",
			"_status": "",
			"erpPurinrecordsId": "",
			"erpPurinrecordId": "",
			"purUOM_Precision": 0,
			"source": "",
			"makeRuleCode": "",
			"productsku_cName": "",
			"unit_Name": "",
			"upcode": "",
			"priceUOM_Name": "",
			"sourceautoid": 0,
			"sourceid": 0,
			"mainid": 0,
			"virtualProductAttribute": 0,
			"taxRate": 0,
			"purUOM_Name": "",
			"expenseSource": "",
			"expenseSrcBillNO": "",
			"expenseSourceid": 0,
			"expenseUpLineno": "",
			"expenseUpLineid": 0,
			"isUpdateCost": true,
			"product": "",
			"product_cCode": "",
			"priceUOM_Precision": 0,
			"project_code": "",
			"productsku": "",
			"productsku_cCode": "",
			"rowno": 0,
			"unit": "",
			"oriUnitPrice": 0,
			"oriTaxUnitPrice": 0,
			"oriMoney": 0,
			"oriSum": 0,
			"sourceProDescFlag": "",
			"memo": "",
			"oriTax": 0,
			"taxitems_code": "",
			"natUnitPrice": 0,
			"natTaxUnitPrice": 0,
			"natMoney": 0,
			"natSum": 0,
			"natTax": 0,
			"qty": 0,
			"unit_Precision": 0,
			"subQty": 0,
			"invExchRate": 0,
			"purUOM": "",
			"purUOM_Code": "",
			"priceQty": 0,
			"invPriceExchRate": 0,
			"priceUOM": "",
			"priceUOM_Code": "",
			"product_cName": "",
			"receiptDocEntryAndMgmt": "",
			"unit_Code": "",
			"srcPOID": 0,
			"accountOrg_name": "",
			"srcPOLineID": 0,
			"srcPOCode": "",
			"inOrg": "",
			"accountOrg": "",
			"unitExchangeType": 0,
			"unitExchangeTypePrice": 0,
			"isGiftProduct": true,
			"firstsourceid": 0,
			"maxLimitPrice": 0,
			"firstsourceautoid": 0,
			"firstsource": "",
			"firstupcode": "",
			"realProductAttribute": "",
			"realProductAttributeType": "",
			"discountTaxType": "",
			"costedMoney": 0,
			"demandOrg": "",
			"expenseItemId": "",
			"pubts": "",
			"isBatchManage": true,
			"priceHaveTax": 0,
			"unDeductTax": 0,
			"proDescFlag": "",
			"creditStatus": 0,
			"demandOrg_name": "",
			"unDeductTaxRate": 0,
			"inOrg_name": "",
			"expenseItemId_code": ""
		}
	],
	"paymentSchedules": [
		{
			"fixAccoutDateTime": "",
			"amount": "",
			"accountType": "",
			"payRatio": "",
			"isAdvancePay": "",
			"delayMonth": "",
			"fixAccoutDayOne": "",
			"number": "",
			"payNatMoney": "",
			"accountUnit": "",
			"accountDay": "",
			"startDate_name": "",
			"startDateTime": "",
			"sourceType": "",
			"expiringDateTime": "",
			"fixExpireDayOne": "",
			"name": "",
			"id": "",
			"delayDay": "",
			"mainid": "",
			"pubts": "",
			"startDate": ""
		}
	],
	"_status": "",
	"vendorTaxReceipt": [
		{
			"taxInvoiceCode": "",
			"taxInvoiceDate": "",
			"invoiceCode": "",
			"invoiceAmount": 0,
			"invoiceTitle": "",
			"invoiceCheckCode": "",
			"sellName": "",
			"priceTaxTotal": 0
		}
	],
	"resubmitCheckKey": "",
	"erpbiztype": ""
}]

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
result	string	否	返回状态

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"result": ""
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

