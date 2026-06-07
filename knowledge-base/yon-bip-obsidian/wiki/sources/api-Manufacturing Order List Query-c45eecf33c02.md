---
title: "生产订单详情查询"
apiId: "c45eecf33c024999987c391d6a0c7fed"
apiPath: "请求方式	GET"
method: "ContentType"
category: "MO"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, MO]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产订单详情查询

>  请求方式	GET | MO (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/productionorder/detail
请求方式	GET
ContentType	
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	id    默认值: 2184924571914496

## 3. 请求示例

Url: /yonbip/mfg/productionorder/detail?access_token=访问令牌&id=

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
code	long	否	返回码，成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
id	long	否	生产订单id 示例：2184924571914496
code	string	否	生产订单号 示例：SCDD20210324000003
transTypeId	string	否	交易类型Id 示例：1248018423173517
transTypeCode	string	否	交易类型编码 示例：PO-001
entrustProcessType	short	否	受托加工方式: 2-全程受托加工;3-工序受托加工 示例：2
productionMode	number
小数位数:0,最大长度:10	否	生产模式，1-离散制造，2-流程制造 示例：1
transTypeName	string	否	交易类型名称 示例：标准生产
orgId	string	否	工厂Id 示例：1866605942198528
orgName	string	否	工厂 示例：L工厂1
vouchdate	string	否	单据日期 示例：2021-03-24 00:00:00
productionDepartmentId	string	否	生产部门Id 示例：1870534089855232
departmentName	string	否	生产部门 示例：生产部
status	long	否	订单状态： 0-开立，1-已审核，2-已关闭，3-审核中，4-已锁定，5-已开工 示例：1
auditor	string	否	审核人 示例：18510959384
auditDate	string	否	审核日期 示例：2021-03-24 00:00:00
auditTime	string	否	审核时间 示例：2021-03-24 16:20:27
verifystate	long	否	审批状态：0-开立，1-已提交，2-已审批，-1-驳回 示例：2
isWfControlled	boolean	否	是否审批流控制：false-否，true-是 示例：false
isHold	boolean	否	挂起状态：false-否，true-是 示例：false
completionInspection	boolean	否	齐套检查：false-否，true-是 示例：false
creatorId	long	否	创建人Id 示例：1979891486839040
creator	string	否	创建人 示例：18510959384
createTime	string	否	创建时间 示例：2021-03-24 11:40:12
returncount	long	否	返回次数 示例：0
pubts	string	否	时间戳 示例：2021-03-24 16:20:27
orderProduct	object	是	产品信息
out_sys_id	string	否	外部来源Id 示例：2297527422652672
out_sys_code	string	否	外部来源编码 示例：SCDD20230101
out_sys_version	string	否	外部系统版本 示例：01
out_sys_type	string	否	外部来源类型 示例：u8c

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": 2184924571914496,
		"code": "SCDD20210324000003",
		"transTypeId": "1248018423173517",
		"transTypeCode": "PO-001",
		"entrustProcessType": 2,
		"productionMode": 1,
		"transTypeName": "标准生产",
		"orgId": "1866605942198528",
		"orgName": "L工厂1",
		"vouchdate": "2021-03-24 00:00:00",
		"productionDepartmentId": "1870534089855232",
		"departmentName": "生产部",
		"status": 1,
		"auditor": "18510959384",
		"auditDate": "2021-03-24 00:00:00",
		"auditTime": "2021-03-24 16:20:27",
		"verifystate": 2,
		"isWfControlled": false,
		"isHold": false,
		"completionInspection": false,
		"creatorId": 1979891486839040,
		"creator": "18510959384",
		"createTime": "2021-03-24 11:40:12",
		"returncount": 0,
		"pubts": "2021-03-24 16:20:27",
		"orderProduct": [
			{
				"routingVersion": "A1",
				"materialApplyFlag": false,
				"incomingAuxiliaryQuantity": 12,
				"incomingQuantity": 12,
				"auxiliaryQuantity": 120,
				"financeStatus": 0,
				"routingId": 2173977794466048,
				"routingName": "自行车",
				"id": 2184924571914497,
				"orderId": 2184924571914496,
				"isReservation": false,
				"isPushProcedurePlan": false,
				"productUnitPrecision": 3,
				"mainUnitTruncationType": 4,
				"orgId": "1866605942198528",
				"bomUseType": 0,
				"skuName": "自行车",
				"mrpQuantity": 120,
				"scrap": 0,
				"lineNo": 10,
				"isBatchManage": false,
				"isExpiryDateManage": false,
				"mainUnitPrecision": 3,
				"changeRate": 1,
				"bomSelect": "1",
				"skuId": 2061736102007040,
				"mainUnit": 1869676091724032,
				"bomId": 2173985857769728,
				"quantity": 120,
				"firstCheck": "0",
				"mainFormulaId": "2173985857769728",
				"cfmIncomingQty": 120,
				"cfmScrapStockQty": 120,
				"orderProductExpinfo!cfmReceivedKit": 120,
				"retMaterialApplyFlag": 0,
				"orgName": "L工厂1",
				"entrustCustomer": 13122312231,
				"productName": "",
				"productCode": "",
				"productId": 2061736079708416,
				"productUnitTruncationType": 4,
				"changeType": 0,
				"materialCode": "jq01000001",
				"isHold": false,
				"materialId": 2061736111296768,
				"productionUnitId": 1869676091724032,
				"versionCode": "A1",
				"completedFlag": true,
				"mainUnitName": "件",
				"materialName": "自行车",
				"productUnitName": "件",
				"sourceType": "1",
				"finishDate": "2021-03-26 00:00:00",
				"skuCode": "jq01000001",
				"startDate": "2021-03-24 00:00:00",
				"materialApplyStatus": 0,
				"offChartReceiptIsAllowed": true,
				"firstCheckType": "0",
				"mainFormulaCode": "MainFormula001",
				"materialStatus": 0,
				"dailyschQuantity": 10,
				"dailyschStatus": 0,
				"cfmIncomingAuxQty": 120,
				"cfmScrapStockAuxQty": 120,
				"dailyschConquantity": 10,
				"orderMaterial": [
					{
						"isWholeSet": false,
						"receivedQuantity": 40,
						"recipientQuantity": 40,
						"numeratorQuantity": 1,
						"stockUnitPrecision": 7,
						"mainUnitTruncationType": 1,
						"stockUnitName": "个 ",
						"unitUseQuantity": 0.33333333,
						"auxiliaryReceivedQuantity": 40,
						"auxiliaryRecipientQuantity": 40,
						"orgId": "1870887948554496",
						"skuName": "车轮",
						"stockUnitTruncationType": 1,
						"scrap": 0,
						"lineNo": 10,
						"supplyType": "0",
						"mainUnitPrecision": 7,
						"truncUp": 0,
						"substituteFlag": 1,
						"id": 2184924571914498,
						"changeRate": 1,
						"pubts": "2021-03-24 11:40:13",
						"skuId": 2062992424030464,
						"denominatorQuantity": 3,
						"bomId": 2173985857769728,
						"mainUnit": 1986620623900928,
						"fixedQuantity": 0,
						"orgName": "qing-gc001",
						"productName": "",
						"productCode": "",
						"productId": 2062992410120448,
						"changeType": 0,
						"materialCode": "jq01000003",
						"orderProductId": 2184924571914497,
						"materialId": 2062992427503872,
						"bomMaterialId": 2173985857769729,
						"mainUnitName": "个 ",
						"materialName": "车轮",
						"requirementDate": "2021-03-24 00:00:00",
						"skuCode": "jq01000003",
						"stockUnitId": 1986620623900928,
						"mustLossQuantity": 0,
						"calcCostFlag": 1,
						"orderMaterialExpinfo!id": 1471560962252734505,
						"excessAppliedQty": 25,
						"auxiliaryExcessAppliedQty": 25,
						"excessRecipientQty": 25,
						"auxiliaryExcessRecipientQty": 25,
						"orderMaterialExpinfo!excessQty": 25,
						"orderMaterialExpinfo!auxiliaryExcessQty": 25,
						"orderMaterialExpinfo!isExcess": false,
						"orderMaterialExpinfo!excessType": 1,
						"orderMaterialExpinfo!excessRate": 50,
						"orderMaterialExpinfo!fixedExcessQty": 25,
						"orderMaterialExpinfo!designator": "EW32421FDS3232S",
						"orderMaterialExpinfo!wholePoint": "1",
						"appliedRetQuantity": 30,
						"auxiliaryAppliedRetQuantity": 30,
						"appliedRetRestQuantity": 30,
						"auxiliaryAppliedRetRestQuantity": 30,
						"excessAppliedRetQty": 30,
						"auxiliaryExcessAppliedRetQty": 30,
						"excessAppliedRetRestQty": 30,
						"auxiliaryExcessAppliedRetRestQty": 30,
						"appliedRestQuantity": 30,
						"auxiliaryAppliedRestQuantity": 30,
						"excessAppliedRestQty": 30,
						"auxiliaryExcessAppliedRestQty": 30,
						"projectId": "",
						"projectCode": "",
						"projectName": "",
						"wbs": "",
						"wbsCode": "",
						"wbsName": "",
						"activity": 0,
						"activityCode": "",
						"activityName": "",
						"entrustSupplyType": 0,
						"bomUnitUseQuantityNoloss": 10,
						"standardQty": 10,
						"bomRequireQty": 10,
						"doubleReplenish": 50,
						"replenishAdjustQuantity": 200,
						"auxiliaryReplenishAdjustQuantity": 200,
						"orderMaterialExpinfo!keySubPart": false,
						"cfmReceivedQty": 30,
						"cfmAuxReceivedQty": 30,
						"cfmExcessRecipientQty": 30,
						"cfmExcessAuxQty": 30,
						"cfmReceivedKit": 120,
						"orderMaterialExpinfo!changeRateNum": 1,
						"orderMaterialExpinfo!changeRateDen": 1,
						"orderMaterialExpinfo!bomUnitChangeRateNum": 1,
						"orderMaterialExpinfo!bomUnitChangeRateDen": 1,
						"orderMaterialChangeExpinfo!ownertype": 2,
						"orderMaterialChangeExpinfo!inventoryowner": 1471560962252734505,
						"orderMaterialChangeExpinfo!inventoryownerName": "客户11"
					}
				],
				"orderByProduct": [
					{
						"id": 1471560962252734500,
						"orderProductLineNo": 10,
						"manufacturingSpecification": "Amy测试:A",
						"numeratorQuantity": 1,
						"productionType": "1",
						"productUnitPrecision": 8,
						"mainUnitTruncationType": 4,
						"warehouseName": "倒冲仓",
						"unitUseQuantity": 1,
						"orgId": "2036615013323008",
						"orgName": "Amy测试",
						"productName": "",
						"productCode": "",
						"productId": 2037661108424960,
						"skuCode": "10350000010001",
						"skuName": "台式机A",
						"lineNo": 10,
						"productionDate": "2022-06-06 00:00:00",
						"isBatchManage": false,
						"isExpiryDateManage": false,
						"mainUnitPrecision": 8,
						"changeRate": 1,
						"pubts": "2022-06-06 18:44:04",
						"skuId": 2037661108424961,
						"denominatorQuantity": 1,
						"mainUnit": 2008299568156928,
						"quantity": 12,
						"changeType": 0,
						"productUnitTruncationType": 4,
						"orderProductId": 1471560962252734500,
						"materialId": 2037661323661568,
						"productionUnitId": 2008299568156928,
						"mainUnitName": "台",
						"materialName": "台式机",
						"warehouseId": 2533365513196032,
						"offChartReceipt": true,
						"productUnitName": "台",
						"cfmIncomingQty": 30,
						"cfmIncomingAuxQty": 30,
						"cfmScrapStockQty": 30,
						"cfmScrapStockAuxQty": 30,
						"changeRateNum": 1,
						"changeRateDen": 1
					}
				],
				"entrustCustomerName": "受托客户",
				"orderProcess": [
					{
						"id": 1471560962252734500,
						"orderId": 1471560962252734500,
						"orderProductId": 1471560962252734500,
						"operationControlId": "2550467569832448",
						"operationCode": "210618001",
						"productUnitPrecision": 8,
						"vendorId": 1471560962252734500,
						"nextId": 1471560962252734500,
						"doScheduling": 1,
						"workCenterId": 2550552316875264,
						"mainUnitPrecision": 8,
						"executeOrgName": "Amy测试",
						"outUnitId": 2008299568156928,
						"outUnitTruncationType": 4,
						"mainUnitId": 2008299568156928,
						"checkType": 0,
						"orgName": "Amy测试",
						"routingOperationId": 2306807638413569,
						"mainUnitName": "台",
						"prepareTime": 0.3,
						"routingOperationProcessTime": 2,
						"qty": 12,
						"occupyProduction": 0,
						"computingCosts": 0,
						"mainChangeRate": 1,
						"immediateHandover": 1,
						"operationIdRouteDesc": "官方警告",
						"outUnitName": "台",
						"operationControlName": "车间检验",
						"outChangeRate": 1,
						"mainUnitTruncationType": 4,
						"orgId": "2036615013323008",
						"processTime": 24,
						"procPlanCreate": 0,
						"nextSn": 20,
						"prodQty": 12,
						"operationId": 2306798032425216,
						"processType": 0,
						"sn": 10,
						"pubts": "2022-06-06 18:44:04",
						"planStartDate": "2022-06-06 00:00:00",
						"planEndDate": "2022-06-06 23:59:00",
						"workCenterName": "车间管理-机加工",
						"timeUnit": 1,
						"operationControlCode": "002",
						"firstCheck": 0,
						"changeType": 0,
						"productUnitTruncationType": 4,
						"isOutsource": 0,
						"operationName": "工序1234",
						"productionUnitId": 2008299568156928,
						"outUnitPrecision": 8,
						"workCenterCode": "C0001",
						"executeOrgId": "2036615013323008",
						"productUnitName": "台",
						"reportWork": 0,
						"mainChangeRateNum": 1,
						"mainChangeRateDen": 1,
						"outChangeRateNum": 1,
						"outChangeRateDen": 1,
						"opSequenceNum": 1,
						"opSequenceId": 2731645351022854,
						"opSequenceType": 0
					}
				],
				"orderActivity": [
					{
						"id": 0,
						"lineNum": 10,
						"orderId": 1471560962252734500,
						"orderProductId": 1471560962252734500,
						"activityId": 2499381355729664,
						"activityType": 2499380178506496,
						"activityTypeCode": "001",
						"activityTypeName": "001",
						"orderProcessId": 1471560962252734500,
						"opSn": 10,
						"activityClass": 4,
						"workCenterId": 2550552316875264,
						"workCenterCode": "C0001",
						"workCenterName": "车间管理-机加工",
						"operationId": 2306798032425216,
						"operationCode": "210618001",
						"operationName": "工序1234",
						"activityUnit": 1998025388839168,
						"activityUnitName": "箱",
						"activityUnitPrecision": 5,
						"activityUnitTruncationType": 4,
						"usageUnit": 1998025388839168,
						"usageUnitName": "箱",
						"usageUnitPrecision": 5,
						"usageUnitTruncationType": 4,
						"stdUsageQty": 144,
						"planUsageQty": 156,
						"denominatorQuantity": 1,
						"usageQty": 1,
						"isCalcCost": true,
						"activityQty": 13,
						"usageBasis": 0,
						"isAutoCreate": 1,
						"pubts": "2022-06-06 18:45:06"
					}
				],
				"orderSn": {
					"id": 12313123,
					"sn": "234242",
					"orderProductId": 3242424
				},
				"out_sys_rowno": "",
				"out_sys_lineid": "",
				"projectId": "",
				"wbs": "",
				"activity": 0,
				"projectName": "",
				"projectCode": "",
				"wbsCode": "",
				"wbsName": "",
				"activityCode": "",
				"activityName": "",
				"firstCheckStatus": "0",
				"mainFormulaName": "配方1",
				"mainFormulaVersion": "1.00",
				"reserveTypeId": "2",
				"reserveTypeId_name": "",
				"reserveid_demandtype": "",
				"reserveid": "",
				"reserveid_name": "",
				"orderProductExpinfo!changeRateNum": 1,
				"orderProductExpinfo!changeRateDen": 1,
				"orderProductExpinfo!bomUnitChangeRateNum": 1,
				"orderProductExpinfo!bomUnitChangeRateDen": 1,
				"orderOpSequence": [
					{
						"sequenceNum": 1,
						"name": "1001",
						"srcProcessSn": 10,
						"targetProcessSn": 20,
						"description": "",
						"opSequenceType": 0
					}
				]
			}
		],
		"out_sys_id": "2297527422652672",
		"out_sys_code": "SCDD20230101",
		"out_sys_version": "01",
		"out_sys_type": "u8c"
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
	1	2026-04-01	
新增
返回参数 (28)
更新
返回参数 (47)
货主
	2	2025-11-17	
新增
返回参数 (10)
	3	2025-09-05	
更新
返回参数 (8)
作业改名资源

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

