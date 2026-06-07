---
title: "收款协议详情分页查询V4"
apiId: "2200270007348232197"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Agreement"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Agreement]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款协议详情分页查询V4

>  请求方式	POST | Collection Agreement (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/basedoc/receiveAgreement/batchQueryDetail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
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
code	string	否	否	编码 示例：lc001
name	string	否	否	名称 示例：收款协议

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/receiveAgreement/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 50,
	"startTs": "2025-02-28 11:16:47",
	"endTs": "2025-05-28 11:16:47",
	"ids": [
		"2211575684096589833",
		"2211575684096589834"
	],
	"code": "lc001",
	"name": "收款协议"
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
code	string	否	返回码，调用成功是返回200 示例：200
data	object	否	响应数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页大小 示例：50
recordCount	number
小数位数:0,最大长度:10	否	总数 示例：300
recordList	object	是	数据记录

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 1,
		"pageSize": 50,
		"recordCount": 300,
		"recordList": [
			{
				"id": "1672031094834200582",
				"code": "00000001",
				"name": {
					"zh_TW": "收款协议01",
					"en_US": "ReceiveAgreement01",
					"zh_CN": "收款协议01"
				},
				"instalment": false,
				"oadayConfirmType": 0,
				"receivableDates": [
					{
						"id": "1672031094834200583",
						"settleWay": "1672030940203843590",
						"settleWay___code": "settleWayCode",
						"receivePercent": 100,
						"accountType": 0,
						"controlLink": 0,
						"controlOppt": 0,
						"controlMode": 1,
						"preReceive": false,
						"receiveStartBase": "1604976699624129617",
						"receiveStartBase___code": "NotSet",
						"accountUnit": 0,
						"delayMonths": 0,
						"accountDay": 30,
						"receiveName": {
							"zh_TW": "收款协议01",
							"en_US": "ReceiveAgreement01",
							"zh_CN": "收款协议01"
						},
						"delayDays": 0,
						"deposit": false,
						"receiveAgreement": "1672031094834200582",
						"receiveAgreement___code": "00000001",
						"order": 0,
						"fixedoaday": 0,
						"fixedoaday1": 4,
						"fixedoaday2": 11,
						"fixedoaday3": 13,
						"fixedoaday4": 19,
						"fixedexpireday": 0,
						"fixedexpireday1": 3,
						"fixedexpireday2": 8,
						"fixedexpireday3": 13,
						"fixedexpireday4": 15
					}
				],
				"expiredayConfirmType": 0,
				"rec_apply_range": [
					{
						"rangeOrgId___code": "GBCO"
					}
				],
				"orgId": "666666",
				"orgId___code": "global00",
				"orgId___name": {
					"zh_TW": "企業帳號級",
					"en_US": "global",
					"zh_CN": "企业账号级"
				},
				"pubts": "2023-03-03 21:27:19",
				"order": 0,
				"preReceiveType": 0,
				"comment": "收款协议说明",
				"enableStartDate": "2023-12-18",
				"enableEndDate": "2023-12-18"
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

