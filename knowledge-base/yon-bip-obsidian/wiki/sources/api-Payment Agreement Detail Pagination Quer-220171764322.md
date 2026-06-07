---
title: "付款协议详情分页查询V4"
apiId: "2201717643227955209"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Agreement"
domain: "MD"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 付款协议详情分页查询V4

>  请求方式	POST | Payment Agreement (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/basedoc/payagreement/batchQueryDetail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	页大小 示例：50 默认值：50
startTs	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts开始时间 示例：2025-02-28 11:16:47
endTs	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts结束时间 示例：2025-05-28 11:16:47
ids	string	是	否	主键id集合 示例：["2211575684096589833","2211575684096589834"]
code	string	否	否	编码 示例：001
name	string	否	否	名称 示例：付款协议

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/payagreement/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 50,
	"startTs": "2025-02-28 11:16:47",
	"endTs": "2025-05-28 11:16:47",
	"ids": [
		"2211575684096589833",
		"2211575684096589834"
	],
	"code": "001",
	"name": "付款协议"
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
code	string	否	返回码，调用成功是返回200 示例：200
data	object	否	响应数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：0
pageSize	number
小数位数:0,最大长度:10	否	页大小 示例：10
recordCount	number
小数位数:0,最大长度:10	否	总数 示例：1
recordList	object	是	数据记录

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 0,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"id": "2201698539221811204",
				"code": "pay_api001",
				"name": {
					"zh_TW": "付款协议001",
					"en_US": "Pay Agreement 001",
					"zh_CN": "付款协议001"
				},
				"paymentDates": [
					{
						"settleWay": "16049723617076838",
						"settleWay___code": "11",
						"payStartBase": "1604976699624129608",
						"payStartBase___code": "OrderBillDate",
						"accountType": 0,
						"paymentPercent": 100,
						"prePay": false,
						"delayMonths": 0,
						"accountUnit": 0,
						"accountDay": 30,
						"delayDays": 0,
						"payAgreement": "2201698539221811204",
						"deposit": 0,
						"id": "2201698539221811205",
						"paymentName": {
							"zh_TW": "付款名称01",
							"en_US": "payName01",
							"zh_CN": "付款名称01"
						},
						"pubts": "2025-02-14 13:37:24",
						"payAgreement___code": "pay_api001",
						"order": 0,
						"fixedoaday": 0,
						"fixedoaday1": 1,
						"fixedoaday2": 7,
						"fixedoaday3": 13,
						"fixedoaday4": 19,
						"fixedexpireday": 0,
						"fixedexpireday1": 1,
						"fixedexpireday2": 5,
						"fixedexpireday3": 10,
						"fixedexpireday4": 15
					}
				],
				"instalment": false,
				"oadayConfirmType": 0,
				"pay_apply_range": [
					{
						"rangeOrgId___code": "test01"
					}
				],
				"orgId": "1624225669279907850",
				"expiredayConfirmType": 0,
				"orgId___code": "test01",
				"orgId___name": {
					"zh_TW": "管理组织01",
					"en_US": "Org",
					"zh_CN": "管理组织01"
				},
				"pubts": "2025-02-14 13:37:34",
				"order": 0,
				"prePayType": 0,
				"comment": "付款协议说明",
				"enableStartDate": "2025-02-14",
				"enableEndDate": "2025-02-14"
			}
		]
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-30	
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

