---
title: "客户关系列表查询"
apiId: "1550259185733074949"
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

# 客户关系列表查询

>  请求方式	POST | Customer Relationship File (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/relation/bill/list
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
pageSize	long	否	是	每页行数 示例：20
pageIndex	long	否	是	页号 示例：1
org	string	否	否	销售组织id 示例：2603872696799488
relationId	long	否	否	关系名称id 示例：2673197853102336
relationTypeId	long	否	否	关系类型id 示例：2649122986939134
affectedDirection	string	否	否	关系方向(1 单向 2 双向) 示例：2
affectedDegree	string	否	否	影响强度(1 高 2 中 3 低) 示例：2
remark	string	否	否	关系描述 示例：aaaa
simple	object	否	否	简化扩展条件
partnerUserCode	string	否	否	伙伴编码 示例：aaa
customerCode	string	否	否	客户编码 示例：bbb
orgCode	string	否	否	销售组织编码 示例：ccc
simpleVOs	object	是	否	扩展条件 当查询条件为(伙伴id，客户id，联系人id)都必须需要传suitObjectId（对象档案id）和affectedObjectId（关系对象档案id）
logicOp	string	否	否	操作符 示例：or
conditions	object	是	否	查询条件
externalData	object	否	否	扩展查询属性
createDate	date
格式:yyyy-MM-dd	否	否	创建日期
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳

## 3. 请求示例

Url: /yonbip/crm/relation/bill/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"org": "2603872696799488",
	"relationId": 2673197853102336,
	"relationTypeId": 2649122986939134,
	"affectedDirection": "2",
	"affectedDegree": "2",
	"remark": "aaaa",
	"simple": {
		"partnerUserCode": "aaa",
		"customerCode": "bbb",
		"orgCode": "ccc"
	},
	"simpleVOs": [
		{
			"logicOp": "or",
			"conditions": [
				{
					"field": "suitObjectId",
					"op": "eq",
					"value1": 2612326932534016
				}
			]
		}
	],
	"externalData": {
		"createDate": "2026-06-07",
		"pubts": "2026-06-07 13:08:16"
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
code	string	否	返回编码(200:成功，其他：失败) 示例：200
message	string	否	返回状态信息 示例：操作成功
data	object	否	返回数据
pageIndex	long	否	页数 示例：1
pageSize	long	否	条数 示例：1
recordCount	long	否	总数 示例：35
recordList	object	是	客户关系数组
pageCount	long	否	总页数 示例：35
beginPageIndex	long	否	开始页数 示例：2
endPageIndex	long	否	结束页数 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 35,
		"recordList": [
			{
				"creator": "刘灿",
				"orgName": "集团",
				"affectedDirection": 2,
				"affectedObjectName": "客户114-1",
				"org": "2603872696799488",
				"affectedObjectId": 2603926993867008,
				"creatorId": 2603881046206976,
				"relationId": 2673197853102336,
				"remark": "eee",
				"suitObjectType": 1,
				"affectedObjectType": 2,
				"suitObjectName": "反对",
				"suitObjectId": 2612326932534016,
				"relationName": "0",
				"createTime": "2022-09-22 10:10:18",
				"affectedDegree": 2,
				"id": 1551623662485897200,
				"pubts": "2022-09-22 15:46:08",
				"relationTypeId": 2649122986940158,
				"tenant": 2601058755186944,
				"createDate": "2022-09-22 00:00:00"
			}
		],
		"pageCount": 35,
		"beginPageIndex": 2,
		"endPageIndex": 1
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
310061	执行业务扩展插件[com.yonyou.ucg.auth.businessextend.yonsuite.YonsuitBusinessExtendPlugin]的时候报错：parameter pageIndex is not number	pageSize和pageIndex必须控制在long类型取值范围内

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

