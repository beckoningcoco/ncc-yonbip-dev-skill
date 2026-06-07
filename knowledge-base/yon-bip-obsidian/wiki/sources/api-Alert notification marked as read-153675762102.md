---
title: "预警通知标为已读"
apiId: "1536757621020164100"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Alerts"
domain: "APP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Alerts]
platform_version: "BIP"
source_type: community-api-docs
---

# 预警通知标为已读

>  请求方式	POST | Alerts (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/rest/openapi/patch/alarm_notify/read
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
userId	string	否	是	友互通userId 示例：7847bf59-19bc-4d2a-b4f4-7e2450f25a7f
appId	string	否	是	应用ID，发通知传的appId 示例：1082
businessId	string	否	是	业务id，发消息时传入的businessId字段 示例：10929379zz

## 3. 请求示例

Url: /yonbip/uspace/rest/openapi/patch/alarm_notify/read?access_token=访问令牌
Body: {
	"userId": "7847bf59-19bc-4d2a-b4f4-7e2450f25a7f",
	"appId": "1082",
	"businessId": "10929379zz"
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
code	string	否	业务状态码，200成功，其他失败 示例：200
message	string	否	提示信息 示例：成功
data	int	否	更新成功通知的数量
displayCode	string	否	错误码

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": 0,
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
999	参数错误	查看message提示信息,检查字段类型和值是否正确

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

