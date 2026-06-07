---
title: "价格调整单详情查询"
apiId: "2417575423861325831"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Adjustment"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 价格调整单详情查询

>  请求方式	POST | Price Adjustment (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/PCC/priceChange/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	价格调整单ID
code	string	否	否	价格调整单编码

## 3. 请求示例

Url: /yonbip/PCC/priceChange/detail?access_token=访问令牌
Body: {
	"id": "",
	"code": ""
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
code	number
小数位数:0,最大长度:10	否	返回状态码 示例：200
message	string	否	返回说明 示例：操作成功
data	object	否	返回数据
id	string	否	主键
code	string	否	调价单号
creator	string	否	创建人
creatorId	string	否	创建人ID
create_date	string	否	创建日期
createTime	string	否	创建时间
modifier	string	否	修改人
modifierId	string	否	修改人ID
modify_date	string	否	修改日期
modify_time	string	否	修改时间
vouchdate	string	否	调价日期
organizationId	string	否	所属组织ID
organizationName	string	否	所属组织名称
organizationCode	string	否	所属组织编码
bustype	string	否	交易类型ID
bustype_name	string	否	交易类型
businessType	string	否	业务类型：0：普通；1：VMI；2：全程委外；3：工序委外
isWfControlled	boolean	否	是否开启审批流
status	string	否	单据状态：0：开立；1：已审核；3：审核中
isBegin	number
小数位数:0,最大长度:10	否	期初：0：否；1：是
priceFlag	number
小数位数:0,最大长度:10	否	是否含税：0：无税价格；1：含税价格
supplyType	number
小数位数:0,最大长度:10	否	供应类型：0：代管；1：委外；2：采购
taxPriority	number
小数位数:0,最大长度:10	否	价格标识：0：含税优先；1：无税优先
AdjustPriceDefineCharacter	string	否	特征
applicableorganization	object	是	适用组织
adjustpricedetail	object	是	调价物料

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "",
		"code": "",
		"creator": "",
		"creatorId": "",
		"create_date": "",
		"createTime": "",
		"modifier": "",
		"modifierId": "",
		"modify_date": "",
		"modify_time": "",
		"vouchdate": "",
		"organizationId": "",
		"organizationName": "",
		"organizationCode": "",
		"bustype": "",
		"bustype_name": "",
		"businessType": "",
		"isWfControlled": true,
		"status": "",
		"isBegin": 0,
		"priceFlag": 0,
		"supplyType": 0,
		"taxPriority": 0,
		"AdjustPriceDefineCharacter": "",
		"applicableorganization": [
			{
				"id": "",
				"adjustPriceId": "",
				"organizationId": "",
				"organizationCode": "",
				"organizationName": "",
				"pubts": ""
			}
		],
		"adjustpricedetail": [
			{
				"id": "",
				"adjustPriceId": "",
				"product": "",
				"productCode": "",
				"productName": "",
				"productUnitId": "",
				"product_modelDescription": "",
				"productUnitName": "",
				"product_model": "",
				"productUnitPrecision": "",
				"adjustPriceRange": "",
				"currency": "",
				"currency_name": "",
				"taxRateId": "",
				"taxRate": 0,
				"taxRateCode": "",
				"oriUnitPrice": "",
				"oriTaxUnitPrice": "",
				"effectiveDate": "",
				"expiryDate": "",
				"lastPriceNotax": "",
				"lastPrice": "",
				"operationStatus": "",
				"discountTaxType": "",
				"AdjustPriceDetailDefineCharacter": "",
				"AdjustPriceDetailFreeCharacteristics": "",
				"quantityStart": "",
				"quantityEnd": "",
				"remark": "",
				"quantityFloor": "",
				"dBillDate": "",
				"discountRate": "",
				"lowesPrice": "",
				"lowesPriceNotax": "",
				"operationCode": "",
				"operationName": "",
				"oriTaxUnitPriceOriginal": "",
				"oriUnitPriceOriginal": "",
				"priceSchemeName": "",
				"priceStrategyName": "",
				"productskuCode": "",
				"productskuName": "",
				"vendorCode": "",
				"vendorName": ""
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
	1	2026-04-16	
更新
请求参数 code
新增
返回参数 adjustPriceRange
新增
返回参数 operationStatus
新增
返回参数 quantityFloor
更新
返回参数 (72)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

