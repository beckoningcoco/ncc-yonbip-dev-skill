---
title: "客户关系表新增"
apiId: "2303282349801996295"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Relationship File"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Relationship File]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户关系表新增

>  请求方式	POST | Customer Relationship File (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/bill/save
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
billnum	string	否	否	单据编号 示例：cust_relationcustomercard 默认值：cust_relationcustomercard
data	object	否	是	客户关系表新增数据
id	string	否	否	单据ID，保存时必填
org	string	否	是	组织ID 示例：1567050927217049609
relationId	string	否	否	关系类型ID 示例：1567799256523210797
suitObjectId	string	否	是	对象ID 示例：1570727316130103298
managerdimensioed	boolean	否	否	是否填写管理维度数据表格，仅当关系类型为客户终端管理关系时可勾选 示例：false 默认值：false
childList	object	是	是	客户关系表子表新增数据
managerdimensioList	object	是	否	管理维度数据表格
_status	string	否	否	保存类型 示例：Insert/Update 默认值：Insert

## 3. 请求示例

Url: /yonbip/MCC/bill/save?access_token=访问令牌
Body: {
	"billnum": "cust_relationcustomercard",
	"data": {
		"id": "",
		"org": "1567050927217049609",
		"relationId": "1567799256523210797",
		"suitObjectId": "1570727316130103298",
		"managerdimensioed": false,
		"childList": [
			{
				"affectedDirection": 1,
				"affectedDegree": "2",
				"affectedObjectId": "1591828885604925447",
				"remark": "关系描述"
			}
		],
		"managerdimensioList": [
			{
				"dimensioNameId": "1764442195206864901",
				"refNameId": "1737067946360438791",
				"id": "2305682609445797897"
			}
		],
		"_status": "Insert/Update"
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
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
org	string	否	org 示例：1567050927217049609
suitObjectType	string	否	suitObjectType 示例：2
suitObjectId	string	否	suitObjectId 示例：1570727316130103298
suitObjectName	string	否	suitObjectName 示例：cy客户001
relationName	string	否	relationName 示例：伙伴客户管理关系
relationId	string	否	relationId 示例：1567799256523210797
id	string	否	id 示例：2303281602476638208
createDate	string	否	createDate 示例：2025-07-01 10:34:29
createTime	string	否	createTime 示例：2025-07-01 10:34:29
creator	string	否	creator 示例：曹宽宽
creatorId	string	否	creatorId 示例：1567063262335860741
childList	object	是	childList
sourceFrom	string	否	sourceFrom 示例：bipyouyou
traceId	string	否	traceId 示例：aa67af6f12fc41bc
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"org": "1567050927217049609",
		"suitObjectType": "2",
		"suitObjectId": "1570727316130103298",
		"suitObjectName": "cy客户001",
		"relationName": "伙伴客户管理关系",
		"relationId": "1567799256523210797",
		"id": "2303281602476638208",
		"createDate": "2025-07-01 10:34:29",
		"createTime": "2025-07-01 10:34:29",
		"creator": "曹宽宽",
		"creatorId": "1567063262335860741",
		"childList": [
			{
				"affectedDegree": "2",
				"affectedDirection": "1",
				"relationName": "伙伴客户管理关系",
				"relationId": "1567799256523210797",
				"affectedObjectType": "1",
				"affectedObjectId": "1570735914654629893",
				"affectedObjectName": "cy潜在客户004"
			}
		],
		"sourceFrom": "bipyouyou"
	},
	"traceId": "aa67af6f12fc41bc",
	"uploadable": "0"
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

