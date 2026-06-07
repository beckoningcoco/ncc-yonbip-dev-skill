---
title: "获取表单行列维度及成员"
apiId: "2095615802045628420"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Form Definition Table"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Form Definition Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取表单行列维度及成员

>  请求方式	POST | Form Definition Table (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/bp/sheet/getWebSample
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
pkObj	string	否	否	表单id 示例：2071844180158578700
dimCode	object	否	否	参数维 示例：{ "YEARS":"2025", "PERIOD":"3", "ACCOUNT":"CurrRate", "SCENARIO":"Budget_bf_Adj", "CURRENCY":"CNY", "VERSION":"v0", "P1":"Z01", "ENTITY":"A006" }
syscode	string	否	是	系统类型，预算:BP 示例：BP
sheetCode	string	否	否	表单编码，和表单id存在一个

## 3. 请求示例

Url: /yonbip/qyjx/bp/sheet/getWebSample?access_token=访问令牌
Body: {
	"pkObj": "2071844180158578700",
	"dimCode": {
		"YEARS": "2025",
		"PERIOD": "3",
		"ACCOUNT": "CurrRate",
		"SCENARIO": "Budget_bf_Adj",
		"CURRENCY": "CNY",
		"VERSION": "v0",
		"P1": "Z01",
		"ENTITY": "A006"
	},
	"syscode": "BP",
	"sheetCode": ""
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
data	object	否	data
formPk	string	否	formPk 示例：2080064876437307396
cubeCode	string	否	cubeCode 示例：Cube1225
cubePk	string	否	cubePk 示例：1892225529697796098
dimCodeMap	object	否	dimCodeMap
areaList	object	是	areaList
success	boolean	否	success 示例：true

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"formPk": "2080064876437307396",
		"cubeCode": "Cube1225",
		"cubePk": "1892225529697796098",
		"dimCodeMap": {
			"SCENARIO": "Budget_bf_Adj"
		},
		"areaList": [
			{
				"areaId": "0",
				"areaName": "数据区1",
				"rowDimCodeList": [
					"ENTITY",
					"ACCOUNT"
				],
				"colDimCodeList": [
					"YEARS",
					"CURRENCY"
				],
				"rowHeaderCellList": [
					{}
				],
				"colHeaderCellList": [
					{}
				]
			}
		]
	},
	"success": true
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
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

