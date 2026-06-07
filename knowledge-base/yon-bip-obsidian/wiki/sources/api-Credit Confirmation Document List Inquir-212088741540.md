---
title: "红字确认单列表查询"
apiId: "2120887415400300549"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Red Letter Application Form"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Red Letter Application Form]
platform_version: "BIP"
source_type: community-api-docs
---

# 红字确认单列表查询

>  请求方式	POST | Red Letter Application Form (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxot/api/redinfo/query
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
data	object	否	是	data 示例：{ "gmfNsrsbh": "123456" }
searchParam	object	否	是	查询业务参数
pagesize	number
小数位数:1,最大长度:3	否	是	每页大小
pagenum	number
小数位数:-1,最大长度:5	否	是	当前页码

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxot/api/redinfo/query?access_token=访问令牌
Body: {
	"data": {
		"gmfNsrsbh": "123456",
		"searchParam": {
			"gmfNsrsbh": "",
			"xsfNsrsbh": "",
			"sendOrReceive": "",
			"zdrqBegin": "2024-10-28",
			"zdrqEnd": "2024-10-28",
			"reqMemo": "1100000001",
			"statusDm": "",
			"yfpHm": "",
			"yfpDm": "",
			"resBillNo": "",
			"reqBillNo": "",
			"returnDetail": "",
			"orgCode": "A0001"
		},
		"pagesize": 0,
		"pagenum": 0
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
message	string	否	响应信息
code	string	否	响应码
datas	object	是	响应消息体
bills	object	是	红字确认单单据体
totalCount	number
小数位数:0,最大长度:10	否	数据总数

## 5. 正确返回示例

{
	"message": "",
	"code": "",
	"datas": [
		{
			"bills": [
				{
					"reqBillNo": "",
					"resBillNo": "",
					"statusDm": "",
					"orgName": "",
					"reqMemo": "",
					"fplx": "",
					"tspz": "",
					"yfpHm": "",
					"yfpDm": "",
					"hcyy": "",
					"zdrq": "2026-06-07 12:52:25",
					"gmfMc": "",
					"gmfNsrsbh": "",
					"xsfMc": "",
					"xsfNsrsbh": "",
					"invoiceStatus": "",
					"fphm": "",
					"statusMc": "",
					"userName": "",
					"hjje": 0,
					"hjse": 0,
					"jshj": 0,
					"items": [
						{
							"fphxz": 0,
							"hh": "",
							"xmmc": "",
							"ggxh": "",
							"dw": "",
							"xmsl": 0,
							"xmhsdj": 0,
							"xmje": 0,
							"sl": 0,
							"se": 0,
							"xmjshj": 0,
							"spbm": ""
						}
					]
				}
			],
			"totalCount": 0
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
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

