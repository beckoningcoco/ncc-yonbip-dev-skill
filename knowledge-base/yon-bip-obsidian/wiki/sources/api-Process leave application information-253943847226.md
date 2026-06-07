---
title: "处理请假申请信息"
apiId: "2539438472267563011"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Leave Application Form"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Application Form]
platform_version: "BIP"
source_type: community-api-docs
---

# 处理请假申请信息

>  请求方式	POST | Leave Application Form (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/leave/getLeaveApplyInfo
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
leaveType	string	否	是	休假类型ID 示例：2533314501855412227
leaveBeginTime	string	否	是	请假开始时间 示例：2025-04-01 08:00:00
leaveEndTime	string	否	是	请假结束时间 示例：2025-04-01 17:30:00
remark	string	否	否	备注 示例：请假

## 3. 请求示例

Url: /yonbip/HCC/time/leave/getLeaveApplyInfo?access_token=访问令牌
Body: {
	"leaveType": "2533314501855412227",
	"leaveBeginTime": "2025-04-01 08:00:00",
	"leaveEndTime": "2025-04-01 17:30:00",
	"remark": "请假"
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
code	string	否	响应编码 示例：200
message	string	否	响应消息 示例：操作成功
data	object	否	数据
remark	string	否	备注 示例：请假
staffId	string	否	员工ID 示例：员工ID
staffName	string	否	员工姓名
leaveTypeId	string	否	休假类型ID 示例：0000L7T4IPFB9V865G00000000000001
leaveTypeName	string	否	休假类型名称 示例：年假
leaveTypeCode	string	否	休假类型编码 示例：5
minTime	string	否	最小请假时间 示例：1
minUnit	string	否	请假单位 示例：2
leaveBeginTime	string	否	请假开始时间 示例：2025-04-01 08:00:00
leaveEndTime	string	否	请假结束时间 示例：2025-04-01 17:30:00
showBeginDate	string	否	显示的请假开始时间 示例：2025-04-01 00:00:00
startDayType	string	否	开始时间上下午标识 示例：1
showEndDate	string	否	显示的请假结束时间 示例：2025-04-01 00:00:00
endDayType	string	否	结束时间上下午标识 示例：2
leaveDay	string	否	时长 示例：1
duration	string	否	请假时长 示例：1.00天
showBeginDateStr	string	否	显示的请假开始时间(格式化) 示例：2025年04月01日
showEndDateStr	string	否	显示的请假结束时间(格式化) 示例：2025年04月01日

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"remark": "请假",
		"staffId": "员工ID",
		"staffName": "",
		"leaveTypeId": "0000L7T4IPFB9V865G00000000000001",
		"leaveTypeName": "年假",
		"leaveTypeCode": "5",
		"minTime": "1",
		"minUnit": "2",
		"leaveBeginTime": "2025-04-01 08:00:00",
		"leaveEndTime": "2025-04-01 17:30:00",
		"showBeginDate": "2025-04-01 00:00:00",
		"startDayType": "1",
		"showEndDate": "2025-04-01 00:00:00",
		"endDayType": "2",
		"leaveDay": "1",
		"duration": "1.00天",
		"showBeginDateStr": "2025年04月01日",
		"showEndDateStr": "2025年04月01日"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

