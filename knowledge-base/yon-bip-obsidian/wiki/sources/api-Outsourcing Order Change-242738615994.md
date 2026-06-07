---
title: "委外订单变更新增"
apiId: "2427386159943385093"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontract Order Change"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontract Order Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外订单变更新增

>  请求方式	POST | Subcontract Order Change (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MFC/subcontractchangeorder/save
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
data	object	是	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
originalOrderId	string	否	是	原单订单id
remark	string	否	否	备注
reasonMemo	string	否	是	变更原因 示例：变更原因
orderSubcontract	object	否	否	委外订单委外信息变更
orderProductChange	object	是	否	委外订单产品变更

## 3. 请求示例

Url: /yonbip/MFC/subcontractchangeorder/save?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"originalOrderId": "",
			"remark": "",
			"reasonMemo": "变更原因",
			"orderSubcontract": {
				"departmentCode": "D01",
				"operatorCode": ""
			},
			"orderProductChange": [
				{
					"lineStatus": "",
					"originalOrderProductId": "",
					"changeRate": 0,
					"startDate": "2021-05-08",
					"orgCode": "",
					"warehouseCode": "",
					"remark": "",
					"retMaterialApplyFlag": 0,
					"offChartReceiptIsAllowed": false,
					"orderSubcontractProduct": {
						"discountTaxType": "",
						"taxRateCode": "",
						"subcontractQuantityMU": 0,
						"subcontractQuantitySU": 0,
						"subcontractUnitCode": "",
						"subcontractQuantityPU": 0,
						"priceUnitCode": "",
						"subcontractToPrice": 0,
						"oriTaxUnitPrice": 0,
						"oriUnitPrice": 0,
						"oriSum": 0,
						"oriMoney": 0,
						"deliveryDate": "2021-05-08",
						"tcOrgIdSon": "1631969031461273603",
						"demandOrgId": "1631969031461273603"
					},
					"orderMaterialChange": [
						{
							"lineStatus": "",
							"originalMaterialId": "",
							"lineNo": 0,
							"productId": "",
							"productCode": "",
							"denominatorQuantity": 0,
							"numeratorQuantity": 0,
							"recipientQuantity": 0,
							"auxiliaryRecipientQuantity": 0,
							"changeRate": 0,
							"orgCode": "",
							"stockUnitId": "",
							"scrap": 0,
							"requirementDate": "2026-06-07",
							"supplyType": "",
							"warehouseId": "",
							"transferOutWarehouseId": "",
							"tranferOutOrgId": "",
							"isWholeSet": true,
							"verificationBy": "",
							"supDirectShip": true,
							"subcontractSupplyType": "",
							"remark": ""
						}
					],
					"orderByProductChange": [
						{
							"lineStatus": "",
							"originalByProductId": "",
							"lineNo": 0,
							"productId": "",
							"productCode": "",
							"numeratorQuantity": 0,
							"denominatorQuantity": 0,
							"quantity": 0,
							"auxiliaryQuantity": 0,
							"productionUnitId": "",
							"changeRate": 0,
							"productionDate": "2026-06-07",
							"orgId": "",
							"warehouseId": "",
							"remark": ""
						}
					]
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
				"orderSubcontract": {
					"departmentId": "1870534089855232",
					"operatorId": "",
					"tcId": "",
					"taxRateId": "",
					"invoiceVendorId": "",
					"tcOrgId": "",
					"tcFCExchRateType": "",
					"tcFCExchRate": 0,
					"fcId": "",
					"isTaxPrice": ""
				},
				"orderProductChange": [
					{
						"id": 2251405962793216,
						"orgId": "1866605942198528",
						"startDate": "2021-08-27",
						"materialId": 1869775823737088,
						"productId": 1869775818379520,
						"mainUnit": "",
						"changeType": 0,
						"changeRate": 1,
						"warehouseId": "",
						"orderId": 2251405962776832,
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
							"rcvVendor": 0,
							"tcOrgIdSon": "1631969031461273603"
						},
						"orderMaterialChange": [
							{
								"id": 2251405962793217,
								"lineNo": "",
								"requirementDate": 0,
								"supplyType": "0",
								"changeRate": 1,
								"orgId": "1866605942198528",
								"productId": 1869781477576960,
								"mainUnitId": "1869676091724032",
								"numeratorQuantity": 1,
								"denominatorQuantity": 1,
								"unitUseQuantity": 0.51,
								"stockUnitId": 1869676091724032,
								"recipientQuantity": 0.51,
								"auxiliaryRecipientQuantity": 0.51
							}
						],
						"orderByProductChange": [
							{
								"id": "",
								"lineNo": "",
								"numeratorQuantity": 0,
								"denominatorQuantity": 0,
								"quantity": 0,
								"auxiliaryQuantity": 0,
								"productionUnitId": "",
								"productionDate": "2026-06-07",
								"orgId": ""
							}
						]
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

