---
title: "我的考勤(Yonclaw)"
apiId: "2535064597856518146"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Monthly Report"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Monthly Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 我的考勤(Yonclaw)

>  请求方式	GET | Monthly Report (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/report/attendance/getMyAttendanceByPeriod
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
year	string	query	否	考勤年    示例: 2026
month	string	query	否	考勤月    示例: 5

## 3. 请求示例

Url: /yonbip/HCC/time/report/attendance/getMyAttendanceByPeriod?access_token=访问令牌&year=2026&month=5

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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回结果集
itemData	object	是	统计项数据
detailData	object	是	考勤数据详情
attendanceData	object	是	出勤情况统计
mainId	string	否	主表ID 示例：0000L7T4IPFB9V865G00000000000001
abnormalData	object	是	异常考勤统计

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"itemData": [
			{
				"ifLdDecimal": 0,
				"itemType": "0",
				"code": "calendar",
				"iDataType": "2",
				"name": "考勤日期",
				"displayArea": "1",
				"orderNum": 1,
				"id": "0000L7T4IPFB9V865G00000000000001001",
				"title": "考勤日期",
				"mainId": "0000L7T4IPFB9V865G00000000000001"
			}
		],
		"detailData": [
			{
				"fV1": "0",
				"isleave": "0",
				"isabsent": "0",
				"nobrushhour": 8,
				"storeunit": 1,
				"dr": 0,
				"isapprove": "0",
				"absentcount": 0,
				"id": "2516546597241225231",
				"psnclId": "d524de4ef4b94da4aabf2e14093bc576",
				"nobrushcount": 1,
				"tenant": "0000L7T4IPFB9V865G0000",
				"earlylong": 0,
				"staffCode": "00000023",
				"deptId": "2207737323363762184",
				"latecount": 0,
				"overtimeCount": 0,
				"resigncnt": 0,
				"mpfWorkHours": 0,
				"attendDetail": "上班1:13:35;下班1:缺卡;缺卡总时长:8.00小时",
				"ruleid": "2207881462484041737",
				"signbegintime": "2026-04-13 13:35:00",
				"actualworkhours": 0,
				"schemeId": "2207897465532186631",
				"outcnt": 0,
				"latelong": 0,
				"orgId": "1922555557957337093",
				"detailColor": 0,
				"absenthour": 0,
				"outsidecount": 0,
				"leavecnt": 0,
				"pubts": "2026-04-14 19:03:02",
				"isnormal": "0",
				"firstBeginsign": "2026-04-13 13:35:00",
				"calendar": "04-13 周一",
				"shiftId": "0000L7T4IPFB9V865G0000DEFAULTSHIFT",
				"islock": "0",
				"workhours": 8,
				"ytenant": "0000L7T4IPFB9V865G0000",
				"monthRptContributionLen": 0,
				"mpfWorkDays": 0,
				"store": 1,
				"isoutside": "0",
				"staffConfirmState": 0,
				"actualworkdays": 0,
				"workdays": 1,
				"tripcnt": 0,
				"createTime": "2026-04-14 19:03:02",
				"unnormallen": 8,
				"earlycount": 0,
				"staffId": "2207738517383544838",
				"calendar1": "04-13 周一",
				"signInForWork": "13:35",
				"signInAfterWork": "缺卡",
				"shiftName": "常白班"
			}
		],
		"attendanceData": [
			{
				"dbcode": "workdays",
				"name": "应出勤天数",
				"value": 9,
				"displayArea": "1",
				"label": "应出勤天数"
			}
		],
		"mainId": "0000L7T4IPFB9V865G00000000000001",
		"abnormalData": [
			{
				"dbcode": "absentcount",
				"name": "旷工次数",
				"value": 1,
				"displayArea": "2",
				"label": "旷工次数"
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
暂时没有数据哦~

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

