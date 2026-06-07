---
title: "客户关系详情查询"
apiId: "1550163631300673537"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Customer Relationship File"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Relationship File]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户关系详情查询

>  请求方式	GET | Customer Relationship File (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/relation/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	客户关系主键（单据id）    示例: 1498927514778075136

## 3. 请求示例

Url: /yonbip/crm/relation/getbyid?access_token=访问令牌&id=1498927514778075136

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
code	string	否	返回编码(200:成功，其他：失败) 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
_realtype	string	否	是否实型 示例：true
_entityName	string	否	实体名称 示例：cust.relation.RelationCustomer
_keyName	string	否	关键词名 示例：id
creator	string	否	创建者名称 示例：刘灿
orgName	string	否	销售组织名称 示例：集团
affectedDirection	long	否	关系方向 1 单向 2 双向 示例：2
org	string	否	销售组织id 示例：2603872696799488
affectedObjectId	long	否	关系对象id 示例：2660676153168384
creatorId	long	否	创建者id 示例：2603881046206976
relationId	long	否	关系id 示例：2673197853102336
remark	string	否	客户关系备注 示例：eee
suitObjectType	short	否	对象类型 示例：1
affectedObjectType	long	否	被影响对象类型 示例：2
suitObjectId	long	否	对象id 示例：2612326932534016
relationName	string	否	关系名称 示例：0
createTime	string	否	创建时间 示例：2022-09-20 10:10:18
affectedDegree	long	否	影响强度 1 高 2 中 3 低 示例：2
id	long	否	客户关系id 示例：1549966689856651300
createDate	string	否	创建日期 示例：2022-09-20 00:00:00
_status	string	否	表头状态 Unchanged 未变换 示例：Unchanged
suitObjectName	string	否	对象档案 示例：反对
childList	object	是	子表数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"_realtype": "true",
		"_entityName": "cust.relation.RelationCustomer",
		"_keyName": "id",
		"creator": "刘灿",
		"orgName": "集团",
		"affectedDirection": 2,
		"org": "2603872696799488",
		"affectedObjectId": 2660676153168384,
		"creatorId": 2603881046206976,
		"relationId": 2673197853102336,
		"remark": "eee",
		"suitObjectType": 1,
		"affectedObjectType": 2,
		"suitObjectId": 2612326932534016,
		"relationName": "0",
		"createTime": "2022-09-20 10:10:18",
		"affectedDegree": 2,
		"id": 1549966689856651300,
		"createDate": "2022-09-20 00:00:00",
		"_status": "Unchanged",
		"suitObjectName": "反对",
		"childList": [
			{
				"relationId": 2673197853102336,
				"remark": "eee",
				"affectedObjectType": 2,
				"affectedDegree": 2,
				"affectedDirection": 2,
				"relationName": "0",
				"affectedObjectId": 2660676153168384,
				"affectedObjectName": "用友网络科技股份有限公司"
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (33)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

