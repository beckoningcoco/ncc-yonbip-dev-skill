---
title: "索赔扣款单保存"
apiId: "1581232746101473282"
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

# 索赔扣款单保存

>  请求方式	POST | Claim Deduction (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/synergy/claimSave
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
data	object	否	是	业务数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	索赔扣款id（保存成功后返回该值，（更新时必输，根据bip单据id查询是否存在，如果存在执行先删后增））
code	string	否	否	单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输（最大长度50） 示例：RD202304250002
erpId	string	否	是	外部系统单据的id 示例：3015955627938048
claimTitle	string	否	否	索赔扣款标题（最大长度200） 示例：测试openApi
billDate	Date	否	是	单据日期 示例：2022-11-01 00:00:00
createType	string	否	是	创建方式（2：ERP上传） 示例：2 默认值：2
purchaseName	string	否	是	采购商名称（当前租户名称） 示例：0427日常mdd融合
billingOrg	string	否	否	收票组织id（收票组织id和收票组织编码任一必填） 示例：1476530789273829376
billingOrgCode	string	否	否	收票组织编码（收票组织id和收票组织编码任一必填） 示例：org01
purchaseOrg	string	否	否	采购组织id（采购组织id和采购组织编码任一必填） 示例：1450503124116570113
purchaseOrgCode	string	否	否	采购组织编码（采购组织id和采购组织编码任一必填） 示例：org01
purchaser	string	否	否	采购员id 示例：1450509618123374592
purchaserCode	string	否	否	采购员编码 示例：00000012
supplier	long	否	否	供应商id（供应商id和供应商编码任一必填） 示例：1572532817287970822
supplierCode	string	否	否	供应商编码（供应商id和供应商编码任一必填） 示例：0000000099
supplierContact	long	否	否	供方联系人id 示例：1580689355343134727
remark	string	否	否	备注（最大长度200） 示例：1111
claimDescription	string	否	是	索赔扣款说明（最大长度255） 示例：111111111111111
feedbackTime	DateTime	否	是	要求反馈时间 示例：2022-11-01 13:07:04
currencyIdDiwork	string	否	否	币种id（币种id和币种编码任一必填） 示例：1441759678822875165
currencyCode	string	否	否	币种编码（币种id和币种编码任一必填） 示例：CNY 默认值：CNY
processMode	long	否	是	处理方式（1：货补； 2：发票抵扣； 3：扣款传应付； 4：现金；5:对账传应付） 示例：3
expenseItem	string	否	否	费用项目：录入费用项目id 示例：1451464415082708997
expenseItemCode	string	否	否	费用项目：录入费用项目code 示例：code1
expenseMaterial	string	否	否	费用物料，必须是描述性物料，当处理方式=发票抵扣时，费用物料必输。录入费用项目id 示例：1451464415082708997
expenseMaterialCode	string	否	否	费用物料，必须是描述性物料，当处理方式=发票抵扣时，费用物料必输。录入费用项目code 示例：code2
tradeType	string	否	否	交易类型id 示例：2335141713170688
tradeTypeCode	string	否	否	交易类型编码 示例：code3
dept	string	否	否	采购部门：录入部门id 示例：1451464415082708997
deptCode	string	否	否	采购部门编码 示例：code4
claimStatus	string	否	否	状态 示例：1或4（1：开立，4：已审批）
bizFlow	string	否	否	流程id 示例：4f514472-a0cd-441f-8c61-66d9c05d5c05
claimFile	string	否	否	索赔扣款附件 示例：3015955627938048
define	object	否	否	主表自定义项
detailsList	object	是	是	明细子表
_status	string	否	是	该条数据状态（新增：Insert，修改：Update，修改逻辑为先删后增请注意传参） 示例：Insert

## 3. 请求示例

Url: /yonbip/cpu/synergy/claimSave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 0,
		"code": "RD202304250002",
		"erpId": "3015955627938048",
		"claimTitle": "测试openApi",
		"billDate": "2022-11-01 00:00:00",
		"createType": "2",
		"purchaseName": "0427日常mdd融合",
		"billingOrg": "1476530789273829376",
		"billingOrgCode": "org01",
		"purchaseOrg": "1450503124116570113",
		"purchaseOrgCode": "org01",
		"purchaser": "1450509618123374592",
		"purchaserCode": "00000012",
		"supplier": 1572532817287970822,
		"supplierCode": "0000000099",
		"supplierContact": 1580689355343134727,
		"remark": "1111",
		"claimDescription": "111111111111111",
		"feedbackTime": "2022-11-01 13:07:04",
		"currencyIdDiwork": "1441759678822875165",
		"currencyCode": "CNY",
		"processMode": 3,
		"expenseItem": "1451464415082708997",
		"expenseItemCode": "code1",
		"expenseMaterial": "1451464415082708997",
		"expenseMaterialCode": "code2",
		"tradeType": "2335141713170688",
		"tradeTypeCode": "code3",
		"dept": "1451464415082708997",
		"deptCode": "code4",
		"claimStatus": "1或4（1：开立，4：已审批）",
		"bizFlow": "4f514472-a0cd-441f-8c61-66d9c05d5c05",
		"claimFile": "3015955627938048",
		"define": {
			"id": 2335141713170688,
			"define1": "改改改",
			"define2": "哈哈哈哈"
		},
		"detailsList": [
			{
				"claimProject": 1567035431056310275,
				"claimProjectCode": "00002",
				"amount": 2,
				"claimReason": "11",
				"claimAmount": 3,
				"materialId": "1450548659372425219",
				"materialId_code": "000008",
				"manuDate": "2022-12-09 00:00:00",
				"manuFactor": "11",
				"arrivalDate": "2022-11-30 00:00:00",
				"productionBatch": "222",
				"unit": "1450537827464904710",
				"unitCode": "KGM",
				"define": {
					"id": 2335141713170688,
					"define1": "11111",
					"define2": "2222"
				},
				"_status": "Insert"
			}
		],
		"_status": "Insert"
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
code	string	否	状态码 示例：200
message	string	否	返回消息 示例：操作成功
data	object	否	业务信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
id	long	否	索赔扣款单id（更新删除单据时需要录入的id） 示例：3029037432836352
code	string	否	单据编码 示例：RD202211010002
claimTitle	string	否	标题 示例：测试审核1026
billDate	Date	否	单据日期 示例：2022-10-25 00:00:00
billingOrg	string	否	收票组织id 示例：1476530789273829376
purchaseOrg	string	否	采购组织id 示例：1450503124116570113
purchaser	string	否	采购员id 示例：1450510030440235016
supplier	long	否	供应商id 示例：2766825815085312
supplierContact	long	否	供方联系人id 示例：2766825815085318
claimStatus	string	否	状态（1:开立,2:审批中,3:审批驳回,4:已审批） 示例：1
claimDescription	string	否	索赔扣款说明 示例：asdad
feedbackTime	DateTime	否	要求反馈时间 示例：2022-10-21 14:31:34
currencyIdDiwork	string	否	币种id 示例：1441759678822875165
processMode	long	否	处理方式（1：货补； 2：发票抵扣； 3：扣款传应付； 4：现金；5:对账传应付） 示例：2
isWfControlled	boolean	否	是否启用审批流 示例：false
detailsList	object	是	明细子表
pubts	string	否	时间戳 示例：2022-11-01 13:04:32

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 3029037432836352,
		"code": "RD202211010002",
		"claimTitle": "测试审核1026",
		"billDate": "2022-10-25 00:00:00",
		"billingOrg": "1476530789273829376",
		"purchaseOrg": "1450503124116570113",
		"purchaser": "1450510030440235016",
		"supplier": 2766825815085312,
		"supplierContact": 2766825815085318,
		"claimStatus": "1",
		"claimDescription": "asdad",
		"feedbackTime": "2022-10-21 14:31:34",
		"currencyIdDiwork": "1441759678822875165",
		"processMode": 2,
		"isWfControlled": false,
		"detailsList": [
			{
				"claimProject": 1567035431056310275,
				"claimAmount": 2,
				"id": 3015951514013952,
				"claimdeductionId": 3015951513997568
			}
		],
		"pubts": "2022-11-01 13:04:32"
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
999	采购组织id和code不能同时为空	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-08	
新增
请求参数 claimFile
增加claimFile字段

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

