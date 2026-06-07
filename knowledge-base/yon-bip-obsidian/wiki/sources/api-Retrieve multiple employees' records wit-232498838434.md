---
title: "获取多个员工时间段内档案"
apiId: "2324988384348995584"
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

# 获取多个员工时间段内档案

>  请求方式	POST | Shift Scheduling Result (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/schedule/scheduleresult/queryAttendStaff
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
staffIds	string	是	否	（staffId、staffCode 二选一必填，staffId、staffCode同时传值时以staffId为准，有staffId时优先使用staffId） 示例：["1563526193564614661","1635617477319196678"] 默认值：["2304140879406825475"]
staffCodes	string	是	否	（staffId、staffCode 二选一必填，staffId、staffCode同时传值时以staffId为准，有staffId时优先使用staffId） 示例：["cccc","ddddd"] 默认值：["00000012"]
startDate	string	否	是	开始日期必填,日期格式为 yyyy-MM-dd 示例：2023-08-01 默认值：2024-07-01
endDate	string	否	是	结束日期 必填,日期格式为 yyyy-MM-dd 示例：2023-08-31 默认值：2029-12-31

## 3. 请求示例

Url: /yonbip/HCC/time/schedule/scheduleresult/queryAttendStaff?access_token=访问令牌
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
	"endDate": "2023-08-31"
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
staffId	string	否	人员id 示例：1962028970298834953
staffCode	string	否	人员编码 示例：AH00000134
staffName	string	否	人员姓名 示例：helloxin
orgId	string	否	组织id 示例：1674768664030085125
deptId	string	否	部门id 示例：1674770004059881482
deptName	string	否	部门名称 示例：测试部门-1
orgName	string	否	组织名称 示例：根级组织1
beginDate	date
格式:yyyy-MM-dd	否	任职开始日期 示例：2012-12-01
endDate	date
格式:yyyy-MM-dd	否	任职结束日期 示例：2012-12-12
attendType	string	否	考勤方式 示例：2
cardCode	string	否	考勤卡号 示例：123456

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"staffId": "1962028970298834953",
			"staffCode": "AH00000134",
			"staffName": "helloxin",
			"orgId": "1674768664030085125",
			"deptId": "1674770004059881482",
			"deptName": "测试部门-1",
			"orgName": "根级组织1",
			"beginDate": "2012-12-01",
			"endDate": "2012-12-12",
			"attendType": "2",
			"cardCode": "123456"
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

