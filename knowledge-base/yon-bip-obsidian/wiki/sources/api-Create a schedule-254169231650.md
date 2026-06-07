---
title: "创建日程"
apiId: "2541692316500885506"
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

# 创建日程

>  请求方式	POST | Calendar (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/schedule/view/schedule
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
title	string	否	是	日程标题 示例：项目例会
content	string	否	是	日程内容 示例：项目进度同步
address	string	否	否	日程地点 示例：第一会议室
startTime	long	否	是	开始时间戳，毫秒 示例：1778544000000
endTime	long	否	是	结束时间戳，毫秒 示例：1778547600000
currentDay	string	否	否	日程所在日期，格式 yyyy-MM-dd 示例：2026-05-12
currentStartTime	long	否	否	日程所在日期开始时间戳 示例：1778544000000
allDay	boolean	否	否	是否全天日程 示例：false
important	boolean	否	否	是否重要日程 示例：false
isPublic	boolean	否	否	是否公开日程 示例：false
remindType	long	否	否	提醒类型：0 无，1 天，2 周，3 月，4 年 示例：1
upperTime	string	否	否	提前提醒时间 示例：15
unitType	int	否	否	提前提醒时间单位 示例：0
timezone	string	否	是	时区 示例：Asia/Shanghai
ownerYhtUserId	string	否	否	日程所有者友互通 ID 示例：user001
yhtUserId	string	否	否	当前用户友互通 ID 示例：user001
invitedYhtUserIds	string	是	否	参与人友互通 ID 列表 示例：["user002","user003"]
scheduleType	string	否	否	日程类型：1 个人日程，2 团队日程 示例：1
teamId	string	否	否	团队 ID，团队日程时传入 示例：team001
createSource	long	否	否	创建来源，不传时服务端默认为 0 示例：4
shareType	long	否	否	分享类型：0 或空不分享，1 卡片分享 示例：0
labelIds	string	是	否	标签 ID 列表 示例：["label001"]

## 3. 请求示例

Url: /yonbip/uspace/schedule/view/schedule?access_token=访问令牌
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
	"isPublic": false,
	"remindType": 1,
	"upperTime": "15",
	"unitType": 0,
	"timezone": "Asia/Shanghai",
	"ownerYhtUserId": "user001",
	"yhtUserId": "user001",
	"invitedYhtUserIds": [
		"user002",
		"user003"
	],
	"scheduleType": "1",
	"teamId": "team001",
	"createSource": 4,
	"shareType": 0,
	"labelIds": [
		"label001"
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
code	int	否	返回码，200 表示成功，其他表示失败
message	string	否	响应消息
data	object	否	业务数据

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
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

