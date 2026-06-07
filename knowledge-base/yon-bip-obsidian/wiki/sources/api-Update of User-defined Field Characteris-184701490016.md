---
title: "费用结算单单个保存"
apiId: "1847014900168130567"
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

# 费用结算单单个保存

>  请求方式	POST | Expense Settlement Document (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/settlement/apply/savesettle
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
data	object	否	是	费用结算单
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	单据id[修改时候填写] 示例：1525800918934093825
code	string	否	否	单据编码(单据设置手工编号时必输，自动编号时输入无效) 示例：FYJS202208090485
orgId	string	否	否	销售组织id(销售组织id和销售组织编码不能同时为空) 示例：1525800918934093825
orgId_Code	string	否	否	销售组织编码(销售组织id 和销售组织编码不能同时为空) 示例：001
transType	string	否	否	结算申请交易类型id(结算申请交易类型id和结算申请交易类型编码不能同时为空) 示例：1456673772357025800
transType_Code	string	否	否	结算申请交易类型编码(结算申请交易类型id和结算申请交易类型编码不能同时为空) 示例：202205172
accountingOrg	string	否	否	会计主体id(会计主体id和会计主体编码不能同时为空) 示例：1456660535264673792
accountingOrg_Code	string	否	否	会计主体编码(会计主体id和会计主体编码不能同时为空) 示例：001
currency	long	否	否	币种id(币种id和币种不能同时为空) 示例：1456647323958902811
currency_Code	string	否	否	币种编码(币种id和币种编码不能同时为空) 示例：CNY
defaultPayMode	BigDecimal	否	否	默认兑付方式(枚举,{1:"订单抵现",2:"数量货补",3:"金额货补",4:"销售折扣",5:"不兑付",6:"付现","7":"转应付","8":"票扣","9":"账扣"},长度1) 示例：4 默认值：4
applicant	long	否	否	申请人id(申请人id和申请人编码不能同时为空) 示例：1458151739310473221
applicant_Code	string	否	否	申请人编码(申请人id和申请人编码不能同时为空) 示例：00000002
position	long	否	否	岗位id 示例：1458193494997205001
position_Code	string	否	否	岗位编码 示例：00000001
applyAmountTotal	BigDecimal	否	否	申请金额合计(根据币种金额精度而定) 示例：100.000
settleAmountTotal	BigDecimal	否	否	结算金额合计(根据币种金额精度而定) 示例：50.000
actualSaleAmountTotal	BigDecimal	否	否	实际销售合计(根据币种金额精度而定) 示例：50.000
settledDate	string	否	是	单据日期 示例：2022-08-05
department	long	否	否	所属部门id(所属部门id和所属部门编码不能同时为空)
department_Code	string	否	否	所属部门编码(所属部门id和所属部门编码不能同时为空) 示例：01
region	long	否	否	所属区域id(所属区域id和所属区域不能同时为空) 示例：1458677194224041988
region_Code	string	否	否	所属区域编码(所属区域id和所属区域编码不能同时为空) 示例：01
defaultAssumeOrg	long	否	否	默认承担组织id(默认承担组织id和默认承担组织不能同时为空)
defaultAssumeOrg_Code	string	否	否	默认承担组织编码(默认承担组织id和默认承担组织编码不能同时为空)
defaultAssumeDept	long	否	否	默认承担部门id(默认承担部门id和默认承担部门不能同时为空)
defaultAssumeDept_Code	string	否	否	默认承担部门编码(默认承担部门id和默认承担部门编码不能同时为空)
marketingPlan	long	否	否	营销方案id(营销方案id和营销方案不能同时为空)
marketingPlan_Code	string	否	否	营销方案(营销方案id和营销方案不能同时为空)
marketingPlan_Theme	string	否	否	营销方案主题
description	string	否	否	正文
remark	string	否	否	备注
settlementApplyInfs	object	是	否	结算申请单详情集合
settlementSupplyInfs	object	是	否	费用结算单货补明细集合
_status	string	否	是	操作标识[Insert|Update|Delete] 示例：Insert
freeDefine	object	否	否	结算申请单自由自定义项（1-120）
define	object	否	否	结算申请单自定义项(1-60)
businessPeriod	string	否	否	费用期间id 示例：1682127325984980998
businessPeriod_Code	string	否	否	费用期间编码 示例：2024-01

## 3. 请求示例

Url: /yonbip/sd/settlement/apply/savesettle?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1525800918934093825,
		"code": "FYJS202208090485",
		"orgId": "1525800918934093825",
		"orgId_Code": "001",
		"transType": "1456673772357025800",
		"transType_Code": "202205172",
		"accountingOrg": "1456660535264673792",
		"accountingOrg_Code": "001",
		"currency": 1456647323958902811,
		"currency_Code": "CNY",
		"defaultPayMode": 4,
		"applicant": 1458151739310473221,
		"applicant_Code": "00000002",
		"position": 1458193494997205001,
		"position_Code": "00000001",
		"applyAmountTotal": 100,
		"settleAmountTotal": 50,
		"actualSaleAmountTotal": 50,
		"settledDate": "2022-08-05",
		"department": 0,
		"department_Code": "01",
		"region": 1458677194224041988,
		"region_Code": "01",
		"defaultAssumeOrg": 0,
		"defaultAssumeOrg_Code": "",
		"defaultAssumeDept": 0,
		"defaultAssumeDept_Code": "",
		"marketingPlan": 0,
		"marketingPlan_Code": "",
		"marketingPlan_Theme": "",
		"description": "",
		"remark": "",
		"settlementApplyInfs": [
			{
				"id": 15258009189340987123,
				"lineNo": 10,
				"dimension_terminal": 0,
				"dimension_terminal_Code": "0001",
				"dimension_customer": 0,
				"dimension_customer_Code": "001",
				"dimension_terminal_chain": 0,
				"dimension_terminal_chain_Code": "01",
				"dimension_region": 0,
				"dimension_region_Code": "01",
				"dimension_expense_item": 0,
				"dimension_expense_item_Code": "01",
				"dimension_expense_itemType": 0,
				"dimension_expense_itemType_Code": "001",
				"settlementType": 1,
				"settle_customer": 0,
				"settle_customer_Code": "001",
				"settle_vendor": 0,
				"settle_vendor_Code": "0001",
				"settle_person": 0,
				"settle_person_Code": "00000002",
				"settle_scattered": "张三",
				"bankType": 0,
				"bankType_Code": "",
				"bankAccount": "6225112332218888",
				"bankInfo": "",
				"bankInfo_Code": "",
				"settleAmount": 100,
				"approveAmount": 100,
				"freezeAmount": 10,
				"assumeOrg": 0,
				"assumeOrg_Code": "",
				"asumeDept": 0,
				"asumeDept_Code": "",
				"productClass": 0,
				"productClass_Code": "01",
				"product": 0,
				"product_Code": "",
				"quality": 66,
				"unit": 0,
				"unit_Code": "0101",
				"unitInvest": 120,
				"assumeRate": 0,
				"assumeAmount": 0,
				"marketingActivity": 0,
				"marketingActivity_Code": "",
				"payMode": 4,
				"productLine": 0,
				"productLine_Code": "",
				"planExpenseInfo": 0,
				"planExpenseInfo_lineNo": "",
				"marketingActivity_Theme": "",
				"activityInfo_lineNo": "",
				"activityInfo": 0,
				"sourceBillCode": "",
				"costCenter": 0,
				"costCenter_Code": "",
				"sourceBill_lineNo": "",
				"SettleMethod": 0,
				"SettleMethod_Code": "system_0001",
				"profitCenter": "",
				"profitCenter_Code": "",
				"policyId": 0,
				"policyId_code": "",
				"advanceSettledAmount": "",
				"advancePayedAmount": "",
				"_status": "Insert",
				"define": {
					"id": 0,
					"define1": "",
					"define2": ""
				},
				"freeDefine": {
					"id": 0,
					"define1": "",
					"define2": ""
				},
				"settlementApplyInfoProperty": {
					"id": "",
					"propertyValue1": "",
					"propertyValue2": ""
				},
				"businessPeriod": "1682127325984980998",
				"businessPeriod_Code": "2024-01",
				"taxRate": 0,
				"taxRate_Code": ""
			}
		],
		"settlementSupplyInfs": [
			{
				"id": 1525800918934093761,
				"applylineNo": 10,
				"productSKU": 0,
				"productSKU_Code": "",
				"product": 0,
				"product_Code": "000023",
				"productClass": 0,
				"productClass_Code": "001",
				"unit": 0,
				"unit_Code": "",
				"amount": 100,
				"unitPrice": 5,
				"quantity": 20,
				"marketingActivity": 0,
				"marketingActivity_Code": "",
				"_status": "Insert",
				"productLine": 1692573296337354756,
				"productLine_Code": "12321",
				"productBrand": 1687451547830583304,
				"productBrand_Code": "p001"
			}
		],
		"_status": "Insert",
		"freeDefine": {
			"id": 0,
			"define1": "",
			"define2": ""
		},
		"define": {
			"id": 0,
			"define1": "",
			"define2": ""
		},
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
code	string	否	状态码
message	string	否	消息提示
data	object	否	业务数据
id	long	否	结算单主键id
code	string	否	结算单号 示例：FYJS202208090485
orgId	string	否	销售组织id
orgId_Name	string	否	销售组织 示例：营销费用
orgId_Code	string	否	销售组织编码 示例：001
transType	string	否	结算申请交易类型id
transType_Name	string	否	结算申请交易类型
transType_Code	string	否	结算申请交易类型编码 示例：202205172
accountingOrg	string	否	会计主体id
accountingOrg_Name	string	否	会计主体 示例：营销费用
accountingOrg_Code	string	否	会计主体编码 示例：001
currency	string	否	币种id
currency_Name	string	否	币种 示例：人民币
currency_Code	string	否	币种编码 示例：CNY
applyAmountTotal	BigDecimal	否	申请金额合计
settleAmountTotal	BigDecimal	否	结算金额合计
actualSaleAmountTotal	BigDecimal	否	实际销售合计
actualExpenseRate	string	否	实际费率
defaultPayMode	BigDecimal	否	默认兑付方式(枚举,{1:"订单抵现",2:"数量货补",3:"金额货补",4:"销售折扣",5:"不兑付",6:"付现","7":"转应付","8":"票扣"},长度1) 示例：4
applicant	string	否	申请人id
applicant_Name	string	否	申请人 示例：小号
applicant_Code	string	否	申请人编码 示例：00000002
settledDate	string	否	结算日期 示例：2022-08-31
department	string	否	所属部门id
department_Name	string	否	所属部门 示例：测试部
department_Code	string	否	所属部门编码 示例：01
region	long	否	所属区域id
region_Name	string	否	所属区域 示例：华北区
region_Code	string	否	所属区域编码 示例：0101
defaultAssumeOrg	string	否	默认承担组织id
defaultAssumeOrg_Name	string	否	默认承担组织
defaultAssumeDept	long	否	默认承担部门id
defaultAssumeDept_Name	string	否	默认承担部门
creator	string	否	制单人
createDate	string	否	制单日期
modifier	string	否	最近修改人
modifyTime	string	否	最近修改时间
status	BigDecimal	否	单据状态(枚举,{“0”:"开立",”1”:"已审核",”2”:"审核中",”3”:"审核中",”4”:"锁定"}) 示例：1
verifystate	long	否	审批状态(枚举,{"0":"初始开立","1":"审批中","2":"审批完成","3":"不通过流程终止","4":"驳回到制单"}) 示例：1
auditor	string	否	审批人
auditTime	string	否	审批时间
remark	string	否	备注
isWfControlled	boolean	否	是否审批流控制(示例 : {true,false}) 示例：true
returncount	BigDecimal	否	退回次数
shop	long	否	商家id
shop_Name	string	否	商家
assumeeAmountTotal	BigDecimal	否	承担金额合计
define	object	否	结算申请单自定义项(1-60)
currency_moneyDigit	BigDecimal	否	币种金额精度
marketingPlan	long	否	营销方案id
marketingPlan_Theme	string	否	营销方案主题
marketingPlan_Code	string	否	营销方案
freeDefine	object	否	结算申请单自由自定义项(1-120)
vouchdate	string	否	单据日期
mainAttachment	string	否	整单附件
position	string	否	职位id
position_Name	string	否	岗位 示例：销售主管
freezeAmountTotal	BigDecimal	否	冻结金额合计
description	string	否	正文
settlementSupplyInfs	object	是	费用结算单货补明细集合
settlementApplyInfs	object	是	结算申请单详情集合
businessPeriod	string	否	费用期间id 示例：1682127325984980998
businessPeriod_Code	string	否	费用期间编码 示例：2024-01

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": 0,
		"code": "FYJS202208090485",
		"orgId": "",
		"orgId_Name": "营销费用",
		"orgId_Code": "001",
		"transType": "",
		"transType_Name": "",
		"transType_Code": "202205172",
		"accountingOrg": "",
		"accountingOrg_Name": "营销费用",
		"accountingOrg_Code": "001",
		"currency": "",
		"currency_Name": "人民币",
		"currency_Code": "CNY",
		"applyAmountTotal": 0,
		"settleAmountTotal": 0,
		"actualSaleAmountTotal": 0,
		"actualExpenseRate": "",
		"defaultPayMode": 4,
		"applicant": "",
		"applicant_Name": "小号",
		"applicant_Code": "00000002",
		"settledDate": "2022-08-31",
		"department": "",
		"department_Name": "测试部",
		"department_Code": "01",
		"region": 0,
		"region_Name": "华北区",
		"region_Code": "0101",
		"defaultAssumeOrg": "",
		"defaultAssumeOrg_Name": "",
		"defaultAssumeDept": 0,
		"defaultAssumeDept_Name": "",
		"creator": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"status": 1,
		"verifystate": 1,
		"auditor": "",
		"auditTime": "",
		"remark": "",
		"isWfControlled": true,
		"returncount": 0,
		"shop": 0,
		"shop_Name": "",
		"assumeeAmountTotal": 0,
		"define": {
			"id": 0,
			"define1": ""
		},
		"currency_moneyDigit": 0,
		"marketingPlan": 0,
		"marketingPlan_Theme": "",
		"marketingPlan_Code": "",
		"freeDefine": {
			"id": 0,
			"define1": ""
		},
		"vouchdate": "",
		"mainAttachment": "",
		"position": "",
		"position_Name": "销售主管",
		"freezeAmountTotal": 0,
		"description": "",
		"settlementSupplyInfs": [
			{
				"settlementApplyId": 0,
				"applylineNo": 10,
				"id": 0,
				"productSKU": 0,
				"productSKU_Code": "000001",
				"productSKU_Name": "营销费用1",
				"product": 0,
				"product_Code": "000001",
				"product_Name": "营销费用",
				"productClass": 0,
				"productClass_Name": "营销费用",
				"unit": 0,
				"unit_Name": "",
				"amount": 12,
				"quantity": 12,
				"unit_Precision": 2,
				"marketingActivity": 0,
				"marketingActivity_Code": "",
				"product_ProductApplyRangeId": "",
				"unitPrice": 0,
				"productLine": 1692573296337354756,
				"productLine_Code": "12321",
				"productBrand": 1687451547830583304,
				"productBrand_Code": "p001"
			}
		],
		"settlementApplyInfs": [
			{
				"lineNo": 10,
				"id": 0,
				"settlementApplyId": 0,
				"dimension_terminal": 0,
				"dimension_terminal_Name": "费用网点",
				"dimension_customer": 0,
				"dimension_customer_Name": "费用客户",
				"dimension_customer_Code": "001",
				"dimension_terminal_chain": 0,
				"dimension_terminal_chain_Name": "宜家",
				"dimension_region": 0,
				"dimension_region_Name": "中国",
				"dimension_expense_item": 0,
				"dimension_expense_item_Name": "01",
				"dimension_expense_itemType": 0,
				"dimension_expense_itemType_Name": "活动费用",
				"settlementType": 1,
				"settle_customer": 0,
				"settle_customer_Name": "费用客户",
				"settle_customer_Code": "001",
				"settle_vendor": 0,
				"settle_vendor_Name": "费用1",
				"settle_vendor_Code": "0001000001",
				"settle_person": "",
				"settle_person_Name": "小号",
				"applyAmount": 80,
				"settledAmount": 80,
				"settleAmount": 100,
				"approveAmount": 90,
				"bankAccount": "",
				"bankType": "上海银行",
				"assumeOrg": 0,
				"assumeOrg_Name": "",
				"asumeDept": 0,
				"asumeDept_Name": "",
				"productClass": 0,
				"productClass_Name": "营销费用",
				"product": 0,
				"product_Name": "营销费用",
				"quality": 12,
				"unit": 0,
				"unit_Name": "个",
				"unitInvest": 0,
				"assumeRate": 0,
				"assumeAmount": 0,
				"marketingActivity": 0,
				"marketingActivity_Theme": "",
				"payMode": 4,
				"actualSaleAmount": "",
				"actualExpenseRate": "",
				"consultSaleAmount": "",
				"consultExpenseAmount": "",
				"consultExpenseRate": "",
				"standardExpenseRate": "",
				"isRejected": true,
				"rejectReason": "",
				"sourceBillType": 0,
				"expenseApply": 0,
				"expenseApply_Code": "",
				"expenseApplyInfo": 0,
				"expenseApplyInfo_lineNo": "",
				"define": {
					"id": 0,
					"define1": ""
				},
				"unit_Precision": 0,
				"planExpenseInfo": "",
				"planExpenseInfo_lineNo": "",
				"freeDefine": {
					"id": 0,
					"define1": ""
				},
				"promoteActivity_Name": "",
				"orderPromoteAmount": "",
				"activitySectionAmount": 0,
				"settlementApplyInfoProperty": {
					"id": 0,
					"propertyValue1": ""
				},
				"marketingActivity_Code": "",
				"advanceSettledAmount": "",
				"advancePayedAmount": "",
				"product_ProductApplyRangeId": "",
				"productLine": 0,
				"productLine_Name": "产品线1",
				"costCenter": 0,
				"costCenter_Name": "",
				"profitCenter": "",
				"profitCenter_Name": "",
				"dimension_expense_item_Code": "",
				"dimension_terminal_chain_Code": "",
				"dimension_region_Code": "01",
				"dimension_expense_itemType_Code": "",
				"productClass_Code": "01",
				"productLine_Code": "01",
				"policyId_name": "",
				"policyId_code": "",
				"policyId": 0,
				"rebatePolicyResult_lineId": "",
				"attachmentId": "",
				"freezeAmount": 0,
				"reasonForFeeFreeze": "",
				"activityInfo": 0,
				"activityInfo_lineNo": "",
				"sourceBillCode": "",
				"sourceBill_lineNo": "",
				"settle_scattered": "",
				"bankInfo": "",
				"bankType_Name": "上海银行",
				"bankInfo_Name": "北京银行北京大学支行",
				"payAmount": 0,
				"unpayAmount": 0,
				"payResult": "",
				"syncStatus": "",
				"SettleMethod": 0,
				"SettleMethod_Name": "银行转账",
				"bankInfo_linenumber": "1223",
				"businessPeriod": "1682127325984980998",
				"businessPeriod_Code": "2024-01"
			}
		],
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

