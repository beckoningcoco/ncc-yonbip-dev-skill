---
title: "生产订单保存"
apiId: "1659266984695037953"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "MO"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, MO]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产订单保存

>  请求方式	POST | MO (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/productionorder/create
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
id	long	否	否	主键， 新增时无需填写，修改时必填 示例：1957365595279616
orgId	string	否	否	工厂ID 示例：1866605942198527
orgCode	string	否	是	工厂编码，可以提供工厂id或code 示例：0701
transTypeId	string	否	是	交易类型id，可以提供交易类型的id或code 示例：WWSQ01
productionDepartmentId	string	否	是	生产部门id，可以提供生产部门的id或code 示例：2659083286122752
vouchdate	DateTime	否	是	单据日期，格式“2022-01-01” 示例：2022-01-25
code	string	否	否	单据编号，设置手工编号时必输，自动编号时输入无效 示例：SCDD0220331008014
completionInspection	boolean	否	否	齐套检查。true-是；false-否 示例：true
remark	string	否	否	备注 示例：XX工厂合同
_status	string	否	是	操作标识；Insert:新增，Update:更新 示例：Insert 默认值：Insert
orderUserdefItem	object	否	否	表头固定自定义项(1-60)
orderAttrextItem	object	否	否	表头自由自定义项(1-60)
orderProduct	object	是	否	产品行信息
out_sys_id	string	否	否	外部来源Id 示例：2297527422652672
out_sys_code	string	否	否	外部来源编码 示例：SCDD20230101
out_sys_version	string	否	否	外部系统版本 示例：01
out_sys_type	string	否	否	外部来源类型 示例：u8c
isBeginning	number
小数位数:0,最大长度:1	否	否	期初订单标识，0-否，1-是 示例：0

## 3. 请求示例

Url: /yonbip/mfg/productionorder/create?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1957365595279616,
		"orgId": "1866605942198527",
		"orgCode": "0701",
		"transTypeId": "WWSQ01",
		"productionDepartmentId": "2659083286122752",
		"vouchdate": "2022-01-25",
		"code": "SCDD0220331008014",
		"completionInspection": true,
		"remark": "XX工厂合同",
		"_status": "Insert",
		"orderUserdefItem": {
			"id": "34543454324",
			"define1": "自定义项1"
		},
		"orderAttrextItem": {
			"id": "34543454324",
			"define1": "自由自定义1"
		},
		"orderProduct": [
			{
				"id": 34543454324,
				"productCode": "",
				"productId": 0,
				"materialId": 1869775823737088,
				"materialCode": "000012",
				"skuId": "2302614934802689",
				"batchNo": "5",
				"productionUnitId": "2297527422652672",
				"quantity": 10,
				"auxiliaryQuantity": 10,
				"mrpQuantity": 10,
				"scrap": 10,
				"startDate": "2022-04-02",
				"finishDate": "2022-04-05",
				"orgId": "2325505713575680",
				"bomSelect": "1",
				"bomSubstituteFlag": "1",
				"bomId": "2297527422645672",
				"bomVersion": "1.00",
				"completedFlag": true,
				"enableSFCPlan": true,
				"materialApplyFlag": false,
				"retMaterialApplyFlag": 0,
				"warehouseId": "2325505713575680",
				"remark": "备注信息",
				"procPlanCreateOpty": "2",
				"processMode": "1",
				"sourceType": "1",
				"sourceautoid": "",
				"_status": "Insert",
				"orderProductUserdefItem": {
					"id": "2325505713575680",
					"define1": "产品行固定自定义项1"
				},
				"orderProductAttrextItem": {
					"id": "2325505713575680",
					"define1": "产品行自由自定义项1"
				},
				"orderByProduct": [
					{
						"id": 2325505713575680,
						"productionType": 1,
						"productId": 0,
						"productCode": "",
						"materialId": 1869775823737088,
						"materialCode": "000012",
						"skuId": "2302614934802689",
						"productionUnitId": "2297527422652672",
						"quantity": 10,
						"auxiliaryQuantity": 10,
						"numeratorQuantity": 1,
						"denominatorQuantity": 1,
						"productionDate": "2022-04-03",
						"orgId": "2325505713575680",
						"warehouseId": "",
						"remark": "12345",
						"processId": "",
						"_status": "Insert",
						"orderByProductUserdefItem": {
							"id": "2325505713575680",
							"define1": "固定1"
						},
						"orderByProductAttrextItem": {
							"id": "",
							"define1": "自由1"
						},
						"warehousingQuantity": 10,
						"auxilaryWarehousingQuantity": 10,
						"returnQuantity": 10,
						"returnAuxiliaryQuantity": 10,
						"scrapStockQuantity": 10,
						"scrapStockAuxiliaryQuantity": 10
					}
				],
				"orderMaterial": [
					{
						"id": 1869775823737088,
						"productId": 0,
						"productCode": "",
						"materialId": 1869775823737088,
						"materialCode": "000012",
						"skuId": "2302614934802689",
						"stockUnitId": "2297527422652672",
						"fixedQuantity": 0,
						"numeratorQuantity": 1,
						"denominatorQuantity": 1,
						"scrap": 0,
						"recipientQuantity": 10,
						"auxiliaryRecipientQuantity": 10,
						"processId": "10",
						"supplyType": "0",
						"isWholeSet": false,
						"orgId": "2325505713575680",
						"warehouseId": "",
						"tranferOutOrgId": "2297527422652672",
						"transferOutWarehouseId": "2302614934802689",
						"requirementDate": "2022-04-03",
						"calcCostFlag": 1,
						"remark": "123",
						"_status": "Insert",
						"orderMaterialUserdefItem": {
							"id": "2302614934802689",
							"define1": "材料固定1"
						},
						"orderMaterialAttrextItem": {
							"id": "2302614934802689",
							"define1": "材料自由1"
						},
						"orderMaterialExpinfo": {
							"id": "2302614934802689",
							"isExcess": true,
							"excessType": 1,
							"excessRate": 50,
							"fixedExcessQty": 25,
							"designator": "ESF2132VSEDC56773",
							"wholePoint": "1",
							"keySubPart": false,
							"changeRateNum": 1,
							"changeRateDen": 1,
							"ownertype": 2,
							"inventoryowner": 2302614934802689
						},
						"entrustSupplyType": 1,
						"excessRecipientQty": 10,
						"auxiliaryExcessRecipientQty": 10,
						"transferQuantity": 10,
						"auxiliaryTransferQuantity": 10,
						"receivedQuantity": 10,
						"auxiliaryReceivedQuantity": 10,
						"changeRate": 1
					}
				],
				"orderProcess": [
					{
						"id": 2302614934802689,
						"sn": 10,
						"operationId": "2297527422652672",
						"workCenterId": "2325505713575680",
						"operationControlId": "2297527422652672",
						"planStartDate": "2022-04-03 12:12:00",
						"planEndDate": "2022-04-03 23:59:00",
						"timeUnit": "1",
						"prepareTime": 0,
						"processTime": 0,
						"reportWork": 1,
						"doScheduling": 1,
						"immediateHandover": 1,
						"costCenterId": "2325505713575680",
						"productionUnitId": "2325505713575680",
						"finishWarehouseId": "2325505713575680",
						"finishGoodsId": "2325505713575680",
						"processType": 0,
						"outChangeRate": 1,
						"checkType": 0,
						"firstCheck": "0",
						"firstCheckType": "0",
						"_status": "Insert",
						"orderProcessUserdefItem": {
							"id": "2302614934802689",
							"define1": "工序行固定自定义项1"
						},
						"orderProcessAttrextItem": {
							"id": "2302614934802689",
							"define1": "工序行自由自定义项1"
						},
						"opSequenceNum": 1
					}
				],
				"orderActivity": [
					{
						"id": 2325505713575680,
						"orderProcessId": "2297527422652672",
						"activityType": "2297527422652672",
						"activityQty": 5,
						"usageQty": 0,
						"denominatorQuantity": 1,
						"planUsageQty": 5,
						"_status": "Insert",
						"actualUsageQty": 10
					}
				],
				"projectId": "00000003",
				"out_sys_rowno": "",
				"out_sys_lineid": "",
				"orderSn": [
					{
						"id": 1231231,
						"sn": "1231231231",
						"_status": "Insert"
					}
				],
				"orderProductExpinfo": {
					"machiningCenterId": "229458755452512",
					"firstCheck": "\"0\"",
					"firstCheckType": "\"0\"",
					"changeRateNum": 1,
					"changeRateDen": 1
				},
				"returnQuantity": 10,
				"returnAuxiliaryQuantity": 10,
				"scrapStockQuantity": 10,
				"scrapStockAuxiliaryQuantity": 10,
				"startQuantity": 10,
				"startAuxiliaryQuantity": 10,
				"incomingQuantity": 10,
				"incomingAuxiliaryQuantity": 10,
				"reserveTypeId": "2",
				"reserveid": "2013151751357071368",
				"wbs": "2013151751357071368",
				"changeRate": 1,
				"orderOpSequence": [
					{
						"sequenceNum": 1,
						"name": "1001",
						"srcProcessSn": 10,
						"targetProcessSn": 20,
						"description": "",
						"id": 0,
						"_status": "Insert",
						"opSequenceType": 0
					}
				]
			}
		],
		"out_sys_id": "2297527422652672",
		"out_sys_code": "SCDD20230101",
		"out_sys_version": "01",
		"out_sys_type": "u8c",
		"isBeginning": 0
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
				"orderProduct": [
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
						"orderProcess": [
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
								"firstCheck": "0",
								"firstCheckType": "0",
								"mainChangeRateNum": 1,
								"mainChangeRateDen": 1,
								"outChangeRateNum": 1,
								"outChangeRateDen": 1,
								"opSequenceNum": 1,
								"opSequenceId": 2731645351022854
							}
						],
						"orderMaterial": [
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
								"orderMaterialExpinfo": {
									"excessQty": 20,
									"auxiliaryExcessQty": 20,
									"isExcess": true,
									"excessType": 1,
									"excessRate": 50,
									"fixedExcessQty": 20,
									"designator": "EW32421FDS3232S",
									"wholePoint": "1",
									"keySubPart": false,
									"changeRateNum": 1,
									"changeRateDen": 1,
									"bomUnitChangeRateNum": 1,
									"bomUnitChangeRateDen": 1
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
						"orderByProduct": [
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
								"pubts": "2022-04-15 10:31:21",
								"changeRateNum": 1,
								"changeRateDen": 1
							}
						],
						"orgName": "Amy测试",
						"out_sys_rowno": "",
						"orderProductExpinfo!machiningCenterId": "2322662224417024",
						"orgCode": "amy",
						"productUnitName": "个",
						"productUnitTruncationType": 0,
						"mainFormulaId": "2036615013323008",
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
						"out_sys_lineid": "",
						"orderSn": [
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
						"orderProductExpinfo": {
							"machiningCenterCode": "02",
							"machiningCenterName": "加工中心名称02",
							"firstCheck": "0",
							"firstCheckType": "0",
							"firstCheckStatus": "0",
							"changeRateNum": 1,
							"changeRateDen": 1,
							"bomUnitChangeRateNum": 1,
							"bomUnitChangeRateDen": 1
						},
						"reserveTypeId": "",
						"reserveTypeId_name": "",
						"reserveid_demandtype": "",
						"reserveid": "",
						"reserveid_name": "",
						"orderOpSequence": [
							{
								"sequenceNum": 1,
								"name": "1001",
								"srcProcessSn": 10,
								"targetProcessSn": 20,
								"description": "",
								"orderProductId": 2035345314517248,
								"srcProcessId": 2035345314517246,
								"targetProcessId": 2035345314517244,
								"opSequenceType": 0
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
				"out_sys_type": "u8c",
				"productionMode": 1
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
	1	2026-03-30	
新增
请求参数 (19)
更新
请求参数 (44)
新增
返回参数 (27)
更新
返回参数 (34)
货主
	2	2025-12-01	
新增
请求参数 reserveTypeId
新增
请求参数 reserveid
新增
请求参数 wbs
新增
返回参数 (7)
支持wbs录入
	3	2025-09-05	
更新
请求参数 (4)
更新
返回参数 (7)
作业改名资源
	4	2025-06-24	
新增
请求参数 (24)
新增
返回参数 firstCheck
新增
返回参数 firstCheckType
更新
返回参数 (40)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

