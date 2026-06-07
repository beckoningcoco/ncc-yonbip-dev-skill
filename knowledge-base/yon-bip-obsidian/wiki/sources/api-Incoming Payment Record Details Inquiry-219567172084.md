---
title: "费用报账单详情查询"
apiId: "2195671720843018241"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Incoming Payment Record"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Incoming Payment Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用报账单详情查询

>  请求方式	GET | Incoming Payment Record (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/financial/apply/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	单据ID
code	string	query	否	单据编码

## 3. 请求示例

Url: /yonbip/sd/financial/apply/detail?access_token=访问令牌&id=&code=

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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	状态码 示例：200
message	string	否	消息提示 示例：操作成功
data	object	否	业务数据
id	long	否	报账单主键id
code	string	否	报账单号
pubts	string	否	时间戳(示例：2022-08-23 13:53:59）
orgId	string	否	销售组织id
orgId_Code	string	否	销售组织编码
orgId_Name	string	否	销售组织名称
transType	string	否	交易类型id
transType_Name	string	否	交易类型名称
transType_Code	string	否	交易类型编码
accountingOrg	string	否	会计主体id
accountingOrg_Name	string	否	会计主体名称
accountingOrg_Code	string	否	会计主体编码
accountingPeriod	string	否	费用期间id
accountingPeriod_Name	string	否	费用期间名称
accountingPeriod_Code	string	否	费用期间编码
currency	string	否	币种id
currency_Code	string	否	币种编码
currency_Name	string	否	币种名称
applicant	string	否	申请人id
applicant_Name	string	否	申请人名称
applicant_Code	string	否	申请人编码
creator	string	否	制单人
createDate	string	否	制单日期
createTime	string	否	制单时间
modifier	string	否	最近修改人
modifyTime	string	否	最近修改时间
department	string	否	所属部门id
department_Name	string	否	所属部门名称
department_Code	string	否	所属部门编码
region	string	否	所属区域id
region_Name	string	否	所属区域名称
region_Code	string	否	所属区域编码
financialAmountTotal	BigDecimal	否	报账金额合计
approveAmountTotal	BigDecimal	否	批复金额合计
budgetOverFlag	boolean	否	是否超预算
financialApplyInfos	object	是	费用报账单详情
financialSupplyInfos	object	否	报账单货补明细
financialApplyTotalInfo	object	否	费用报账汇总

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 0,
		"code": "",
		"pubts": "",
		"orgId": "",
		"orgId_Code": "",
		"orgId_Name": "",
		"transType": "",
		"transType_Name": "",
		"transType_Code": "",
		"accountingOrg": "",
		"accountingOrg_Name": "",
		"accountingOrg_Code": "",
		"accountingPeriod": "",
		"accountingPeriod_Name": "",
		"accountingPeriod_Code": "",
		"currency": "",
		"currency_Code": "",
		"currency_Name": "",
		"applicant": "",
		"applicant_Name": "",
		"applicant_Code": "",
		"creator": "",
		"createDate": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"department": "",
		"department_Name": "",
		"department_Code": "",
		"region": "",
		"region_Name": "",
		"region_Code": "",
		"financialAmountTotal": 0,
		"approveAmountTotal": 0,
		"budgetOverFlag": true,
		"financialApplyInfos": [
			{
				"lineNo": 0,
				"id": 0,
				"financialApplyId": "",
				"pubts": "",
				"dimension_expense_item": "",
				"dimension_expense_item_Name": "",
				"dimension_expense_item_Code": "",
				"dimension_expense_itemType": "",
				"dimension_expense_itemType_Name": "",
				"dimension_expense_itemType_Code": "",
				"settlementType": "",
				"settle_customer": "",
				"settle_customer_Code": "",
				"settle_customer_Name": "",
				"settle_vendor": "",
				"settle_vendor_Name": "",
				"settle_vendor_Code": "",
				"settle_person": "",
				"settle_person_Name": "",
				"settle_person_Code": "",
				"settle_scattered": "",
				"bankInfo": "",
				"bankInfo_Name": "",
				"bankAccount": "",
				"payMode": "",
				"financialAmount": 0,
				"settleAmount": 0,
				"approveAmount": 0,
				"rejectReason": "",
				"dimension_region": "",
				"dimension_region_Name": "",
				"payAbleAmount": 0,
				"payAbleFinancialAmount": 0,
				"taxAmount": 0,
				"taxExcludedAmount": 0,
				"taxRate": "",
				"taxRate_Code": "",
				"taxRate_Name": "",
				"taxRate_ntaxrate": "",
				"assumeOrg": "",
				"assumeOrg_Name": "",
				"asumeDept": "",
				"asumeDept_Name": "",
				"payResult": "",
				"payAmount": 0,
				"unpayAmount": 0,
				"syncDefaultReason": "",
				"accountingPeriod": "",
				"accountingPeriod_Name": "",
				"product": "",
				"product_Name": "",
				"product_Code": "",
				"unit": "",
				"unit_Name": "",
				"quality": 0,
				"returnQuantity": 0,
				"validStartDate": "",
				"validEndDate": "",
				"accountUsageRule": "",
				"accountUsageRule_Name": "",
				"supply_distributor": "",
				"supply_distributor_Name": "",
				"shareUseRebate": true,
				"shareOrgRebate": true,
				"sourceBillType": "",
				"sourceBillCode": "",
				"sourceBill_lineNo": "",
				"SettleMethod": "",
				"SettleMethod_Name": "",
				"bdInvoiceType": "",
				"bdInvoiceType_Name": "",
				"bdInvoiceType_Code": "",
				"invoiceStatus": "",
				"invoiceVerifiAmount": 0,
				"invoiceTitleType": "",
				"invoiceTitle": "",
				"taxIdentfNum": "",
				"invoiceTelephone": "",
				"invoiceAddress": "",
				"invoiceCustomer": "",
				"invoiceCustomer_Name": "",
				"invoiceCustomer_Code": "",
				"ExchangeRateType": "",
				"oriBillNo": "",
				"oriBillId": "",
				"settlementApply": 0,
				"settlementApplyInfo": 0,
				"sourceid": 0,
				"sourceautoid": "",
				"makeRuleCode": ""
			}
		],
		"financialSupplyInfos": {
			"dimension_expense_item": "",
			"dimension_expense_item_Name": "",
			"dimension_expense_itemType": "",
			"dimension_expense_item_Code": "",
			"dimension_expense_itemType_Name": "",
			"settle_customer": "",
			"settle_customer_Name": "",
			"settle_customer_Code": "",
			"productSKU": "",
			"productSKU_Code": "",
			"productSKU_Name": "",
			"product": "",
			"product_Code": "",
			"product_Name": "",
			"productClass": "",
			"productClass_Name": "",
			"unit": "",
			"unit_Name": "",
			"quantity": 0,
			"unitPrice": 0,
			"amount": 0,
			"payMode": "",
			"marketingActivity_Code": "",
			"applylineNo": "",
			"productLine": "",
			"productLine_Name": "",
			"productLine_Code": "",
			"productBrand": "",
			"productBrand_Name": "",
			"productBrand_Code": "",
			"id": 0,
			"financialApplyId": 0
		},
		"financialApplyTotalInfo": {
			"dimension_expense_item": "",
			"dimension_expense_item_Name": "",
			"dimension_expense_item_Code": "",
			"settlementType": "",
			"payMode": "",
			"settle_customer": "",
			"settle_customer_Name": "",
			"settle_customer_Code": "",
			"settle_vendor": "",
			"settle_vendor_Name": "",
			"settle_vendor_Code": "",
			"settle_person": "",
			"settle_person_Name": "",
			"settle_person_Code": "",
			"settle_scattered": "",
			"financialTotalAmount": 0,
			"approveTotalAmount": 0,
			"financialApplyId": 0
		}
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
999	错误信息	请重新修改参数

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

