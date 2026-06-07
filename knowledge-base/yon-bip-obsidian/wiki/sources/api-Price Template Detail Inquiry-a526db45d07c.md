---
title: "价格模板详情查询"
apiId: "a526db45d07c4ab5b26ce86a4c8979d3"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Price Template"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 价格模板详情查询

>  请求方式	GET | Price Template (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricing/template/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	价格模板id    示例: 2277085055029504

## 3. 请求示例

Url: /yonbip/sd/pricing/template/detail?access_token=访问令牌&id=2277085055029504

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
code	string	否	状态码 示例：200
message	string	否	操作信息 示例：操作成功
data	object	否	返回数据
creator	string	否	创建人 示例：19602888888
code	string	否	编号 示例：2021080901
modifyDate	string	否	修改日期 示例：2021-08-09 00:00:00
priceTemplateDetails	object	是	价格模板维度信息
modifier	string	否	修改人 示例：19602888888
creatorId	long	否	创建人ID 示例：2145603091370240
modifierId	long	否	修改人ID 示例：2145603091370240
description	string	否	描述 示例：测试价格模板查询01
citationAmount	long	否	引用次数 示例：1
modifyTime	DateTime	否	修改时间 示例：2021-08-09 14:57:46
createTime	DateTime	否	创建时间 示例：2021-08-09 14:55:16
enable	short	否	状态（1：启用，0：停用） 示例：1
iSystem	short	否	是否系统预设（1：是，0：否） 示例：0
name	object	否	名称
bizId	long	否	商家ID 示例：2145603089699072
id	long	否	价格模板ID 示例：2380466039181568
createDate	DateTime	否	创建日期 示例：2021-08-09 00:00:00

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"creator": "19602888888",
		"code": "2021080901",
		"modifyDate": "2021-08-09 00:00:00",
		"priceTemplateDetails": [
			{
				"evaluationType": "SINGLE_VALUE",
				"pricePreDimensionId": 10,
				"fieldName": "customerType",
				"priceTemplateId": 2380466039181568,
				"bizId": 2145603089699072,
				"description": "测试价格模板查询0001",
				"fieldDescription": "客户类型",
				"id": 2380466039181569,
				"priceFieldName": "customerType"
			}
		],
		"modifier": "19602888888",
		"creatorId": 2145603091370240,
		"modifierId": 2145603091370240,
		"description": "测试价格模板查询01",
		"citationAmount": 1,
		"modifyTime": "2021-08-09 14:57:46",
		"createTime": "2021-08-09 14:55:16",
		"enable": 1,
		"iSystem": 0,
		"name": {
			"zh_CN": "商品",
			"en_US": "PRODUCT",
			"zh_TW": "商品"
		},
		"bizId": 2145603089699072,
		"id": 2380466039181568,
		"createDate": "2021-08-09 00:00:00"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

