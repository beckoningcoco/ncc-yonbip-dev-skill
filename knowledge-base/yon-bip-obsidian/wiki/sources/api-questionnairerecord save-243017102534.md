---
title: "问卷记录保存"
apiId: "2430171025341677570"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Questionnaire Record"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Questionnaire Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 问卷记录保存

>  请求方式	POST | Questionnaire Record (CRM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/MCC/QuestionnaireRecords/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	问卷记录编码
org	string	否	是	组织ID 示例：1733604510595022850
org_name	string	否	否	销售组织名称 示例：集团
saleArea	string	否	否	销售区域ID 示例：1916099200016711682
saleArea_name	string	否	否	销售区域名称 示例：华北区
dept	string	否	否	部门ID 示例：1733604751101657088
dept_name	string	否	否	部门名称 示例：销管一部
ower	string	否	否	调查人ID 示例：1866978664076804102
ower_name	string	否	否	调查人名称 示例：张三
creatorId	string	否	是	创建人ID
bustype	string	否	是	问卷记录交易类型ID 示例：1841647505310220291
customerId	string	否	否	客户ID
customerId_name	string	否	否	客户名称 示例：用友西区便利蜂
terminalId	string	否	否	终端ID
terminalId_name	string	否	否	终端名称
opptId	string	否	否	商机id
opptId_name	string	否	否	商机名称
personId	string	否	否	业务员id
personId_name	string	否	否	业务员名称
questionnaireRecordDetail	object	是	是	问卷记录详情
_status	string	否	是	保存类型 Insert:新增 示例：Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/MCC/QuestionnaireRecords/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "",
		"org": "1733604510595022850",
		"org_name": "集团",
		"saleArea": "1916099200016711682",
		"saleArea_name": "华北区",
		"dept": "1733604751101657088",
		"dept_name": "销管一部",
		"ower": "1866978664076804102",
		"ower_name": "张三",
		"creatorId": "",
		"bustype": "1841647505310220291",
		"customerId": "",
		"customerId_name": "用友西区便利蜂",
		"terminalId": "",
		"terminalId_name": "",
		"opptId": "",
		"opptId_name": "",
		"personId": "",
		"personId_name": "",
		"questionnaireRecordDetail": [
			{
				"questionId": "",
				"questionOptionId": "",
				"questionAnswer": "",
				"questionManualScore": "",
				"_status": ""
			}
		],
		"_status": "Insert"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
assistTaskType_name	string	否	assistTaskType_name
code	string	否	code 示例：20240805004125
taskTransType	string	否	taskTransType 示例：1841648390054608904
taskTransType_name	string	否	taskTransType_name 示例：测试任务
taskTransType_associationBusinessObject	string	否	taskTransType_associationBusinessObject 示例：0
taskTransType_actionTransType	string	否	taskTransType_actionTransType 示例：1841648140952272903
startDate	string	否	startDate 示例：2024-08-05 00:00:00
endDate	string	否	endDate 示例：2024-08-05 23:59:59
customer	string	否	customer 示例：1852020804790779918
customer_name	string	否	customer_name 示例：太平鸟
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
obsoleteStatus	string	否	obsoleteStatus 示例：0
originator	string	否	originator 示例：1866978664076804102
originator_name	string	否	originator_name 示例：李亚苹
org	string	否	org 示例：1733604510595022850
org_name	string	否	org_name 示例：集团
bustype	string	否	bustype 示例：1841647505310220291
saleArea	string	否	saleArea 示例：1916099200016711682
saleArea_name	string	否	saleArea_name 示例：01261801
dept	string	否	dept 示例：1733604751101657088
dept_name	string	否	dept_name 示例：销管一部
ower	string	否	ower 示例：1866978664076804102
ower_name	string	否	ower_name 示例：李亚苹
creator	string	否	creator 示例：昵称-李亚苹111
createTime	string	否	createTime 示例：2024-08-05 11:34:50
createDate	string	否	createDate 示例：2024-08-05 11:34:50
isWfControlled	boolean	否	isWfControlled 示例：false
taskDefineCharacter	object	否	taskDefineCharacter
taskExecutorList	object	是	taskExecutorList
taskRemindRuleList	object	是	taskRemindRuleList
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	id 示例：2058396491629199361
finishedcondition	number
小数位数:0,最大长度:10	否	finishedcondition 示例：0
creatorId	string	否	creatorId 示例：1866978672668835846
pubts	string	否	pubts 示例：2024-08-05 11:34:50
tenant	number
小数位数:0,最大长度:16	否	tenant 示例：3304892632636320
ytenant	string	否	ytenant 示例：0000LI1EO7E96110660000
yTenantId	string	否	yTenantId 示例：0000LI1EO7E96110660000

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"assistTaskType_name": "",
		"code": "20240805004125",
		"taskTransType": "1841648390054608904",
		"taskTransType_name": "测试任务",
		"taskTransType_associationBusinessObject": "0",
		"taskTransType_actionTransType": "1841648140952272903",
		"startDate": "2024-08-05 00:00:00",
		"endDate": "2024-08-05 23:59:59",
		"customer": "1852020804790779918",
		"customer_name": "太平鸟",
		"verifystate": 0,
		"obsoleteStatus": "0",
		"originator": "1866978664076804102",
		"originator_name": "李亚苹",
		"org": "1733604510595022850",
		"org_name": "集团",
		"bustype": "1841647505310220291",
		"saleArea": "1916099200016711682",
		"saleArea_name": "01261801",
		"dept": "1733604751101657088",
		"dept_name": "销管一部",
		"ower": "1866978664076804102",
		"ower_name": "李亚苹",
		"creator": "昵称-李亚苹111",
		"createTime": "2024-08-05 11:34:50",
		"createDate": "2024-08-05 11:34:50",
		"isWfControlled": false,
		"taskDefineCharacter": {
			"id": "2058396491629199364",
			"pubts": "2024-08-05 11:34:50",
			"ytenant": "0000LI1EO7E96110660000"
		},
		"taskExecutorList": [
			{
				"executeStatus": "0",
				"reformStatus": 0,
				"acceptStatus": "0",
				"isUnlock": false,
				"executor": "1866978664076804102",
				"executor_name": "李亚苹",
				"endDate": "2024-08-05 23:59:59",
				"id": "2058396491629199362",
				"taskId": "2058396491629199361",
				"startDate": "2024-08-05 00:00:00",
				"pubts": "2024-08-05 11:34:50",
				"tenant": 3304892632636320,
				"ytenant": "0000LI1EO7E96110660000"
			}
		],
		"taskRemindRuleList": [
			{
				"hasDefaultInit": true,
				"remindPoint": "0",
				"advanceTime": 1,
				"timeUnit": "0",
				"ttt_id": "rowId_102",
				"id": "2058396491629199363",
				"taskId": "2058396491629199361",
				"pubts": "2024-08-05 11:34:50",
				"tenant": 3304892632636320,
				"ytenant": "0000LI1EO7E96110660000",
				"yTenantId": "0000LI1EO7E96110660000"
			}
		],
		"resubmitCheckKey": "act_taskcard_add_74b48bdf-e461-4efc-87ed-308becc2349e",
		"id": "2058396491629199361",
		"finishedcondition": 0,
		"creatorId": "1866978672668835846",
		"pubts": "2024-08-05 11:34:50",
		"tenant": 3304892632636320,
		"ytenant": "0000LI1EO7E96110660000",
		"yTenantId": "0000LI1EO7E96110660000"
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

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

