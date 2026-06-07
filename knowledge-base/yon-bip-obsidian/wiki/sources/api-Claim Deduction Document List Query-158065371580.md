---
title: "索赔扣款单列表查询"
apiId: "1580653715801505795"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Claim Deduction"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Claim Deduction]
platform_version: "BIP"
source_type: community-api-docs
---

# 索赔扣款单列表查询

>  请求方式	POST | Claim Deduction (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/synergy/claimList
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
pageIndex	int	否	是	页码 示例：1 默认值：1
pageSize	int	否	是	页面大小 示例：10 默认值：10
code	string	否	否	单据编码 示例：RD202211090002
billDate	string	否	否	单据日期 示例：2022-11-09|2022-12-09
claimTitle	string	否	否	索赔扣款标题 示例：测试openApi1109
tradeType	string	否	否	交易类型 示例：1566609250051424260
claimTotalAmount	BigDecimal	否	否	索赔扣款总额 示例：1111
processMode	string	否	否	处理方式（1：货补； 2：发票抵扣； 3：扣款传应付； 4：现金；5:对账传应付） 示例：4
claimStatus	string	否	否	状态（1:开立,2:审批中,3:审批驳回,4:已审批） 示例：4
synergyStatus	string	否	否	协同状态（1:待发布,11:待供应商确认,3:已申诉,12:申诉驳回,5:已确认,6:已执行,7:已取消,8:申诉处理中） 示例：1
pubts	string	否	否	时间戳 示例：2023-12-16 23:59:59|2023-12-26 23:59:59
createTime	string	否	否	创建时间 示例：2023-12-16 23:59:59|2023-12-26 23:59:59
auditTime	string	否	否	审批时间 示例：2023-12-16 23:59:59|2023-12-26 23:59:59
modifyTime	string	否	否	修改时间 示例：2023-12-16 23:59:59|2023-12-26 23:59:59
simpleVOs	object	是	否	扩展条件
logicOp	string	否	否	操作符 示例：or
conditions	object	是	否	查询条件

## 3. 请求示例

Url: /yonbip/cpu/synergy/claimList?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "RD202211090002",
	"billDate": "2022-11-09|2022-12-09",
	"claimTitle": "测试openApi1109",
	"tradeType": "1566609250051424260",
	"claimTotalAmount": 1111,
	"processMode": "4",
	"claimStatus": "4",
	"synergyStatus": "1",
	"pubts": "2023-12-16 23:59:59|2023-12-26 23:59:59",
	"createTime": "2023-12-16 23:59:59|2023-12-26 23:59:59",
	"auditTime": "2023-12-16 23:59:59|2023-12-26 23:59:59",
	"modifyTime": "2023-12-16 23:59:59|2023-12-26 23:59:59",
	"simpleVOs": [
		{
			"logicOp": "or",
			"conditions": [
				{
					"field": "pubts",
					"op": "between",
					"value1": "2021-11-17 00:00:00",
					"value2": "2021-12-16 23:59:59"
				}
			]
		}
	]
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
code	string	否	状态码 示例：200
message	string	否	返回消息 示例：操作成功
data	object	否	业务数据
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页大小 示例：10
recordCount	long	否	列表行数 示例：1
recordList	object	是	列表数据
pageCount	long	否	页码总数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"returncount": 0,
				"id": 3010539998630144,
				"code": "RD202210280019",
				"supplierContact_contactmobile": "18989999104",
				"billingOrg": "1476530789273829376",
				"feedbackTime": "2022-10-21 14:31:34",
				"supplier": 2766825815085312,
				"currencyIdDiwork": "1441759678822875165",
				"purchaser_name": "华北采购员",
				"currencyIdDiwork_name": "人民币",
				"confirmFile": "ee617080-56a1-11ed-a989-9f4b1962208a",
				"supplier_name": "mdd云采测试专用供应商04",
				"purchaseOrg": "1450503124116570113",
				"appealFile": "ee6a4a20-56a1-11ed-a989-9f4b1962208a",
				"tradeType": "1566609370300547075",
				"creator": "昵称-yc_18989999102",
				"claimDescription": "asdad",
				"isWfControlled": false,
				"purchaser": "1450510030440235016",
				"executiveFile": "ee6ae660-56a1-11ed-a989-9f4b1962208a",
				"billingOrg_name": "测试公司",
				"billDate": "2022-10-25 00:00:00",
				"purchaseOrg_name": "天海总公司（mdd融合）",
				"supplier_relationTenantId": "0000L2VLXM4Z7TOHKZ0000",
				"claimTitle": "测试审核1026",
				"createTime": "2022-10-28 17:20:14",
				"tradeType_name": "特殊索赔",
				"claimTotalAmount": 1000,
				"supplierContact_contactname": "gys04",
				"processMode": "2",
				"purchaseName": "0427日常mdd融合",
				"supplierContact": "2766825815085318",
				"synergyStatus": "8",
				"claimStatus": "1",
				"expenseItem": "1607279068456681477",
				"expenseItem_name": "费用项目",
				"expenseMaterial": 1607279068456681477,
				"expenseMaterial_name": "费用物料",
				"dept": "1607279068456681477",
				"dept_name": "采购部门"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
999	系统异常，请联系管理员查看后台日志	

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

