---
title: "费用结算单详情查询"
apiId: "0417435a0ded44afbaabd1f0daa8a50c"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Expense Settlement Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用结算单详情查询

>  请求方式	GET | Expense Settlement Document (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/settlement/apply/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	单据ID,可在列表查询获取
code	string	query	否	单据编码

## 3. 请求示例

Url: /yonbip/sd/settlement/apply/detail?access_token=访问令牌&id=&code=

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
data	object	否	业务数据
id	long	否	结算单主键id
code	string	否	结算单号
pubts	string	否	时间戳(示例：2022-08-23 13:53:59） 示例：2022-08-23 13:53:59
orgId	string	否	销售组织id
orgId_Name	string	否	销售组织名称
orgId_Code	string	否	销售组织编码
transType	string	否	结算申请交易类型id
transType_Name	string	否	结算申请交易类型名称
transType_Code	string	否	结算申请交易类型编码
accountingOrg	string	否	会计主体id
accountingOrg_Name	string	否	会计主体名称
accountingOrg_Code	string	否	会计主体编码
currency	string	否	币种id
currency_Name	string	否	币种名称
applyAmountTotal	BigDecimal	否	申请金额合计
settleAmountTotal	BigDecimal	否	结算金额合计
actualSaleAmountTotal	BigDecimal	否	实际销售合计
actualExpenseRate	string	否	实际费率
defaultPayMode	string	否	默认兑付方式(枚举,{1:"订单抵现",2:"数量货补",3:"金额货补",4:"销售折扣",5:"不兑付",6:"付现","7":"转应付","8":"票扣"},长度1)
applicant	string	否	申请人id
applicant_Name	string	否	申请人名称
applicant_Code	string	否	申请人编码
settledDate	string	否	结算日期(示例：2022-08-23 00:00:00) 示例：2022-08-23 00:00:00
department	string	否	所属部门id
department_Name	string	否	所属部门名称
department_Code	string	否	所属部门编码
region	long	否	所属区域id
region_Name	string	否	所属区域名称
defaultAssumeOrg	string	否	默认承担组织id
defaultAssumeOrg_Name	string	否	默认承担组织名称
defaultAssumeDept	string	否	默认承担部门id
defaultAssumeDept_Name	string	否	默认承担部门名称
creator	string	否	制单人
createDate	string	否	制单日期（示例：2022-08-23 00:00:00） 示例：2022-08-23 00:00:00
modifier	string	否	最近修改人
modifyTime	string	否	最近修改时间
status	int	否	单据状态(枚举,{0:"开立",1:"已审核",2:"已关闭",3:"审核中",4:"锁定"},长度1) 示例：1
verifystate	int	否	审批状态(枚举,{"0":"初始开立","1":"审批中","2":"审批完成","3":"不通过流程终止","4":"驳回到制单"},长度1)
auditor	string	否	审批人
auditTime	string	否	审批时间示例：2022-08-23 14:23:14 示例：2022-08-23 14:23:14
remark	string	否	备注
isWfControlled	boolean	否	是否审批流控制 (示例：(布尔{"true":"是","fasle":"否"})) 示例：false
returncount	BigDecimal	否	退回次数
shop	BigDecimal	否	商家id
shop_Name	string	否	商家名称
assumeeAmountTotal	BigDecimal	否	承担金额合计
define	object	否	结算申请单自定义项(1-60)
marketingPlan	string	否	营销方案id
marketingPlan_Theme	string	否	营销方案主题
marketingPlan_Code	string	否	营销方案
freeDefine	object	否	结算申请单自由自定义项(1-120)
vouchdate	string	否	单据日期
region_Code	string	否	所属区域编码
mainAttachment	string	否	整单附件
currency_Code	string	否	币种编码
position	string	否	职位id
position_Name	string	否	岗位名称
freezeAmountTotal	BigDecimal	否	冻结金额合计
description	string	否	正文
settlementSupplyInfs	object	是	费用结算单货补明细集合
settlementApplyInfs	object	是	结算申请单详情集合
businessPeriod	string	否	费用期间id 示例：1682127325984980998
businessPeriod_Code	string	否	费用期间编码 示例：2023-M01

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 0,
		"code": "",
		"pubts": "2022-08-23 13:53:59",
		"orgId": "",
		"orgId_Name": "",
		"orgId_Code": "",
		"transType": "",
		"transType_Name": "",
		"transType_Code": "",
		"accountingOrg": "",
		"accountingOrg_Name": "",
		"accountingOrg_Code": "",
		"currency": "",
		"currency_Name": "",
		"applyAmountTotal": 0,
		"settleAmountTotal": 0,
		"actualSaleAmountTotal": 0,
		"actualExpenseRate": "",
		"defaultPayMode": "",
		"applicant": "",
		"applicant_Name": "",
		"applicant_Code": "",
		"settledDate": "2022-08-23 00:00:00",
		"department": "",
		"department_Name": "",
		"department_Code": "",
		"region": 0,
		"region_Name": "",
		"defaultAssumeOrg": "",
		"defaultAssumeOrg_Name": "",
		"defaultAssumeDept": "",
		"defaultAssumeDept_Name": "",
		"creator": "",
		"createDate": "2022-08-23 00:00:00",
		"modifier": "",
		"modifyTime": "",
		"status": 1,
		"verifystate": 0,
		"auditor": "",
		"auditTime": "2022-08-23 14:23:14",
		"remark": "",
		"isWfControlled": false,
		"returncount": 0,
		"shop": 0,
		"shop_Name": "",
		"assumeeAmountTotal": 0,
		"define": {
			"id": 0,
			"define1": ""
		},
		"marketingPlan": "",
		"marketingPlan_Theme": "",
		"marketingPlan_Code": "",
		"freeDefine": {
			"id": 0,
			"define1": ""
		},
		"vouchdate": "",
		"region_Code": "",
		"mainAttachment": "",
		"currency_Code": "",
		"position": "",
		"position_Name": "",
		"freezeAmountTotal": 0,
		"description": "",
		"settlementSupplyInfs": [
			{
				"id": 0,
				"settle_customer": 0,
				"settle_customer_Name": "",
				"settlementApplyId": 0,
				"pubts": "",
				"dimension_expense_item": 0,
				"dimension_expense_item_Name": "",
				"dimension_expense_itemType": 0,
				"dimension_expense_itemType_Name": "",
				"productSKU": 0,
				"productSKU_Code": "",
				"productSKU_Name": "",
				"product": 0,
				"product_Code": "",
				"product_Name": "",
				"productClass": 0,
				"productClass_Name": "",
				"unit": 0,
				"unit_Name": "",
				"amount": 0,
				"quantity": 0,
				"payMode": "",
				"unit_Precision": NaN,
				"marketingActivity": 0,
				"marketingActivity_Code": "",
				"product_ProductApplyRangeId": 0,
				"settle_customer_Code": "",
				"unitPrice": 0,
				"productLine": 0,
				"productLine_Name": "",
				"productBrand": 0,
				"productBrand_Name": "",
				"applylineNo": 0
			}
		],
		"settlementApplyInfs": [
			{
				"lineNo": 0,
				"id": 0,
				"settlementApplyId": 0,
				"pubts": "",
				"dimension_terminal": 0,
				"dimension_terminal_Name": "",
				"dimension_customer": 0,
				"dimension_customer_Name": "",
				"dimension_customer_Code": "",
				"dimension_terminal_chain": 0,
				"dimension_terminal_chain_Name": "",
				"dimension_region": 0,
				"dimension_region_Name": "",
				"dimension_expense_item": 0,
				"dimension_expense_item_Name": "",
				"dimension_expense_itemType": 0,
				"dimension_expense_itemType_Name": "",
				"settlementType": "",
				"settle_customer": 0,
				"settle_customer_Name": "",
				"settle_customer_Code": "",
				"settle_vendor": 0,
				"settle_vendor_Name": "",
				"settle_vendor_Code": "",
				"settle_person": "",
				"settle_person_Name": "",
				"applyAmount": 0,
				"settledAmount": 0,
				"settleAmount": 0,
				"approveAmount": 0,
				"bankAccount": "",
				"bankType": "",
				"assumeOrg": "",
				"assumeOrg_Name": "",
				"asumeDept": "",
				"asumeDept_Name": "",
				"productClass": 0,
				"productClass_Name": "",
				"product": 0,
				"product_Name": "",
				"quality": 0,
				"unit": 0,
				"unit_Name": "",
				"unitInvest": 0,
				"assumeRate": 0,
				"assumeAmount": 0,
				"marketingActivity": "",
				"marketingActivity_Theme": "",
				"payMode": "",
				"actualSaleAmount": "",
				"actualExpenseRate": "",
				"consultSaleAmount": 0,
				"consultExpenseAmount": 0,
				"consultExpenseRate": 0,
				"standardExpenseRate": 0,
				"isRejected": false,
				"rejectReason": "",
				"sourceBillType": "",
				"expenseApply": 0,
				"expenseApply_Code": "",
				"expenseApplyInfo": 0,
				"expenseApplyInfo_lineNo": 0,
				"define": {
					"id": 0,
					"define1": ""
				},
				"unit_Precision": 0,
				"planExpenseInfo": "",
				"planExpenseInfo_lineNo": "",
				"freeDefine": {
					"define1": "",
					"id": 0
				},
				"promoteActivity_Name": "",
				"orderPromoteAmount": "",
				"activitySectionAmount": "",
				"settlementApplyInfoProperty": {
					"id": 0,
					"propertyValue1": ""
				},
				"marketingActivity_Code": "",
				"advanceSettledAmount": "",
				"advancePayedAmount": "",
				"product_ProductApplyRangeId": 0,
				"productLine": 0,
				"productLine_Name": "",
				"costCenter": 0,
				"costCenter_Name": "",
				"profitCenter": "",
				"profitCenter_Name": "",
				"dimension_expense_item_Code": "",
				"dimension_terminal_chain_Code": "",
				"dimension_region_Code": "",
				"dimension_expense_itemType_Code": "",
				"productClass_Code": "",
				"productLine_Code": "",
				"policyId_name": "",
				"policyId_code": "",
				"policyId": "",
				"rebatePolicyResult_lineId": "",
				"bankType_Name": "",
				"attachmentId": "",
				"freezeAmount": 0,
				"reasonForFeeFreeze": "",
				"activityInfo": "",
				"activityInfo_lineNo": "",
				"sourceBillCode": "",
				"sourceBill_lineNo": "",
				"settle_scattered": "",
				"bankInfo": "",
				"bankInfo_Name": "",
				"payAmount": 0,
				"unpayAmount": 0,
				"payResult": "",
				"syncStatus": "1",
				"SettleMethod": 0,
				"SettleMethod_Name": "",
				"bankInfo_linenumber": "",
				"businessPeriod": "1682127325984980998",
				"businessPeriod_Code": "2023-M01"
			}
		],
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

