---
title: "价格表上传"
apiId: "45bef21e2cc34bb8811acf280f0a9d0e"
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

# 价格表上传

>  请求方式	POST | Price Table (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricing/record/save
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
data	object	是	是	请求数据
_status	string	否	是	操作标识,Insert:新增(只支持Insert)
priceTemplateId_name	string	否	是	价格模板code，或价格模板id 示例：2245921376129280
priceTypeId_name	string	否	是	定价类型code，或定价类型id 示例：2245920338874624
price	string	否	是	价格【是否阶梯】为是时，该价格录入无效，最终取值为阶梯表中价格最小的值 示例：444
beginDate	DateTime	否	是	开始日期 示例：2020-01-01 00:00:00
endDate	DateTime	否	否	结束日期 示例：9999-12-31 23:59:59
priceUnit_name	string	否	否	价格币种/%（定价类型的计算类型为【%加成】时不录入，为空即可，否则为币种ID，或币种code 需必填） 示例：1959808366596608
amountUnit_name	string	否	否	计价单位（定价类型为加成时不填写，否则必填） 示例：1951599070990592
orgScope_name	string	否	否	适用范围-平台id，code或商家 id，code(多组织必输入，单组织不填，默认为当前组织) 示例：1951523035419392
dimension!skuId_name	string	否	否	商品skuCode，或skuid（如价格模板中选择该维度，该维度必填）
dimension!productId_name	string	否	否	商品code或id（如价格模板中选择该维度，该维度必填）
dimension!agentId_name	string	否	否	客户code或id（如价格模板中选择该维度，该维度必填）
dimension!agentLevelId_name	string	否	否	客户级别code或id（如价格模板中选择该维度，该维度必填）
dimension!productClassId_name	string	否	否	商品分类code或id（如价格模板中选择该维度，该维度必填）
dimension!productBrand_name	string	否	否	品牌code或id（如价格模板中选择该维度，该维度必填）
dimension!productLine_name	string	否	否	产品线code或id（如价格模板中选择该维度，该维度必填）
dimension!agentAreaId_name	string	否	否	客户区域code或id（如价格模板中选择该维度，该维度必填）
dimension!agentIndustryId_name	string	否	否	客户行业code或id（如价格模板中选择该维度，该维度必填）
dimension!agentCountry_name	string	否	否	国家code或id（如价格模板中选择该维度，该维度必填）
dimension!customerType_name	string	否	否	客户类型code或id（如价格模板中选择该维度，该维度必填）
dimension!enterpriseProperty_name	string	否	否	企业性质code或id（如价格模板中选择该维度，该维度必填）
dimension!costClassification_name	string	否	否	成本分类code或id（如价格模板中选择该维度，该维度必填）
dimension!materialClassId_name	string	否	否	物料分类code或id（如价格模板中选择该维度，该维度必填）
dimension!incomeTaxRate_name	string	否	否	进项税率code 或者id如价格模板中选择该维度，该维度必填）
dimension!outputRate_name	string	否	否	销项税率code或id如价格模板中选择该维度，该维度必填）
dimension!inventoryOrg_name	string	否	否	库存组织code或id如价格模板中选择该维度，该维度必填）
dimension!tradeType_name	string	否	否	交易类型code或id如价格模板中选择该维度，该维度必填）
dimension!agentClassId_name	string	否	否	客户分类code或id如价格模板中选择该维度，该维度必填）
dimension!billingOrg_name	string	否	否	开票组织code或id如价格模板中选择该维度，该维度必填）
dimension!saleDepartment_name	string	否	否	销售部门code或id如价格模板中选择该维度，该维度必填）
dimension!salesman_name	string	否	否	业务员code或id如价格模板中选择该维度，该维度必填）
dimension!exchangeRateType_name	string	否	否	汇率类型code或id如价格模板中选择该维度，该维度必填）
dimension!clearingForm_name	string	否	否	结算方式code或id如价格模板中选择该维度，该维度必填）
dimension!shippingMethod_name	string	否	否	发运方式code或id如价格模板中选择该维度，该维度必填）
dimension!paymentAgreement_name	string	否	否	收款协议code或id如价格模板中选择该维度，该维度必填）
dimension!project_name	string	否	否	项目名称code或id如价格模板中选择该维度，该维度必填）
dimension!channelAgentLevel_name	string	否	否	渠道等级code或id如价格模板中选择该维度，该维度必填）
dimension!store_name	string	否	否	终端code或id如价格模板中选择该维度，该维度必填）
dimension!businessWorker	long	否	否	业务角色（2：订货门户客户，3：2B商家，4：零售加盟商，5：2C商家）如价格模板中选择该维度，该维度必填） 示例：0
dimension!enterpriseType	long	否	否	企业类型（0：企业，1：个人）如价格模板中选择该维度，该维度必填） 示例：0
dimension!businessModel	long	否	否	经营模式（0：生产加工，1：批发经销）如价格模板中选择该维度，该维度必填） 示例：0
dimension!paymentMode	string	否	否	支付方式（FIRSTDELIVER：其他，FIRSTPAY：款到发货）如价格模板中选择该维度，该维度必填）
dimension!productType	long	否	否	物料类型（1：实物商品，2：虚拟商品）如价格模板中选择该维度，该维度必填） 示例：0
dimension!taxCategory	long	否	否	纳税类别（0：一般纳税人，1：小规模纳税人，2：海外纳税人）如价格模板中选择该维度，该维度必填） 示例：0
weight	BigDecimal	否	否	重量（如价格模板中选择该维度，该维度必填）
weight_sub	BigDecimal	否	否	重量下限（ 若价格模板的维度项中设置为区间，请录入下限数量；如价格模板中选择该维度，该维度必填）
volume	BigDecimal	否	否	体积（如价格模板中选择该维度，该维度必填）
volume_sub	BigDecimal	否	否	体积下限（ 若价格模板的维度项中设置为区间，请录入下限数量；如价格模板中选择该维度，该维度必填）
length	BigDecimal	否	否	长（如价格模板中选择该维度，该维度必填）
length_sub	BigDecimal	否	否	长下限（ 若价格模板的维度项中设置为区间，请录入下限数量；如价格模板中选择该维度，该维度必填）
width	BigDecimal	否	否	宽（如价格模板中选择该维度，该维度必填）
width_sub	BigDecimal	否	否	宽下限（ 若价格模板的维度项中设置为区间，请录入下限数量；如价格模板中选择该维度，该维度必填）
height	BigDecimal	否	否	高（如价格模板中选择该维度，该维度必填）
height_sub	BigDecimal	否	否	高下限（ 若价格模板的维度项中设置为区间，请录入下限数量；如价格模板中选择该维度，该维度必填）
placeOrigin	string	否	否	产地（如价格模板中选择该维度，该维度必填）
dimension!generateVendor	string	否	否	生产厂商（如价格模板中选择该维度，该维度必填）
recordGradients	object	是	否	阶梯表 （价格表引用的定价类型【是否阶梯】为是时，阶梯信息必输入，不可为空）

## 3. 请求示例

Url: /yonbip/sd/pricing/record/save?access_token=访问令牌
Body: {
	"data": [
		{
			"_status": "",
			"priceTemplateId_name": "2245921376129280",
			"priceTypeId_name": "2245920338874624",
			"price": "444",
			"beginDate": "2020-01-01 00:00:00",
			"endDate": "9999-12-31 23:59:59",
			"priceUnit_name": "1959808366596608",
			"amountUnit_name": "1951599070990592",
			"orgScope_name": "1951523035419392",
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
			"dimension!agentClassId_name": "",
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
			"dimension!taxCategory": 0,
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
			"dimension!generateVendor": "",
			"recordGradients": [
				{
					"price": "444",
					"amountFloor": "0.0"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	响应码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	响应数据
sucessCount	int	否	成功数量 示例：1
messages	string	否	操作信息
failCount	int	否	失败数量 示例：0
count	int	否	操作数量 示例：1
infos	object	是	价格表数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"messages": "",
		"failCount": 0,
		"count": 1,
		"infos": [
			{
				"orgScope_name": 1951482557763840,
				"beginDate": "2021-06-03 11:04:46",
				"priceUnit": "1959808366596608",
				"isLadderPrice": true,
				"endDate": "9999-12-31 23:59:59",
				"priceTemplateId": 2245921376129280,
				"price": 444,
				"recordGradients": [
					{
						"price": 444,
						"amountFloor": 0,
						"priceAdjustmentGradientId": -1,
						"id": 2288513325895938,
						"priceRecordId": 2288513325895936,
						"uordercorp": 1951482557763840,
						"yTenantId": "uhy8st65"
					}
				],
				"priceTypeId": 2245920338874624,
				"orgScope": "1951523035419392",
				"dimension": {
					"id": 2288513325895937,
					"productId_name": 1967040133861632,
					"skuId_name": 231940133861632,
					"productClassId_name": 0,
					"costClassification_name": 0,
					"saleDepartment_name": 0,
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
					"shippingMethod_name": "",
					"store_name": "",
					"channelAgentLevel_name": 0,
					"paymentAgreement_name": 0,
					"clearingForm_name": 0,
					"exchangeRateType": 0,
					"salesman_name": 0,
					"billingOrg_name": 0,
					"tradeType_name": 0,
					"inventoryOrg_name": 0,
					"outputRate_name": 0,
					"incomeTaxRate_name": 0,
					"materialClassId_name": 0,
					"enterpriseProperty_name": 0,
					"customerType_name": 0,
					"agentCountry_name": 0,
					"agentIndustryId_name": 0,
					"agentAreaId_name": 0,
					"productLine_name": 0,
					"agentLevelId_name": 0,
					"agentId_name": "",
					"project_name": 228823232589593,
					"priceRecordId": 2288513325895936,
					"uordercorp": 1951482557763840,
					"yTenantId": "uhy8st65"
				},
				"amountUnit": 1951599070990592,
				"id": 2288513325895936,
				"uordercorp": 1951482557763840,
				"modifier": "YonSuite默认用户",
				"modifyTime": "2021-06-05 15:56:08",
				"modifyDate": "2021-06-05 15:56:08",
				"modifierId": 1988395350151424,
				"yTenantId": "uhy8st65"
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

