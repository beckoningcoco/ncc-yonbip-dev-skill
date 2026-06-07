---
title: "应收确认规则删除"
apiId: "2342638973378625542"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "A/R Recognition Rule"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/R Recognition Rule]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收确认规则删除

>  请求方式	POST | A/R Recognition Rule (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/yonbip-fi-epub/receive/bill/batchdelete
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
billnum	string	否	否	billnum 示例：fiepub_receivable_confirm_list
data	object	是	否	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	id 示例：2342634652629467143
ruleCode	string	否	否	ruleCode 示例：YSQRGZ
ruleName	string	否	否	ruleName 示例：应收确认规则
sourceApplication	string	否	否	sourceApplication 示例：1590899514909655042
sourceApplication_name	string	否	否	sourceApplication_name 示例：收入管理
businessItem	string	否	否	businessItem 示例：2077820043062149121
businessItem_name	string	否	否	businessItem_name 示例：结算信息
stopstatus	boolean	否	否	stopstatus 示例：true
system	boolean	否	否	system 示例：false
creatorId_name	string	否	否	creatorId_name 示例：u8c_vip管理员
createTime	string	否	否	createTime 示例：2025-08-23 11:09:27
modifierId_name	string	否	否	modifierId_name 示例：u8c_vip管理员
modifyTime	string	否	否	modifyTime 示例：2025-08-23 11:10:01
name	string	否	否	name 示例：应收确认规则
code	string	否	否	code 示例：YSQRGZ
createDate	string	否	否	createDate 示例：2025-08-23 00:00:00
modifyDate	string	否	否	modifyDate 示例：2025-08-23 00:00:00
pubts	string	否	否	pubts 示例：2025-08-23 11:14:30

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/receive/bill/batchdelete?access_token=访问令牌
Body: {
	"billnum": "fiepub_receivable_confirm_list",
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "2342634652629467143",
			"ruleCode": "YSQRGZ",
			"ruleName": "应收确认规则",
			"sourceApplication": "1590899514909655042",
			"sourceApplication_name": "收入管理",
			"businessItem": "2077820043062149121",
			"businessItem_name": "结算信息",
			"stopstatus": true,
			"system": false,
			"creatorId_name": "u8c_vip管理员",
			"createTime": "2025-08-23 11:09:27",
			"modifierId_name": "u8c_vip管理员",
			"modifyTime": "2025-08-23 11:10:01",
			"name": "应收确认规则",
			"code": "YSQRGZ",
			"createDate": "2025-08-23 00:00:00",
			"modifyDate": "2025-08-23 00:00:00",
			"pubts": "2025-08-23 11:14:30"
		}
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
count	number
小数位数:0,最大长度:10	否	count 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	sucessCount 示例：1
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：0
messages	string	是	messages
infos	string	是	infos
failInfos	string	是	failInfos
traceId	string	否	traceId 示例：2e8d037b960e931b
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			""
		],
		"failInfos": [
			""
		]
	},
	"traceId": "2e8d037b960e931b",
	"uploadable": "0"
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

