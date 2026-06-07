---
title: "线索列表查询"
apiId: "2055546067886800899"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lead"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lead]
platform_version: "BIP"
source_type: community-api-docs
---

# 线索列表查询

>  请求方式	POST | Lead (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/clue/bill/list
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
code	string	否	否	线索编码 示例：2022101400001
name	string	否	否	线索名称 示例：转化商机
source_name	string	否	否	线索来源 示例：市场活动
companyName	string	否	否	公司名称 示例：中国投资有限公司
simpleVOs	object	是	否	查询条件
field	string	否	否	可作为查询条件的参数如：1:createTime(创建时间),2:modifyTime(修改时间) 示例：createTime
op	string	否	否	逻辑符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空） 示例：between
value1	string	否	否	查询条件值1 示例：2022-12-01 00:00:00
value2	string	否	否	查询条件值2 示例：2024-12-01 00:00:00

## 3. 请求示例

Url: /yonbip/crm/clue/bill/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "2022101400001",
	"name": "转化商机",
	"source_name": "市场活动",
	"companyName": "中国投资有限公司",
	"simpleVOs": [
		{
			"field": "createTime",
			"op": "between",
			"value1": "2022-12-01 00:00:00",
			"value2": "2024-12-01 00:00:00"
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
小数位数:0,最大长度:10	否	返回编码（200：成功，其他：失败） 示例：200
message	string	否	返回状态信息 示例：操作成功
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页数 示例：1
pageSize	number
小数位数:0,最大长度:10	否	条数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	总数 示例：1
recordList	object	是	线索列表
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	开始页数 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页数 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"clueType": "1786016494714355719",
				"code": "282114",
				"creatorId": "1954431525425512454",
				"createArea_name": "区域A",
				"recentFollower_Name": "姜振宏",
				"source": "1970057690200145926",
				"clueDefineCharacter__crmboolean": false,
				"isTransferLinkman": false,
				"followId": "2054760621440761868",
				"clueDefineCharacter": {
					"crmboolean": false,
					"ytenant": "0000LI1EO7E96110660000",
					"id": "2054760612850827270",
					"pubts": "2024-07-31 14:00:19"
				},
				"ower_name": "姜振宏",
				"recentFollower": "1954431525432852488",
				"lockStatus": false,
				"clueDefineCharacter__id": "2054760612850827270",
				"isTransferCustomer": false,
				"id": "2054760612850827269",
				"pubts": "2024-07-31 14:00:19",
				"org_name": "零售组织",
				"source_name": "yg测试配置迁移00001",
				"tenant": 3304892632636320,
				"createDate": "2024-07-31 00:00:00",
				"ower": "1954431525432852488",
				"highSeasParam": {},
				"timeNotFollowedValue": "1天0小时",
				"creator": "姜某宏",
				"org": "1733217216226131969",
				"recentFollowContent": "新增线索：新绑定邮件线索（编码: 282114）",
				"saleArea_name": "区域A",
				"transType_name": "普通线索",
				"saleArea": "1984983251313229824",
				"dept_name": "零售部门",
				"isTransferOppm": false,
				"dept": "1733225393843863552",
				"recentFollowupTime": "2024-07-31 14:00:19",
				"createDept_name": "零售部门",
				"transType": "1732717960618836906",
				"createDept": "1733225393843863552",
				"createTime": "2024-07-31 14:00:18",
				"clueType_name": "普通线索",
				"name": "新绑定邮件线索",
				"clueType_transType": "1732717960618836906",
				"createArea": "1984983251313229824",
				"status": 1
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
暂时没有数据哦~

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

