---
title: "授信申请查询"
apiId: "e4baa9b4a0da4271826664e8ef936a32"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credit Application"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credit Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 授信申请查询

>  请求方式	POST | Credit Application (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/creditsettingtmp/query
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
pageIndex	long	否	是	当前页数 示例：0
pageSize	long	否	是	分页条数 示例：1
creditSettingItems.targetObjId	long	否	否	客户id 示例：2079070989799936
orgName	string	否	否	授信组织id 示例：2060702124462336
open_createDate_begin	string	否	否	授信日期开始时间 示例：2021-03-03 00:00:00
open_createDate_end	string	否	否	授信日期结束时间 示例：2021-03-04 00:00:00
simpleVOs	object	是	否	查询条件
op	string	否	否	条件比较符(eq,neq,lt,gt,elt,egt,between,in,nin,like,leftlike,rightlike,is_null,is_not_null,and,or)
field	string	否	否	查询条件字段名
value1	string	否	否	查询条件值1
value2	string	否	否	查询条件值2
logicOp	string	否	否	分级逻辑符(and,or)

## 3. 请求示例

Url: /yonbip/sd/creditsettingtmp/query?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 1,
	"creditSettingItems.targetObjId": 2079070989799936,
	"orgName": "2060702124462336",
	"open_createDate_begin": "2021-03-03 00:00:00",
	"open_createDate_end": "2021-03-04 00:00:00",
	"simpleVOs": [
		{
			"op": "",
			"field": "",
			"value1": "",
			"value2": "",
			"logicOp": ""
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	long	否	返回码，调用成功时返回200 示例：200
message	string	否	调用返回信息 示例：操作成功
data	object	否	返回数据
beginPageIndex	long	否	开始页下标 示例：1
endPageIndex	long	否	结束页下标 示例：0
pageCount	long	否	共多少页 示例：0
pageIndex	long	否	当前页 示例：1
pageSize	long	否	每页数量 示例：10
pubts	string	否	修改时间 示例：2021-04-02 10:59:23
recordCount	long	否	记录条数 示例：0
recordList	object	是	对象信用设置数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pageCount": 0,
		"pageIndex": 1,
		"pageSize": 10,
		"pubts": "2021-04-02 10:59:23",
		"recordCount": 0,
		"recordList": [
			{
				"checkRuleId": "2174298302288128",
				"checkRuleName": "保存预警提示",
				"controlScope": 0,
				"createDate": "2021-03-26 00:51:24",
				"endDate": "2021-03-31 00:00:00",
				"grantType": 0,
				"id": 2187117933220096,
				"isEnableValidity": false,
				"isTemporary": false,
				"isWfControlled": false,
				"orgId": "2060702124462336",
				"orgName": "夏目公司",
				"productDimension": 0,
				"startDate": "2021-03-26 00:00:00",
				"targetStatus": 2,
				"targetType": 0,
				"verifystate": 2
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
999	错误信息	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-22	
更新
请求说明
	2	2025-06-25	
更新
请求参数 (12)
更新
返回参数 (28)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

