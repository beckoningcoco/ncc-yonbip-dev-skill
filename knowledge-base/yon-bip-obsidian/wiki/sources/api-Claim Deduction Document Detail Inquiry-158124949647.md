---
title: "索赔扣款单详情查询"
apiId: "1581249496473927684"
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

# 索赔扣款单详情查询

>  请求方式	POST | Claim Deduction (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/synergy/claimDetail
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
id	long	否	否	索赔扣款单id 示例：2958514546348288
code	string	否	否	索赔扣款单编码 示例：RD202211050017

## 3. 请求示例

Url: /yonbip/cpu/synergy/claimDetail?access_token=访问令牌
Body: {
	"id": 2958514546348288,
	"code": "RD202211050017"
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
returncount	long	否	退回次数 示例：0
verifystate	long	否	审核状态(枚举,{"0":"初始开立","1":"审批中","2":"审批完成","3":"不通过流程终止","4":"驳回到制单"} 示例：0
code	string	否	单据编码 示例：RD202211010003
masterOrgKeyField	string	否	主组织键 示例：purchaseOrg
canWithDraw	long	否	是否可以处理请求（0：否，1：是）） 示例：0
creatorId	long	否	创建人id 示例：1450510786353430535
originList	object	是	来源信息
remark	string	否	备注 示例：1111
supplierContact_contactmobile	string	否	供方联系电话 示例：13145678901
billingOrg	string	否	收票组织id 示例：1476530789273829376
feedbackTime	DateTime	否	要求反馈时间 示例：2022-11-01 13:07:04
detailsList	object	是	索赔扣款明细信息
supplier	long	否	供应商id 示例：1572532817287970822
currencyIdDiwork	string	否	币种id 示例：1441759678822875165
purchaser_name	string	否	采购员名称 示例：总部采购
currencyIdDiwork_name	string	否	币种名称 示例：人民币
id	long	否	索赔扣款单主键 示例：3015955627938048
purchaser_user_id	string	否	采购员user_id 示例：da7822b1-5c3d-40db-bc47-bee5ba6ae822
pubts	string	否	时间戳 示例：2022-11-01 13:09:25
confirmFile	string	否	供应商确认附件id 示例：f84e2bc0-59a2-11ed-bc2a-399e9bd638dc
supplier_name	string	否	供应商名称 示例：多数据中心[一般供应商]
purchaseOrg	string	否	采购组织id 示例：1450503124116570113
appealFile	string	否	申诉附件id 示例：f8450400-59a2-11ed-bc2a-399e9bd638dc
tradeType	string	否	交易类型id 示例：1566609250051424260
creator	string	否	创建人名称 示例：昵称-yc_18989999102
claimDescription	string	否	索赔扣款说明 示例：111111111111111
isWfControlled	boolean	否	是否启用审批流（true:启用审批流；false:未启用审批流） 示例：true
purchaser	string	否	采购员id 示例：1450509618123374592
executiveFile	string	否	执行附件id 示例：f81e9040-59a2-11ed-bc2a-399e9bd638dc
relationList	object	是	关联信息
billingOrg_name	string	否	收票组织名称 示例：测试公司
billDate	string	否	单据日期 示例：2022-11-01 00:00:00
supplier_relationTenantId	string	否	供应商租户id 示例：0000L9FJJYWXGER1UG0000
purchaseOrg_name	string	否	采购组织名称 示例：天海总公司（mdd融合）
claimTitle	string	否	索赔扣款标题 示例：测试openApi
transTypeKeyField	string	否	交易类型键 示例：tradeType
createTime	string	否	创建时间 示例：2022-11-01 13:08:43
tradeType_name	string	否	交易类型名称 示例：普通索赔
claimTotalAmount	BigDecimal	否	索赔扣款总额 示例：3
supplierContact_contactname	string	否	供方联系人名称 示例：张三
processMode	string	否	处理方式（1：货补； 2：发票抵扣； 3：扣款传应付； 4：现金；5:对账传应付） 示例：3
purchaseName	string	否	采购商名称 示例：0427日常mdd融合
supplierContact	string	否	供方联系人id 示例：1580689355343134727
currencyCode	string	否	币种code 示例：CNY
synergyStatus	string	否	协同状态（1:待发布,11:待供应商确认,3:已申诉,12:申诉驳回,5:已确认,6:已执行,7:已取消,8:申诉处理中） 示例：3
claimStatus	string	否	状态（1:开立,2:审批中,3:审批驳回,4:已审批） 示例：1
expenseItem	string	否	费用项目id 示例：1451464415082708997
expenseItem_name	string	否	费用项目名称 示例：名称1
expenseMaterial	string	否	费用物料id 示例：1451464415082708997
expenseMaterial_name	string	否	费用物料名称 示例：名称2
dept	string	否	采购部门id 示例：1451464415082708997
dept_name	string	否	采购部门名称 示例：名称2

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"returncount": 0,
		"verifystate": 0,
		"code": "RD202211010003",
		"masterOrgKeyField": "purchaseOrg",
		"canWithDraw": 0,
		"creatorId": 1450510786353430535,
		"originList": [
			{
				"amount": 4444,
				"materialID_code": "协同",
				"materialID_name": "000144",
				"sourceBillNo": "WTZGPRCA20221031000003",
				"sourceBillDate": "2022-10-31 11:14:30",
				"id": 3015955627938050,
				"materialID": 1540339357459152905,
				"claimDeductionId": 3015955627938048,
				"sourceBillType": "1"
			}
		],
		"remark": "1111",
		"supplierContact_contactmobile": "13145678901",
		"billingOrg": "1476530789273829376",
		"feedbackTime": "2022-11-01 13:07:04",
		"detailsList": [
			{
				"materialId_name": "螺纹钢（浮动换算率）",
				"claimProject": "1567035431056310275",
				"amount": 2,
				"claimProject_name": "通电",
				"claimReason": "11",
				"claimAmount": 3,
				"materialId_code": "000008",
				"manuDate": "2022-12-09 00:00:00",
				"claimdeductionId": 3015955627938048,
				"purchaseUnitCode": "KGM",
				"materialId": 1450548659372425219,
				"manuFactor": "11",
				"arrivalDate": "2022-11-30 00:00:00",
				"unit_name": "千克",
				"unit": 1450537827464904710,
				"productionBatch": "222",
				"purchaseDigit": 3,
				"id": 3015955627938049
			}
		],
		"supplier": 1572532817287970822,
		"currencyIdDiwork": "1441759678822875165",
		"purchaser_name": "总部采购",
		"currencyIdDiwork_name": "人民币",
		"id": 3015955627938048,
		"purchaser_user_id": "da7822b1-5c3d-40db-bc47-bee5ba6ae822",
		"pubts": "2022-11-01 13:09:25",
		"confirmFile": "f84e2bc0-59a2-11ed-bc2a-399e9bd638dc",
		"supplier_name": "多数据中心[一般供应商]",
		"purchaseOrg": "1450503124116570113",
		"appealFile": "f8450400-59a2-11ed-bc2a-399e9bd638dc",
		"tradeType": "1566609250051424260",
		"creator": "昵称-yc_18989999102",
		"claimDescription": "111111111111111",
		"isWfControlled": true,
		"purchaser": "1450509618123374592",
		"executiveFile": "f81e9040-59a2-11ed-bc2a-399e9bd638dc",
		"relationList": [
			{
				"relationType": "2",
				"relationNo": "222222",
				"id": 3015956321620224,
				"title": "2222",
				"claimDeductionId": 3015955627938048
			}
		],
		"billingOrg_name": "测试公司",
		"billDate": "2022-11-01 00:00:00",
		"supplier_relationTenantId": "0000L9FJJYWXGER1UG0000",
		"purchaseOrg_name": "天海总公司（mdd融合）",
		"claimTitle": "测试openApi",
		"transTypeKeyField": "tradeType",
		"createTime": "2022-11-01 13:08:43",
		"tradeType_name": "普通索赔",
		"claimTotalAmount": 3,
		"supplierContact_contactname": "张三",
		"processMode": "3",
		"purchaseName": "0427日常mdd融合",
		"supplierContact": "1580689355343134727",
		"currencyCode": "CNY",
		"synergyStatus": "3",
		"claimStatus": "1",
		"expenseItem": "1451464415082708997",
		"expenseItem_name": "名称1",
		"expenseMaterial": "1451464415082708997",
		"expenseMaterial_name": "名称2",
		"dept": "1451464415082708997",
		"dept_name": "名称2"
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
999	查询失败	

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

