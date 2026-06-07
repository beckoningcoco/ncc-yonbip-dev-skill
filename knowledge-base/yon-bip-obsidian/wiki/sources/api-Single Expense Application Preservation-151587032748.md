---
title: "费用申请单单个保存"
apiId: "1515870327486808070"
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

# 费用申请单单个保存

>  请求方式	POST | Expense Application (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/expense/apply/saveapply
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
data	object	否	是	费用申请单[usmp.expenseapply.ExpenseApply]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	单据id（修改时填写） 示例：1593900228066934788
code	string	否	否	单据号 示例：FYSQ20221121016871
orgId	string	否	否	销售组织id(销售组织id和销售组织编码不能同时为空) 示例：1555901724669509645
orgId_Code	string	否	否	销售组织编码(销售组织id和销售组织编码不能同时为空) 示例：001
transType	string	否	否	交易类型id(交易类型id和交易类型编码不能同时为空) 示例：1539609986021720073
transType_Code	string	否	否	交易类型编码(交易类型id和交易类型编码不能同时为空) 示例：20220517
accountingOrg	string	否	否	会计主体id(会计主体id和会计主体编码不能同时为空) 示例：1540451120986456340
accountingOrg_Code	string	否	否	会计主体编码(会计主体id和会计主体编码不能同时为空) 示例：001
currency	string	否	否	币种id(币种id和币种编码不能同时为空) 示例：1539562956129830743
currency_Code	string	否	否	币种编码(币种id和币种编码不能同时为空) 示例：CNY
applicant	string	否	否	申请人id(申请人id和申请人编码不能同时为空) 示例：1578355178055663618
applicant_Code	string	否	否	申请人编码(申请人id和申请人编码不能同时为空) 示例：00000002
position	long	否	否	岗位id 示例：1563350108519006208
position_Code	string	否	否	岗位编码 示例：00000001
department	string	否	否	所属部门id(所属部门id和所属部门编码不能同时为空) 示例：1539622192305143816
department_Code	string	否	否	所属部门编码(所属部门id和所属部门编码不能同时为空) 示例：01
region	long	否	否	所属区域id 示例：1566322758456967171
region_Code	string	否	否	所属区域编码 示例：0101
defaultPayMode	BigDecimal	否	否	默认兑付方式(枚举,{1:"订单抵现",2:"数量货补",3:"金额货补",4:"销售折扣",5:"不兑付",6:"付现","7":"转应付","8":"票扣","9":"账扣"},长度1) 示例：6 默认值：4
defaultAssumeOrg	long	否	否	默认承担组织id
defaultAssumeOrg_Code	string	否	否	默认承担组织编码
defaultAssumeDept	long	否	否	默认承担部门id
defaultAssumeDept_Code	string	否	否	默认承担部门编码
expenseDate	string	否	否	申请日期 示例：2022-09-26
remark	string	否	否	备注
costCenter	long	否	否	成本中心id 示例：1550091286755147783
costCenter_Code	string	否	否	成本中心编码 示例：0001
profitCenter	long	否	否	利润中心id 示例：1541940211943997446
profitCenter_Code	string	否	否	利润中心编码 示例：20220812001
_status	string	否	是	操作标识[Insert|Update] 示例：Insert
expenseApplyInfs	object	是	否	申请明细[usmp.expenseapply.ExpenseApplyInfo]新增时必填,修改时可为空
freeDefine	object	否	否	主表自由自定义项
applyAmountTotal	BigDecimal	否	否	申请金额合计 示例：123.000
approvedAmountTotal	BigDecimal	否	否	批复金额合计 示例：100.000
assumeAmountTotal	BigDecimal	否	否	承担金额合计 示例：23.000
settledAmountTotal	BigDecimal	否	否	已结算金额合计 示例：123.000
unsettledAmountTotal	BigDecimal	否	否	未结算余额合计 示例：123.000
expectedSaleAmountTotal	BigDecimal	否	否	预计销售金额合计 示例：300.000
businessPeriod	string	否	否	费用期间id 示例：1682127325984980998
businessPeriod_Code	string	否	否	费用期间编码 示例：2024-01

## 3. 请求示例

Url: /yonbip/sd/expense/apply/saveapply?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1593900228066934788,
		"code": "FYSQ20221121016871",
		"orgId": "1555901724669509645",
		"orgId_Code": "001",
		"transType": "1539609986021720073",
		"transType_Code": "20220517",
		"accountingOrg": "1540451120986456340",
		"accountingOrg_Code": "001",
		"currency": "1539562956129830743",
		"currency_Code": "CNY",
		"applicant": "1578355178055663618",
		"applicant_Code": "00000002",
		"position": 1563350108519006208,
		"position_Code": "00000001",
		"department": "1539622192305143816",
		"department_Code": "01",
		"region": 1566322758456967171,
		"region_Code": "0101",
		"defaultPayMode": 6,
		"defaultAssumeOrg": 0,
		"defaultAssumeOrg_Code": "",
		"defaultAssumeDept": 0,
		"defaultAssumeDept_Code": "",
		"expenseDate": "2022-09-26",
		"remark": "",
		"costCenter": 1550091286755147783,
		"costCenter_Code": "0001",
		"profitCenter": 1541940211943997446,
		"profitCenter_Code": "20220812001",
		"_status": "Insert",
		"expenseApplyInfs": [
			{
				"_status": "Insert",
				"id": 0,
				"lineNo": 10,
				"dimension_terminal": 0,
				"dimension_terminal_Code": "0001",
				"dimension_customer": 1555364372743716865,
				"dimension_customer_Code": "自定义客户0001",
				"dimension_region": 1566323076284547073,
				"dimension_region_Code": "0101",
				"dimension_terminal_chain": 1541240776422326273,
				"dimension_terminal_chain_Code": "01",
				"dimension_expense_item": 1576843564325273601,
				"dimension_expense_item_Code": "01",
				"dimension_expense_itemType": 0,
				"dimension_expense_itemType_Code": "01",
				"product": 1539613765577736198,
				"product_Code": "000023",
				"productClass": 1551584896009895943,
				"productClass_Code": "01",
				"unit": 1539563634739904519,
				"unit_Code": "0101",
				"unitInvest": 100,
				"quality": 2,
				"applyAmount": 200,
				"approveAmount": 200,
				"settlementType": 1,
				"settle_customer": 1549338525038018569,
				"settle_customer_Code": "自定义客户0001",
				"settle_scattered": "",
				"bankAccount": "6225112332218888",
				"bankInfo": 1003110000000006,
				"bankInfo_Code": "00000001",
				"bankType_Name": "上海银行",
				"assumeOrg": "",
				"assumeOrg_Code": "",
				"asumeDept": "",
				"asumeDept_Code": "",
				"assumeRate": 100,
				"assumeAmount": 160,
				"productLine": 0,
				"productLine_Code": "01",
				"payMode": 6,
				"assumeCustomer": 0,
				"assumeCustomer_Code": "",
				"advancePayMode": 6,
				"expectedSaleAmount": 300,
				"expectedExpenseRate": "80（不带%）",
				"marketingActivity": 0,
				"marketingActivity_Code": "",
				"sourceBillType": 0,
				"expenseApplyInfoProperty": {
					"id": 0,
					"propertyValue*": "测试属性1"
				},
				"freeDefine": {
					"id": 2375076105523713,
					"define*": "测试费用1"
				},
				"businessPeriod": "1682127325984980998",
				"businessPeriod_Code": "2024-01"
			}
		],
		"freeDefine": {
			"define*": "测试活动1",
			"id": 2371740888764672
		},
		"applyAmountTotal": 123,
		"approvedAmountTotal": 100,
		"assumeAmountTotal": 23,
		"settledAmountTotal": 123,
		"unsettledAmountTotal": 123,
		"expectedSaleAmountTotal": 300,
		"businessPeriod": "1682127325984980998",
		"businessPeriod_Code": "2024-01"
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
code	string	否	状态码 示例：200
message	string	否	消息提示 示例：操作成功
data	object	否	返回数据
id	long	否	单据ID 示例：2354947104608512
code	string	否	单据编码 示例：FYSQ202107220259
orgId	string	否	销售组织id 示例：2293806909461248
orgId_Code	string	否	销售组织编码 示例：1
transType	string	否	交易类型id 示例：2335085175443712
transType_Code	string	否	交易类型编码 示例：1
accountingOrg	string	否	会计主体id 示例：2293806909461248
accountingOrg_Code	string	否	会计主体编码 示例：1
currency	string	否	币种id 示例：2292497080193280
currency_Code	string	否	币种编码 示例：1
applicant	string	否	申请人id 示例：2333764112798208
applicant_Code	string	否	申请人编码 示例：拉拉
department	string	否	所属部门id 示例：2293807299121408
department_Code	string	否	所属部门编码 示例：1
region	long	否	所属区域id 示例：2306812279296256
region_Code	string	否	所属区域编码 示例：1
defaultPayMode	BigDecimal	否	默认兑付方式(枚举,{1:"订单抵现",2:"数量货补",3:"金额货补",4:"销售折扣",5:"不兑付",6:"付现","7":"转应付","8":"票扣"},长度1) 示例：4
creator	string	否	制单人 示例：18317720002
createDate	string	否	制单日期 示例：2021-07-22 14:11:12
status	long	否	单据状态{0:开立,1:已审核,2:已关闭,3:审核中,4:锁定} 示例：0
marketingPlan	long	否	营销方案id 示例：2335085175443712
marketingPlan_Code	string	否	营销方案编码 示例：20211009000094
remark	string	否	备注
isWfControlled	boolean	否	是否审批流控制 示例：true
returncount	long	否	退回次数 示例：0
expenseApplyInfs	object	是	费用明细
creatorId	long	否	创建人id 示例：2333764983361792
createTime	string	否	创建时间 示例：2021-07-22 14:16:04
pubts	string	否	时间戳 示例：2021-07-22 14:16:04
tenant	long	否	租户Id 示例：2292495487783168
yTenantId	string	否	租户id 示例：0000KPNHEQML4GORAX0000
freeDefine	object	否	主表自由自定义项
businessPeriod	string	否	费用期间id 示例：1682127325984980998
businessPeriod_Code	string	否	费用期间编码 示例：2024-01

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2354947104608512,
		"code": "FYSQ202107220259",
		"orgId": "2293806909461248",
		"orgId_Code": "1",
		"transType": "2335085175443712",
		"transType_Code": "1",
		"accountingOrg": "2293806909461248",
		"accountingOrg_Code": "1",
		"currency": "2292497080193280",
		"currency_Code": "1",
		"applicant": "2333764112798208",
		"applicant_Code": "拉拉",
		"department": "2293807299121408",
		"department_Code": "1",
		"region": 2306812279296256,
		"region_Code": "1",
		"defaultPayMode": 4,
		"creator": "18317720002",
		"createDate": "2021-07-22 14:11:12",
		"status": 0,
		"marketingPlan": 2335085175443712,
		"marketingPlan_Code": "20211009000094",
		"remark": "",
		"isWfControlled": true,
		"returncount": 0,
		"expenseApplyInfs": [
			{
				"lineNo": 10,
				"dimension_terminal": 2353548169908736,
				"dimension_terminal_Code": "1",
				"dimension_customer": 2352133551182336,
				"dimension_customer_Code": "终端lc-1",
				"dimension_region": 2306812570702080,
				"dimension_region_Code": "1",
				"dimension_terminal_chain": 2333701642900480,
				"dimension_terminal_chain_Code": "1",
				"dimension_expense_item": 2311015026053632,
				"dimension_expense_item_Code": "002",
				"dimension_expense_itemType": 2323791746044672,
				"dimension_expense_itemType_Code": "1",
				"product": 2321068678222080,
				"product_Code": "1",
				"productClass": 2321049668129024,
				"productClass_Code": "1",
				"unit": 2295317413466368,
				"unit_Code": "1",
				"unitInvest": 100,
				"quality": 2,
				"applyAmount": 200,
				"approveAmount": 200,
				"settlementType": 1,
				"settle_customer": 2306958490292480,
				"settle_customer_Code": "ZY001",
				"assumeOrg": "2293806909461248",
				"assumeOrg_Code": "1",
				"asumeDept": "2306940108837120",
				"assumeRate": 80,
				"assumeAmount": 160,
				"payMode": 3,
				"assumeCustomer": 2306958490292480,
				"assumeCustomer_Code": "1",
				"advanceCustomer": 2352133551182336,
				"advanceCustomer_Code": "1",
				"advancePayMode": 4,
				"attachmentId": "1a1e3e99-b50e-4fd3-a67b-983d6cb6681c",
				"expectedSaleAmount": 300,
				"marketingActivity": 2352292072247552,
				"marketingActivity_Code": "20210720001872",
				"marketingActivity_Theme": "WW",
				"planExpenseInfo": 2352288485560577,
				"planExpenseInfo_lineNo": "10",
				"id": 2354947104608513,
				"expenseApplyId": 2354947104608512,
				"pubts": "2021-07-22 14:16:04",
				"tenant": 2292495487783168,
				"yTenantId": "0000KPNHEQML4GORAX0000",
				"freeDefine": {
					"define3": "测试活动1",
					"id": 2354947104608513,
					"tenant": 2292495487783168,
					"pubts": "2021-08-05 19:32:21"
				},
				"expenseApplyInfoProperty": {
					"id": 0,
					"propertyValue*": ""
				},
				"businessPeriod": "1682127325984980998",
				"businessPeriod_Code": "2024-01"
			}
		],
		"creatorId": 2333764983361792,
		"createTime": "2021-07-22 14:16:04",
		"pubts": "2021-07-22 14:16:04",
		"tenant": 2292495487783168,
		"yTenantId": "0000KPNHEQML4GORAX0000",
		"freeDefine": {
			"id": 0,
			"define*": ""
		},
		"businessPeriod": "1682127325984980998",
		"businessPeriod_Code": "2024-01"
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

