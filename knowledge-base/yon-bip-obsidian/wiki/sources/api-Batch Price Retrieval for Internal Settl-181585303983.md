---
title: "内部结算价批量取价"
apiId: "1815853039833055233"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Intercompany Settlement Price"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Intercompany Settlement Price]
platform_version: "BIP"
source_type: community-api-docs
---

# 内部结算价批量取价

>  请求方式	POST | Intercompany Settlement Price (CO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/CO/fieis/price/match
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
params	object	是	是	取价对象列表
serviceCode	string	否	是	服务(物料)编码 示例：000045
sPcCode	string	否	是	供方利润中心编码 示例：122201
dPcCode	string	否	是	需方利润中心编码 示例：122202
id	string	否	是	取价对象id 示例：12345678
settlementTypeId	string	否	否	内部结算类型id（指定具体的内部结算类型用于匹价） 示例：2221616845362036747
factorPairList	object	是	否	影响因素参数列表
factor	string	是	否	影响因素编码列表（编码可在价格影响因素页面查看） 示例：[ "warehouse", "supplierclass" ]
exeDate	string	否	是	执行日期, 用于匹配价格的生失效日期, 格式要求为yyyy-MM-dd 示例：2023-09-01

## 3. 请求示例

Url: /yonbip/CO/fieis/price/match?access_token=访问令牌
Body: {
	"params": [
		{
			"serviceCode": "000045",
			"sPcCode": "122201",
			"dPcCode": "122202",
			"id": "12345678",
			"settlementTypeId": "2221616845362036747",
			"factorPairList": [
				{
					"factorCode": "supplierclass",
					"factorValue": "02"
				}
			]
		}
	],
	"factor": [
		"warehouse",
		"supplierclass"
	],
	"exeDate": "2023-09-01"
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
code	int	否	响应码 示例：200
message	string	否	响应信息 示例：取价完成，共匹配到2条价格
data	object	否	返回数据
id	object	是	参数id

## 5. 正确返回示例

{
	"code": 200,
	"message": "取价完成，共匹配到2条价格",
	"data": {
		"id": [
			{
				"currtypeId": "1619147385942313368",
				"vaule": 2,
				"tiered": false,
				"id": "12345678",
				"priceId": "1820238304498941952",
				"priceDetailId": "1820241585853956098"
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
999	服务编码s001未找到	请传入正确的服务编码

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
新增
请求参数 settlementTypeId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

