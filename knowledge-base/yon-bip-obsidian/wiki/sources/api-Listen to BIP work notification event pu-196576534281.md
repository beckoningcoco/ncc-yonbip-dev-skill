---
title: "监听BIP工作通知事件推送三方系统"
apiId: "1965765342811127816"
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

# 监听BIP工作通知事件推送三方系统

>  请求方式	POST | Notifications (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/event/worknotify/addWorkNotify
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
actionKey	string	否	是	消息数据类型
value	object	否	是	内容值
labelCatgory	string	否	否	分类
content	string	否	否	消息内容
tabId	string	否	否	表单ID
labelCode	string	否	否	领域编码
mUrl	string	否	是	移动url
url	string	否	是	默认url
msgTsLong	number
小数位数:-,最大长度:10	否	否	待办提交时间
scopeAll	boolean	否	否	是否所有范围
scopeList	string	否	是	范围列表
sendScope	boolean	否	否	发送范围
richText	string	否	否	富文本内容
srcDomain	string	否	否	来源域名
isFromMp	boolean	否	否	是否表单
srcAppId	string	否	否	来源应用ID
srcMsgId	string	否	否	消息ID
tenantId	string	否	否	租户ID
title	string	否	是	消息的标题
todoTemplateId	string	否	否	待办模板ID
todoType	string	否	否	待办类型
userToItemId	string	否	否	混合云映射ID
webUrl	string	否	是	webUrl
yhtUserIds	string	是	是	通知人集合
formId	string	否	否	表单标识
srcNotifyId	string	否	否	通知id

## 3. 请求示例

Url: /yonbip/uspace/event/worknotify/addWorkNotify?access_token=访问令牌
Body: {
	"actionKey": "",
	"value": {
		"labelCatgory": "",
		"content": "",
		"tabId": "",
		"labelCode": "",
		"mUrl": "",
		"url": "",
		"msgTsLong": 0,
		"scopeAll": true,
		"scopeList": "",
		"sendScope": true,
		"richText": "",
		"srcDomain": "",
		"isFromMp": true,
		"srcAppId": "",
		"srcMsgId": "",
		"tenantId": "",
		"title": "",
		"todoTemplateId": "",
		"todoType": "",
		"userToItemId": "",
		"webUrl": "",
		"yhtUserIds": [
			""
		],
		"formId": "",
		"srcNotifyId": ""
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

