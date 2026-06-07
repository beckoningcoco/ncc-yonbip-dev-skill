---
title: "获取多个员工时间段内排班V3"
apiId: "1883321306673315848"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Shift Scheduling Result"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Shift Scheduling Result]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取多个员工时间段内排班V3

>  请求方式	POST | Shift Scheduling Result (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/schedule/scheduleresult/queryperiodstafflistworkcalendar
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
staffIds	string	是	否	（staffId、staffCode 二选一必填，staffId、staffCode同时传值时以staffId为准，有staffId时优先使用staffId） 示例：["1563526193564614661","1635617477319196678"]
staffCodes	string	是	否	（staffId、staffCode 二选一必填，staffId、staffCode同时传值时以staffId为准，有staffId时优先使用staffId） 示例：["cccc","ddddd"]
startDate	string	否	是	开始日期必填,日期格式为 yyyy-MM-dd 示例：2023-08-01
endDate	string	否	是	结束日期 必填,日期格式为 yyyy-MM-dd 示例：2023-08-31
pageable	object	否	是	分页对象
pageIndex	int	否	是	页码 示例：1 默认值：1
pageSize	int	否	是	每页数量 示例：10 默认值：10

## 3. 请求示例

Url: /yonbip/hrcloud/time/schedule/scheduleresult/queryperiodstafflistworkcalendar?access_token=访问令牌
Body: {
	"staffIds": [
		"1563526193564614661",
		"1635617477319196678"
	],
	"staffCodes": [
		"cccc",
		"ddddd"
	],
	"startDate": "2023-08-01",
	"endDate": "2023-08-31",
	"pageable": {
		"pageIndex": 1,
		"pageSize": 10
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
code	string	否	编码 示例：200
message	string	否	返回的消息 示例：操作成功
data	object	是	数据集
content	object	是	班次信息
pageable	object	否	分页信息
totalElements	int	否	记录总数 示例：17
totalPages	int	否	总页数 示例：2
last	boolean	否	是否最后一页 示例：true
first	boolean	否	是否第一页 示例：true
total	int	否	总数 示例：17
size	int	否	每页数量 示例：10
number	int	否	页数 示例：1
numberOfElements	int	否	当前页数据条数 示例：10
empty	boolean	否	是否为空 示例：false
sort	object	否	排序

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"content": [
				{
					"staffId": "1962028970298834953",
					"staffCode": "AH00000134",
					"staffName": "helloxin",
					"orgId": "1674768664030085125",
					"deptId": "1674770004059881482",
					"deptName": "测试部门-1",
					"orgName": "根级组织1",
					"shiftId": "3040406859403520",
					"shiftName": "白班",
					"calendarDate": "2023-08-01",
					"beginTime": "09:00:00",
					"endTime": "18:00:00",
					"restBeginTime": "12:30",
					"restEndTime": "13:30",
					"restBeginDay": 1,
					"restEndDay": 1,
					"restBeginTime2": "14:00",
					"restEndTime2": "14:30",
					"restBeginDay2": 1,
					"restEndDay2": 1,
					"restBeginTime3": "15:00",
					"restEndTime3": "16:00",
					"restBeginDay3": 1,
					"restEndDay3": 1,
					"shiftRemark": "123",
					"shiftType": "1",
					"shiftTypeName": "",
					"beginday": 1,
					"endday": 1,
					"signBeginDay": 1,
					"signEndDay": 1,
					"beginDateTime": "2025-07-05 08:00:00",
					"endDateTime": "2025-07-06 17:30:00",
					"signBeginTime": "2025-07-05 08:00:00",
					"signEndTime": "2025-07-06 17:30:00"
				}
			],
			"pageable": {
				"pageSize": 10,
				"pageNumber": 1,
				"offset": 10,
				"paged": true,
				"unpaged": false,
				"sort": {
					"empty": true,
					"sorted": false,
					"unsorted": true
				}
			},
			"totalElements": 17,
			"totalPages": 2,
			"last": true,
			"first": true,
			"total": 17,
			"size": 10,
			"number": 1,
			"numberOfElements": 10,
			"empty": false,
			"sort": {
				"empty": true,
				"sorted": false,
				"unsorted": true
			}
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
10001	人员未查询到	人员未查询到
10002	排班数据为空	排班数据为空
10003	staffId,staffCode二选一必填	staffId,staffCode二选一必填
10004	开始日期和结束日期必填	开始日期和结束日期必填
10005	日期格式化失败,需为 yyyy-MM-dd	日期格式化失败,需为 yyyy-MM-dd
10006	开始时间必须小于等于结束时间	开始时间必须小于等于结束时间
10007	查询区间不超过2个月	查询区间不超过2个月
10008	分页信息错误,页码不小于0,每页数量不大于1000	分页信息错误,页码不小于0,每页数量不大于1000

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-22	
新增
返回参数 (10)
更新
返回参数 (4)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

