---
title: "创建三方日程"
apiId: "88da1ade651440e2a80fa9fc15c13d71"
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

# 创建三方日程

>  请求方式	POST | Calendar (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/schedule/add
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
sendNotify	boolean	query	是	是否发送工作通知，true代表发送通知，false代表不发送。当此字段为false时，dealParticipantChange 不可填写为true。    示例: false
dealParticipantChange	boolean	query	是	是否由日程处理参与人变化，如果为true，则传入的参与人默认为待处理状态，参与人可以自行同意拒绝，如果为false，则默认为同意参与，由业务方调用修改来增减参与人，日程不提供操作入口。如果此字段为true则sendNotify必须为true
Body参数
名称	类型	数组	必填	描述
fromAppId	long	否	是	应用id,请找协同云申请 示例：27
businessKey	string	否	是	调用方自己的业务id，请确保每次创建新的日程使用不同的key 示例：2021-04-28:2234445007753472
categoryId	long	否	是	日程分类1工作、2培训、3会议、4活动、5出差、6其它、7个人 示例：1
isPublic	boolean	否	是	是否公开 true 公开 false不公开 示例：false
title	string	否	是	标题 示例：订单000218预计到货
address	string	否	否	地址 示例：用友产业园
content	string	否	否	内容 示例：预计到货：0309预留商品
startTime	long	否	是	开始时间 使用毫秒级时间戳，不允许大于endTime 示例：1619539200000
endTime	long	否	是	结束时间 使用毫秒级时间戳，不允许小于startTime 示例：1619625599000
allDay	boolean	否	是	是否全天 true 代表全天日程 false代表不是全天日程.如果此参数为true，则allDayRemindTime 参数为必填，且开始时间与结束时间的时分秒会变为00:00:00-23:59:59的时间戳. 示例：false
remindTime	long	否	是	提前提醒时间，按分钟为单位 按照枚举值走：0 不提醒、 1 时间发生时、 5 提前5分钟、 15 提前15分钟、 30 提前30分钟、 60 提前1小时、 120 提前2小时、 1440 提前1天、 2880 提前2天、10080 提前一周。如果日程为全天日程时，此字段不生效。 示例：60
allDayRemindTime	long	否	否	搭配全天日程使用（非全天日程可不传），全天日程提前提醒时间 0 不提醒 1 当天8点 2 当天9点 3 当天10点 4 提前一天8点 5 提前一天9点 6 提前一天10点。当日程为全天日程，必填。 示例：1
url	string	否	否	跳转地址 示例：https://bip-daily.yyuap.com/
fromUserId	string	否	否	日程创建者 示例：4aa28755-09a4-48ac-bd93-171b84f6029c
createUserId	string	否	否	日程组织者 示例：4aa28755-09a4-48ac-bd93-171b84f6029c
invitedUserIds	string	是	否	邀请人列表，userId（友互通id） 示例：["540facc1-0798-4e06-b648-e4f4f07618eb","17b292c2-6da3-4a43-ac0b-d2c9c04c9a5d"]

## 3. 请求示例

Url: /yonbip/uspace/schedule/add?access_token=访问令牌&sendNotify=false&dealParticipantChange=
Body: {
	"fromAppId": 27,
	"businessKey": "2021-04-28:2234445007753472",
	"categoryId": 1,
	"isPublic": false,
	"title": "订单000218预计到货",
	"address": "用友产业园",
	"content": "预计到货：0309预留商品",
	"startTime": 1619539200000,
	"endTime": 1619625599000,
	"allDay": false,
	"remindTime": 60,
	"allDayRemindTime": 1,
	"url": "https://bip-daily.yyuap.com/",
	"fromUserId": "4aa28755-09a4-48ac-bd93-171b84f6029c",
	"createUserId": "4aa28755-09a4-48ac-bd93-171b84f6029c",
	"invitedUserIds": [
		"540facc1-0798-4e06-b648-e4f4f07618eb",
		"17b292c2-6da3-4a43-ac0b-d2c9c04c9a5d"
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
code	int	否	返回码 200位成功，其他为不成功 示例：200
displayCode	string	否	错误异常码 示例：999999
data	object	否	data对象
schedule	object	否	日程对象

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "999999",
	"data": {
		"schedule": {
			"id": "“40322”",
			"fromAppId": 1,
			"businessKey": "2021-04-28:2234445007753472",
			"title": "测试创建日程",
			"address": "北京市海淀区",
			"content": "此次日程用于测试，请勿关注",
			"startTime": 1619539200,
			"endTime": 1619625599,
			"allDay": false,
			"remindTime": 15,
			"allDayRemindTime": 1,
			"url": "http:///www.baidu.com",
			"isPublic": true,
			"subId": "“40322”",
			"fromAppName": "来自会议",
			"categoryId": 1,
			"categoryColor": "\"#00c7e6\""
		}
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
	1	2026-05-18	
更新
请求说明
更新
返回参数 categoryId
修改接口名称
	2	2025-06-27	
新增
返回参数 displayCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

