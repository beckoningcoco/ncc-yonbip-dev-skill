---
title: "组织树版本同步接口"
apiId: "2273913019816738820"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 组织树版本同步接口

>  请求方式	POST | Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/openapi/treedatasync/treeversionsync
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
pubts	string	否	是	pubts 示例：2000-01-01 00:00:00
funcCode	string	否	是	funcCode，值为adminorg,orgunit 示例：adminorg
pageIndex	number
小数位数:0,最大长度:10	否	否	分页，从1开始 示例：1
pageSize	number
小数位数:0,最大长度:10	否	否	每页大小 示例：100
timelineDate	string	否	否	日期 示例：2000-01-01

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/treedatasync/treeversionsync?access_token=访问令牌
Body: {
	"pubts": "2000-01-01 00:00:00",
	"funcCode": "adminorg",
	"pageIndex": 1,
	"pageSize": 100,
	"timelineDate": "2000-01-01"
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
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	data
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：10
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：21
recordList	object	是	recordList
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：3
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：3
traceId	string	否	traceId 示例：d2f4cc1a82fffbb0
uploadable	string	否	uploadable 示例：0
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 21,
		"recordList": [
			{
				"id": "2210528098625519651",
				"treeId": "2210528098625519650",
				"name": "行政组织树",
				"startTime": "1970-01-01 00:00:00",
				"endTime": "1970-01-01 23:59:59",
				"syncStatus": 2,
				"description": "初始化默认人力树版本",
				"creator": "admin",
				"creationtime": "2025-02-26 11:09:01",
				"modifier": "123",
				"modifiedtime": "2025-04-25 10:43:56",
				"tenantId": "0000M7LC4GG1FDTLOH0000",
				"versionNo": "1970010101"
			}
		],
		"pageCount": 3,
		"beginPageIndex": 1,
		"endPageIndex": 3
	},
	"traceId": "d2f4cc1a82fffbb0",
	"uploadable": "0",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	职能编码参数为空	操作失败

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

