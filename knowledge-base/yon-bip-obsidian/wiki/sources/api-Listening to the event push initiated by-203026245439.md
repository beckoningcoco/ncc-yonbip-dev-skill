---
title: "监听BIP我发起的事件推送三方系统"
apiId: "2030262454391406595"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "To-do Message"
domain: "APP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, To-do Message]
platform_version: "BIP"
source_type: community-api-docs
---

# 监听BIP我发起的事件推送三方系统

>  请求方式	POST | To-do Message (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/event/todocenter/mcMyInitiated
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
actionKey	string	否	否	消息数据类型
value	object	否	否	内容值
busId	string	否	否	业务ID
status	string	否	否	状态
srcAppId	string	否	否	来源应用ID
mobileUrl	string	否	否	移动url
attributes	object	否	否	属性
tenantId	string	否	否	租户ID
webUrl	string	否	否	pc端url
initiateTs	number
小数位数:0,最大长度:10	否	否	发起时间
handlers	string	是	否	当前在手人
application	object	否	否	应用
overdueTs	number
小数位数:0,最大长度:10	否	否	过期时间
businessCode	string	否	否	单据编码
userId	string	否	否	用户ID
title	string	否	否	标题
source	string	否	否	来源业务
srcMsgId	string	否	否	消息ID
docType	object	否	否	业务分类
busTs	number
小数位数:0,最大长度:10	否	否	业务时间
formId	string	否	否	表单标识
msgTsLong	number
小数位数:0,最大长度:10	否	否	消息更新时间
delete	boolean	否	否	删除标识 默认值：false

## 3. 请求示例

Url: /yonbip/uspace/event/todocenter/mcMyInitiated?access_token=访问令牌
Body: {
	"actionKey": "",
	"value": {
		"busId": "",
		"status": "",
		"srcAppId": "",
		"mobileUrl": "",
		"attributes": {
			"todoTemplateVars": {
				"mobileBillNo": "",
				"useTextMessage": true,
				"processDefinitionId": "",
				"processInstanceId": "",
				"agentFlag": true,
				"mddServiceCode": "",
				"busiObjCode": "",
				"u8cFormId": "",
				"eventType": "",
				"initiatorOrg": "",
				"source": "",
				"approvalAction": "",
				"activityId": "",
				"documentQuery": true,
				"commentMustEnter": true,
				"fromEsnDocument": true,
				"rejectToStartInst": true,
				"u8cForm": "",
				"spiltRegex": "",
				"billNo": "",
				"executionBusinessKey": "",
				"u8cSource": "",
				"taskId": "",
				"useElectronicSignature": true
			},
			"systemSource": "",
			"approveSource": ""
		},
		"tenantId": "",
		"webUrl": "",
		"initiateTs": 0,
		"handlers": [
			""
		],
		"application": {
			"zhCN": "",
			"code": "",
			"enUS": "",
			"name": "",
			"zhTW": ""
		},
		"overdueTs": 0,
		"businessCode": "",
		"userId": "",
		"title": "",
		"source": "",
		"srcMsgId": "",
		"docType": {
			"zhCN": "",
			"code": "",
			"enUS": "",
			"name": "",
			"zhTW": ""
		},
		"busTs": 0,
		"formId": "",
		"msgTsLong": 0,
		"delete": true
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

## 5. 正确返回示例

{
	"code": "200",
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

