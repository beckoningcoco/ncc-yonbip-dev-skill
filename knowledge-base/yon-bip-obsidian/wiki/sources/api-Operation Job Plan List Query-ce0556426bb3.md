---
title: "工序作业计划详情查询V1"
apiId: "ce0556426bb343eaa85b8e773689f341"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Operation Job Plan"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Job Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序作业计划详情查询V1

>  请求方式	GET | Operation Job Plan (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MFC/procedureplan/detail
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	单据id，单据id与单据code必输一个，都存在时以id为准    示例: 2673275972374784
code	string	query	否	单据code，即车间任务编号，单据id与单据code必输一个，都存在时以id为准    示例: SFOP202112300012

## 3. 请求示例

Url: /yonbip/MFC/procedureplan/detail?access_token=访问令牌&id=2673275972374784&code=SFOP202112300012

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
code	string	否	返回码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据，属性值为空时，不返回
orgId	string	否	工厂ID 示例：2594376494961401
orgName	string	否	工厂 示例：工厂1
vouchdate	string	否	单据日期 示例：2022-01-01
code	string	否	车间任务编号 示例：SFOP2022031400009
name	string	否	名称 示例：工序作业计划
barCode	string	否	单据条码 示例：sfc_procPlan|2687389252866304
transTypeId	string	否	交易类型ID 示例：2687389252866304
transTypeName	string	否	交易类型 示例：标准生产
status	number
小数位数:0,最大长度:38	否	状态：0-开立；1-已审核；32-已开工；33-已完工 示例：0
remark	string	否	描述 示例：描述信息
isHold	number
小数位数:0,最大长度:38	否	挂起 示例：1
isClose	number
小数位数:0,最大长度:38	否	关闭 示例：1
isPublish	number
小数位数:0,最大长度:38	否	发布 示例：1
id	number
小数位数:0,最大长度:38	否	ID 示例：2687389252866304
pubts	string	否	时间戳 示例：2022-01-01 00:00:00
creatorName	string	否	创建人 示例：张三
createTime	string	否	创建时间 示例：2022-01-01 00:00:00
modifierName	string	否	修改人 示例：张三
modifyTime	string	否	修改时间 示例：2022-01-01 00:00:00
dataSource	number
小数位数:0,最大长度:38	否	数据来源 示例：1
ProcPlanUserDefine	object	否	工序作业计划固定自定义项
ProcPlanDefine	object	否	工序作业计划自定义项
ProcPlanDetailList	object	是	工序作业计划明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orgId": "2594376494961401",
		"orgName": "工厂1",
		"vouchdate": "2022-01-01",
		"code": "SFOP2022031400009",
		"name": "工序作业计划",
		"barCode": "sfc_procPlan|2687389252866304",
		"transTypeId": "2687389252866304",
		"transTypeName": "标准生产",
		"status": 0,
		"remark": "描述信息",
		"isHold": 1,
		"isClose": 1,
		"isPublish": 1,
		"id": 2687389252866304,
		"pubts": "2022-01-01 00:00:00",
		"creatorName": "张三",
		"createTime": "2022-01-01 00:00:00",
		"modifierName": "张三",
		"modifyTime": "2022-01-01 00:00:00",
		"dataSource": 1,
		"ProcPlanUserDefine": {
			"define1": ""
		},
		"ProcPlanDefine": {
			"define1": ""
		},
		"ProcPlanDetailList": [
			{
				"lineno": 10,
				"lineStatus": 0,
				"orderId": 2349465007845015555,
				"orderCode": "2025090100002",
				"orderProductId": 2349465016434950150,
				"orderLineNo": 10,
				"orderProcessId": 2349465016434950156,
				"productId": 2313814829361004545,
				"productCode": "0000234221",
				"productName": "钢板",
				"productionDepartmentName": "卫生部",
				"productionDepartmentId": "1665738306320072714",
				"productModelDescription": "GG",
				"isExpiryDateCalculationMethod": 0,
				"isExpiryDateManage": false,
				"batch": 2346532335473917952,
				"producedate": "2022-08-12 00:00:00",
				"invaliddate": "2022-08-13 00:00:00",
				"expireDateNo": 10,
				"expireDateUnit": 1,
				"processType": 0,
				"sn": 10,
				"opSequenceId": 1500079555282206736,
				"opSequenceType": 0,
				"opSequenceNum": 1,
				"operationId": 1700754100936769545,
				"operationCode": "BBB",
				"operationName": "轧钢",
				"workCenterId": 1670226332383445001,
				"workCenterName": "加工中心1",
				"costCenterId": 2687389252866306,
				"costCenterName": "成本中心",
				"exeOrgId": "1525652227072458756",
				"exeOrgName": "组织1",
				"operationControlId": 2687389252866305,
				"operationControlName": "质量检验",
				"shiftId": "2255996615389609991",
				"shiftIdName": "班次-白班",
				"teamId": "2561359238287616",
				"teamName": "班组owen",
				"staffId": "2095566461481254916",
				"staffName": "张三",
				"deviceId": "2001366661735120908",
				"deviceEquipName": "设备A",
				"orderProcessQty": 100.5,
				"orderProcessProdQty": 100.5,
				"orderProcessOutQty": 100.5,
				"scheduleProdNum": 100.5,
				"scheduleProdNum1": 100.5,
				"scheduleProdNum2": 100.5,
				"scheduleOutputNum": 100.5,
				"scheduleOutputNum1": 100.5,
				"scheduleOutputNum2": 100.5,
				"mainUnitId": 2687389252866310,
				"mainUnitIdName": "米",
				"mainUnitIdPrecision": 2,
				"mainUnitIdTruncationType": 0,
				"productionUnitId": 2687389252866310,
				"productionUnitIdName": "米",
				"productionUnitIdPrecision": 2,
				"productionUnitIdTruncationType": 0,
				"mainChangeRate": 1,
				"unitExchangeType": 0,
				"outUnitId": 2687389252866313,
				"outUnitIdName": "米",
				"outUnitIdPrecision": 2,
				"outUnitIdTruncationType": 0,
				"outChangeRate": 1,
				"outExchangeType": 0,
				"scheduleStartTime": "2025-07-29 00:00:00",
				"scheduleEndTime": "2025-07-29 23:59:00",
				"preId": 2687389252866304,
				"preOperationId": 1700754100936769545,
				"preOperationName": "焊接",
				"nextId": 2349465016434950156,
				"nextOperationId": 1736421708398067720,
				"preSn": 10,
				"nextSn": 20,
				"checkType": 0,
				"firstCheck": "0",
				"firstCheckType": "0",
				"firstCheckStatus": "0",
				"isReportPoint": 0,
				"isAutohandover": 0,
				"warehouseId": 2687389252866310,
				"warehouseName": "\t产品仓库",
				"goodsId": 2687389252866310,
				"goodsName": "货位1",
				"schedulePrepareTime": 1,
				"scheduleProcessTime": 10,
				"timeUnit": 1,
				"materialApplyStatus": 0,
				"materialStatus": 0,
				"actualStartTime": "2025-09-01 16:07:15",
				"actualEndTime": "2025-09-02 16:07:15",
				"startUserId": 1525641755939569667,
				"startUserIdName": "张三",
				"startDate": "2025-09-01 00:00:00",
				"startTime": "2025-09-01 16:07:15",
				"isAutoComplete": 0,
				"completeUserId": 1525641755939569667,
				"completeUserName": "张三",
				"completeDate": "2025-09-01 00:00:00",
				"completeTime": "2025-09-01 16:07:15",
				"isOutsource": 0,
				"vendorId": 2681803919200512,
				"vendorIdName": "供应商1",
				"osmApplicationQty": 10.5,
				"osmApplicationQty1": 10.5,
				"osmApplicationQty2": 10.5,
				"osmOrderQty": 10.5,
				"osmOrderQty1": 10.5,
				"osmOrderQty2": 10.5,
				"osmReleasedQty": 10.5,
				"osmReleasedQty1": 10.5,
				"osmReleasedQty2": 10.5,
				"inspectionStatus": 0,
				"stockStatus": 0,
				"projectId": "1525641755939569668",
				"projectCode": "code01",
				"projectName": "项目A",
				"wbs": "1525641755939569669",
				"wbsCode": "00000047",
				"wbsName": "授权项目",
				"activity": 1525641755939569670,
				"activityCode": "code01",
				"activityName": "活动1",
				"totalTurninNum": 10,
				"totalTurninNum1": 10,
				"totalTurninNum2": 10,
				"scrapStockQuantity": 2,
				"scrapStockAuxiliaryQuantity": 2,
				"scrapStockOutQuantity": 2,
				"scrapNoStockQty": 3,
				"scrapNoStockAuxQty": 3,
				"scrapNoStockOutQty": 3,
				"totalExecNum": 10,
				"totalExecNum1": 10,
				"totalExecNum2": 10,
				"totalCompleteNum": 10,
				"totalCompleteNum1": 10,
				"totalCompleteNum2": 10,
				"totalQualifiedNum": 10,
				"totalQualifiedNum1": 10,
				"totalQualifiedNum2": 10,
				"totalScrapNum": 1,
				"totalScrapNum1": 1,
				"totalScrapNum2": 1,
				"totalReworkNum": 1,
				"totalReworkNum1": 1,
				"totalReworkNum2": 1,
				"totalReworkProcessNum": 1,
				"totalReworkProcessNum1": 1,
				"totalReworkProcessNum2": 1,
				"totalTurnNum": 10,
				"totalTurnNum1": 10,
				"totalTurnNum2": 10,
				"totalQualifiedTurnNum": 10,
				"totalQualifiedTurnNum1": 10,
				"totalQualifiedTurnNum2": 10,
				"totalReworkTurnNum": 2,
				"totalReworkTurnNum1": 2,
				"totalReworkTurnNum2": 2,
				"scrapInNum": 2,
				"scrapInNum1": 2,
				"scrapInNum2": 2,
				"breakUpTransferOutQty": 10,
				"breakUpTransferOutQty1": 10,
				"breakUpTransferOutQty2": 10,
				"breakUpTransferInQty": 10,
				"breakUpTransferInQty1": 10,
				"breakUpTransferInQty2": 10,
				"isHold": 1,
				"holdUserId": 1525641755939569667,
				"holdUserName": "张三",
				"holdDate": "2025-09-01 00:00:00",
				"holdTime": "2025-09-01 16:07:15",
				"holdReasonId": 1525641755939568661,
				"holdReason": "关闭",
				"holdDesc": "完工关闭",
				"isClose": 0,
				"closerId": 1525641755939568662,
				"closerName": "张三",
				"closeDate": "2025-09-01 00:00:00",
				"closeTime": "2025-09-01 16:07:15",
				"closeReasonId": 1525641755939568663,
				"closeReason": "关闭",
				"remark": "备注",
				"id": 1525641755939568664,
				"pubts": "2025-09-01 10:10:31",
				"firstupcode": "SCDD250901202",
				"firstsourceautoid": 1525641755939568665,
				"firstsourceautono": 10,
				"firstsource": "1",
				"firstsourceid": 1525641755939568665,
				"sourceautoid": 1525641755939568666,
				"sourceid": 1525641755939568663,
				"makeRuleCode": "productionOrderToProcPlan",
				"sourceGrandchildrenId": 1525641755939568667,
				"source": "1",
				"isSerialNoManage": 0,
				"enableSfcMaterial": 1,
				"isBatchManage": false,
				"ProcPlanDetailOutputList": [
					{
						"productionType": 1,
						"lineId": 2687389552836537,
						"lineno": 10,
						"productId": 2687389252866304,
						"productCode": "AA",
						"productName": "QQ",
						"outQuantity": 1018,
						"productModelDescription": "GG",
						"quantity": 0,
						"mainUnit": 2687389252866304,
						"mainUnitName": "米",
						"mainUnitPrecision": 2,
						"auxiliaryQuantity": 0,
						"productionUnitId": 2687389252866304,
						"productionUnitIdName": "厘米",
						"productionUnitIdPrecision": 2,
						"changeRate": 0,
						"outUnitId": 2687389252866313,
						"outUnitIdName": "厘米",
						"outUnitIdPrecision": 2,
						"outUnitIdTruncationType": 1,
						"outChangeRate": 0,
						"orgId": "2687389252866304",
						"orgName": "库存1",
						"productionDate": "2022-01-01",
						"totalCompleteNum": 0,
						"totalCompleteNum1": 0,
						"totalCompleteNum2": 0,
						"totalQualifiedNum": 0,
						"totalQualifiedNum1": 0,
						"totalQualifiedNum2": 0,
						"totalReworkNum": 0,
						"totalReworkNum1": 0,
						"totalReworkNum2": 0,
						"totalScrapNum": 0,
						"totalScrapNum1\t": 0,
						"totalScrapNum2": 0,
						"isReportConfirm": 0,
						"isCheckConfirm": 0,
						"id": 2687389252866304,
						"pubts": "2022-01-01 00:00:00",
						"totalExecNum": 0,
						"totalExecNum1": 0,
						"totalExecNum2": 0,
						"totalReworkProcessNum": 0,
						"totalReworkProcessNum1": 0,
						"totalReworkProcessNum2": 0,
						"totalTurnNum": 0,
						"totalTurnNum1": 0,
						"totalTurnNum2": 0,
						"totalQualifiedTurnNum": 0,
						"totalQualifiedTurnNum1": 0,
						"totalQualifiedTurnNum2": 0,
						"totalTurnoutNum": 0,
						"totalTurnoutNum1": 0,
						"totalTurnoutNum2": 0,
						"totalTurnoutBackNum": 0,
						"totalTurnoutBackNum1": 0,
						"totalTurnoutBackNum2": 0,
						"totalTurnoutQualifiedNum": 0,
						"totalTurnoutQualifiedNum1": 0,
						"totalTurnoutQualifiedNum2": 0,
						"totalTurnoutScrapNum": 0,
						"totalTurnoutScrapNum1": 0,
						"totalTurnoutScrapNum2": 0,
						"totalTurnoutReworkNum": 0,
						"totalTurnoutReworkNum1\t": 0,
						"totalTurnoutReworkNum2": 0,
						"totalTurnoutReturnNum": 0,
						"totalTurnoutReturnNum1": 0,
						"totalTurnoutReturnNum2": 0,
						"totalReturnNum": 0,
						"totalReturnNum1": 0,
						"totalReturnNum2": 0,
						"totalTurnoutDispatchNum": 0,
						"totalTurnoutDispatchNum1": 0,
						"totalTurnoutDispatchNum2": 0,
						"totalReworkTurnNum": 0,
						"totalReworkTurnNum1": 0,
						"totalReworkTurnNum2": 0,
						"scrapInNum": 0,
						"scrapInNum1": 0,
						"scrapInNum2": 0,
						"totalTurninNum": 0,
						"totalTurninNum1": 0,
						"totalTurninNum2": 0,
						"qualifiedInNum": 0,
						"qualifiedInNum1": 0,
						"qualifiedInNum2": 0
					}
				],
				"ProcPlanDeviceAndStaffList": [
					{
						"deviceEquipName": "设备A",
						"deviceId": "2001366661735120908",
						"staffName": "张三",
						"staffId": "2095566461481254916"
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

