---
title: "查询用户工作通知"
apiId: "2163932642670542857"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Notifications"
domain: "APP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Notifications]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询用户工作通知

>  请求方式	GET | Notifications (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/server/query/notify/NOTIFY/list
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
readStatus	string	query	否	通知状态：UNREAD=未读，READ=已读    示例: UNREAD    默认值: UNREAD
pageNo	number
小数位数:0,最大长度:10	query	否	页码,大于0的整数    示例: 1    默认值: 1
pageSize	number
小数位数:0,最大长度:10	query	否	每页数量，最大不能超过1000    示例: 10    默认值: 10

## 3. 请求示例

Url: /yonbip/uspace/server/query/notify/NOTIFY/list?access_token=访问令牌&readStatus=UNREAD&pageNo=1&pageSize=10

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
ctime	number
小数位数:0,最大长度:13	否	ctime 示例：1735113765991
utime	number
小数位数:0,最大长度:13	否	utime 示例：1735113765991
tenantId	string	否	tenantId 示例：0000LC5NLRD4GPBAR40000
userId	string	否	userId 示例：eeccdb60-2511-4a7e-87f1-58a51aa7fbdc
notifyId	string	否	notifyId 示例：mp_f93340cb-c828-4b27-ba16-609a3665278a
title	string	否	title 示例：审批结束提醒
status	string	否	status 示例：UNREAD
businessId	string	否	businessId 示例：98ae7edb-c296-11ef-825c-4a0a682685f1
content	string	否	content 示例：ws于12-25 16:02提交的子流程1225已于12-25 16:02审批结束。
highlight	string	否	highlight
mobileUrl	string	否	mobileUrl 示例：https://bip-daily.yonyoucloud.com/mdf-node/meta/voucher/pu_applyorder/2163922558192189446?domainKey=upu&apptype=mdf&businessStepCode=&tenantId=0000LC5NLRD4GPBAR40000&serviceCode=pu_applyorderlist&taskId=98c7d2f2-c296-11ef-825c-4a0a682685f1&systemCode=&adt=wf&url_actual_build_source=iuap-apcom-messageplatform
webUrl	string	否	webUrl 示例：https://bip-daily.yonyoucloud.com/mdf-node/meta/voucher/pu_applyorder/2163922558192189446?domainKey=upu&businessStepCode=&taskId=98c7d2f2-c296-11ef-825c-4a0a682685f1&appSource=PU&taskFlag=${doneStatusStr}&tenantId=0000LC5NLRD4GPBAR40000&apptype=mdf&from_mc_workflow=1&isMobile=false&serviceCode=pu_applyorderlist&adt=wf&url_actual_build_source=iuap-apcom-messageplatform
approveSource	string	否	approveSource 示例：PU
commitUserId	string	否	commitUserId 示例：eeccdb60-2511-4a7e-87f1-58a51aa7fbdc
formId	string	否	formId 示例：PU.pu_applyorder
from	string	否	from 示例：notify_app.esntest.upesn
appId	string	否	appId 示例：1082
srcMsgId	string	否	srcMsgId 示例：20241225202412253cbae41b-01bd-4c2a-82ee-f1e2b3928355:ubpm20210227__00zh_CN__01-1060319192__04approved##gDoKmbNW
isTop	number
小数位数:0,最大长度:10	否	isTop 示例：0
richText	string	否	richText 示例：ws于12-25 16:02提交的子流程1225已于12-25 16:02审批结束。
catid	string	否	catid 示例：6492c44c4fbfdc50cb76caf6
displayCode	string	否	错误码

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"flag": 0,
		"msg": "",
		"result": [
			{
				"ctime": 1735113765991,
				"utime": 1735113765991,
				"tenantId": "0000LC5NLRD4GPBAR40000",
				"userId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
				"notifyId": "mp_f93340cb-c828-4b27-ba16-609a3665278a",
				"title": "审批结束提醒",
				"status": "UNREAD",
				"businessId": "98ae7edb-c296-11ef-825c-4a0a682685f1",
				"content": "ws于12-25 16:02提交的子流程1225已于12-25 16:02审批结束。",
				"highlight": "",
				"mobileUrl": "https://bip-daily.yonyoucloud.com/mdf-node/meta/voucher/pu_applyorder/2163922558192189446?domainKey=upu&apptype=mdf&businessStepCode=&tenantId=0000LC5NLRD4GPBAR40000&serviceCode=pu_applyorderlist&taskId=98c7d2f2-c296-11ef-825c-4a0a682685f1&systemCode=&adt=wf&url_actual_build_source=iuap-apcom-messageplatform",
				"webUrl": "https://bip-daily.yonyoucloud.com/mdf-node/meta/voucher/pu_applyorder/2163922558192189446?domainKey=upu&businessStepCode=&taskId=98c7d2f2-c296-11ef-825c-4a0a682685f1&appSource=PU&taskFlag=${doneStatusStr}&tenantId=0000LC5NLRD4GPBAR40000&apptype=mdf&from_mc_workflow=1&isMobile=false&serviceCode=pu_applyorderlist&adt=wf&url_actual_build_source=iuap-apcom-messageplatform",
				"approveSource": "PU",
				"commitUserId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
				"formId": "PU.pu_applyorder",
				"from": "notify_app.esntest.upesn",
				"appId": "1082",
				"srcMsgId": "20241225202412253cbae41b-01bd-4c2a-82ee-f1e2b3928355:ubpm20210227__00zh_CN__01-1060319192__04approved##gDoKmbNW",
				"isTop": 0,
				"richText": "ws于12-25 16:02提交的子流程1225已于12-25 16:02审批结束。",
				"catid": "6492c44c4fbfdc50cb76caf6"
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

