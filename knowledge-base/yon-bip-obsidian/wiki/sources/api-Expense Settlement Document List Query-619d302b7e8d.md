---
title: "费用结算单列表查询"
apiId: "619d302b7e8d4f00a4e846bfbebcd52e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Expense Settlement Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用结算单列表查询

>  请求方式	POST | Expense Settlement Document (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/settlement/apply/query
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
page	object	否	是	页面参数
pageSize	long	否	是	分页条数 示例：20
pageIndex	long	否	是	当前页数 示例：1
condition	object	否	否	查询条件
simpleVOs	object	是	否	可作为查询条件的字段包括{1:orgId(orgId_Code), 2:transType(transType_Code), 3:code, 4:accountingPeriod(accountingPeriod_Code), 5:applicant(applicant_Code), 6: department(department_Code), 7:region(region_Code), 8: creator, 9:createDate, 10:status, 11:dimension_expense_item(dimension_expense_item_Code), 12:dimension_expense_itemType(dimension_expense_itemType_Code), 13:settle_customer(settle_customer_Code), 14:settle_vendor(settle_vendor_Code), 15:settle_person(settle_person_Code),16:payMode, 17:assumeOrg(assumeOrg_Code),18:asumeDept(asumeDept_Code), 19:queryTask, 20:remainVerificationDays}
externalData	object	否	否	关键数据,支持査询
orgId	number
小数位数:0,最大长度:30	否	否	销售组织id
orgId_Code	string	否	否	销售组织编码
status	number
小数位数:0,最大长度:1	否	否	单据状态
transType	number
小数位数:0,最大长度:30	否	否	交易类型id
transType_Code	string	否	否	交易类型编码
code	string	否	否	单据编码

## 3. 请求示例

Url: /yonbip/sd/settlement/apply/query?access_token=访问令牌
Body: {
	"page": {
		"pageSize": 20,
		"pageIndex": 1
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "",
				"op": "",
				"value1": "",
				"value2": ""
			}
		]
	},
	"externalData": {
		"orgId": 0,
		"orgId_Code": "",
		"status": 0,
		"transType": 0,
		"transType_Code": "",
		"code": ""
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
code	long	否	返回状态 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
pageIndex	long	否	当前页数 示例：1
pageSize	long	否	分页条数 示例：20
recordCount	long	否	返回记录条数 示例：0
recordList	object	是	记录数据
sumRecordList	object	是	合计集合
pageCount	long	否	总页数 示例：0
beginPageIndex	long	否	起始页下标 示例：1
endPageIndex	long	否	结束页下标 示例：0

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
				"id": 2381887707337216,
				"code": "FYJS202108100171",
				"lineNo": 10,
				"createDate": "2021-08-10 00:00:00",
				"orgId": "2283934349612288",
				"orgId_Name": "飞鹤乳业",
				"transType": "2380614409015552",
				"transType_Name": "柒捌玖的费用结算单",
				"dimension_terminal": 2332591366034688,
				"dimension_terminal_Name": "飞鹤门店（北京）",
				"dimension_customer": 2284449079693568,
				"dimension_customer_Name": "飞鹤母婴专卖店-直营",
				"dimension_region": 2284432205385984,
				"dimension_region_Name": "西区",
				"dimension_terminal_chain": 2311208846201856,
				"dimension_terminal_chain_Name": "大润发",
				"dimension_expense_item": 2380548472852992,
				"dimension_expense_item_Name": "壹陆柒玖的费用",
				"dimension_expense_itemType": 2285621789528576,
				"dimension_expense_itemType_Name": "活动费用",
				"settlementType": "1",
				"settle_customer": 2284449079693568,
				"settle_customer_Name": "飞鹤母婴专卖店-直营",
				"applyAmount": 2200,
				"approveAmount": 2000,
				"settleAmount": 2000,
				"payMode": 1,
				"quality": 9.09090909,
				"unitInvest": 220,
				"assumeRate": 100,
				"assumeAmount": 2000,
				"marketingActivity": 2381857496715520,
				"marketingActivity_Theme": "222",
				"isRejected": false,
				"sourceBillType": "1",
				"expenseApply": 2381872711062016,
				"expenseApply_Code": "FYSQ202108100250",
				"expenseApplyInfo": 2381872711062017,
				"expenseApplyInfo_lineNo": 10,
				"currency": "2282767198392576",
				"currency_Name": "人民币",
				"applyAmountTotal": 2200,
				"settleAmountTotal": 2000,
				"assumeeAmountTotal": 2200,
				"actualSaleAmountTotal": 0,
				"applicant": "2361854426534144",
				"applicant_Name": "韦嘉佳",
				"department": "2342192496283904",
				"department_Name": "测试部门",
				"defaultAssumeOrg": "2283934349612288",
				"defaultAssumeOrg_Name": "飞鹤乳业",
				"remark": {},
				"isWfControlled": false,
				"status": 1,
				"returncount": 0,
				"verifystate": 2,
				"settledDate": "2021-08-10 00:00:00",
				"settlementApplyInfs_id": 2381887707337217,
				"accountingOrg": "2283934349612288",
				"accountingOrg_Name": "飞鹤乳业",
				"defaultPayMode": "4",
				"creator": "韦嘉佳",
				"auditor": "韦嘉佳",
				"auditTime": "2021-08-10 15:04:02",
				"pubts": "2021-08-10 15:04:02",
				"businessPeriod": "1682127325984980998",
				"businessPeriod_Code": "2023-M01"
			}
		],
		"sumRecordList": [
			{
				"settleAmountTotal": 2000,
				"applyAmountTotal": 2200,
				"actualSaleAmountTotal": 0
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
	1	2025-06-25	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

