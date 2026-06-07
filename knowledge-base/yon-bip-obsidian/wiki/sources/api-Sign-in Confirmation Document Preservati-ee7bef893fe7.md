---
title: "签收确认单个保存"
apiId: "ee7bef893fe74bb8b7abdd2c7c750b50"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sign-in Confirmation Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sign-in Confirmation Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 签收确认单个保存

>  请求方式	POST | Sign-in Confirmation Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/scm/signconfirmation/save
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
data	object	是	是	单据
code	string	否	否	单据编号 示例：QSQR202202210255
invoiceOrg	string	否	否	开票组织ID 示例：2356392404080640
corpContact	string	否	否	销售业务员 示例：2352120424288512
org	string	否	否	库存组织 示例：2356392404080640
contactName	string	否	否	客户联系人 示例：阿斯顿
merchant_name	string	否	否	商家 示例：梵蒂冈
exchRate	int	否	否	汇率 示例：1
salesOrg	string	否	否	销售组织 示例：2356392404080640
warehouse	long	否	否	仓库 示例：2380622320718080
_status	string	否	否	新增为Insert，更新为Update 示例：Update
bustype	string	否	否	交易类型 示例：2610889293992192
cReceiver	string	否	否	客户签收人 示例：阿瑟东
vouchdate	string	否	否	单据日期 示例：2022-02-21 00:00:00
natCurrency	string	否	否	本币id 示例：2351874939032064
exchRateType	string	否	否	汇率类型id 示例：0000KRBF48WG59AUYJ0000
currency	string	否	否	币种id 示例：2351874939032064
details	object	是	否	签收确认单子表
id	long	否	否	ID 示例：2658096050704640
department	string	否	否	销售部门 示例：2352193617613056
cust	string	否	否	客户 示例：2366361808376064

## 3. 请求示例

