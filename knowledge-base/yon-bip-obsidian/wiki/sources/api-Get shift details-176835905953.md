---
title: "modifyTime	string	否	修改时间 示例：2023-07-10 13:22:49"
apiId: "1768359059537788952"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Work Shift"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Shift]
platform_version: "BIP"
source_type: community-api-docs
---

# modifyTime	string	否	修改时间 示例：2023-07-10 13:22:49

>  请求方式	GET | Work Shift (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/schedule/scheduleresult/queryshift
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
shiftId	string	query	是	班次ID    示例: 0000L6YQ8AVLFUZPXD0000DEFAULTSHIFT

## 3. 请求示例

Url: /yonbip/hrcloud/time/schedule/scheduleresult/queryshift?access_token=访问令牌&shiftId=0000L6YQ8AVLFUZPXD0000DEFAULTSHIFT

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
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
data	object	否	结果对象
allowEarlyLen	int	否	允许早到时长-整数 示例：5
allowLateLen	int	否	允许迟到时长-整数 示例：5
arriveLate	double	否	晚到_小时
arriveLate2	double	否	晚到_小时2
arriveLate3	double	否	晚到_小时3
beginDay	int	否	开始范围 1是当天2是前一天 示例：1
beginTime	Date	否	开始时间 示例：1970-01-01 08:00:00
color	string	否	颜色 示例：24,182,129
createTime	string	否	创建时间 示例：2018-06-04 13:21:32
creator	string	否	创建人 示例：4a143f32-aea4-4d3f-be23-7d9bba6d0190
customRestSignRuleJson	string	否	自定义打卡规则json格式 示例：{"customRestSign":false,"offWorkSignBegtime":"","offWorkSignBeginDay":1,"offWorkSignEndtime":"","offWorkSignEndDay":1,"workSignBegtime":"","workSignBeginDay":1,"workSignEndtime":"","workSignEndDay":1,"customRestSign2":false,"offWorkSignBegtime2":"","offWorkSignBeginDay2":1,"offWorkSignEndtime2":"","offWorkSignEndDay2":1,"workSignBegtime2":"","workSignBeginDay2":1,"workSignEndtime2":"","workSignEndDay2":1,"customRestSign3":false,"offWorkSignBegtime3":"","offWorkSignBeginDay3":1,"offWorkSignEndtime3":"","offWorkSignEndDay3":1,"workSignBegtime3":"","workSignBeginDay3":1,"workSignEndtime3":"","workSignEndDay3":1}
deductOvertime	int	否	是否扣加班休息，1扣加班休息，0，不扣加班休息 示例：1
dr	short	否	逻辑删除标记 示例：0
earlyLenIsAbsent	long	否	早退多少分钟记为旷工 示例：20
enable	int	否	是否开启，1开启,0关闭 示例：1
endDay	int	否	结束范围 1是当天2是后一天 示例：1
endTime	Date	否	结束时间 示例：1970-01-01 17:30:00
fixedTime	double	否	固定时长
halfDayShift	double	否	半天班 示例：1
id	string	否	班次id 示例：0000L5GEL0E5DX261G0000DEFAULTSHIFT
isCrossDayOvertimeSplit	string	否	是否跨夜加班拆单 0：否 1：是 示例：0
isDeductRest	int	否	是否扣休息，1扣，0不扣 示例：1
isDeductRestSign	int	否	休息时段是否打卡，1打卡，0不打卡 示例：0
isDefault	boolean	否	是否预制，true预制，false不预制 示例：true
isLeaveLate	int	否	是否开启晚走晚到，1开启 示例：0
lateLenIsAbsent	long	否	迟到多少分钟记为旷工 示例：10
leaveLate	double	否	晚走_小时
leaveLate2	double	否	晚走_小时2
leaveLate3	double	否	晚走_小时3
modifier	string	否	修改人 示例：68b469ea-e687-4c05-a527-5c13376f62b5
pubts	Date	否	发布时间 示例：2023-07-10 13:22:48
restBeginDay	int	否	公休开始时间开始范围 1是当天2是前一天 示例：1
restBeginDay2	int	否	公休开始时间开始范围 1是当天2是前一天
restBeginDay3	int	否	公休开始时间开始范围 1是当天2是前一天
restBeginTime	Date	否	公休开始时间 示例：1970-01-01 12:00:00
restBeginTime2	Date	否	公休开始时间2
restBeginTime3	string	否	公休开始时间3
restEndDay	int	否	公休结束时间开始范围 1是当天2是前一天 示例：1
restEndDay2	int	否	公休结束时间2开始范围 1是当天2是前一天
restEndDay3	int	否	公休结束时间3开始范围 1是当天2是前一天
restEndTime	Date	否	公休结束时间开始范围 1是当天2是前一天 示例：1970-01-01 13:00:00
restEndTime2	Date	否	公休结束时间2开始范围 1是当天2是前一天
restEndTime3	Date	否	公休结束时间3开始范围 1是当天2是前一天
restOvertimeBeginDay	int	否	开始范围 1是当天2是前一天 示例：1
restOvertimeBeginTime	Date	否	公休开始时间 示例：1970-01-01 18:00:00
restOvertimeEndDay	int	否	公休结束时间开始范围 1是当天2是前一天 示例：1
restOvertimeEndTime	Date	否	公休结束时间 示例：1970-01-01 18:30:00
shiftName	string	否	班次名称 示例：常白班
shiftType	long	否	班次方式 1是固定班 2是弹性班 3是休息班 示例：1
signBeginDay	int	否	开始范围 1是当天2是前一天 示例：1
signBeginTime	Date	否	签到开始时间 示例：1970-01-01 00:00:00
signEndDay	long	否	结束范围 1是当天2是后一天 示例：1
signEndTime	Date	否	签到结束时间 示例：1970-01-01 23:59:00
tenant	string	否	租户 示例：0000L5GEL0E5DX261G0000
ts	Date	否	时间戳
workHours	double	否	工作时长 示例：8.5
type	string	否	分类 示例：0000L5GEL0E5DX261G0000shifttype00001
busiOrg	string	否	有权限的组织id 示例：1673903288345427971
sysFlag	int	否	系统是否开启，1开启，0不开启 示例：0
showFlag	int	否	是否显示，1显示，0不显示 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"allowEarlyLen": 5,
		"allowLateLen": 5,
		"arriveLate": 0,
		"arriveLate2": 0,
		"arriveLate3": 0,
		"beginDay": 1,
		"beginTime": "1970-01-01 08:00:00",
		"color": "24,182,129",
		"createTime": "2018-06-04 13:21:32",
		"creator": "4a143f32-aea4-4d3f-be23-7d9bba6d0190",
		"customRestSignRuleJson": "{\"customRestSign\":false,\"offWorkSignBegtime\":\"\",\"offWorkSignBeginDay\":1,\"offWorkSignEndtime\":\"\",\"offWorkSignEndDay\":1,\"workSignBegtime\":\"\",\"workSignBeginDay\":1,\"workSignEndtime\":\"\",\"workSignEndDay\":1,\"customRestSign2\":false,\"offWorkSignBegtime2\":\"\",\"offWorkSignBeginDay2\":1,\"offWorkSignEndtime2\":\"\",\"offWorkSignEndDay2\":1,\"workSignBegtime2\":\"\",\"workSignBeginDay2\":1,\"workSignEndtime2\":\"\",\"workSignEndDay2\":1,\"customRestSign3\":false,\"offWorkSignBegtime3\":\"\",\"offWorkSignBeginDay3\":1,\"offWorkSignEndtime3\":\"\",\"offWorkSignEndDay3\":1,\"workSignBegtime3\":\"\",\"workSignBeginDay3\":1,\"workSignEndtime3\":\"\",\"workSignEndDay3\":1}",
		"deductOvertime": 1,
		"dr": 0,
		"earlyLenIsAbsent": 20,
		"enable": 1,
		"endDay": 1,
		"endTime": "1970-01-01 17:30:00",
		"fixedTime": 0,
		"halfDayShift": 1,
		"id": "0000L5GEL0E5DX261G0000DEFAULTSHIFT",
		"isCrossDayOvertimeSplit": "0",
		"isDeductRest": 1,
		"isDeductRestSign": 0,
		"isDefault": true,
		"isLeaveLate": 0,
		"lateLenIsAbsent": 10,
		"leaveLate": 0,
		"leaveLate2": 0,
		"leaveLate3": 0,
		"modifier": "68b469ea-e687-4c05-a527-5c13376f62b5",
		"modifyTime": "2023-07-10 13:22:49",
		"pubts": "2023-07-10 13:22:48",
		"restBeginDay": 1,
		"restBeginDay2": 0,
		"restBeginDay3": 0,
		"restBeginTime": "1970-01-01 12:00:00",
		"restBeginTime2": "",
		"restBeginTime3": "",
		"restEndDay": 1,
		"restEndDay2": 0,
		"restEndDay3": 0,
		"restEndTime": "1970-01-01 13:00:00",
		"restEndTime2": "",
		"restEndTime3": "",
		"restOvertimeBeginDay": 1,
		"restOvertimeBeginTime": "1970-01-01 18:00:00",
		"restOvertimeEndDay": 1,
		"restOvertimeEndTime": "1970-01-01 18:30:00",
		"shiftName": "常白班",
		"shiftType": 1,
		"signBeginDay": 1,
		"signBeginTime": "1970-01-01 00:00:00",
		"signEndDay": 1,
		"signEndTime": "1970-01-01 23:59:00",
		"tenant": "0000L5GEL0E5DX261G0000",
		"ts": "",
		"workHours": 8.5,
		"type": "0000L5GEL0E5DX261G0000shifttype00001",
		"busiOrg": "1673903288345427971",
		"sysFlag": 0,
		"showFlag": 1
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
50003	班次id不存在	班次id不存在

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

