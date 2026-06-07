---
title: "调价单上传"
apiId: "99c07ba3cca940839395ac6fc71f3a2f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Adjustment Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 调价单上传

>  请求方式	POST | Price Adjustment Document (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricing/adjustment/save
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
data	object	否	是	请求数据
id	long	否	否	调价单id（更新操作时必填） 示例：2356529077768448
_status	string	否	是	操作标识, Insert:新增、 Update:更新 示例：Insert
priceTemplateId_name	string	否	是	价格模板code，或价格模板id 示例：2336580822176000
beginDate	DateTime	否	是	开始日期 示例：2020-01-01 00:00:00
endDate	DateTime	否	否	结束日期（不录入时，默认时间为9999-12-31 23:59:59） 示例：9999-12-31 23:59:59
creationOrgId_name	string	否	是	销售组织code，或销售组织id 示例：1951523035419392
code	string	否	否	调价单编码 示例：PA-93920112
name	string	否	是	调价单名称 示例：rfwe
description	string	否	否	描述
adjustDetails	object	是	是	调价单详情
adjustscopes	object	是	否	适用范围（新增时，不必填；变更时必填）

## 3. 请求示例

Url: /yonbip/sd/pricing/adjustment/save?access_token=访问令牌
Body: {
	"data": {
		"id": 2356529077768448,
		"_status": "Insert",
		"priceTemplateId_name": "2336580822176000",
		"beginDate": "2020-01-01 00:00:00",
		"endDate": "9999-12-31 23:59:59",
		"creationOrgId_name": "1951523035419392",
		"code": "PA-93920112",
		"name": "rfwe",
		"description": "",
		"adjustDetails": [
			{
				"id": 0,
				"_status": "",
				"priceTypeId_name": "",
				"beginDate": "2020-01-01 00:00:00",
				"endDate": "2020-01-02 00:00:00",
				"priceUnit_name": "",
				"adjustGradients_price": 0,
				"adjustGradients_amountFloor": "",
				"amountUnit_name": "",
				"dimension!skuId_name": "",
				"dimension!productId_name": "",
				"dimension!agentId_name": "",
				"dimension!agentLevelId_name": "",
				"dimension!productClassId_name": "",
				"dimension!productBrand_name": "",
				"dimension!productLine_name": "",
				"dimension!agentAreaId_name": "",
				"dimension!agentIndustryId_name": "",
				"dimension!agentCountry_name": "",
				"dimension!customerType_name": "",
				"dimension!enterpriseProperty_name": "",
				"dimension!costClassification_name": "",
				"dimension!materialClassId_name": "",
				"dimension!incomeTaxRate_name": "",
				"dimension!outputRate_name": "",
				"dimension!inventoryOrg_name": "",
				"dimension!tradeType_name": "",
				"dimension!billingOrg_name": "",
				"dimension!saleDepartment_name": "",
				"dimension!salesman_name": "",
				"dimension!exchangeRateType_name": "",
				"dimension!clearingForm_name": "",
				"dimension!shippingMethod_name": "",
				"dimension!paymentAgreement_name": "",
				"dimension!project_name": "",
				"dimension!channelAgentLevel_name": "",
				"dimension!store_name": "",
				"dimension!businessWorker": 0,
				"dimension!enterpriseType": 0,
				"dimension!businessModel": 0,
				"dimension!paymentMode": "",
				"dimension!productType": 0,
				"dimension!taxCategory": "",
				"weight": 0,
				"weight_sub": 0,
				"volume": 0,
				"volume_sub": 0,
				"length": 0,
				"length_sub": 0,
				"width": 0,
				"width_sub": 0,
				"height": 0,
				"height_sub": 0,
				"dimension!placeOrigin": "",
				"dimension!generateVendor": "",
				"dimension!agentClassId_name": ""
			}
		],
		"adjustscopes": [
			{
				"id": 0,
				"bizType": 1,
				"bizId_name": "",
				"saleOrgId_name": "2156833972277760",
				"_status": ""
			}
		]
	}
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	long	否	状态码 示例：200
message	string	否	操作信息 示例：操作成功
data	object	否	返回数据
successCountAI	int	否	操作成功数量 示例：1
failCountAI	int	否	操作失败数量 示例：0
count	int	否	操作数量 示例：1
sucessCount	int	否	成功数量 示例：1
failCount	int	否	失败数量 示例：0
messages	string	否	操作信息
infos	object	是	返回数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": "",
		"infos": [
			{
				"beginDate": "2021-07-15 00:00:00",
				"bizId": 2152539425411328,
				"code": "PA-77600096",
				"createDate": "2021-07-15 14:38:10",
				"createTime": "2021-07-15 14:38:10",
				"creationOrgId": 2156833972277760,
				"creationOrgId_name": "夏目公司",
				"creator": "王好",
				"creatorId": "2154058977906944",
				"description": "11",
				"endDate": "2021-07-16 23:59:59",
				"id": 2345059791081728,
				"name": "15465",
				"priceTemplateId": 2303970820952320,
				"priceTemplateId_name": "项目维度",
				"pubts": "2021-07-15 14:38:11",
				"status": 0,
				"uordercorp": 2152539425411328,
				"verifystate": 0,
				"yTenantId": "aou0mt39",
				"adjustscopes": [
					{
						"bizId": 2152539425411328,
						"bizType": 1,
						"canEdit": true,
						"pubts": "2021-07-15 14:38:11",
						"saleOrgId": 2156833972277760,
						"uordercorp": 2152539425411328,
						"yTenantId": "aou0mt39"
					}
				],
				"adjustDetails": [
					{
						"adjustGradients": [
							{
								"amountFloor": 1,
								"price": 1,
								"priceAdjustmentId": 2345059791081728,
								"priceAdjustmentItemId": 2345059791081729,
								"pubts": "2021-07-15 14:38:11",
								"uordercorp": 2152539425411328,
								"yTenantId": "aou0mt39"
							}
						],
						"adjustGradients_amountFloor": 1,
						"adjustGradients_price": 1,
						"amountUnit": 2154066158424320,
						"amountUnit_name": "个",
						"beginDate": "2021-07-15 00:00:00",
						"dimension": [
							{
								"id": 2345059792343296,
								"priceAdjustDetailId": 2345059791081729,
								"priceAdjustmentId": 2345059791081728,
								"project": 0,
								"pubts": "2021-07-15 14:38:11",
								"uordercorp": 2152539425411328,
								"yTenantId": "aou0mt39",
								"skuId": 0,
								"productId": 0,
								"agentId": 0,
								"agentLevelId": 0,
								"productClassId": 0,
								"productBrand": 0,
								"productLine": 0,
								"agentAreaId": 0,
								"agentIndustryId": 0,
								"agentCountry": 0,
								"customerType": 0,
								"enterpriseProperty": 0,
								"costClassification": 0,
								"materialClassId": 0,
								"incomeTaxRate": 0,
								"outputRate": 0,
								"inventoryOrg": 0,
								"tradeType": 0,
								"billingOrg": 0,
								"saleDepartment": 0,
								"salesman": 0,
								"exchangeRateType": 0,
								"clearingForm": 0,
								"shippingMethod": 0,
								"paymentAgreement": 0,
								"channelAgentLevel": 0,
								"store": 0,
								"free1": "",
								"free2": "",
								"free3": "",
								"free4": "",
								"free5": "",
								"free6": "",
								"free7": "",
								"free8": "",
								"free9": "",
								"free10": ""
							}
						],
						"endDate": "2021-07-16 23:59:59",
						"hasDefaultInit": true,
						"id": 2345059791081729,
						"isLadderPrice": true,
						"price": 1,
						"priceAdjustmentId": 2345059791081728,
						"priceDigit": 6,
						"priceTypeCode": "PRODUCT",
						"priceTypeId": 2295529181221120,
						"priceTypeId_name": "0610协议价",
						"priceUnit": "2152541263991040",
						"priceUnit_name": "人民币",
						"project_name": "子集",
						"pubt": "2021-07-15 14:38:11",
						"unit_Precision": 3,
						"uordercorp": 2152539425411328,
						"yTenantId": "aou0mt39"
					}
				]
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

