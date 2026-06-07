---
title: "获取API信息"
apiId: "2549838615339859972"
apiPath: "请求方式	GET"
method: "ContentType"
category: "API Gateway"
domain: "KFLJFW"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, API Gateway]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取API信息

>  请求方式	GET | API Gateway (KFLJFW)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/CPC/ai/api/getApiFullInfo
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	API ID
linkerCode	string	query	否	连接器编码，用于定位API所属的连接器    示例: example_linker

## 3. 请求示例

Url: /yonbip/CPC/ai/api/getApiFullInfo?access_token=访问令牌&id=&linkerCode=example_linker

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
code	string	否	返回码，200表示成功 示例：200
message	string	否	返回消息 示例：success
data	object	否	API全量信息对象，包含API详情、Schema引用和集成对象Schema
apiInfo	object	否	API基础信息，包含id、code、name、description、method、path等
inputSchema	object	否	请求参数Schema引用，包含引用的集成对象ID、名称和编码
outputSchema	object	否	返回参数Schema引用，包含引用的集成对象ID和编码
schemaObj	object	否	集成对象完整Schema定义，包含字段结构、数据类型等元数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"apiInfo": {
			"id": "",
			"code": "",
			"name": "",
			"description": "",
			"linkerCode": "",
			"method": "",
			"contentType": "",
			"path": "",
			"executionType": "",
			"objName": "",
			"objCode": "",
			"apiType": 0,
			"publishStatus": 1,
			"categoryId": "",
			"categoryCode": "",
			"requestParams": [
				{
					"name": "",
					"paramType": "string",
					"required": false,
					"paramDesc": "",
					"example": "",
					"objRef": "",
					"objCode": "",
					"objName": ""
				}
			],
			"returnParams": [
				{
					"name": "",
					"paramType": "string",
					"paramDesc": "",
					"example": "",
					"objRef": "",
					"objCode": ""
				}
			]
		},
		"inputSchema": {
			"id": "",
			"name": "",
			"code": ""
		},
		"outputSchema": {
			"id": "",
			"code": ""
		},
		"schemaObj": {}
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

