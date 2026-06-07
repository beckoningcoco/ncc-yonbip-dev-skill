---
title: "活动小结单个保存"
apiId: "1790536372275642375"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Activity Summary"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Activity Summary]
platform_version: "BIP"
source_type: community-api-docs
---

# 活动小结单个保存

>  请求方式	POST | Activity Summary (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/summarysave
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	请求数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
org	string	否	否	销售组织ID，默认活动带入，可录入 示例：1492102528208207880
code	string	否	否	小结编号，当勾选自动编码且勾选手动可改时以填入值为准，未勾选手动可改时填入值不生效 示例：20230726139857
activity	string	否	是	营销活动ID
bustype	string	否	是	交易类型ID，支持传入id或者code其中一项 示例：2261330320724224
ower	string	否	否	负责人ID，支持传入id或者code其中一项，默认活动带入，可录入 示例：1492105156729765896
dept	string	否	否	部门ID，支持传入id或者code其中一项，默认活动带入，可录入 示例：524121215415
saleArea	string	否	否	销售区域ID，支持传入id或者code其中一项，默认活动带入，可录入 示例：1492186984367521798
id	long	否	否	id，新增时不传，更新时传 示例：54121
systemSource	string	否	是	openapi标识，必须传 activityOpenApIAdd 示例：summaryOpenApIAdd
_status	string	否	是	单据状态，新增时Insert，更新时Update 示例：Insert
actualCostList	object	是	是	费用子表数据
summaryMaterialList	object	是	否	小结物料子表数据
summaryDisplay	object	是	否	陈列规格子表数据

## 3. 请求示例

Url: /yonbip/crm/bill/summarysave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"org": "1492102528208207880",
		"code": "20230726139857",
		"activity": "",
		"bustype": "2261330320724224",
		"ower": "1492105156729765896",
		"dept": "524121215415",
		"saleArea": "1492186984367521798",
		"id": 54121,
		"systemSource": "summaryOpenApIAdd",
		"_status": "Insert",
		"actualCostList": [
			{
				"dimension_expense_itemType": "2353778477863168",
				"dimension_expense_item": "2682025078690304",
				"product": "512312315151",
				"productClass": "151251521521",
				"productLine": "468545645",
				"unit": "",
				"unitInvest": 0,
				"actualCount": 0,
				"actualCost": 10,
				"actualSale": 0,
				"actualRate": 100,
				"assumeRate": 100,
				"assumeAmount": 51888.77,
				"payMode": 1,
				"activityCostId": "1564154515541",
				"id": 0,
				"lineNo": 0,
				"_status": "Insert"
			}
		],
		"summaryMaterialList": [
			{
				"product": "",
				"unit": "",
				"quantity": 0,
				"productPrice": 0,
				"productAmount": 0,
				"expenseItem": "",
				"activityMaterial": 0,
				"id": 0,
				"lineNo": 0,
				"_status": ""
			}
		],
		"summaryDisplay": [
			{
				"id": 0,
				"displayId": 0,
				"_status": ""
			}
		]
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
code	string	否	返回编码(200:成功，其 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
code	string	否	小结编码 示例：20230721160009
activity	string	否	活动ID 示例：1775862307261775875
bustype	string	否	交易类型ID 示例：1720906130538890302
reviewReuslt	long	否	检核结果 2：待审 1：合格 0：不合格 示例：2
isCloseStatus	short	否	关闭状态，0 未关闭 示例：0
isWfControlled	boolean	否	是否支持审批流 示例：false
verifystate	short	否	审批状态，0 开立 示例：0
org	string	否	组织ID 示例：1720895968665665543
dept	string	否	所属部门ID 示例：1720896243526795272
saleArea	string	否	销售区域ID 示例：1721419069904650247
ower	string	否	负责人ID 示例：1721393197016940546
currency	string	否	币种ID 示例：1720861076331954206
cust	string	否	客户ID
id	string	否	小结ID 示例：1775863269353324552
pubts	string	否	小结最后修改时间 示例：2023-08-17 11:04:09
actualCostList	object	是	小结费用数据
summaryMaterialList	object	是	小结物料子表数据
summaryDisplay	object	是	小结陈列规则数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "20230721160009",
		"activity": "1775862307261775875",
		"bustype": "1720906130538890302",
		"reviewReuslt": 2,
		"isCloseStatus": 0,
		"isWfControlled": false,
		"verifystate": 0,
		"org": "1720895968665665543",
		"dept": "1720896243526795272",
		"saleArea": "1721419069904650247",
		"ower": "1721393197016940546",
		"currency": "1720861076331954206",
		"cust": "",
		"id": "1775863269353324552",
		"pubts": "2023-08-17 11:04:09",
		"actualCostList": [
			{
				"lineNo": 10,
				"product": "1726613051147812870",
				"productClass": "1707320805388451848",
				"dimension_terminal_chain": "1707319808959709189",
				"unit": "1686627223449108487",
				"payMode": 4,
				"assumeOrg": "1720895968665665543",
				"asumeDept": "1686611675674312706",
				"activityId": "1775862307261775875",
				"unitInvest": 10,
				"actualCount": 10,
				"actualCost": 100,
				"actualSale": 0,
				"actualRate": 100,
				"dimension_expense_item": 1721400214990880772,
				"dimension_expense_itemType": 1721399983062646789,
				"dimension_customer": "1690376111423750150",
				"dimension_terminal": "1731958412826116099",
				"activityCostId": "1775862307261775876",
				"activityCostLineNo": 10,
				"summaryId": "1775863269353324552",
				"id": "1775863269353324553",
				"pubts": "2023-07-21 19:08:15"
			}
		],
		"summaryMaterialList": [
			{
				"lineNo": 10,
				"product": "1736253045129347076",
				"expenseItem": "1721400214990880772",
				"quantity": 16,
				"productPrice": 10,
				"productAmount": 160,
				"activityMaterial": 1775862307261775877,
				"unit": "1721401975934812168",
				"summaryId": "1775863269353324552",
				"id": "1775863269353324554",
				"pubts": "2023-07-21 19:08:15"
			}
		],
		"summaryDisplay": [
			{
				"displayId": 176222542354,
				"pic": "",
				"id": "1795652365508935689",
				"pubts": "2023-08-17 11:04:09"
			}
		]
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
999	费用项和费用类型不能同时为空	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
新增
请求参数 assumeRate
新增
请求参数 assumeAmount
删除
请求参数 businessPeriod

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

