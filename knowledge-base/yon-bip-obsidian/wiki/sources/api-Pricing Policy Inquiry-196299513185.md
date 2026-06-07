---
title: "定价策略查询"
apiId: "1962995131856977928"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Pricing Policy"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Pricing Policy]
platform_version: "BIP"
source_type: community-api-docs
---

# 定价策略查询

>  请求方式	POST | Pricing Policy (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricing/strategylist
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
pageSize	number
小数位数:0,最大长度:10	否	否	分页条数 示例：20 默认值：10
pageIndex	number
小数位数:0,最大长度:10	否	否	当前页数 示例：1 默认值：1
totalCount	number
小数位数:0,最大长度:10	否	否	总数 示例：1
name	string	否	否	定价策略名称 示例：预制策略
code	string	否	否	定价策略编码 示例：001
status	number
小数位数:0,最大长度:10	否	否	状态 示例：1
simpleVOs	object	否	否	查询条件
op	string	否	否	条件比较符号
field	string	否	否	查询字段名
value1	string	否	否	查询条件值1
value2	string	否	否	查询条件值2

## 3. 请求示例

Url: /yonbip/sd/pricing/strategylist?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"totalCount": 1,
	"name": "预制策略",
	"code": "001",
	"status": 1,
	"simpleVOs": {
		"op": ""
	},
	"field": "",
	"value1": "",
	"value2": ""
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
traceId	string	否	traceId 示例：27f3900611180e92

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
				"creator": "昵称-张淑新",
				"code": "6849-0322-test",
				"canEnable": true,
				"isTaxIncluded": true,
				"canEdit": true,
				"creationOrgId": "2649209276158464",
				"distributedAndcannotEdit": false,
				"createTime": "2024-03-22 09:14:03",
				"enable": 0,
				"iSystem": 0,
				"creationOrgId_name": "夏目公司",
				"name": "下发组织和商家",
				"id": "1957388765034446854",
				"status": 0
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "27f3900611180e92"
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

