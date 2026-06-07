---
title: "工序产量数据查询"
apiId: "1873740488786837509"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Operation Output"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Output]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序产量数据查询

>  请求方式	POST | Operation Output (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/processoutput/list
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	int	否	是	页号 默认值:1 默认值：1
pageSize	int	否	是	每页行数 默认值:10 默认值：10
orgId	string	是	否	工厂id 示例：[12313123,1231231]
productId	long	否	否	物料id 示例：23432424234
workCenterId	string	否	否	工作中心id 示例：123131231
productionDepartmentId	string	否	否	生产部门id 示例：123213123123
orderId	long	否	否	生产订单id 示例：42342342342423
businessDate	string	否	否	业务日期（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
createDate	string	否	否	创建日期（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
simple	object	否	否	simple
open_pubts_begin	string	否	否	时间戳，开始时间 示例：2020-01-01 00:00:00
open_pubts_end	string	否	否	时间戳，结束时间 示例：2020-01-02 00:00:00
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名(条件)(1.pubts(时间戳)) 2.id(单据ID) 3.sourceType(来源类别 0：手工录入 1：计划订单) 示例：pubts
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or 示例：and
conditions	object	是	否	下级查询条件

## 3. 请求示例

Url: /yonbip/mfg/processoutput/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"orgId": [
		12313123,
		1231231
	],
	"productId": 23432424234,
	"workCenterId": "123131231",
	"productionDepartmentId": "123213123123",
	"orderId": 42342342342423,
	"businessDate": "2021-03-02|2021-03-02 23:59:59",
	"createDate": "2021-03-02|2021-03-02 23:59:59",
	"simple": {
		"open_pubts_begin": "2020-01-01 00:00:00",
		"open_pubts_end": "2020-01-02 00:00:00"
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
code	long	否	返回码，成功时返回200 示例：200
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
data	object	否	接口返回数据
pageIndex	long	否	当前页 示例：1
pageSize	long	否	页大小 示例：20
recordCount	long	否	记录总数 示例：0
recordList	object	是	返回数据对象
pageCount	long	否	总页数 示例：0
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"id": 2573294878692352,
				"orgId": "2573294878692352",
				"orgName": "工厂1",
				"orderProductId": 2573294878692352,
				"orderId": 2573294878692352,
				"orderCode": "SCDD123213122313",
				"lineNo": "10",
				"productId": 2573294878692352,
				"productCode": "erwrw",
				"productName": "3242ewrwr",
				"orderProcessId": 324243242234324,
				"orderProcessSn": "20",
				"opSequenceId": 1500079555282206736,
				"opSequenceType": 0,
				"sequenceNum": 0,
				"processType": "0",
				"isOutsource": 0,
				"isHeadSn": 0,
				"isEndSn": "0",
				"businessDate": "2023-12-1",
				"productionDepartmentId": "321311313",
				"productionDepartmentName": "生产部门",
				"costCenterCode": "12312",
				"costCenterId": "2573294878692352",
				"costCenterName": "成本中心",
				"workCenterName": "工作中心",
				"workCenterCode": "dfafa",
				"workCenterId": 2573294878692352,
				"transferType": 1,
				"quantity": 1,
				"mainUnitId": 2573294878692352,
				"quantityType": 1,
				"teamId": 2573294878692352,
				"teamName": "班组",
				"teamCode": "bz",
				"userId": "12343242342342",
				"userName": "人员1",
				"userCode": "ry",
				"cOrgId": "3213213",
				"cOrgName": "对方组织1",
				"cOrderProcessId": 2573294878692352,
				"cOrderProcessIdSn": "30",
				"cWorkCenterName": "对方工作中心1",
				"cWorkCenterCode": "code1122",
				"cWorkCenterId": 2573294878692352,
				"cProductionDepartmentId": "2573294878692352",
				"cProductionDepartmentName": "部门2",
				"cCostCenterCode": "ewrwr",
				"cCostCenterId": 2573294878692352,
				"cCostCenterName": "成本2",
				"cTeamId": 2573294878692352,
				"cTeamName": "班组2",
				"cTeamCode": "cdoe23232",
				"warehouseId": 2573294878692352,
				"warehouseName": "仓库223",
				"reason": "2573294878692352",
				"rOrgId": "2573294878692352",
				"rOrgName": "zr组织2",
				"rOrderProcessId": 2573294878692352,
				"rOrderProcessIdSn": "40",
				"rProductionDepartmentId": "2573294878692352",
				"rProductionDepartmentName": "责任部门2",
				"reasonReason": "报废",
				"rWorkCenterName": "责任工作中心2",
				"rWorkCenterId": "2573294878692352",
				"rWorkCenterCode": "ddee",
				"rTeamId": 2573294878692352,
				"rTeamName": "责任班组\t2",
				"rTeamCode": "dfsdf",
				"rUserId": 2573294878692352,
				"rUserName": "责任1号",
				"rUserCode": "zr001",
				"out_sys_id": "2573294878692352",
				"out_sys_code": "dsfaf",
				"out_sys_version": "1.0",
				"out_sys_type": "1",
				"out_sys_rowno": "10",
				"out_sys_lineid": "2573294878692352",
				"sourceType": "1",
				"sourceDocId": 2573294878692352,
				"sourceCode": "sfdsf12313213",
				"sourceDetailId": 2573294878692352,
				"HLineId": "10",
				"creatorId": "2573294878692352",
				"modifierId": "2573294878692352",
				"creator": "冯绍峰",
				"createTime": "2023-12-1 14:06:50",
				"modifyTime": "2023-12-1 14:06:57",
				"modifyDate": "2023-12-1",
				"pubts": "2023-12-1 14:06:57",
				"modifier": "对对对",
				"createDate": "2023-12-1",
				"sourceOrderType": "1",
				"sourceOrderDocId": "2042888661817098247",
				"sourceOrderDetailId": "2042888661817098248",
				"sourceOrderCode": "SCDD2024071500000007",
				"sourceOrderLineNo": "10"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0
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

