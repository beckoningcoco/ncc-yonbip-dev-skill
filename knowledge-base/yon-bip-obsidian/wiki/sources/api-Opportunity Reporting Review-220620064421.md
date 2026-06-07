---
title: "营销活动列表查询"
apiId: "2206200644217339912"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opportunity Registration"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opportunity Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 营销活动列表查询

>  请求方式	POST | Opportunity Registration (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/activity/list
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
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:4	否	是	每页行数 示例：10 默认值：10
isSum	boolean	否	否	查询表头 示例：true 默认值：true
simpleVOs	object	是	否	查询条件（档案类型的字段应该用xxx.code或者xxx.name,不能用xxx_code或者xxx_name）
field	string	否	否	可作为查询条件的参数如：startDate（开始日期），endDate（结束日期），code（编号），bustype（活动类型），org（销售组织），ower（负责人），dept（所属部门），saleArea（销售区域），theme（活动主题），verifystate（审核状态），closeState（结案状态），settleState（关闭状态） 示例：startDate
op	string	否	否	比较符(eq:等于;neq:不等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between
value1	string	否	否	查询条件值1 示例：2024-08-01 00:00:00
value2	string	否	否	查询条件值2 示例：2024-08-30 23:59:59

## 3. 请求示例

Url: /yonbip/MCC/activity/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"isSum": true,
	"simpleVOs": [
		{
			"field": "startDate",
			"op": "between",
			"value1": "2024-08-01 00:00:00",
			"value2": "2024-08-30 23:59:59"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
recordList	object	是	子表集合
beginPageIndex	number
小数位数:0,最大长度:10	否	页码列表的开始索引 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	页码列表的结束索引 示例：1
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
pageIndex	number
小数位数:0,最大长度:10	否	页号 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页记录数 示例：1
recordCount	number
小数位数:0,最大长度:10	否	总共记录数 示例：1
sumRecordList	object	是	合计

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"returncount": 0,
				"verifystate": 2,
				"code": "20250313001099",
				"settleState": "0",
				"closeState": "0",
				"startDate": "2025-03-13 00:00:00",
				"endDate": "2025-03-31 00:00:00",
				"bustype": "1882605112271044612",
				"bustype_code": "YXHD001",
				"bustype_name": "测试交易类型",
				"bustype_extend_attrs_json": "{\\\"attendObj\\\":3,\\\"activitySettlementBasis\\\":1}",
				"isBudgetOver": false,
				"openingActivity": "0",
				"ower": "1567063013230903306",
				"ower_name": "张三",
				"ower_code": "001",
				"currency": "1567036161118963566",
				"currency_name": "人名币",
				"currency_moneyDigit": 2,
				"currency_priceDigit": 2,
				"id": 2221851023910109188,
				"theme": "终端推广活动",
				"pubts": "2025-03-14 14:24:16",
				"org": "1567050111173263368",
				"org_name": "集团",
				"org_code": "JT01",
				"defaultAssumeOrg": "1567050111173263368",
				"defaultAssumeOrg_code": "Group",
				"defaultAssumeOrg_Name": "集团",
				"createDate": "2025-03-13 00:00:00",
				"auditDate": "2025-03-13 00:00:00",
				"creator": "张三",
				"creatorId": 1567063262353162241,
				"isWfControlled": false,
				"saleArea": "1884703933956882438",
				"saleArea_name": "华北大区",
				"dept": "1884699295404785664",
				"dept_name": "销管二部",
				"hasIntegRule": 0,
				"peopleNum": 2,
				"activityDefineCharacter__id": "2222380490298490884",
				"activityDefineCharacter__CRM001": "1",
				"activityDefineCharacter__CRM002": "2",
				"activityDefineCharacter": {
					"ytenant": "0000L96F5SJC5IY8770000",
					"CRM001": "1",
					"CRM002": "2",
					"id": "2222380490298490884",
					"pubts": "2025-03-14 10:25:43"
				},
				"createTime": "2025-03-13 10:10:57",
				"auditor": "张三",
				"auditTime": "2025-03-13 10:11:05",
				"modifier": "张三",
				"modifyTime": "2025-03-13 10:11:05",
				"activityInfs_id": 2221851023910109189,
				"dimension_expense_item": 2013270000292331529,
				"dimension_expense_item_Name": "陈列费",
				"dimension_expense_itemType": 2071817877790392325,
				"dimension_expense_itemType_name": "陈列类费用",
				"settlementType": 1,
				"lineNo": 10,
				"planExpenseInfo_lineNo": 10,
				"payMode": 4,
				"isAutoGenerate": false,
				"synClaimMaterial": false,
				"isReplenishGoods": false,
				"allowSettle": false,
				"closeReasonDefault": "2111942707891929097",
				"closeReasonNameDefault": "正常结束",
				"closeReasonCodeDefault": "normal_end",
				"marketingPlan": 2221630726530924551,
				"marketingPlan_code": "20250313000690",
				"exeCircle": "2025-03-25 ~ 2025-03-31",
				"businessPeriod": "2273550722153840640",
				"quality": 1,
				"unitInvest": 1,
				"applyAmount": 1,
				"applyAmountTotal": 1,
				"assumeAmount": 1,
				"assumeAmountTotal": 1,
				"assumeRate": 100,
				"expectedSaleAmountTotal": 1,
				"expectedExpenseRateTotal": 100,
				"approveAmount": 1,
				"settledAmount": 0,
				"settledAmountTotal": 0
			}
		],
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"pageCount": 1,
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 1,
		"sumRecordList": [
			{
				"peopleNum": 0,
				"quality": 1,
				"unitInvest": 1,
				"applyAmount": 1,
				"applyAmountTotal": 1,
				"assumeAmount": 1,
				"assumeAmountTotal": 1,
				"approveAmount": 1,
				"expectedSaleAmountTotal": 1,
				"expectedExpenseRateTotal": 100,
				"settledAmount": 0,
				"settledAmountTotal": 0
			}
		]
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
999	服务端逻辑异常	请检查传入数据的正确性

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

