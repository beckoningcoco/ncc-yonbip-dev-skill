---
title: "查询用户待办数据"
apiId: "2163914569448161291"
apiPath: "请求方式	GET"
method: "ContentType"
category: "To-do Message"
domain: "APP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, To-do Message]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询用户待办数据

>  请求方式	GET | To-do Message (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/rest/open/yhttoken/todo/query/list
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
status	string	query	否	待办状态：todo=待办，done=已办    示例: todo    默认值: todo
pageNo	number
小数位数:0,最大长度:10	query	否	页码,大于0的整数    示例: 1    默认值: 1
pageSize	number
小数位数:0,最大长度:10	query	否	每页数量，最大不能超过1000    示例: 10    默认值: 10
receiverUserId	string	query	否	消息接收人用户id    示例: xxxxxx

## 3. 请求示例

Url: /yonbip/uspace/rest/open/yhttoken/todo/query/list?access_token=访问令牌&status=todo&pageNo=1&pageSize=10&receiverUserId=xxxxxx

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
flag	number
小数位数:0,最大长度:10	否	flag 示例：0
msg	string	否	msg
result	object	是	result
tenantId	string	否	tenantId 示例：0000LC5NLRD4GPBAR40000
userId	string	否	userId 示例：eeccdb60-2511-4a7e-87f1-58a51aa7fbdc
primaryId	string	否	primaryId 示例：676bb37031acba02cdaf3975
appId	string	否	appId 示例：1082
businessKey	string	否	businessKey 示例：6e906d56-c291-11ef-a17b-56fb3ad640f2
businessData	object	否	businessData
mUrl	string	否	mUrl 示例：https://bip-daily.yonyoucloud.com/mdf-node/meta/voucher/pu_applyorder/2163903565846806531?domainKey=upu&apptype=mdf&businessStepCode=&tenantId=0000LC5NLRD4GPBAR40000&serviceCode=pu_applyorderlist&taskId=6e906d56-c291-11ef-a17b-56fb3ad640f2&systemCode=&adt=wf&url_actual_build_source=iuap-apcom-messageplatform
webUrl	string	否	webUrl 示例：https://bip-daily.yonyoucloud.com/mdf-node/meta/voucher/pu_applyorder/2163903565846806531?domainKey=upu&businessStepCode=&taskId=6e906d56-c291-11ef-a17b-56fb3ad640f2&appSource=PU&taskFlag=todo&tenantId=0000LC5NLRD4GPBAR40000&apptype=mdf&from_mc_workflow=1&isMobile=false&serviceCode=pu_applyorderlist&adt=wf&url_actual_build_source=iuap-apcom-messageplatform
content	string	否	content 示例：发起人：ws 发起时间：12-25 15:25 发起人部门：采购部
title	string	否	title 示例：请购单QG241225000025
doneStatus	number
小数位数:0,最大长度:10	否	doneStatus 示例：0
approveSource	string	否	approveSource 示例：PU
todoTemplateVars	object	否	todoTemplateVars
commitTsLong	number
小数位数:0,最大长度:13	否	commitTsLong 示例：1735111535278
commitUserId	string	否	commitUserId 示例：eeccdb60-2511-4a7e-87f1-58a51aa7fbdc
preAuditUserId	string	否	preAuditUserId 示例：eeccdb60-2511-4a7e-87f1-58a51aa7fbdc
richText	string	否	richText 示例：<p>发起人：ws<span mp-open-tab=true class="MP-open-tab"> </span></p><p>发起时间：12-25 15:25<span mp-open-tab=true class="MP-open-tab"> </span></p><p>发起人部门：采购部<span mp-open-tab=true class="MP-open-tab"> </span></p>
formId	string	否	formId 示例：PU.pu_applyorder
buttonConfig	object	否	buttonConfig
buttonDisplay	number
小数位数:0,最大长度:10	否	buttonDisplay 示例：0
srcMsgId	string	否	srcMsgId 示例：202412252024122514416a05-64bc-4b1f-bb9f-d5c5855ebc7f:ubpm20210227__00zh_CN__01-1060319192__04todo##nWorvQxn
catid	string	否	catid 示例：6492c44c4fbfdc50cb76caf6
serviceCode	string	否	serviceCode 示例：pu_applyorderlist
readTs	number
小数位数:0,最大长度:10	否	readTs 示例：-1
createTsLong	number
小数位数:0,最大长度:13	否	createTsLong 示例：1735111536890
updateTsLong	number
小数位数:0,最大长度:13	否	updateTsLong 示例：1735111536932
finishTsLong	number
小数位数:0,最大长度:13	否	finishTsLong 示例：1735111536892
msgTsLong	number
小数位数:0,最大长度:13	否	msgTsLong 示例：1735111535324
groupId	string	否	groupId 示例：pu_applyorder_2163903565846806531
orgid	string	否	orgid 示例：1622971822393262081
transType	string	否	transType 示例：2133540234412949514
docType	object	否	docType
displayCode	string	否	异常码

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"flag": 0,
		"msg": "",
		"result": [
			{
				"tenantId": "0000LC5NLRD4GPBAR40000",
				"userId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
				"primaryId": "676bb37031acba02cdaf3975",
				"appId": "1082",
				"businessKey": "6e906d56-c291-11ef-a17b-56fb3ad640f2",
				"businessData": {},
				"mUrl": "https://bip-daily.yonyoucloud.com/mdf-node/meta/voucher/pu_applyorder/2163903565846806531?domainKey=upu&apptype=mdf&businessStepCode=&tenantId=0000LC5NLRD4GPBAR40000&serviceCode=pu_applyorderlist&taskId=6e906d56-c291-11ef-a17b-56fb3ad640f2&systemCode=&adt=wf&url_actual_build_source=iuap-apcom-messageplatform",
				"webUrl": "https://bip-daily.yonyoucloud.com/mdf-node/meta/voucher/pu_applyorder/2163903565846806531?domainKey=upu&businessStepCode=&taskId=6e906d56-c291-11ef-a17b-56fb3ad640f2&appSource=PU&taskFlag=todo&tenantId=0000LC5NLRD4GPBAR40000&apptype=mdf&from_mc_workflow=1&isMobile=false&serviceCode=pu_applyorderlist&adt=wf&url_actual_build_source=iuap-apcom-messageplatform",
				"content": "发起人：ws\t\n发起时间：12-25 15:25\t\n发起人部门：采购部",
				"title": "请购单QG241225000025",
				"doneStatus": 0,
				"approveSource": "PU",
				"todoTemplateVars": {},
				"commitTsLong": 1735111535278,
				"commitUserId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
				"preAuditUserId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
				"richText": "<p>发起人：ws<span mp-open-tab=true class=\"MP-open-tab\">\t\t</span></p><p>发起时间：12-25 15:25<span mp-open-tab=true class=\"MP-open-tab\">\t\t</span></p><p>发起人部门：采购部<span mp-open-tab=true class=\"MP-open-tab\">\t\t</span></p>",
				"formId": "PU.pu_applyorder",
				"buttonConfig": {},
				"buttonDisplay": 0,
				"srcMsgId": "202412252024122514416a05-64bc-4b1f-bb9f-d5c5855ebc7f:ubpm20210227__00zh_CN__01-1060319192__04todo##nWorvQxn",
				"catid": "6492c44c4fbfdc50cb76caf6",
				"serviceCode": "pu_applyorderlist",
				"readTs": -1,
				"createTsLong": 1735111536890,
				"updateTsLong": 1735111536932,
				"finishTsLong": 1735111536892,
				"msgTsLong": 1735111535324,
				"groupId": "pu_applyorder_2163903565846806531",
				"orgid": "1622971822393262081",
				"transType": "2133540234412949514",
				"docType": {}
			}
		],
		"displayCode": ""
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
	1	2026-05-07	
更新
请求说明
新增
请求参数 receiverUserId
支持传参查询指定用户的待办, 调整访问屏幕限制为高频
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

