---
title: "汇率类型详情分页查询V5"
apiId: "2173715040592461825"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Exchange Rate Type"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Exchange Rate Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 汇率类型详情分页查询V5

>  请求方式	POST | Exchange Rate Type (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/exchangeratetype/batchQueryDetail
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
小数位数:0,最大长度:10	否	是	页大小 示例：10 默认值：10
startTs	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts开始时间 示例：2024-09-11 11:30:45
endTs	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts结束时间 示例：2024-09-11 11:30:55
ids	string	是	否	主键id集合 示例：["1427710093411483649","1427711588070064129"]
code	string	否	否	编码 示例：exctype169776253
name	string	否	否	名称 示例：缓存汇率类型169776253

## 3. 请求示例

Url: /yonbip/digitalModel/exchangeratetype/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"startTs": "2024-09-11 11:30:45",
	"endTs": "2024-09-11 11:30:55",
	"ids": [
		"1427710093411483649",
		"1427711588070064129"
	],
	"code": "exctype169776253",
	"name": "缓存汇率类型169776253"
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
code	string	否	返回码，调用成功时返回200 示例：200
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	当前页数 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每行页数 示例：10
recordCount	number
小数位数:0,最大长度:10	否	总数 示例：2
recordList	object	是	处理数据

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 2,
		"recordList": [
			{
				"id": "1427711588070064129",
				"code": "exctype169776253",
				"name": {
					"zh_CN": "缓存汇率类型169776253",
					"en_US": "Cached Exchange Rate Type 169776253",
					"zh_TW": "緩存匯率類型 169776253"
				},
				"description": "自动化测试汇率类型",
				"enable": 1,
				"pubts": "2024-09-11 11:30:45",
				"digit": 6,
				"isDefault": 0,
				"syncOriginExchangeRate": 0,
				"isMapHistoryDate": 1,
				"exchangeRateTypeConfigDefineVO": [
					{
						"sourceCurrencyId": "09d3b701cd2a461a9e2f4c95473c992a",
						"sourceCurrencyId___code": "ABC",
						"targetCurrencyId": "10015810000000001AIV",
						"targetCurrencyId___code": "SYY",
						"exchangeConversionMethod": 1,
						"bankSource": "ICBC"
					}
				]
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
	1	2025-10-30	
更新
返回参数 sourceCurrencyId
更新
返回参数 sourceCurrencyId___code
api文档中，所有的“源币种”都改为“原币种”
	2	2025-09-13	
更新
请求说明
更新
请求参数 pageIndex
更新
请求参数 pageSize
新增
返回参数 exchangeConversionMethod
新增
返回参数 bankSource
删除
返回参数 (6)
汇率类型详情分页查询
	3	2025-06-30	
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

