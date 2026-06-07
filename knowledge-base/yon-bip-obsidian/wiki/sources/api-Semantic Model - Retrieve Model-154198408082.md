---
title: "语义模型-取数接口"
apiId: "1541984080823320581"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Data Analysis"
domain: "DMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Data Analysis]
platform_version: "BIP"
source_type: community-api-docs
---

# 语义模型-取数接口

>  请求方式	POST | Data Analysis (DMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sjzt/semantic/v1/query
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
pager	object	否	是	分页参数
pageIndex	int	否	是	当前页码 示例：1
pageSize	int	否	是	每页查询数据大小 示例：100
entity	string	否	是	语义模型编码 示例：zhaogb20220601
fields	object	是	是	获取的字段列表
name	string	否	是	字段名称 示例：m_month
aggr	string	否	否	聚合函数，如count, count_distinct, sum, avg, max, min等，查询结果按照字段查询列表中未使用聚合函数的字段分组
conditions	object	是	否	查询条件，支持嵌套
op	string	否	否	嵌套时的条件组合关系：AND或者OR 示例：AND
items	object	是	否	当条件为嵌套条件时（op为AND|OR），嵌套条件数据，格式与普通条件保持一致
modelParams	object	是	否	模型参数
code	string	否	否	参数编码 示例：year
value	string	否	否	参数值 示例：2021

## 3. 请求示例

Url: /yonbip/sjzt/semantic/v1/query?access_token=访问令牌
Body: {
	"pager": {
		"pageIndex": 1,
		"pageSize": 100
	},
	"entity": "zhaogb20220601",
	"fields": [
		{
			"name": "m_month",
			"aggr": ""
		}
	],
	"conditions": [
		{
			"op": "AND",
			"items": [
				{
					"op": "eq",
					"name": "code",
					"v1": "abc",
					"v2": "",
					"values": [
						""
					]
				}
			]
		}
	],
	"modelParams": [
		{
			"code": "year",
			"value": "2021"
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
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	string	否	编码 示例：200
message	string	否	提示信息 示例：SUCCESS
data	object	否	数据结构
status	int	否	执行状态码，0：失败，1：成功 示例：1
msg	string	否	返回信息 示例：SUCCESS
data	object	否	返回结果
detail	string	否	详细错误信息 示例：null
errorStack	object	否	错误堆栈 示例：[]

## 5. 正确返回示例

{
	"code": "200",
	"message": "SUCCESS",
	"data": {
		"status": 1,
		"msg": "SUCCESS",
		"data": {
			"meta": [
				{
					"entity": "zhaogb20220601",
					"code": "m_month",
					"label": "m_month",
					"type": "STRING"
				}
			],
			"result": [],
			"pager": {
				"pageIndex": 1,
				"pageSize": 10,
				"pageCount": 70,
				"recordCount": 696
			}
		},
		"detail": "null",
		"errorStack": [
			0
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
0	未传入优惠券档案id	coupon_id值填写有误
500	服务器异常	检查智能分析服务是否异常
403	没有权限访问	检查用户是否具有对当前对象的访问权限

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2024-06-05	
更新
请求说明
更新API描述

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

