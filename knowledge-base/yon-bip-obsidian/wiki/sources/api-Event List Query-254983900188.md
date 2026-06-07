---
title: "事件列表查询"
apiId: "2549839001886916610"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "API Gateway"
domain: "KFLJFW"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, API Gateway]
platform_version: "BIP"
source_type: community-api-docs
---

# 事件列表查询

>  请求方式	POST | API Gateway (KFLJFW)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/CPC/ucgManage/ucg/event/listEvent
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:2,最大长度:10	否	否	分页页码
pageSize	number
小数位数:2,最大长度:10	否	否	分页大小
domainAppCode	string	否	否	领域应用编码
eventName	string	否	否	事件名称
appKey	string	否	否	appKey，当传递的时候，返回的事件列表，不会包含这个appKey已经订阅过的事件
page	string	否	否	查询来源(ysb传11)

## 3. 请求示例

Url: /yonbip/CPC/ucgManage/ucg/event/listEvent?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"domainAppCode": "",
	"eventName": "",
	"appKey": "",
	"page": ""
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	string	否	返回码，200表示成功 示例：200
data	object	否	分页数据对象
content	object	是	事件列表
pageable	object	否	分页信息
totalPages	number
小数位数:0,最大长度:10	否	总页数 示例：1
totalElements	number
小数位数:0,最大长度:10	否	总记录数 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"content": [
			{
				"id": "00bb4f6bd3ab4266925129db72e696bf",
				"classifyId": "0f3820c7607f4a1db3b9aa23a762f48c",
				"eventCode": "bpm_task_SCMSA_outtime",
				"eventName": "流程任务超时",
				"status": 1,
				"gmtUpdate": "2025-09-04 10:21:23.000",
				"eventDesc": "流程超时后流程信息",
				"sourceName": "流程任务销售SCMSA事件源",
				"publishTime": "2023-05-18 11:07:30",
				"publishUser": "185****3506",
				"sort": 30,
				"eventSource": "0",
				"domainAppCode": "GZTFLOW",
				"classifyPath": "用友 YonBIP-应用平台-数字化建模-工作流",
				"characteristic": false
			}
		],
		"pageable": {},
		"totalPages": 1,
		"totalElements": 1
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
0	未传入优惠券档案id	coupon_id值填写有误
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

