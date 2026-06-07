---
title: "费用申请单详情查询"
apiId: "7325492ed6b44bd892cf7506e8e3401c"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Expense Application"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用申请单详情查询

>  请求方式	GET | Expense Application (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/expense/apply/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	单据ID    示例: 1581288365947879428
code	string	query	否	单据编码    示例: FYSQ2022110116998

## 3. 请求示例

Url: /yonbip/sd/expense/apply/detail?access_token=访问令牌&id=1581288365947879428&code=FYSQ2022110116998

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
code	string	否	状态码 示例：200
message	string	否	消息提示 示例：操作成功
data	object	否	返回数据
id	long	否	单据id 示例：2308515611545856
code	string	否	单据编码 示例：FYSQ202106190017
orgId	string	否	销售组织id 示例：2284424403341824
orgId_Name	string	否	销售组织名称 示例：销售组织
orgId_Code	string	否	销售组织编码 示例：002
transType	string	否	交易类型id 示例：2307018761687296
transType_Name	string	否	交易类型名称 示例：618申请单
transType_Code	string	否	交易类型编码 示例：061800
accountingOrg	string	否	会计主体id 示例：2284424955384320
accountingOrg_Name	string	否	会计主体名称 示例：财务组织
accountingOrg_Code	string	否	会计主体编码 示例：003
currency	string	否	币种id 示例：2282779927728385
currency_Name	string	否	币种名称 示例：人民币
currency_Code	string	否	币种编码 示例：CNY
applyAmountTotal	BigDecimal	否	申请金额合计 示例：200
approvedAmountTotal	BigDecimal	否	批复金额合计 示例：200
assumeAmountTotal	BigDecimal	否	承担金额合计 示例：200
settledAmountTotal	BigDecimal	否	已结算金额合计 示例：100
unsettledAmountTotal	BigDecimal	否	未结算余额合计 示例：100
expectedSaleAmountTotal	BigDecimal	否	预计销售金额合计 示例：300
expectedExpenseRate	double	否	预计费率(%) 示例：66.66
masterOrgKeyField	string	否	组织 示例：orgId
applicant	string	否	申请人id 示例：2306995558584576
applicant_Name	string	否	申请人名称 示例：18317726007
applicant_Code	string	否	申请人编码 示例：A000006
defaultAssumeOrg	string	否	默认承担组织id 示例：2284424403341824
defaultAssumeOrg_Name	string	否	默认承担组织名称 示例：销售组织
region	long	否	所属区域id 示例：2284437972849152
region_Name	string	否	所属区域名称 示例：北京
modifier	string	否	最近修改人 示例：19904588888
modifyTime	string	否	最近修改时间 示例：2021-07-26 10:36:34
pubts	string	否	时间戳 示例：2021-07-26 10:36:35
department	string	否	所属部门id 示例：2284419742077184
department_Name	string	否	所属部门名称 示例：市场部
department_Code	string	否	所属部门编码 示例：01
defaultPayMode	string	否	默认兑付方式(枚举,{1:"订单抵现",2:"数量货补",3:"金额货补",4:"销售折扣",5:"不兑付",6:"付现","7":"转应付","8":"票扣"},长度1) 示例：4
creator	string	否	制单人 示例：张阳阳
createDate	string	否	制单日期 示例：2021-06-19 00:00:00
defaultAssumeDept	string	否	默认承担部门id 示例：2284427463840000
defaultAssumeDept_Name	string	否	默认承担部门名称 示例：市场一部
transTypeKeyField	string	否	交易类型 示例：transType
status	long	否	单据状态(枚举,{0:"开立",1:"已审核",2:"已关闭",3:"审核中",4:"锁定"},长度1) 示例：0
remark	string	否	备注
isWfControlled	boolean	否	是否审批流控制 示例：true
verifystate	long	否	审核状态(枚举,{"0":"初始开立","1":"审批中","2":"审批完成","3":"不通过流程终止","4":"驳回到制单"},长度1) 示例：0
returncount	long	否	退回次数 示例：0
expenseApplyInfs	object	是	费用明细
freeDefine	object	否	费用申请单自由自定义项（1-120）
businessPeriod	string	否	费用期间id 示例：1682127325984980998
businessPeriod_Code	string	否	费用期间编码 示例：2023-M01

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2308515611545856,
		"code": "FYSQ202106190017",
		"orgId": "2284424403341824",
		"orgId_Name": "销售组织",
		"orgId_Code": "002",
		"transType": "2307018761687296",
		"transType_Name": "618申请单",
		"transType_Code": "061800",
		"accountingOrg": "2284424955384320",
		"accountingOrg_Name": "财务组织",
		"accountingOrg_Code": "003",
		"currency": "2282779927728385",
		"currency_Name": "人民币",
		"currency_Code": "CNY",
		"applyAmountTotal": 200,
		"approvedAmountTotal": 200,
		"assumeAmountTotal": 200,
		"settledAmountTotal": 100,
		"unsettledAmountTotal": 100,
		"expectedSaleAmountTotal": 300,
		"expectedExpenseRate": 66.66,
		"masterOrgKeyField": "orgId",
		"applicant": "2306995558584576",
		"applicant_Name": "18317726007",
		"applicant_Code": "A000006",
		"defaultAssumeOrg": "2284424403341824",
		"defaultAssumeOrg_Name": "销售组织",
		"region": 2284437972849152,
		"region_Name": "北京",
		"modifier": "19904588888",
		"modifyTime": "2021-07-26 10:36:34",
		"pubts": "2021-07-26 10:36:35",
		"department": "2284419742077184",
		"department_Name": "市场部",
		"department_Code": "01",
		"defaultPayMode": "4",
		"creator": "张阳阳",
		"createDate": "2021-06-19 00:00:00",
		"defaultAssumeDept": "2284427463840000",
		"defaultAssumeDept_Name": "市场一部",
		"transTypeKeyField": "transType",
		"status": 0,
		"remark": "",
		"isWfControlled": true,
		"verifystate": 0,
		"returncount": 0,
		"expenseApplyInfs": [
			{
				"id": 2308515611562240,
				"lineNo": 10,
				"expenseApplyId": 2308515611545856,
				"assumeAmount": 200,
				"applyAmount": 200,
				"approveAmount": 200,
				"expectedSaleAmount": 300,
				"settledAmount": 100,
				"dimension_region": 2304176942518528,
				"dimension_region_Name": "北京海淀",
				"assumeRate": 100,
				"advanceCustomer": 2292621660639488,
				"advanceCustomer_Name": "青啤商家4",
				"dimension_expense_item": 2303986324673024,
				"dimension_expense_item_Code": "03",
				"dimension_expense_item_Name": "陈列费",
				"dimension_terminal": 2307110249255936,
				"dimension_terminal_Name": "测试终端网点",
				"dimension_customer": 2284441864835584,
				"dimension_customer_Name": "瑞璞信息科技有限公司",
				"dimension_customer_Code": "9",
				"unit": 2283916101800192,
				"unit_Name": "箱",
				"assumeOrg": "2284424403341824",
				"assumeOrg_Name": "销售组织",
				"settle_customer": 2284441864835584,
				"settle_customer_Code": "9",
				"settle_customer_Name": "瑞璞信息科技有限公司",
				"pubts": "2021-07-26 10:36:35",
				"product": 2283920448311552,
				"product_Name": "青岛啤酒白啤11度500ml*12听(2020版)",
				"productClass": 2283908316582144,
				"productClass_Name": "白啤",
				"dimension_expense_itemType": 2304311058878720,
				"dimension_expense_itemType_Name": "销售费用",
				"settlementType": "1",
				"expectedExpenseRate": 66.66,
				"unitInvest": 10,
				"payMode": "3",
				"advancePayMode": "3",
				"quality": 20,
				"consultSaleAmount": 495,
				"unit_Precision": 0,
				"dimension_terminal_chain": 2307006569812992,
				"dimension_terminal_chain_Name": "北京地区连锁",
				"isRejected": true,
				"standardExpenseRate": 1,
				"freeDefine": {
					"id": 2375076105523713,
					"define1": "测试费用1"
				},
				"businessPeriod": "1682127325984980998",
				"businessPeriod_Code": "2023-M01"
			}
		],
		"freeDefine": {
			"id": 2375076105523713,
			"define1": "测试费用1"
		},
		"businessPeriod": "1682127325984980998",
		"businessPeriod_Code": "2023-M01"
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

