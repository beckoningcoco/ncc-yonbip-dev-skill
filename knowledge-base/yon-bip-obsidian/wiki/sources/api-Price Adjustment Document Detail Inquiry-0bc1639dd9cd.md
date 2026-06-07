---
title: "调价单详情查询"
apiId: "0bc1639dd9cd4f53a422270bba654b8a"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Price Adjustment Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 调价单详情查询

>  请求方式	GET | Price Adjustment Document (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricing/adjustment/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	调价单id    示例: 2264229101637888

## 3. 请求示例

Url: /yonbip/sd/pricing/adjustment/detail?access_token=访问令牌&id=2264229101637888

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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
id	string	否	单据id
creationOrgId	string	否	销售组织ID
creationOrgId_name	string	否	销售组织名称
code	string	否	编号
name	object	否	名称
description	string	否	调价单描述
priceTemplateId	string	否	价格模版id
priceTemplateId_name	string	否	价格模版名称
status	short	否	单据状态(0：开立，1：已审核，2：已关闭，3：审核中，4：锁定中)
isWfControlled	boolean	否	是否审批流控制（是：true，否：false）
verifystate	short	否	审批状态(0：开立，1：提交中，3：已审核)
beginDate	string	否	开始日期
creator	string	否	制单人
endDate	string	否	结束日期
createTime	string	否	创建时间
createDate	string	否	创建日期
creatorId	string	否	创建人
modifierId	string	否	修改人id
modifyDate	string	否	修改日期
modifier	string	否	修改人
modifyTime	string	否	修改时间
adjustDetails	object	是	调价单记录信息[marketing.price.PriceAdjustDetail]
adjustscopes	object	是	调价单适应范围[marketing.price.PriceAdjustScope]

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": "",
		"creationOrgId": "",
		"creationOrgId_name": "",
		"code": "",
		"name": {
			"zh_CN": "",
			"en_US": "",
			"zh_TW": ""
		},
		"description": "",
		"priceTemplateId": "",
		"priceTemplateId_name": "",
		"status": 0,
		"isWfControlled": true,
		"verifystate": 0,
		"beginDate": "",
		"creator": "",
		"endDate": "",
		"createTime": "",
		"createDate": "",
		"creatorId": "",
		"modifierId": "",
		"modifyDate": "",
		"modifier": "",
		"modifyTime": "",
		"adjustDetails": [
			{
				"priceTypeId_name": "",
				"description": "",
				"id": "",
				"weight_sub": 0,
				"weight": 0,
				"volume_sub": 0,
				"volume": 0,
				"priceTypeId": "",
				"length_sub": 0,
				"length": 0,
				"width_sub": 0,
				"width": 0,
				"height_sub": 0,
				"height": 0,
				"placeOrigin": "",
				"priceAdjustmentId": "",
				"generateVendor": "",
				"taxCategory": "",
				"agentIndustryId": "",
				"dimension": {
					"agentId": "",
					"agentClassId": "",
					"agentLevelId": "",
					"agentAreaId": "",
					"productId": "",
					"skuId": "",
					"productClassId": "",
					"materialClassId": "",
					"free1": "",
					"free2": "",
					"free3": "",
					"free4": "",
					"free5": "",
					"free6": "",
					"free7": "",
					"free8": "",
					"free9": "",
					"free10": "",
					"priceAdjustDetailId": "",
					"priceAdjustmentId": "",
					"id": ""
				},
				"businessWorker": "",
				"enterpriseType": "",
				"agentIndustryId_name": "",
				"agentId_name": "",
				"businessModel": "",
				"productType": "",
				"paymentMode": "",
				"customerType": "",
				"agentClassId_name": "",
				"customerType_name": "",
				"agentCountry": "",
				"agentCountry_name": "",
				"timezone": "",
				"agentLevelId_name": "",
				"timezone_name": "",
				"language": "",
				"language_name": "",
				"enterpriseProperty": "",
				"agentAreaId_name": "",
				"enterpriseProperty_name": "",
				"productLine": "",
				"productLine_name": "",
				"productBrand": "",
				"productId_name": "",
				"productBrand_name": "",
				"costClassification": "",
				"costClassification_name": "",
				"incomeTaxRate": "",
				"skuId_name": "",
				"incomeTaxRate_name": "",
				"outputRate": "",
				"dimension_specName": "",
				"outputRate_name": "",
				"materialClassId_name": "",
				"tradeType": "",
				"productClassId_name": "",
				"tradeType_name": "",
				"inventoryOrg": "",
				"inventoryOrg_name": "",
				"saleDepartment": "",
				"saleDepartment_name": "",
				"salesman": "",
				"salesman_name": "",
				"originalCurrency": "",
				"originalCurrency_name": "",
				"exchangeRateType": "",
				"exchangeRateType_name": "",
				"clearingForm": "",
				"clearingForm_name": "",
				"shippingMethod": "",
				"shippingMethod_name": "",
				"billingOrg": "",
				"billingOrg_name": "",
				"paymentAgreement": "",
				"paymentAgreement_name": "",
				"project": "",
				"project_name": "",
				"priceDigit": "",
				"unit_Precision": "",
				"priceTypeCode": "",
				"amountUnit": "",
				"adjustGradients_amountFloor": 0,
				"amountUnit_name": "",
				"adjustGradients_price": 0,
				"price": 0,
				"priceUnit": "",
				"priceUnit_name": "",
				"isLadderPrice": true,
				"beginDate": "",
				"endDate": ""
			}
		],
		"adjustscopes": [
			{
				"id": "",
				"bizType": "",
				"bizId": "",
				"bizId_name": "",
				"saleOrgId": "",
				"saleOrgId_name": "",
				"distributed": ""
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
999	错误信息	

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

