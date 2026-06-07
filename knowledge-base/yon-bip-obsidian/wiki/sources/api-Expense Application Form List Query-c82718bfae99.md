---
title: "费用申请单列表查询"
apiId: "c82718bfae994544b6e5f112c619f012"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Expense Application"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用申请单列表查询

>  请求方式	POST | Expense Application (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/expense/apply/query
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
page	object	否	是	页面参数
pageSize	number
小数位数:0,最大长度:10	否	是	分页条数 示例：20
pageIndex	number
小数位数:0,最大长度:10	否	是	当前页数 示例：1
condition	object	否	否	查询条件
simpleVOs	object	是	否	简单查询条件
commonVOs	object	是	否	查询条件
externalData	object	否	否	关键数据,支持查询orgId,orgId_Code,status,transType,transType_Code,code,逻辑符只支持eq 示例：transType: 2307018761687296
orgId	number
小数位数:0,最大长度:30	否	否	销售组织id 示例：2307018761687296
orgId_Code	string	否	否	销售组织编码 示例：BJZZ001
status	number
小数位数:0,最大长度:1	否	否	单据状态 示例：开立:0,已审核:1,已关闭:2,审核中:3
transType	number
小数位数:0,最大长度:30	否	否	交易类型id 示例：2307018761687296
transType_Code	string	否	否	交易类型编码 示例：FYSQ001
code	string	否	否	单据编码 示例：FYSQ20240530

## 3. 请求示例

Url: /yonbip/sd/expense/apply/query?access_token=访问令牌
Body: {
	"page": {
		"pageSize": 20,
		"pageIndex": 1
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "transType",
				"op": "eq",
				"value1": "2307018761687296",
				"value2": "2022-02-18 14:05:10"
			}
		],
		"commonVOs": [
			{
				"itemName": "queryTask",
				"value1": "1",
				"value2": "1"
			}
		]
	},
	"externalData": {
		"0": "t",
		"1": "r",
		"2": "a",
		"3": "n",
		"4": "s",
		"5": "T",
		"6": "y",
		"7": "p",
		"8": "e",
		"9": ":",
		"10": " ",
		"11": "2",
		"12": "3",
		"13": "0",
		"14": "7",
		"15": "0",
		"16": "1",
		"17": "8",
		"18": "7",
		"19": "6",
		"20": "1",
		"21": "6",
		"22": "8",
		"23": "7",
		"24": "2",
		"25": "9",
		"26": "6",
		"orgId": 2307018761687296,
		"orgId_Code": "BJZZ001",
		"status": NaN,
		"transType": 2307018761687296,
		"transType_Code": "FYSQ001",
		"code": "FYSQ20240530"
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	返回状态 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	当前页 示例：1
pageSize	number
小数位数:0,最大长度:10	否	总共页数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录计数 示例：2
recordList	object	是	记录列表
pageCount	number
小数位数:0,最大长度:10	否	页码 示例：0
beginPageIndex	number
小数位数:0,最大长度:10	否	开始页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	尾页 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 2,
		"recordList": [
			{
				"id": 2308515611545856,
				"dimension_region": 2304176942518528,
				"dimension_region_Name": "北京海淀",
				"transType": 2307018761687296,
				"transType_Name": "618申请单",
				"dimension_expense_item": 2303986324673024,
				"dimension_expense_item_Name": "陈列费",
				"assumeAmount": 200,
				"approveAmount": 200,
				"applyAmount": 200,
				"settledAmount": 100,
				"expectedSaleAmount": 300,
				"expectedSaleAmountTotal": 300,
				"approvedAmountTotal": 200,
				"settledAmountTotal": 100,
				"unsettledAmountTotal": 100,
				"assumeAmountTotal": 200,
				"applyAmountTotal": 200,
				"region": 2284437972849152,
				"region_Name": "北京",
				"modifier": 19904588888,
				"modifyTime": "2021-07-26 10:36:34",
				"dimension_customer": 2284441864835584,
				"dimension_customer_Name": "瑞璞信息科技有限公司",
				"currency": 2282779927728385,
				"currency_Name": "人民币",
				"defaultAssumeOrg": 2284424403341824,
				"defaultAssumeOrg_Name": "销售组织",
				"product": 2283920448311552,
				"product_Name": "青岛啤酒白啤11度500ml*12听(2020版)",
				"dimension_expense_itemType": 2304311058878720,
				"dimension_expense_itemType_Name": "销售费用",
				"expectedExpenseRate": 66.66,
				"advanceCustomer": 2292621660639488,
				"advanceCustomer_Name": "青啤商家4",
				"dimension_terminal_chain": 2307006569812992,
				"dimension_terminal_chain_Name": "北京地区连锁",
				"productClass": 2283908316582144,
				"productClass_Name": "白啤",
				"isWfControlled": true,
				"expenseApplyInfs_id": 2308515611562240,
				"quality": 20,
				"unit": 2283916101800192,
				"unit_Name": "箱",
				"settle_customer": 2284441864835584,
				"settle_customer_Name": "瑞璞信息科技有限公司",
				"dimension_terminal": 2307110249255936,
				"dimension_terminal_Name": "测试终端网点",
				"isRejected": true,
				"status": 0,
				"standardExpenseRate": 1,
				"returncount": 0,
				"verifystate": 0,
				"code": "FYSQ202106190017",
				"defaultAssumeDept": 2284427463840000,
				"defaultAssumeDept_Name": "市场一部",
				"remark": "",
				"department": 2284419742077184,
				"department_Name": "市场部",
				"orgId": 2284424403341824,
				"orgId_Name": "销售组织",
				"assumeOrg": 2284424403341824,
				"assumeOrg_Name": "销售组织",
				"pubts": "2021-07-26 10:36:35",
				"createDate": "2021-06-19 00:00:00",
				"settlementType": 1,
				"creator": "张阳阳",
				"unitInvest": 10,
				"payMode": 3,
				"defaultPayMode": 4,
				"advancePayMode": 3,
				"accountingOrg": 2284424955384320,
				"accountingOrg_Name": "财务组织",
				"applicant": 2306995558584576,
				"applicant_Name": "18317726007",
				"consultSaleAmount": 495,
				"businessPeriod": 1682127325984980998,
				"businessPeriod_Code": "2023-M01"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0
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
999	错误信息	请重新修改参数

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

