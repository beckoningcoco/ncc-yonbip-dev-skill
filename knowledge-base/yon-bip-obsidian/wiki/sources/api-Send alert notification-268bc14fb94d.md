---
title: "发送预警通知"
apiId: "268bc14fb94d4c1a9e4d1aa66444c7cb"
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

# 发送预警通知

>  请求方式	POST | Alerts (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/rest/openapi/idempotent/alarm/notify/push
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
yhtUserIds	string	是	是	友互通userId 示例：["7847bf59-19bc-4d2a-b4f4-7e2450f25a7f"]
labelCode	string	否	否	领域编码，web端分类 示例：OA
title	string	否	是	标题 示例：标题名称
content	string	否	是	内容 示例：通知内容xxxx
url	string	否	否	移动端打开地址 示例：https://www.diwork.com
webUrl	string	否	否	web端打开地址 示例：https://www.diwork.com
miniProgramUrl	string	否	否	友空间小程序地址：不跳转小程序不传该字段
srcMsgId	string	否	是	消息id，用于幂等校验，同一消息id只接收一次,第二次不处理且直接返回成功。业务使用 业务标识+":"+唯一编码，防止与其他业务冲突 示例：OA_APP:000001
businessId	string	否	否	业务id, 用于后续修改消息状态 示例：10929379zz
catcode1st	string	否	否	分类id
appId	string	否	否	应用id, 取值:友空间的appid 或 工作台的服务编码serviceCode, 用于:移动端消息分类，用于后续标记已读的业务 示例：1082

## 3. 请求示例

Url: /yonbip/uspace/rest/openapi/idempotent/alarm/notify/push?access_token=访问令牌
Body: {
	"yhtUserIds": [
		"7847bf59-19bc-4d2a-b4f4-7e2450f25a7f"
	],
	"labelCode": "OA",
	"title": "标题名称",
	"content": "通知内容xxxx",
	"url": "https://www.diwork.com",
	"webUrl": "https://www.diwork.com",
	"miniProgramUrl": "",
	"srcMsgId": "OA_APP:000001",
	"businessId": "10929379zz",
	"catcode1st": "",
	"appId": "1082"
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
	1	2025-09-22	
更新
请求说明
消息openapi接口从消息平台迁移到消息中心
	2	2025-07-04	
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

