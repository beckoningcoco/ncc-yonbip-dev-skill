---
title: "更新日程"
apiId: "2544865043183829001"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Calendar"
domain: "SC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calendar]
platform_version: "BIP"
source_type: community-api-docs
---

# 更新日程

>  请求方式	POST | Calendar (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/schedule/{scheduleId}/update
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
scheduleId	string	path	是	日程 ID    示例: schedule001
updateType	string	query	否	更新类型，默认 CURRENT    示例: CURRENT    默认值: CURRENT
onlyUpdateTime	boolean	query	否	是否仅更新时间，默认 false    示例: false    默认值: false
Body参数
名称	类型	数组	必填	描述
title	string	否	否	日程标题 示例：项目例会
content	string	否	否	日程内容 示例：项目进度同步
address	string	否	否	日程地点 示例：第一会议室
startTime	number
小数位数:0,最大长度:38	否	是	开始时间戳，毫秒 示例：1778544000000
endTime	number
小数位数:0,最大长度:38	否	是	结束时间戳，毫秒 示例：1778547600000
currentDay	string	否	否	当前日期，格式 yyyy-MM-dd 示例：2026-05-12
currentStartTime	number
小数位数:0,最大长度:38	否	否	当前实例开始时间戳，毫秒 示例：1778544000000
allDay	boolean	否	否	是否全天日程 示例：false 默认值：false
important	boolean	否	否	是否重要日程 示例：false 默认值：false
isPublic	boolean	否	否	是否公开 示例：true 默认值：true
remindType	number
小数位数:0,最大长度:38	否	否	提醒类型 示例：0 默认值：0
upperTime	string	否	否	提前提醒时间值 示例：15 默认值：15
unitType	number
小数位数:0,最大长度:38	否	否	提前提醒时间单位 示例：1 默认值：1
timezone	string	否	是	时区 示例：Asia/Shanghai 默认值：Asia/Shanghai
ownerMemberId	string	否	否	日程所有人成员 ID 示例：1001
memberId	string	否	否	当前成员 ID 示例：1001
invitedMemberIds	string	是	否	参与人成员 ID 列表 示例：[1002,1003]
scheduleType	string	否	否	日程类型 示例：1 默认值：1
createSource	number
小数位数:0,最大长度:38	否	否	创建来源 示例：0 默认值：0
fromType	number
小数位数:0,最大长度:38	否	否	来源类型 示例：0 默认值：0
cate	number
小数位数:0,最大长度:38	否	否	分类 ID 示例：1 默认值：1
state	number
小数位数:0,最大长度:38	否	否	日程状态 示例：0 默认值：0
repeat	boolean	否	否	是否重复日程 示例：false 默认值：false
allDayRemindTime	number
小数位数:0,最大长度:38	否	否	全天提醒时间类型 示例：0 默认值：0
repeatDay	number
小数位数:0,最大长度:38	否	否	重复日 示例：0 默认值：0
repeatMonth	number
小数位数:0,最大长度:38	否	否	重复月 示例：0 默认值：0
repeatWeek	number
小数位数:0,最大长度:38	否	否	重复周 示例：0 默认值：0
repeatYear	number
小数位数:0,最大长度:38	否	否	重复年 示例：0 默认值：0

## 3. 请求示例

Url: /yonbip/uspace/schedule/schedule001/update?access_token=访问令牌&updateType=CURRENT&onlyUpdateTime=false
Body: {
	"title": "项目例会",
	"content": "项目进度同步",
	"address": "第一会议室",
	"startTime": 1778544000000,
	"endTime": 1778547600000,
	"currentDay": "2026-05-12",
	"currentStartTime": 1778544000000,
	"allDay": false,
	"important": false,
	"isPublic": true,
	"remindType": 0,
	"upperTime": "15",
	"unitType": 1,
	"timezone": "Asia/Shanghai",
	"ownerMemberId": "1001",
	"memberId": "1001",
	"invitedMemberIds": [
		1002,
		1003
	],
	"scheduleType": "1",
	"createSource": 0,
	"fromType": 0,
	"cate": 1,
	"state": 0,
	"repeat": false,
	"allDayRemindTime": 0,
	"repeatDay": 0,
	"repeatMonth": 0,
	"repeatWeek": 0,
	"repeatYear": 0
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
code	number
小数位数:0,最大长度:10	否	返回码，200 表示成功，其他表示失败 示例：200
message	string	否	响应消息，成功为 success 示例：success
data	object	否	业务数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "success",
	"data": {}
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

