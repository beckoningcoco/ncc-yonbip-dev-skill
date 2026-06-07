---
title: "商旅云实时通讯集成"
apiId: "1898083504407707648"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Notifications"
domain: "APP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Notifications]
platform_version: "BIP"
source_type: community-api-docs
---

# 商旅云实时通讯集成

>  请求方式	POST | Notifications (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/rest/mcserver/im/send_online_packet
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
yhtUserIds	string	是	是	友互通用户id 示例：["XXXXX"]
appKey	string	否	是	由im颁发给调用方 示例：XXX
attributes	object	否	是	扩展字段，自定义
category	string	否	是	业务自定义，透传到前端解析 示例：yonbip-fi-epmpbf

## 3. 请求示例

Url: /yonbip/uspace/rest/mcserver/im/send_online_packet?access_token=访问令牌
Body: {
	"yhtUserIds": [
		"XXXXX"
	],
	"appKey": "XXX",
	"attributes": {},
	"category": "yonbip-fi-epmpbf"
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
code	string	否	业务状态码 示例：200
message	string	否	提示信息 示例：成功
data	object	否	数据
flag	long	否	消息中心成功标识，0:成功，1失败 示例：0
msg	string	否	消息中心返回的提示信息 示例：success
displayCode	string	否	错误码

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": {
		"flag": 0,
		"msg": "success"
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
400	参数错误	查看message提示信息,检查字段类型和值是否正确

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

