---
title: "根据通知id查询预警通知"
apiId: "1570206800546889731"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Alerts"
domain: "APP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Alerts]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据通知id查询预警通知

>  请求方式	GET | Alerts (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/rest/yhttoken/openapi/get/alarm_notify/info
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
notifyIds	string	query	是	通知的唯一id，支持英文逗号隔开传递多个通知id    示例: d4149e75-99cf-4ec7-9f7c-c4a87d62de9a
userId	string	query	是	用户id    示例: 7f3c1590-3286-450a-99af-51d1b9224d49

## 3. 请求示例

Url: /yonbip/uspace/rest/yhttoken/openapi/get/alarm_notify/info?access_token=访问令牌&notifyIds=d4149e75-99cf-4ec7-9f7c-c4a87d62de9a&userId=7f3c1590-3286-450a-99af-51d1b9224d49

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
code	string	否	http状态码 示例：200
message	string	否	只有请求失败时会出现的参数，为请求失败的提示语
data	object	否	返回内容
success	boolean	否	请求是否成功，true表示成功，false表示失败 示例：true
alarmNotifyList	object	是	查询的预警通知list
displayCode	string	否	错误码

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"success": true,
		"alarmNotifyList": [
			{
				"ctime": 1665988277310,
				"utime": 1665988277312,
				"qzId": "29204",
				"tenantId": "0000KO42POTJDOJAJU",
				"userId": "7f3c1590-3286-450a-99",
				"notifyId": "93b889e7-bfd9-4bab-8a",
				"title": "11",
				"labelCode": "MM",
				"status": "UNREAD",
				"doneStatus": "NORMAL",
				"highlight": "",
				"content": "何东于02-09 14:31提交",
				"tabId": "5e2059d0a3b63f4fb9bb74f0",
				"updated": false,
				"mobileUrl": "https://bip-daily.yyuap.com/mdf-node/meta/voucher/st_purchaseorder/2640868805513984?domainKey=upu&apptype=mdf&tenantId=0000KO42POTJDOJAJU0000&serviceCode=&taskId=0d9701c9-8972-11ec-95b9-aeb0dfee492c&systemCode=&from_service=iuap-apcom-messagecenter",
				"webUrl": "https://bip-daily.yyuap.com/mdf-node/meta/voucher/st_purchaseorder/2640868805513984?domainKey=upu&tenantId=0000KO42POTJDOJAJU0000&apptype=mdf&serviceCode=&taskId=0d9701c9-8972-11ec-95b9-aeb0dfee492c&from_mc_workflow=1&from_service=iuap-apcom-messagecenter&",
				"from": "notify_alarm.esntest.upesn",
				"isTop": 0
			}
		]
	},
	"displayCode": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
310404	通过openApi调用路径错误	传递正确的调用路径

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-04	
新增
返回参数 displayCode
支持返回错误码

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

