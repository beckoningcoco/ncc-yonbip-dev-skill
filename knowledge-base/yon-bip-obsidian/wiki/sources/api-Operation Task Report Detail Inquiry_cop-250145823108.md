---
title: "工序任务汇报详情查询V1"
apiId: "2501458231081041928"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Operation Task Report"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Task Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序任务汇报详情查询V1

>  请求方式	GET | Operation Task Report (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MFC/taskreport/detail
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	单据id，id和code同时传入时，以id为准，无论id是否正确。优先级：id > code    示例: 1454290941682647041
code	string	query	否	单据code，id和code同时传入时，以id为准，无论id是否正确。优先级：id > code    示例: SFTR20220514000002

## 3. 请求示例

Url: /yonbip/MFC/taskreport/detail?access_token=访问令牌&id=1454290941682647041&code=SFTR20220514000002

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
data	object	否	返回数据信息
id	number
小数位数:0,最大长度:38	否	主键 示例：1454290941682647000
orgName	string	否	工厂名称 示例：Amy测试
barCode	string	否	单据条码 示例：po_production_order|1454289971020038149
unauditStaff	string	否	弃审人
auditTime	string	否	审核时间 示例：2022-05-16 16:20:17
status	number
小数位数:0,最大长度:38	否	状态 示例：31
code	string	否	单据编码 示例：SFTR20220514000002
orgId	string	否	工厂id 示例：2036615013323008
vouchdate	string	否	业务日期 示例：2022-05-14 00:00:00
pubts	string	否	时间戳 示例：2022-05-16 17:29:56
auditDate	string	否	审核日期 示例：2022-05-16 00:00:00
auditor	string	否	审核人 示例：逯江南
createTime	string	否	创建时间 示例：2022-05-14 12:15:48
cancelTime	string	否	取消检验确认时间 示例：2022-05-16 17:29:52
transTypeId	string	否	交易类型 示例：1528603170335358985
transTypeCode	string	否	交易类型编码 示例：CC02
transTypeName	string	否	交易类型名称 示例：完工不汇报
proceTaskReportLineList	object	是	工序任务汇报

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 1454290941682647000,
		"orgName": "Amy测试",
		"barCode": "po_production_order|1454289971020038149",
		"unauditStaff": "",
		"auditTime": "2022-05-16 16:20:17",
		"status": 31,
		"code": "SFTR20220514000002",
		"orgId": "2036615013323008",
		"vouchdate": "2022-05-14 00:00:00",
		"pubts": "2022-05-16 17:29:56",
		"auditDate": "2022-05-16 00:00:00",
		"auditor": "逯江南",
		"createTime": "2022-05-14 12:15:48",
		"cancelTime": "2022-05-16 17:29:52",
		"transTypeId": "1528603170335358985",
		"transTypeCode": "CC02",
		"transTypeName": "完工不汇报",
		"proceTaskReportLineList": [
			{
				"orderProductLineNo": 10,
				"qualityCheckPoint": 1,
				"deptName": "Sylvia001",
				"outConversionRate": 1,
				"isExpiryDateManage": false,
				"prevProcessNo": 10,
				"orderId": 1454289498573111300,
				"proceTaskReportLineDetailList": [
					{
						"reportType": 1,
						"proQty": 100,
						"proceTaskId": 1575242641134583800,
						"lineno": 10,
						"productCode": "000057",
						"mainQty": 100,
						"totalTurnNum": 90,
						"totalTurnNum1": 90,
						"totalTurnNum2": 90,
						"outQty": 0,
						"processInCharge": 1454289498573110200,
						"teamInCharge": "",
						"userInCharge": "",
						"recommendReworkProcessId": 1575242641134583820,
						"id": 1575242641134583800,
						"pubts": "2022-10-24 11:33:00",
						"productId": 1570872254194516000,
						"productName": "物料-普通物料1",
						"scrapNoStockQty": 100,
						"totalStockQty": 100
					}
				],
				"outReworkNum": 0,
				"workcenterName": "车间管理-机加工",
				"transferDate": "2022-05-14 12:15:26",
				"prodUnitId": 2008299568156928,
				"productName": "台式机",
				"proQualifiedNum": 5,
				"id": 1454290941682647001,
				"mainFinishNum": 5,
				"outputUnitTruncationType": 4,
				"scheduleEndTime": "2022-05-25 23:59:00",
				"prodUnitPrecision": 3,
				"standardProcessId": 2552910279381760,
				"orgName": "",
				"productId": 2037661108424960,
				"unitName": "台",
				"deptId": "2540542625550592",
				"procePlanId": 1454289971020038149,
				"outputUnitPrecision": 3,
				"orderProductId": 1454289498573111300,
				"outProdType": 1,
				"unitTruncationType": 4,
				"cancelStaff": "",
				"prodUnitName": "台",
				"checkUser": "逯江南",
				"orderProcessId": 1454289498573111300,
				"isAutohandover": 1,
				"actualEndTime": "2022-05-25 23:59:00",
				"outScrapNum": 0,
				"standardProcessName": "木工",
				"mainScrapNum": 0,
				"prevProcessId": 1586364776754184204,
				"firstChildId": 1586364776754184201,
				"outFinishNum": 5,
				"outputUnitName": "台",
				"equipName": "设备8号",
				"actualStartTime": "2022-04-28 00:00:00",
				"outTotalQualifiedJoinNum": 45,
				"proScrapNum": 0,
				"scheduleStartTime": "2022-04-28 00:00:00",
				"mainQualifiedNum": 5,
				"mainTotalQualifiedJoinNum": 45,
				"unitId": 2008299568156928,
				"processType": 0,
				"workcenterId": 2550552316875264,
				"pubts": "2022-05-16 17:29:56",
				"proFinishNum": 5,
				"standardProcessCode": "4788-02",
				"prodConversionRate": 1,
				"proReworkNum": 0,
				"outputUnitId": 2008299568156928,
				"shiftId": "2267136815678881819",
				"shiftIdName": "班次A",
				"teamId": "2552958929326848",
				"teamIdName": "班组owen",
				"unitPrecision": 3,
				"timeUnit": 1,
				"deviceActualProcessTime": 10,
				"staffActualProcessTime": 10,
				"planProcessTime": 10,
				"planPrepareTime": 10,
				"deviceActualPrepareTime": 10,
				"staffActualPrepareTime": 10,
				"productCode": "1035000001",
				"proTotalQualifiedJoinNum": 45,
				"orderProcessSn": 10,
				"outQualifiedNum": 5,
				"mainReworkNum": 0,
				"prodUnitTruncationType": 4,
				"orderCode": "CCCC220514012055",
				"totalRequestNum": 1,
				"totalCheckNum": 2,
				"producedate": "2022-08-22 00:00:00",
				"expireDateNo": 3,
				"expireDateUnit": 1,
				"invaliddate": "2025-08-21 00:00:00",
				"firstType": "",
				"firstCode": "",
				"firstLineno": 0,
				"proTotalReworkHandledNum": 30,
				"outTotalReworkHandledNum": 30,
				"mainTotalReworkHandledNum": 30,
				"outTotalReworkJoinNum": 20,
				"proTotalReworkJoinNum": 20,
				"mainTotalReworkJoinNum": 10,
				"totalScrapJoinNum": 20,
				"totalScrapJoinNum1": 20,
				"totalScrapJoinNum2": 20,
				"batchNo": "",
				"batch": 0,
				"nextProcessNo": 20,
				"transferTaskId": 1592272186439630853,
				"nextProcessId": 0,
				"cardSourceOutProdId": 0,
				"processFlowId": 0,
				"isFinalReport": 0,
				"storeOrgName": "Amy测试",
				"locationId": 1592272186439630853,
				"locationName": "AAA",
				"storageId": 1592272186439630853,
				"storageName": "A1",
				"isScrapStorage": 0,
				"isOutsource": 1,
				"vendorId": 1592272186439630853,
				"vendorName": "供应商",
				"projectId": "2681803919200512",
				"projectCode": "projectcode",
				"projectName": "项目",
				"wbs": "2681803919200512",
				"wbsCode": "wbscode",
				"wbsName": "任务",
				"activity": 2681803919200512,
				"activityCode": "activityCode",
				"activityName": "活动",
				"stockStatus": 0,
				"inspectionStatus": 0,
				"proceTaskReportLineDeviceList": [
					{
						"lineno": 10,
						"actualPrepareTime": 1,
						"timeType": 1,
						"id": 1898068858572898312,
						"mainId": 1895281940215365649,
						"actualProcessTime": 1,
						"pubts": "2024-01-02 11:04:05",
						"userName": "韩佳佳",
						"userId": 1809895258761723912,
						"equipName": "设备1",
						"deviceId": 1809876094612930565
					}
				],
				"proceTaskReportLineSnList": [
					{
						"lineNo": 10,
						"id": 1570872254194515974,
						"proceTaskLineId": 1570872254194515111,
						"childId": 1570872254194515112,
						"detailLineNo": 10,
						"sn": "SN00002854",
						"pubts": "2022-10-24 11:33:00"
					}
				],
				"opSequenceId": 1500079555282206736,
				"opSequenceType": 0,
				"sequenceNum": 1
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
999	取决于错误类型，以实际返回内容尾为准	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-10	
更新
返回参数 (11)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

