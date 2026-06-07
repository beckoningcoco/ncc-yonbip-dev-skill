---
title: "营销活动单个保存"
apiId: "1779414451374522372"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Marketing Activity"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Marketing Activity]
platform_version: "BIP"
source_type: community-api-docs
---

# 营销活动单个保存

>  请求方式	POST | Marketing Activity (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/activitysave
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
code	string	否	是	活动编号，当勾选自动编码且勾选手动可改时以填入值为准，未勾选手动可改时填入值不生效 示例：20230726139857
id	long	否	否	id，新增时不传，更新时传 示例：54121
auditornot	string	否	是	只能填0或者1，0 保存不审核1 保存审核 示例：0
theme	string	否	是	活动主题 示例：活动名称
customer	string	否	否	客户ID，支持传入id或者code其中一项，交易类型执行单元是客户的时候必填，交易类型为执行单元为终端，客户只能填写终端所属客户 示例：1523258263940890626
terminal	string	否	否	终端ID，支持code 和id，交易类型执行单元终端时终端必填,交易类型为客户时，终端不填 示例：1528628244380647428
startDate	string	否	是	开始日期 必须大于当前日期 示例：2023-07-26
endDate	string	否	是	结束日期 示例：2023-07-31
bustype	string	否	是	交易类型ID，支持传入id或者code其中一项 示例：2261330320724224
synClaimMaterial	boolean	否	是	同步申领物料 true 是，false 否 示例：false
marketingPlan	long	否	否	方案id，和方案费用子表id同时填写 示例：2261330320724224
activityPlan	long	否	否	活动计划id 示例：1583232541515
dept	string	否	否	部门ID，支持传入id或者code其中一项 示例：524121215415
currency	string	否	是	币种ID，支持传入id或者code其中一项 示例：1490075982273445927
ower	string	否	是	负责人ID，支持传入id或者code其中一项 示例：1492105156729765896
org	string	否	是	销售组织ID，支持传入id或者code其中一项 示例：1492102528208207880
productLine	string	否	否	产品线ID，支持code或者id
saleArea	string	否	否	销售区域ID，支持传入id或者code其中一项 示例：1492186984367521798
cust	string	否	否	伙伴ID，支持传入id或者code其中一项 示例：1604380498121981956
address	string	否	否	地址 示例：海淀区
activityInfs	object	是	是	费用子表数据
_status	string	否	是	单据状态，新增时Insert，更新时update 示例：Insert
systemSource	string	否	是	openapi标识，必须传 activityOpenApIAdd 示例：activityOpenApIAdd

## 3. 请求示例

Url: /yonbip/crm/bill/activitysave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "20230726139857",
		"id": 54121,
		"auditornot": "0",
		"theme": "活动名称",
		"customer": "1523258263940890626",
		"terminal": "1528628244380647428",
		"startDate": "2023-07-26",
		"endDate": "2023-07-31",
		"bustype": "2261330320724224",
		"synClaimMaterial": false,
		"marketingPlan": 2261330320724224,
		"activityPlan": 1583232541515,
		"dept": "524121215415",
		"currency": "1490075982273445927",
		"ower": "1492105156729765896",
		"org": "1492102528208207880",
		"productLine": "",
		"saleArea": "1492186984367521798",
		"cust": "1604380498121981956",
		"address": "海淀区",
		"activityInfs": [
			{
				"lineNo": 10,
				"_status": "Insert",
				"dimension_expense_item": "2682025078690304",
				"dimension_expense_itemType": "2353778477863168",
				"planExpenseInfo": 1564154515541,
				"planExpenseInfo_lineNo": 10,
				"activityPlanCost": 1564154154151,
				"approveAmount": 0,
				"assumeAmount": 0,
				"dimension_terminal": "0",
				"dimension_customer": "0",
				"dimension_terminal_chain": "0",
				"settlementType": 1,
				"product": "512312315151",
				"productClass": "151251521521",
				"assumeOrg": "265514151251",
				"asumeDept": "1541514145156",
				"payMode": 1,
				"dimension_region": "2152151251",
				"productLine": "468545645",
				"assumeRate": 100,
				"applyAmount": 0,
				"id": 0
			}
		],
		"_status": "Insert",
		"systemSource": "activityOpenApIAdd"
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
code	string	否	活动编码 示例：20230328040003
customer	long	否	客户ID 示例：1523258263940890626
currency	string	否	币种ID 示例：1490075982273445927
auditornot	string	否	是否审核 0 否 1 是 示例：1
terminal	long	否	终端ID 示例：1528628244380647428
id	long	否	活动id 示例：1784804420606230537
startDate	string	否	开始日期 示例：2023-08-09 00:00:00
endDate	string	否	结束日期 示例：2023-08-19 00:00:00
bustype	string	否	交易类型id 示例：1525825606390383271
synClaimMaterial	boolean	否	同步申领物料 示例：true
theme	string	否	活动主题 示例：推广活动
address	string	否	详细地址 示例：北京市东城区织女桥东河沿
marketingPlan	long	否	方案id 示例：1784516056477335556
ower	string	否	负责人ID 示例：1492105156729765896
dept	string	否	部门id 示例：1492103576208015367
productLine	long	否	产品线id 示例：1731181015166091265
saleArea	long	否	销售区域id 示例：1492186984367521798
org	string	否	组织id 示例：1492102528208207880
creatorId	long	否	创建人ID 示例：1492105577654910979
creator	string	否	创建人 示例：昵称-马继铖
createTime	string	否	创建时间 示例：2023-03-28 12:16:35
createDate	string	否	创建日期 示例：2023-03-28 12:16:35
path	long	否	父级路径 示例：123415121
cust	long	否	伙伴ID 示例：1604380498121981956
applyAmountTotal	BigDecimal	否	申请金额合计 示例：0
expectedSaleAmountTotal	BigDecimal	否	预计销售额合计 示例：0
mobileUrl	string	否	app端访问地址 示例：https://dinghuo-bip-daily.yonyoucloud.com/crmAuthPage?alias=0000L6Z2XQXLC3SW040000&redirect=https%3A%2F%2Fbip-daily.yonyoucloud.com%2Fmdf-node%2Fmeta%2Fvoucher%2Fmka_activitysign%2Fadd%3FdomainKey%3Dyycrm%26activityId%3D1784804420606230537&title=签到
budgetOpening	boolean	否	预算期初 示例：true
assumeAmountTotal	BigDecimal	否	承担金额合计 示例：0
settledAmountTotal	BigDecimal	否	结算金额合计 示例：0
auditor	string	否	审核人 示例：默认用户
isWfControlled	boolean	否	是否审批流控制 示例：true
auditorId	long	否	审核人id 示例：1525824927787122695
auditTime	string	否	审核时间 示例：2023-08-02 20:16:22
verifystate	int	否	审核状态 0 开立 1 提交 2 审核通过 3 驳回 示例：1
auditDate	string	否	审核日期 示例：2023-08-02 00:00:00
closeState	int	否	结案状态0 未结案 1 已结案 示例：0
settleState	int	否	关闭状态 0 未关闭 1 已关闭 示例：1
activityInfs	object	是	子表数据
pubts	string	否	时间戳 示例：2023-03-28 12:16:36

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "20230328040003",
		"customer": 1523258263940890626,
		"currency": "1490075982273445927",
		"auditornot": "1",
		"terminal": 1528628244380647428,
		"id": 1784804420606230537,
		"startDate": "2023-08-09 00:00:00",
		"endDate": "2023-08-19 00:00:00",
		"bustype": "1525825606390383271",
		"synClaimMaterial": true,
		"theme": "推广活动",
		"address": "北京市东城区织女桥东河沿",
		"marketingPlan": 1784516056477335556,
		"ower": "1492105156729765896",
		"dept": "1492103576208015367",
		"productLine": 1731181015166091265,
		"saleArea": 1492186984367521798,
		"org": "1492102528208207880",
		"creatorId": 1492105577654910979,
		"creator": "昵称-马继铖",
		"createTime": "2023-03-28 12:16:35",
		"createDate": "2023-03-28 12:16:35",
		"path": 123415121,
		"cust": 1604380498121981956,
		"applyAmountTotal": 0,
		"expectedSaleAmountTotal": 0,
		"mobileUrl": "https://dinghuo-bip-daily.yonyoucloud.com/crmAuthPage?alias=0000L6Z2XQXLC3SW040000&redirect=https%3A%2F%2Fbip-daily.yonyoucloud.com%2Fmdf-node%2Fmeta%2Fvoucher%2Fmka_activitysign%2Fadd%3FdomainKey%3Dyycrm%26activityId%3D1784804420606230537&title=签到",
		"budgetOpening": true,
		"assumeAmountTotal": 0,
		"settledAmountTotal": 0,
		"auditor": "默认用户",
		"isWfControlled": true,
		"auditorId": 1525824927787122695,
		"auditTime": "2023-08-02 20:16:22",
		"verifystate": 1,
		"auditDate": "2023-08-02 00:00:00",
		"closeState": 0,
		"settleState": 1,
		"activityInfs": [
			{
				"id": 1690301516455870467,
				"pubts": "2023-03-28 12:16:35",
				"lineNo": 10,
				"dimension_expense_item": 1530134764267765761,
				"dimension_expense_itemType": 1530134506569728006,
				"planExpenseInfo": 1784516056477335557,
				"planExpenseInfo_lineNo": 10,
				"approveAmount": 1000,
				"assumeAmount": 200,
				"dimension_terminal": 1528628244380647428,
				"dimension_customer": 1784510515983679495,
				"dimension_terminal_chain": 1556755512754700289,
				"settlementType": 1,
				"product": 1763843683121102857,
				"productClass": 1656216467010486279,
				"assumeOrg": "1526215443395641348",
				"asumeDept": "1526216053280997385",
				"payMode": 3,
				"dimension_region": 1731179039481135108,
				"productLine": 1731181092475502593,
				"activityId": 1784804420606230537,
				"assumeRate": 100,
				"applyAmount": 100
			}
		],
		"pubts": "2023-03-28 12:16:36"
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
999	费用项和费用类型不能同时为空	

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

