---
title: "工序任务汇报列表查询"
apiId: "1435846479501066240"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Operation Task Report"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Task Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序任务汇报列表查询

>  请求方式	POST | Operation Task Report (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/taskreport/list
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
page	object	否	是	分页信息
pageIndex	int	否	否	页号 示例：1 默认值：1
pageSize	int	否	否	每页行数 示例：20 默认值：20
orgId	object	是	否	工厂
id	long	否	否	工厂id，工厂id和工厂code必输其一，都存在时以id为准 示例：2036615013323009
code	string	否	否	工厂code，工厂id和工厂code必输其一，都存在时以id为准 示例：Amy
status	string	否	否	状态；0，开立；1，审核；31，质检完成； 示例：0
vouchdate	object	否	否	业务日期
start	DateTime	否	否	业务开始时间 示例：2022-05-17 00:00:00
end	DateTime	否	否	业务结束时间 示例：2022-05-17 00:00:00
actualStartTime	object	否	否	实际开工日期
start	DateTime	否	否	开工日期开始 示例：2022-05-17 00:00:00
end	DateTime	否	否	开工日期结束 示例：2022-05-17 00:00:00
actualEndTime	object	否	否	实际完工日期
start	DateTime	否	否	完工日期开始 示例：2022-05-17 00:00:00
end	DateTime	否	否	完工日期结束 示例：2022-05-17 00:00:00
productId	object	是	否	物料
id	long	否	否	物料id 示例：2322662224417024
code	string	否	否	物料code，id存在时以id为准 示例：1035000057
orderCode	string	否	否	生产订单号（模糊匹配）
isAutohandover	long	否	否	是否自动交接 0-否；1-是 示例：0
procePlanCode	string	否	否	车间任务编号 示例：任务20221119000001
workcenterId	object	是	否	工作中心
id	long	否	否	工作中心id 示例：2550552785523200
code	string	否	否	工作中心code，id存在时以id为准 示例：C0002
code	string	否	否	汇报单号 示例：SFTR20220415000001
deptId	object	是	否	生产部门
id	long	否	否	生产部门id 示例：2558519233794304
code	string	否	否	生产部门code，id存在时以id为准 示例：57657
qualityCheckPoint	string	否	否	质检方式；0，自检；1，车间检验；2，质量检验； 示例：0
standardProcessId	object	是	否	标准工序
id	long	否	否	标准工序id 示例：2394730783757312
code	string	否	否	标准工序code，id存在时以id为准 示例：4788-02
scheduleStartTime	object	否	否	计划开工日期
start	DateTime	否	否	开工日期开始 示例：2022-05-17 00:00:00
end	DateTime	否	否	开工日期结束 示例：2022-05-17 00:00:00
scheduleEndTime	object	否	否	计划完工日期
start	DateTime	否	否	完工日期开始 示例：2022-05-17 00:00:00
end	DateTime	否	否	完工日期结束 示例：2022-05-17 00:00:00
batchNo	string	否	否	产出批次号,请输入批次号，例：zyj122701 示例：zyj122701
shiftId	object	是	否	班次
id	number
小数位数:0,最大长度:19	否	否	班次id，班次id和code同时存在时，优先级id>code 示例：2267136815678881819
code	string	否	否	班次code，班次id和code同时存在时，优先级id>code 示例：BC
teamId	object	是	否	班组
id	long	否	否	班组ID 示例：1523475941458182148
code	string	否	否	班组编码 示例：0026
pubts	object	否	否	时间戳
start	DateTime	否	否	时间戳开始 示例：2022-05-23 00:00:00
end	DateTime	否	否	时间戳结束 示例：2022-05-23 23:59:59
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名（条件）
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空)
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：conditions条件生效，logicOp同级的其他条件不生效；conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or 示例：and
conditions	object	是	否	下级查询条件

## 3. 请求示例

