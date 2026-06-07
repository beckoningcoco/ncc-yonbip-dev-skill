---
title: "取价服务"
apiId: "bc176e8642d146048c01d53c3579954b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Table"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 取价服务

>  请求方式	POST | Price Table (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricing/voucher/enquiryPrice
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
data	object	是	否	请求数据
dateTime	DateTime	否	是	取价时间 示例：2021-09-16 15:57:06
saleOrgId	long	否	是	销售组织id 示例：2352090091131648
quantity	double	否	是	数量 示例：0.2
billnum	string	否	是	业务编码(销售订单：voucher_order,销售合同：sact_salescontract,销售报价：quote_salesquotation,电商订单：ec_tradeorder,电商退货单：ec_refund,销售订单变更单：voucher_orderchange,销售合同变更单：sact_salescontractrevise,销售报价变更单：quote_salesquotationchange,营销费用销量汇总：usmp_expense,销售退货单：voucher_salereturn,调拨订单：st_transferapply,内部交易：uit_uitprebalance,申请单：usmp_expenseapply,结算单：usmp_settlementapply) 示例：voucher_salereturn
isTaxIncluded	boolean	否	否	是否含税（true或者空为含税，false为不含税） 示例：true
amountUnit	long	否	是	商品单位id 示例：2352436593873152
extendParams	object	否	否	取价的扩展参数
idKey	string	否	否	详情的Id 示例：2434318749536512
currency	object	否	是	币种信息
dimensions	object	否	是	取价维度信息(请根据价格表设置的定价维度填写)

## 3. 请求示例

Url: /yonbip/sd/pricing/voucher/enquiryPrice?access_token=访问令牌
Body: {
	"data": [
		{
			"dateTime": "2021-09-16 15:57:06",
			"saleOrgId": 2352090091131648,
			"quantity": 0.2,
			"billnum": "voucher_salereturn",
			"isTaxIncluded": true,
			"amountUnit": 2352436593873152,
			"extendParams": {
				"voucherNo": "UR-235220210916000003",
				"amountUnitName": "包",
				"productCode": "000046",
				"voucherLine": 10,
				"productName": "辅计量单位物料"
			},
			"idKey": "2434318749536512",
			"currency": {
				"id": "2350786628080640"
			},
			"dimensions": {
				"billingOrg": 2352090091131648,
				"agentId": 2352188003832064,
				"agentLevelId": 0,
				"skuId": 2419832014622976,
				"productId": 2419832007676160,
				"store": "2419832007676161",
				"productClassId": 2419848865467162,
				"paymentAgreement": 2419832007676169,
				"shippingMethod": 7894487615461151,
				"clearingForm": 354684621655141,
				"exchangeRateType": 7894487615461151,
				"saleDepartment": 78944878261151,
				"inventoryOrg": 7894487615461151,
				"tradeType": 154584851658,
				"salesman": "1545654555145",
				"productBrand": "154895655454",
				"productLine": "15465659589656",
				"agentAreaId": 15484956454985,
				"agentIndustryId": 154654695458478,
				"agentCountry": "9628819be3474a5e96a9146bff27283b",
				"customerType": 154656545615465,
				"enterpriseProperty": "45565695989468",
				"costClassification": 564645456464548,
				"materialClassId": 454654658956569,
				"incomeTaxRate": 5648941566556454,
				"outputRate": 1545699545484454,
				"channelAgentLevel": 15485969878726564,
				"businessWorker": 2,
				"project": 1546546548541545,
				"enterpriseType": 0,
				"businessModel": 0,
				"paymentMode": "FIRSTPAY",
				"productType": 1,
				"taxCategory": 0,
				"agentClassId": 154556874654564,
				"weight": 1,
				"volume": 2,
				"length": 3,
				"width": 4,
				"height": 5,
				"placeOrigin": "15456878515615",
				"generateVendor": "154545456454154",
				"language": "18d07106-ab9b-48f5-96a7-4df6b787c3ce",
				"timezone": "18d071065454684",
				"elasticData": {
					"headDefineCharacter": {
						"code": "123（如果特征类型是档案类型，value为档案值对应的id） "
					},
					"bodyDefineCharacter": {
						"code": "123（如果特征类型是档案类型，value为档案值对应的id） "
					},
					"freeCharacter": {
						"code": "123（如果特征类型是档案类型，value为档案值对应的id） "
					},
					"optionCharacter": {
						"code": "123（如果特征类型是档案类型，value为档案值对应的id） "
					}
				}
			}
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	long	否	操作状态码 示例：200
message	string	否	操作信息 示例：操作成功
data	object	是	返回数据
amountUnit	long	否	单位id 示例：2396097276826368
billnum	string	否	单据编码 示例：quote_salesquotation
currency	object	否	币种信息
isTaxIncluded	short	否	是否含税（1或者空为含税，0 为不含税） 示例：1
dateTime	string	否	取价日期 示例：2021-09-01 12:20:20
dimensions	object	否	取价维度信息
extendParams	object	否	取价的扩展参数
extendResult	object	否	返回的扩展结果信息
idKey	string	否	单据详情id 示例：SQ2434488402678272
price	double	否	商品单价 示例：0
priceStrageId	long	否	定价策略id 示例：2404611394179328
priceStrageName	string	否	定价策略名称 示例：LQQ定价策略1
pricingTypes	long	是	定价策略中的定价类型集合 示例：[2403231987650816]
quantity	long	否	数量 示例：10
records	object	是	取价计算过程
resultKey	string	否	结果标识值 示例：SQ2434488402678272|1631789382
saleOrgId	long	否	销售组织id 示例：2402889862354176

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"amountUnit": 2396097276826368,
			"billnum": "quote_salesquotation",
			"currency": {
				"code": "CNY",
				"currTypeSign": "￥",
				"id": "G001ZM0000DEFAULTCURRENCT00000000001",
				"moneyDigit": 2,
				"moneyRount": 0,
				"name": "人民币",
				"priceDigit": 2,
				"priceRount": 0
			},
			"isTaxIncluded": 1,
			"dateTime": "2021-09-01 12:20:20",
			"dimensions": {
				"agentId": 2403078099996928,
				"businessModel": "0",
				"businessWorker": "1",
				"skuId": 2419853195661568,
				"productType": 1,
				"productClassId": 2403166950019328,
				"productId": 2419853188124928,
				"materialClassId": 2403152459747584,
				"taxCategory": "0",
				"enterpriseType": "0",
				"agentLevelId": 0,
				"productBrand": "",
				"productLine": "",
				"agentAreaId": 0,
				"agentIndustryId": "",
				"agentCountry": "",
				"customerType": 0,
				"enterpriseProperty": 0,
				"costClassification": 0,
				"incomeTaxRate": 0,
				"outputRate": 0,
				"inventoryOrg": 0,
				"tradeType": 0,
				"billingOrg": 0,
				"saleDepartment": 0,
				"salesman": "",
				"exchangeRateType": 0,
				"clearingForm": 0,
				"shippingMethod": 0,
				"paymentAgreement": 0,
				"project": "",
				"channelAgentLevel": 0,
				"agentClassId": 2403075536785664,
				"store": "",
				"paymentMode": "",
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
				"placeOrigin": "",
				"generateVendor": "",
				"timezone": "",
				"language": "",
				"elasticData": {
					"headDefineCharacter": {
						"code": "123（如果特征类型是档案类型，value为档案值对应的id） "
					},
					"bodyDefineCharacter": {
						"code": "123（如果特征类型是档案类型，value为档案值对应的id） "
					},
					"freeCharacter": {
						"code": "123（如果特征类型是档案类型，value为档案值对应的id） "
					},
					"optionCharacter": {
						"code": "123（如果特征类型是档案类型，value为档案值对应的id） "
					}
				}
			},
			"extendParams": {
				"amountUnitName": "千克",
				"productCode": "000014",
				"voucherLine": 10,
				"productName": "LQ00无模板SKU有仓库"
			},
			"extendResult": {
				"getedPrice": false,
				"dimensions": [
					"productId"
				]
			},
			"idKey": "SQ2434488402678272",
			"price": 0,
			"priceStrageId": 2404611394179328,
			"priceStrageName": "LQQ定价策略1",
			"pricingTypes": [
				2403231987650816
			],
			"quantity": 10,
			"records": [
				{
					"calcQuantity": 10,
					"calcStep": 10,
					"calcType": "数量乘积",
					"isExclusive": false,
					"getPrice": false,
					"isNotParticipate": false,
					"isOnlyDisplay": false,
					"price": 0,
					"priceStrageId": 2404611394179328,
					"priceStrageStep": 10,
					"priceUnit": "人民币",
					"pricingTypeDes": "数量乘积，不允许下级修改",
					"pricingTypeId": 2403231987650816,
					"pricingTypeName": "LQ数量乘积",
					"isSumRecord": false,
					"totalMoney": 0,
					"priceTemplateId": 4589856515484845
				}
			],
			"resultKey": "SQ2434488402678272|1631789382",
			"saleOrgId": 2402889862354176
		}
	]
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
	1	2025-06-25	
更新
请求参数 (60)
更新
返回参数 (105)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

