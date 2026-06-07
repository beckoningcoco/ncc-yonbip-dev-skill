---
title: "客户费用单(商品)撤回"
apiId: "13eb12e5834d4e109d7be8bf73a76ca1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Expense Document - Product"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Expense Document - Product]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户费用单(商品)撤回

>  请求方式	POST | Customer Expense Document - Product (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/voucher/productrebate/batchunsubmit
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
data	object	是	是	（客户费用-商品）数据
code	string	否	否	单据编号（若未填写单据id，该字段必填，若填写单据id，该字段非必填） 示例：UF-7760202106190001
id	long	否	否	单据id（若未填写单据编码，该字段必填，若填写单据id，该字段非必填） 示例：2308075849339136
rebateCode	string	否	是	单据类型（RETURNPRODUCT） 示例：RETURNPRODUCT

## 3. 请求示例

Url: /yonbip/sd/voucher/productrebate/batchunsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "UF-7760202106190001",
			"id": 2308075849339136,
			"rebateCode": "RETURNPRODUCT"
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
code	long	否	操作状态码 示例：200
message	string	否	操作信息 示例：操作成功
data	object	否	返回数据
code	string	否	单据编号
count	long	否	操作数量 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	string	是	操作信息
infos	object	是	返回数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"verifystate": 0,
				"agentId": 2154075234341120,
				"code": "UF-7760202106190001",
				"rebateStatus": "NOTCONFIRM",
				"useWayCode": "NUMBERPRODUCT",
				"creatorId": 2154058977906944,
				"platformLower": false,
				"useType": "ADD",
				"iDeleted": 0,
				"valid": true,
				"vouchdate": "2021-06-19 00:00:00",
				"bizId": 2152539425411328,
				"validStartDate": "2021-06-19 00:00:00",
				"originalPk": "2152541263991040",
				"domesticPk": "2152541263991040",
				"id": 2308075849339136,
				"pubts": "2021-06-19 14:12:49",
				"surplusQuantity": 1,
				"createDate": "2021-06-19 11:36:10",
				"creator": "王好",
				"uordercorp": 2152539425411328,
				"voucherType": "NORMAL",
				"isWfControlled": true,
				"surplusMoney": 0,
				"agentRelationId": 2187964206944512,
				"canUsable": true,
				"version": 0,
				"rebateMoney": 0,
				"rebateCode": "RETURNPRODUCT",
				"createTime": "2021-06-19 11:36:10",
				"sourceType": 1,
				"settlementOrgId": 2156833972277760,
				"isWiteList": false,
				"validEndDate": "2021-06-20 00:00:00",
				"salesOrgId": 2156833972277760,
				"status": 0
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
999	服务器逻辑异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (4)
更新
返回参数 (44)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

