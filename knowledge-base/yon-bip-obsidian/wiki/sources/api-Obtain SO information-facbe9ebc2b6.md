---
title: "获取销售订单信息"
apiId: "facbe9ebc2b64b10b72ea12fa2f2136e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Order"
domain: "SS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取销售订单信息

>  请求方式	POST | Sales Order (SS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/saleorder/querybycon
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
queryStartTime	string	否	否	查询开始时间，取订单日期 示例:2021-01-01 08:00:00
queryEndTime	string	否	否	查询截止时间，取订单日期 示例:2021-05-01 08:00:00
pageIndex	int	否	否	当前页数 示例:0
pageSize	int	否	否	每页行数 示例:5000

## 3. 请求示例

Url: /yonbip/cpu/saleorder/querybycon?access_token=访问令牌
Body: {
	"queryStartTime": "",
	"queryEndTime": "",
	"pageIndex": 0,
	"pageSize": 0
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
code	string	否	返回状态码 示例：200
message	string	否	返回信息 示例：查询成功
data	object	是	后端服务返回的数据
pageIndex	int	否	当前页数
pageSize	int	否	每页行数
recordCount	int	否	总数
pageCount	int	否	总页数
recordList	object	是	数据行

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": [
		{
			"pageIndex": 0,
			"pageSize": 0,
			"recordCount": 0,
			"pageCount": 0,
			"recordList": [
				{
					"orderTime": "",
					"purorderno": "",
					"orderno": "",
					"currencyName": "",
					"totalMoney": "",
					"projectDocName": "",
					"projectBClass": "",
					"projectSClass": "",
					"payerName": "",
					"orgName": "",
					"paymentDays": 0,
					"orderStatus": "",
					"sourceType": "",
					"buyofferType": "",
					"buyofferCode": "",
					"buyofferName": "",
					"details": [
						{
							"lineNum": 0,
							"materialCode": "",
							"materialName": "",
							"quantity": 0,
							"unit": "",
							"deliveredNum": 0,
							"signedNum": 0,
							"inwhNum": 0
						}
					]
				}
			]
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
201	错误详细信息	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-06	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

