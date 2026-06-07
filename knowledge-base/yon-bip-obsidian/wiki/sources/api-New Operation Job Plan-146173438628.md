---
title: "工序作业计划列表查询"
apiId: "1461734386280431616"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Operation Job Plan"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Job Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序作业计划列表查询

>  请求方式	POST | Operation Job Plan (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/procedureplan/list
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
page	object	否	是	分页信息
pageSize	int	否	否	每页记录数 示例：20 默认值：20
pageIndex	int	否	否	当前页码 示例：1 默认值：1
status	int	否	否	单据状态-枚举：0-开立，1-已审核，32-已开工，33-已完工 示例：0
orgId	object	是	否	工厂
id	long	否	否	工厂id，工厂id、工厂code必输一个，都存在时以id为准 示例：2036615013323008
code	string	否	否	工厂code，工厂id、工厂code必输一个，都存在时以id为准 示例：amy1
code	string	否	否	车间任务编号 示例：SFOP202202224101
workCenterId	object	是	否	工作中心
id	long	否	否	工作中心id，工作中心id存在时以id为准 示例：2552957794358016
code	string	否	否	工作中心code，工作中心id存在时以id为准 示例：w01
orderCode	string	否	否	生产订单号（模糊匹配）
productionDepartmentId	object	是	否	生产部门
id	long	否	否	生产部门id，生产部门id存在时以id为准 示例：2036621953847552
code	string	否	否	生产部门code，生产部门id存在时以id为准 示例：D01
vouchdate	object	否	否	单据日期
start	DateTime	否	否	单据日期开始 示例：2022-01-01
end	DateTime	否	否	单据日期结束 示例：2022-01-31
productId	object	是	否	物料
id	long	否	否	物料id，物料id存在时以id为准 示例：2322668704796928
code	string	否	否	物料code，物料id存在时以id为准 示例：P01
shiftId	object	是	否	班次
id	number
小数位数:0,最大长度:19	否	否	班次id，班次id和code同时存在时，优先级id>code 示例：2267784556870893595
code	string	否	否	班次code，班次id和code同时存在时，优先级id>code 示例：BC
teamId	object	是	否	班组
id	long	否	否	班组id,班组id存在时以id为准 示例：1518230764212715527
code	string	否	否	班组code,班组id存在时以id为准 示例：owen
operationId	object	是	否	标准工序
id	long	否	否	标准工序id，标准工序id存在时以id为准 示例：2552909818614528
code	string	否	否	标准工序code，标准工序id存在时以id为准 示例：O01
simple	object	否	否	扩展查询条件
open_pubts_begin	string	否	否	时间戳，开始时间 示例：2022-04-01 00:00:00
open_pubts_end	string	否	否	时间戳，结束时间 示例：2022-05-01 00:00:00
isSum	int	否	否	只显示主表-枚举，1-是，0-否，默认：是，为否时会返回子表信息 示例：1 默认值：1
scheduleId	string	否	否	排程ID，调用方通过新增与分派接口传入 示例：2552909818614530
staffId	object	是	否	员工
id	number
小数位数:0,最大长度:19	否	否	员工id，员工id存在时以id为准 示例：2095502217346809863
code	string	否	否	员工code，员工id存在时以id为准 示例：S01
deviceId	object	是	否	设备
id	number
小数位数:0,最大长度:19	否	否	设备id，设备id存在时以id为准 示例：2163049356986941444
code	string	否	否	设备code，设备id存在时以id为准 示例：D01

## 3. 请求示例

Url: /yonbip/mfg/procedureplan/list?access_token=访问令牌
Body: {
	"page": {
		"pageSize": 20,
		"pageIndex": 1
	},
	"status": 0,
	"orgId": [
		{
			"id": 2036615013323008,
			"code": "amy1"
		}
	],
	"code": "SFOP202202224101",
	"workCenterId": [
		{
			"id": 2552957794358016,
			"code": "w01"
		}
	],
	"orderCode": "",
	"productionDepartmentId": [
		{
			"id": 2036621953847552,
			"code": "D01"
		}
	],
	"vouchdate": {
		"start": "2022-01-01",
		"end": "2022-01-31"
	},
	"productId": [
		{
			"id": 2322668704796928,
			"code": "P01"
		}
	],
	"shiftId": [
		{
			"id": 2267784556870893595,
			"code": "BC"
		}
	],
	"teamId": [
		{
			"id": 1518230764212715527,
			"code": "owen"
		}
	],
	"operationId": [
		{
			"id": 2552909818614528,
			"code": "O01"
		}
	],
	"simple": {
		"open_pubts_begin": "2022-04-01 00:00:00",
		"open_pubts_end": "2022-05-01 00:00:00"
	},
	"isSum": 1,
	"scheduleId": "2552909818614530",
	"staffId": [
		{
			"id": 2095502217346809863,
			"code": "S01"
		}
	],
	"deviceId": [
		{
			"id": 2163049356986941444,
			"code": "D01"
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
code	string	否	返回码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据，属性值为空时，不返回
pageIndex	long	否	当前页码 示例：1
pageSize	long	否	每页记录数 示例：20
recordCount	long	否	结果记录数 示例：1
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：1
recordList	object	是	列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"orgId": "2598548330123520",
				"orgName": "Amy测试",
				"productionDepartmentId": "2598549000622336",
				"productionDepartmentName": "生产1",
				"workCenterId": 2599859041652992,
				"workCenterName": "测试1",
				"status": 1,
				"orderId": 2728377273585920,
				"orderProductId": 2728377273585921,
				"orderCode": "SCDD20220412000001",
				"orderLineNo": 10,
				"orderProcessId": 1545023268395679760,
				"vouchdate": "2022-04-12 00:00:00",
				"sn": 10,
				"opSequenceId": 1500079555282206736,
				"opSequenceType": 0,
				"opSequenceNum": 0,
				"code": "SFOP20220412002004",
				"name": "工序作业计划",
				"barCode": "sfc_procPlan|2728387996783104",
				"preSn": 10,
				"nextSn": 20,
				"transTypeId": "2595789730844983",
				"transTypeCode": "OP01",
				"transTypeName": "标准生产",
				"productId": 2728374436974848,
				"productCode": "003000012",
				"productName": "浮动换算率-AAA",
				"isExpiryDateManage": false,
				"batchNo": "1001",
				"producedate": "2022-08-22 00:00:00",
				"expireDateNo": 10,
				"expireDateUnit": 1,
				"invaliddate": "2032-08-21 00:00:00",
				"operationId": 2599859871502592,
				"operationCode": "002",
				"operationName": "工序2",
				"operationControlId": 2594310813716759,
				"operationControlName": "厂内加工检验不报工",
				"costCenterId": 2594310813716759,
				"costCenterName": "成本1",
				"deviceId": [
					"2599859871502592"
				],
				"deviceIdEquipName": "设备1",
				"shiftId": "2267894198776102913",
				"shiftIdName": "班次A",
				"teamId": "1518230764212715527",
				"teamName": "班组owen",
				"staffId": [
					"2594310813716759"
				],
				"staffName": "员工1",
				"warehouseId": 1763014170289635334,
				"warehouseName": "成本仓库",
				"goodsId": 2598574379356416,
				"goodsName": "货架1",
				"scheduleProdNum": 100,
				"scheduleOutputNum": 100,
				"mainUnitId": 2598574379356416,
				"mainUnitIdName": "米",
				"mainUnitIdPrecision": 2,
				"scheduleProdNum1": 100,
				"scheduleOutputNum1": 100,
				"productionUnitId": 2598574379356416,
				"productionUnitIdName": "米",
				"productionUnitIdPrecision": 2,
				"scheduleProdNum2": 100,
				"scheduleOutputNum2": 100,
				"outUnitId": 2598574379356416,
				"outUnitIdName": "米",
				"outUnitIdPrecision": 2,
				"mainChangeRate": 1,
				"outChangeRate": 1,
				"scheduleStartTime": "2020-04-02 00:00:00",
				"scheduleEndTime": "2020-04-03 00:00:00",
				"actualStartTime": "2020-04-02 00:00:00",
				"actualEndTime": "2020-04-03 00:00:00",
				"processMode": 1,
				"processType": 1,
				"dispatchStatus": 0,
				"remark": "描述信息",
				"isHold": 1,
				"holdUserId": "1502474848459292674",
				"holdUserName": "昵称-17600591290",
				"holdDate": "2022-11-03 00:00:00",
				"holdTime": "2022-11-03 20:56:45",
				"holdReasonId": "1567052344630181895",
				"holdReason": "挂起",
				"isClose": 1,
				"closerId": "1502474848459292675",
				"closerName": "昵称-17600591291",
				"closeDate": "2022-11-03 00:00:00",
				"closeTime": "2022-11-03 20:56:45",
				"closeReasonId": "1567052344630181895",
				"closeReason": "关闭",
				"openUserId": "1502474848459292676",
				"openUserName": "昵称-17600591292",
				"openDate": "2022-11-03 00:00:00",
				"openTime": "2022-11-03 20:56:45",
				"isPublish": 1,
				"publishUserId": "1502474848459292677",
				"publishUserName": "昵称-17600591292",
				"publishDate": "2022-11-03 00:00:00",
				"publishTime": "2022-11-03 20:56:45",
				"unpublishUserId": "1502474848459292678",
				"unpublishUserName": "昵称-17600591292",
				"unpublishDate": "2022-11-03 00:00:00",
				"unpublishTime": "2022-11-03 20:56:45",
				"auditorId": "1502474848459292679",
				"auditorName": "昵称-17600591292",
				"auditDate": "2022-11-03 00:00:00",
				"auditTime": "2022-11-03 20:56:45",
				"unauditorId": "1502474848459292680",
				"unauditorName": "昵称-17600591292",
				"unauditDate": "2022-11-03 00:00:00",
				"unauditTime": "2022-11-03 20:56:45",
				"startUserId": "1502474848459292681",
				"startUserName": "昵称-17600591292",
				"startDate": "2022-11-03 00:00:00",
				"startTime": "2022-11-03 20:56:45",
				"unstartUserId": "1502474848459292682",
				"unstartUserName": "昵称-17600591292",
				"unstartDate": "2022-11-03 00:00:00",
				"unstartTime": "2022-11-03 20:56:45",
				"completeUserId": "1502474848459292683",
				"completeUserName": "昵称-17600591292",
				"completeDate": "2022-11-03 00:00:00",
				"completeTime": "2022-11-03 20:56:45",
				"uncompleteUserId": "1502474848459292684",
				"uncompleteUserName": "昵称-17600591292",
				"uncompleteDate": "2022-11-03 00:00:00",
				"uncompleteTime": "2022-11-03 20:56:45",
				"isReportPoint": 1,
				"isAutohandover": 1,
				"isMonitorPoint": 1,
				"isManualCreated": 1,
				"isConfirm": 1,
				"confirmUserId": 2728387996783104,
				"confirmUserIdName": "张三",
				"isCheckConfirm": 1,
				"checkConfirmUserId": 2728387996783104,
				"checkConfirmUserName": "张三",
				"handoverUserId": 2728387996783104,
				"handoverUserName": "张三",
				"handoverTime": "2022-11-03 20:56:45",
				"isApply": 1,
				"isExemptCheck": 1,
				"checkType": 1,
				"firstCheck": "0",
				"firstCheckType": "0",
				"firstCheckStatus": "0",
				"orderStatus": 1,
				"orderIsHold": 1,
				"orderIsClose": 1,
				"schedulePrepareTime": 1,
				"scheduleProcessTime": 2,
				"timeUnit": 1,
				"exeOrgId": "2598527630364160",
				"exeOrgName": "工厂1",
				"isOutsource": 1,
				"preId": 2598527630364161,
				"preIdOperationName": "工序1",
				"nextId": 2598527630364162,
				"nextIdOperationName": "工序2",
				"creatorId": 2598527630364160,
				"creatorIdName": "张三",
				"createTime": "2020-04-02 00:00:00",
				"modifierId": 2598527630364160,
				"modifierIdName": "张三",
				"modifyTime": "2020-04-02 00:00:00",
				"totalTurninNum": 0,
				"totalTurninNum1": 0,
				"totalTurninNum2": 0,
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
				"totalTurnoutReworkNum1": 0,
				"totalTurnoutReworkNum2": 0,
				"totalTurnoutReturnNum": 0,
				"totalTurnoutReturnNum1": 0,
				"totalTurnoutReturnNum2": 0,
				"totalTurnoutDispatchNum": 0,
				"totalTurnoutDispatchNum1": 0,
				"totalTurnoutDispatchNum2": 0,
				"totalReturnNum": 0,
				"totalReturnNum1": 0,
				"totalReturnNum2": 0,
				"totalExecNum": 0,
				"totalExecNum1": 0,
				"totalExecNum2": 0,
				"totalCompleteNum": 0,
				"totalCompleteNum1": 0,
				"totalCompleteNum2": 0,
				"totalQualifiedNum": 0,
				"totalQualifiedNum1": 0,
				"totalQualifiedNum2": 0,
				"totalQualifiedTurnNum": 0,
				"totalQualifiedTurnNum1": 0,
				"totalQualifiedTurnNum2": 0,
				"totalScrapNum": 0,
				"totalScrapNum1": 0,
				"totalScrapNum2": 0,
				"totalReworkNum": 0,
				"totalReworkNum1": 0,
				"totalReworkNum2": 0,
				"totalReworkProcessNum": 0,
				"totalReworkProcessNum1": 0,
				"totalReworkProcessNum2": 0,
				"totalReworkTurnNum": 0,
				"totalReworkTurnNum1": 0,
				"totalReworkTurnNum2": 0,
				"totalTurnNum": 0,
				"totalTurnNum1": 0,
				"totalTurnNum2": 0,
				"qualifiedInNum": 0,
				"qualifiedInNum1": 0,
				"qualifiedInNum2": 0,
				"scrapInNum": 0,
				"scrapInNum1": 0,
				"scrapInNum2": 0,
				"id": 2598549000622336,
				"pubts": "2022-01-01 00:00:00",
				"dataSource": 1,
				"ProcPlanUserDefine": {
					"define1": ""
				},
				"ProcPlanDefine": {
					"define1": ""
				},
				"ProcPlanOutputList": [
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
						"totalScrapNum1": 0,
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
						"totalTurnoutReworkNum1": 0,
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
						"qualifiedInNum2": 0,
						"ProcPlanOutputUserDefine": {
							"define1": ""
						},
						"ProcPlanOutputDefine": {
							"define1": ""
						}
					}
				],
				"projectId": 2681803919200512,
				"projectCode": "projectcode",
				"projectName": "项目",
				"wbs": 2681803919200512,
				"wbsCode": "wbscode",
				"wbsName": "任务",
				"activity": 2681803919200512,
				"activityCode": "activityCode",
				"activityName": "活动",
				"vendorId": 2681803919200512,
				"vendorIdName": "供应商",
				"osmApplicationQty": 1,
				"osmApplicationQty2": 3,
				"osmOrderQty": 1,
				"osmOrderQty2": 3,
				"osmReleasedQty": 1,
				"osmReleasedQty2": 3,
				"ProcPlanDeviceList": [
					{
						"deviceId": "2001366661735120908",
						"deviceEquipName": "设备A"
					}
				],
				"ProcPlanStaffList": [
					{
						"staffId": "2095502217346809863",
						"staffName": "张三"
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
	1	2026-03-24	
更新
请求说明
新增
返回参数 opSequenceId
新增
返回参数 opSequenceType
新增
返回参数 opSequenceNum
更新
返回参数 (18)
	2	2025-06-24	
新增
请求参数 shiftId
新增
请求参数 id
新增
请求参数 code
新增
返回参数 (4)
更新
返回参数 firstCheck

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

