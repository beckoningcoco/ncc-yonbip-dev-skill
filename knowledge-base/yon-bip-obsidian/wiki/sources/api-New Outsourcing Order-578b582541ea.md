---
title: "委外订单新增"
apiId: "578b582541ea4cb6804bda7932727d51"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontract Order"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontract Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外订单新增

>  请求方式	POST | Subcontract Order (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/subcontractorder/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	单据编号，设置手工编号时必输，自动编号时输入无效 示例：WWDD20210901000001
vouchdate	string	否	是	单据日期，格式“2021-05-08” 示例：2021-05-08
orgCode	string	否	否	组织code，可以提供组织的id或code, 多组织下不能为空 示例：0701
orgId	string	否	否	组织id 示例：1866605942198528
transTypeCode	string	否	是	交易类型code，可以提供交易类型的id或code 示例：WWDD10
transTypeId	string	否	否	交易类型id 示例：1248018423173517
remark	string	否	否	备注
out_sys_id	string	否	否	外部来源线索 示例：1248018423175356
out_sys_code	string	否	否	外部来源编码 示例：WWDD20230712001
out_sys_version	string	否	否	外部来源版本 示例：1.0
out_sys_type	string	否	否	外部来源类型 示例：A
orderSubcontract	object	否	是	委外信息
orderProduct	object	是	是	委外订单产品行数据集合
isBeginning	number
小数位数:0,最大长度:1	否	否	期初订单标识:0-否，1-是 示例：0 默认值：0
sourceType	string	否	否	来单据类型枚举：17-来源工序流转卡 示例：17

## 3. 请求示例

Url: /yonbip/mfg/subcontractorder/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "WWDD20210901000001",
		"vouchdate": "2021-05-08",
		"orgCode": "0701",
		"orgId": "1866605942198528",
		"transTypeCode": "WWDD10",
		"transTypeId": "1248018423173517",
		"remark": "",
		"out_sys_id": "1248018423175356",
		"out_sys_code": "WWDD20230712001",
		"out_sys_version": "1.0",
		"out_sys_type": "A",
		"orderSubcontract": {
			"departmentCode": "D01",
			"departmentId": "1870534089855232",
			"operatorCode": "",
			"subcontractVendorCode": "",
			"subcontractVendorId": "",
			"tcCode": "",
			"tcId": "",
			"invoiceVendorCode": "",
			"invoiceVendorId": "",
			"tcOrgCode": "",
			"tcOrgId": "",
			"subcontractVendorContactId": "",
			"tcFCExchRateTypeCode": "",
			"tcFCExchRateType": "",
			"tcFCExchRate": 0,
			"isTaxPrice": 0,
			"mixConsultRole": 0,
			"tradePathName": ""
		},
		"orderProduct": [
			{
				"materialCode": "",
				"materialId": "",
				"productCode": "",
				"productId": "",
				"skuCode": "",
				"versionCode": "",
				"changeRate": 0,
				"startDate": "2021-05-08",
				"orgCode": "",
				"orgId": "",
				"warehouseCode": "",
				"remark": "",
				"retMaterialApplyFlag": 0,
				"orderSubcontractProduct": {
					"vendorProductCode": "",
					"vendorProductName": "",
					"isPresent": "",
					"discountTaxType": 0,
					"taxRateCode": "",
					"taxRateId": "",
					"subcontractQuantityMU": 0,
					"subcontractUnitCode": "",
					"subcontractUnitId": "",
					"subcontractQuantitySU": 0,
					"priceUnitCode": "",
					"priceUnitId": "",
					"subcontractToPrice": 0,
					"subcontractQuantityPU": 0,
					"oriTaxUnitPrice": 0,
					"oriUnitPrice": 0,
					"oriSum": 0,
					"oriMoney": 0,
					"deliveryDate": "2021-05-08",
					"nonRecoverableTaxRate": 0,
					"rcvAddrType": 0,
					"rcvVendor": 0,
					"rcvCustomer": 0,
					"tcOrgIdSon": "1631969031461273603",
					"demandOrgId": "1631969031461273603",
					"invoicedQuantityMU": 10,
					"invoicedQuantityPU": 10,
					"invoicedMoneyTC": 10,
					"invoicedMoneyFC": 10,
					"totalPaymentTC": 10,
					"totalPaymentFC": 10
				},
				"out_sys_rowno": "10",
				"out_sys_lineid": "1248018423173518",
				"orderSubcontractProductConsult": {
					"requireSign": true,
					"signType": 0,
					"signerTenant": "",
					"signerEnterpriseId": 0
				},
				"incomingQuantity": 10,
				"incomingAuxiliaryQuantity": 10,
				"orderMaterial": [
					{
						"materialId": 0,
						"materialCode": "",
						"productId": 0,
						"productCode": "",
						"orgId": 0,
						"orgCode": "",
						"denominatorQuantity": 0,
						"numeratorQuantity": 0,
						"stockUnitId": 0,
						"scrap": 0,
						"supplyType": "",
						"fixedQuantity": 0,
						"warehouseId": 0,
						"requirementDate": "2026-06-07",
						"recipientQuantity": 0,
						"auxiliaryRecipientQuantity": 0,
						"remark": "",
						"changeRate": 0,
						"transferOutWarehouseId": 0,
						"tranferOutOrgId": 0,
						"isWholeSet": true,
						"verificationBy": "",
						"supDirectShip": true,
						"skuId": 0,
						"subcontractSupplyType": 0,
						"receivedQuantity": 10,
						"auxiliaryReceivedQuantity": 10,
						"excessRecipientQty": 10,
						"auxiliaryExcessRecipientQty": 10,
						"transferQuantity": 10,
						"auxiliaryTransferQuantity": 10,
						"orderMaterialExpinfo": {
							"changeRateNum": 1,
							"changeRateDen": 1
						}
					}
				],
				"offChartReceiptIsAllowed": false,
				"sourceid": 2334760182378135555,
				"sourceautoid": 2334760182378135561,
				"batchNo": "PC20251027001",
				"produceDate": "2025-10-30",
				"expirationDate": "2025-11-04",
				"orderProductExpinfo": {
					"changeRateNum": 1,
					"changeRateDen": 1
				},
				"orderSubcontractProductExt": {
					"subcontractToPriceNum": 1,
					"subcontractToPriceDen": 1
				}
			}
		],
		"isBeginning": 0,
		"sourceType": "17"
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
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口调用返回数据
sucessCount	long	否	成功数 示例：1
failCount	long	否	失败数 示例：0
count	long	否	记录总数 示例：1
messages	object	是	失败信息
infos	object	是	成功信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": [
			{}
		],
		"infos": [
			{
				"id": 2251405962776832,
				"code": "SCDD20210510000003",
				"vouchdate": 1620576000000,
				"transTypeId": "1248018423173517",
				"orgId": "1866605942198528",
				"status": 0,
				"creator": "YonSuite默认用户",
				"creatorId": 1861077977714944,
				"createTime": 1620614914000,
				"createDate": 1620614914000,
				"isWfControlled": false,
				"pubts": 1620614915000,
				"defineDts": {},
				"tenant": 1861077976273152,
				"yTenantId": "tl27pqwt",
				"orderSubcontract": {
					"departmentId": "1870534089855232",
					"subcontractVendorId": "",
					"operatorId": "",
					"tcId": "",
					"taxRateId": "",
					"invoiceVendorId": "",
					"tcOrgId": "",
					"subcontractVendorContactId": "",
					"tcFCExchRateType": "",
					"tcFCExchRate": 0,
					"fcId": "",
					"isTaxPrice": "",
					"mixConsultRole": 0,
					"tradePath": 1852955192105369602,
					"tradePathName": "01路径",
					"tcOrgAccount": 0
				},
				"isBeginning": 0,
				"orderProduct": [
					{
						"id": 2251405962793216,
						"orgId": "1866605942198528",
						"startDate": "2021-08-27",
						"materialId": 1869775823737088,
						"productId": 1869775818379520,
						"skuId": 1869775821852928,
						"bomId": 2227281346762496,
						"mainUnit": "",
						"changeType": 0,
						"changeRate": 1,
						"warehouseId": "",
						"orderId": 2251405962776832,
						"freeCharacteristics": {},
						"attributeCharacteristics": {},
						"productDefineDts": {},
						"pubts": 1620614914965,
						"retMaterialApplyFlag": 0,
						"orderSubcontractProduct": {
							"deliveryDate": "2021-08-27",
							"subcontractQuantityMU": 10,
							"subcontractUnitId": "1869676091724032",
							"subcontractQuantitySU": 10,
							"priceUnitId": "1869676091724032",
							"subcontractQuantityPU": "10",
							"oriTaxUnitPrice": 10,
							"oriUnitPrice": 10,
							"oriSum": 100,
							"oriMoney": 100,
							"taxRateId": "",
							"discountTaxType": 0,
							"isPresent": 0,
							"nonRecoverableTaxRate": 0,
							"rcvAddrType": 0,
							"rcvVendor": 0,
							"rcvCustomer": "",
							"tradePath": 1852042374122307592,
							"tradePathName": "01路径",
							"tcOrgIdSon": "1631969031461273603",
							"tcOrgAccountSon": 0,
							"invoicedQuantityMU": 10,
							"invoicedQuantityPU": 10,
							"invoicedMoneyTC": 10,
							"invoicedMoneyFC": 10,
							"totalPaymentTC": 10,
							"totalPaymentFC": 10
						},
						"orderMaterial": [
							{
								"id": 2251405962793217,
								"requirementDate": 0,
								"bomId": 2227281346762496,
								"supDirectShip": false,
								"scrap": 0,
								"bomMaterialId": 2227281346762497,
								"supplyType": "0",
								"truncUp": 0,
								"mustLossQuantity": 0,
								"usageType": 1,
								"fixedQuantity": 0,
								"alternateType": 0,
								"isWholeSet": false,
								"changeRate": 1,
								"changeType": 0,
								"orgId": "1866605942198528",
								"materialId": 1869781485211904,
								"productId": 1869781477576960,
								"materialCode": "LCL3",
								"materialName": "L材料3",
								"skuId": 1869781481902336,
								"skuCode": "LCL3",
								"skuName": "L材料3",
								"mainUnitId": "1869676091724032",
								"mainUnitName": "件",
								"mainUnitPrecision": "3",
								"mainUnitTruncationType": "4",
								"numeratorQuantity": 1,
								"denominatorQuantity": 1,
								"unitUseQuantity": 0.51,
								"stockUnitId": 1869676091724032,
								"stockUnitName": "件",
								"stockUnitPrecision": "3",
								"stockUnitTruncationType": "4",
								"recipientQuantity": 0.51,
								"auxiliaryRecipientQuantity": 0.51,
								"orderProductId": 2251405962793216,
								"freeCharacteristics": {},
								"attributeCharacteristics": {},
								"materialDefineDts": {},
								"pubts": 1620614914965,
								"receivedQuantity": 10,
								"auxiliaryReceivedQuantity": 10,
								"excessRecipientQty": 10,
								"auxiliaryExcessRecipientQty": 10,
								"transferQuantity": 10,
								"auxiliaryTransferQuantity": 10
							}
						],
						"orderSubcontractProductConsult": {
							"requireSign": true,
							"signType": 0,
							"signerTenant": "",
							"signerEnterpriseId": 0
						},
						"incomingQuantity": 10,
						"incomingAuxiliaryQuantity": 10,
						"offChartReceiptIsAllowed": false,
						"produceDate": "2025-10-30",
						"expirationDate": "2025-10-30",
						"batchNo": "PC20251027001"
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
0	未传入优惠券档案id	coupon_id值填写有误
999	取决于错误类型，不同错误信息不同	

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

