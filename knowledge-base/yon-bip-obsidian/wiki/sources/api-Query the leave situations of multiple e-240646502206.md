---
title: "查询员工一段时间内多人的请假情况(多时段)"
apiId: "2406465022069833731"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Multi-period Leave Application"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Multi-period Leave Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询员工一段时间内多人的请假情况(多时段)

>  请求方式	POST | Multi-period Leave Application (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/leave/queryAllMultiLeaveByStaffIds
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
staffIds	string	是	否	员工staffId(staffIds、staffCodes二选一必填，有staffIds时优先使用staffIds，没有staffIds时优先使用staffCodes) 示例：["2122","334"]
staffCodes	string	是	否	员工编码(staffIds、staffCodes二选一必填，有staffIds时优先使用staffIds，没有staffIds时优先使用staffCodes) 示例：["code1","code2"]
beginDate	string	否	是	开始时间 示例：2023-09-01
endDate	string	否	是	结束时间 示例：2023-09-30
approveStatus	string	否	否	单据审批状态（0表示仅展示审批通过的请假单，传1或者不传时，展示审批中以及审批通过的请假单） 示例：0
leaveTypeId	string	否	否	休假类型ID，不传值查询全部休假类型的请假数据 示例：2959183576404226
pageNum	number
小数位数:0,最大长度:10	否	是	当前页 示例：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页数量 示例：100

## 3. 请求示例

Url: /yonbip/HCC/time/leave/queryAllMultiLeaveByStaffIds?access_token=访问令牌
Body: {
	"staffIds": [
		"2122",
		"334"
	],
	"staffCodes": [
		"code1",
		"code2"
	],
	"beginDate": "2023-09-01",
	"endDate": "2023-09-30",
	"approveStatus": "0",
	"leaveTypeId": "2959183576404226",
	"pageNum": 1,
	"pageSize": 100
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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
content	object	是	content
pageable	object	否	pageable
totalPages	number
小数位数:0,最大长度:10	否	totalPages 示例：1
last	boolean	否	last 示例：false
totalElements	number
小数位数:0,最大长度:10	否	totalElements 示例：2
first	boolean	否	first 示例：false
numberOfElements	number
小数位数:0,最大长度:10	否	numberOfElements 示例：2
size	number
小数位数:0,最大长度:10	否	size 示例：100
number	number
小数位数:0,最大长度:10	否	number 示例：1
empty	boolean	否	empty 示例：false

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"content": [
			{
				"id": "2299790163525500933",
				"staffid": "2087336015636725763",
				"leavetype": "年假",
				"leavedays": "0.50天",
				"leavemark": "",
				"leavebegintime": "2025-06-26 09:00:00",
				"leaveendtime": "2025-06-26 12:00:00",
				"startDayType": 1,
				"endDayType": 1,
				"showbegindate": "2025-06-26 上午",
				"showenddate": "2025-06-26 上午",
				"minunit": "2",
				"leaveday": 0.5,
				"leavetypeid": "2087339150967046148",
				"details": [
					{
						"id": "2299790163525500933",
						"staffid": "2087336015636725763",
						"leavetype": "年假",
						"leavedays": "",
						"leavemark": "",
						"leavebegintime": "2025-06-26 09:00:00\t",
						"leaveendtime": "2025-06-26 12:00:00\t",
						"startDayType": "1",
						"endDayType": "1",
						"showbegindate": "2025-06-26 上午",
						"showenddate": "2025-06-26 上午",
						"minunit": "2",
						"leaveday": 0.5,
						"leavetypeid": "2087339150967046148"
					}
				]
			}
		],
		"pageable": {
			"paged": true,
			"pageNumber": 1,
			"offset": 100,
			"pageSize": 100,
			"unpaged": false
		},
		"totalPages": 1,
		"last": false,
		"totalElements": 2,
		"first": false,
		"numberOfElements": 2,
		"size": 100,
		"number": 1,
		"empty": false
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
401	参数JSON中缺少beginDate！	需要传递请假开始时间

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-20	
新增
请求参数 staffCodes
更新
请求参数 staffIds

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

