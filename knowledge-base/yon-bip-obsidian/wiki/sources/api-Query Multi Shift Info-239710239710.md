---
title: "获取多个班次详细信息"
apiId: "2397102397108256776"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Shift"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Shift]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取多个班次详细信息

>  请求方式	POST | Work Shift (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/TIME/HRTM/yonbip-hr-tm.hrtm_shift_Card/time/schedule/scheduleresult/queryshifts
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
shiftIds	string	是	是	班次ID列表 最大请求量：10000
pageable	object	否	否	分页信息
pageIndex	number
小数位数:0,最大长度:10	否	否	页码,默认为1
pageSize	number
小数位数:0,最大长度:10	否	否	分页数量:默认为10

## 3. 请求示例

Url: /yonbip/HCC/TIME/HRTM/yonbip-hr-tm.hrtm_shift_Card/time/schedule/scheduleresult/queryshifts?access_token=访问令牌
Body: {
	"shiftIds": [
		""
	],
	"pageable": {
		"pageIndex": 0,
		"pageSize": 0
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
message	string	否	返回消息 示例：操作成功
data	object	是	返回对象
restBeginDay2	number
小数位数:0,最大长度:10	否	结束范围2 示例：1
leaveShift	number
小数位数:0,最大长度:10	否	是否可用于请假 0:否 1:是 示例：0
sysFlag	number
小数位数:0,最大长度:10	否	是否系统预置 0:否 1:是 示例：1
restBeginDay3	number
小数位数:0,最大长度:10	否	休息开始范围3 0:否 1:是 示例：1
modifier	string	否	更新人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574
type	string	否	分类 示例：0000L6YQ8AVLFUZPXD0000shifttype00001
matchCardStrategy	number
小数位数:0,最大长度:10	否	班段匹配卡策略 1最早上班卡-最晚下班卡,2最早上班卡-最早下班卡 示例：1
openEarly	number
小数位数:0,最大长度:10	否	是否开启早到早走 0:否 1:是 示例：0
dr	number
小数位数:0,最大长度:10	否	删除标记 0:否 1:是 示例：0
bizRuleEnable	string	否	业务规则是否启用 0:否 1:是 默认值0 示例：0
shiftName	string	否	班次名称 示例：常白班
signBeginTime	string	否	签到开始时间 示例：1970-01-01 06:00:00
modifyTime	string	否	更新时间 示例：2024-12-02 09:47:18
enable	number
小数位数:0,最大长度:10	否	是否有效 0:否 1:是 示例：1
allowLateLen	number
小数位数:0,最大长度:10	否	允许迟到时长 示例：5
id	string	否	id 示例：0000L6YQ8AVLFUZPXD0000DEFAULTSHIFT
beginTime	string	否	开始时间 示例：1970-01-01 08:00:00
restEndDay	number
小数位数:0,最大长度:10	否	休息结束范围 0:否 1:是 示例：1
deductOvertime	number
小数位数:0,最大长度:10	否	是否扣加班休息 0:否 1:是 示例：0
tenant	string	否	租户编码 示例：0000L6YQ8AVLFUZPXD0000
isCrossDayOvertimeSplit	string	否	是否跨夜加班拆单 0:否 1:是 示例：0
yTenantId	string	否	租户编码 示例：0000L6YQ8AVLFUZPXD0000
isDefault	boolean	否	是否默认 示例：true
overtimeMatchCardStrategy	number
小数位数:0,最大长度:10	否	加点工时匹配卡策略 1最早开始 - 最晚结束,2最早开始 - 最早结束 示例：1
signBeginDay	number
小数位数:0,最大长度:10	否	签到开始范围 示例：1
allowEarlyLen	number
小数位数:0,最大长度:10	否	允许早退时长 示例：5
isDeductRest	number
小数位数:0,最大长度:10	否	是否扣休息 0:否 1:是 示例：1
color	string	否	颜色 示例：180,181,186
halfDayShift	number
小数位数:0,最大长度:10	否	半天班 示例：1
workHours	number
小数位数:1,最大长度:10	否	工作小时 示例：6.5
lateLenIsAbsent	number
小数位数:0,最大长度:10	否	迟到多少分钟记为旷工 示例：10
isLeaveLate	number
小数位数:0,最大长度:10	否	是否开启 晚走晚到 0:否 1:是 示例：0
showFlag	number
小数位数:0,最大长度:10	否	是否显示 0:否 1:是 示例：1
isDeductRestSign	number
小数位数:0,最大长度:10	否	休息时段是否打卡 0:否 1:是 示例：0
signEndDay	number
小数位数:0,最大长度:10	否	签到结束范围 示例：1
restBeginTime	string	否	休息开始时间 示例：1970-01-01 10:08:00
restBeginDay	number
小数位数:0,最大长度:10	否	休息开始范围 示例：1
endDay	number
小数位数:0,最大长度:10	否	结束范围 1是当天2是前一天 示例：1
restEndTime	string	否	休息结束时间 示例：1970-01-01 13:08:00
signEndTime	string	否	签到结束时间 示例：1970-01-01 23:59:00
pubts	string	否	系统时间戳 示例：2025-10-16 09:54:19
restEndDay2	number
小数位数:0,最大长度:10	否	休息范围2 示例：1
restEndDay3	number
小数位数:0,最大长度:10	否	休息范围3 示例：1
creator	string	否	创建人 示例：4a143f32-aea4-4d3f-be23-7d9bba6d0190
shiftType	number
小数位数:0,最大长度:10	否	班次类型 示例：1
ytenant	string	否	租户编码 示例：0000L6YQ8AVLFUZPXD0000
fixedTime	number
小数位数:0,最大长度:10	否	固定时长 示例：0
orgGroup	string	否	分级管控 示例：2382673085107011586
busiOrg	string	否	有权限的组织id 示例：666666
beginDay	number
小数位数:0,最大长度:10	否	获取开始范围 1是当天2是前一天 示例：1
earlyLenIsAbsent	number
小数位数:0,最大长度:10	否	获取早退多少分钟记为旷工 示例：20
createTime	string	否	创建时间 示例：2018-06-04 13:21:32
openLate	number
小数位数:0,最大长度:10	否	是否开启晚到晚走 示例：0
restMatchCardStrategy	number
小数位数:0,最大长度:10	否	获取休息班匹配卡策略 1最早开始 - 最晚结束,2最早开始 - 最早结束 示例：1
endTime	string	否	班次结束时间 示例：1970-01-01 17:30:00
matchCardMode	number
小数位数:0,最大长度:10	否	获取取卡模式 1：签到范围内最早或最晚的卡 2：就近取卡 示例：1
ts	string	否	系统时间戳 示例：2025-10-16 09:54:19

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"restBeginDay2": 1,
			"leaveShift": 0,
			"sysFlag": 1,
			"restBeginDay3": 1,
			"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"type": "0000L6YQ8AVLFUZPXD0000shifttype00001",
			"matchCardStrategy": 1,
			"openEarly": 0,
			"dr": 0,
			"bizRuleEnable": "0",
			"shiftName": "常白班",
			"signBeginTime": "1970-01-01 06:00:00",
			"modifyTime": "2024-12-02 09:47:18",
			"enable": 1,
			"allowLateLen": 5,
			"id": "0000L6YQ8AVLFUZPXD0000DEFAULTSHIFT",
			"beginTime": "1970-01-01 08:00:00",
			"restEndDay": 1,
			"deductOvertime": 0,
			"tenant": "0000L6YQ8AVLFUZPXD0000",
			"isCrossDayOvertimeSplit": "0",
			"yTenantId": "0000L6YQ8AVLFUZPXD0000",
			"isDefault": true,
			"overtimeMatchCardStrategy": 1,
			"signBeginDay": 1,
			"allowEarlyLen": 5,
			"isDeductRest": 1,
			"color": "180,181,186",
			"halfDayShift": 1,
			"workHours": 6.5,
			"lateLenIsAbsent": 10,
			"isLeaveLate": 0,
			"showFlag": 1,
			"isDeductRestSign": 0,
			"signEndDay": 1,
			"restBeginTime": "1970-01-01 10:08:00",
			"restBeginDay": 1,
			"endDay": 1,
			"restEndTime": "1970-01-01 13:08:00",
			"signEndTime": "1970-01-01 23:59:00",
			"pubts": "2025-10-16 09:54:19",
			"restEndDay2": 1,
			"restEndDay3": 1,
			"creator": "4a143f32-aea4-4d3f-be23-7d9bba6d0190",
			"shiftType": 1,
			"ytenant": "0000L6YQ8AVLFUZPXD0000",
			"fixedTime": 0,
			"orgGroup": "2382673085107011586",
			"busiOrg": "666666",
			"beginDay": 1,
			"earlyLenIsAbsent": 20,
			"createTime": "2018-06-04 13:21:32",
			"openLate": 0,
			"restMatchCardStrategy": 1,
			"endTime": "1970-01-01 17:30:00",
			"matchCardMode": 1,
			"ts": "2025-10-16 09:54:19"
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

