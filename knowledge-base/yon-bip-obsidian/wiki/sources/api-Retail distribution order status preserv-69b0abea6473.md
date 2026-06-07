---
title: "零售统配订单状态保存"
apiId: "69b0abea64734666adaa774abd7464a9"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Retail Document Card"
domain: "RetailServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Retail Document Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 零售统配订单状态保存

>  请求方式	POST | Retail Document Card (RetailServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/retailvouch/save
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
data	object	是	否	data
_status	string	否	否	处理状态(Update) 示例：Update
iDeliveryState	string	否	否	发货状态（0未交货 1已交货 3部分交货） 示例：1
iPresellState	string	否	否	预订状态（0预订状态3已交货） 示例：3
id	string	否	否	零售单id 示例：1096528838103296
id__pk	string	否	否	异常pk 示例：0001A810000000008TWZ
retailVouchDetails	object	是	否	retailVouchDetails
key	string	否	否	异常key 示例：id__pk

## 3. 请求示例

Url: /yonbip/sd/uretail/retailvouch/save?access_token=访问令牌
Body: {
	"data": [
		{
			"_status": "Update",
			"iDeliveryState": "1",
			"iPresellState": "3",
			"id": "1096528838103296",
			"id__pk": "0001A810000000008TWZ",
			"retailVouchDetails": [
				{
					"_status": "Update",
					"fBackOutQuantity": "1.0",
					"id": 1096528838103297
				}
			]
		}
	],
	"key": "id__pk"
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
code	long	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	data
count	long	否	总数量 示例：3
sucessCount	long	否	成功数量 示例：0
failCount	long	否	失败数量 示例：3
messages	object	是	messages

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 3,
		"sucessCount": 0,
		"failCount": 3,
		"messages": [
			{
				"message": "org.springframework.jdbc.BadSqlGrammarException",
				"key": "1001A110000000000870"
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

