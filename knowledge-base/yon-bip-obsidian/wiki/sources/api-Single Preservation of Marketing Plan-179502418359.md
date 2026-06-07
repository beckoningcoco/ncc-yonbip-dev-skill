---
title: "营销方案单个保存"
apiId: "1795024183595368455"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Marketing Scheme"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Marketing Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 营销方案单个保存

>  请求方式	POST | Marketing Scheme (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/marketingplansave
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
data	object	否	是	请求数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
org	string	否	是	销售组织ID，支持传入id或者code其中一项 示例：1526215443395641348
bustype	string	否	是	交易类型ID，支持传入id或者code其中一项 示例：1624201866677583877
id	long	否	否	id，新增时不传，更新时传入需要更新的数据id 示例：1794999934217355273
code	string	否	是	方案编号，当勾选自动编码且勾选手动可改时以填入值为准，未勾选手动可改时填入值不生效 示例：20230816800054
parentId	string	否	否	父级方案id 示例：1795757085419372544
marketingTheme	string	否	是	方案主题 示例：测试方案
beginDate	string	否	是	开始日期 示例：2023-08-16
endDate	string	否	是	结束日期，必须大于开始日期 示例：2023-08-31
materialApplyDate	string	否	否	物料申领截止日期 示例：2023-08-31
closingDate	string	否	否	结算截止日 示例：2023-08-20
peopleNum	long	否	否	预计人数 示例：10
totalFee	BigDecimal	否	是	预计费用，数值为费用子表预计费用合计 示例：40
commitmentAmount	BigDecimal	否	否	承担金额，数值为费用子表承担金额合计 示例：40
expectPlace	long	否	否	预计场次 示例：12
supplyCustomer	string	否	否	客户ID，支持传入id或者code其中一项 示例：1530045128316026889
amount	BigDecimal	否	否	余额，数值为费用子表余额合计 示例：40
isApply	long	否	否	活动是否需申请：1为是，0为否 示例：1
openingScheme	long	否	是	期初方案 0：否(表头开始日期不能小于当前日期) 1：是(表头开始日期可在当前日期之前) 示例：0
dueDate	string	否	否	申请截止日 示例：2023-08-31
currency	string	否	否	币种ID，支持传入id或者code其中一项 示例：1525825597803593753
isUnifiedPromotion	long	否	否	是否统一促销 1 是 0 否 示例：1
ower	string	否	是	负责人ID，支持传入id或者code其中一项 示例：1526217281646362627
dept	string	否	否	部门ID，支持传入id或者code其中一项 示例：1526215924430929924
saleArea	string	否	否	销售区域ID，支持传入id或者code其中一项 示例：1529939841485635587
cashMethod	long	否	否	默认兑付方式 1：订单抵现，2：数量货补，3：金额货补，4：订单折扣，5：不兑付 示例：4
autoClosingRule	long	否	否	自动关闭规则 1 是 0 否 示例：1
returncount	long	否	否	退回次数 示例：0
estimateSaleSum	BigDecimal	否	否	预计销售额，数值为费用子表预计销售额合计 示例：0
estimateCostList	object	是	是	费用子表数据
_status	string	否	是	单据状态，新增时Insert，更新时Update 示例：Insert
systemSource	string	否	是	openapi标识，必须传 marketingPlanOpenApIAdd 示例：marketingPlanOpenApIAdd

## 3. 请求示例

Url: /yonbip/crm/bill/marketingplansave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"org": "1526215443395641348",
		"bustype": "1624201866677583877",
		"id": 1794999934217355273,
		"code": "20230816800054",
		"parentId": "1795757085419372544",
		"marketingTheme": "测试方案",
		"beginDate": "2023-08-16",
		"endDate": "2023-08-31",
		"materialApplyDate": "2023-08-31",
		"closingDate": "2023-08-20",
		"peopleNum": 10,
		"totalFee": 40,
		"commitmentAmount": 40,
		"expectPlace": 12,
		"supplyCustomer": "1530045128316026889",
		"amount": 40,
		"isApply": 1,
		"openingScheme": 0,
		"dueDate": "2023-08-31",
		"currency": "1525825597803593753",
		"isUnifiedPromotion": 1,
		"ower": "1526217281646362627",
		"dept": "1526215924430929924",
		"saleArea": "1529939841485635587",
		"cashMethod": 4,
		"autoClosingRule": 1,
		"returncount": 0,
		"estimateSaleSum": 0,
		"estimateCostList": [
			{
				"cost": 40,
				"commitmentRatio": 100,
				"cashMethod": "4",
				"customerType": "1",
				"allowSuperApplication": "1",
				"lineNo": 10,
				"orgCost": "1526215443395641348",
				"deptCost": "1526215924430929924",
				"saleArea": "1529939841485635587",
				"nextOccupyAmount": 0,
				"amount": 40,
				"commitmentAmount": 40,
				"expenseItem": "1530134644008681476",
				"expenseItemType": "2353778477863168",
				"chainSystem": "1556755512754700289",
				"goods": "1529928889319030792",
				"productClass": "1529928107634982920",
				"measurement": "1529928769059946504",
				"unitInput": 4,
				"count": 10,
				"rate": 4,
				"_status": "Insert",
				"id": 1794999934217355274
			}
		],
		"_status": "Insert",
		"systemSource": "marketingPlanOpenApIAdd"
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
code	string	否	返回编码(200:成功，其他：失败) 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
id	string	否	方案id 示例：1794999934217355273
org	string	否	销售组织id 示例：1526215443395641348
bustype	string	否	交易类型id 示例：1624201866677583877
marketingTheme	string	否	方案主题 示例：测试方案
beginDate	string	否	开始日期 示例：2023-08-17 00:00:00
endDate	string	否	结束日期 示例：2023-08-31 00:00:00
materialApplyDate	string	否	物料申领截止日期 示例：2023-08-31 00:00:00
peopleNum	long	否	预计人数 示例：10
totalFee	BigDecimal	否	预计费用 示例：40
commitmentAmount	BigDecimal	否	承担金额 示例：40
nextOccupyAmount	BigDecimal	否	下级占用金额 示例：0
nextSettleAmount	BigDecimal	否	下级结算金额 示例：0
supplyCustomer	string	否	供货客户id 示例：1530045128316026889
SettleAmount	BigDecimal	否	本级结算金额 示例：0
amount	BigDecimal	否	余额 示例：40
expectPlace	long	否	预计场次 示例：10
realityPlace	long	否	实际场次 示例：0
openingScheme	long	否	是否期初方案 示例：0
isApply	long	否	活动需申请 0：否，1：是 示例：1
dueDate	string	否	申请截止日 示例：2023-08-31 00:00:00
closingDate	string	否	结算截止日 示例：2023-08-17 00:00:00
currency	string	否	币种id 示例：1525825597803593753
isUnifiedPromotion	long	否	是否统一促销 1 是 0 否 示例：1
ower	string	否	负责人id 示例：1526217281646362627
dept	string	否	部门id 示例：1526215924430929924
saleArea	string	否	销售区域id 示例：1529939841485635587
cashMethod	long	否	默认兑付方式 1：订单抵现，2：数量货补，3：金额货补，4：订单折扣，5：不兑付 示例：4
verifystate	long	否	审批状态 0：开立，1:审批中，2：审批通过，3：审批不通过，4：驳回 示例：0
settleState	long	否	关闭状态 0：未关闭，1：已关闭 示例：0
issuedStatus	long	否	下发状态 0 未下发，1 已下发 示例：0
autoClosingRule	long	否	自动关闭规则 1 是 0 否 示例：1
creatorId	string	否	创建人id 示例：1526218690405597188
isWfControlled	boolean	否	是否审批流控制 true：是，false：否 示例：false
returncount	long	否	退回次数 示例：0
estimateSaleSum	BigDecimal	否	预计销售额 示例：0
code	string	否	方案编码 示例：20230816800054
estimateCostList	object	是	费用子表数据
parentId	string	否	父级方案id 示例：1795757085419372544

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1794999934217355273",
		"org": "1526215443395641348",
		"bustype": "1624201866677583877",
		"marketingTheme": "测试方案",
		"beginDate": "2023-08-17 00:00:00",
		"endDate": "2023-08-31 00:00:00",
		"materialApplyDate": "2023-08-31 00:00:00",
		"peopleNum": 10,
		"totalFee": 40,
		"commitmentAmount": 40,
		"nextOccupyAmount": 0,
		"nextSettleAmount": 0,
		"supplyCustomer": "1530045128316026889",
		"SettleAmount": 0,
		"amount": 40,
		"expectPlace": 10,
		"realityPlace": 0,
		"openingScheme": 0,
		"isApply": 1,
		"dueDate": "2023-08-31 00:00:00",
		"closingDate": "2023-08-17 00:00:00",
		"currency": "1525825597803593753",
		"isUnifiedPromotion": 1,
		"ower": "1526217281646362627",
		"dept": "1526215924430929924",
		"saleArea": "1529939841485635587",
		"cashMethod": 4,
		"verifystate": 0,
		"settleState": 0,
		"issuedStatus": 0,
		"autoClosingRule": 1,
		"creatorId": "1526218690405597188",
		"isWfControlled": false,
		"returncount": 0,
		"estimateSaleSum": 0,
		"code": "20230816800054",
		"estimateCostList": [
			{
				"expenseItem": "1530134644008681476",
				"unitInput": 4,
				"goods": "1529928889319030792",
				"measurement": "1529928769059946504",
				"customerType": 1,
				"lineNo": 10,
				"rate": 4,
				"cashMethod": 4,
				"id": "1794999934217355274",
				"deptCost": "1526215924430929924",
				"amount": 40,
				"cost": 40,
				"productClass": "1529928107634982920",
				"marketPlanId": "1794999934217355273",
				"commitmentRatio": 100,
				"count": 10,
				"saleArea": "1529939841485635587",
				"chainSystem": "1556755512754700289",
				"orgCost": "1526215443395641348",
				"commitmentAmount": 40,
				"allowSuperApplication": "1"
			}
		],
		"parentId": "1795757085419372544"
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
999	方案费用：费用项和费用类型不能同时为空	

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