Url: /yonbip/mfg/taskreport/list?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"orgId": [
		{
			"id": 2036615013323009,
			"code": "Amy"
		}
	],
	"status": "0",
	"vouchdate": {
		"start": "2022-05-17 00:00:00",
		"end": "2022-05-17 00:00:00"
	},
	"actualStartTime": {
		"start": "2022-05-17 00:00:00",
		"end": "2022-05-17 00:00:00"
	},
	"actualEndTime": {
		"start": "2022-05-17 00:00:00",
		"end": "2022-05-17 00:00:00"
	},
	"productId": [
		{
			"id": 2322662224417024,
			"code": "1035000057"
		}
	],
	"orderCode": "",
	"isAutohandover": 0,
	"procePlanCode": "任务20221119000001",
	"workcenterId": [
		{
			"id": 2550552785523200,
			"code": "C0002"
		}
	],
	"code": "SFTR20220415000001",
	"deptId": [
		{
			"id": 2558519233794304,
			"code": "57657"
		}
	],
	"qualityCheckPoint": "0",
	"standardProcessId": [
		{
			"id": 2394730783757312,
			"code": "4788-02"
		}
	],
	"scheduleStartTime": {
		"start": "2022-05-17 00:00:00",
		"end": "2022-05-17 00:00:00"
	},
	"scheduleEndTime": {
		"start": "2022-05-17 00:00:00",
		"end": "2022-05-17 00:00:00"
	},
	"batchNo": "zyj122701",
	"shiftId": [
		{
			"id": 2267136815678881819,
			"code": "BC"
		}
	],
	"teamId": [
		{
			"id": 1523475941458182148,
			"code": "0026"
		}
	],
	"pubts": {
		"start": "2022-05-23 00:00:00",
		"end": "2022-05-23 23:59:59"
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
code	string	否	返回码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
pageIndex	long	否	当前页码 示例：1
pageSize	long	否	每页条数 示例：20
recordCount	long	否	记录条数 示例：1
recordList	object	是	工序任务汇报列表
sumRecordList	object	是	统计明细
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	起始页码 示例：1
endPageIndex	long	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"orderProductLineNo": 10,
				"qualityCheckPoint": 0,
				"deptName": "Amy测试部门",
				"processFlowId": "1575536846376534020",
				"sourceOutProdId": 1575536846376534023,
				"outConversionRate": 3.00218341,
				"orderId": 2659588167471616,
				"modifier": "17600591290",
				"modifierId": 2035345314517248,
				"outReworkNum": 1,
				"workcenterName": "木工车间",
				"transferDate": "2022-02-24 11:12:20",
				"prodUnitId": 2028130784809216,
				"productName": "浮动换算率",
				"mainTotalReworkHandledNum": 3,
				"modifyTime": "2022-02-24 11:16:38",
				"proQualifiedNum": 0.67,
				"id": 2661949929476608,
				"mainFinishNum": 5,
				"scheduleEndTime": "2022-02-28 23:59:00",
				"prodUnitPrecision": 2,
				"standardProcessId": 2552910279381760,
				"orgName": "Amy测试",
				"productId": 2322668704796928,
				"unitName": "千克",
				"deptId": "2036621953847552",
				"procePlanId": 2659591233377025,
				"prevProcessNo": 10,
				"outputUnitPrecision": 2,
				"orderProductId": 2659588167471617,
				"outProdType": 1,
				"materialId": 2322668713120768,
				"outTotalReworkJoinNum": 1,
				"proTotalReworkJoinNum": 1,
				"barCode": "po_production_order|2659591231935232",
				"prodUnitName": "条",
				"proTotalReworkHandledNum": 1,
				"auditorId": 2035345314517248,
				"unauditStaff": "",
				"orderProcessId": 2659588167471621,
				"isAutohandover": 1,
				"auditTime": "2022-02-24 14:42:08",
				"actualEndTime": "2022-02-28 19:56:45",
				"outScrapNum": 0,
				"standardProcessName": "木工",
				"mainScrapNum": 0,
				"unauditStaffId": "",
				"status": 0,
				"mainTotalReworkJoinNum": 3,
				"outFinishNum": 1.67,
				"timeUnit": 1,
				"deviceActualProcessTime": 10,
				"staffActualProcessTime": 10,
				"planProcessTime": 10,
				"planPrepareTime": 10,
				"deviceActualPrepareTime": 10,
				"staffActualPrepareTime": 10,
				"outputUnitName": "条",
				"code": "SFTR20220224002002",
				"actualStartTime": "2022-02-22 19:24:16",
				"prevProcessId": 2659588167471620,
				"outTotalQualifiedJoinNum": 0.67,
				"creatorId": 2035345314517248,
				"orgId": "2036615013323008",
				"proScrapNum": 0,
				"scheduleStartTime": "2022-02-22 00:00:00",
				"vouchdate": "2022-02-24 00:00:00",
				"mainQualifiedNum": 2,
				"mainTotalQualifiedJoinNum": 2,
				"unitId": 2059087164199168,
				"processType": 0,
				"shiftId": "2267136815678881819",
				"shiftIdName": "班次A",
				"teamIdName": "班组owen",
				"workcenterId": 2552958929326848,
				"pubts": "2022-03-14 21:12:32",
				"declarant": "2035345314517248",
				"proFinishNum": 1.67,
				"auditDate": "2022-02-24 00:00:00",
				"standardProcessCode": "4788-02",
				"outTotalReworkHandledNum": 1,
				"creator": "17600591290",
				"prodConversionRate": 3.00218341,
				"proReworkNum": 1,
				"auditor": "17600591290",
				"outputUnitId": 2028130784809216,
				"unitPrecision": 4,
				"totalTurnNum": 3,
				"productCode": "1035000057",
				"proTotalQualifiedJoinNum": 0.67,
				"orderProcessSn": 20,
				"createTime": "2022-02-24 11:15:30",
				"outQualifiedNum": 0.67,
				"mainReworkNum": 3,
				"teamId": "1510197697896251397",
				"orderCode": "sdfwef123",
				"totalTurnNum1": 1,
				"totalTurnNum2": 1,
				"totalRequestNum": 1,
				"totalCheckNum": 2,
				"transTypeId": "1528603170335358985",
				"transTypeName": "完工不汇报",
				"transTypeCode": "CC02",
				"producedate": "2022-08-22 00:00:00",
				"expireDateNo": 10,
				"expireDateUnit": 1,
				"invaliddate": "2032-08-21 00:00:00",
				"storeOrgName": "Amy测试",
				"locationId": 2036615013343008,
				"locationName": "仓库",
				"storageId": 2036615013343008,
				"storageName": "货位",
				"proceTaskReportUserDf": {
					"id": 2036615013343008
				},
				"proceTaskReportDefine": {
					"id": 2036615013343008
				},
				"isScrapStorage": 0,
				"isOutsource": 1,
				"vendorId": 1592272186439630853,
				"vendorName": "供应商",
				"projectId": 2681803919200512,
				"projectCode": "projectcode",
				"projectName": "项目",
				"wbs": 2681803919200512,
				"wbsCode": "wbscode",
				"wbsName": "任务",
				"activity": 2681803919200512,
				"activityCode": "activityCode",
				"activityName": "活动",
				"opSequenceId": 1500079555282206736,
				"opSequenceType": 0,
				"sequenceNum": 1
			}
		],
		"sumRecordList": [
			{
				"mainTotalReworkJoinNum": 3,
				"outFinishNum": 1.67,
				"outTotalReworkHandledNum": 1,
				"outTotalQualifiedJoinNum": 0.67,
				"proReworkNum": 1,
				"outReworkNum": 1,
				"outTotalReworkJoinNum": 1,
				"totalTurnNum": 3,
				"proScrapNum": 0,
				"proTotalReworkJoinNum": 1,
				"mainQualifiedNum": 2,
				"mainTotalReworkHandledNum": 3,
				"proTotalReworkHandledNum": 1,
				"mainTotalQualifiedJoinNum": 2,
				"proTotalQualifiedJoinNum": 0.67,
				"proQualifiedNum": 0.67,
				"outQualifiedNum": 0.67,
				"mainReworkNum": 3,
				"outScrapNum": 0,
				"mainFinishNum": 5,
				"totalTurnNum1": 1,
				"totalTurnNum2": 1,
				"mainScrapNum": 0,
				"proFinishNum": 1.67
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
999	取决于错误类型，以实际返回内容为准	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-27	
新增
返回参数 opSequenceId
新增
返回参数 opSequenceType
新增
返回参数 sequenceNum
更新
返回参数 (9)
	2	2026-02-04	
更新
请求说明
更新
请求参数 (27)
op描述优化
	3	2025-06-24	
更新
请求说明
新增
请求参数 (14)
新增
返回参数 shiftId
新增
返回参数 shiftIdName

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

