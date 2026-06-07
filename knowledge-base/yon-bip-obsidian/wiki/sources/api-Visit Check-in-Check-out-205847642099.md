---
title: "拜访签到/签退"
apiId: "2058476420993646596"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Check-in Execution"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Check-in Execution]
platform_version: "BIP"
source_type: community-api-docs
---

# 拜访签到/签退

>  请求方式	POST | Check-in Execution (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/signin
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
externalData	object	否	是	externalData
associationBusinessObject	string	否	是	业务对象，0:客户 1：商机 2：线索 4：活动 5：终端 示例：0 默认值：0
customerId	string	否	否	客户ID，associationBusinessObject=0时，不能为空 示例：2045900345613746182
terminalId	string	否	否	终端ID，associationBusinessObject=5时不能为空
clue	string	否	否	线索ID，associationBusinessObject=2时必填
oppt	string	否	否	商机ID，associationBusinessObject=1时必填
actionTypeId	string	否	是	行动类型id 示例：2023447519335284743
data	object	否	是	data
longitude	number
小数位数:6,最大长度:10	否	是	当前经度 示例：116.397128
latitude	number
小数位数:6,最大长度:10	否	是	当前纬度 示例：39.916527
location	string	否	是	当前的地址 示例：北京市海淀区
signInWay	number
小数位数:0,最大长度:10	否	是	签到方式（0：日常考勤 1：拜访签到） 示例：1 默认值：1
signInType	number
小数位数:0,最大长度:10	否	是	签到类型 0:签到 1：签退 示例：0
taskId	string	否	否	来源任务id
actionId	string	否	是	行动ID 示例：2049084058853965834
photo	string	否	否	签到/签退图片的businessId
org	string	否	是	销售组织ID 示例：2049084058853961001

## 3. 请求示例

Url: /yonbip/crm/signin?access_token=访问令牌
Body: {
	"externalData": {
		"associationBusinessObject": "0",
		"customerId": "2045900345613746182",
		"terminalId": "",
		"clue": "",
		"oppt": "",
		"actionTypeId": "2023447519335284743"
	},
	"data": {
		"longitude": 116.397128,
		"latitude": 39.916527,
		"location": "北京市海淀区",
		"signInWay": 1,
		"signInType": 0,
		"taskId": "",
		"actionId": "2049084058853965834",
		"photo": "",
		"org": "2049084058853961001"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
msgCode	number
小数位数:0,最大长度:10	否	标识 -2：超出范围 -99：签到成功 示例：-2
data	object	否	data
message	string	否	签到提示信息 示例：超出客户签到范围距离，请到客户现场签到！
messages	string	是	messages
code	number
小数位数:0,最大长度:10	否	code 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"msgCode": -2,
		"data": {
			"longitude": "116.397128",
			"latitude": "39.916527",
			"location": "北京市海淀区",
			"signInWay": "1",
			"signInType": "0",
			"taskId": "",
			"actionId": "2062183372898172935",
			"photo": "",
			"org": "1873789786421985284"
		},
		"message": "超出客户签到范围距离，请到客户现场签到！",
		"messages": [
			""
		],
		"code": 0
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

