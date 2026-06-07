---
title: "生产订单列表查询"
apiId: "4445bb92d19c4703949df7ce873ebe01"
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

# 生产订单列表查询

>  请求方式	POST | MO (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/productionorder/list
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	int	否	否	页号 默认值:1 默认值：1
pageSize	int	否	否	每页行数 默认值:10 默认值：10
id	long	是	否	生产订单
code	string	否	否	生产订单号
status	string	否	否	订单状态： 0-开立，1-已审核，2-已关闭，3-审核中，4-已锁定，5-已开工
transTypeId	string	是	否	交易类型
orgId	string	是	否	工厂
productionDepartmentId	string	是	否	部门
OrderProduct!materialId	long	是	否	制造物料
OrderProduct!productId	long	是	否	物料id,当物料id和物料编码同时填写时,取交集
OrderProduct!startDate	string	否	否	开工日期（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
OrderProduct!finishDate	string	否	否	完工日期（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
createTime	string	否	否	创建时间（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
vouchdate	string	否	否	单据日期（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
isShowProcess	int	否	否	是否展示工序，0-不展示；1-全部工序，2-全部工序（含执行信息）；3-未执行完工序 示例：0 默认值：0
isShowMaterial	boolean	否	否	是否展示材料:true-是,false-否 默认值：false
isShowByProduct	boolean	否	否	是否展示联副产品:true-是,false-否 默认值：false
isShowActivity	boolean	否	否	是否展示资源:true-是,false-否 默认值：false
OrderProduct!completedFlag	string	否	否	启用完工报告：false-否，true-是
simple	object	否	否	simple
orderProduct.productId.code	string	是	否	物料编码,当物料id和物料编码同时填写时,取交集
open_pubts_begin	string	否	否	时间戳，开始时间 示例：2022-04-01 00:00:00
open_pubts_end	string	否	否	时间戳，结束时间 示例：2022-04-20 00:00:00
orderProduct.materialApplyStatus	string	否	否	领料申请状态：0-未申领，1-部分申领，2-全部申领，3-无需申领 示例：0
orderProduct.materialStatus	string	否	否	领料状态：0-未领料，1-部分领用，2-全部领用，3-无需领料，4-超额领料 示例：1
orderProduct.finishedWorkApplyStatus	string	否	否	完工申报状态：0-未申报，1-部分申报，2-全部申报 示例：0
orderProduct.stockStatus	string	否	否	入库状态：0-未入库，1-部分入库，2-全部入库 示例：2
open_auditTime_begin	DateTime	否	否	审核时间,开始时间 示例：2023-02-21 11:22:51
open_auditTime_end	DateTime	否	否	审核时间,结束时间 示例：2023-02-21 11:22:55
open_auditDate_begin	Date	否	否	审核日期,开始日期 示例：2023-02-21
open_auditDate_end	Date	否	否	审核日期,结束日期 示例：2023-02-22
orderProduct.retMaterialApplyFlag	short	否	否	退料申请标识，0-否，1-是 示例：0
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名(条件)
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or 示例：and
conditions	object	是	否	下级查询条件

## 3. 请求示例

Url: /yonbip/mfg/productionorder/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"id": [
		0
	],
	"code": "",
	"status": "",
	"transTypeId": [
		""
	],
	"orgId": [
		""
	],
	"productionDepartmentId": [
		""
	],
	"OrderProduct!materialId": [
		0
	],
	"OrderProduct!productId": [
		0
	],
	"OrderProduct!startDate": "2021-03-02|2021-03-02 23:59:59",
	"OrderProduct!finishDate": "2021-03-02|2021-03-02 23:59:59",
	"createTime": "2021-03-02|2021-03-02 23:59:59",
	"vouchdate": "2021-03-02|2021-03-02 23:59:59",
	"isShowProcess": 0,
	"isShowMaterial": true,
	"isShowByProduct": true,
	"isShowActivity": true,
	"OrderProduct!completedFlag": "",
	"simple": {
		"orderProduct.productId.code": [
			""
		],
		"open_pubts_begin": "2022-04-01 00:00:00",
		"open_pubts_end": "2022-04-20 00:00:00",
		"orderProduct.materialApplyStatus": "0",
		"orderProduct.materialStatus": "1",
		"orderProduct.finishedWorkApplyStatus": "0",
		"orderProduct.stockStatus": "2",
		"open_auditTime_begin": "2023-02-21 11:22:51",
		"open_auditTime_end": "2023-02-21 11:22:55",
		"open_auditDate_begin": "2023-02-21",
		"open_auditDate_end": "2023-02-22",
		"orderProduct.retMaterialApplyFlag": 0
	},
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": "",
			"logicOp": "and",
			"conditions": [
				{
					"field": "",
					"op": "",
					"value1": "",
					"value2": ""
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
code	string	否	返回码，成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
pageIndex	long	否	当前页 示例：1
pageSize	long	否	页大小 示例：20
recordCount	long	否	记录总数 示例：0
recordList	object	是	返回数据对象
sumRecordList	object	是	合计字段集合
pageCount	long	否	总页数 示例：0
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：0
pubts	string	否	时间戳 示例：2021-03-24 15:11:10

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"OrderProduct_materialName": "自行车",
				"OrderProduct_startDate": "2021-03-24 00:00:00",
				"OrderProduct_lineNo": 10,
				"productUnitPrecision": 3,
				"OrderProduct_scrap": 0,
				"OrderProduct_orgId": "1866605942198528",
				"OrderProduct_skuCode": "jq01000001",
				"OrderProduct_materialId": 2061736111296768,
				"transTypeId": "1248018423173517",
				"mainUnitPrecision": 3,
				"id": 2184924571914496,
				"OrderProduct_sourceType": "1",
				"OrderProduct_productId": 2061736079708416,
				"OrderProduct_mrpQuantity": 120,
				"OrderProduct_changeType": 0,
				"departmentName": "生产部",
				"orgName": "L工厂1",
				"auditTime": "2023-02-21 11:22:55",
				"auditDate": "2023-02-22",
				"isWfControlled": false,
				"OrderProduct_quantity": 120,
				"OrderProduct_completedQuantity": 1231,
				"OrderProduct_incomingQuantity": 120,
				"isHold": false,
				"OrderProduct_skuName": "自行车",
				"routingVersion": "1.0",
				"routingCode": "dfasdaf",
				"routingId": 2061736079708413,
				"OrderProduct_completedFlag": true,
				"OrderProduct_materialCode": "jq01000001",
				"OrderProduct_productionUnitId": 1869676091724032,
				"status": 0,
				"returncount": 0,
				"routingName": "工艺",
				"verifystate": 0,
				"code": "SCDD20210324000003",
				"creatorId": 1979891486839040,
				"orderProduct_id": 2184924571914497,
				"orgId": "1866605942198528",
				"vouchdate": "2021-03-24 00:00:00",
				"OrderProduct_auxiliaryQuantity": 120,
				"OrderProduct_materialApplyFlag": false,
				"OrderProduct_mainUnit": 1869676091724032,
				"OrderProduct_mainUnitTruncationType": 4,
				"transTypeName": "标准生产",
				"pubts": "2021-03-24 11:40:13",
				"OrderProduct_skuId": 2061736102007040,
				"OrderProduct_productUnitTruncationType": 4,
				"entrustProcessType": 2,
				"OrderProduct_retMaterialApplyFlag": 0,
				"OrderProduct_orgName": "L工厂1",
				"creator": "18510959384",
				"OrderProduct_finishDate": "2021-03-26 00:00:00",
				"OrderProduct_changeRate": 1,
				"OrderProduct_isHold": false,
				"entrustCustomer": 11232131,
				"OrderProduct_versionCode": "A1",
				"OrderProduct_bomId": 2173985857769728,
				"OrderProduct_productUnitName": "件",
				"OrderProduct_mainUnitName": "件",
				"OrderProduct_materialApplyStatus": 1,
				"OrderProduct_materialStatus": 0,
				"entrustCustomerName": "受托客户",
				"OrderProduct_finishedWorkApplyStatus": 2,
				"OrderProduct_stockStatus": 1,
				"createTime": "2021-03-24 11:40:12",
				"productionDepartmentId": "1870534089855232",
				"offChartReceiptIsAllowed": true,
				"apsLock": 0,
				"dailyschQuantity": 10,
				"dailyschStatus": 0,
				"dailyschConquantity": 10,
				"transTypeCode": "PO-001",
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
						"appliedRetQuantity": 20,
						"auxiliaryAppliedRetQuantity": 20,
						"appliedRetRestQuantity": 20,
						"auxiliaryAppliedRetRestQuantity": 20,
						"excessAppliedRetQty": 20,
						"auxiliaryExcessAppliedRetQty": 20,
						"excessAppliedRetRestQty": 20,
						"auxiliaryExcessAppliedRetRestQty": 20,
						"appliedRestQuantity": 20,
						"auxiliaryAppliedRestQuantity": 20,
						"excessAppliedRestQty": 20,
						"auxiliaryExcessAppliedRestQty": 20,
						"projectId": "",
						"projectCode": "",
						"projectName": "",
						"wbs": "",
						"wbsCode": "",
						"wbsName": "",
						"activity": 0,
						"activityCode": "",
						"activityName": "",
						"cfmReceivedQty": 20,
						"cfmAuxReceivedQty": 20,
						"cfmExcessRecipientQty": 20,
						"cfmExcessAuxQty": 20,
						"cfmReceivedKit": 120
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
						"cfmIncomingQty": 120,
						"cfmIncomingAuxQty": 120,
						"cfmScrapStockQty": 120,
						"cfmScrapStockAuxQty": 120
					}
				],
				"orderProcess": [
					{
						"id": 1471560962252734500,
						"orderId": 1471560962252734500,
						"orderProductId": 1471560962252734500,
						"operationControlId": 2550467569832448,
						"operationCode": "210618001",
						"productUnitPrecision": 8,
						"nextId": 1471560962252734500,
						"doScheduling": 1,
						"transferProcplanProdQty": 1,
						"finishGoodsId": 1471560962252734500,
						"finishWarehouseId": 1471560962252734500,
						"preSn": 1,
						"transferProcplanQty": 1,
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
						"scheduleProdNum2": 1,
						"totalCompleteNum": 1,
						"totalCompleteNum1": 1,
						"totalCompleteNum2": 1,
						"totalQualifiedNum": 1,
						"totalQualifiedNum1": 1,
						"totalQualifiedNum2": 1,
						"totalScrapNum": 1,
						"totalScrapNum1": 1,
						"totalScrapNum2": 1,
						"totalReworkNum": 1,
						"totalReworkNum1": 1,
						"totalReworkNum2": 1,
						"totalReworkProcessNum": 1,
						"totalReworkProcessNum1": 1,
						"totalReworkProcessNum2": 1,
						"totalTurnNum": 1,
						"totalTurnNum1": 1,
						"totalTurnNum2": 1,
						"totalQualifiedTurnNum": 1,
						"totalQualifiedTurnNum1": 1,
						"totalQualifiedTurnNum2": 1,
						"totalReworkTurnNum": 1,
						"totalReworkTurnNum1": 1,
						"totalReworkTurnNum2": 1,
						"scrapInNum": 1,
						"scrapInNum1": 1,
						"scrapInNum2": 1
					}
				],
				"out_sys_id": "2297527422652672",
				"out_sys_code": "SCDD20230101",
				"out_sys_version": "01",
				"out_sys_type": "u8c",
				"OrderProduct_projectId": "",
				"out_sys_rowno": "",
				"out_sys_lineid": "",
				"OrderProduct_projectCode": "",
				"OrderProduct_projectName": "",
				"OrderProduct_wbs": "",
				"OrderProduct_wbsCode": "",
				"OrderProduct_wbsName": "",
				"OrderProduct_activity": 0,
				"OrderProduct_activityCode": "",
				"OrderProduct_activityName": "",
				"cfmIncomingQty": 120,
				"cfmIncomingAuxQty": 120,
				"cfmScrapStockQty": 120,
				"cfmScrapStockAuxQty": 120,
				"cfmReceivedKit": 120,
				"firstCheck": "0",
				"firstCheckType": "0",
				"firstCheckStatus": "0",
				"productionMode": 1,
				"mainFormulaId": "2297527422652672",
				"mainFormulaCode": "Formula001",
				"mainFormulaName": "配方001",
				"mainFormulaVersion": "1.00",
				"OrderProduct_reserveid": "",
				"OrderProduct_reserveid_name": ""
			}
		],
		"sumRecordList": [
			{
				"OrderProduct_auxiliaryQuantity": 120,
				"OrderProduct_quantity": 120,
				"mainUnitPrecision": 3,
				"productUnitPrecision": 3,
				"OrderProduct_mrpQuantity": 120
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pubts": "2021-03-24 15:11:10"
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
	1	2025-11-17	
新增
返回参数 (7)
支持跟踪线索
	2	2025-09-05	
更新
请求参数 isShowActivity
更新
返回参数 (8)
作业改名资源
	3	2025-07-01	
更新
请求参数 orderProduct.materialApplyStatus
更新
请求参数 orderProduct.materialStatus
UCMFG-259274：添加入参描述

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

