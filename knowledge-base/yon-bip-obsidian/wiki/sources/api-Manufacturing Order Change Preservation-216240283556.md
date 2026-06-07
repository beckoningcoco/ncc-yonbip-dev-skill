---
title: "生产订单变更保存"
apiId: "2162402835567214599"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "MO Change"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, MO Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产订单变更保存

>  请求方式	POST | MO Change (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/productionorderchange/create
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
data	object	否	是	业务数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	变更单的生产订单编码，新增时和生产订单id两者不能同时为空 示例：SCDD0220331008014
originalOrderId	number
小数位数:0,最大长度:20	否	否	变更单的生产订单id，新增时和生产订单编码两者不能同时为空 示例：1957365595279618
reasonMemo	string	否	是	变更原因 示例：库存不足
completionInspection	boolean	否	否	齐套检查。true-是；false-否 示例：true
remark	string	否	否	备注 示例：XX工厂合同
_status	string	否	是	操作标识；Insert:新增 示例：Insert 默认值：Insert
orderProductChange	object	是	否	产品行信息

## 3. 请求示例

Url: /yonbip/mfg/productionorderchange/create?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "SCDD0220331008014",
		"originalOrderId": 1957365595279618,
		"reasonMemo": "库存不足",
		"completionInspection": true,
		"remark": "XX工厂合同",
		"_status": "Insert",
		"orderProductChange": [
			{
				"originalOrderProductId": 0,
				"quantity": 10,
				"auxiliaryQuantity": 10,
				"startDate": "2022-04-02",
				"finishDate": "2022-04-05",
				"warehouseId": "2325505713575680",
				"projectId": "00000003",
				"productId": "2297527422652675",
				"_status": "Insert",
				"remark": "备注",
				"ulRate": 100,
				"reserveTypeId": "3",
				"reserveid": "2297527422652679",
				"batchNo": "BN0001",
				"orderMaterialChange": [
					{
						"originalMaterialId": "2297527422652673",
						"productId": "2297527422652675",
						"recipientQuantity": 10,
						"auxiliaryRecipientQuantity": 10,
						"numeratorQuantity": 1,
						"denominatorQuantity": 1,
						"fixedQuantity": 0,
						"calcCostFlag": 1,
						"supplyType": "0",
						"isWholeSet": false,
						"_status": "Insert",
						"orderMaterialChangeExpinfo": {
							"wholePoint": "1",
							"changeRateNum": 1,
							"changeRateDen": 1,
							"ownertype": 2,
							"inventoryowner": 2297527422652675
						},
						"processId": "10",
						"orgId": "2325505713575680",
						"warehouseId": "",
						"remark": "备注",
						"requirementDate": "2022-04-05",
						"changeRate": 1,
						"entrustSupplyType": 1
					}
				],
				"orderProcessChange": [
					{
						"originalProcessId": 2325505713575680,
						"sn": 10,
						"operationId": "2297527422652672",
						"workCenterId": "2325505713575680",
						"operationControlId": "2297527422652672",
						"planStartDate": "2022-04-03 12:12:00",
						"planEndDate": "2022-04-03 23:59:00",
						"isOutsource": 1,
						"vendorId": "",
						"prepareTime": 0,
						"processTime": 0,
						"reportWork": 1,
						"immediateHandover": 1,
						"checkType": 0,
						"_status": "Insert",
						"opSequenceNum": 0
					}
				],
				"orderActivityChange": [
					{
						"originalActivityId": 2297527422652672,
						"orderProcessId": "2297527422652672",
						"activityType": "2297527422652672",
						"activityQty": 5,
						"usageQty": 0,
						"denominatorQuantity": 1,
						"_status": "Insert"
					}
				],
				"orderSnChange": [
					{
						"originalOrderSnId": 1231231,
						"sn": "1231231231",
						"_status": "Insert"
					}
				],
				"orderByProductChange": [
					{
						"_status": "",
						"originalByProductId": 2297527422652672,
						"productId": "2297527422652672",
						"quantity": 1,
						"auxiliaryQuantity": 1,
						"numeratorQuantity": 1,
						"denominatorQuantity": 1,
						"productionUnitId": "2297527422652672",
						"productionDate": "2022-04-02",
						"productionType": "1",
						"processId": "10",
						"warehouseId": "2297527422652674",
						"remark": "1"
					}
				],
				"changeRate": 1,
				"orderProductExpinfo": {
					"changeRateNum": 1,
					"changeRateDen": 1
				},
				"orderOpSequenceChange": [
					{
						"orderProductId": 2297527422652674,
						"id": 2297527422652675,
						"opSequenceType": 0,
						"sequenceNum": 0,
						"name": "",
						"srcProcessSn": 10,
						"targetProcessSn": 20,
						"description": "",
						"_status": "Insert",
						"originalOpSequenceId": 2297527422652672
					}
				]
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
code	string	否	单据编号
code	string	否	单据编号
code	long	否	code 示例：200
message	string	否	message 示例：操作成功
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
data	object	否	返回数据
count	long	否	记录数 示例：1
sucessCount	long	否	成功数 示例：1
failCount	long	否	失败数 示例：0
messages	string	是	数据返回信息汇总
infos	object	是	返回详细信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"resubmitCheckKey": "s12s1121d11f",
				"id": 2731645351022848,
				"orgCode": "amy",
				"orgId": "2036615013323008",
				"transTypeId": "2526279082103040",
				"productionDepartmentId": "2036621953847552",
				"vouchdate": "2022-04-13 00:00:00",
				"completionInspection": false,
				"orderProductChange": [
					{
						"id": 2731645351022849,
						"productionUnitId": 1964431847330048,
						"quantity": 45,
						"startDate": "2022-04-15 00:00:00",
						"finishDate": "2022-04-22 00:00:00",
						"orgId": "2036615013323008",
						"routingId": "2036615013323008",
						"bomSelect": "1",
						"bomId": "2322662224417026",
						"completedFlag": true,
						"materialApplyFlag": false,
						"procPlanCreateOpty": "2",
						"enableSFCPlan": "1",
						"processMode": "1",
						"orderProcessChange": [
							{
								"id": 2731645351022851,
								"sn": 10,
								"processType": "0",
								"operationId": 2394731385312256,
								"operationControlId": 2550467569832448,
								"workCenterId": 2552957794358016,
								"checkType": 1,
								"workCenterCode": "4788-01",
								"workCenterName": "开料车间",
								"operationCode": "alot_seq3",
								"operationName": "标准工序-锻造",
								"operationControlName": "车间检验",
								"operationControlCode": "002",
								"planStartDate": "2022-04-15 00:00:00",
								"planEndDate": "2022-04-22 23:59:00",
								"orgId": "2036615013323008",
								"executeOrgId": "2036615013323008",
								"qty": 45,
								"prodQty": 45,
								"immediateHandover": 1,
								"productionUnitId": 1964431847330048,
								"changeType": 0,
								"mainUnitId": 1964431847330048,
								"mainChangeRate": 1,
								"timeUnit": 1,
								"outUnitId": 1964431847330048,
								"outChangeRate": 1,
								"outChangeType": 0,
								"isOutsource": 0,
								"finishWarehouseId": "2731645351022849",
								"finishWarehouseName": "AMY测试",
								"finishGoodsId": "2731645351022849",
								"finishGoodsName": "库位",
								"orderProductId": 2731645351022849,
								"orderId": 2731645351022848,
								"procPlanCreate": 0,
								"preId": 2731645351022849,
								"preSn": 10,
								"opSequenceNum": 0
							}
						],
						"orderMaterialChange": [
							{
								"id": 2732685406606080,
								"materialCode": "1035000001",
								"fixedQuantity": 0,
								"numeratorQuantity": 1,
								"denominatorQuantity": 1,
								"scrap": 0,
								"recipientQuantity": 123,
								"supplyType": "0",
								"isWholeSet": false,
								"orgId": "2036615013323008",
								"requirementDate": "2022-04-01 00:00:00",
								"orgName": "Amy测试",
								"orgCode": "amy",
								"mainUnitName": "台",
								"mainUnit": 2008299568156928,
								"manufacturingSpecification": "Amy测试:D",
								"productName": "",
								"productCode": "",
								"productId": 2037661108424960,
								"mainUnitPrecision": 3,
								"materialId": 2691961159586048,
								"materilName": "台式机",
								"changeType": 0,
								"stockUnitPrecision": 3,
								"stockUnitName": "台",
								"stockUnitId": 2008299568156928,
								"changeRate": 1,
								"auxiliaryRecipientQuantity": 123,
								"mainDenominatorQuantity": 1,
								"mustLossQuantity": 0,
								"unitUseQuantity": 2.73333333,
								"bomUnitId": 2008299568156928,
								"bomUnitName": "台",
								"bomUnitPrecision": 3,
								"bomUnitUseQuantity": 2.73333333,
								"bomAuxiliaryRecipientQty": 123,
								"mainNumeratorQuantity": 1,
								"bomUnitChangeRate": 1,
								"lineNo": 10,
								"orderProductId": 2731645351022849,
								"calcCostFlag": 1,
								"tenant": 1958606806667520,
								"yTenantId": "aodu0hnj",
								"orderMaterialChangeExpinfo": {
									"excessQty": 20,
									"auxiliaryExcessQty": 20,
									"isExcess": true,
									"excessType": 1,
									"excessRate": 50,
									"fixedExcessQty": 20,
									"designator": "EW32421FDS3232S",
									"wholePoint": "1",
									"keySubPart": false,
									"ownertype": 2,
									"inventoryowner": 1958606806667520
								},
								"entrustSupplyType": 1,
								"bomUnitUseQuantityNoloss": 10,
								"standardQty": 10,
								"bomRequireQty": 10,
								"doubleReplenish": 50,
								"replenishAdjustQuantity": 200,
								"auxiliaryReplenishAdjustQuantity": 200,
								"projectId": "2499380178506496",
								"projectCode": "00000003",
								"projectName": "Y-001",
								"wbs": "1909948643631169537",
								"wbsCode": "00000003",
								"wbsName": "Y-001"
							}
						],
						"orderActivity": [
							{
								"id": 2731645351022852,
								"activityType": 2499380178506496,
								"activityQty": 5,
								"activityUnitPrecision": 2,
								"usageUnit": 2008299172778240,
								"activityUnit": 2008299172778240,
								"activityClass": 0,
								"usageUnitPrecision": 2,
								"activityTypeName": "001",
								"chargeType": "Manual_Declare",
								"isCalcCost": true,
								"activityUnitName": "平方米",
								"usageBasis": 0,
								"activityTypeCode": "001",
								"usageUnitName": "平方米",
								"usageUnitTruncationType": 0,
								"lineNum": 10,
								"usageQty": 1,
								"denominatorQuantity": 1,
								"stdUsageQty": 225,
								"planUsageQty": 5,
								"orderProductId": 2731645351022849,
								"orderId": 2731645351022848
							}
						],
						"orderByProductChange": [
							{
								"id": 2731645351022848,
								"productionType": 1,
								"productName": "",
								"productCode": "",
								"productId": 0,
								"materialId": 1869775823737088,
								"materialCode": "000012",
								"skuId": "1869775823737090",
								"skuCode": "00001212",
								"productionUnitId": "1869775823737091",
								"productUnitName": "个",
								"productUnitPrecision": "4",
								"quantity": 12,
								"numeratorQuantity": 1,
								"denominatorQuantity": 2,
								"productionDate": "2022-04-15 10:31:21",
								"mainUnit": "1869775823737091",
								"mainUnitName": "个",
								"mainUnitPrecision": "3",
								"materilName": "amy测试",
								"changeType": 0,
								"changeRate": 0.5,
								"auxiliaryQuantity": 12,
								"orgId": "amy组织",
								"lineNo": 10,
								"unitUseQuantity": "10",
								"orderProductId": 2322662224417024,
								"pubts": "2022-04-15 10:31:21"
							}
						],
						"orgName": "Amy测试",
						"out_sys_rowno": "",
						"orgCode": "amy",
						"productUnitName": "个",
						"productUnitTruncationType": 0,
						"productUnitPrecision": 4,
						"productCode": "",
						"productName": "",
						"bomVersion": "1.00",
						"productId": 2322662224417024,
						"changeType": 0,
						"retMaterialApplyFlag": 0,
						"materialId": 2322662235395072,
						"materilName": "固定换算率",
						"skuId": "2322662232789248",
						"changeRate": 1,
						"auxiliaryQuantity": 45,
						"mrpQuantity": 45,
						"mainUnitPrecision": 4,
						"mainUnit": 1964431847330048,
						"mainUnitName": "个",
						"lineNo": 10,
						"scrap": 0,
						"bomUnitId": 1964431847330048,
						"bomUnitName": "个",
						"bomUnitChangeRate": 1,
						"bomQuantity": 45,
						"orderId": 2731645351022848,
						"orderSnChange": [
							{
								"id": 273164535102284,
								"sn": "342424",
								"orderProductId": 2731645351022848
							}
						],
						"projectId": "1909948609261469748",
						"projectCode": "00000003",
						"projectName": "Y-001",
						"wbs": "1909948643631169537",
						"wbsCode": "00000003",
						"wbsName": "Y-001",
						"reserveTypeId": "1909948643631169538",
						"reserveTypeId_name": "销售订单行",
						"reserveid_demandtype": "3",
						"reserveid": "1909948643631169539",
						"reserveid_name": "QbOJ#00000#20250825#000005_10",
						"orderProductChangeExpinfo": {
							"machiningCenterCode": "02",
							"machiningCenterName": "加工中心名称02"
						},
						"orderOpSequenceChange": [
							{
								"orderProductId": 1909948643631169539,
								"id": 1909948643631169539,
								"opSequenceType": 0,
								"sequenceNum": 0,
								"name": "",
								"srcProcessSn": 10,
								"targetProcessSn": 20,
								"description": ""
							}
						]
					}
				],
				"transTypeName": "启用车间-订单审核-任务",
				"transTypeCode": "CJ-AUDIT-TASK-01",
				"orgName": "Amy测试",
				"departmentName": "Amy测试部门",
				"defaultBomSelect": 1,
				"isBOMMustInput": true,
				"isStd": false,
				"status": 0,
				"modifier": "17600591290",
				"modifierId": 2035345314517248,
				"modifyTime": "2022-04-15 10:31:21",
				"modifyDate": "2022-04-15 10:31:21",
				"barCode": "po_production_order|2731645351022848",
				"isWfControlled": true,
				"tenant": 1958606806667520,
				"code": "2220414010021",
				"pubts": "2022-04-14 16:53:22",
				"out_sys_id": "1958606806667520",
				"out_sys_code": "20230101",
				"out_sys_version": "01",
				"out_sys_type": "u8c"
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

