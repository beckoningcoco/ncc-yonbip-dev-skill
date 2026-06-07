---
title: "监听BIP添加待办事件推送三方系统"
apiId: "1965755601825300488"
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

# 监听BIP添加待办事件推送三方系统

>  请求方式	POST | To-do Message (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/event/todocenter/addTodo
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
appId	string	否	否	应用ID
approveSource	string	否	否	流程应用
businessKey	string	否	是	业务ID
commitTsLong	number
小数位数:-,最大长度:13	否	否	提交时间
commitUserId	string	否	否	提交人ID
content	string	否	否	消息内容
formId	string	否	否	表单ID
labelCode	string	否	否	领域编码
mUrl	string	否	是	移动url
msgTsLong	number
小数位数:-,最大长度:10	否	否	待办提交时间
omitNotify	boolean	否	否	是否离线推送
preAuditUserId	string	否	是	上一审批人
resendable	boolean	否	否	是否允许重发
richText	string	否	否	富文本内容
showAgree	boolean	否	否	是否同意
showReject	boolean	否	否	是否驳回
srcAppId	string	否	否	来源应用ID
srcMsgId	string	否	否	消息ID
systemSource	string	否	否	来源服务器
tenantId	string	否	否	租户ID
title	string	否	是	消息的标题
todoTemplateId	string	否	否	待办模板ID
todoTemplateVars	object	否	否	待办模板集合
todoTmpRelationId	string	否	否	消息中心模板ID
todoType	string	否	否	待办类型
userToItemId	string	否	否	混合云映射ID
webUrl	string	否	是	webUrl
yyUserIds	string	是	是	审批人集合
businessData	object	否	否	业务数据
docType	object	否	否	业务分类
orgid	string	否	否	组织id

## 3. 请求示例

Url: /yonbip/uspace/event/todocenter/addTodo?access_token=访问令牌
Body: {
	"actionKey": "",
	"value": {
		"appId": "",
		"approveSource": "",
		"businessKey": "",
		"commitTsLong": 0,
		"commitUserId": "",
		"content": "",
		"formId": "",
		"labelCode": "",
		"mUrl": "",
		"msgTsLong": 0,
		"omitNotify": true,
		"preAuditUserId": "",
		"resendable": true,
		"richText": "",
		"showAgree": true,
		"showReject": true,
		"srcAppId": "",
		"srcMsgId": "",
		"systemSource": "",
		"tenantId": "",
		"title": "",
		"todoTemplateId": "",
		"todoTemplateVars": {
			"domainKey": "",
			"appFixPramsx": "",
			"apptype": "",
			"mobileBillNo": "",
			"processDefinitionId": "",
			"processInstanceId": "",
			"mddServiceCode": "",
			"u8cFormId": "",
			"eventType": "",
			"source": "",
			"activityId": "",
			"documentQuery": "",
			"fromEsnDocument": "",
			"executionBusinessKey": "",
			"u8cSource": "",
			"taskId": ""
		},
		"todoTmpRelationId": "",
		"todoType": "",
		"userToItemId": "",
		"webUrl": "",
		"yyUserIds": [
			""
		],
		"businessData": {
			"taskName": "",
			"ncc_orgcode": "",
			"ncc_orgid": ""
		},
		"docType": {
			"name": ""
		},
		"orgid": ""
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

