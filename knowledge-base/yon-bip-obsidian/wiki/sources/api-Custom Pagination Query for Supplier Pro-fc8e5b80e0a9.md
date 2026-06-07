---
title: "供应商档案自定义分页查询"
apiId: "fc8e5b80e0a942dfa734fbf8136ece50"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商档案自定义分页查询

>  请求方式	POST | Supplier (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/vendor/queryByPage
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	string	否	否	查询字段，*为查询所有 示例：*
page	object	否	否	分页设置
pageSize	long	否	否	每页数量 示例：10
pageIndex	long	否	否	页码 示例：1
queryOrders	object	是	否	排序设置
field	string	否	否	排序字段 示例：code
order	string	否	否	排序方式，asc或者desc 示例：asc
condition	object	否	否	条件设置
simpleVOs	object	是	否	simpleVO条件
partParam	object	否	否	子查询设置
vendorbanks	object	否	否	子表
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	增量时间戳 示例：2024-06-28 00:00:00

## 3. 请求示例

Url: /yonbip/digitalModel/vendor/queryByPage?access_token=访问令牌
Body: {
	"data": "*",
	"page": {
		"pageSize": 10,
		"pageIndex": 1
	},
	"queryOrders": [
		{
			"field": "code",
			"order": "asc"
		}
	],
	"condition": {
		"simpleVOs": [
			{
				"field": "name",
				"op": "eq",
				"value1": "用友股份有限公司"
			}
		]
	},
	"partParam": {
		"vendorbanks": {
			"data": "*,openaccountbank.name"
		}
	},
	"pubts": "2024-06-28 00:00:00"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
recordCount	long	否	总条数 示例：12
pageIndex	long	否	当前页 示例：1
pageSize	long	否	每页条数 示例：1
beginPageIndex	long	否	开始页 示例：2
pageCount	long	否	每页条数 示例：12
endPageIndex	long	否	结束页 示例：1
recordList	object	是	数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"recordCount": 12,
		"pageIndex": 1,
		"pageSize": 1,
		"beginPageIndex": 2,
		"pageCount": 12,
		"endPageIndex": 1,
		"recordList": [
			{
				"orgId": "666666",
				"accessstatus": "1",
				"pubts": "2020-05-15 23:28:26",
				"datasource": "2",
				"tenant": 1511008618713344,
				"creatorType": 1,
				"id": 1511106976321792,
				"org": "666666",
				"code": "l0010001",
				"freezestatus": false,
				"taxPayingCategories": 0,
				"vendorclass": 1511100024836352,
				"name": "供应商01",
				"internalunit": false,
				"retailInvestors": false
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
999	服务逻辑异常	联系管理员

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

