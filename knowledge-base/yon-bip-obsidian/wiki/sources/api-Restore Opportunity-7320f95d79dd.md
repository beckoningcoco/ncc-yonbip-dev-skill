---
title: "分页查询商机暂停原因"
apiId: "7320f95d79dd4ba09301bdab8c37cc35"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opportunity"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opportunity]
platform_version: "BIP"
source_type: community-api-docs
---

# 分页查询商机暂停原因

>  请求方式	POST | Opportunity (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/list
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
serviceCode	string	否	否	serviceCode 示例：custdoc 默认值：custdoc
ownDomain	string	否	否	域 示例：yycrm 默认值：yycrm
pageSize	long	否	否	条数 默认值：50
pageIndex	long	否	否	第几页 默认值：1
docType	int	否	否	档案类型为【商机暂停原因】 默认值：6

## 3. 请求示例

Url: /yonbip/crm/bill/list?access_token=访问令牌
Body: {
	"serviceCode": "custdoc",
	"ownDomain": "yycrm",
	"pageSize": 0,
	"pageIndex": 0,
	"docType": 0
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
code	long	否	返回编码(200:成功，其他：失败) 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
pageIndex	long	否	页数 示例：1
pageSize	long	否	条数 示例：20
recordCount	long	否	总数 示例：0
recordList	object	是	暂停原因数组
pageCount	long	否	总页数 示例：0
beginPageIndex	long	否	开始页数 示例：1
endPageIndex	long	否	结束页数 示例：0
pubts	string	否	时间戳 示例：2021-04-25 17:12:49

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"code": "project_delay",
				"createTime": "2021-01-20 10:07:07",
				"docType": "6",
				"name": "项目延期",
				"isPreset": true,
				"id": 2094828346708249,
				"pubts": "2021-01-20 10:07:07",
				"stopstatus": false
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pubts": "2021-04-25 17:12:49"
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
	1	2025-06-25	
更新
返回参数 (19)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

