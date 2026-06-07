---
title: "CRM签到信息查询"
apiId: "2062219957416493060"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Check-in Execution"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Check-in Execution]
platform_version: "BIP"
source_type: community-api-docs
---

# CRM签到信息查询

>  请求方式	POST | Check-in Execution (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/signin/query
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageSize	number
小数位数:0,最大长度:10	否	否	pageSize 默认值：20
open_locationTime_end	string	否	否	签到时间_结束 示例：2024-08-08 23:00:00
open_locationTime_begin	string	否	否	签到时间_开始 示例：2024-08-08 00:00:00
signInWay	string	否	否	签到方式 0:日常考勤 1:行动拜访
pageIndex	number
小数位数:0,最大长度:10	否	否	pageIndex 默认值：1
simpleVOs	object	是	否	查询条件
field	string	否	否	可作为查询条件的参数包括{1:verifystate(单据状态[0-开立 1-审批中 2-审批通过 3-审批不通过 4-驳回]), 2:code(单据编码), 3:id(单据主键id), 4:hanOverDate(移交时间), 5:oldOwnerOrg(移交组织ID)/oldOwnerOrg.code(移交组织编码), 6: oldOwner(移交人员ID)/oldOwner.code(移交人员编码), 7:oldOwnerDept(移交部门ID)/oldOwnerDept.code(移交部门编码),
op	string	否	否	逻辑符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1
value2	string	否	否	查询条件值2

## 3. 请求示例

Url: /yonbip/crm/signin/query?access_token=访问令牌
Body: {
	"pageSize": 0,
	"open_locationTime_end": "2024-08-08 23:00:00",
	"open_locationTime_begin": "2024-08-08 00:00:00",
	"signInWay": "",
	"pageIndex": 0,
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
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
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：20
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：1
recordList	object	是	recordList
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：1
traceId	string	否	traceId 示例：2ce7d07a96e9225b

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
				"id": "2062200355186802692",
				"signInType": 0,
				"signInWay": 1,
				"org": "1873789786421985284",
				"orgDeptName": "CRM集团|null",
				"latitude": 39.916527,
				"longitude": 116.397128,
				"location": "北京市海淀区",
				"locationTime": "2024-08-10 14:35:19",
				"actiontypesetting_name": "普通行动",
				"actionId_actiontypesetting_bustype": "1869243563519774306",
				"signInStatus": "1",
				"staffId_name": "李亚苹",
				"customer_name": "客户000000",
				"pubts": "2024-08-10 14:35:18",
				"locationState": "null",
				"org_name": "CRM集团",
				"staffId": "1873799286893314056"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "2ce7d07a96e9225b"
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