Url: /yonbip/scm/signconfirmation/save?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "QSQR202202210255",
			"invoiceOrg": "2356392404080640",
			"corpContact": "2352120424288512",
			"org": "2356392404080640",
			"contactName": "阿斯顿",
			"merchant_name": "梵蒂冈",
			"exchRate": 1,
			"salesOrg": "2356392404080640",
			"warehouse": 2380622320718080,
			"_status": "Update",
			"bustype": "2610889293992192",
			"cReceiver": "阿瑟东",
			"vouchdate": "2022-02-21 00:00:00",
			"natCurrency": "2351874939032064",
			"exchRateType": "0000KRBF48WG59AUYJ0000",
			"currency": "2351874939032064",
			"details": [
				{
					"receivedSubQty": 400,
					"firstsourceautoid": 2620825180230657,
					"makeRuleCode": "saleOutToSignconfirmation",
					"varianceSubQty": 10,
					"firstsource": "udinghuo.voucher_order",
					"firstupcode": "UO-064020220126000002",
					"source": "ustock.st_salesout",
					"subQty": 10,
					"invPriceExchRate": 1,
					"firstsourceid": 2620825180230656,
					"receivedBilling": false,
					"id": 2658096050704641,
					"mainid": 2658096050704640,
					"specDescription": "颜色:白;计量单位:千克;尺码:八尺;",
					"sourceid": 2642128020935168,
					"product": 2619450781290752,
					"varianceQty": 10,
					"oriSum": 1,
					"subWarehouse": "",
					"detailid": 2658096050704641,
					"natSum": 1,
					"_status": "Update",
					"propertiesValue": "颜色:白;计量单位:千克;尺码:八尺;",
					"taxRate": "0",
					"unit": 2352410771869952,
					"sourceautoid": 2642128020935169,
					"receivedQty": 400,
					"productsku": 2619450781290753,
					"priceQty": 10,
					"sourceType": "st_salesout",
					"qty": 10,
					"upcode": "XSCK20220210000002",
					"oriTaxUnitPrice": "100",
					"orderCode": "UO-064020220126000002",
					"invExchRate": 1,
					"natTaxUnitPrice": "100",
					"subWarehouse_name": "",
					"signConfirmationsDetail": [
						{
							"varianceStatus": "incomplete",
							"product": 2619450781290752,
							"varianceQty": 6,
							"varianceSubQty": 6,
							"description": "1",
							"detailid": 2658096050704641,
							"_status": "Update",
							"nextBustype": "2351874938360064",
							"unit": 2352410771869952,
							"varianceResponsibility": "thirdPartyBear",
							"productsku": 2619450781290753,
							"unit_Precision": 2,
							"stockUnitId_Precision": 2,
							"id": 2663328321163520,
							"invExchRate": 1,
							"varianceType": "newSalesOrder",
							"stockUnitId": 2352410771869952,
							"invExchRateNum": 1,
							"invExchRateDen": 1,
							"invPriceExchRate": "1",
							"invPriceExchRateNum": 1,
							"invPriceExchRateDen": 1
						}
					],
					"orderProductType": "SALE",
					"stockUnitId": 2352410771869952,
					"ptoId": 1909928517413896200,
					"ptoRowId": 1909936342842736643,
					"ptoQty": 1,
					"ptoSonQty": 2,
					"ptoCostScrap": 100,
					"invExchRateNum": 1,
					"invExchRateDen": 1,
					"invPriceExchRateNum": 1,
					"invPriceExchRateDen": 1
				}
			],
			"id": 2658096050704640,
			"department": "2352193617613056",
			"cust": "2366361808376064"
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
code	string	否	编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	是	单据
returncount	int	否	退回次数 示例：0
verifystate	int	否	审批状态 示例：0
currency_moneyDigit	string	否	币种金额精度 示例：2
currency_priceDigit	string	否	币种单价精度 示例：4
code	string	否	单据编号 示例：QSQR202202280285
invoiceOrg	string	否	开票组织ID 示例：2353226125496576
bustype_name	string	否	交易类型 示例：销售签收确认
creatorId	long	否	创建人 示例：2659650847723776
exchRate	int	否	汇率 示例：1
salesOrg	string	否	销售组织 示例：2353226125496576
invoiceOrg_name	string	否	开票组织 示例：AAA
vouchdate	string	否	单据日期 示例：2022-02-28 00:00:00
natCurrency	string	否	本币id 示例：2351874939032064
currencyName	string	否	币种 示例：人民币
cust_name	string	否	客户 示例：商家01
currency	string	否	币种id 示例：2351874939032064
details	object	是	签收确认单子表
id	long	否	ID 示例：2667543520416000
headItem!define15	string	否	表头自定义项15 示例：111
org_name	string	否	库存组织 示例：AAA
pubts	string	否	时间戳 示例：2022-02-28 10:05:36
natCurrencyName	string	否	本币 示例：人民币
tenant	long	否	租户 示例：2351873187860736
headItem!define10	string	否	表头自定义项10 示例：11
salesOrg_name	string	否	销售组织 示例：AAA
creator	string	否	创建人 示例：lyz
org	string	否	库存组织 示例：2353226125496576
isWfControlled	boolean	否	是否审批流控制 示例：false
exchRateType_name	string	否	汇率类型 示例：基准汇率
headItem!id	long	否	表头自定义项id 示例：2667543520416000
warehouse	long	否	仓库 示例：2411923631034624
bustype	string	否	交易类型 示例：2592843724003328
warehouse_name	string	否	仓库 示例：A仓库
natCurrency_moneyDigit	string	否	本币金额精度 示例：2
createTime	string	否	创建时间 示例：2022-02-28 10:05:35
natCurrency_priceDigit	string	否	本币单价精度 示例：4
exchRateType	string	否	汇率类型id 示例：0000KRBF48WG59AUYJ0000
cust	long	否	客户 示例：2353231358169344
status	int	否	单据状态 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"returncount": 0,
			"verifystate": 0,
			"currency_moneyDigit": "2",
			"currency_priceDigit": "4",
			"code": "QSQR202202280285",
			"invoiceOrg": "2353226125496576",
			"bustype_name": "销售签收确认",
			"creatorId": 2659650847723776,
			"exchRate": 1,
			"salesOrg": "2353226125496576",
			"invoiceOrg_name": "AAA",
			"vouchdate": "2022-02-28 00:00:00",
			"natCurrency": "2351874939032064",
			"currencyName": "人民币",
			"cust_name": "商家01",
			"currency": "2351874939032064",
			"details": [
				{
					"receivedSubQty": 9,
					"stockUnit_name": "件",
					"oriTax": "",
					"product_cCode": "000288",
					"varianceSubQty": 1,
					"firstsource": "udinghuo.voucher_order",
					"memo": "remark",
					"firstupcode": "UO-657620220223000021",
					"source": "ustock.st_salesout",
					"natTax": "",
					"subQty": 10,
					"product_cName": "多sku02",
					"free1": "吨",
					"stockUnitId_Precision": "2",
					"receivedBilling": false,
					"id": 2667543520416001,
					"mainid": 2667543520416000,
					"tenant": 2351873187860736,
					"varianceQty": 1,
					"unitName": "件",
					"subWarehouse": "2351873187860735",
					"oriUnitPrice": "",
					"natSum": 20,
					"taxCode": "VAT13",
					"taxRate": 13,
					"unit": 2352410771869952,
					"productsku": 2659121912254978,
					"productsku_cCode": "KKKKK吨000001",
					"receivedQty": 9,
					"sourceType": "st_salesout",
					"qty": 10,
					"unit_Precision": "2",
					"oriTaxUnitPrice": 2,
					"oriMoney": "",
					"invExchRate": 1,
					"signConfirmationsDetail": [
						{
							"varianceStatus": "incomplete",
							"product": 2659121912238592,
							"stockUnit_name": "件",
							"unitName": "件",
							"product_cCode": "000288",
							"detailid": 2667543520416001,
							"productsku_cName": "多sku02吨",
							"nextBustype": "2612715779264768",
							"unit": 2352410771869952,
							"productsku": 2659121912254978,
							"productsku_cCode": "KKKKK吨000001",
							"product_cName": "多sku02",
							"invPriceExchRate": "1",
							"nextBustype_name": "销售签收确认02",
							"id": 2667543520416002,
							"pubts": "2022-02-28 10:05:35",
							"invExchRate": 1,
							"stockUnitId": 2352410771869952,
							"invPriceExchRateDen": 1,
							"invPriceExchRateNum": 1,
							"invExchRateDen": 1,
							"invExchRateNum": 1
						}
					],
					"stockUnitId": 2352410771869952,
					"natUnitPrice": "",
					"receiveableQty": 10,
					"firstsourceautoid": 2660531004068099,
					"subWarehouse_name": "仓库",
					"makeRuleCode": "saleOutToSignconfirmation",
					"productsku_cName": "多sku02吨",
					"invPriceExchRate": 1,
					"firstsourceid": 2660531004068096,
					"pubts": "2022-02-28 10:05:35",
					"sourceid": 2660542696296960,
					"bodyItem!define5": "1",
					"product": 2659121912238592,
					"oriSum": 20,
					"priceUOM_name": "件",
					"propertiesValue": "重量:吨;",
					"bodyItem!id": 2667543520416001,
					"sourceautoid": 2660542696296962,
					"invPriceExchRateDen": 1,
					"invPriceExchRateNum": 1,
					"invExchRateDen": 1,
					"invExchRateNum": 1,
					"priceQty": 10,
					"upcode": "XSCK20220223000014",
					"srcBillRow": "2",
					"orderCode": "UO-657620220223000021",
					"natTaxUnitPrice": 2,
					"bodyItem!define9": "1",
					"orderProductType": "SALE",
					"natMoney": "",
					"ptoId": 1909928517413896200,
					"ptoRowId": 1914525249124171800,
					"ptoQty": 1,
					"ptoSonQty": 2,
					"ptoCostScrap": 100
				}
			],
			"id": 2667543520416000,
			"headItem!define15": "111",
			"org_name": "AAA",
			"pubts": "2022-02-28 10:05:36",
			"natCurrencyName": "人民币",
			"tenant": 2351873187860736,
			"headItem!define10": "11",
			"salesOrg_name": "AAA",
			"creator": "lyz",
			"org": "2353226125496576",
			"isWfControlled": false,
			"exchRateType_name": "基准汇率",
			"headItem!id": 2667543520416000,
			"warehouse": 2411923631034624,
			"bustype": "2592843724003328",
			"warehouse_name": "A仓库",
			"natCurrency_moneyDigit": "2",
			"createTime": "2022-02-28 10:05:35",
			"natCurrency_priceDigit": "4",
			"exchRateType": "0000KRBF48WG59AUYJ0000",
			"cust": 2353231358169344,
			"status": 0
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-16	
新增
请求参数 (9)
新增
返回参数 (8)
	2	2025-09-30	
更新
请求说明
新增
请求参数 subWarehouse
新增
请求参数 subWarehouse_name
新增
返回参数 subWarehouse
新增
返回参数 subWarehouse_name

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

