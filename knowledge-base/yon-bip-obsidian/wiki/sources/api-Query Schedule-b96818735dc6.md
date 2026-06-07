---
title: "查询日程"
apiId: "b96818735dc6444888ee35863b53fe4d"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Calendar"
domain: "SC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calendar]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询日程

>  请求方式	GET | Calendar (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/schedule/schedules
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
startTimestamp	long	query	是	开始时间 开始时间 使用毫秒级戳    示例: 1619539200000
endTimestamp	long	query	是	结束时间 使用毫秒级时间戳    示例: 1619625599000
userId	string	query	否	userId（友互通id），如果传了此参数则查询此用户的日程，如果不传会查询当前登录用户的日程    示例: 540facc1-0798-4e06-b648-e4f4f07618eb
page	int	query	否	页数    示例: 1
pageSize	int	query	否	每页条数    示例: 10

## 3. 请求示例

Url: /yonbip/uspace/schedule/schedules?access_token=访问令牌&startTimestamp=1619539200000&endTimestamp=1619625599000&userId=540facc1-0798-4e06-b648-e4f4f07618eb&page=1&pageSize=10

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
schedules	object	是	日程对象
total	long	否	个数 示例：10

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "999999",
	"data": {
		"schedules": [
			{
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
				"part": [
					{}
				],
				"categoryId": 0,
				"categoryColor": "",
				"subId": "",
				"fromAppName": "来自会议",
				"remindType": 0,
				"repeatEndTime": 1619625599,
				"currentDay": "20220416",
				"pubts": 1619625599
			}
		],
		"total": 10
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
	1	2025-06-27	
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

